package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public class o3 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.webview.model.SendDataToH5Event(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.webview.model.SendDataToH5Event[i17];
    }
}
