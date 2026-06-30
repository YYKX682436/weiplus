package wx0;

/* loaded from: classes5.dex */
public final class v0 extends mx0.a {

    /* renamed from: g, reason: collision with root package name */
    public final yx0.b8 f450554g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SelectorView f450555h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v0(android.view.ViewGroup r3, yx0.b8 r4, android.view.ViewGroup r5) {
        /*
            r2 = this;
            java.lang.String r0 = "sideToolbar"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "templateCorePlugin"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.String r0 = "rootView"
            kotlin.jvm.internal.o.g(r5, r0)
            r0 = 2131299176(0x7f090b68, float:1.8216346E38)
            android.view.View r0 = r3.findViewById(r0)
            java.lang.String r1 = "findViewById(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            r2.<init>(r0)
            r2.f450554g = r4
            android.view.View r4 = r2.f331814d
            wx0.t0 r0 = new wx0.t0
            r0.<init>(r2, r3, r5)
            r4.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wx0.v0.<init>(android.view.ViewGroup, yx0.b8, android.view.ViewGroup):void");
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SelectorView selectorView = this.f450555h;
        if (selectorView != null) {
            return selectorView.a();
        }
        return false;
    }
}
