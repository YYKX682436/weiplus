package yr3;

/* loaded from: classes11.dex */
public final class c1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final wr3.v f464742d;

    /* renamed from: e, reason: collision with root package name */
    public final sr3.a f464743e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f464744f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f464745g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f464746h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f464747i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f464748m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f464749n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f464750o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f464751p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f464752q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f464753r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f464754s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f464755t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f464756u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.Boolean f464757v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f464758w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f464759x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(wr3.v adapter, android.view.View itemView, sr3.a accountType) {
        super(itemView);
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(accountType, "accountType");
        this.f464742d = adapter;
        this.f464743e = accountType;
        this.f464744f = "MsgSingleAudioViewHolder";
        this.f464745g = adapter.f448778m;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f483873sy2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f464746h = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.sya);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f464747i = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.f483876sy5);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f464748m = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.f483874sy3);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f464749n = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.sy6);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f464750o = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.tencent.mm.R.id.sy8);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f464751p = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.tencent.mm.R.id.f486223uo2);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f464752q = findViewById7;
        android.view.View findViewById8 = itemView.findViewById(com.tencent.mm.R.id.t_n);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f464753r = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = itemView.findViewById(com.tencent.mm.R.id.sy7);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f464754s = findViewById9;
        android.view.View findViewById10 = itemView.findViewById(com.tencent.mm.R.id.sy9);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f464755t = findViewById10;
        this.f464756u = "";
    }

    public final void i(android.view.View view, boolean z17) {
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSingleAudioViewHolder", "setVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSingleAudioViewHolder", "setVisible", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
