package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class ea implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            return new com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper(readStrongBinder, (com.tencent.mm.plugin.webview.ui.tools.ea) null);
        }
        return null;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper[i17];
    }
}
