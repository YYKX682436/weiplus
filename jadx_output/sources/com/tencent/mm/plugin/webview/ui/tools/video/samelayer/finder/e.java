package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

/* loaded from: classes8.dex */
public final class e implements android.os.Parcelable.Creator {
    public e(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$EnterFinderFullScreenInfo webViewVideoFinderActionHandler$EnterFinderFullScreenInfo = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$EnterFinderFullScreenInfo();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            try {
                r45.n23 n23Var = new r45.n23();
                n23Var.parseFrom(bArr);
                webViewVideoFinderActionHandler$EnterFinderFullScreenInfo.f186981d = n23Var;
            } catch (java.lang.Exception unused) {
                webViewVideoFinderActionHandler$EnterFinderFullScreenInfo.f186981d = null;
            }
        }
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        webViewVideoFinderActionHandler$EnterFinderFullScreenInfo.f186982e = readString;
        return webViewVideoFinderActionHandler$EnterFinderFullScreenInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$EnterFinderFullScreenInfo[i17];
    }
}
