package gf;

/* loaded from: classes7.dex */
public final class o0 implements com.tencent.skyline.jni.ISkylineFileSystem {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f271154a;

    public o0(com.tencent.mm.plugin.appbrand.e9 service) {
        kotlin.jvm.internal.o.g(service, "service");
        this.f271154a = service;
        com.tencent.mars.xlog.Log.i("Luggage.SkylineFileSystemImpl", service.getAppId() + " init " + service);
    }

    @Override // com.tencent.skyline.jni.ISkylineFileSystem
    public void writeTempFileAsync(byte[] bytes, java.lang.String suffix, com.tencent.skyline.jni.ISkylineFileSystemCallback callback) {
        kotlin.jvm.internal.o.g(bytes, "bytes");
        kotlin.jvm.internal.o.g(suffix, "suffix");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f312615d).a(new gf.n0(this, callback, bytes, suffix));
    }
}
