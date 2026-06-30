package yr3;

/* loaded from: classes11.dex */
public final class g0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final wr3.i f464815d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f464816e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f464817f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f464818g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f464819h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f464820i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f464821m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f464822n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f464823o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f464824p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f464825q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f464826r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f464827s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.ImageView f464828t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f464829u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f464830v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(wr3.i adapter, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f464815d = adapter;
        this.f464816e = "FeaturedMsgSinglePicArticleViewHolder";
        this.f464817f = adapter.B();
        this.f464818g = itemView.findViewById(com.tencent.mm.R.id.f483878cb1);
        this.f464819h = itemView.findViewById(com.tencent.mm.R.id.t_g);
        this.f464820i = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.t_m);
        this.f464821m = itemView.findViewById(com.tencent.mm.R.id.t_s);
        this.f464822n = itemView.findViewById(com.tencent.mm.R.id.syc);
        this.f464823o = itemView.findViewById(com.tencent.mm.R.id.cbi);
        this.f464824p = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.cb9);
        this.f464825q = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.syb);
        this.f464826r = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.r5o);
        this.f464827s = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.r5m);
        this.f464828t = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.cbl);
        this.f464829u = itemView.findViewById(com.tencent.mm.R.id.f486223uo2);
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
        fq1.e.h(fq1.e.f265507a, this.f464823o, i65.a.b(this.f464817f, 8), false, false, 12, null);
        android.content.Context context = this.f464817f;
        wr3.i iVar = this.f464815d;
        android.view.View view = this.f464818g;
        kotlin.jvm.internal.o.d(view);
        android.view.View view2 = this.f464819h;
        kotlin.jvm.internal.o.d(view2);
        android.view.View view3 = this.f464823o;
        kotlin.jvm.internal.o.d(view3);
        android.widget.TextView textView = this.f464820i;
        kotlin.jvm.internal.o.d(textView);
        android.view.View view4 = this.f464821m;
        kotlin.jvm.internal.o.d(view4);
        wVar.h(context, iVar, bizMessage, view, view2, view3, textView, view4, new yr3.f0(this, bizMessage, itemStatus, z17, i18));
    }
}
