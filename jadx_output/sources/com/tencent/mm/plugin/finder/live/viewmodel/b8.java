package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class b8 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public qo0.c f116936d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.l f116937e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f116938f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f116939g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f116940h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f116941i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f116942m;

    /* renamed from: n, reason: collision with root package name */
    public az2.f f116943n;

    /* renamed from: o, reason: collision with root package name */
    public gk2.e f116944o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f116945p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.viewmodel.d6 f116946q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f116947r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f116948s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f116949t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.assist.FinderGameEventListener f116950u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f116951v;

    /* renamed from: w, reason: collision with root package name */
    public yl2.g1 f116952w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f116953x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f116954y;

    /* renamed from: z, reason: collision with root package name */
    public int f116955z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f116946q = com.tencent.mm.plugin.finder.live.viewmodel.d6.f117034d;
        this.f116948s = jz5.h.b(new com.tencent.mm.plugin.finder.live.viewmodel.h7(this));
        this.f116949t = jz5.h.b(new com.tencent.mm.plugin.finder.live.viewmodel.q6(this));
        this.f116951v = jz5.h.b(new com.tencent.mm.plugin.finder.live.viewmodel.x6(activity));
        this.f116954y = jz5.h.b(new com.tencent.mm.plugin.finder.live.viewmodel.y7(this));
        this.f116955z = -1;
    }

    public static final void O6(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "adjustTopContainerMargin, " + com.tencent.mm.ui.bl.h(b8Var.getActivity()));
        android.widget.RelativeLayout relativeLayout = b8Var.f116939g;
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout != null ? relativeLayout.getLayoutParams() : null;
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = ((int) b8Var.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv)) + com.tencent.mm.ui.bl.h(b8Var.getActivity());
        android.widget.RelativeLayout relativeLayout2 = b8Var.f116939g;
        if (relativeLayout2 == null) {
            return;
        }
        relativeLayout2.setLayoutParams(marginLayoutParams);
    }

    public static final void P6(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var) {
        java.lang.String str;
        yg2.b bVar;
        yl2.g1 g1Var = b8Var.f116952w;
        if (g1Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLivePostUIC", "collectAuthRequirementsAfterRefresh: postHelper is null");
            return;
        }
        mm2.s1 s1Var = (mm2.s1) dk2.ef.f233372a.i(mm2.s1.class);
        int i17 = s1Var != null ? s1Var.f329392o : -1;
        if (s1Var == null || (str = s1Var.f329393p) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        boolean d17 = yl2.g1.f463007g.d();
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "collectAuthRequirementsAfterRefresh: userFlag=" + i17);
        gk2.e eVar = dk2.ef.I;
        if (eVar == null || (bVar = eVar.f272475i) == null) {
            return;
        }
        kotlinx.coroutines.l.d(bVar, null, null, new com.tencent.mm.plugin.finder.live.viewmodel.p6(g1Var, i17, str2, d17, b8Var, null), 3, null);
    }

    public static final void Q6(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var, yl2.m mVar) {
        yg2.b bVar;
        yl2.g1 g1Var = b8Var.f116952w;
        if (g1Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLivePostUIC", "handleRealnameAuth: postHelper is null");
            return;
        }
        gk2.e eVar = dk2.ef.I;
        if (eVar == null || (bVar = eVar.f272475i) == null) {
            return;
        }
        kotlinx.coroutines.l.d(bVar, null, null, new com.tencent.mm.plugin.finder.live.viewmodel.v6(mVar, g1Var, b8Var, null), 3, null);
    }

    public static final void f7(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var, boolean z17, boolean z18) {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var;
        yg2.b bVar;
        yg2.c checkActiveAndGet;
        yf2.z zVar;
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
        boolean z19 = false;
        if (e1Var != null && e1Var.g7()) {
            z19 = true;
        }
        if (!z19 && !b8Var.W6() && !z17 && !z18 && !ko0.l.f309870a.c()) {
            db5.e1.A(b8Var.getContext(), b8Var.getContext().getString(com.tencent.mm.R.string.mi_), "", b8Var.getContext().getString(com.tencent.mm.R.string.mib), b8Var.getContext().getString(com.tencent.mm.R.string.mia), new com.tencent.mm.plugin.finder.live.viewmodel.i7(z17, b8Var), com.tencent.mm.plugin.finder.live.viewmodel.j7.f117167d);
            com.tencent.mm.plugin.finder.live.plugin.l lVar = b8Var.f116937e;
            if (lVar == null || (zVar = (yf2.z) lVar.U0(yf2.z.class)) == null) {
                return;
            }
            zVar.a7(true);
            return;
        }
        zn0.y yVar = zn0.x.f474414a;
        int size = yVar.f474415a.size();
        yVar.f474416b = 1;
        yVar.f474417c = size;
        if ((!b8Var.W6() || z17) && (k0Var = dk2.ef.f233380e) != null) {
            qo0.c.a(k0Var, qo0.b.f365381m, null, 2, null);
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = dk2.ef.f233380e;
        if (k0Var2 != null && (checkActiveAndGet = k0Var2.checkActiveAndGet()) != null) {
            kotlinx.coroutines.l.b(checkActiveAndGet, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.live.viewmodel.m7(b8Var, null), 2, null);
        }
        gk2.e eVar = dk2.ef.I;
        if (eVar == null || (bVar = eVar.f272475i) == null) {
            return;
        }
        kotlinx.coroutines.l.d(bVar, null, null, new com.tencent.mm.plugin.finder.live.viewmodel.o7(b8Var, z17, null), 3, null);
    }

    public static final void g7(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var) {
        yf2.z zVar;
        yf2.z zVar2;
        kotlinx.coroutines.flow.j2 j2Var;
        r45.n73 n73Var;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = b8Var.f116937e;
        r45.z53 z53Var = (lVar == null || (j2Var = ((mm2.g1) lVar.P0(mm2.g1.class)).f329071i) == null || (n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) j2Var).getValue()) == null) ? null : (r45.z53) n73Var.getCustom(1);
        if (z53Var == null) {
            com.tencent.mm.plugin.finder.live.plugin.l lVar2 = b8Var.f116937e;
            if (lVar2 != null && (zVar2 = (yf2.z) lVar2.U0(yf2.z.class)) != null) {
                zVar2.a7(true);
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "#screenCastGameModeWayExecute ScreenCastGameMode appInfo is null");
            return;
        }
        java.lang.String string = z53Var.getString(1);
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = z53Var.getString(4);
        java.lang.String str = string2 != null ? string2 : "";
        boolean b17 = com.tencent.mm.plugin.finder.assist.b3.f102022a.b(b8Var.getContext(), str);
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "#screenCastGameModeWayExecute screen cast game mode appName=" + string + " pkgName=" + str + " isInstalled=" + b17);
        if (!(str.length() > 0) || b17) {
            com.tencent.mm.plugin.finder.live.view.rc rcVar = new com.tencent.mm.plugin.finder.live.view.rc(b8Var.getContext(), null, 2, null);
            rcVar.f116661m = com.tencent.mm.plugin.finder.live.viewmodel.r7.f117365d;
            rcVar.f116659h = new com.tencent.mm.plugin.finder.live.viewmodel.s7(b8Var);
            rcVar.f116660i = new com.tencent.mm.plugin.finder.live.viewmodel.u7(b8Var, z53Var);
            rcVar.w();
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).mj(5);
            return;
        }
        if (com.tencent.mm.plugin.finder.assist.x2.f102673b == 18) {
            com.tencent.mm.plugin.finder.assist.x2.f102672a.b(7);
        }
        db5.e1.A(b8Var.getContext(), b8Var.getContext().getString(com.tencent.mm.R.string.f3_, string), "", b8Var.getContext().getString(com.tencent.mm.R.string.f490507x1), b8Var.getContext().getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.finder.live.viewmodel.p7(b8Var, z53Var), com.tencent.mm.plugin.finder.live.viewmodel.q7.f117346d);
        com.tencent.mm.plugin.finder.live.plugin.l lVar3 = b8Var.f116937e;
        if (lVar3 == null || (zVar = (yf2.z) lVar3.U0(yf2.z.class)) == null) {
            return;
        }
        zVar.a7(true);
    }

    public final void R6() {
        yf2.z0 z0Var;
        android.content.Intent intent;
        com.tencent.mm.plugin.finder.live.plugin.l lVar;
        yf2.z0 z0Var2;
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "afterSelectTagOperation");
        gk2.e eVar = this.f116944o;
        if (eVar != null) {
            if (Y6() && (lVar = this.f116937e) != null && (z0Var2 = (yf2.z0) lVar.U0(yf2.z0.class)) != null) {
                com.tencent.mm.plugin.finder.live.util.y.o(z0Var2, null, null, new yf2.y0(z0Var2, null), 3, null);
            }
            com.tencent.mm.plugin.finder.live.plugin.l lVar2 = this.f116937e;
            if (lVar2 == null || (z0Var = (yf2.z0) lVar2.U0(yf2.z0.class)) == null) {
                return;
            }
            boolean z17 = !Y6();
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostLocationWidget", "#setIsCanSelectNone isCanSelectNone=" + z17);
            com.tencent.mm.ui.MMActivity N6 = z0Var.N6();
            if (N6 == null || (intent = N6.getIntent()) == null) {
                return;
            }
            intent.putExtra("poi_show_none", z17);
        }
    }

    public final void S6() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "checkState state:" + this.f116946q);
        if (this.f116946q == com.tencent.mm.plugin.finder.live.viewmodel.d6.f117034d) {
            android.view.View view = this.f116942m;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC", "checkState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC", "checkState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f116942m;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC", "checkState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC", "checkState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final com.tencent.mm.plugin.finder.live.widget.u70 T6() {
        return (com.tencent.mm.plugin.finder.live.widget.u70) ((jz5.n) this.f116949t).getValue();
    }

    public final ya2.b2 U6() {
        gk2.e eVar = this.f116944o;
        if (eVar != null) {
            return ((mm2.c1) eVar.a(mm2.c1.class)).J4;
        }
        return null;
    }

    public final void V6(int i17) {
        yg2.b bVar;
        yl2.g1 g1Var = this.f116952w;
        if (g1Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "handleBlockedAuth: liveVerify error, errCode=" + i17);
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar == null || (bVar = eVar.f272475i) == null) {
            return;
        }
        kotlinx.coroutines.l.d(bVar, null, null, new com.tencent.mm.plugin.finder.live.viewmodel.t6(g1Var, i17, null), 3, null);
    }

    public final boolean W6() {
        kotlinx.coroutines.flow.j2 j2Var;
        zl2.r4 r4Var = zl2.r4.f473950a;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f116937e;
        return r4Var.T1((lVar == null || (j2Var = ((mm2.g1) lVar.P0(mm2.g1.class)).f329068f) == null) ? null : (r45.q12) ((kotlinx.coroutines.flow.h3) j2Var).getValue());
    }

    public final boolean X6() {
        kotlinx.coroutines.flow.j2 j2Var;
        r45.n73 n73Var;
        r45.z53 z53Var;
        java.util.LinkedList list;
        kotlinx.coroutines.flow.j2 j2Var2;
        zl2.r4 r4Var = zl2.r4.f473950a;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f116937e;
        java.lang.Object obj = null;
        if (!r4Var.T1((lVar == null || (j2Var2 = ((mm2.g1) lVar.P0(mm2.g1.class)).f329068f) == null) ? null : (r45.q12) ((kotlinx.coroutines.flow.h3) j2Var2).getValue())) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.plugin.l lVar2 = this.f116937e;
        if (lVar2 != null && (j2Var = ((mm2.g1) lVar2.P0(mm2.g1.class)).f329071i) != null && (n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) j2Var).getValue()) != null && (z53Var = (r45.z53) n73Var.getCustom(1)) != null && (list = z53Var.getList(19)) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                java.lang.Integer num = (java.lang.Integer) next;
                if (num != null && num.intValue() == 3) {
                    obj = next;
                    break;
                }
            }
            obj = (java.lang.Integer) obj;
        }
        return obj != null;
    }

    public final boolean Y6() {
        kotlinx.coroutines.flow.j2 j2Var;
        r45.fd2 fd2Var;
        gk2.e eVar = this.f116944o;
        return (eVar == null || (j2Var = ((mm2.g1) eVar.a(mm2.g1.class)).f329072m) == null || (fd2Var = (r45.fd2) ((kotlinx.coroutines.flow.h3) j2Var).getValue()) == null || fd2Var.getInteger(5) != 1) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x011d, code lost:
    
        if ((r3 != null && r3.T6()) != false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x00ec, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        if (r3 == 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x00ea, code lost:
    
        if (r10 != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ee, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0330  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Z6() {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.b8.Z6():void");
    }

    public final void a7() {
        yf2.z zVar;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f116937e;
        if (lVar == null || (zVar = (yf2.z) lVar.U0(yf2.z.class)) == null) {
            return;
        }
        zVar.a7(true);
    }

    public final void b7(yz5.a aVar) {
        yg2.b bVar;
        yl2.g1 g1Var = this.f116952w;
        if (g1Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLivePostUIC", "refreshUserFlagAndHandle: postHelper is null, skip check");
            aVar.invoke();
            return;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null && (bVar = eVar.f272475i) != null) {
            kotlinx.coroutines.l.d(bVar, null, null, new com.tencent.mm.plugin.finder.live.viewmodel.c7(g1Var, aVar, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.e("Finder.FinderLivePostUIC", "refreshUserFlagAndHandle: liveScope is null, skip check");
            aVar.invoke();
        }
    }

    public final void c7(boolean z17) {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((qm2.u) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(qm2.u.class)).O6(z17);
    }

    public final void d7(yf2.j2 j2Var, yl2.m mVar) {
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f116937e;
        com.tencent.mm.plugin.finder.live.viewmodel.f7 f7Var = null;
        yf2.s0 s0Var = lVar != null ? (yf2.s0) lVar.U0(yf2.s0.class) : null;
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "showLicenseBottomSheet: showMode=" + j2Var + ", authReq=" + mVar);
        if (s0Var != null) {
            com.tencent.mm.plugin.finder.live.viewmodel.d7 d7Var = new com.tencent.mm.plugin.finder.live.viewmodel.d7(this);
            com.tencent.mm.plugin.finder.live.viewmodel.e7 e7Var = com.tencent.mm.plugin.finder.live.viewmodel.e7.f117078d;
            if (j2Var == yf2.j2.f461732f && mVar != null) {
                f7Var = new com.tencent.mm.plugin.finder.live.viewmodel.f7(this, mVar);
            }
            s0Var.g7(d7Var, e7Var, f7Var, j2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x018a, code lost:
    
        if (r5 == false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e7() {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.b8.e7():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x03c2, code lost:
    
        if ((r0 != null && r0.Y6()) != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0189, code lost:
    
        if (r9.f364716b < ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.K4).getValue()).r()).intValue()) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h7() {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.b8.h7():void");
    }

    public final void i7() {
        pk2.j9 j9Var;
        com.tencent.mm.plugin.finder.live.widget.e5 e5Var;
        yf2.m1 m1Var;
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var != null && e1Var.Y6()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "Auto filling chat live params:");
            com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f116937e;
            if (lVar != null && (m1Var = (yf2.m1) lVar.U0(yf2.m1.class)) != null) {
                r45.q12 q12Var = new r45.q12();
                q12Var.set(0, 1);
                q12Var.set(1, 1);
                m1Var.e7(q12Var);
            }
            gk2.e eVar = this.f116944o;
            if (eVar != null) {
                int i17 = (int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q;
                java.util.regex.Pattern pattern = pm0.v.f356802a;
                int i18 = i17 | 64;
                ((mm2.c1) eVar.a(mm2.c1.class)).p8(i18);
                long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0);
                long j18 = ((mm2.e1) eVar.a(mm2.e1.class)).f328983m;
                dk2.xf k17 = efVar.k(eVar);
                if (k17 != null) {
                    dk2.xf.e(k17, j17, j18, i18, 0, false, null, 32, null);
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "Link mic enabled by default, flag changed from " + i17 + " to " + i18);
            }
            java.lang.String string = getContext().getString(com.tencent.mm.R.string.opq);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            mm2.g1 g1Var = (mm2.g1) efVar.i(mm2.g1.class);
            kotlinx.coroutines.flow.j2 j2Var = g1Var != null ? g1Var.f329076q : null;
            if (j2Var != null) {
                ((kotlinx.coroutines.flow.h3) j2Var).k(string);
            }
            mm2.g1 g1Var2 = (mm2.g1) efVar.i(mm2.g1.class);
            kotlinx.coroutines.flow.j2 j2Var2 = g1Var2 != null ? g1Var2.f329077r : null;
            if (j2Var2 != null) {
                ((kotlinx.coroutines.flow.h3) j2Var2).k("");
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "Description updated: ".concat(string));
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "Chat live params auto-filled successfully");
        }
        h7();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pk2.o9 o9Var = ((com.tencent.mm.plugin.finder.live.viewmodel.s5) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.live.viewmodel.s5.class)).f117394d;
        if (o9Var == null || (j9Var = o9Var.f356084g) == null || (e5Var = j9Var.f355886b) == null) {
            return;
        }
        e5Var.f118226a.i();
        e5Var.f118227b.f118003J = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "onActivityResult requestCode:" + i17 + ", resultCode:" + i18);
        if (i18 == -1 && i17 == 1003) {
            boolean z17 = false;
            if (intent != null && intent.getBooleanExtra("KEY_START_LIVE", false)) {
                z17 = true;
            }
            if (!z17) {
                R6();
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "onActivityResult REQUEST_CODE_SELECT_TAG startLive by selected tag result");
                h7();
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        gm0.j1.d().a(5874, this);
        rh2.j jVar = rh2.j.f395654a;
        ((ku5.t0) ku5.t0.f312615d).r(rh2.i.f395653d, "kws-prefetch");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        yf2.z0 z0Var;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f116937e;
        if (lVar != null && (z0Var = (yf2.z0) lVar.U0(yf2.z0.class)) != null) {
            z0Var.f461825n = true;
        }
        gm0.j1.d().q(5874, this);
        com.tencent.mm.plugin.finder.assist.FinderGameEventListener finderGameEventListener = this.f116950u;
        if (finderGameEventListener != null) {
            finderGameEventListener.dead();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        if (i17 == 80) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "onRequestPermissionsResult microphone granted");
                e7();
                return;
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "FinderLive request permission " + i17 + " failed");
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
            u1Var.u(getContext().getResources().getString(com.tencent.mm.R.string.f491748e42));
            u1Var.g(getContext().getResources().getString(com.tencent.mm.R.string.f491747e41));
            u1Var.n(getContext().getResources().getString(com.tencent.mm.R.string.f491746e40));
            u1Var.l(com.tencent.mm.plugin.finder.live.viewmodel.g7.f117116a);
            u1Var.q(false);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        gk2.e eVar;
        dk2.p Z6;
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        gk2.e eVar2;
        dk2.p Z62;
        com.tencent.mm.plugin.finder.live.plugin.h8 h8Var;
        te2.j0 j0Var;
        com.tencent.mm.plugin.finder.live.plugin.h8 h8Var2;
        te2.j0 j0Var2;
        android.widget.RelativeLayout relativeLayout = this.f116939g;
        if (relativeLayout != null) {
            relativeLayout.post(new com.tencent.mm.plugin.finder.live.viewmodel.a7(this));
        }
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        if ((c1Var != null && c1Var.a8()) || (eVar = this.f116944o) == null || (Z6 = ((mm2.c1) eVar.a(mm2.c1.class)).Z6()) == null || (arrayList = Z6.f233877f) == null) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((dk2.vg) obj).f234255b == 2) {
                    break;
                }
            }
        }
        dk2.vg vgVar = (dk2.vg) obj;
        if (vgVar == null || (eVar2 = this.f116944o) == null || (Z62 = ((mm2.c1) eVar2.a(mm2.c1.class)).Z6()) == null) {
            return;
        }
        int i17 = Z62.f233875d;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null && (h8Var2 = (com.tencent.mm.plugin.finder.live.plugin.h8) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.h8.class)) != null && (j0Var2 = h8Var2.f112785q) != null) {
            ((te2.p1) j0Var2).p(vgVar, i17);
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = dk2.ef.f233380e;
        if (k0Var2 == null || (h8Var = (com.tencent.mm.plugin.finder.live.plugin.h8) k0Var2.getPlugin(com.tencent.mm.plugin.finder.live.plugin.h8.class)) == null || (j0Var = h8Var.f112785q) == null) {
            return;
        }
        te2.j0.N4(j0Var, null, 1, null);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        if (!this.f116945p) {
            gk2.e eVar = this.f116944o;
            boolean z17 = false;
            if (!(eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).a8())) {
                mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
                if (e1Var != null && e1Var.Y6()) {
                    z17 = true;
                }
                if (z17) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStart: auto-starting chat mode, isStartingLiveChat=");
                    sb6.append(this.f116945p);
                    sb6.append(", isLiveStarted=");
                    gk2.e eVar2 = this.f116944o;
                    sb6.append(eVar2 != null ? java.lang.Boolean.valueOf(((mm2.c1) eVar2.a(mm2.c1.class)).a8()) : null);
                    com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", sb6.toString());
                    this.f116945p = true;
                    i7();
                    return;
                }
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onStart: skip auto-start, isStartingLiveChat=");
        sb7.append(this.f116945p);
        sb7.append(", isLiveStarted=");
        gk2.e eVar3 = this.f116944o;
        sb7.append(eVar3 != null ? java.lang.Boolean.valueOf(((mm2.c1) eVar3.a(mm2.c1.class)).a8()) : null);
        sb7.append(", isChatInteractionMode=");
        mm2.e1 e1Var2 = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
        sb7.append(e1Var2 != null ? java.lang.Boolean.valueOf(e1Var2.Y6()) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", sb7.toString());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        dk2.p Z6;
        java.util.ArrayList arrayList;
        gk2.e eVar;
        dk2.p Z62;
        com.tencent.mm.plugin.finder.live.plugin.h8 h8Var;
        te2.j0 j0Var;
        com.tencent.mm.plugin.finder.live.plugin.h8 h8Var2;
        te2.j0 j0Var2;
        super.onStop();
        gk2.e eVar2 = this.f116944o;
        if (eVar2 != null && ((mm2.c1) eVar2.a(mm2.c1.class)).f328778a5) {
            gk2.e eVar3 = this.f116944o;
            if ((eVar3 == null || ((mm2.e1) eVar3.a(mm2.e1.class)).f7()) ? false : true) {
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                java.lang.Object obj = null;
                if (k0Var != null && (h8Var2 = (com.tencent.mm.plugin.finder.live.plugin.h8) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.h8.class)) != null && (j0Var2 = h8Var2.f112785q) != null) {
                    qo0.c.a(((te2.p1) j0Var2).f418288f, qo0.b.f365392o2, null, 2, null);
                }
                gk2.e eVar4 = this.f116944o;
                if (eVar4 == null || (Z6 = ((mm2.c1) eVar4.a(mm2.c1.class)).Z6()) == null || (arrayList = Z6.f233877f) == null) {
                    return;
                }
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (((dk2.vg) next).f234255b == 1) {
                        obj = next;
                        break;
                    }
                }
                dk2.vg vgVar = (dk2.vg) obj;
                if (vgVar == null || (eVar = this.f116944o) == null || (Z62 = ((mm2.c1) eVar.a(mm2.c1.class)).Z6()) == null) {
                    return;
                }
                int i17 = Z62.f233875d;
                com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = dk2.ef.f233380e;
                if (k0Var2 == null || (h8Var = (com.tencent.mm.plugin.finder.live.plugin.h8) k0Var2.getPlugin(com.tencent.mm.plugin.finder.live.plugin.h8.class)) == null || (j0Var = h8Var.f112785q) == null) {
                    return;
                }
                ((te2.p1) j0Var).i(vgVar, i17);
            }
        }
    }
}
