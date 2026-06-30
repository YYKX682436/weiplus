package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/g", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.g CREATOR = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.g(null);

    /* renamed from: d, reason: collision with root package name */
    public r45.n23 f186983d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        r45.n23 n23Var = this.f186983d;
        if (n23Var == null) {
            parcel.writeInt(0);
            return;
        }
        try {
            kotlin.jvm.internal.o.d(n23Var);
            byte[] byteArray = n23Var.toByteArray();
            parcel.writeInt(byteArray.length);
            parcel.writeByteArray(byteArray);
        } catch (java.lang.Exception unused) {
        }
    }
}
