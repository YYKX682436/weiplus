package com.tencent.mm.storage.emotion;

/* loaded from: classes4.dex */
public class SmileyPanelConfigInfo extends dm.la implements android.os.Parcelable {

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f193893p = dm.la.initAutoDBInfo(com.tencent.mm.storage.emotion.SmileyPanelConfigInfo.class);
    public static final android.os.Parcelable.Creator<com.tencent.mm.storage.emotion.SmileyPanelConfigInfo> CREATOR = new z85.c0();

    public SmileyPanelConfigInfo(android.os.Parcel parcel) {
        this.field_position = parcel.readInt();
        this.field_key = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // dm.la, l75.f0
    public l75.e0 getDBInfo() {
        return null;
    }

    public java.lang.String toString() {
        return "index:" + this.field_position + "key  :" + this.field_key;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.field_position);
        parcel.writeString(this.field_key);
    }

    public SmileyPanelConfigInfo() {
    }

    public SmileyPanelConfigInfo(int i17, java.lang.String str) {
        this.field_position = i17;
        this.field_key = str;
    }
}
