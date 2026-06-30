package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class be extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f112018p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f112019q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f112020r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.jc f112021s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f112022t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.sl f112023u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112018p = "FinderLiveCommentDanmakuSettingPlugin";
        this.f112019q = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.ud(root));
        this.f112020r = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.vd(root));
        this.f112022t = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.td(this));
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.nd(this, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 243) {
            ((mm2.e0) P0(mm2.e0.class)).f328970m.observe(this, (androidx.lifecycle.k0) ((jz5.n) this.f112022t).getValue());
        } else {
            if (ordinal != 245) {
                return;
            }
            t1();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        this.f112021s = null;
        com.tencent.mm.plugin.finder.live.widget.sl slVar = this.f112023u;
        if (slVar != null) {
            slVar.dismiss();
        }
        this.f112023u = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.g0) P0(mm2.g0.class)).U6();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public void m0(boolean z17) {
        if (z17) {
            return;
        }
        v1();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public void s(boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.finder.live.widget.sl slVar = this.f112023u;
            if (slVar != null) {
                if (slVar != null) {
                    slVar.dismiss();
                }
                com.tencent.mm.plugin.finder.live.plugin.mg mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) X0(com.tencent.mm.plugin.finder.live.plugin.mg.class);
                if (mgVar != null) {
                    mgVar.J1();
                }
                this.f112023u = null;
            }
        }
    }

    public final void t1() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        boolean x07 = x0();
        boolean booleanValue = ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.j2) P0(mm2.j2.class)).f329166n).getValue()).booleanValue();
        boolean a17 = com.tencent.mm.plugin.finder.assist.o0.f102420a.a(S0());
        boolean P6 = ((mm2.e0) P0(mm2.e0.class)).P6();
        com.tencent.mars.xlog.Log.i(this.f112018p, "checkDanmaku isLandscape:" + x07 + ",isEnableCommentFloatMsg:" + booleanValue + ",isBoxLive:" + a17 + ",inBox:" + P6 + '!');
        boolean z17 = false;
        if (x07 && booleanValue && ((!a17 || !P6) && ((mm2.g0) P0(mm2.g0.class)).U6())) {
            jz5.g gVar = this.f112019q;
            android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
            if (view != null) {
                ym5.a1.h(view, new com.tencent.mm.plugin.finder.live.plugin.od(this));
            }
            K0(0);
            android.view.View view2 = (android.view.View) ((jz5.n) gVar).getValue();
            if (view2 != null) {
                view2.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.pd(this));
            }
            android.view.View view3 = (android.view.View) ((jz5.n) gVar).getValue();
            int i17 = ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) w1()).getValue()).booleanValue() ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentDanmakuSettingPlugin", "checkDanmaku", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentDanmakuSettingPlugin", "checkDanmaku", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View u17 = u1();
            if (u17 != null && (weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) u17.findViewById(com.tencent.mm.R.id.thy)) != null) {
                weImageView.setImageResource(((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) w1()).getValue()).booleanValue() ? com.tencent.mm.R.raw.bullet_screen_on_filled : com.tencent.mm.R.raw.bullet_screen_off_filled);
            }
            android.view.View u18 = u1();
            if (u18 != null) {
                u18.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.qd(this));
            }
            android.view.View u19 = u1();
            if (u19 != null) {
                u19.post(new com.tencent.mm.plugin.finder.live.plugin.rd(this));
            }
        } else {
            K0(8);
        }
        mm2.j2 j2Var = (mm2.j2) P0(mm2.j2.class);
        if (((mm2.j2) P0(mm2.j2.class)).D || (x07 && booleanValue)) {
            z17 = true;
        }
        j2Var.X6(z17);
    }

    public final android.view.View u1() {
        return (android.view.View) ((jz5.n) this.f112020r).getValue();
    }

    public final void v1() {
        android.view.ViewGroup viewGroup = this.f365323d;
        if (viewGroup.getVisibility() == 0 && !((mm2.c1) P0(mm2.c1.class)).N1) {
            mm2.v1 v1Var = mm2.j2.F;
            if (gm0.j1.u().c().m(mm2.j2.f329160J, null) == null) {
                android.content.Context context = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.finder.live.widget.sl slVar = new com.tencent.mm.plugin.finder.live.widget.sl(context);
                java.lang.String string = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.opw);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                slVar.c(string);
                slVar.f119807k = -855638017;
                slVar.f119806j = -12566464;
                android.view.View u17 = u1();
                kotlin.jvm.internal.o.f(u17, "<get-danmakuSwitchLayout>(...)");
                slVar.f119800d = u17;
                slVar.f119799c = 3000L;
                slVar.f119798b.setMaxWidth(es.h.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 300));
                slVar.f119808l = com.tencent.mm.plugin.finder.live.widget.kl.f118844d;
                slVar.f119809m = 132;
                slVar.f119802f = com.tencent.mm.plugin.finder.live.plugin.yd.f115186d;
                slVar.f119803g = new com.tencent.mm.plugin.finder.live.plugin.zd(this);
                slVar.f119801e = new com.tencent.mm.plugin.finder.live.plugin.ae(this);
                slVar.b();
                slVar.d(R0().getViewScope());
                this.f112023u = slVar;
                com.tencent.mm.plugin.finder.live.plugin.mg mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) X0(com.tencent.mm.plugin.finder.live.plugin.mg.class);
                if (mgVar != null) {
                    mgVar.C1().setAlpha(0.3f);
                }
            }
        }
    }

    public final kotlinx.coroutines.flow.j2 w1() {
        return ((mm2.j2) S0().a(mm2.j2.class)).f329165m;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.xd(this, null), 3, null);
    }
}
