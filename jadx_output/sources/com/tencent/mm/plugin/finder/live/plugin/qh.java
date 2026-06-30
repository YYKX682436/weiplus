package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qh extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f114009p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.ConcertTicketTextView f114010q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f114011r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(com.tencent.mm.ui.MMActivity context, android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f483758bz2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f114009p = findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.ifs);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f114010q = (com.tencent.mm.plugin.finder.view.ConcertTicketTextView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.evw);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f114011r = (android.widget.ImageView) findViewById3;
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.qh qhVar) {
        r45.m70 m70Var = ((mm2.d1) qhVar.P0(mm2.d1.class)).f328951f;
        if (m70Var != null) {
            java.lang.String str = ((mm2.c1) qhVar.P0(mm2.c1.class)).f328852o;
            i95.m c17 = i95.n0.c(s40.w0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = qhVar.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            s40.w0.z5((s40.w0) c17, context, m70Var, null, str, "2", 4, null);
            nk2.l.f338021a.b(nk2.a.f337954g);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (kotlin.jvm.internal.o.b(string != null ? string : "", "PORTRAIT_ACTION_GOTO_TICKET")) {
            com.tencent.mm.plugin.finder.live.plugin.nh nhVar = new com.tencent.mm.plugin.finder.live.plugin.nh(this);
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            com.tencent.mm.sdk.platformtools.u3.i(nhVar, j17);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        if (com.tencent.mm.plugin.finder.live.plugin.lh.f113397a[status.ordinal()] == 1 && ((mm2.d1) P0(mm2.d1.class)).f328952g) {
            u1();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        K0(8);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 2;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void u1() {
        java.lang.String str;
        com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(((mm2.e1) P0(mm2.e1.class)).f328985o);
        long j17 = ((mm2.e1) P0(mm2.e1.class)).f328983m;
        r45.b84 b84Var = (r45.b84) ((mm2.e1) P0(mm2.e1.class)).f328988r.getCustom(47);
        if (b84Var == null || (str = b84Var.getString(1)) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        long j18 = ((mm2.e1) P0(mm2.e1.class)).f328988r.getLong(0);
        com.tencent.mars.xlog.Log.i("FinderLiveConcertTicketPlugin", "#tryToShowTicket liveId=" + j18);
        dk2.ef efVar = dk2.ef.f233372a;
        if (dk2.ef.f233384g) {
            com.tencent.mars.xlog.Log.i("FinderLiveConcertTicketPlugin", "#tryToShowTicket isAnchor, return.");
            K0(8);
        } else if (!((mm2.d1) P0(mm2.d1.class)).f328952g) {
            com.tencent.mars.xlog.Log.i("FinderLiveConcertTicketPlugin", "#tryToShowTicket isHopeShowTicketWindowNow not, return.");
            K0(8);
        } else if (((mm2.d1) P0(mm2.d1.class)).N6()) {
            com.tencent.mm.plugin.finder.live.util.y.e(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.ph(str2, j17, b17, j18, this, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveConcertTicketPlugin", "#tryToShowTicket isConcertLive not, return.");
            K0(8);
        }
    }
}
