package wj2;

/* loaded from: classes10.dex */
public final class g0 extends lj2.j implements android.view.View.OnClickListener {

    /* renamed from: i, reason: collision with root package name */
    public final lj2.x0 f446677i;

    /* renamed from: m, reason: collision with root package name */
    public int f446678m;

    /* renamed from: n, reason: collision with root package name */
    public final fg2.k0 f446679n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f446680o;

    /* renamed from: p, reason: collision with root package name */
    public int f446681p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f446682q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(android.content.Context context, lj2.x0 x0Var, int i17, kotlin.jvm.internal.i iVar) {
        super(context);
        x0Var = (i17 & 2) != 0 ? null : x0Var;
        kotlin.jvm.internal.o.g(context, "context");
        this.f446677i = x0Var;
        fg2.k0 a17 = fg2.k0.a(com.tencent.mm.ui.id.b(context), this, false);
        this.f446679n = a17;
        android.widget.TextView tagTextView = a17.f262112b.f262294b;
        kotlin.jvm.internal.o.f(tagTextView, "tagTextView");
        this.f446680o = tagTextView;
        com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        if (!com.tencent.mm.ui.bk.y() && !com.tencent.mm.ui.bk.Q()) {
            com.tencent.mm.ui.bk.A();
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a17.f262111a;
        addView(constraintLayout);
        if (zl2.r4.f473950a.w1() || x0Var == null) {
            return;
        }
        constraintLayout.setOnClickListener(this);
    }

    private final float getEndViewSize() {
        boolean z17;
        float f17;
        float f18;
        int i17;
        int i18;
        if (getCurWidgetMode() == pm2.a.f356857m) {
            com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            java.lang.System.nanoTime();
            z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            int i19 = a17.f197135a;
            if (!z17 && i19 > (i18 = a17.f197136b)) {
                i19 = i18;
            }
            f17 = i19;
            f18 = 3.0f;
        } else {
            com.tencent.mm.ui.ah a18 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            java.lang.System.nanoTime();
            z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            int i27 = a18.f197135a;
            if (!z17 && i27 > (i17 = a18.f197136b)) {
                i27 = i17;
            }
            f17 = i27;
            f18 = 4.0f;
        }
        return f17 / f18;
    }

    public final lj2.x0 getService() {
        return this.f446677i;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "GrabRequestWidget";
    }

    @Override // lj2.j
    public void l(pm2.a widgetMode, xh2.a data) {
        kotlin.jvm.internal.o.g(widgetMode, "widgetMode");
        kotlin.jvm.internal.o.g(data, "data");
        super.l(widgetMode, data);
        this.f446678m = data.f454521b.f454553e;
        this.f446679n.f262114d.setText(getContext().getResources().getString(com.tencent.mm.R.string.dw8));
        s(this.f446680o);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        lj2.x0 x0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicGrabRequestWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = this.f446679n.f262111a.getId();
        if (valueOf != null && valueOf.intValue() == id6 && (x0Var = this.f446677i) != null) {
            x0Var.S(this.f446678m);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicGrabRequestWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = i19 - i17;
        if (!this.f446682q || this.f446681p == i28) {
            return;
        }
        this.f446681p = i28;
        setAlpha(0.0f);
        setScale(i28 / getEndViewSize());
    }

    public final void setNeedAutoAdjust(boolean z17) {
        this.f446682q = z17;
    }

    public final void setScale(float f17) {
        if (f17 < 0.2f) {
            f17 = 0.3f;
        }
        post(new wj2.f0(this, f17));
    }

    public final void v(int i17, float f17) {
        fg2.k0 k0Var = this.f446679n;
        k0Var.f262114d.setTextSize(1, f17);
        android.view.ViewGroup.LayoutParams layoutParams = k0Var.f262113c.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i17;
            layoutParams.height = i17;
        }
        setAlpha(1.0f);
        k0Var.f262111a.requestLayout();
    }
}
