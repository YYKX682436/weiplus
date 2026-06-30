package wx0;

/* loaded from: classes5.dex */
public final class e0 extends mx0.a {

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f450474g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e0(android.view.ViewGroup r2, mx0.z r3) {
        /*
            r1 = this;
            java.lang.String r0 = "sideToolbar"
            kotlin.jvm.internal.o.g(r2, r0)
            java.lang.String r0 = "controller"
            kotlin.jvm.internal.o.g(r3, r0)
            r0 = 2131299136(0x7f090b40, float:1.8216265E38)
            android.view.View r2 = r2.findViewById(r0)
            java.lang.String r0 = "findViewById(...)"
            kotlin.jvm.internal.o.f(r2, r0)
            r1.<init>(r2)
            android.view.View r2 = r1.f331814d
            wx0.d0 r0 = new wx0.d0
            r0.<init>(r1, r3)
            r2.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wx0.e0.<init>(android.view.ViewGroup, mx0.z):void");
    }

    public final void b(boolean z17) {
        if (z17) {
            android.view.View view = this.f331814d;
            view.setContentDescription(view.getContext().getString(com.tencent.mm.R.string.hud));
        } else {
            android.view.View view2 = this.f331814d;
            view2.setContentDescription(view2.getContext().getString(com.tencent.mm.R.string.hue));
        }
        this.f450474g = z17;
    }
}
