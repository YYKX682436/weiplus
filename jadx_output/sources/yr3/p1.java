package yr3;

/* loaded from: classes11.dex */
public final class p1 extends yr3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f464980f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f464981g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f464982h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f464983i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f464984m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(android.view.View itemView, wr3.i outAdapter, r45.l5 baseInfo) {
        super(itemView, outAdapter, baseInfo);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(outAdapter, "outAdapter");
        kotlin.jvm.internal.o.g(baseInfo, "baseInfo");
        this.f464980f = itemView.getContext();
        this.f464981g = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.dyx);
        this.f464982h = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.dyw);
        this.f464983i = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.dys);
        this.f464984m = itemView.findViewById(com.tencent.mm.R.id.f486223uo2);
    }

    @Override // yr3.a
    public void i(yr3.c dataModel, int i17, wr3.n0 itemStatus, boolean z17, int i18) {
        kotlin.jvm.internal.o.g(dataModel, "dataModel");
        kotlin.jvm.internal.o.g(itemStatus, "itemStatus");
        r45.s5 s5Var = dataModel.f464735c;
        r45.o5 o5Var = dataModel.f464734b;
        wr3.n0 n0Var = wr3.n0.f448843g;
        android.view.View view = this.f464984m;
        if (itemStatus == n0Var) {
            a84.y0.p(view, true);
        } else {
            a84.y0.p(view, false);
        }
        yr3.w wVar = yr3.w.f465059a;
        android.content.Context context = this.f464980f;
        kotlin.jvm.internal.o.d(context);
        wr3.i iVar = this.f464715d;
        android.view.View itemView = this.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        wVar.j(context, iVar, itemView, s5Var, o5Var, this.f464716e, (r29 & 64) != 0 ? 0 : i17, itemStatus, z17, i18, (r29 & 1024) != 0 ? sr3.a.f411829e : null, (r29 & 2048) != 0 ? false : false);
        android.view.View itemView2 = this.itemView;
        kotlin.jvm.internal.o.f(itemView2, "itemView");
        wVar.g(itemView2, i17);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = o5Var.f381913d;
        ((ke0.e) xVar).getClass();
        this.f464981g.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
        boolean b17 = x51.t1.b(o5Var.A);
        android.widget.TextView textView = this.f464982h;
        if (b17) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(o5Var.A);
        }
        n11.a.b().h(x51.t1.b(o5Var.f381921n) ? o5Var.f381920m : o5Var.f381921n, this.f464983i, wVar.d());
        fq1.e.h(fq1.e.f265507a, this.f464983i, i65.a.b(context, 2), false, false, 12, null);
    }
}
