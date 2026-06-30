package yr3;

/* loaded from: classes11.dex */
public final class q0 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yr3.s0 f464988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.u5 f464989b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f464990c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget f464991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget f464992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f464993f;

    public q0(yr3.s0 s0Var, r45.u5 u5Var, android.widget.TextView textView, com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget, com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget2, android.widget.TextView textView2) {
        this.f464988a = s0Var;
        this.f464989b = u5Var;
        this.f464990c = textView;
        this.f464991d = finderLiveOnliveWidget;
        this.f464992e = finderLiveOnliveWidget2;
        this.f464993f = textView2;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        yr3.s0 s0Var = this.f464988a;
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.i(s0Var.f465016g, "query fail, liveId = 0");
        }
        r45.u5 u5Var = this.f464989b;
        if (!u5Var.f387031f.equals(this.f464990c.getTag(com.tencent.mm.R.id.bph))) {
            com.tencent.mars.xlog.Log.i(s0Var.f465016g, "recycled");
            return;
        }
        if (obj != null && (obj instanceof r45.l71)) {
            r45.l71 l71Var = (r45.l71) obj;
            if (((r45.nw1) l71Var.getCustom(1)) != null) {
                eq1.h hVar = eq1.h.f255812a;
                r45.nw1 nw1Var = (r45.nw1) l71Var.getCustom(1);
                com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget liveOnIcon = this.f464991d;
                kotlin.jvm.internal.o.f(liveOnIcon, "$liveOnIcon");
                com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget liveEndIcon = this.f464992e;
                kotlin.jvm.internal.o.f(liveEndIcon, "$liveEndIcon");
                hVar.j(nw1Var, liveOnIcon, liveEndIcon);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).A(u5Var.f387031f, (r45.nw1) l71Var.getCustom(1));
            }
        }
        java.lang.String str = "";
        if (obj != null && (obj instanceof r45.l71)) {
            r45.l71 l71Var2 = (r45.l71) obj;
            if (!x51.t1.b(l71Var2.getString(4))) {
                str = l71Var2.getString(4);
                kotlin.jvm.internal.o.d(str);
            }
        }
        boolean b17 = x51.t1.b(str);
        android.widget.TextView textView = this.f464993f;
        if (b17) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }
}
