package d52;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static d52.d f226530b;

    /* renamed from: a, reason: collision with root package name */
    public final d52.a f226531a = new d52.n();

    public static d52.d a() {
        if (f226530b == null) {
            synchronized (d52.d.class) {
                if (f226530b == null) {
                    f226530b = new d52.d();
                }
            }
        }
        return f226530b;
    }

    public final void b(d52.b bVar) {
        try {
            if (!com.tencent.mm.sdk.platformtools.x2.n() && com.tencent.mm.sdk.platformtools.x2.f193077g) {
                com.tencent.mars.xlog.Log.e("MicroMsg.HellMsgQManager", "sendMainProcess skip, isMainProcStandby=" + com.tencent.mm.sdk.platformtools.x2.f193077g);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("key_hell_msg", d52.e.b(bVar).toByteArray());
            com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, d52.c.class);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HellMsgQManager", "IPCInvoker.invokeSync err [%s]", e17.toString());
        }
    }

    public void c(int i17) {
        d52.b bVar = new d52.b();
        bVar.f226528a = i17;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            this.f226531a.a(bVar);
        } else {
            b(bVar);
        }
    }

    public void d(int i17, java.lang.Object obj) {
        d52.b bVar = new d52.b();
        bVar.f226528a = i17;
        bVar.f226529b = obj;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            this.f226531a.a(bVar);
        } else {
            b(bVar);
        }
    }
}
