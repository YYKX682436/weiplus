package yr3;

/* loaded from: classes11.dex */
public final class n1 extends yr3.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f464955f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f464956g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMNeat7extView f464957h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f464958i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f464959m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f464960n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(android.view.View itemView, wr3.i outAdapter, r45.l5 baseInfo) {
        super(itemView, outAdapter, baseInfo);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(outAdapter, "outAdapter");
        kotlin.jvm.internal.o.g(baseInfo, "baseInfo");
        this.f464955f = "SmallLiveViewHolder";
        this.f464956g = itemView.getContext();
        this.f464957h = (com.tencent.mm.ui.widget.MMNeat7extView) itemView.findViewById(com.tencent.mm.R.id.dyv);
        this.f464958i = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.dyw);
        this.f464959m = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.dys);
        this.f464960n = itemView.findViewById(com.tencent.mm.R.id.f486223uo2);
    }

    @Override // yr3.a
    public void i(yr3.c dataModel, int i17, wr3.n0 itemStatus, boolean z17, int i18) {
        kotlin.jvm.internal.o.g(dataModel, "dataModel");
        kotlin.jvm.internal.o.g(itemStatus, "itemStatus");
        r45.o5 o5Var = dataModel.f464734b;
        if (o5Var.P == null) {
            com.tencent.mars.xlog.Log.i(this.f464955f, "detailInfo.finder_live == null");
            return;
        }
        wr3.n0 n0Var = wr3.n0.f448843g;
        android.view.View view = this.f464960n;
        if (itemStatus == n0Var) {
            a84.y0.p(view, true);
        } else {
            a84.y0.p(view, false);
        }
        r45.u5 finder_live = o5Var.P;
        kotlin.jvm.internal.o.f(finder_live, "finder_live");
        boolean z18 = (x51.t1.b(o5Var.f381921n) || x51.t1.b(o5Var.L)) ? false : true;
        yr3.w wVar = yr3.w.f465059a;
        android.view.View itemView = this.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        wVar.g(itemView, i17);
        r45.nw1 g17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).g(finder_live.f387031f);
        java.lang.String str = z18 ? o5Var.f381913d : finder_live.f387034i;
        eq1.h hVar = eq1.h.f255812a;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f464957h;
        kotlin.jvm.internal.o.d(mMNeat7extView);
        hVar.k(g17, mMNeat7extView, str);
        mMNeat7extView.setTag(com.tencent.mm.R.id.bph, finder_live.f387031f);
        hVar.f(finder_live.f387030e, finder_live.f387031f, new yr3.l1(this, finder_live, str));
        n11.a.b().h(z18 ? o5Var.f381921n : finder_live.f387040r.f384546d, this.f464959m, wVar.d());
        fq1.e.h(fq1.e.f265507a, this.f464959m, i65.a.b(this.f464956g, 2), false, false, 12, null);
        this.itemView.setOnClickListener(new yr3.m1(finder_live, this));
    }
}
