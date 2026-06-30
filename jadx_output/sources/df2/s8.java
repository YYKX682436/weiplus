package df2;

/* loaded from: classes3.dex */
public final class s8 extends if2.b implements if2.e, vd2.j5 {
    public android.view.View A;
    public final jz5.g A1;
    public android.view.View B;
    public df2.h7 B1;
    public android.view.View C;
    public final jz5.g C1;
    public android.widget.TextView D;
    public final jz5.g D1;
    public android.widget.TextView E;
    public final java.lang.String E1;
    public android.widget.TextView F;
    public android.widget.TextView G;
    public com.tencent.mm.view.MMPAGView H;
    public android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.ImageView f231297J;
    public android.view.View K;
    public android.widget.TextView L;
    public android.widget.TextView M;
    public android.view.View N;
    public android.widget.TextView P;
    public android.widget.TextView Q;
    public android.view.View R;
    public android.view.View S;
    public com.tencent.mm.ui.widget.imageview.WeImageView T;
    public android.view.View U;
    public android.view.ViewGroup V;
    public android.view.ViewGroup W;
    public kotlinx.coroutines.r2 X;
    public kotlinx.coroutines.r2 Y;
    public kotlinx.coroutines.r2 Z;

    /* renamed from: l1, reason: collision with root package name */
    public long f231298l1;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231299m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f231300n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f231301o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f231302p;

    /* renamed from: p0, reason: collision with root package name */
    public android.animation.ObjectAnimator f231303p0;

    /* renamed from: p1, reason: collision with root package name */
    public final java.lang.String f231304p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f231305q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ScrollView f231306r;

    /* renamed from: s, reason: collision with root package name */
    public r45.e84 f231307s;

    /* renamed from: t, reason: collision with root package name */
    public final int f231308t;

    /* renamed from: u, reason: collision with root package name */
    public final long f231309u;

    /* renamed from: v, reason: collision with root package name */
    public final long f231310v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f231311w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f231312x;

    /* renamed from: x0, reason: collision with root package name */
    public final int f231313x0;

    /* renamed from: x1, reason: collision with root package name */
    public final java.lang.String f231314x1;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f231315y;

    /* renamed from: y0, reason: collision with root package name */
    public final long f231316y0;

    /* renamed from: y1, reason: collision with root package name */
    public if2.d0 f231317y1;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f231318z;

