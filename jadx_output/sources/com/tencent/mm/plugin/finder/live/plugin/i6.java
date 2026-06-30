package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class i6 implements com.tencent.mm.plugin.finder.live.plugin.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f112919d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f112920e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f112921f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f112922g;

    /* renamed from: h, reason: collision with root package name */
    public final cm2.t f112923h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f112924i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.ViewGroup f112925m;

    /* renamed from: n, reason: collision with root package name */
    public kotlinx.coroutines.r2 f112926n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f112927o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f112928p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f112929q;

    public i6(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin, yz5.l lVar, cm2.t tVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f112919d = context;
        this.f112920e = buContext;
        this.f112921f = statusMonitor;
        this.f112922g = basePlugin;
        this.f112923h = tVar;
        this.f112924i = "FinderLiveAnchorInviteMicBubble";
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dkj, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f112925m = viewGroup;
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.odb);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f482335bp);
        kotlin.jvm.internal.o.d(textView2);
        com.tencent.mm.ui.fk.a(textView2);
        this.f112927o = textView2;
        this.f112928p = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.e6(this));
        d();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public cm2.t A() {
        return this.f112923h;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void U() {
    }

    public final void a() {
        this.f112929q = false;
        kotlinx.coroutines.r2 r2Var = this.f112926n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        ((mm2.i5) this.f112920e.a(mm2.i5.class)).f329140f.postValue(null);
    }

    public final void b(r45.ih1 ih1Var) {
        java.lang.String str = this.f112924i;
        com.tencent.mars.xlog.Log.i(str, "SHEET_MORE_ACTION_AUDIO_LINK");
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f112922g;
        if (((mm2.o4) lVar.P0(mm2.o4.class)).f329327v.size() >= 8) {
            com.tencent.mars.xlog.Log.i(str, "skip apply mic, disable mic");
            android.content.Context context = this.f112919d;
            db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.m38), 0).show();
            return;
        }
        fj2.j jVar = fj2.j.f263174a;
        java.lang.String str2 = this.f112924i;
        android.content.Context context2 = this.f112925m.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        if (jVar.d(str2, context2, this.f112921f, this.f112922g, ih1Var.getInteger(1), lVar.Z0(), 1, null)) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_TYPE", 1);
            bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", ih1Var.getInteger(1));
            bundle.putBoolean("PARAM_FINDER_LIVE_LINK_MIC_CAN_AUTO_LINK", true);
            bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_SOURCE", 4);
            this.f112921f.statusChange(qo0.b.F3, bundle);
        }
        a();
    }

    public final void c(cm2.w wVar) {
        d();
        this.f112927o.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.f6(wVar, this));
        ((android.view.View) ((jz5.n) this.f112928p).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.g6(this));
        if (!this.f112929q) {
            this.f112929q = true;
            if (wVar.f43406v.getInteger(2) == 3) {
                ml2.n4 n4Var = ml2.n4.f327749p1;
                com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 59");
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
            } else {
                ml2.n4 n4Var2 = ml2.n4.M;
                com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 36");
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0.ik((ml2.r0) c18, n4Var2, null, 0, 6, null);
            }
        }
        r45.ih1 ih1Var = wVar.f43406v;
        kotlinx.coroutines.r2 r2Var = this.f112926n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        long j17 = (ih1Var != null ? ih1Var.getLong(3) : 0L) - (c01.id.c() / 1000);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkDismissJob. inviteInfo:");
        sb6.append(ih1Var != null ? java.lang.Integer.valueOf(ih1Var.getInteger(0)) : null);
        sb6.append(", invite_seat_id:");
        sb6.append(ih1Var != null ? java.lang.Integer.valueOf(ih1Var.getInteger(1)) : null);
        sb6.append(", confirm_expired_time:");
        sb6.append(ih1Var != null ? java.lang.Long.valueOf(ih1Var.getLong(3)) : null);
        sb6.append(" showTime: ");
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i(this.f112924i, sb6.toString());
        this.f112926n = com.tencent.mm.plugin.finder.live.util.y.e(this.f112922g, null, null, new com.tencent.mm.plugin.finder.live.plugin.d6(j17 > 0 ? (int) j17 : 15, this, null), 3, null);
    }

    public final void d() {
        android.view.ViewGroup viewGroup = this.f112925m;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.o6s);
        gk2.e eVar = this.f112920e;
        if (((mm2.e1) eVar.a(mm2.e1.class)).b7()) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icon_song_filled);
        } else if (((mm2.e1) eVar.a(mm2.e1.class)).g7()) {
            weImageView.setImageResource(com.tencent.mm.R.raw.finder_icons_filled_link_mic);
        } else {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_call);
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.odb);
        if (textView != null) {
            boolean b76 = ((mm2.e1) eVar.a(mm2.e1.class)).b7();
            android.content.Context context = this.f112919d;
            textView.setText(b76 ? context.getResources().getString(com.tencent.mm.R.string.ota) : ((mm2.e1) eVar.a(mm2.e1.class)).g7() ? context.getResources().getString(com.tencent.mm.R.string.f_3) : context.getResources().getString(com.tencent.mm.R.string.lyw));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int e0() {
        return com.tencent.mm.R.id.eqy;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void f0(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.w) {
            c((cm2.w) data);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public android.view.View getView() {
        return this.f112925m;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.w) {
            c((cm2.w) data);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l0() {
        kotlinx.coroutines.r2 r2Var = this.f112926n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int p0() {
        return com.tencent.mm.R.id.hhj;
    }
}
