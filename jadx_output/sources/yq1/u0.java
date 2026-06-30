package yq1;

@j95.b
/* loaded from: classes11.dex */
public class u0 extends i95.w implements l75.q0 {

    /* renamed from: r, reason: collision with root package name */
    public static java.util.List f464473r = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public hs1.b f464474d;

    /* renamed from: e, reason: collision with root package name */
    public hr1.o f464475e;

    /* renamed from: f, reason: collision with root package name */
    public nr1.k f464476f;

    /* renamed from: g, reason: collision with root package name */
    public hr1.c f464477g;

    /* renamed from: h, reason: collision with root package name */
    public nr1.b f464478h;

    /* renamed from: i, reason: collision with root package name */
    public hr1.j f464479i;

    /* renamed from: m, reason: collision with root package name */
    public nr1.g f464480m;

    /* renamed from: n, reason: collision with root package name */
    public hr1.i f464481n;

    /* renamed from: o, reason: collision with root package name */
    public nr1.f f464482o;

    /* renamed from: p, reason: collision with root package name */
    public kr1.b f464483p;

    /* renamed from: q, reason: collision with root package name */
    public er1.b f464484q;

    public static er1.b Ai() {
        gm0.j1.b().c();
        if (aj().f464484q == null) {
            aj().f464484q = new er1.b(gm0.j1.u().f273153f);
            aj().f464484q.add(aj());
        }
        return aj().f464484q;
    }

    public static hr1.c Bi() {
        gm0.j1.b().c();
        if (aj().f464477g == null) {
            aj().f464477g = new hr1.c(((com.tencent.mm.plugin.brandservice.a) i95.n0.c(com.tencent.mm.plugin.brandservice.a.class)).wi());
        }
        return aj().f464477g;
    }

    public static hr1.i Di() {
        gm0.j1.b().c();
        if (aj().f464481n == null) {
            aj().f464481n = new hr1.i(((com.tencent.mm.plugin.brandservice.a) i95.n0.c(com.tencent.mm.plugin.brandservice.a.class)).wi());
            aj().f464481n.add(aj().f464481n);
        }
        return aj().f464481n;
    }

    public static hr1.o Ni() {
        gm0.j1.b().c();
        if (aj().f464475e == null) {
            aj().f464475e = new hr1.o(((com.tencent.mm.plugin.brandservice.a) i95.n0.c(com.tencent.mm.plugin.brandservice.a.class)).wi());
        }
        return aj().f464475e;
    }

    public static kr1.b Ri() {
        gm0.j1.b().c();
        if (aj().f464483p == null) {
            aj().f464483p = new kr1.b(gm0.j1.u().f273153f);
        }
        return aj().f464483p;
    }

    public static nr1.b Ui() {
        gm0.j1.b().c();
        if (aj().f464478h == null) {
            aj().f464478h = new nr1.b(((com.tencent.mm.plugin.brandservice.a) i95.n0.c(com.tencent.mm.plugin.brandservice.a.class)).wi());
        }
        return aj().f464478h;
    }

    public static nr1.f Vi() {
        gm0.j1.b().c();
        if (aj().f464482o == null) {
            aj().f464482o = new nr1.f(((com.tencent.mm.plugin.brandservice.a) i95.n0.c(com.tencent.mm.plugin.brandservice.a.class)).wi());
            aj().f464482o.add(aj().f464482o);
        }
        return aj().f464482o;
    }

    public static nr1.k Zi() {
        gm0.j1.b().c();
        if (aj().f464476f == null) {
            aj().f464476f = new nr1.k(((com.tencent.mm.plugin.brandservice.a) i95.n0.c(com.tencent.mm.plugin.brandservice.a.class)).wi());
        }
        return aj().f464476f;
    }

    public static yq1.u0 aj() {
        return (yq1.u0) i95.n0.c(yq1.u0.class);
    }

    public static hs1.b wi() {
        gm0.j1.b().c();
        if (aj().f464474d == null) {
            aj().f464474d = new hs1.b(gm0.j1.u().f273153f);
        }
        return aj().f464474d;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f419870d;
        com.tencent.wechat.iam.biz.h1 Ni = ((ox.r) d0Var).Ni(2);
        Ni.a(jr1.g.f301358a);
        Ni.g(jr1.i.class.getName(), jr1.h.f301359a);
        ((gr1.h) ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi()).getClass();
        com.tencent.wechat.iam.biz.l0.f217758c.j(gr1.h.class.getName(), gr1.g.f274731a);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        if (aj().f464481n != null) {
            aj().f464481n.remove(aj().f464481n);
        }
        if (aj().f464482o != null) {
            aj().f464482o.remove(aj().f464482o);
        }
        if (aj().f464484q != null) {
            aj().f464484q.remove(aj());
            java.util.List list = f464473r;
            if (list != null) {
                ((java.util.ArrayList) list).clear();
                f464473r = null;
            }
        }
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f419870d;
        ((ox.r) d0Var).Ni(2).i(jr1.i.class.getName());
        ((gr1.h) ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi()).getClass();
        com.tencent.wechat.iam.biz.l0.f217758c.o(gr1.h.class.getName());
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        java.util.List list = f464473r;
        if (list == null || w0Var == null) {
            return;
        }
        java.lang.Object obj = w0Var.f316976d;
        if (obj instanceof er1.a) {
            er1.a aVar = (er1.a) obj;
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                yq1.t0 t0Var = (yq1.t0) it.next();
                if (t0Var != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizContactMsgDataRepo", "MassSend data changed, triggering updateLoad");
                    yz5.l lVar = ((je5.a) t0Var).f299320a;
                    if (lVar != null) {
                        java.lang.String str2 = aVar.field_talker;
                        if (str2 == null) {
                            str2 = "";
                        }
                        lVar.invoke(str2);
                    }
                }
            }
        }
    }
}
