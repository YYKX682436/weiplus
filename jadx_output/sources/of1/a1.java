package of1;

/* loaded from: classes7.dex */
public final class a1 implements android.os.Parcelable.Creator {
    public a1(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        return new com.tencent.mm.plugin.appbrand.jsapi.webview.bwc.HTMLWebViewWithBWC$OpenSearchRequest(source);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.webview.bwc.HTMLWebViewWithBWC$OpenSearchRequest[i17];
    }
}
