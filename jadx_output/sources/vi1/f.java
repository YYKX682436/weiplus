package vi1;

/* loaded from: classes7.dex */
public abstract class f extends android.app.Dialog implements fl1.b2, fl1.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final xi1.g f437300d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f437301e;

    /* renamed from: f, reason: collision with root package name */
    public final fl1.s f437302f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f437303g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f437304h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f437305i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f437306m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f437307n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f437308o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.LinearLayout f437309p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f437310q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f437311r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f437312s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f437313t;

    /* renamed from: u, reason: collision with root package name */
    public fl1.g2 f437314u;

    /* renamed from: v, reason: collision with root package name */
    public vi1.c f437315v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.drawable.Drawable f437316w;

    /* renamed from: x, reason: collision with root package name */
    public int f437317x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, xi1.g windowAndroid) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(windowAndroid, "windowAndroid");
        this.f437300d = windowAndroid;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488086gu, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f437301e = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.oud);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f437302f = new fl1.s(context, findViewById);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.lzs);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f437303g = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.lzw);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f437304h = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.lzn);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        ((android.widget.Button) findViewById4).setOnClickListener(new vi1.a(this));
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.lzx);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById5;
        android.text.TextPaint paint = button.getPaint();
        nf.y yVar = nf.x.f336616b;
        if (yVar != null) {
            yVar.g(paint);
        } else {
            if (paint != null) {
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            if (paint != null) {
                paint.setStrokeWidth(0.8f);
            }
        }
        button.setOnClickListener(new vi1.b(this));
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.lzq);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f437305i = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.mwy);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f437306m = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.lzp);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f437309p = (android.widget.LinearLayout) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.lzz);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById9;
        this.f437307n = imageView;
        zk1.j jVar = zk1.m.f473414l;
        zk1.j.b(jVar, imageView, null, null, false, null, null, null, null, null, null, null, null, java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479672c9), 4094, null);
        android.view.View findViewById10 = inflate.findViewById(com.tencent.mm.R.id.lzm);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById10;
        this.f437308o = textView;
        android.text.TextPaint paint2 = textView.getPaint();
        nf.y yVar2 = nf.x.f336616b;
        if (yVar2 != null) {
            yVar2.g(paint2);
        } else {
            if (paint2 != null) {
                paint2.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            if (paint2 != null) {
                paint2.setStrokeWidth(0.8f);
            }
        }
        android.view.View findViewById11 = inflate.findViewById(com.tencent.mm.R.id.lzy);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById11;
        this.f437310q = recyclerView;
        zk1.j.b(jVar, recyclerView, null, null, true, null, null, null, null, null, null, null, null, null, 8182, null);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        recyclerView.setItemAnimator(null);
        android.view.View findViewById12 = inflate.findViewById(com.tencent.mm.R.id.lzt);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f437313t = findViewById12;
        android.view.View findViewById13 = inflate.findViewById(com.tencent.mm.R.id.b3v);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.f437312s = findViewById13;
        android.view.View findViewById14 = inflate.findViewById(com.tencent.mm.R.id.lzr);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById14;
        this.f437311r = textView2;
        zk1.j.b(jVar, textView2, android.widget.Button.class, null, false, null, null, null, null, null, null, null, null, java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479672c9), 4092, null);
        this.f437317x = 2;
    }

    public final void c(int i17) {
        this.f437317x = i17;
        android.view.View view = this.f437301e;
        if (i17 == 1) {
            view.setBackground(b3.l.getDrawable(getContext(), com.tencent.mm.R.drawable.f480857ea));
        } else {
            if (i17 != 2) {
                return;
            }
            view.setBackground(b3.l.getDrawable(getContext(), com.tencent.mm.R.drawable.e_));
        }
    }

    @Override // fl1.b2
    public boolean d() {
        return false;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (!kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new vi1.d(this));
            return;
        }
        try {
            super.dismiss();
        } finally {
            ((vi1.y1) this).onCancel();
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new vi1.e(this));
        }
    }

    @Override // fl1.b2
    public android.view.View getContentView() {
        return this.f437301e;
    }

    @Override // fl1.b2
    public int getPosition() {
        return this.f437317x;
    }

    @Override // fl1.b2
    public boolean j() {
        return true;
    }

    @Override // fl1.b2
    public void m() {
        zk1.a.a(this.f437301e);
    }

    @Override // fl1.b2
    public void onCancel() {
        vi1.c cVar = this.f437315v;
        if (cVar != null) {
            vi1.c.a(cVar, 3, false, 2, null);
        }
    }

    public final void setAppBrandName(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f437304h.setText(str);
    }

    @Override // fl1.e2
    public void setIExternalToolsHelper(com.tencent.mm.plugin.appbrand.jsapi.r1 r1Var) {
        this.f437302f.f263860m = r1Var;
    }

    public final void setIconUrl(java.lang.String str) {
        l01.d0.f314761a.a(this.f437303g, str, com.tencent.mm.R.drawable.cbh, l01.q0.f314787d);
    }

    @Override // fl1.e2
    public void setUserAgreementCheckBoxWording(java.lang.String wording) {
        kotlin.jvm.internal.o.g(wording, "wording");
        this.f437302f.setUserAgreementCheckBoxWording(wording);
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        this.f437314u = g2Var;
        java.lang.Object systemService = getContext().getSystemService("window");
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        if (windowManager != null) {
            fl1.i2 i2Var = fl1.i2.f263792a;
            android.content.Context context = this.f437301e.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            i2Var.a(context, this.f437301e, this.f437312s, windowManager.getDefaultDisplay().getRotation(), this.f437300d, this.f437302f.c());
        }
    }

    @Override // fl1.b2
    public void y(int i17) {
        fl1.i2 i2Var = fl1.i2.f263792a;
        android.content.Context context = this.f437301e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        i2Var.a(context, this.f437301e, this.f437312s, i17, this.f437300d, this.f437302f.c());
    }
}
