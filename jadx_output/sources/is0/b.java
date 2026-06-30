package is0;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final is0.b f294391a = new is0.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f294392b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f294393c = new java.util.HashMap();

    public static final is0.c b(boolean z17, long j17) {
        is0.c cVar = new is0.c(z17, j17);
        f294392b.put(java.lang.Integer.valueOf(cVar.hashCode()), new java.lang.ref.WeakReference(cVar));
        return cVar;
    }

    public final is0.a a(long j17) {
        is0.a aVar = new is0.a(j17);
        f294393c.put(java.lang.Integer.valueOf(aVar.hashCode()), new java.lang.ref.WeakReference(aVar));
        return aVar;
    }

    public final synchronized void c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("--------printAllocatedGLObjectInfo, current allocated tex size:");
        java.util.HashMap hashMap = f294392b;
        sb6.append(hashMap.size());
        sb6.append(", frameBuffer size:");
        sb6.append(f294393c.size());
        sb6.append(" calledStack:");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.GLObjectFactory", sb6.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.GLObjectFactory", "--------------------------------------------");
        for (java.util.Map.Entry entry : new java.util.HashMap(hashMap).entrySet()) {
            java.lang.Integer num = (java.lang.Integer) entry.getKey();
            is0.c cVar = (is0.c) ((java.lang.ref.WeakReference) entry.getValue()).get();
            if (cVar == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GLObjectFactory", num + " tex recycled");
                f294392b.remove(num);
            } else if (cVar.f294394d) {
                f294392b.remove(num);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(num);
                sb7.append(" tex released, texId:");
                sb7.append(cVar.f294395e);
                sb7.append(", external:");
                sb7.append(!cVar.f294396f);
                sb7.append(", allocatedTid:");
                sb7.append(cVar.f294399i);
                com.tencent.mars.xlog.Log.i("MicroMsg.GLObjectFactory", sb7.toString());
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(num);
                sb8.append(" tex leak, texId:");
                sb8.append(cVar.f294395e);
                sb8.append(", external:");
                sb8.append(!cVar.f294396f);
                sb8.append(", allocatedTid:");
                sb8.append(cVar.f294399i);
                com.tencent.mars.xlog.Log.i("MicroMsg.GLObjectFactory", sb8.toString());
            }
        }
        for (java.util.Map.Entry entry2 : new java.util.HashMap(f294393c).entrySet()) {
            java.lang.Integer num2 = (java.lang.Integer) entry2.getKey();
            is0.a aVar = (is0.a) ((java.lang.ref.WeakReference) entry2.getValue()).get();
            if (aVar == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GLObjectFactory", num2 + " fbo recycled");
                f294393c.remove(num2);
            } else if (aVar.f294386d) {
                f294393c.remove(num2);
                com.tencent.mars.xlog.Log.i("MicroMsg.GLObjectFactory", num2 + " fbo released, fbo:" + aVar.f294387e + ", allocatedTid:" + aVar.f294389g);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.GLObjectFactory", num2 + " fbo leak, fbo:" + aVar.f294387e + ", allocatedTid:" + aVar.f294389g);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GLObjectFactory", "--------finish printAllocatedGLObjectInfo--------");
    }
}
