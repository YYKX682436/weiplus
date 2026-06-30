package com.tencent.mm.plugin.webview.model;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/webview/model/AISummarySearchLogic$RequestParams", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class AISummarySearchLogic$RequestParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.model.AISummarySearchLogic$RequestParams> CREATOR = new com.tencent.mm.plugin.webview.model.f();

    /* renamed from: d, reason: collision with root package name */
    public final int f182725d;

    /* renamed from: e, reason: collision with root package name */
    public final int f182726e;

    public AISummarySearchLogic$RequestParams(int i17, int i18) {
        this.f182725d = i17;
        this.f182726e = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webview.model.AISummarySearchLogic$RequestParams)) {
            return false;
        }
        com.tencent.mm.plugin.webview.model.AISummarySearchLogic$RequestParams aISummarySearchLogic$RequestParams = (com.tencent.mm.plugin.webview.model.AISummarySearchLogic$RequestParams) obj;
        return this.f182725d == aISummarySearchLogic$RequestParams.f182725d && this.f182726e == aISummarySearchLogic$RequestParams.f182726e;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f182725d) * 31) + java.lang.Integer.hashCode(this.f182726e);
    }

    public java.lang.String toString() {
        return "RequestParams(scene=" + this.f182725d + ", type=" + this.f182726e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f182725d);
        out.writeInt(this.f182726e);
    }
}
