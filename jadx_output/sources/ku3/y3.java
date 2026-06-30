package ku3;

/* loaded from: classes3.dex */
public final class y3 implements yt3.r2 {
    public kotlinx.coroutines.r2 A;
    public int B;
    public float C;

    /* renamed from: d, reason: collision with root package name */
    public final zt3.a f312469d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f312470e;

    /* renamed from: f, reason: collision with root package name */
    public final ju3.d0 f312471f;

    /* renamed from: g, reason: collision with root package name */
    public int f312472g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f312473h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f312474i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f312475m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f312476n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f312477o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f312478p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f312479q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f312480r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f312481s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f312482t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f312483u;

    /* renamed from: v, reason: collision with root package name */
    public final int f312484v;

    /* renamed from: w, reason: collision with root package name */
    public final int f312485w;

    /* renamed from: x, reason: collision with root package name */
    public final int f312486x;

    /* renamed from: y, reason: collision with root package name */
    public final int f312487y;

    /* renamed from: z, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f312488z;

    public y3(zt3.a kitContext, android.view.ViewGroup parent, ju3.d0 status) {
        kotlin.jvm.internal.o.g(kitContext, "kitContext");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f312469d = kitContext;
        this.f312470e = parent;
        this.f312471f = status;
        this.f312472g = -1;
        this.f312473h = jz5.h.b(new ku3.x3(this));
        this.f312474i = jz5.h.b(new ku3.g3(this));
        this.f312475m = jz5.h.b(new ku3.s3(this));
        this.f312476n = jz5.h.b(new ku3.u3(this));
        this.f312477o = jz5.h.b(new ku3.t3(this));
        this.f312482t = i65.a.i(parent.getContext(), com.tencent.mm.R.drawable.f481087kd);
        this.f312483u = i65.a.i(parent.getContext(), com.tencent.mm.R.drawable.f481088ke);
        this.f312484v = i65.a.d(parent.getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_5);
        this.f312485w = i65.a.d(parent.getContext(), com.tencent.mm.R.color.f478553an);
        i65.a.b(parent.getContext(), 28);
        this.f312486x = i65.a.f(parent.getContext(), com.tencent.mm.R.dimen.f479672c9);
        this.f312487y = i65.a.f(parent.getContext(), com.tencent.mm.R.dimen.f479673ca);
        this.f312488z = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
    }

    public static final void a(ku3.y3 y3Var, android.widget.TextView textView) {
        android.widget.TextView textView2 = y3Var.f312481s;
        if (textView2 != null) {
            textView2.setTextColor(y3Var.f312484v);
        }
        android.widget.TextView textView3 = y3Var.f312481s;
        if (textView3 != null) {
            textView3.setTextSize(0, y3Var.f312486x);
        }
        y3Var.f312481s = textView;
        if (textView != null) {
            textView.setTextColor(y3Var.f312485w);
        }
        if (textView != null) {
            textView.setTextSize(0, y3Var.f312487y);
        }
    }

    public final void b(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMenuCountDownPlugin", "changeLocation >> " + i18 + ", " + i19);
        this.f312472g = i17;
        g().post(new ku3.f3(this, i18, i19));
    }

    public final android.view.View c() {
        java.lang.Object value = ((jz5.n) this.f312474i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView d() {
        java.lang.Object value = ((jz5.n) this.f312475m).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    public final android.view.View e() {
        java.lang.Object value = ((jz5.n) this.f312477o).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.ViewGroup f() {
        java.lang.Object value = ((jz5.n) this.f312476n).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.ViewGroup) value;
    }

    public final android.widget.TextView g() {
        java.lang.Object value = this.f312473h.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r1 != false) goto L10;
     */
    @Override // yt3.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttach() {
        /*
            r9 = this;
            kotlinx.coroutines.r2 r0 = r9.A
            if (r0 == 0) goto L12
            r1 = 0
            if (r0 == 0) goto L10
            kotlinx.coroutines.a r0 = (kotlinx.coroutines.a) r0
            boolean r0 = r0.a()
            if (r0 != 0) goto L10
            r1 = 1
        L10:
            if (r1 == 0) goto L1d
        L12:
            zt3.a r0 = r9.f312469d
            r1 = 9
            boolean r0 = r0.O6(r1)
            if (r0 != 0) goto L1d
            return
        L1d:
            zt3.a r1 = r9.f312469d
            r2 = 9
            r3 = 1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r0 = "PARAM_1_INT"
            int r5 = r9.B
            r4.putInt(r0, r5)
            r5 = 0
            r6 = 0
            r7 = 24
            r8 = 0
            zt3.a.V6(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ku3.y3.onAttach():void");
    }

    @Override // yt3.r2
    public void release() {
        kotlinx.coroutines.r2 r2Var = this.A;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.z0.e(this.f312488z, null, 1, null);
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        ku3.h3 h3Var = new ku3.h3(this);
        zt3.a aVar = this.f312469d;
        aVar.Q6(15, h3Var);
        aVar.Q6(10, new ku3.j3(this));
        aVar.R6(new ku3.l3(this));
        c().setOnClickListener(ku3.m3.f312317d);
        e().setBackground(this.f312483u);
        d().s(com.tencent.mm.R.raw.icons_menu_countdown, com.tencent.mm.R.color.f478773gt);
        android.view.ViewGroup viewGroup = this.f312470e;
        int b17 = i65.a.b(viewGroup.getContext(), 55);
        f().setPadding(b17, 0, b17, 0);
        e().setOnClickListener(new ku3.o3(this));
        java.lang.String r17 = i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.hmf);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        android.widget.TextView textView = new android.widget.TextView(viewGroup.getContext());
        textView.setText(r17);
        textView.setTextColor(this.f312485w);
        textView.setTextSize(0, this.f312487y);
        textView.setGravity(8388627);
        textView.setOnClickListener(new ku3.p3(this));
        this.f312478p = textView;
        java.lang.String r18 = i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.hme);
        kotlin.jvm.internal.o.f(r18, "getString(...)");
        android.widget.TextView textView2 = new android.widget.TextView(viewGroup.getContext());
        textView2.setText(r18);
        int i17 = this.f312484v;
        textView2.setTextColor(i17);
        textView2.setGravity(17);
        float f17 = this.f312486x;
        textView2.setTextSize(0, f17);
        textView2.setOnClickListener(new ku3.q3(this));
        this.f312479q = textView2;
        java.lang.String r19 = i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.hmd);
        kotlin.jvm.internal.o.f(r19, "getString(...)");
        android.widget.TextView textView3 = new android.widget.TextView(viewGroup.getContext());
        textView3.setText(r19);
        textView3.setTextColor(i17);
        textView3.setGravity(8388629);
        textView3.setTextSize(0, f17);
        textView3.setOnClickListener(new ku3.r3(this));
        this.f312480r = textView3;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams.gravity = 16;
        f().addView(this.f312478p, layoutParams);
        f().addView(this.f312479q, layoutParams);
        f().addView(this.f312480r, layoutParams);
        this.f312481s = this.f312478p;
    }
}
