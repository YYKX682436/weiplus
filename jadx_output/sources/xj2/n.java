package xj2;

/* loaded from: classes3.dex */
public class n extends lj2.j implements android.view.View.OnClickListener {

    /* renamed from: i, reason: collision with root package name */
    public final lj2.x0 f454851i;

    /* renamed from: m, reason: collision with root package name */
    public final fg2.f1 f454852m;

    /* renamed from: n, reason: collision with root package name */
    public final float f454853n;

    /* renamed from: o, reason: collision with root package name */
    public int f454854o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f454855p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, lj2.x0 x0Var) {
        super(context);
        int i17;
        kotlin.jvm.internal.o.g(context, "context");
        this.f454851i = x0Var;
        fg2.f1 a17 = fg2.f1.a(com.tencent.mm.ui.id.b(context), this, false);
        this.f454852m = a17;
        com.tencent.mm.ui.ah a18 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i18 = a18.f197135a;
        if (!z17 && i18 > (i17 = a18.f197136b)) {
            i18 = i17;
        }
        this.f454853n = i18 / 4.0f;
        addView(a17.f262030a);
        a17.f262032c.setVisibility(8);
    }

    public final lj2.x0 getService() {
        return this.f454851i;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "GrabRequestWidget";
    }

    public final fg2.f1 getViewBinding() {
        return this.f454852m;
    }

    @Override // lj2.j
    public void l(pm2.a widgetMode, xh2.a data) {
        kotlin.jvm.internal.o.g(widgetMode, "widgetMode");
        kotlin.jvm.internal.o.g(data, "data");
        super.l(widgetMode, data);
        this.f454852m.f262030a.setBackground(p() ? getContext().getResources().getDrawable(com.tencent.mm.R.drawable.cq6) : getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481802cq5));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveVisitorTeamPkGrabPreviewWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/pk/FinderLiveVisitorTeamPkGrabPreviewWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = i19 - i17;
        if (!this.f454855p || this.f454854o == i28) {
            return;
        }
        setAlpha(0.0f);
        this.f454854o = i28;
        setScale(i28 / this.f454853n);
    }

    public final void setNeedAutoAdjust(boolean z17) {
        this.f454855p = z17;
    }

    public final void setScale(float f17) {
        if (f17 < 0.2f) {
            f17 = 0.3f;
        }
        post(new xj2.m(this, f17));
    }

    public final void v(int i17, float f17) {
        fg2.f1 f1Var = this.f454852m;
        f1Var.f262032c.setTextSize(1, f17);
        android.view.ViewGroup.LayoutParams layoutParams = f1Var.f262031b.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i17;
            layoutParams.height = i17;
        }
        setAlpha(1.0f);
        f1Var.f262031b.requestLayout();
    }
}
