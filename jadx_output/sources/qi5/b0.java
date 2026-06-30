package qi5;

/* loaded from: classes.dex */
public final class b0 extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f363799d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f363800e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f363801f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f363802g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f363803h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f363804i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f363805m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f363806n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f363807o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f363808p;

    public b0(androidx.appcompat.app.AppCompatActivity activity, java.util.Set blockList, java.util.List showChatroomList, java.lang.String selectShowHeadDisplay, java.lang.String unSelectShowHeadDisplay, boolean z17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(blockList, "blockList");
        kotlin.jvm.internal.o.g(showChatroomList, "showChatroomList");
        kotlin.jvm.internal.o.g(selectShowHeadDisplay, "selectShowHeadDisplay");
        kotlin.jvm.internal.o.g(unSelectShowHeadDisplay, "unSelectShowHeadDisplay");
        this.f363799d = activity;
        this.f363800e = blockList;
        this.f363801f = showChatroomList;
        this.f363802g = selectShowHeadDisplay;
        this.f363803h = unSelectShowHeadDisplay;
        this.f363804i = z17;
        this.f363805m = jz5.h.b(qi5.x.f363852d);
        this.f363807o = jz5.h.b(new qi5.a0(this));
        this.f363808p = jz5.h.b(new qi5.z(this));
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        int i17;
        j75.f stateCenter;
        wi5.n0 n0Var;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        int i18 = 0;
        java.util.List list = null;
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        java.util.List list2 = this.f363806n;
        int i19 = 1;
        if (list2 != null) {
            int size = list2.size();
            int i27 = request.f463144b;
            if (i27 < size) {
                int size2 = list2.size();
                int i28 = request.f463145c + i27;
                if (size2 > i28) {
                    dVar.f463148b = true;
                } else {
                    i28 = list2.size();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (i27 < i28) {
                    arrayList.add(list2.get(i27));
                    i27++;
                }
                g95.w wVar = g95.x.f269827a;
                kz5.p0 p0Var = kz5.p0.f313996d;
                java.util.Iterator it = ((java.util.ArrayList) wVar.d(p0Var, arrayList)).iterator();
                while (it.hasNext()) {
                    com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) it.next();
                    java.util.List m17 = ((qy.i) i95.n0.c(qy.i.class)) != null ? c01.v1.m(l4Var.h1()) : list;
                    if (m17 == null) {
                        m17 = p0Var;
                    }
                    java.lang.String r17 = c01.z1.r();
                    if (((m17.isEmpty() ? 1 : 0) ^ i19) != 0) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj : m17) {
                            if (!kotlin.jvm.internal.o.b((java.lang.String) obj, r17)) {
                                arrayList2.add(obj);
                            }
                        }
                        m17 = arrayList2;
                    }
                    if (m17.isEmpty()) {
                        i17 = i18;
                    } else {
                        java.util.Iterator it6 = ((java.util.ArrayList) d75.b.c(m17, 100)).iterator();
                        i17 = i18;
                        while (it6.hasNext()) {
                            java.util.List list3 = (java.util.List) it6.next();
                            p75.n0 n0Var2 = dm.e2.N1;
                            p75.d dVar2 = dm.e2.P1;
                            p75.i0 h17 = n0Var2.h(dVar2.h());
                            h17.f352657d = dVar2.l(list3).c(dm.e2.T1.g(i19, i19));
                            i17 += h17.a().m(gm0.j1.u().f273153f);
                        }
                    }
                    vi5.h hVar = new vi5.h(l4Var.w0(), null, null, 0, 14, null);
                    ri5.h hVar2 = ri5.j.I;
                    int i29 = ri5.j.Z;
                    java.lang.String h18 = l4Var.h1();
                    kotlin.jvm.internal.o.f(h18, "getUsername(...)");
                    java.lang.String id6 = hVar2.a(h18, i29, i18);
                    androidx.appcompat.app.AppCompatActivity activity = this.f363799d;
                    kotlin.jvm.internal.o.g(activity, "activity");
                    kotlin.jvm.internal.o.g(id6, "id");
                    java.lang.String selectShowHeadDisplay = this.f363802g;
                    kotlin.jvm.internal.o.g(selectShowHeadDisplay, "selectShowHeadDisplay");
                    java.lang.String unSelectShowHeadDisplay = this.f363803h;
                    kotlin.jvm.internal.o.g(unSelectShowHeadDisplay, "unSelectShowHeadDisplay");
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String h19 = l4Var.h1();
                    ((sg3.a) v0Var).getClass();
                    java.util.Iterator it7 = it;
                    kz5.p0 p0Var2 = p0Var;
                    android.text.SpannableString bj6 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(activity, c01.a2.e(h19), i65.a.h(activity, com.tencent.mm.R.dimen.f479897ia));
                    java.lang.String h110 = l4Var.h1();
                    kotlin.jvm.internal.o.f(h110, "getUsername(...)");
                    ri5.j jVar = new ri5.j(id6, i29, h110, bj6, hVar, 0, 32, null);
                    jVar.n(null);
                    if ((activity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) && (stateCenter = ((com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) activity).getStateCenter()) != null && (n0Var = (wi5.n0) stateCenter.getState()) != null) {
                        jVar.f396127x = n0Var.e();
                        java.lang.String str = jVar.f396111f;
                        jVar.f396126w = n0Var.f(str);
                        boolean d17 = n0Var.d(str);
                        jVar.f396125v = d17;
                        jVar.f396115l1 = !d17 && n0Var.e(str);
                    }
                    if (jVar.f396126w) {
                        jVar.f396119p = selectShowHeadDisplay;
                    } else {
                        jVar.f396119p = unSelectShowHeadDisplay;
                    }
                    jVar.f396120q = activity.getResources().getColor(com.tencent.mm.R.color.f478491c);
                    jVar.B = com.tencent.mm.storage.z3.q4(l4Var.h1()) || c01.e2.E(l4Var.h1());
                    jVar.C = ((java.lang.Boolean) ((jz5.n) this.f363807o).getValue()).booleanValue();
                    jVar.A = ((java.lang.Boolean) ((jz5.n) this.f363808p).getValue()).booleanValue();
                    jVar.G = i17;
                    dVar.f463149c.add(jVar);
                    it = it7;
                    p0Var = p0Var2;
                    i18 = 0;
                    list = null;
                    i19 = 1;
                }
            }
        }
        v65.i.b(scope, null, new qi5.y(b17, dVar, null), 1, null);
        return b17;
    }

    @Override // ym3.f
    public int getPriority() {
        return -1;
    }

    @Override // ym3.f
    public void onCreate() {
        android.database.Cursor B;
        java.util.List list = this.f363801f;
        if (list.isEmpty()) {
            p75.d dVar = dm.i2.L;
            p75.m c17 = dVar.s(kz5.n0.S0(this.f363800e)).c(dVar.p("'%@chatroom'"));
            p75.i0 g17 = dm.i2.K.g(kz5.b0.c(dVar));
            g17.f352657d = c17;
            g17.f352659f = kz5.b0.c(new g95.v());
            p75.l0 a17 = g17.a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            l75.k0 Q4 = ((jm0.l) ((jz5.n) this.f363805m).getValue()).Q4();
            if (Q4 != null && (B = Q4.B(a17.f352636a, a17.f352637b)) != null) {
                while (B.moveToNext()) {
                    try {
                        java.lang.String string = B.getString(0);
                        if (this.f363804i || !c01.e2.R(string)) {
                            arrayList.add(string);
                        }
                    } finally {
                    }
                }
                vz5.b.a(B, null);
            }
            list = arrayList;
        }
        this.f363806n = list;
    }
}
