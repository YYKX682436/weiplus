package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class GameWebViewLaunchParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.luggage.GameWebViewLaunchParams> CREATOR = new com.tencent.mm.plugin.game.luggage.q();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.game.luggage.GameFloatLayerInfo f139487d;

    public GameWebViewLaunchParams(android.os.Parcel parcel, com.tencent.mm.plugin.game.luggage.q qVar) {
        this.f139487d = (com.tencent.mm.plugin.game.luggage.GameFloatLayerInfo) parcel.readParcelable(com.tencent.mm.plugin.game.luggage.GameFloatLayerInfo.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f139487d, i17);
    }
}
