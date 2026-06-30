package df2;

/* loaded from: classes3.dex */
public final class ug extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231522m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f231523n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f231524o;

    /* renamed from: p, reason: collision with root package name */
    public if2.d0 f231525p;

    /* renamed from: q, reason: collision with root package name */
    public xs2.u f231526q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f231527r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f231528s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f231529t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Bitmap f231530u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f231531v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f231532w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231522m = "Finder.LiveDanmakuController";
        this.f231523n = jz5.h.b(df2.rg.f231246d);
        this.f231524o = jz5.h.b(new df2.eg(this, store));
        this.f231527r = jz5.h.b(df2.tg.f231440d);
        this.f231528s = jz5.h.b(df2.sg.f231339d);
        this.f231529t = jz5.h.b(df2.vf.f231600d);
        this.f231532w = jz5.h.b(df2.uf.f231521d);
    }

    public final void Z6(java.lang.String str, android.view.View view, boolean z17) {
        com.tencent.mm.plugin.finder.live.plugin.kh khVar;
        android.view.View view2;
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
        if (ubVar == null || (khVar = (com.tencent.mm.plugin.finder.live.plugin.kh) ubVar.getPlugin(com.tencent.mm.plugin.finder.live.plugin.kh.class)) == null || (view2 = khVar.f113249w) == null) {
            return;
        }
        java.lang.String str2 = this.f231522m;
        if (z17) {
            mm2.y1 P6 = ((mm2.j2) business(mm2.j2.class)).P6();
            if ((P6 != null ? P6.f329552a : null) == mm2.e2.f328998e) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = 0;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(" root final topMargin:");
                android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                sb6.append(marginLayoutParams2 != null ? java.lang.Integer.valueOf(marginLayoutParams2.topMargin) : null);
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                return;
            }
        }
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        int height = iArr[1] + view2.getHeight();
        if (height > 0) {
            android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.topMargin = (U6() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479731dn)) + height;
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(str);
        sb7.append(" root final topMargin:");
        android.view.ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
        sb7.append(marginLayoutParams4 != null ? java.lang.Integer.valueOf(marginLayoutParams4.topMargin) : null);
        sb7.append(",anchorBottomPoxY:");
        sb7.append(height);
        com.tencent.mars.xlog.Log.i(str2, sb7.toString());
    }

    public final void a7(java.lang.String str) {
        xs2.o oVar;
        if ((this.f231525p == null || this.f231526q == null) ? false : true) {
            return;
        }
        boolean U6 = U6();
        xs2.f0 a17 = xs2.f0.f456322d.a(((mm2.j2) business(mm2.j2.class)).R6(), ((mm2.j2) business(mm2.j2.class)).P6(), ((mm2.j2) business(mm2.j2.class)).f329161f);
        java.lang.String str2 = this.f231522m;
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e(str2, str + " checkInit but config is null");
            return;
        }
        mm2.j2 j2Var = (mm2.j2) business(mm2.j2.class);
        xp.a aVar = a17.f456328c;
        j2Var.W6(aVar != null ? aVar.f455810h : 1.0f);
        ((mm2.j2) business(mm2.j2.class)).Y6(aVar != null ? aVar.f455804b : 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" checkInit old config:");
        xs2.u uVar = this.f231526q;
        jz5.f0 f0Var = null;
        sb6.append((uVar == null || (oVar = uVar.f456388d) == null) ? null : ((xs2.e) oVar).f456316c);
        sb6.append("\nnew config:");
        sb6.append(a17);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        android.view.View T6 = T6(com.tencent.mm.R.id.i79, com.tencent.mm.R.id.i78);
        if (T6 == null) {
            com.tencent.mars.xlog.Log.e(str2, str + " init view but root view is null!");
            return;
        }
        int intValue = ((java.lang.Number) ae2.in.J3.r()).intValue();
        xs2.p pVar = intValue != 1 ? intValue != 2 ? intValue != 3 ? (xs2.p) T6.findViewById(com.tencent.mm.R.id.jfa) : (xs2.p) T6.findViewById(com.tencent.mm.R.id.jfa) : (xs2.p) T6.findViewById(com.tencent.mm.R.id.cq_) : (xs2.p) T6.findViewById(com.tencent.mm.R.id.cq8);
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e(str2, str + " init view but bullet view is null!");
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(str);
        sb7.append(" isLandscape:");
        sb7.append(U6);
        sb7.append(", initView bullet:");
        sb7.append(pVar.getView());
        sb7.append(" root origin topMargin:");
        android.view.ViewGroup.LayoutParams layoutParams = T6.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        sb7.append(marginLayoutParams != null ? java.lang.Integer.valueOf(marginLayoutParams.topMargin) : null);
        com.tencent.mars.xlog.Log.i(str2, sb7.toString());
        Z6(str, T6, U6);
        android.view.View findViewById = T6.findViewById(com.tencent.mm.R.id.b1w);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        pVar.setAnchorView(findViewById);
        xs2.u uVar2 = new xs2.u(getStore().getLiveRoomData(), pVar, a17, (yz5.p) ((jz5.n) this.f231524o).getValue());
        this.f231526q = uVar2;
        xs2.o oVar2 = uVar2.f456388d;
        if (oVar2 != null) {
            xs2.p pVar2 = uVar2.f456385a;
            pVar2.b(oVar2, null);
            android.view.View view = pVar2.getView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuAdapter", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuAdapter", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(uVar2.f456387c, "onAttach but manager is null!");
        }
        if2.d0 d0Var = new if2.d0(T6, this);
        this.f231525p = d0Var;
        d0Var.d(0);
    }

    public final java.lang.Runnable b7() {
        return (java.lang.Runnable) ((jz5.n) this.f231523n).getValue();
    }

    public final void c7(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i(this.f231522m, source.concat(" hide!"));
        xs2.u uVar = this.f231526q;
        if (uVar != null) {
            xs2.o oVar = uVar.f456388d;
            if (oVar != null) {
                ((xs2.e) oVar).n();
            }
            xs2.p pVar = uVar.f456385a;
            pVar.onDetach();
            android.view.View view = pVar.getView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuAdapter", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuAdapter", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if2.d0 d0Var = this.f231525p;
        if (d0Var != null) {
            d0Var.d(8);
        }
        com.tencent.mm.plugin.finder.view.oc ocVar = com.tencent.mm.plugin.finder.view.oc.f132781a;
        if (ocVar.b()) {
            pm0.v.C(b7());
            ocVar.a();
        }
        this.f231525p = null;
        this.f231526q = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if ((r8 != null && r8.getHeight() == r3) == false) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d7(byte[] r19) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ug.d7(byte[]):void");
    }

    public final synchronized void e7(java.lang.String source, boolean z17) {
        kotlin.jvm.internal.o.g(source, "source");
        if (z17) {
            a7(source);
        }
        f7(source);
        if (z17) {
            g7(source.concat("_updateConfig"));
        }
    }

    public final void f7(java.lang.String str) {
        xs2.o oVar;
        boolean z17 = (this.f231525p == null || this.f231526q == null) ? false : true;
        boolean U6 = U6();
        xs2.f0 a17 = xs2.f0.f456322d.a(((mm2.j2) business(mm2.j2.class)).R6(), ((mm2.j2) business(mm2.j2.class)).P6(), ((mm2.j2) business(mm2.j2.class)).f329161f);
        java.lang.String str2 = this.f231522m;
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e(str2, str + " updateConfig but create config null!");
            return;
        }
        android.view.View T6 = T6(com.tencent.mm.R.id.i79, com.tencent.mm.R.id.i78);
        if (T6 != null) {
            Z6(str, T6, U6);
        }
        xs2.u uVar = this.f231526q;
        xs2.f0 f0Var = null;
        if (uVar != null && (oVar = uVar.f456388d) != null) {
            f0Var = ((xs2.e) oVar).f456316c;
        }
        com.tencent.mars.xlog.Log.i(str2, str + " updateConfig hasInit:" + z17 + ", isLandscape:" + U6 + ", commentConfig:" + ((mm2.j2) business(mm2.j2.class)).P6() + ", cacheDanmakuConfig:" + f0Var + ", liveDanmakuConfig:" + a17);
        xs2.u uVar2 = this.f231526q;
        if (uVar2 != null) {
            xs2.o oVar2 = uVar2.f456388d;
            if (oVar2 != null) {
                ((xs2.e) oVar2).f456316c = a17;
            }
            if (oVar2 != null) {
                ((xs2.e) oVar2).k(U6);
            }
        }
        mm2.j2 j2Var = (mm2.j2) business(mm2.j2.class);
        xp.a aVar = a17.f456328c;
        j2Var.W6(aVar != null ? aVar.f455810h : 1.0f);
        ((mm2.j2) business(mm2.j2.class)).Y6(aVar != null ? aVar.f455804b : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[Catch: all -> 0x0074, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0011, B:8:0x0015, B:11:0x001d, B:13:0x003c, B:15:0x0043, B:17:0x004a, B:19:0x005f, B:20:0x0064, B:22:0x0068, B:23:0x006f, B:27:0x0022, B:28:0x0027, B:29:0x0028, B:31:0x002e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[Catch: all -> 0x0074, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0011, B:8:0x0015, B:11:0x001d, B:13:0x003c, B:15:0x0043, B:17:0x004a, B:19:0x005f, B:20:0x0064, B:22:0x0068, B:23:0x006f, B:27:0x0022, B:28:0x0027, B:29:0x0028, B:31:0x002e), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g7(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "LiveDanmaku_step2_"
            monitor-enter(r5)
            java.lang.Class<mm2.j2> r1 = mm2.j2.class
            androidx.lifecycle.c1 r1 = r5.business(r1)     // Catch: java.lang.Throwable -> L74
            mm2.j2 r1 = (mm2.j2) r1     // Catch: java.lang.Throwable -> L74
            mm2.y1 r2 = r1.f329173u     // Catch: java.lang.Throwable -> L74
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L39
            mm2.e2 r2 = r2.f329552a     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L39
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L28
            if (r2 != r3) goto L22
            java.util.List r1 = r1.Q6()     // Catch: java.lang.Throwable -> L74
            goto L3a
        L22:
            jz5.j r6 = new jz5.j     // Catch: java.lang.Throwable -> L74
            r6.<init>()     // Catch: java.lang.Throwable -> L74
            throw r6     // Catch: java.lang.Throwable -> L74
        L28:
            boolean r2 = r1.R6()     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L39
            jz5.g r1 = r1.f329167o     // Catch: java.lang.Throwable -> L74
            jz5.n r1 = (jz5.n) r1     // Catch: java.lang.Throwable -> L74
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L74
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L74
            goto L3a
        L39:
            r1 = r4
        L3a:
            if (r1 == 0) goto L72
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L74
            r2 = r2 ^ r3
            if (r2 == 0) goto L72
            r5.a7(r6)     // Catch: java.lang.Throwable -> L74
            xs2.u r2 = r5.f231526q     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L66
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L74
            r3.append(r6)     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = "tag"
            kotlin.jvm.internal.o.g(r6, r0)     // Catch: java.lang.Throwable -> L74
            xs2.o r0 = r2.f456388d     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L64
            xs2.i0 r0 = (xs2.i0) r0     // Catch: java.lang.Throwable -> L74
            r0.c(r1, r6)     // Catch: java.lang.Throwable -> L74
        L64:
            jz5.f0 r4 = jz5.f0.f302826a     // Catch: java.lang.Throwable -> L74
        L66:
            if (r4 != 0) goto L6f
            java.lang.String r6 = r5.f231522m     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = "LiveDanmaku_step2_updateDanmaku but adapter is null!"
            com.tencent.mars.xlog.Log.e(r6, r0)     // Catch: java.lang.Throwable -> L74
        L6f:
            r1.clear()     // Catch: java.lang.Throwable -> L74
        L72:
            monitor-exit(r5)
            return
        L74:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ug.g7(java.lang.String):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        com.tencent.mars.xlog.Log.i(this.f231522m, "onLiveActivate");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        g7("onLiveStart");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.gg(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.ig(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.lg(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.ng(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.pg(this, null), 3, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        c7("onViewUnmount");
    }
}
