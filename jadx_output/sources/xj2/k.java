package xj2;

/* loaded from: classes3.dex */
public final class k extends lj2.j implements android.view.View.OnClickListener {

    /* renamed from: i, reason: collision with root package name */
    public final lj2.x0 f454843i;

    /* renamed from: m, reason: collision with root package name */
    public final fg2.e1 f454844m;

    /* renamed from: n, reason: collision with root package name */
    public final float f454845n;

    /* renamed from: o, reason: collision with root package name */
    public int f454846o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f454847p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context, lj2.x0 x0Var, int i17, kotlin.jvm.internal.i iVar) {
        super(context);
        int i18;
        x0Var = (i17 & 2) != 0 ? null : x0Var;
        kotlin.jvm.internal.o.g(context, "context");
        this.f454843i = x0Var;
        fg2.e1 a17 = fg2.e1.a(com.tencent.mm.ui.id.b(context), this, false);
        this.f454844m = a17;
        com.tencent.mm.ui.ah a18 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i19 = a18.f197135a;
        if (!z17 && i19 > (i18 = a18.f197136b)) {
            i19 = i18;
        }
        this.f454845n = i19 / 3.0f;
        addView(a17.f262018a);
        a17.f262019b.f262294b.setVisibility(8);
        a17.f262021d.setVisibility(8);
    }

    public final lj2.x0 getService() {
        return this.f454843i;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "VisitorSinglePkGrabPreviewWidget";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        lj2.x0 x0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveVisitorSinglePkGrabPreviewWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = this.f454844m.f262018a.getId();
        if (valueOf != null && valueOf.intValue() == id6 && (x0Var = this.f454843i) != null) {
            x0Var.S(0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveVisitorSinglePkGrabPreviewWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = i19 - i17;
        if (!this.f454847p || this.f454846o == i28) {
            return;
        }
        setScale(i28 / this.f454845n);
        this.f454846o = i28;
    }

    public final void setNeedAutoAdjust(boolean z17) {
        this.f454847p = z17;
    }

    public final void setScale(float f17) {
        if (f17 < 0.2f) {
            f17 = 0.3f;
        }
        int b17 = (int) (i65.a.b(getContext(), 24) * f17);
        float f18 = 14 * f17;
        fg2.e1 e1Var = this.f454844m;
        e1Var.f262021d.setTextSize(1, f18);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = e1Var.f262020c;
        android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = b17;
            layoutParams.height = b17;
        }
        weImageView.requestLayout();
    }
}
