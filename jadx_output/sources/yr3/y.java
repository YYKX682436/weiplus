package yr3;

/* loaded from: classes11.dex */
public final class y extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final wr3.i f465076d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f465077e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f465078f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f465079g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f465080h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f465081i;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f465082m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f465083n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f465084o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f465085p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f465086q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f465087r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(wr3.i adapter, android.view.View itemView, int i17) {
        super(itemView);
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f465076d = adapter;
        this.f465077e = adapter.B();
        this.f465078f = itemView.findViewById(com.tencent.mm.R.id.syc);
        this.f465079g = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.cb9);
        this.f465080h = itemView.findViewById(com.tencent.mm.R.id.syc);
        this.f465081i = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.syb);
        this.f465082m = (androidx.recyclerview.widget.RecyclerView) itemView.findViewById(com.tencent.mm.R.id.f483880cb3);
        this.f465083n = itemView.findViewById(com.tencent.mm.R.id.f483878cb1);
        this.f465084o = itemView.findViewById(com.tencent.mm.R.id.t_g);
        this.f465085p = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.t_m);
        this.f465086q = itemView.findViewById(com.tencent.mm.R.id.t_s);
        this.f465087r = itemView.findViewById(com.tencent.mm.R.id.cbi);
    }

    public final void i(r45.s5 bizMessage, wr3.n0 itemStatus, int i17, boolean z17, java.lang.String userName, int i18) {
        kotlin.jvm.internal.o.g(bizMessage, "bizMessage");
        kotlin.jvm.internal.o.g(itemStatus, "itemStatus");
        kotlin.jvm.internal.o.g(userName, "userName");
        wr3.n0 n0Var = wr3.n0.f448842f;
        yr3.w wVar = yr3.w.f465059a;
        if (itemStatus == n0Var || itemStatus == wr3.n0.f448846m) {
            wVar.l(bizMessage, userName);
        }
        fq1.e.h(fq1.e.f265507a, this.f465087r, i65.a.b(this.f465077e, 8), false, false, 12, null);
        android.content.Context context = this.f465077e;
        wr3.i iVar = this.f465076d;
        android.view.View view = this.f465083n;
        kotlin.jvm.internal.o.d(view);
        android.view.View view2 = this.f465084o;
        kotlin.jvm.internal.o.d(view2);
        android.view.View view3 = this.f465087r;
        kotlin.jvm.internal.o.d(view3);
        android.widget.TextView textView = this.f465085p;
        kotlin.jvm.internal.o.d(textView);
        android.view.View view4 = this.f465086q;
        kotlin.jvm.internal.o.d(view4);
        wVar.h(context, iVar, bizMessage, view, view2, view3, textView, view4, new yr3.x(this, bizMessage, itemStatus, i17, z17, i18));
    }
}
