package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

/* loaded from: classes8.dex */
public final class g implements android.os.Parcelable.Creator {
    public g(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            try {
                r45.n23 n23Var = new r45.n23();
                n23Var.parseFrom(bArr);
                webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper.f186983d = n23Var;
            } catch (java.lang.Exception unused) {
                webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper.f186983d = null;
            }
        }
        return webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper[i17];
    }
}
