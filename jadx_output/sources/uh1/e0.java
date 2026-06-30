package uh1;

/* loaded from: classes7.dex */
public final class e0 implements uh1.w {

    /* renamed from: b, reason: collision with root package name */
    public final int f427774b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f427775c;

    /* renamed from: d, reason: collision with root package name */
    public final javax.net.ssl.SSLContext f427776d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f427777e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f427778f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f427779g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f427780h = new java.util.ArrayList();

    public e0(com.tencent.mm.plugin.appbrand.jsapi.l lVar, boolean z17) {
        this.f427778f = false;
        this.f427777e = lVar;
        uh1.a aVar = (uh1.a) lVar.b(uh1.a.class);
        this.f427774b = aVar.f427747n;
        this.f427775c = aVar.B;
        this.f427776d = uh1.j0.p(aVar);
        this.f427778f = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x016c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r22, java.lang.String r23, java.lang.String r24, org.json.JSONObject r25, java.util.Map r26, java.util.ArrayList r27, uh1.c0 r28, java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uh1.e0.a(int, java.lang.String, java.lang.String, org.json.JSONObject, java.util.Map, java.util.ArrayList, uh1.c0, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void b(java.lang.String str) {
        if (str == null) {
            return;
        }
        synchronized (this.f427779g) {
            java.util.Iterator it = this.f427779g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                wh1.e eVar = (wh1.e) it.next();
                if (str.equals(eVar.f445941w)) {
                    this.f427779g.remove(eVar);
                    break;
                }
            }
        }
    }

    @Override // uh1.w
    public void release() {
        synchronized (this.f427779g) {
            java.util.Iterator it = this.f427779g.iterator();
            while (it.hasNext()) {
                ((wh1.e) it.next()).f445928g = false;
            }
            this.f427779g.clear();
        }
    }
}
