package jk5;

/* loaded from: classes13.dex */
public class j implements jk5.l {

    /* renamed from: a, reason: collision with root package name */
    public final m56.b f300168a;

    /* renamed from: b, reason: collision with root package name */
    public l56.i f300169b;

    /* renamed from: c, reason: collision with root package name */
    public l56.i f300170c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f300171d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f300172e = false;

    /* renamed from: f, reason: collision with root package name */
    public jk5.b f300173f = null;

    /* renamed from: g, reason: collision with root package name */
    public jk5.a f300174g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f300175h = null;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f300176i = new jk5.d(this);

    public j() {
        l56.i iVar = null;
        this.f300168a = null;
        this.f300169b = null;
        l56.h hVar = l56.h.Header;
        n56.c.b(i56.c.class, "Api class cannot be null");
        try {
            i56.a aVar = (i56.a) i56.c.class.newInstance();
            n56.c.a("XMr2y8FEVEqZBcZ1TU3gLA", "Invalid Api key");
            n56.c.a("kyWwA5vbB6H1NDQFufR9hD5vWGStxhweIbatclCo", "Invalid Api secret");
            n56.c.b("wechatapp://sign-in-twitter.wechatapp.com/", "Callback can't be null");
            n56.c.b(aVar, "You must specify a valid api through the provider() method");
            n56.c.a("XMr2y8FEVEqZBcZ1TU3gLA", "You must provide an api key");
            n56.c.a("kyWwA5vbB6H1NDQFufR9hD5vWGStxhweIbatclCo", "You must provide an api secret");
            l56.a aVar2 = new l56.a("XMr2y8FEVEqZBcZ1TU3gLA", "kyWwA5vbB6H1NDQFufR9hD5vWGStxhweIbatclCo", "wechatapp://sign-in-twitter.wechatapp.com/", hVar, null, null);
            i56.b bVar = (i56.b) aVar;
            bVar.getClass();
            this.f300168a = new m56.a(bVar, aVar2);
            if (gm0.j1.b().m()) {
                java.lang.String str = (java.lang.String) gm0.j1.u().c().l(69377, null);
                java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(69378, null);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    iVar = new l56.i(str, str2, null);
                }
            } else {
                com.tencent.mars.xlog.Log.e("Twitter", "acchas not ready for restoreTwitterAccessToken");
            }
            this.f300169b = iVar;
        } catch (java.lang.Exception e17) {
            throw new j56.b("Error while creating the Api object", e17);
        }
    }

    public final void a(jk5.c cVar) {
        this.f300171d = false;
        this.f300170c = null;
        jk5.b bVar = this.f300173f;
        if (bVar != null) {
            bVar.I4(cVar);
        }
    }

    public void b(jk5.b bVar, android.content.Context context) {
        if (this.f300171d) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(583L, 0L, 1L, false);
        this.f300173f = bVar;
        this.f300175h = context;
        this.f300171d = true;
        s75.d.b(new jk5.e(this), "Twitter_doOAuth");
    }

    public void c() {
        d(false);
        a(jk5.c.Canceled);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(583L, 3L, 1L, false);
    }

    public final void d(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new e21.p(10251, z17 ? "1" : "2"));
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.q(arrayList));
    }

    public final void e(l56.i iVar) {
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
        if (iVar == null) {
            gm0.j1.u().c().w(69377, "");
            gm0.j1.u().c().w(69378, "");
        } else {
            gm0.j1.u().c().w(69377, iVar.f316692d);
            gm0.j1.u().c().w(69378, iVar.f316693e);
        }
    }
}
