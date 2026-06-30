package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public class d0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.webview.modeltools.WebViewClipBoardHelper$ClipBoardDataWrapper(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.webview.modeltools.WebViewClipBoardHelper$ClipBoardDataWrapper[i17];
    }
}
