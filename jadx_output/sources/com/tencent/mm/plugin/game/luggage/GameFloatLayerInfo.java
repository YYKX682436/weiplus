package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class GameFloatLayerInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.luggage.GameFloatLayerInfo> CREATOR = new com.tencent.mm.plugin.game.luggage.n();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139474d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f139475e;

    /* renamed from: f, reason: collision with root package name */
    public int f139476f;

    public GameFloatLayerInfo() {
        this.f139475e = false;
        this.f139476f = -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f139474d);
        parcel.writeInt(this.f139475e ? 1 : 0);
        parcel.writeInt(this.f139476f);
    }

    public GameFloatLayerInfo(android.os.Parcel parcel, com.tencent.mm.plugin.game.luggage.n nVar) {
        this.f139475e = false;
        this.f139476f = -1;
        this.f139474d = parcel.readString();
        this.f139475e = parcel.readInt() == 1;
        this.f139476f = parcel.readInt();
    }
}
