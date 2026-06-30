package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ny extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.plugin.finder.view.ka, zy2.ra {
    public static final com.tencent.mm.plugin.finder.viewmodel.component.iy L1 = new com.tencent.mm.plugin.finder.viewmodel.component.iy(null);
    public java.lang.String A;
    public com.tencent.mm.plugin.finder.report.z3 A1;
    public java.lang.String B;
    public com.tencent.mm.plugin.finder.report.l1 B1;
    public int C;
    public fc2.q C1;
    public java.lang.String D;
    public com.tencent.mm.plugin.finder.report.c1 D1;
    public int E;
    public boolean E1;
    public java.lang.String F;
    public boolean F1;
    public fc2.c G;
    public boolean G1;
    public ec2.d H;
    public boolean H1;
    public com.tencent.mm.plugin.finder.report.z3 I;
    public final java.util.LinkedList I1;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.report.k4 f135371J;
    public com.tencent.mm.plugin.finder.report.n4 J1;
    public com.tencent.mm.plugin.finder.report.x1 K;
    public final com.tencent.mm.plugin.finder.viewmodel.component.my K1;
    public com.tencent.mm.plugin.finder.report.d5 L;
    public com.tencent.mm.plugin.finder.report.s2 M;
    public com.tencent.mm.plugin.finder.report.r2 N;
    public com.tencent.mm.plugin.finder.report.p5 P;
    public fc2.c Q;
    public ec2.d R;
    public fc2.o S;
    public com.tencent.mm.plugin.finder.report.r0 T;
    public fc2.c U;
    public ec2.d V;
    public fc2.o W;
    public com.tencent.mm.plugin.finder.report.r0 X;
    public fc2.c Y;
    public ec2.d Z;

    /* renamed from: d, reason: collision with root package name */
    public int f135372d;

    /* renamed from: e, reason: collision with root package name */
    public int f135373e;

    /* renamed from: f, reason: collision with root package name */
    public int f135374f;

    /* renamed from: g, reason: collision with root package name */
    public long f135375g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f135376h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f135377i;

    /* renamed from: l1, reason: collision with root package name */
    public ec2.d f135378l1;

    /* renamed from: m, reason: collision with root package name */
    public int f135379m;

    /* renamed from: n, reason: collision with root package name */
    public int f135380n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f135381o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f135382p;

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.report.z3 f135383p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.report.z3 f135384p1;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f135385q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f135386r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f135387s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f135388t;

    /* renamed from: u, reason: collision with root package name */
    public int f135389u;

    /* renamed from: v, reason: collision with root package name */
    public int f135390v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f135391w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f135392x;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.report.k4 f135393x0;

    /* renamed from: x1, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.report.l1 f135394x1;

    /* renamed from: y, reason: collision with root package name */
    public final org.json.JSONObject f135395y;

    /* renamed from: y0, reason: collision with root package name */
    public fc2.c f135396y0;

    /* renamed from: y1, reason: collision with root package name */
    public fc2.c f135397y1;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f135398z;

    /* renamed from: z1, reason: collision with root package name */
    public ec2.d f135399z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135381o = "";
        this.f135388t = "{}";
        this.f135391w = "";
        this.f135392x = "";
        this.f135395y = new org.json.JSONObject();
        this.f135398z = "";
        this.A = "";
        this.B = "";
        this.C = -1;
        this.D = "";
        this.F = "";
        this.E1 = true;
        this.F1 = true;
        this.H1 = true;
        this.I1 = new java.util.LinkedList();
        this.K1 = new com.tencent.mm.plugin.finder.viewmodel.component.my(this, "FinderReporterThread");
    }

    public static final void O6(com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar) {
        com.tencent.mm.plugin.finder.report.c1 c1Var;
        if (nyVar.n7()) {
            com.tencent.mm.plugin.finder.report.r0 r0Var = nyVar.T;
            if (r0Var != null) {
                r0Var.R0();
            }
            com.tencent.mm.plugin.finder.report.k4 k4Var = nyVar.f135393x0;
            if (k4Var != null) {
                k4Var.R0();
            }
            com.tencent.mm.plugin.finder.report.l1 l1Var = nyVar.f135394x1;
            if (l1Var != null) {
                l1Var.R0();
            }
            com.tencent.mm.plugin.finder.report.r0 r0Var2 = nyVar.X;
            if (r0Var2 != null) {
                r0Var2.R0();
                return;
            }
            return;
        }
        if (nyVar.r7()) {
            com.tencent.mm.plugin.finder.report.k4 k4Var2 = nyVar.f135371J;
            if (k4Var2 != null) {
                k4Var2.R0();
                return;
            }
            return;
        }
        if (nyVar.s7()) {
            com.tencent.mm.plugin.finder.report.d5 d5Var = nyVar.L;
            if (d5Var != null) {
                d5Var.R0();
                return;
            }
            return;
        }
        if (nyVar.f135373e == 5) {
            com.tencent.mm.plugin.finder.report.p5 p5Var = nyVar.P;
            if (p5Var != null) {
                p5Var.R0();
                return;
            }
            return;
        }
        if (!nyVar.o7() || (c1Var = nyVar.D1) == null) {
            return;
        }
        c1Var.R0();
    }

    public static /* synthetic */ void l7(com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar, int i17, int i18, yz5.a aVar, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i18 = 0;
        }
        if ((i19 & 4) != 0) {
            aVar = null;
        }
        nyVar.k7(i17, i18, aVar);
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void G3(int i17, int i18, int i19, int i27) {
    }

    public void P6(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(r26.i0.v(this.f135388t, ";", ",", false, 4, null));
            jSONObject.put(key, value);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            this.f135388t = r26.i0.t(jSONObject2, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderReporterUIC", java.lang.String.valueOf(e17.getMessage()));
        }
    }

    public void Q6(java.lang.String str) {
        if (str == null || str.length() == 0) {
            this.f135388t = "{}";
        } else {
            this.f135388t = str;
        }
    }

    public final java.util.List R6() {
        return n7() ? kz5.c0.d(this.Q, this.Y, this.f135396y0, this.f135397y1, this.U) : kz5.c0.d(this.G);
    }

    public final java.lang.String S6() {
        return this.f135386r;
    }

    public final int T6() {
        return this.f135380n;
    }

    public final java.lang.String U6() {
        return this.f135382p;
    }

    public r45.qt2 V6() {
        if (n7()) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            return W6(((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).S6());
        }
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(7, java.lang.Integer.valueOf(this.f135379m));
        qt2Var.set(5, java.lang.Integer.valueOf(this.f135380n));
        qt2Var.set(0, this.f135385q);
        qt2Var.set(1, this.f135382p);
        qt2Var.set(2, this.f135386r);
        qt2Var.set(6, java.lang.Long.valueOf(this.f135375g));
        qt2Var.set(21, this.f135376h);
        qt2Var.set(3, this.f135377i);
        qt2Var.set(10, java.lang.Integer.valueOf(this.f135390v));
        qt2Var.set(8, java.lang.Integer.valueOf(this.f135389u));
        qt2Var.set(9, this.f135391w);
        java.lang.String str = this.f135398z;
        if (str == null) {
            str = "";
        }
        qt2Var.set(17, str);
        java.lang.String X6 = X6();
        if (X6 == null) {
            X6 = "";
        }
        qt2Var.set(11, X6);
        java.lang.String str2 = this.A;
        qt2Var.set(12, str2 != null ? str2 : "");
        qt2Var.set(14, java.lang.Integer.valueOf(this.f135372d));
        qt2Var.set(15, this.f135381o);
        qt2Var.set(16, this.B);
        qt2Var.set(18, this.F);
        qt2Var.set(4, java.lang.Integer.valueOf(this.f135374f));
        qt2Var.set(19, this.D);
        qt2Var.set(20, java.lang.Integer.valueOf(this.E));
        return qt2Var;
    }

    public final r45.qt2 W6(int i17) {
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(7, java.lang.Integer.valueOf(this.f135379m));
        qt2Var.set(0, this.f135385q);
        qt2Var.set(1, this.f135382p);
        qt2Var.set(2, this.f135386r);
        qt2Var.set(6, java.lang.Long.valueOf(this.f135375g));
        qt2Var.set(21, this.f135376h);
        qt2Var.set(3, this.f135377i);
        qt2Var.set(5, java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bl(i17)));
        qt2Var.set(10, java.lang.Integer.valueOf(this.f135390v));
        qt2Var.set(8, java.lang.Integer.valueOf(this.f135389u));
        qt2Var.set(9, this.f135391w);
        java.lang.String str = this.f135398z;
        if (str == null) {
            str = "";
        }
        qt2Var.set(17, str);
        java.lang.String X6 = X6();
        if (X6 == null) {
            X6 = "";
        }
        qt2Var.set(11, X6);
        java.lang.String str2 = this.A;
        qt2Var.set(12, str2 != null ? str2 : "");
        qt2Var.set(15, this.f135381o);
        qt2Var.set(4, java.lang.Integer.valueOf(this.f135374f));
        qt2Var.set(19, this.D);
        return qt2Var;
    }

    public final java.lang.String X6() {
        org.json.JSONObject jSONObject;
        java.lang.String str = this.f135392x;
        com.tencent.mm.plugin.finder.viewmodel.component.jy jyVar = com.tencent.mm.plugin.finder.viewmodel.component.jy.f134904d;
        if (str == null || r26.n0.N(str)) {
            jSONObject = new org.json.JSONObject();
        } else {
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (java.lang.Throwable unused) {
                return str;
            }
        }
        jyVar.invoke(jSONObject);
        return jSONObject.toString();
    }

    public fc2.c Y6(int i17) {
        return n7() ? i17 == -1 ? b7(this.f135372d) : b7(i17) : this.G;
    }

    public final fc2.o Z6(int i17) {
        if (n7()) {
            return i17 == -1 ? d7(this.f135372d) : d7(i17);
        }
        if (r7()) {
            return this.I;
        }
        if (s7()) {
            return this.K;
        }
        if (q7()) {
            return this.M;
        }
        return null;
    }

    public final com.tencent.mm.plugin.finder.report.r0 a7(int i17) {
        if (n7()) {
            return i17 == -1 ? e7(this.f135372d) : e7(i17);
        }
        if (r7()) {
            return this.f135371J;
        }
        if (s7()) {
            return this.L;
        }
        if (this.f135373e == 5) {
            return this.P;
        }
        if (o7()) {
            return this.D1;
        }
        if (q7()) {
            return this.N;
        }
        return null;
    }

    public final fc2.c b7(int i17) {
        return i17 != 1 ? i17 != 35 ? i17 != 39 ? i17 != 3 ? i17 != 4 ? this.G : this.f135396y0 : this.Q : this.U : this.f135397y1 : this.Y;
    }

    public final ec2.d c7(int i17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderReporterUIC", "getHomeFeedEventSubscriber " + i17);
        return i17 != 1 ? i17 != 35 ? i17 != 39 ? i17 != 3 ? i17 != 4 ? this.H : this.f135378l1 : this.R : this.V : this.f135399z1 : this.Z;
    }

    public final fc2.o d7(int i17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderReporterUIC", "getHomeFlowEventSubscriber " + i17);
        return i17 != 1 ? i17 != 35 ? i17 != 39 ? i17 != 3 ? i17 != 4 ? this.I : this.f135384p1 : this.S : this.W : this.A1 : this.f135383p0;
    }

    public final com.tencent.mm.plugin.finder.report.r0 e7(int i17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderReporterUIC", "getHomeFlowReporter " + i17);
        return i17 != 1 ? i17 != 35 ? i17 != 39 ? i17 != 3 ? i17 != 4 ? this.f135371J : this.f135394x1 : this.T : this.X : this.B1 : this.f135393x0;
    }

    public final fc2.q f7() {
        if (o7()) {
            return this.C1;
        }
        return null;
    }

    public final java.lang.String g7() {
        return this.B;
    }

    public java.util.List h7() {
        java.lang.String str;
        com.tencent.mm.plugin.finder.report.r0 a76 = a7(-1);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (a76 instanceof com.tencent.mm.plugin.finder.report.k4) {
            com.tencent.mm.plugin.finder.report.k4 k4Var = (com.tencent.mm.plugin.finder.report.k4) a76;
            for (java.util.Map.Entry entry : k4Var.B.entrySet()) {
                r45.jn0 jn0Var = new r45.jn0();
                jn0Var.set(0, java.lang.Long.valueOf(((com.tencent.mm.plugin.finder.report.n4) entry.getValue()).f125153a));
                jn0Var.set(12, ((com.tencent.mm.plugin.finder.report.n4) entry.getValue()).f125155b);
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem = ((com.tencent.mm.plugin.finder.report.n4) entry.getValue()).f125159d;
                if (finderItem == null || (str = finderItem.getUserName()) == null) {
                    str = "";
                }
                jn0Var.set(1, str);
                jn0Var.set(2, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(jn0Var.getLong(0), ((com.tencent.mm.plugin.finder.report.n4) entry.getValue()).f125155b, k4Var.f125284h.getInteger(5)));
                linkedList.add(jn0Var);
            }
        }
        return linkedList;
    }

    public final java.lang.String i7() {
        return this.f135385q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x02b2, code lost:
    
        if (r13 != null) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k7(int r13, int r14, yz5.a r15) {
        /*
            Method dump skipped, instructions count: 1951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.ny.k7(int, int, yz5.a):void");
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void l(int i17, int i18, int i19, int i27) {
        int i28;
        com.tencent.mm.plugin.finder.report.r0 a76;
        com.tencent.mm.plugin.finder.report.l1 l1Var;
        com.tencent.mars.xlog.Log.i("Finder.FinderReporterUIC", "onFragmentChange " + i27);
        this.f135380n = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bl(i27);
        this.f135372d = i27;
        if (i17 >= 0) {
            this.f135386r = L1.a(i27);
        }
        r45.qt2 W6 = W6(i27);
        if (i27 == 1) {
            com.tencent.mm.plugin.finder.report.k4 k4Var = this.f135393x0;
            if (k4Var != null) {
                k4Var.P0(W6);
            }
        } else if (i27 == 35) {
            com.tencent.mm.plugin.finder.report.l1 l1Var2 = this.B1;
            if (l1Var2 != null) {
                l1Var2.P0(W6);
            }
        } else if (i27 == 39) {
            com.tencent.mm.plugin.finder.report.r0 r0Var = this.X;
            if (r0Var != null) {
                r0Var.P0(W6);
            }
        } else if (i27 == 3) {
            com.tencent.mm.plugin.finder.report.r0 r0Var2 = this.T;
            if (r0Var2 != null) {
                r0Var2.P0(W6);
            }
        } else if (i27 == 4 && (l1Var = this.f135394x1) != null) {
            l1Var.P0(W6);
        }
        if (this.F1) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            android.os.Bundle bundle = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getActiveFragment().f129268s;
            i28 = bundle != null ? bundle.getInt("Source", 0) : 1;
        } else {
            this.F1 = true;
            i28 = 6;
        }
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Fj(i19, i27, W6, i28);
        if (i19 <= 0 || (a76 = a7(i19)) == null || !(a76 instanceof com.tencent.mm.plugin.finder.report.k4)) {
            return;
        }
        ((com.tencent.mm.plugin.finder.report.k4) a76).i1(hc2.k.a(kz5.c1.k(new jz5.l("feedActionType", 2), new jz5.l("toTab", java.lang.Integer.valueOf(i27)), new jz5.l("fromTab", java.lang.Integer.valueOf(i19)))), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ce, code lost:
    
        if (r0 != null) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7(android.content.Intent r9, android.content.Intent r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.ny.m7(android.content.Intent, android.content.Intent, boolean):void");
    }

    public final boolean n7() {
        return this.f135373e == 1;
    }

    public final boolean o7() {
        return this.f135373e == 6;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 19999) {
            r45.qt2 W6 = W6(this.f135372d);
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((com.tencent.mm.plugin.finder.report.o3) c17).Fj(2, this.f135372d, W6, 0);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        com.tencent.mm.plugin.finder.report.o0 o0Var;
        int i17;
        super.onCreateAfter(bundle);
        boolean z17 = getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI;
        com.tencent.mm.plugin.finder.report.o0 o0Var2 = com.tencent.mm.plugin.finder.report.r0.f125279q;
        if (z17) {
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            java.lang.String str = this.f135382p;
            if (str == null) {
                str = "";
            }
            o3Var.Zj(str, "OnCreate");
            r45.qt2 V6 = V6();
            java.lang.String jSONObject = o0Var2.a(8, java.lang.String.valueOf(getActivity().getIntent().getIntExtra("FROM_SCENE_KEY", 2))).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            o0Var = o0Var2;
            com.tencent.mm.plugin.finder.report.o0.b(o0Var2, V6, 0L, null, 8, jSONObject, 0L, null, null, null, 480, null);
        } else {
            o0Var = o0Var2;
        }
        if (getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI) {
            r45.qt2 V62 = V6();
            com.tencent.mm.plugin.finder.report.o0 o0Var3 = o0Var;
            java.lang.String jSONObject2 = o0Var3.a(8, java.lang.String.valueOf(getActivity().getIntent().getIntExtra("FROM_SCENE_KEY", 1))).toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            i17 = 1;
            com.tencent.mm.plugin.finder.report.o0.b(o0Var3, V62, 0L, null, 8, jSONObject2, 0L, null, null, null, 480, null);
        } else {
            i17 = 1;
        }
        so2.h3.f410392d.l();
        this.K1.sendEmptyMessage(i17);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
        com.tencent.mm.plugin.finder.report.p4.f125250a.b(getActivity(), this.f135395y);
        java.lang.String e17 = xy2.c.e(getContext());
        kotlin.jvm.internal.o.g(e17, "<set-?>");
        this.F = e17;
        androidx.fragment.app.Fragment fragment = getFragment();
        if (!(p7() || (getFragment() instanceof com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment) || (getFragment() instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderReportFragment) || (getFragment() instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment))) {
            fragment = null;
        }
        if (fragment == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderReporterUIC", "onCreateBefore activity:" + getActivity());
            androidx.appcompat.app.AppCompatActivity activity = getActivity() instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? getActivity() : null;
            if (activity != null) {
                com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity;
                l7(this, mMFinderUI.getD(), mMFinderUI.Y6(), null, 4, null);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderReporterUIC", "onCreateBefore fragment:" + getFragment());
        if (p7()) {
            ws5.g gVar = (ws5.g) i95.n0.c(ws5.g.class);
            androidx.fragment.app.Fragment fragment2 = getFragment();
            ((wo2.k) gVar).getClass();
            int f121515s = fragment2 instanceof com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment ? ((com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment) fragment2).getF121515s() : 0;
            ws5.g gVar2 = (ws5.g) i95.n0.c(ws5.g.class);
            androidx.fragment.app.Fragment fragment3 = getFragment();
            ((wo2.k) gVar2).getClass();
            l7(this, f121515s, fragment3 instanceof com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment ? ((com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment) fragment3).x0() : 0, null, 4, null);
            return;
        }
        if (getFragment() instanceof com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment) {
            l7(this, ((com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment) fragment).getF121515s(), 3, null, 4, null);
            return;
        }
        if (getFragment() instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderReportFragment) {
            com.tencent.mm.plugin.finder.ui.fragment.FinderReportFragment finderReportFragment = (com.tencent.mm.plugin.finder.ui.fragment.FinderReportFragment) fragment;
            l7(this, finderReportFragment.getF121515s(), finderReportFragment.t0(), null, 4, null);
        } else if (getFragment() instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) {
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment;
            if (finderHomeTabFragment.x0() != 0) {
                l7(this, finderHomeTabFragment.getF121515s(), finderHomeTabFragment.x0(), null, 4, null);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.report.r0 a76 = a7(-1);
        com.tencent.mm.plugin.finder.report.n4 n4Var = this.J1;
        if (a76 != null && n4Var != null && (a76 instanceof com.tencent.mm.plugin.finder.report.k4)) {
            if (getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
                ((com.tencent.mm.plugin.finder.report.k4) a76).h1(n4Var, hc2.k.a(kz5.b1.e(new jz5.l("feedActionType", 5))), true);
            } else {
                ((com.tencent.mm.plugin.finder.report.k4) a76).h1(n4Var, hc2.k.a(kz5.b1.e(new jz5.l("feedActionType", 58))), true);
            }
        }
        this.J1 = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        super.onFinished();
        com.tencent.mm.plugin.finder.report.r0 a76 = a7(-1);
        com.tencent.mm.plugin.finder.report.k4 k4Var = a76 instanceof com.tencent.mm.plugin.finder.report.k4 ? (com.tencent.mm.plugin.finder.report.k4) a76 : null;
        this.J1 = k4Var != null ? k4Var.f125108z : null;
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void onPageScrollStateChanged(int i17) {
        if (i17 == 0) {
            this.G1 = false;
        } else {
            if (i17 != 1) {
                return;
            }
            this.G1 = true;
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void onPageScrolled(int i17, float f17, int i18) {
        if (this.G1) {
            this.F1 = false;
            this.G1 = false;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        if (n7()) {
            int i17 = this.f135372d;
            if (i17 == 1) {
                com.tencent.mm.plugin.finder.report.z3 z3Var = this.f135383p0;
                if (z3Var != null) {
                    z3Var.e();
                }
                com.tencent.mm.plugin.finder.report.k4 k4Var = this.f135393x0;
                if (k4Var != null) {
                    k4Var.O0();
                }
            } else if (i17 == 35) {
                com.tencent.mm.plugin.finder.report.z3 z3Var2 = this.A1;
                if (z3Var2 != null) {
                    z3Var2.e();
                }
                com.tencent.mm.plugin.finder.report.l1 l1Var = this.B1;
                if (l1Var != null) {
                    l1Var.O0();
                }
            } else if (i17 == 39) {
                fc2.o oVar = this.W;
                if (oVar != null) {
                    oVar.e();
                }
                com.tencent.mm.plugin.finder.report.r0 r0Var = this.X;
                if (r0Var != null) {
                    r0Var.O0();
                }
            } else if (i17 == 3) {
                fc2.o oVar2 = this.S;
                if (oVar2 != null) {
                    oVar2.e();
                }
                com.tencent.mm.plugin.finder.report.r0 r0Var2 = this.T;
                if (r0Var2 != null) {
                    r0Var2.O0();
                }
            } else if (i17 == 4) {
                com.tencent.mm.plugin.finder.report.z3 z3Var3 = this.f135384p1;
                if (z3Var3 != null) {
                    z3Var3.e();
                }
                com.tencent.mm.plugin.finder.report.l1 l1Var2 = this.f135394x1;
                if (l1Var2 != null) {
                    l1Var2.O0();
                }
            }
        } else if (r7()) {
            com.tencent.mm.plugin.finder.report.z3 z3Var4 = this.I;
            if (z3Var4 != null) {
                z3Var4.e();
            }
            com.tencent.mm.plugin.finder.report.k4 k4Var2 = this.f135371J;
            if (k4Var2 != null) {
                k4Var2.O0();
            }
        } else if (s7()) {
            com.tencent.mm.plugin.finder.report.x1 x1Var = this.K;
            if (x1Var != null) {
                x1Var.e();
            }
            com.tencent.mm.plugin.finder.report.d5 d5Var = this.L;
            if (d5Var != null) {
                d5Var.O0();
            }
        } else {
            if (this.f135373e == 5) {
                com.tencent.mm.plugin.finder.report.p5 p5Var = this.P;
                if (p5Var != null) {
                    p5Var.f125289p = false;
                }
            } else if (o7()) {
                fc2.q qVar = this.C1;
                if (qVar != null) {
                    com.tencent.mm.sdk.platformtools.u3.l(qVar.f260975c);
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = qVar.f260976d;
                    if (baseFinderFeed != null) {
                        fc2.s sVar = new fc2.s(4);
                        sVar.f260981e = baseFinderFeed;
                        sVar.f260984h = qVar.f260974b;
                        sVar.f260982f = baseFinderFeed.getItemId();
                        sVar.f260983g = baseFinderFeed.w();
                        qVar.f260974b = baseFinderFeed.getItemId();
                        qVar.a(sVar);
                    }
                    qVar.f260974b = -1L;
                }
                com.tencent.mm.plugin.finder.report.c1 c1Var = this.D1;
                if (c1Var != null) {
                    c1Var.O0();
                }
            } else if (q7()) {
                com.tencent.mm.plugin.finder.report.s2 s2Var = this.M;
                if (s2Var != null) {
                    s2Var.e();
                }
                com.tencent.mm.plugin.finder.report.r2 r2Var = this.N;
                if (r2Var != null) {
                    r2Var.O0();
                }
            }
        }
        java.util.Iterator it = this.I1.iterator();
        while (it.hasNext()) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) ((java.lang.ref.WeakReference) it.next()).get();
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.z0();
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onPreDestroyed() {
        super.onPreDestroyed();
        com.tencent.mars.xlog.Log.i("Finder.FinderReporterUIC", "onPreDestroyed");
        boolean z17 = getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI;
        com.tencent.mm.plugin.finder.report.o0 o0Var = com.tencent.mm.plugin.finder.report.r0.f125279q;
        if (z17) {
            com.tencent.mm.plugin.finder.report.o0.b(o0Var, V6(), 0L, null, 9, "1", 0L, null, null, null, 480, null);
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            java.lang.String str = this.f135382p;
            if (str == null) {
                str = "";
            }
            o3Var.Zj(str, "Exit");
        }
        if (getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI) {
            com.tencent.mm.plugin.finder.report.o0.b(o0Var, V6(), 0L, null, 9, "1", 0L, null, null, null, 480, null);
        }
        fc2.c cVar = this.G;
        if (cVar != null) {
            cVar.c();
        }
        fc2.c cVar2 = this.Q;
        if (cVar2 != null) {
            cVar2.c();
        }
        fc2.c cVar3 = this.Y;
        if (cVar3 != null) {
            cVar3.c();
        }
        fc2.c cVar4 = this.f135396y0;
        if (cVar4 != null) {
            cVar4.c();
        }
        fc2.c cVar5 = this.f135397y1;
        if (cVar5 != null) {
            cVar5.c();
        }
        fc2.c cVar6 = this.U;
        if (cVar6 != null) {
            cVar6.c();
        }
        fc2.q qVar = this.C1;
        if (qVar != null) {
            qVar.f260976d = null;
        }
        com.tencent.mm.sdk.platformtools.u3.i(com.tencent.mm.plugin.finder.viewmodel.component.ly.f135096d, 1000L);
        com.tencent.mm.plugin.finder.viewmodel.component.my myVar = this.K1;
        myVar.removeCallbacksAndMessages(null);
        myVar.sendEmptyMessage(2);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.H1) {
            this.H1 = false;
            return;
        }
        if (n7()) {
            r45.qt2 W6 = W6(this.f135372d);
            int i17 = this.f135372d;
            if (i17 == 1) {
                com.tencent.mm.plugin.finder.report.k4 k4Var = this.f135393x0;
                if (k4Var != null) {
                    k4Var.P0(W6);
                }
                com.tencent.mm.plugin.finder.report.z3 z3Var = this.f135383p0;
                if (z3Var != null) {
                    z3Var.f();
                }
                com.tencent.mm.plugin.finder.report.k4 k4Var2 = this.f135393x0;
                if (k4Var2 != null) {
                    k4Var2.Q0();
                }
            } else if (i17 == 35) {
                com.tencent.mm.plugin.finder.report.l1 l1Var = this.B1;
                if (l1Var != null) {
                    l1Var.P0(W6);
                }
                com.tencent.mm.plugin.finder.report.z3 z3Var2 = this.A1;
                if (z3Var2 != null) {
                    z3Var2.f();
                }
                com.tencent.mm.plugin.finder.report.l1 l1Var2 = this.B1;
                if (l1Var2 != null) {
                    l1Var2.Q0();
                }
            } else if (i17 == 39) {
                com.tencent.mm.plugin.finder.report.r0 r0Var = this.X;
                if (r0Var != null) {
                    r0Var.P0(W6);
                }
                fc2.o oVar = this.W;
                if (oVar != null) {
                    oVar.f();
                }
                com.tencent.mm.plugin.finder.report.r0 r0Var2 = this.X;
                if (r0Var2 != null) {
                    r0Var2.f125289p = true;
                }
            } else if (i17 == 3) {
                com.tencent.mm.plugin.finder.report.r0 r0Var3 = this.T;
                if (r0Var3 != null) {
                    r0Var3.P0(W6);
                }
                fc2.o oVar2 = this.S;
                if (oVar2 != null) {
                    oVar2.f();
                }
                com.tencent.mm.plugin.finder.report.r0 r0Var4 = this.T;
                if (r0Var4 != null) {
                    r0Var4.Q0();
                }
            } else if (i17 == 4) {
                com.tencent.mm.plugin.finder.report.l1 l1Var3 = this.f135394x1;
                if (l1Var3 != null) {
                    l1Var3.P0(W6);
                }
                com.tencent.mm.plugin.finder.report.z3 z3Var3 = this.f135384p1;
                if (z3Var3 != null) {
                    z3Var3.f();
                }
                com.tencent.mm.plugin.finder.report.l1 l1Var4 = this.f135394x1;
                if (l1Var4 != null) {
                    l1Var4.Q0();
                }
            }
            com.tencent.mm.plugin.finder.extension.reddot.ga gaVar = com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a;
            gaVar.h(1, V6(), this.f135372d, false);
            gaVar.g(1, V6(), this.f135372d, false);
            gaVar.k(1, V6(), this.f135372d, false);
            gaVar.j(1, V6());
            gaVar.i(1, V6(), this.f135372d, false);
            gaVar.l(1, V6(), "");
        } else if (r7()) {
            com.tencent.mm.plugin.finder.report.z3 z3Var4 = this.I;
            if (z3Var4 != null) {
                z3Var4.f();
            }
            com.tencent.mm.plugin.finder.report.k4 k4Var3 = this.f135371J;
            if (k4Var3 != null) {
                k4Var3.Q0();
            }
        } else if (s7()) {
            com.tencent.mm.plugin.finder.report.x1 x1Var = this.K;
            if (x1Var != null) {
                x1Var.f();
            }
            com.tencent.mm.plugin.finder.report.d5 d5Var = this.L;
            if (d5Var != null) {
                d5Var.f125289p = true;
            }
        } else {
            if (this.f135373e == 5) {
                com.tencent.mm.plugin.finder.report.p5 p5Var = this.P;
                if (p5Var != null) {
                    p5Var.f125289p = true;
                }
            } else if (o7()) {
                fc2.q qVar = this.C1;
                if (qVar != null) {
                    com.tencent.mm.sdk.platformtools.u3.i(qVar.f260975c, 200L);
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = qVar.f260976d;
                    if (baseFinderFeed != null) {
                        fc2.s sVar = new fc2.s(3);
                        sVar.f260981e = baseFinderFeed;
                        sVar.f260984h = qVar.f260974b;
                        sVar.f260982f = baseFinderFeed.getItemId();
                        sVar.f260983g = baseFinderFeed.w();
                        qVar.f260974b = baseFinderFeed.getItemId();
                        qVar.a(sVar);
                    }
                    com.tencent.mars.xlog.Log.i("FinderHorizontalVideoSubscriber", "onVisible currentFeed=" + qVar.f260976d + '!');
                }
                com.tencent.mm.plugin.finder.report.c1 c1Var = this.D1;
                if (c1Var != null) {
                    c1Var.f125289p = true;
                }
            } else if (q7()) {
                com.tencent.mm.plugin.finder.report.s2 s2Var = this.M;
                if (s2Var != null) {
                    s2Var.f();
                }
                com.tencent.mm.plugin.finder.report.r2 r2Var = this.N;
                if (r2Var != null) {
                    r2Var.Q0();
                }
            }
        }
        java.util.Iterator it = this.I1.iterator();
        while (it.hasNext()) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) ((java.lang.ref.WeakReference) it.next()).get();
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.A0();
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        if (s7()) {
            com.tencent.mm.plugin.finder.report.x1 x1Var = this.K;
            if (x1Var != null) {
                x1Var.f();
            }
            com.tencent.mm.plugin.finder.report.d5 d5Var = this.L;
            if (d5Var != null) {
                d5Var.f125289p = true;
                return;
            }
            return;
        }
        if (q7()) {
            com.tencent.mm.plugin.finder.report.s2 s2Var = this.M;
            if (s2Var != null) {
                s2Var.f();
            }
            com.tencent.mm.plugin.finder.report.r2 r2Var = this.N;
            if (r2Var != null) {
                r2Var.Q0();
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        if (s7()) {
            com.tencent.mm.plugin.finder.report.x1 x1Var = this.K;
            if (x1Var != null) {
                x1Var.e();
            }
            com.tencent.mm.plugin.finder.report.d5 d5Var = this.L;
            if (d5Var != null) {
                d5Var.O0();
                return;
            }
            return;
        }
        if (q7()) {
            com.tencent.mm.plugin.finder.report.s2 s2Var = this.M;
            if (s2Var != null) {
                s2Var.e();
            }
            com.tencent.mm.plugin.finder.report.r2 r2Var = this.N;
            if (r2Var != null) {
                r2Var.O0();
            }
        }
    }

    public final boolean p7() {
        ws5.g gVar = (ws5.g) i95.n0.c(ws5.g.class);
        androidx.fragment.app.Fragment fragment = getFragment();
        ((wo2.k) gVar).getClass();
        return fragment instanceof com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment;
    }

    public final boolean q7() {
        return this.f135373e == 7;
    }

    public final boolean r7() {
        return this.f135373e == 2;
    }

    public final boolean s7() {
        return this.f135373e == 3;
    }

    public final void t7(long j17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("Finder.FinderReporterUIC", "setEnterSourceInfo:" + j17 + "  finderUserName:" + str2 + '}');
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String Ui = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ui(j17);
        this.f135375g = j17;
        this.f135376h = str;
        jSONObject.put("feedid", Ui);
        jSONObject.put("finderusername", str2 == null ? "" : str2);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        this.A = jSONObject2;
        com.tencent.mm.plugin.finder.report.k4 k4Var = this.f135371J;
        r45.qt2 qt2Var = k4Var != null ? k4Var.f125284h : null;
        if (qt2Var != null) {
            qt2Var.set(12, jSONObject2);
        }
        com.tencent.mm.plugin.finder.report.d5 d5Var = this.L;
        r45.qt2 qt2Var2 = d5Var != null ? d5Var.f125284h : null;
        if (qt2Var2 != null) {
            qt2Var2.set(12, jSONObject2);
        }
        getActivity().getIntent().putExtra("key_enter_source_info", this.A);
        if (com.tencent.mm.sdk.platformtools.t8.K0(X6())) {
            return;
        }
        java.lang.String str3 = this.f135382p;
        java.lang.String X6 = X6();
        com.tencent.mm.autogen.mmdata.rpt.FinderJointBusinessWithContextIDStruct finderJointBusinessWithContextIDStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderJointBusinessWithContextIDStruct();
        if (str3 == null) {
            str3 = "";
        }
        finderJointBusinessWithContextIDStruct.f56986d = finderJointBusinessWithContextIDStruct.b("contextid", str3, true);
        finderJointBusinessWithContextIDStruct.f56987e = finderJointBusinessWithContextIDStruct.b("ReportExtraInfo", X6 != null ? r26.i0.t(X6, ",", ";", false) : "", true);
        finderJointBusinessWithContextIDStruct.f56988f = finderJointBusinessWithContextIDStruct.b("EnterSourceFeedid", Ui, true);
        if (str2 == null) {
            str2 = "";
        }
        finderJointBusinessWithContextIDStruct.f56989g = finderJointBusinessWithContextIDStruct.b("EnterSourceUsername", str2, true);
        finderJointBusinessWithContextIDStruct.k();
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void z(boolean z17, int i17, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        if (z17) {
            androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ey2.t0 t0Var = (ey2.t0) a17;
            boolean z18 = this.E1 && t0Var.Q6() == fragment.f129265p;
            int i18 = !t0Var.R6(fragment.f129265p) ? 3 : 2;
            r45.qt2 W6 = W6(fragment.f129265p);
            int i19 = fragment.f129265p;
            if (i19 == 1) {
                com.tencent.mm.plugin.finder.report.z3 z3Var = this.f135383p0;
                if (z3Var != null) {
                    z3Var.f();
                }
                com.tencent.mm.plugin.finder.report.k4 k4Var = this.f135393x0;
                if (k4Var != null) {
                    k4Var.Q0();
                }
                fc2.o oVar = this.S;
                if (oVar != null) {
                    oVar.e();
                }
                com.tencent.mm.plugin.finder.report.r0 r0Var = this.T;
                if (r0Var != null) {
                    r0Var.O0();
                }
                com.tencent.mm.plugin.finder.report.z3 z3Var2 = this.f135384p1;
                if (z3Var2 != null) {
                    z3Var2.e();
                }
                com.tencent.mm.plugin.finder.report.l1 l1Var = this.f135394x1;
                if (l1Var != null) {
                    l1Var.O0();
                }
                com.tencent.mm.plugin.finder.report.z3 z3Var3 = this.A1;
                if (z3Var3 != null) {
                    z3Var3.e();
                }
                com.tencent.mm.plugin.finder.report.l1 l1Var2 = this.B1;
                if (l1Var2 != null) {
                    l1Var2.O0();
                }
                fc2.o oVar2 = this.W;
                if (oVar2 != null) {
                    oVar2.e();
                }
                com.tencent.mm.plugin.finder.report.r0 r0Var2 = this.X;
                if (r0Var2 != null) {
                    r0Var2.O0();
                }
                com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a.h(i18, W6, this.f135372d, z18);
            } else if (i19 == 35) {
                com.tencent.mm.plugin.finder.report.z3 z3Var4 = this.f135384p1;
                if (z3Var4 != null) {
                    z3Var4.e();
                }
                com.tencent.mm.plugin.finder.report.l1 l1Var3 = this.f135394x1;
                if (l1Var3 != null) {
                    l1Var3.O0();
                }
                com.tencent.mm.plugin.finder.report.z3 z3Var5 = this.f135383p0;
                if (z3Var5 != null) {
                    z3Var5.e();
                }
                com.tencent.mm.plugin.finder.report.k4 k4Var2 = this.f135393x0;
                if (k4Var2 != null) {
                    k4Var2.O0();
                }
                fc2.o oVar3 = this.S;
                if (oVar3 != null) {
                    oVar3.e();
                }
                com.tencent.mm.plugin.finder.report.r0 r0Var3 = this.T;
                if (r0Var3 != null) {
                    r0Var3.O0();
                }
                com.tencent.mm.plugin.finder.report.z3 z3Var6 = this.A1;
                if (z3Var6 != null) {
                    z3Var6.f();
                }
                com.tencent.mm.plugin.finder.report.l1 l1Var4 = this.B1;
                if (l1Var4 != null) {
                    l1Var4.Q0();
                }
                fc2.o oVar4 = this.W;
                if (oVar4 != null) {
                    oVar4.e();
                }
                com.tencent.mm.plugin.finder.report.r0 r0Var4 = this.X;
                if (r0Var4 != null) {
                    r0Var4.O0();
                }
                com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a.i(i18, W6, this.f135372d, z18);
            } else if (i19 == 39) {
                com.tencent.mm.plugin.finder.report.z3 z3Var7 = this.f135384p1;
                if (z3Var7 != null) {
                    z3Var7.e();
                }
                com.tencent.mm.plugin.finder.report.l1 l1Var5 = this.f135394x1;
                if (l1Var5 != null) {
                    l1Var5.O0();
                }
                com.tencent.mm.plugin.finder.report.z3 z3Var8 = this.f135383p0;
                if (z3Var8 != null) {
                    z3Var8.e();
                }
                com.tencent.mm.plugin.finder.report.k4 k4Var3 = this.f135393x0;
                if (k4Var3 != null) {
                    k4Var3.O0();
                }
                fc2.o oVar5 = this.S;
                if (oVar5 != null) {
                    oVar5.e();
                }
                com.tencent.mm.plugin.finder.report.r0 r0Var5 = this.T;
                if (r0Var5 != null) {
                    r0Var5.O0();
                }
                com.tencent.mm.plugin.finder.report.z3 z3Var9 = this.A1;
                if (z3Var9 != null) {
                    z3Var9.e();
                }
                com.tencent.mm.plugin.finder.report.l1 l1Var6 = this.B1;
                if (l1Var6 != null) {
                    l1Var6.O0();
                }
                fc2.o oVar6 = this.W;
                if (oVar6 != null) {
                    oVar6.f();
                }
                com.tencent.mm.plugin.finder.report.r0 r0Var6 = this.X;
                if (r0Var6 != null) {
                    r0Var6.f125289p = true;
                }
            } else if (i19 == 3) {
                fc2.o oVar7 = this.S;
                if (oVar7 != null) {
                    oVar7.f();
                }
                com.tencent.mm.plugin.finder.report.r0 r0Var7 = this.T;
                if (r0Var7 != null) {
                    r0Var7.Q0();
                }
                com.tencent.mm.plugin.finder.report.z3 z3Var10 = this.f135383p0;
                if (z3Var10 != null) {
                    z3Var10.e();
                }
                com.tencent.mm.plugin.finder.report.k4 k4Var4 = this.f135393x0;
                if (k4Var4 != null) {
                    k4Var4.O0();
                }
                com.tencent.mm.plugin.finder.report.z3 z3Var11 = this.f135384p1;
                if (z3Var11 != null) {
                    z3Var11.e();
                }
                com.tencent.mm.plugin.finder.report.l1 l1Var7 = this.f135394x1;
                if (l1Var7 != null) {
                    l1Var7.O0();
                }
                com.tencent.mm.plugin.finder.report.z3 z3Var12 = this.A1;
                if (z3Var12 != null) {
                    z3Var12.e();
                }
                com.tencent.mm.plugin.finder.report.l1 l1Var8 = this.B1;
                if (l1Var8 != null) {
                    l1Var8.O0();
                }
                fc2.o oVar8 = this.W;
                if (oVar8 != null) {
                    oVar8.e();
                }
                com.tencent.mm.plugin.finder.report.r0 r0Var8 = this.X;
                if (r0Var8 != null) {
                    r0Var8.O0();
                }
                com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a.g(i18, W6, this.f135372d, z18);
            } else if (i19 == 4) {
                com.tencent.mm.plugin.finder.report.z3 z3Var13 = this.f135384p1;
                if (z3Var13 != null) {
                    z3Var13.f();
                }
                com.tencent.mm.plugin.finder.report.l1 l1Var9 = this.f135394x1;
                if (l1Var9 != null) {
                    l1Var9.Q0();
                }
                com.tencent.mm.plugin.finder.report.z3 z3Var14 = this.f135383p0;
                if (z3Var14 != null) {
                    z3Var14.e();
                }
                com.tencent.mm.plugin.finder.report.k4 k4Var5 = this.f135393x0;
                if (k4Var5 != null) {
                    k4Var5.O0();
                }
                fc2.o oVar9 = this.S;
                if (oVar9 != null) {
                    oVar9.e();
                }
                com.tencent.mm.plugin.finder.report.r0 r0Var9 = this.T;
                if (r0Var9 != null) {
                    r0Var9.O0();
                }
                com.tencent.mm.plugin.finder.report.z3 z3Var15 = this.A1;
                if (z3Var15 != null) {
                    z3Var15.e();
                }
                com.tencent.mm.plugin.finder.report.l1 l1Var10 = this.B1;
                if (l1Var10 != null) {
                    l1Var10.O0();
                }
                fc2.o oVar10 = this.W;
                if (oVar10 != null) {
                    oVar10.e();
                }
                com.tencent.mm.plugin.finder.report.r0 r0Var10 = this.X;
                if (r0Var10 != null) {
                    r0Var10.O0();
                }
                com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a.k(i18, W6, this.f135372d, z18);
            }
            this.E1 = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f135381o = "";
        this.f135388t = "{}";
        this.f135391w = "";
        this.f135392x = "";
        this.f135395y = new org.json.JSONObject();
        this.f135398z = "";
        this.A = "";
        this.B = "";
        this.C = -1;
        this.D = "";
        this.F = "";
        this.E1 = true;
        this.F1 = true;
        this.H1 = true;
        this.I1 = new java.util.LinkedList();
        this.K1 = new com.tencent.mm.plugin.finder.viewmodel.component.my(this, "FinderReporterThread");
    }
}