    /* renamed from: z1, reason: collision with root package name */
    public final jz5.g f231319z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231299m = "GiftFundingCardController";
        this.f231300n = "assets://finder_live_gift_single_click_crowfunding.pag";
        this.f231308t = 30;
        this.f231309u = 5000L;
        this.f231310v = 1500L;
        this.f231311w = jz5.h.b(new df2.f7(this));
        this.f231312x = jz5.h.b(new df2.e7(this));
        this.f231315y = jz5.h.b(df2.b7.f229786d);
        this.f231318z = jz5.h.b(new df2.c7(this));
        this.f231313x0 = 1;
        long longValue = ((java.lang.Number) ae2.in.f3688a.H().r()).longValue() * 1000;
        this.f231316y0 = longValue;
        this.f231298l1 = longValue;
        this.f231304p1 = "{$@";
        this.f231314x1 = "@$}";
        this.f231319z1 = jz5.h.b(new df2.o8(this));
        this.A1 = jz5.h.b(new df2.j7(this));
        this.B1 = df2.h7.f230307m;
        this.C1 = jz5.h.b(df2.d7.f229946d);
        this.D1 = jz5.h.b(df2.g7.f230203d);
        this.E1 = " ";
    }

    public static final void Z6(df2.s8 s8Var, java.lang.String str) {
        java.util.LinkedList list;
        r45.nz3 nz3Var;
        r45.e84 e84Var = s8Var.f231307s;
        if (e84Var == null || (list = e84Var.getList(2)) == null || (nz3Var = (r45.nz3) kz5.n0.Z(list)) == null) {
            return;
        }
        boolean z17 = nz3Var.getInteger(2) >= nz3Var.getInteger(1);
        com.tencent.mars.xlog.Log.i(s8Var.f231299m, "[" + str + "] after send funding gift, curSize:" + nz3Var.getInteger(2) + ", maxSize:" + nz3Var.getInteger(1) + ", status:" + s8Var.B1);
        if (z17) {
            df2.h7 h7Var = df2.h7.f230307m;
            df2.h7 h7Var2 = df2.h7.f230304g;
            if (kz5.z.G(new df2.h7[]{h7Var, h7Var2, df2.h7.f230306i, df2.h7.f230305h}, s8Var.B1)) {
                return;
            }
            s8Var.m7(h7Var2);
        }
    }

    public static final int a7(df2.s8 s8Var) {
        return ((java.lang.Number) ((jz5.n) s8Var.D1).getValue()).intValue();
    }

    @Override // vd2.j5
    public void C4() {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        df2.a9 a9Var = (df2.a9) controller(df2.a9.class);
        if (a9Var != null && (liveMutableData = a9Var.A) != null) {
            liveMutableData.postValue(java.lang.Boolean.TRUE);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[notify2Visible] hashCode = ");
        android.view.View view = this.f231301o;
        sb6.append(view != null ? java.lang.Integer.valueOf(view.hashCode()) : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f231299m;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if2.d0 d0Var = this.f231317y1;
        if (d0Var != null) {
            d0Var.d(0);
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[notify2Visible] end hashCode = ");
        android.view.View view2 = this.f231301o;
        sb8.append(view2 != null ? java.lang.Integer.valueOf(view2.hashCode()) : null);
        sb8.append(", visible = ");
        android.view.View view3 = this.f231301o;
        sb8.append(view3 != null ? java.lang.Integer.valueOf(view3.getVisibility()) : null);
        com.tencent.mars.xlog.Log.i(str, sb8.toString());
        k7(1);
        if (((mm2.c1) business(mm2.c1.class)).f328880s3 <= 0) {
            com.tencent.mm.plugin.finder.live.util.y.i(this, oz5.m.f350329d, kotlinx.coroutines.a1.DEFAULT, new df2.a8(this, null));
        }
        if (this.B1 == df2.h7.f230302e) {
            kotlinx.coroutines.r2 r2Var = this.Y;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            m7(df2.h7.f230301d);
        }
    }

    @Override // vd2.j5
    public java.lang.String Q() {
        return this.f231299m;
    }

    public final void b7() {
        com.tencent.mars.xlog.Log.i(this.f231299m, "[closedOnAnimFinish]");
        df2.a9 a9Var = (df2.a9) controller(df2.a9.class);
        if (a9Var != null) {
            r45.e84 e84Var = this.f231307s;
            java.lang.String string = e84Var != null ? e84Var.getString(5) : null;
            if (!(string == null || string.length() == 0)) {
                java.util.LinkedList linkedList = a9Var.f229697w;
                if (!linkedList.contains(string)) {
                    linkedList.add(string);
                }
            }
        }
        m7(df2.h7.f230306i);
    }

    public final int c7() {
        return ((java.lang.Number) ((jz5.n) this.f231318z).getValue()).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r1.getBoolean(8) == true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r3 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l d7() {
        /*
            r4 = this;
            df2.h7 r0 = r4.B1
            r45.e84 r1 = r4.f231307s
            r2 = 0
            if (r1 == 0) goto L16
            if (r1 == 0) goto L13
            r3 = 8
            boolean r1 = r1.getBoolean(r3)
            r3 = 1
            if (r1 != r3) goto L13
            goto L14
        L13:
            r3 = r2
        L14:
            if (r3 == 0) goto L18
        L16:
            df2.h7 r0 = df2.h7.f230307m
        L18:
            r45.e84 r1 = r4.f231307s
            if (r1 == 0) goto L2f
            r3 = 2
            java.util.LinkedList r1 = r1.getList(r3)
            if (r1 == 0) goto L2f
            java.lang.Object r1 = kz5.n0.Z(r1)
            r45.nz3 r1 = (r45.nz3) r1
            if (r1 == 0) goto L2f
            int r2 = r1.getInteger(r3)
        L2f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "[getCardStatus] status="
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r3 = ", curProgress="
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = r4.f231299m
            com.tencent.mars.xlog.Log.i(r3, r1)
            jz5.l r1 = new jz5.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.s8.d7():jz5.l");
    }

    public final int e7(r45.e84 e84Var) {
        int i17;
        if (e84Var == null) {
            return 0;
        }
        int e17 = c01.id.e();
        int integer = e84Var.getInteger(0);
        int integer2 = e84Var.getInteger(1);
        com.tencent.mars.xlog.Log.i(this.f231299m, "[getRestTime] curTime=" + e17 + ", startTime=" + integer + ", endTime=" + integer2);
        if (e17 < integer) {
            i17 = integer2 - integer;
            if (i17 < 0) {
                return 0;
            }
        } else if (e17 > integer2 || (i17 = integer2 - e17) < 0) {
            return 0;
        }
        return i17;
    }

    public final android.view.View f7() {
        java.util.LinkedList list;
        r45.nz3 nz3Var;
        java.util.LinkedList list2;
        r45.nz3 nz3Var2;
        android.view.View view = this.C;
        r45.e84 e84Var = this.f231307s;
        boolean z17 = true;
        if (!((e84Var == null || (list2 = e84Var.getList(2)) == null || (nz3Var2 = (r45.nz3) kz5.n0.Z(list2)) == null || nz3Var2.getInteger(3) != 0) ? false : true)) {
            r45.e84 e84Var2 = this.f231307s;
            if (!((e84Var2 == null || (list = e84Var2.getList(2)) == null || (nz3Var = (r45.nz3) kz5.n0.Z(list)) == null || nz3Var.getInteger(3) != 1) ? false : true)) {
                z17 = false;
            }
        }
        if (z17) {
            return view;
        }
        return null;
    }

    public final java.lang.String g7(int i17, int i18) {
        java.lang.String str;
        java.lang.String str2;
        int i19 = i17 - i18;
        if (i19 <= this.f231308t) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(i19);
            sb6.append('S');
            return sb6.toString();
        }
        int i27 = i19 / 60;
        if (i27 > 10) {
            str = java.lang.String.valueOf(i27);
        } else {
            str = "0" + i27;
        }
        int i28 = i19 - (i27 * 60);
        if (i28 < 0) {
            i28 = 0;
        }
        if (i28 > 10) {
            str2 = java.lang.String.valueOf(i28);
        } else {
            str2 = "0" + i28;
        }
        return str + ':' + str2;
    }

    public final boolean h7(r45.e84 e84Var) {
        r45.e84 e84Var2 = this.f231307s;
        return kotlin.jvm.internal.o.b(e84Var2 != null ? e84Var2.getString(5) : null, e84Var != null ? e84Var.getString(5) : null) && this.B1 == df2.h7.f230307m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r0 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i7(boolean r27) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.s8.i7(boolean):void");
    }

    public final void k7(int i17) {
        r45.nz3 nz3Var;
        if (zl2.r4.f473950a.w1()) {
            return;
        }
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f327216a2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        r45.e84 e84Var = this.f231307s;
        if (e84Var != null) {
            jSONObject.put("task_id", e84Var.getString(5));
            java.util.LinkedList list = e84Var.getList(2);
            if (list != null && (nz3Var = (r45.nz3) kz5.n0.Z(list)) != null) {
                jSONObject.put("gift_id", nz3Var.getString(0));
            }
        }
        ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void l7() {
        kotlinx.coroutines.r2 r2Var = this.X;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var2 = this.Y;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var3 = this.Z;
        if (r2Var3 != null) {
            kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
        }
        android.animation.ObjectAnimator objectAnimator = this.f231303p0;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        android.animation.ObjectAnimator objectAnimator2 = this.f231303p0;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.f231303p0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7(df2.h7 r27) {
        /*
            Method dump skipped, instructions count: 2320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.s8.m7(df2.h7):void");
    }

    public final void n7(android.widget.TextView textView, java.lang.String str, long j17, boolean z17) {
        int L = r26.n0.L(str, this.f231304p1, 0, false, 6, null);
        int L2 = r26.n0.L(str, this.f231314x1, 0, false, 6, null);
        if (L2 > L) {
            if (L >= 0 && L < str.length()) {
                if (L2 >= 0 && L2 < str.length()) {
                    java.lang.String substring = str.substring(this.f231304p1.length() + L, L2);
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    ce2.i iVar = (ce2.i) dk2.u7.f234185e.get(substring);
                    java.lang.String R0 = iVar != null ? iVar.R0() : null;
                    textView.setText(str);
                    if (R0 != null) {
                        java.lang.String str2 = R0.length() > 0 ? R0 : null;
                        if (str2 != null) {
                            android.text.SpannableString spannableString = new android.text.SpannableString(str);
                            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(str2, com.tencent.mm.plugin.finder.storage.y90.f128356f));
                            a17.f447873d = new df2.q8(this, spannableString, L, L2, textView, j17, z17);
                            a17.f();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        textView.setText(str);
        android.widget.TextView textView2 = this.E;
        if (textView2 != null) {
            textView2.invalidate();
            textView2.post(new df2.p7(textView2, this, j17, z17));
        }
    }

    @Override // vd2.j5
    public void o1() {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        android.view.View view;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[notify2Gone] begin hashCode = ");
        android.view.View view2 = this.f231301o;
        sb6.append(view2 != null ? java.lang.Integer.valueOf(view2.hashCode()) : null);
        sb6.append(", visibleBarrier = ");
        sb6.append(this.f231317y1);
        sb6.append(", visibleBarrier-View = ");
        if2.d0 d0Var = this.f231317y1;
        sb6.append((d0Var == null || (view = d0Var.f291105a) == null) ? null : java.lang.Integer.valueOf(view.hashCode()));
        sb6.append(", isBarrierOn = ");
        if2.d0 d0Var2 = this.f231317y1;
        sb6.append(d0Var2 != null ? java.lang.Boolean.valueOf(d0Var2.f291109e) : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f231299m;
        com.tencent.mars.xlog.Log.i(str, sb7);
        df2.a9 a9Var = (df2.a9) controller(df2.a9.class);
        if (a9Var != null && (liveMutableData = a9Var.A) != null) {
            liveMutableData.postValue(java.lang.Boolean.FALSE);
        }
        if2.d0 d0Var3 = this.f231317y1;
        if (d0Var3 != null) {
            d0Var3.d(8);
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[notify2Gone] end hashCode = ");
        android.view.View view3 = this.f231301o;
        sb8.append(view3 != null ? java.lang.Integer.valueOf(view3.hashCode()) : null);
        sb8.append(", visible = ");
        android.view.View view4 = this.f231301o;
        sb8.append(view4 != null ? java.lang.Integer.valueOf(view4.getVisibility()) : null);
        com.tencent.mars.xlog.Log.i(str, sb8.toString());
    }

    public final void o7() {
        android.view.View view = this.C;
        com.tencent.mm.plugin.finder.live.plugin.l R6 = R6(com.tencent.mm.plugin.finder.live.plugin.dq.class);
        if (view == null || R6 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f231299m, "[unRegisterSendAgainBtnView]");
        com.tencent.mm.plugin.finder.live.util.t tVar = ((com.tencent.mm.plugin.finder.live.plugin.dq) R6).N;
        if (tVar != null) {
            tVar.d(view);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup view) {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData diffMutableLiveData;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData diffMutableLiveData2;
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewMount(view);
        df2.a9 a9Var = (df2.a9) controller(df2.a9.class);
        if (a9Var != null && (diffMutableLiveData2 = a9Var.f229698x) != null) {
            com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
            kotlin.jvm.internal.o.e(ubVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
            diffMutableLiveData2.observe((com.tencent.mm.plugin.finder.live.view.k0) ubVar, new df2.i8(this));
        }
        df2.a9 a9Var2 = (df2.a9) controller(df2.a9.class);
        if (a9Var2 != null && (diffMutableLiveData = a9Var2.f229699y) != null) {
            diffMutableLiveData.f111660d = true;
            com.tencent.mm.plugin.finder.live.view.ub ubVar2 = this.f291099e;
            kotlin.jvm.internal.o.e(ubVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
            diffMutableLiveData.observe((com.tencent.mm.plugin.finder.live.view.k0) ubVar2, new df2.j8(this));
        }
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData2 = ((mm2.c1) business(mm2.c1.class)).f328886t3;
        liveMutableData2.f111660d = true;
        com.tencent.mm.plugin.finder.live.view.ub ubVar3 = this.f291099e;
        kotlin.jvm.internal.o.e(ubVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        liveMutableData2.observe((com.tencent.mm.plugin.finder.live.view.k0) ubVar3, new df2.k8(this));
        je2.t tVar = (je2.t) business(je2.t.class);
        if (tVar != null && (liveMutableData = tVar.f299270p) != null) {
            liveMutableData.f111660d = true;
            com.tencent.mm.plugin.finder.live.view.ub ubVar4 = this.f291099e;
            kotlin.jvm.internal.o.e(ubVar4, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
            liveMutableData.observe((com.tencent.mm.plugin.finder.live.view.k0) ubVar4, new df2.l8(this));
        }
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData3 = ((je2.h) business(je2.h.class)).f299233f;
        liveMutableData3.f111660d = true;
        com.tencent.mm.plugin.finder.live.view.ub ubVar5 = this.f291099e;
        kotlin.jvm.internal.o.e(ubVar5, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        liveMutableData3.observe((com.tencent.mm.plugin.finder.live.view.k0) ubVar5, new df2.m8(this));
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        com.tencent.mars.xlog.Log.i(this.f231299m, "[resetAllView]");
        this.f231301o = null;
        this.f231302p = null;
        this.f231305q = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.f231297J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.f231306r = null;
        this.f231317y1 = null;
        kotlinx.coroutines.r2 r2Var = this.X;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f231307s = null;
        m7(df2.h7.f230307m);
        o7();
    }

    @Override // vd2.j5
    public int priority() {
        return 1;
    }
}
