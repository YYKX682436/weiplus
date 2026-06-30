package ls1;

/* loaded from: classes7.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f321013d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ls1.e0 e0Var) {
        super(3);
        this.f321013d = e0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.ref.WeakReference contextRef = (java.lang.ref.WeakReference) obj;
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.y0 result = (com.tencent.mm.plugin.brandservice.ui.timeline.preload.y0) obj2;
        r45.i9 appMsgContext = (r45.i9) obj3;
        kotlin.jvm.internal.o.g(contextRef, "contextRef");
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(appMsgContext, "appMsgContext");
        ls1.e0 e0Var = this.f321013d;
        com.tencent.mars.xlog.Log.i(e0Var.B1(), "processGetAppContext isCached " + result.f94482e + " isSuccess= " + result.f94478a);
        r45.wm6 wm6Var = e0Var.N1;
        int i17 = wm6Var.f389300o;
        e0Var.U1 = result.f94482e;
        boolean z17 = false;
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).x(e0Var.C1().f391886h, 0, e0Var.U1 ? 30 : 31);
        ax4.a.b(wm6Var.f389300o, result.f94482e ? 121 : 122, 1, true);
        long j17 = result.f94479b;
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.i0 i0Var = e0Var.P1;
        i0Var.f94301r = j17;
        i0Var.f94302s = result.f94480c;
        i0Var.f94274d = appMsgContext.f376824f;
        boolean z18 = result.f94482e;
        hy4.k0 k0Var = e0Var.V;
        if (z18) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            e0Var.S1 = currentTimeMillis;
            i0Var.f94300q = currentTimeMillis;
            k0Var.f286128j = java.lang.System.currentTimeMillis();
            e0Var.I1(com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.e(appMsgContext), e0Var.Q1, e0Var.S1);
        } else {
            if (result.f94478a) {
                java.lang.String str = appMsgContext.f376825g;
                ax4.a.b(i17, 123, 1, true);
                java.lang.String B1 = e0Var.B1();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("processGetAppContext forceUrl NotBlank = ");
                sb6.append(str != null && (r26.n0.N(str) ^ true));
                com.tencent.mars.xlog.Log.i(B1, sb6.toString());
                if (str != null && (!r26.n0.N(str))) {
                    z17 = true;
                }
                if (z17) {
                    ax4.a.b(i17, 120, 1, true);
                    kotlin.jvm.internal.o.d(str);
                    e0Var.D1(hy4.i.a(str, e0Var.C1()));
                } else if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.u1.a(appMsgContext)) {
                    ax4.a.b(i17, 124, 1, true);
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    e0Var.S1 = currentTimeMillis2;
                    i0Var.f94300q = currentTimeMillis2;
                    k0Var.f286128j = java.lang.System.currentTimeMillis();
                    e0Var.I1(com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.e(appMsgContext), e0Var.Q1, e0Var.S1);
                    i0Var.P = result.f94481d;
                }
            }
            com.tencent.mars.xlog.Log.i(e0Var.B1(), "processGetAppContext loadForceUrl with rawUrl");
            e0Var.D1(e0Var.i());
            ax4.a.b(i17, 125, 1, true);
            e0Var.J1();
        }
        return jz5.f0.f302826a;
    }
}
