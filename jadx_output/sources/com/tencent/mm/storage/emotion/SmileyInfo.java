package com.tencent.mm.storage.emotion;

/* loaded from: classes12.dex */
public class SmileyInfo extends dm.ka implements android.os.Parcelable {
    public static final l75.e0 F = dm.ka.initAutoDBInfo(com.tencent.mm.storage.emotion.SmileyInfo.class);
    public static final android.os.Parcelable.Creator<com.tencent.mm.storage.emotion.SmileyInfo> CREATOR = new z85.a0();

    public SmileyInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // dm.ka, l75.f0
    public l75.e0 getDBInfo() {
        return null;
    }

    public java.lang.String toString() {
        return "key:" + this.field_key + "/ncn:" + this.field_cnValue + "/nqq:" + this.field_qqValue + "/nen:" + this.field_enValue + "/nth:" + this.field_thValue + "/ntw:" + this.field_twValue + "/nposition:" + this.field_position + "/nfile Name:" + this.field_fileName + "/negg index:" + this.field_eggIndex + "/n";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.field_key);
        parcel.writeString(this.field_cnValue);
        parcel.writeString(this.field_qqValue);
        parcel.writeString(this.field_twValue);
        parcel.writeString(this.field_enValue);
        parcel.writeString(this.field_thValue);
        parcel.writeString(this.field_fileName);
        parcel.writeInt(this.field_position);
        parcel.writeInt(this.field_eggIndex);
        parcel.writeInt(this.field_flag);
    }

    public SmileyInfo(android.os.Parcel parcel) {
        this.field_key = parcel.readString();
        this.field_cnValue = parcel.readString();
        this.field_qqValue = parcel.readString();
        this.field_twValue = parcel.readString();
        this.field_enValue = parcel.readString();
        this.field_thValue = parcel.readString();
        this.field_fileName = parcel.readString();
        this.field_position = parcel.readInt();
        this.field_eggIndex = parcel.readInt();
        this.field_flag = parcel.readInt();
    }

    public SmileyInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i17) {
        this.field_key = str;
        this.field_cnValue = str3;
        this.field_qqValue = str2;
        this.field_enValue = str5;
        this.field_thValue = str6;
        this.field_twValue = str4;
        this.field_position = i17;
    }

    public SmileyInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17) {
        this.field_key = str;
        this.field_cnValue = str3;
        this.field_qqValue = str2;
        this.field_enValue = str5;
        this.field_thValue = str6;
        this.field_twValue = str4;
        this.field_fileName = str7;
        this.field_eggIndex = i17;
    }
}
