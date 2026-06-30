package zd1;

/* loaded from: classes7.dex */
public final class f {
    public f(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.appbrand.service.c0 service, boolean z17) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        kotlin.jvm.internal.o.g(service, "service");
        try {
            int[] iArr = {bitmap.getWidth(), bitmap.getHeight()};
            java.nio.ByteBuffer a17 = zd1.u.f471578a.a(bitmap, false);
            java.util.HashMap hashMap = new java.util.HashMap(2);
            hashMap.put("buffer", a17);
            hashMap.put("shape", iArr);
            com.tencent.mm.plugin.appbrand.utils.v3.d(service.getJsRuntime(), hashMap, (com.tencent.mm.plugin.appbrand.utils.t3) service.b(com.tencent.mm.plugin.appbrand.utils.t3.class));
            zd1.g gVar = new zd1.g();
            gVar.t(hashMap);
            gVar.u(service);
            gVar.m();
            if (z17) {
                try {
                    bitmap.recycle();
                } catch (java.lang.Exception unused) {
                }
            }
        } catch (java.lang.Throwable th6) {
            if (z17) {
                try {
                    bitmap.recycle();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th6;
        }
    }
}
