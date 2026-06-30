package com.tencent.mm.plugin.magicbrush.jsapi.launch;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/magicbrush/jsapi/launch/MBJsApiHandleEcsAction$GetAbsoluteFilePathRequest", "Landroid/os/Parcelable;", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class MBJsApiHandleEcsAction$GetAbsoluteFilePathRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$GetAbsoluteFilePathRequest> CREATOR = new md3.g();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f148054d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f148055e;

    public MBJsApiHandleEcsAction$GetAbsoluteFilePathRequest(java.lang.String str, java.lang.String rawPath) {
        kotlin.jvm.internal.o.g(rawPath, "rawPath");
        this.f148054d = str;
        this.f148055e = rawPath;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$GetAbsoluteFilePathRequest)) {
            return false;
        }
        com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$GetAbsoluteFilePathRequest mBJsApiHandleEcsAction$GetAbsoluteFilePathRequest = (com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$GetAbsoluteFilePathRequest) obj;
        return kotlin.jvm.internal.o.b(this.f148054d, mBJsApiHandleEcsAction$GetAbsoluteFilePathRequest.f148054d) && kotlin.jvm.internal.o.b(this.f148055e, mBJsApiHandleEcsAction$GetAbsoluteFilePathRequest.f148055e);
    }

    public int hashCode() {
        java.lang.String str = this.f148054d;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f148055e.hashCode();
    }

    public java.lang.String toString() {
        return "GetAbsoluteFilePathRequest(instanceName=" + this.f148054d + ", rawPath=" + this.f148055e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f148054d);
        out.writeString(this.f148055e);
    }
}
