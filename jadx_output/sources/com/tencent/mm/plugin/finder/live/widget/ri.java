package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ri extends com.tencent.mm.plugin.finder.live.widget.n8 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f119639t = 0;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f119640h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f119641i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f119642m;

    /* renamed from: n, reason: collision with root package name */
    public final vm2.a f119643n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.ei f119644o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.xh f119645p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f119646q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveNewFansClubAnnouncementView f119647r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f119648s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aqj, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f119641i = inflate;
        this.f119642m = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dqw);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) this.f119641i.findViewById(com.tencent.mm.R.id.dqu);
        vm2.a aVar = new vm2.a(new java.util.ArrayList());
        this.f119643n = aVar;
        android.view.View findViewById = this.f119641i.findViewById(com.tencent.mm.R.id.dqg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.view.FinderLiveNewFansClubAnnouncementView finderLiveNewFansClubAnnouncementView = (com.tencent.mm.plugin.finder.live.view.FinderLiveNewFansClubAnnouncementView) findViewById;
        this.f119647r = finderLiveNewFansClubAnnouncementView;
        android.view.View findViewById2 = this.f119641i.findViewById(com.tencent.mm.R.id.fcy);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f119648s = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.ni(this));
        android.view.View findViewById3 = this.f119641i.findViewById(com.tencent.mm.R.id.dsa);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) findViewById3);
        this.f119641i.findViewById(com.tencent.mm.R.id.dqv).setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.fi(this));
        this.f119641i.findViewById(com.tencent.mm.R.id.ds7).setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.gi(this));
        this.f119641i.findViewById(com.tencent.mm.R.id.ds9).setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.hi(this));
        wxRecyclerView.setAdapter(aVar);
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        wxRecyclerView.N(new com.tencent.mm.plugin.finder.live.widget.ii(context));
        finderLiveNewFansClubAnnouncementView.setShowEditPanel(new com.tencent.mm.plugin.finder.live.widget.ji(this));
        android.view.View findViewById4 = this.f119641i.findViewById(com.tencent.mm.R.id.ds8);
        android.view.ViewGroup.LayoutParams layoutParams = findViewById4.getLayoutParams();
        layoutParams.height = getNO_KEY_BROAD_HEIGHT();
        findViewById4.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.finder.live.widget.ki getModifyBottomPage() {
        return (com.tencent.mm.plugin.finder.live.widget.ki) ((jz5.n) this.f119648s).getValue();
    }

    private final int getNO_KEY_BROAD_HEIGHT() {
        return this.f119641i.getContext().getResources().getConfiguration().orientation == 2 ? com.tencent.mm.ui.bl.b(this.f119641i.getContext()).y - com.tencent.mm.ui.bl.h(this.f119641i.getContext()) : com.tencent.mm.ui.zk.a(getContext(), 502);
    }

    public final void c(com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        r45.eq1 eq1Var;
        r45.eq1 eq1Var2;
        this.f119646q = y1Var;
        zl2.r4.f473950a.Q2(this);
        if (y1Var != null) {
            y1Var.h(getModifyBottomPage());
        }
        e();
        d();
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        java.lang.Object r17 = ((lb2.j) ((jz5.n) ae2.in.f3884t5).getValue()).r();
        boolean z17 = false;
        r45.qo qoVar = null;
        if (!(((java.lang.Number) r17).intValue() != -1)) {
            r17 = null;
        }
        java.lang.Integer num = (java.lang.Integer) r17;
        if (num != null) {
            int intValue = num.intValue();
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[isFansAnnouncementOpen] config = " + intValue);
            if (intValue == 1) {
                z17 = true;
            }
        } else {
            java.lang.Boolean valueOf = (eVar == null || (eq1Var = ((mm2.n2) eVar.a(mm2.n2.class)).f329279g) == null) ? null : java.lang.Boolean.valueOf(eq1Var.getBoolean(8));
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[isFansAnnouncementOpen] svr = " + valueOf);
            z17 = kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE);
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveNewFansClubAnnouncementView finderLiveNewFansClubAnnouncementView = this.f119647r;
        if (!z17) {
            finderLiveNewFansClubAnnouncementView.setVisibility(8);
            return;
        }
        mm2.n2 n2Var = (mm2.n2) efVar.i(mm2.n2.class);
        if (n2Var != null && (eq1Var2 = n2Var.f329279g) != null) {
            qoVar = (r45.qo) eq1Var2.getCustom(7);
        }
        finderLiveNewFansClubAnnouncementView.b(qoVar);
    }

    public final void d() {
        java.util.List<r45.yp1> list;
        r45.qa0 qa0Var;
        java.lang.Object obj;
        r45.gg1 gg1Var;
        vm2.a aVar = this.f119643n;
        java.util.List data = aVar.getData();
        data.clear();
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.n2 n2Var = (mm2.n2) efVar.i(mm2.n2.class);
        java.util.LinkedList list2 = (n2Var == null || (gg1Var = n2Var.f329284o) == null) ? null : gg1Var.getList(0);
        mm2.n2 n2Var2 = (mm2.n2) efVar.i(mm2.n2.class);
        if (n2Var2 != null && (list = n2Var2.f329283n) != null) {
            for (r45.yp1 yp1Var : list) {
                if (list2 != null) {
                    java.util.Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (kotlin.jvm.internal.o.b(((r45.qa0) obj).getString(0), yp1Var.getString(0))) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    qa0Var = (r45.qa0) obj;
                } else {
                    qa0Var = null;
                }
                data.add(new vm2.d(yp1Var, qa0Var));
            }
        }
        aVar.notifyDataSetChanged();
        aVar.f293105o = new com.tencent.mm.plugin.finder.live.widget.qi(this);
    }

    public final void e() {
        java.lang.String str;
        r45.eq1 eq1Var;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        mm2.n2 n2Var = (mm2.n2) dk2.ef.f233372a.i(mm2.n2.class);
        if (n2Var == null || (eq1Var = n2Var.f329279g) == null || (str = eq1Var.getString(0)) == null) {
            str = "";
        }
        ((ke0.e) xVar).getClass();
        this.f119642m.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
    }

    public final vm2.a getAdapter() {
        return this.f119643n;
    }

    public final yz5.a getBackClickListener() {
        return this.f119640h;
    }

    public final android.view.View getRoot() {
        return this.f119641i;
    }

    public final void setBackClickListener(yz5.a aVar) {
        this.f119640h = aVar;
    }

    public final void setRoot(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.f119641i = view;
    }
}
