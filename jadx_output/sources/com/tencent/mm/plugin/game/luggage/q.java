package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class q implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.game.luggage.GameWebViewLaunchParams(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.game.luggage.GameWebViewLaunchParams[i17];
    }
}
