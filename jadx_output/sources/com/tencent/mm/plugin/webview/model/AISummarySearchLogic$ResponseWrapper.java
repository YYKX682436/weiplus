package com.tencent.mm.plugin.webview.model;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/webview/model/AISummarySearchLogic$ResponseWrapper", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class AISummarySearchLogic$ResponseWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.model.AISummarySearchLogic$ResponseWrapper> CREATOR = new com.tencent.mm.plugin.webview.model.g();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f182727d;

    public AISummarySearchLogic$ResponseWrapper(java.util.Map urlParams) {
        kotlin.jvm.internal.o.g(urlParams, "urlParams");
        this.f182727d = urlParams;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.webview.model.AISummarySearchLogic$ResponseWrapper) && kotlin.jvm.internal.o.b(this.f182727d, ((com.tencent.mm.plugin.webview.model.AISummarySearchLogic$ResponseWrapper) obj).f182727d);
    }

    public int hashCode() {
        return this.f182727d.hashCode();
    }

    public java.lang.String toString() {
        return "ResponseWrapper(urlParams=" + this.f182727d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.util.Map map = this.f182727d;
        out.writeInt(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            out.writeString((java.lang.String) entry.getKey());
            out.writeString((java.lang.String) entry.getValue());
        }
    }
}
