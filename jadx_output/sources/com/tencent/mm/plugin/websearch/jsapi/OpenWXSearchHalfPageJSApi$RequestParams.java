package com.tencent.mm.plugin.websearch.jsapi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/websearch/jsapi/OpenWXSearchHalfPageJSApi$RequestParams", "Landroid/os/Parcelable;", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class OpenWXSearchHalfPageJSApi$RequestParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.websearch.jsapi.OpenWXSearchHalfPageJSApi$RequestParams> CREATOR = new av4.y();

    /* renamed from: d, reason: collision with root package name */
    public final int f181549d;

    /* renamed from: e, reason: collision with root package name */
    public final int f181550e;

    public OpenWXSearchHalfPageJSApi$RequestParams(int i17, int i18) {
        this.f181549d = i17;
        this.f181550e = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.websearch.jsapi.OpenWXSearchHalfPageJSApi$RequestParams)) {
            return false;
        }
        com.tencent.mm.plugin.websearch.jsapi.OpenWXSearchHalfPageJSApi$RequestParams openWXSearchHalfPageJSApi$RequestParams = (com.tencent.mm.plugin.websearch.jsapi.OpenWXSearchHalfPageJSApi$RequestParams) obj;
        return this.f181549d == openWXSearchHalfPageJSApi$RequestParams.f181549d && this.f181550e == openWXSearchHalfPageJSApi$RequestParams.f181550e;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f181549d) * 31) + java.lang.Integer.hashCode(this.f181550e);
    }

    public java.lang.String toString() {
        return "RequestParams(scene=" + this.f181549d + ", type=" + this.f181550e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f181549d);
        out.writeInt(this.f181550e);
    }
}
