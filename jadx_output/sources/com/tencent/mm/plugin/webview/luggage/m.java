package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class m implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.webview.luggage.FavUrlTask(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.webview.luggage.FavUrlTask[i17];
    }
}
