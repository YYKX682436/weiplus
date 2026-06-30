package com.tencent.mm.plugin.magicbrush.jsapi.launch;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/magicbrush/jsapi/launch/MBJsApiHandleEcsAction$AllocTempFileRequest", "Landroid/os/Parcelable;", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class MBJsApiHandleEcsAction$AllocTempFileRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$AllocTempFileRequest> CREATOR = new md3.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f148051d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f148052e;

    public MBJsApiHandleEcsAction$AllocTempFileRequest(java.lang.String str, java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f148051d = str;
        this.f148052e = name;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$AllocTempFileRequest)) {
            return false;
        }
        com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$AllocTempFileRequest mBJsApiHandleEcsAction$AllocTempFileRequest = (com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$AllocTempFileRequest) obj;
        return kotlin.jvm.internal.o.b(this.f148051d, mBJsApiHandleEcsAction$AllocTempFileRequest.f148051d) && kotlin.jvm.internal.o.b(this.f148052e, mBJsApiHandleEcsAction$AllocTempFileRequest.f148052e);
    }

    public int hashCode() {
        java.lang.String str = this.f148051d;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f148052e.hashCode();
    }

    public java.lang.String toString() {
        return "AllocTempFileRequest(instanceName=" + this.f148051d + ", name=" + this.f148052e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f148051d);
        out.writeString(this.f148052e);
    }
}
