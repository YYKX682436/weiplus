package ps3;

/* loaded from: classes15.dex */
public final class w implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final ps3.q f358131d;

    /* renamed from: e, reason: collision with root package name */
    public i11.e f358132e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f358133f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.lbs.Location f358134g;

    /* renamed from: h, reason: collision with root package name */
    public ps3.a f358135h;

    /* renamed from: i, reason: collision with root package name */
    public ps3.s f358136i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f358137m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f358138n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f358139o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f358140p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f358141q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f358142r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f358143s;

    /* renamed from: t, reason: collision with root package name */
    public final ps3.t f358144t;

    /* renamed from: u, reason: collision with root package name */
    public final i11.c f358145u;

    public w(ps3.q delegate, android.content.Context context) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        kotlin.jvm.internal.o.g(context, "context");
        this.f358131d = delegate;
        this.f358136i = ps3.s.f358124d;
        this.f358137m = new java.util.LinkedList();
        this.f358138n = new java.util.LinkedHashMap();
        this.f358139o = new java.util.LinkedHashMap();
        this.f358140p = new java.util.LinkedHashMap();
        this.f358141q = new java.util.LinkedHashMap();
        this.f358142r = new java.util.LinkedHashMap();
        this.f358143s = new com.tencent.mm.sdk.platformtools.b4(new ps3.u(this), false);
        this.f358144t = new ps3.t();
        this.f358145u = new ps3.v(this);
    }

    public final ps3.e a(r45.oi5 member, boolean z17) {
        kotlin.jvm.internal.o.g(member, "member");
        java.lang.String UserName = member.f382283d;
        kotlin.jvm.internal.o.f(UserName, "UserName");
        ps3.e b17 = b(UserName, z17);
        if (b17 != null) {
            return b17;
        }
        java.lang.String EncodeUserName = member.f382287h;
        kotlin.jvm.internal.o.f(EncodeUserName, "EncodeUserName");
        return b(EncodeUserName, z17);
    }

    public final ps3.e b(java.lang.String str, boolean z17) {
        return z17 ? (ps3.e) ((java.util.LinkedHashMap) this.f358140p).get(str) : (ps3.e) ((java.util.LinkedHashMap) this.f358139o).get(str);
    }

    public final void c(java.lang.String username, ps3.e state) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(state, "state");
        if (r26.n0.N(username)) {
            return;
        }
        d(username, state);
        this.f358139o.put(username, state);
    }

    public final void d(java.lang.String str, ps3.e eVar) {
        ps3.e eVar2 = (ps3.e) ((java.util.LinkedHashMap) this.f358139o).get(str);
        if (eVar2 == null || eVar2 == eVar) {
            return;
        }
        this.f358140p.put(str, eVar2);
    }

    public final void e(r45.oi5 oi5Var) {
        if (oi5Var != null) {
            java.lang.String str = oi5Var.f382283d;
            if (str == null && (str = oi5Var.f382287h) == null) {
                str = "";
            }
            java.util.Map map = this.f358142r;
            if (map.containsKey(str)) {
                map.remove(str);
            } else {
                map.put(str, ps3.o.f358115d);
            }
        }
    }

    public final void f() {
        h();
        this.f358133f = false;
        this.f358134g = null;
        this.f358136i = ps3.s.f358124d;
        this.f358143s.d();
        if (this.f358132e == null) {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            this.f358132e = i11.h.e();
        }
        this.f358136i = ps3.s.f358125e;
        i11.e eVar = this.f358132e;
        if (eVar != null) {
            ((i11.h) eVar).k(this.f358145u, true);
        }
    }

    public final void g() {
        this.f358133f = true;
        this.f358136i = ps3.s.f358124d;
        this.f358143s.d();
    }

    public final void h() {
        int ordinal = this.f358136i.ordinal();
        if (ordinal == 1) {
            g();
            return;
        }
        ps3.t tVar = this.f358144t;
        if (ordinal != 2) {
            if (ordinal != 3) {
                return;
            }
            g();
            tVar.sendEmptyMessageDelayed(1, 5000);
            return;
        }
        if (this.f358135h != null) {
            g();
            gm0.j1.d().d(this.f358135h);
            tVar.sendEmptyMessageDelayed(1, 5000);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        int type = scene.getType();
        ps3.q qVar = this.f358131d;
        if (type != 425) {
            if (type != 602) {
                return;
            }
            if (i17 == 0 && i18 == 0) {
                android.support.v4.media.f.a(scene);
                throw null;
            }
            ((com.tencent.mm.plugin.radar.ui.RadarViewController) qVar).k(i17, i18, null, 0);
            return;
        }
        if (this.f358135h == scene) {
            ps3.a aVar = (ps3.a) scene;
            if (aVar.f358062d != 1) {
                ((com.tencent.mm.plugin.radar.ui.RadarViewController) qVar).j(i17, i18, null, 0);
                return;
            }
            this.f358136i = ps3.s.f358127g;
            if (i17 != 0 || i18 != 0) {
                g();
                ((com.tencent.mm.plugin.radar.ui.RadarViewController) qVar).j(i17, i18, null, 0);
                return;
            }
            com.tencent.mm.modelbase.o oVar = aVar.f358070o;
            long j17 = 3000;
            this.f358143s.c(j17, j17);
            com.tencent.mm.modelbase.o oVar2 = aVar.f358070o;
            r45.qi5 qi5Var = (r45.qi5) (oVar2 != null ? oVar2.f70711b.f70700a : null);
            java.util.LinkedList linkedList = qi5Var != null ? qi5Var.f384028g : null;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.oi5 oi5Var = (r45.oi5) it.next();
                    ((us.a) ((vs.e) i95.n0.c(vs.e.class))).Bi(oi5Var.f382283d, 48, oi5Var.f382288i);
                }
            }
            java.util.LinkedList linkedList2 = this.f358137m;
            if (linkedList != null) {
                linkedList2.clear();
                linkedList2.addAll(linkedList);
            }
            com.tencent.mm.modelbase.o oVar3 = aVar.f358070o;
            r45.qi5 qi5Var2 = (r45.qi5) (oVar3 != null ? oVar3.f70711b.f70700a : null);
            ((com.tencent.mm.plugin.radar.ui.RadarViewController) qVar).j(i17, i18, linkedList2, qi5Var2 != null ? qi5Var2.f384027f : 0);
        }
    }
}
