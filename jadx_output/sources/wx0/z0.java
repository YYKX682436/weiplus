package wx0;

/* loaded from: classes5.dex */
public final class z0 extends mx0.a {

    /* renamed from: g, reason: collision with root package name */
    public wx0.x0 f450574g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SelectorView f450575h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z0(android.view.ViewGroup r3, android.view.ViewGroup r4) {
        /*
            r2 = this;
            java.lang.String r0 = "sideToolbar"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "rootView"
            kotlin.jvm.internal.o.g(r4, r0)
            r0 = 2131299206(0x7f090b86, float:1.8216407E38)
            android.view.View r0 = r3.findViewById(r0)
            java.lang.String r1 = "findViewById(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            r2.<init>(r0)
            wx0.x0 r0 = wx0.x0.f450566e
            r2.f450574g = r0
            android.view.View r0 = r2.f331814d
            wx0.w0 r1 = new wx0.w0
            r1.<init>(r2, r3, r4)
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wx0.z0.<init>(android.view.ViewGroup, android.view.ViewGroup):void");
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SelectorView selectorView = this.f450575h;
        if (selectorView != null) {
            return selectorView.a();
        }
        return false;
    }
}
