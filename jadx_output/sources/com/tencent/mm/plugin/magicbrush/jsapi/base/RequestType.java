package com.tencent.mm.plugin.magicbrush.jsapi.base;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/jsapi/base/RequestType;", "Landroid/os/Parcelable;", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class RequestType implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.magicbrush.jsapi.base.RequestType> CREATOR = new fd3.c();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ipcinvoker.type.IPCString f148044d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ipcinvoker.type.IPCString f148045e;

    public RequestType(com.tencent.mm.ipcinvoker.type.IPCString jsApiName, com.tencent.mm.ipcinvoker.type.IPCString dataStr) {
        kotlin.jvm.internal.o.g(jsApiName, "jsApiName");
        kotlin.jvm.internal.o.g(dataStr, "dataStr");
        this.f148044d = jsApiName;
        this.f148045e = dataStr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.magicbrush.jsapi.base.RequestType)) {
            return false;
        }
        com.tencent.mm.plugin.magicbrush.jsapi.base.RequestType requestType = (com.tencent.mm.plugin.magicbrush.jsapi.base.RequestType) obj;
        return kotlin.jvm.internal.o.b(this.f148044d, requestType.f148044d) && kotlin.jvm.internal.o.b(this.f148045e, requestType.f148045e);
    }

    public int hashCode() {
        return (this.f148044d.hashCode() * 31) + this.f148045e.hashCode();
    }

    public java.lang.String toString() {
        return "RequestType(jsApiName=" + this.f148044d + ", dataStr=" + this.f148045e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.f148044d, i17);
        out.writeParcelable(this.f148045e, i17);
    }
}
