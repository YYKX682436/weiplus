package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public class u implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.webview.modeltools.NFCIPCHelper$NFCEventTransfer(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.webview.modeltools.NFCIPCHelper$NFCEventTransfer[i17];
    }
}
