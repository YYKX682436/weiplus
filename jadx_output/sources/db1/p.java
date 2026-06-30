package db1;

/* loaded from: classes5.dex */
public final class p extends android.app.Dialog implements fl1.b2 {
    public yz5.a A;
    public yz5.a B;
    public yz5.a C;
    public yz5.l D;
    public yz5.a E;
    public yz5.a F;
    public yz5.a G;
    public yz5.a H;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f227850d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f227851e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f227852f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f227853g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f227854h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f227855i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f227856m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f227857n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewGroup f227858o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f227859p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView f227860q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f227861r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.ViewGroup f227862s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.CheckBox f227863t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f227864u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f227865v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.Button f227866w;

    /* renamed from: x, reason: collision with root package name */
    public vi1.l0 f227867x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.platform.window.activity.r0 f227868y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f227869z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488080gf, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f227850d = inflate;
        com.tencent.mm.plugin.appbrand.platform.window.activity.r0 r0Var = new com.tencent.mm.plugin.appbrand.platform.window.activity.r0();
        r0Var.G(context);
        this.f227868y = r0Var;
        this.f227869z = new java.util.ArrayList();
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.lzs);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f227851e = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.lzw);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f227852f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.lzm);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f227853g = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.lzz);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById4;
        this.f227854h = imageView;
        imageView.setOnClickListener(new db1.a(this));
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.h7u);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f227855i = (android.view.ViewGroup) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.h7w);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f227856m = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.h7v);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f227857n = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.ku8);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f227858o = (android.view.ViewGroup) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.ku9);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f227859p = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = inflate.findViewById(com.tencent.mm.R.id.lzy);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView maxHeightRecyclerView = (com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView) findViewById10;
        this.f227860q = maxHeightRecyclerView;
        maxHeightRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        maxHeightRecyclerView.setItemAnimator(null);
        android.view.View findViewById11 = inflate.findViewById(com.tencent.mm.R.id.lzr);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById11;
        this.f227861r = textView;
        textView.setOnClickListener(new db1.b(this));
        android.view.View findViewById12 = inflate.findViewById(com.tencent.mm.R.id.lch);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f227862s = (android.view.ViewGroup) findViewById12;
        android.view.View findViewById13 = inflate.findViewById(com.tencent.mm.R.id.f485301h81);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById13;
        this.f227863t = checkBox;
        android.view.View findViewById14 = inflate.findViewById(com.tencent.mm.R.id.mvp);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.f227864u = (android.widget.TextView) findViewById14;
        android.view.View findViewById15 = inflate.findViewById(com.tencent.mm.R.id.b3v);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.f227865v = findViewById15;
        android.view.View findViewById16 = inflate.findViewById(com.tencent.mm.R.id.lzn);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        android.view.View findViewById17 = inflate.findViewById(com.tencent.mm.R.id.lzx);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById17;
        this.f227866w = button;
        button.setOnClickListener(new db1.c(this));
        checkBox.setOnCheckedChangeListener(new db1.d(this));
        ((android.widget.Button) findViewById16).setOnClickListener(new db1.e(this));
        this.A = db1.f.f227840d;
        this.B = db1.m.f227847d;
        this.C = db1.h.f227842d;
        this.D = db1.i.f227843d;
        this.E = db1.l.f227846d;
        this.F = db1.j.f227844d;
        this.G = db1.g.f227841d;
        this.H = db1.k.f227845d;
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    public final void b(int i17) {
        this.f227860q.setMaxHeight((int) (getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480121om) * ((i17 == 1 || i17 == 3) ? 1.5d : 2.5d)));
    }

    public final void c(java.lang.String str) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        android.view.ViewGroup viewGroup = this.f227862s;
        android.view.ViewGroup viewGroup2 = this.f227855i;
        if (K0) {
            viewGroup2.setVisibility(8);
            viewGroup.setVisibility(8);
        } else {
            viewGroup2.setVisibility(0);
            this.f227857n.setText(str);
            viewGroup.setVisibility(0);
        }
    }

    @Override // fl1.b2
    public boolean d() {
        return false;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        onCancel();
    }

    public final void e(java.util.ArrayList value) {
        kotlin.jvm.internal.o.g(value, "value");
        java.util.ArrayList arrayList = this.f227869z;
        arrayList.clear();
        arrayList.addAll(value);
        ik1.h0.b(new db1.n(this));
    }

    @Override // fl1.b2
    public android.view.View getContentView() {
        return this.f227850d;
    }

    @Override // fl1.b2
    public int getPosition() {
        return 2;
    }

    @Override // fl1.b2
    public boolean j() {
        return true;
    }

    @Override // fl1.b2
    public void m() {
    }

    @Override // fl1.b2
    public void onCancel() {
        this.C.invoke();
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        java.lang.Object systemService = getContext().getSystemService("window");
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        if (windowManager != null) {
            fl1.i2 i2Var = fl1.i2.f263792a;
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            i2Var.a(context, this.f227850d, this.f227865v, windowManager.getDefaultDisplay().getRotation(), this.f227868y, false);
            b(windowManager.getDefaultDisplay().getRotation());
        }
    }

    @Override // fl1.b2
    public void y(int i17) {
        fl1.i2 i2Var = fl1.i2.f263792a;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        i2Var.a(context, this.f227850d, this.f227865v, i17, this.f227868y, false);
        b(i17);
    }
}
