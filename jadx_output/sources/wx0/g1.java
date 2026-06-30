package wx0;

/* loaded from: classes5.dex */
public final class g1 extends mx0.a implements android.view.View.OnClickListener {

    /* renamed from: g, reason: collision with root package name */
    public final yx0.b8 f450488g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f450489h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f450490i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g1(android.view.ViewGroup r2, yx0.b8 r3) {
        /*
            r1 = this;
            java.lang.String r0 = "sideToolbar"
            kotlin.jvm.internal.o.g(r2, r0)
            java.lang.String r0 = "templateCorePlugin"
            kotlin.jvm.internal.o.g(r3, r0)
            r0 = 2131299263(0x7f090bbf, float:1.8216522E38)
            android.view.View r2 = r2.findViewById(r0)
            java.lang.String r0 = "findViewById(...)"
            kotlin.jvm.internal.o.f(r2, r0)
            r1.<init>(r2)
            r1.f450488g = r3
            android.view.View r2 = r1.f331814d
            r2.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wx0.g1.<init>(android.view.ViewGroup, yx0.b8):void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/SubtitlePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.d7(m7Var, null), 3, null);
        android.view.View view2 = this.f331814d;
        kotlin.jvm.internal.o.g(view2, "<this>");
        view2.performHapticFeedback(6);
        boolean z17 = !this.f450489h;
        this.f450489h = z17;
        int i17 = z17 ? com.tencent.mm.R.drawable.cwx : com.tencent.mm.R.drawable.cww;
        kotlin.jvm.internal.o.e(view2, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView");
        ((com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView) view2).setImageResource(i17);
        boolean z18 = this.f450489h;
        yx0.b8 b8Var = this.f450488g;
        kotlinx.coroutines.l.d(b8Var.M, null, null, new yx0.y7(b8Var, z18, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/SubtitlePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
