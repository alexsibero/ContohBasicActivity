package com.alex.contohbasicactivity;

import android.os.Parcel;
import android.os.Parcelable;

public class Siswa implements Parcelable {
    long id;
    String nama;
    String alamat;

    public Siswa()
    {
        id=-1;
        nama = "Alex";
        alamat = "Medan";
    }

    public Siswa(long id, String nama, String alamat)
    {
        this.id=id;
        this.nama=nama ;
        this.alamat=alamat;
    }

    public long getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    protected Siswa(Parcel in) {
        id = in.readLong();
        nama = in.readString();
        alamat = in.readString();
    }

    public static final Creator<Siswa> CREATOR = new Creator<Siswa>() {
        @Override
        public Siswa createFromParcel(Parcel in) {
            return new Siswa(in);
        }

        @Override
        public Siswa[] newArray(int size) {
            return new Siswa[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(id);
        parcel.writeString(nama);
        parcel.writeString(alamat);
    }
}
