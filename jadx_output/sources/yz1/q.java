package yz1;

/* loaded from: classes15.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final yz1.l f468514a;

    /* renamed from: b, reason: collision with root package name */
    public final yz1.s f468515b;

    /* renamed from: c, reason: collision with root package name */
    public final xz1.a f468516c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f468517d;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f468519f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f468518e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public final yz1.k f468520g = new yz1.o(this);

    /* renamed from: h, reason: collision with root package name */
    public final yz1.r f468521h = new yz1.p(this);

    public q(java.io.InputStream inputStream, java.io.OutputStream outputStream, xz1.a aVar, java.lang.String str) {
        this.f468514a = new yz1.l(inputStream, aVar);
        this.f468515b = new yz1.s(outputStream);
        this.f468516c = aVar;
        this.f468517d = str;
    }

    public final void a(yz1.a aVar) {
        boolean z17;
        if (this.f468518e.get()) {
            z17 = false;
        } else {
            d(new java.io.IOException("Session is closed"));
            z17 = true;
        }
        if (z17) {
            return;
        }
        yz1.s sVar = this.f468515b;
        yz1.r rVar = this.f468521h;
        synchronized (sVar) {
            try {
                aVar.b(sVar.f468522a);
                sVar.f468522a.flush();
                rVar.getClass();
            } catch (java.io.IOException e17) {
                ((yz1.p) rVar).f468513a.d(e17);
            }
        }
    }

    public void b(int i17, java.lang.String str) {
        jz5.f0 f0Var;
        if (this.f468518e.getAndSet(false)) {
            xz1.k kVar = (xz1.k) this.f468516c;
            synchronized (kVar) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DevTools.DevToolsService", "onClose before");
                qk.u6 u6Var = (qk.u6) kVar.f458193g.get(this.f468517d);
                if (u6Var != null) {
                    u6Var.onClose();
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.DevTools.DevToolsService", "onClose without attachable");
                }
                kVar.f458194h.remove(this.f468517d);
                com.tencent.mars.xlog.Log.i("MicroMsg.DevTools.DevToolsService", "onClose " + this.f468517d + ' ' + i17 + ' ' + str);
            }
        }
    }

    public final void c(int i17, java.lang.String str) {
        byte[] bArr;
        int i18;
        if (str != null) {
            int i19 = yz1.m.f468511a;
            try {
                bArr = str.getBytes(com.tencent.mapsdk.internal.rv.f51270c);
                i18 = bArr.length + 2;
            } catch (java.io.UnsupportedEncodingException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        } else {
            bArr = null;
            i18 = 2;
        }
        byte[] bArr2 = new byte[i18];
        bArr2[0] = (byte) ((i17 >> 8) & 255);
        bArr2[1] = (byte) (i17 & 255);
        if (bArr != null) {
            java.lang.System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
        }
        a(yz1.b.a((byte) 8, bArr2, i18));
        this.f468519f = true;
    }

    public final void d(java.io.IOException ex6) {
        this.f468516c.getClass();
        kotlin.jvm.internal.o.g(ex6, "ex");
        com.tencent.mars.xlog.Log.e("DevToolsHandler", "onError: ex = " + ex6);
    }
}
