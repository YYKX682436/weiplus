package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public class p1 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f121870e;

    /* renamed from: f, reason: collision with root package name */
    public final sp2.c4 f121871f;

    /* renamed from: g, reason: collision with root package name */
    public final sp2.k f121872g;

    /* renamed from: h, reason: collision with root package name */
    public tx2.s f121873h;

    /* renamed from: i, reason: collision with root package name */
    public final ml2.d f121874i;

    /* renamed from: m, reason: collision with root package name */
    public tp2.f f121875m;

    /* renamed from: n, reason: collision with root package name */
    public r45.qt2 f121876n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f121877o;

    public p1(android.content.Context context, sp2.c4 outsideEventListener, sp2.k outsideOperator) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(outsideEventListener, "outsideEventListener");
        kotlin.jvm.internal.o.g(outsideOperator, "outsideOperator");
        this.f121870e = context;
        this.f121871f = outsideEventListener;
        this.f121872g = outsideOperator;
        this.f121874i = new ml2.d();
        this.f121877o = jz5.h.b(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.c1(this));
    }

    public static final void n(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1 p1Var, in5.s0 s0Var, vp2.l lVar) {
        java.lang.String username;
        r45.oa2 oa2Var;
        r45.h32 h32Var;
        p1Var.getClass();
        cl0.g gVar = new cl0.g();
        gVar.s("Noticeid", (lVar == null || (oa2Var = lVar.f438935d) == null || (h32Var = (r45.h32) oa2Var.getCustom(0)) == null) ? null : h32Var.getString(4));
        gVar.s("style", java.lang.Integer.valueOf(lVar.f438939h ? 1 : 2));
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        p1Var.r("main_page_notice_card", gVar2, false);
        r45.oa2 oa2Var2 = lVar.f438935d;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) oa2Var2.getCustom(1);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) oa2Var2.getCustom(1);
        java.lang.String str = (finderContact2 == null || (username = finderContact2.getUsername()) == null) ? "" : username;
        r45.h32 h32Var2 = (r45.h32) oa2Var2.getCustom(0);
        r45.qt2 qt2Var = p1Var.f121876n;
        if (finderContact == null || h32Var2 == null || qt2Var == null) {
            return;
        }
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        boolean z17 = lVar.f438939h;
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.o1 o1Var = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.o1(p1Var, str, h32Var2);
        tx2.s sVar = p1Var.f121873h;
        if (sVar != null) {
            cl0.g gVar3 = new cl0.g();
            gVar3.o("style", z17 ? 1 : 2);
            sVar.f422646b = str;
            sVar.f422645a = 265;
            sVar.f422647c = activity;
            sVar.f422648d = qt2Var;
            sVar.f422649e = h32Var2;
            sVar.f422650f = 1L;
            sVar.f422651g = "";
            sVar.f422652h = 302;
            sVar.f422653i = o1Var;
            sVar.f422654j = gVar3;
        } else {
            sVar = new tx2.s(265, str, activity, qt2Var, h32Var2, 1L, "", 302, o1Var);
            p1Var.f121873h = sVar;
            cl0.g gVar4 = new cl0.g();
            gVar4.o("style", z17 ? 1 : 2);
            sVar.f422654j = gVar4;
        }
        tx2.n nVar = new tx2.n(sVar);
        p1Var.q().z(str, h32Var2, null);
        java.lang.String str2 = str;
        p1Var.q().A(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m1(s0Var, h32Var2, p1Var, nVar, lVar));
        p1Var.q().F = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.n1(h32Var2);
        p1Var.q().w();
        cl0.g gVar5 = new cl0.g();
        r45.ov2 a17 = zl2.t.a(h32Var2);
        gVar5.h("coupon_id", a17 != null ? a17.getString(1) : null);
        gVar5.o("style", lVar.f438939h ? 1 : 2);
        i95.m c17 = i95.n0.c(c50.c1.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c50.c1 c1Var = (c50.c1) c17;
        ml2.i5 i5Var = ml2.i5.f327570e;
        java.lang.String string = h32Var2.getString(3);
        java.lang.String str3 = string == null ? "" : string;
        java.lang.String string2 = h32Var2.getString(4);
        java.lang.String gVar6 = gVar5.toString();
        android.content.Context context2 = p1Var.f121870e;
        kotlin.jvm.internal.o.g(context2, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        c50.c1.l9(c1Var, i5Var, str2, 0L, 0, "265", null, null, null, null, str3, "", string2, gVar6, 0L, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n, null, 33248, null);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c6o;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r29, in5.c r30, int r31, int r32, boolean r33, java.util.List r34) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        p(holder);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) holder.p(com.tencent.mm.R.id.m8y);
        if (wxRecyclerView != null) {
            in5.o.b(wxRecyclerView, new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.j1(holder, this), com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.k1.f121752d);
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("Finder.HeadLivingListConvert", "#onViewRecycled holder=" + holder);
        o(holder);
    }

    public final void o(in5.s0 s0Var) {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        java.lang.Object obj = s0Var.f293124h;
        if (obj != null && (obj instanceof com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.b1)) {
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.b1 b1Var = (com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.b1) obj;
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = b1Var.f121585a;
            if (wxRecyclerView2 != null) {
                android.content.Context context = s0Var.f293121e;
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                wxRecyclerView2.setAdapter(new up2.f(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.HeadLivingItemConvertFactory((com.tencent.mm.ui.MMActivity) context, false, false, 0, false, 16, null), new java.util.ArrayList()));
            }
            sp2.b4 b4Var = b1Var.f121586b;
            if (b4Var != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AutoPlayCheck] REMOVE caller=");
                sb6.append(b4Var);
                sb6.append(", item.hashCode=");
                sb6.append(b1Var.f121589e);
                sb6.append(", size before=");
                sp2.c4 c4Var = this.f121871f;
                sb6.append(((java.util.ArrayList) c4Var.f410997a).size());
                com.tencent.mars.xlog.Log.i("Finder.HeadLivingListConvert", sb6.toString());
                ((java.util.ArrayList) c4Var.f410997a).remove(b4Var);
            }
            androidx.recyclerview.widget.w2 w2Var = b1Var.f121587c;
            if (w2Var != null && (wxRecyclerView = b1Var.f121585a) != null) {
                wxRecyclerView.V0(w2Var);
            }
            android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = b1Var.f121588d;
            if (activityLifecycleCallbacks != null) {
                android.content.Context applicationContext = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext();
                android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            }
        }
        s0Var.f293124h = null;
    }

    public final void p(in5.s0 s0Var) {
        if (this.f121876n == null || this.f121875m == null) {
            com.tencent.mars.xlog.Log.i("Finder.HeadLivingListConvert", "reportContext:" + this.f121876n + ", nearbyLiveViewItemClick:" + this.f121875m);
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f121875m = new tp2.f(V6, (com.tencent.mm.ui.MMActivity) context2, null, 0, this.f121872g);
            this.f121876n = V6;
        }
    }

    public final tx2.i0 q() {
        return (tx2.i0) ((jz5.n) this.f121877o).getValue();
    }

    public final void r(java.lang.String str, java.lang.String str2, boolean z17) {
        android.content.Context context = this.f121870e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar2.a((androidx.appcompat.app.AppCompatActivity) activity).a(rq2.w.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            rq2.w wVar = (rq2.w) a17;
            com.tencent.mars.xlog.Log.i("Finder.HeadLivingListConvert", "optionIconReport: " + z17);
            if (z17) {
                wVar.P6("", V6.getString(1), str, r26.i0.t(str2, ",", ";", false));
            } else {
                wVar.Q6(V6.getString(1), str, r26.i0.t(str2, ",", ";", false));
            }
        }
    }
}
