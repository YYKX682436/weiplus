package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class gg extends com.tencent.mm.plugin.finder.live.widget.n8 implements android.view.View.OnClickListener {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f118429z = 0;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f118430h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.q f118431i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f118432m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f118433n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f118434o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f118435p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f118436q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f118437r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.ImageView f118438s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f118439t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f118440u;

    /* renamed from: v, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f118441v;

    /* renamed from: w, reason: collision with root package name */
    public ce2.i f118442w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.eh0 f118443x;

    /* renamed from: y, reason: collision with root package name */
    public long f118444y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aqd, (android.view.ViewGroup) this, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f118433n = inflate;
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.drl);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.dsr);
        this.f118434o = findViewById;
        this.f118435p = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dst);
        this.f118436q = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hoy);
        this.f118437r = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hou);
        this.f118438s = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.how);
        this.f118439t = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hox);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hot);
        this.f118441v = kotlinx.coroutines.z0.b();
        this.f118443x = com.tencent.mm.plugin.finder.live.plugin.eh0.f112416f;
        imageView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        textView.setOnClickListener(this);
        setTextBold(textView);
    }

    public final void b() {
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f118432m;
        if (y1Var != null) {
            y1Var.q();
        }
        this.f118432m = null;
    }

    public final void c(int i17) {
        com.tencent.mm.plugin.finder.live.plugin.l basePlugin;
        dk2.xf W0;
        com.tencent.mars.xlog.Log.i("FinderLiveFansJoinWidget", "showWecoinInfo scene:" + i17);
        android.view.View view = this.f118433n;
        if (!(view.getContext() instanceof androidx.fragment.app.FragmentActivity) || (basePlugin = getBasePlugin()) == null || (W0 = basePlugin.W0()) == null) {
            return;
        }
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        dk2.xf.a(W0, (androidx.fragment.app.FragmentActivity) context, i17, 0, new com.tencent.mm.plugin.finder.live.widget.ag(i17, this), 4, null);
    }

    public final yz5.q getJoinCallBack() {
        return this.f118431i;
    }

    public final yz5.l getWecoinClickCallBack() {
        return this.f118430h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansJoinWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.drl) {
            b();
        } else {
            boolean z17 = true;
            if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.dsr) {
                b();
                c(1);
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.hot) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (currentTimeMillis - qd2.h.f361767a >= 500) {
                    z17 = false;
                } else {
                    com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
                }
                qd2.h.f361767a = currentTimeMillis;
                if (z17) {
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansJoinWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                if (!this.f118440u) {
                    android.view.View view2 = this.f118433n;
                    db5.t7.m(view2.getContext(), view2.getContext().getResources().getString(com.tencent.mm.R.string.dk6));
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansJoinWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else {
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ml2.r0.Lj((ml2.r0) c17, ml2.j4.f327619o, null, this.f118443x, 2, null);
                    kotlinx.coroutines.l.d(this.f118441v, null, null, new com.tencent.mm.plugin.finder.live.widget.xf(this, null), 3, null);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansJoinWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setJoinCallBack(yz5.q qVar) {
        this.f118431i = qVar;
    }

    public final void setWecoinClickCallBack(yz5.l lVar) {
        this.f118430h = lVar;
    }
}
