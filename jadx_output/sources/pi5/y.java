package pi5;

/* loaded from: classes.dex */
public final class y extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f354895d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f354896e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f354897f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f354898g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f354899h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f354900i;

    public /* synthetic */ y(androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String str, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(appCompatActivity, str, (i17 & 4) != 0 ? false : z17);
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        int size;
        java.util.ArrayList arrayList;
        int i17;
        com.tencent.mm.storage.a3 a3Var;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        java.util.List list = this.f354900i;
        com.tencent.mm.storage.a3 a3Var2 = this.f354899h;
        int i18 = 1;
        java.util.ArrayList arrayList2 = dVar.f463149c;
        if (list != null && a3Var2 != null) {
            int size2 = list.size();
            int i19 = request.f463144b;
            if (i19 < size2) {
                int size3 = list.size();
                int i27 = request.f463145c;
                if (size3 > i19 + i27) {
                    dVar.f463148b = true;
                    size = i27 + i19;
                } else {
                    size = list.size();
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                while (i19 < size) {
                    arrayList3.add(list.get(i19));
                    i19++;
                }
                for (com.tencent.mm.storage.z3 z3Var : g95.e.f269801a.f(arrayList3)) {
                    if (((int) z3Var.E2) != 0) {
                        arrayList = arrayList2;
                        a3Var = a3Var2;
                        ui5.b bVar = new ui5.b(a3Var2, null, null, 0, 0, null, 62, null);
                        ri5.h hVar = ri5.j.I;
                        int i28 = ri5.j.Z;
                        java.lang.String d17 = z3Var.d1();
                        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                        ri5.j b18 = ui5.b.f428141g.b(this.f354895d, hVar.a(d17, i28, 0), z3Var, i28, bVar);
                        if (this.f354897f && !com.tencent.mm.sdk.platformtools.t8.J0(b18.f396112g) && kotlin.jvm.internal.o.b(c01.z1.r(), z3Var.d1())) {
                            i17 = 1;
                            java.lang.CharSequence concat = android.text.TextUtils.concat(b18.f396112g, this.f354895d.getString(com.tencent.mm.R.string.ieq));
                            kotlin.jvm.internal.o.f(concat, "concat(...)");
                            b18.f396112g = concat;
                        } else {
                            i17 = 1;
                        }
                        arrayList.add(b18);
                    } else {
                        arrayList = arrayList2;
                        i17 = i18;
                        a3Var = a3Var2;
                    }
                    arrayList2 = arrayList;
                    i18 = i17;
                    a3Var2 = a3Var;
                }
            }
        }
        v65.i.b(scope, null, new pi5.w(b17, dVar, null), i18, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactChatRoomMemberDataSource", "dataList add size:%s", java.lang.Integer.valueOf(arrayList2.size()));
        return b17;
    }

    @Override // ym3.f
    public int getPriority() {
        return -1;
    }

    @Override // ym3.f
    public void onCreate() {
        java.util.List list;
        android.database.Cursor B;
        j75.f stateCenter;
        wi5.n0 n0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f354895d;
        if ((appCompatActivity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) && (stateCenter = ((com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) appCompatActivity).getStateCenter()) != null && (n0Var = (wi5.n0) stateCenter.getState()) != null) {
            arrayList.addAll(n0Var.D);
            hashSet.addAll(n0Var.f446320p);
        }
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f354896e;
        this.f354899h = a17.z0(str);
        if (arrayList.isEmpty()) {
            list = c01.v1.m(str);
            if (list != null) {
                list.removeAll(hashSet);
                p75.n0 n0Var2 = dm.e2.N1;
                p75.d dVar = dm.e2.P1;
                p75.i0 g17 = n0Var2.g(kz5.b0.c(dVar));
                g17.f352657d = dVar.l(list);
                g17.f352659f = kz5.c0.i(new p75.g("showHead", true), new g95.c());
                p75.l0 a18 = g17.a();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                l75.k0 Q4 = ((jm0.l) ((jz5.n) this.f354898g).getValue()).Q4();
                if (Q4 != null && (B = Q4.B(a18.f352636a, a18.f352637b)) != null) {
                    while (B.moveToNext()) {
                        try {
                            arrayList2.add(B.getString(0));
                        } finally {
                        }
                    }
                    vz5.b.a(B, null);
                }
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                h0Var.f310123d = new java.util.HashMap();
                for (com.tencent.mm.storage.z3 z3Var : g95.e.f269801a.d(arrayList2)) {
                    if (((int) z3Var.E2) != 0) {
                        java.lang.String d17 = z3Var.d1();
                        com.tencent.mm.storage.a3 a3Var = this.f354899h;
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
                kz5.g0.t(arrayList2, new pi5.x(h0Var));
                java.util.LinkedList linkedList = (java.util.LinkedList) list;
                linkedList.clear();
                linkedList.addAll(arrayList2);
            } else {
                list = null;
            }
        } else {
            list = arrayList;
        }
        this.f354900i = list;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactChatRoomMemberDataSource", "showMemberList: %s", arrayList);
    }

    public y(androidx.appcompat.app.AppCompatActivity activity, java.lang.String chatroom, boolean z17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(chatroom, "chatroom");
        this.f354895d = activity;
        this.f354896e = chatroom;
        this.f354897f = z17;
        this.f354898g = jz5.h.b(pi5.v.f354890d);
    }
}
