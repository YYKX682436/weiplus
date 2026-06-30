package pi5;

/* loaded from: classes.dex */
public final class d extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f354833d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f354834e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f354835f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f354836g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f354837h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f354838i;

    public d(androidx.appcompat.app.AppCompatActivity activity, java.lang.String chatroom, java.util.List showMemberList) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(chatroom, "chatroom");
        kotlin.jvm.internal.o.g(showMemberList, "showMemberList");
        this.f354833d = activity;
        this.f354834e = chatroom;
        this.f354835f = showMemberList;
        this.f354836g = jz5.h.b(pi5.a.f354828d);
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        com.tencent.mm.storage.a3 a3Var;
        j75.f stateCenter;
        wi5.n0 n0Var;
        pi5.d dVar = this;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar2 = new ym3.d(request);
        int i17 = 0;
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        java.util.List list = dVar.f354838i;
        com.tencent.mm.storage.a3 a3Var2 = dVar.f354837h;
        if (list != null && a3Var2 != null) {
            int size = list.size();
            int i18 = request.f463144b;
            if (i18 < size) {
                int size2 = list.size();
                int i19 = request.f463145c + i18;
                if (size2 > i19) {
                    dVar2.f463148b = true;
                } else {
                    i19 = list.size();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (i18 < i19) {
                    arrayList.add(list.get(i18));
                    i18++;
                }
                java.util.Iterator it = ((java.util.ArrayList) g95.e.f269801a.f(arrayList)).iterator();
                while (it.hasNext()) {
                    com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) it.next();
                    if (((int) z3Var.E2) != 0) {
                        a3Var = a3Var2;
                        ui5.b bVar = new ui5.b(a3Var2, null, null, 0, 0, null, 62, null);
                        ri5.h hVar = ri5.j.I;
                        int i27 = ri5.j.Z;
                        java.lang.String d17 = z3Var.d1();
                        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                        java.lang.String id6 = hVar.a(d17, i27, i17);
                        androidx.appcompat.app.AppCompatActivity activity = dVar.f354833d;
                        kotlin.jvm.internal.o.g(activity, "activity");
                        kotlin.jvm.internal.o.g(id6, "id");
                        si5.a aVar = si5.b.f408325a;
                        si5.e a17 = aVar.a(activity, z3Var, bVar.f428143b, bVar.f428144c, bVar.f428142a);
                        java.lang.String d18 = z3Var.d1();
                        kotlin.jvm.internal.o.f(d18, "getUsername(...)");
                        java.lang.CharSequence charSequence = a17.f408329a;
                        java.lang.String str = "";
                        ri5.j jVar = new ri5.j(id6, i27, d18, charSequence == null ? "" : charSequence, bVar, 0, 32, null);
                        jVar.n(a17.f408330b);
                        j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
                        if (b0Var != null) {
                            java.lang.String fj6 = ((l41.q2) b0Var).fj(z3Var.Q0(), z3Var.G0());
                            if (fj6 != null) {
                                str = fj6;
                            }
                        }
                        jVar.f396116m = str;
                        if (!com.tencent.mm.sdk.platformtools.t8.J0(str) && kotlin.jvm.internal.o.b("3552365301", z3Var.Q0())) {
                            jVar.f396116m = "@" + ((java.lang.Object) jVar.f396116m);
                        }
                        if ((activity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) && (stateCenter = ((com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) activity).getStateCenter()) != null && (n0Var = (wi5.n0) stateCenter.getState()) != null) {
                            jVar.f396127x = n0Var.e();
                            java.lang.String str2 = jVar.f396111f;
                            jVar.f396126w = n0Var.f(str2);
                            boolean d19 = n0Var.d(str2);
                            jVar.f396125v = d19;
                            jVar.f396115l1 = !d19 && n0Var.e(str2);
                        }
                        si5.d c17 = aVar.c(bVar.f428146e, z3Var, bVar.f428142a);
                        bVar.f428146e = c17.f408326a;
                        java.lang.String str3 = c17.f408327b;
                        kotlin.jvm.internal.o.g(str3, "<set-?>");
                        bVar.f428147f = str3;
                        jVar.o(c17.f408328c);
                        jVar.f396120q = activity.getResources().getColor(com.tencent.mm.R.color.f478491c);
                        dVar2.f463149c.add(jVar);
                    } else {
                        a3Var = a3Var2;
                    }
                    dVar = this;
                    a3Var2 = a3Var;
                    i17 = 0;
                }
            }
        }
        v65.i.b(scope, null, new pi5.b(b17, dVar2, null), 1, null);
        return b17;
    }

    @Override // ym3.f
    public int getPriority() {
        return 0;
    }

    @Override // ym3.f
    public void onCreate() {
        java.util.List list;
        android.database.Cursor B;
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f354834e;
        this.f354837h = a17.z0(str);
        java.util.List list2 = this.f354835f;
        if (list2.isEmpty()) {
            list = c01.v1.m(str);
            if (list != null) {
                java.util.LinkedList linkedList = (java.util.LinkedList) list;
                linkedList.remove(c01.z1.r());
                p75.n0 n0Var = dm.e2.N1;
                p75.d dVar = dm.e2.P1;
                p75.i0 g17 = n0Var.g(kz5.b0.c(dVar));
                g17.f352657d = dVar.l(list);
                p75.l0 a18 = g17.a();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                l75.k0 Q4 = ((jm0.l) ((jz5.n) this.f354836g).getValue()).Q4();
                if (Q4 != null && (B = Q4.B(a18.f352636a, a18.f352637b)) != null) {
                    while (B.moveToNext()) {
                        try {
                            arrayList.add(B.getString(0));
                        } finally {
                        }
                    }
                    vz5.b.a(B, null);
                }
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                h0Var.f310123d = new java.util.HashMap();
                for (com.tencent.mm.storage.z3 z3Var : g95.e.f269801a.d(arrayList)) {
                    if (((int) z3Var.E2) != 0) {
                        java.lang.String d17 = z3Var.d1();
                        com.tencent.mm.storage.a3 a3Var = this.f354837h;
                        java.lang.String z07 = a3Var != null ? a3Var.z0(d17) : null;
                        if (z07 == null || r26.n0.N(z07)) {
                            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                            java.lang.String c17 = c01.a2.c(z3Var, d17);
                            java.util.Map map = (java.util.Map) h0Var.f310123d;
                            kotlin.jvm.internal.o.d(d17);
                            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                            java.lang.String k17 = o13.n.k(c17);
                            kotlin.jvm.internal.o.f(k17, "getShowHeadPinYin(...)");
                            map.put(d17, k17);
                        } else {
                            java.util.Map map2 = (java.util.Map) h0Var.f310123d;
                            kotlin.jvm.internal.o.d(d17);
                            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                            java.lang.String k18 = o13.n.k(z07);
                            kotlin.jvm.internal.o.f(k18, "getShowHeadPinYin(...)");
                            map2.put(d17, k18);
                        }
                    }
                }
                kz5.g0.t(arrayList, new pi5.c(h0Var));
                linkedList.clear();
                linkedList.addAll(arrayList);
            } else {
                list = null;
            }
        } else {
            list = list2;
        }
        this.f354838i = list;
        com.tencent.mars.xlog.Log.i("MicroMsg.AtSomeOneChatRoomMemberDataSource", "showMemberList: %s", list2);
    }
}
