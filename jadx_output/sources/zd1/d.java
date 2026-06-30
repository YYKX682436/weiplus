package zd1;

/* loaded from: classes7.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.appbrand.y env, boolean z17) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        kotlin.jvm.internal.o.g(env, "env");
        try {
            int[] iArr = {bitmap.getWidth(), bitmap.getHeight()};
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bitmap.getByteCount());
            allocate.position(0);
            bitmap.copyPixelsToBuffer(allocate);
            allocate.position(0);
            java.util.HashMap hashMap = new java.util.HashMap(2);
            hashMap.put("buffer", allocate);
            hashMap.put("shape", iArr);
            com.tencent.mm.plugin.appbrand.utils.v3.d(env.getJsRuntime(), hashMap, (com.tencent.mm.plugin.appbrand.utils.t3) env.b(com.tencent.mm.plugin.appbrand.utils.t3.class));
            zd1.e eVar = new zd1.e();
            eVar.t(hashMap);
            eVar.u(env);
            eVar.m();
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
