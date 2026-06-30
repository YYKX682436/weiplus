package yr3;

/* loaded from: classes11.dex */
public final class o1 extends yr3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f464966f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f464967g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f464968h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f464969i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f464970m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f464971n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(android.view.View itemView, wr3.i outAdapter, r45.l5 baseInfo) {
        super(itemView, outAdapter, baseInfo);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(outAdapter, "outAdapter");
        kotlin.jvm.internal.o.g(baseInfo, "baseInfo");
        this.f464966f = itemView.getContext();
        this.f464967g = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.dyx);
        this.f464968h = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.dyw);
        this.f464969i = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.dys);
        this.f464970m = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.kvn);
        this.f464971n = itemView.findViewById(com.tencent.mm.R.id.f486223uo2);
    }

    @Override // yr3.a
    public void i(yr3.c dataModel, int i17, wr3.n0 itemStatus, boolean z17, int i18) {
        int i19;
        kotlin.jvm.internal.o.g(dataModel, "dataModel");
        kotlin.jvm.internal.o.g(itemStatus, "itemStatus");
        r45.s5 s5Var = dataModel.f464735c;
        r45.o5 o5Var = dataModel.f464734b;
        wr3.n0 n0Var = wr3.n0.f448843g;
        android.view.View view = this.f464971n;
        if (itemStatus == n0Var) {
            a84.y0.p(view, true);
        } else {
            a84.y0.p(view, false);
        }
        yr3.w wVar = yr3.w.f465059a;
        android.content.Context context = this.f464966f;
        kotlin.jvm.internal.o.d(context);
        wr3.i iVar = this.f464715d;
        android.view.View itemView = this.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        wVar.j(context, iVar, itemView, s5Var, o5Var, this.f464716e, (r29 & 64) != 0 ? 0 : i17, itemStatus, z17, i18, (r29 & 1024) != 0 ? sr3.a.f411829e : null, (r29 & 2048) != 0 ? false : false);
        android.view.View itemView2 = this.itemView;
        kotlin.jvm.internal.o.f(itemView2, "itemView");
        wVar.g(itemView2, i17);
        this.f464967g.setText(o5Var.f381913d);
        boolean b17 = x51.t1.b(o5Var.A);
        android.widget.TextView textView = this.f464968h;
        if (b17) {
            textView.setVisibility(8);
            i19 = 0;
        } else {
            i19 = 0;
            textView.setVisibility(0);
            textView.setText(o5Var.A);
        }
        int i27 = o5Var.H;
        android.widget.TextView textView2 = this.f464970m;
        if (i27 > 1) {
            textView2.setVisibility(i19);
            textView2.setText(java.lang.String.valueOf(o5Var.H));
        } else {
            textView2.setVisibility(8);
            textView2.setText("");
        }
        n11.a.b().h(x51.t1.b(o5Var.f381921n) ? o5Var.f381920m : o5Var.f381921n, this.f464969i, wVar.d());
        fq1.e.h(fq1.e.f265507a, this.f464969i, i65.a.b(context, 2), false, false, 12, null);
    }
}
