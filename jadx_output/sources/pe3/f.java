package pe3;

/* loaded from: classes7.dex */
public final class f extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public hq0.e0 f353652d;

    /* renamed from: e, reason: collision with root package name */
    public final se3.e f353653e;

    /* renamed from: f, reason: collision with root package name */
    public final oe3.c f353654f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.FrameLayout f353655g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = androidx.lifecycle.k1.a(activity, null).a(se3.e.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        se3.e eVar = (se3.e) a17;
        this.f353653e = eVar;
        oe3.c cVar = new oe3.c();
        cVar.f344796z = eVar;
        cVar.A = new java.lang.ref.WeakReference(activity);
        this.f353654f = cVar;
        this.f353655g = new android.widget.FrameLayout(activity);
    }

    public final void O6(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(838515586);
        java.lang.Object obj = n0.e1.f333492a;
        pe3.a aVar = new pe3.a(this);
        int i18 = z0.t.f468922q1;
        r2.f0.a(aVar, d0.a3.e(z0.p.f468921d, 0.0f, 1, null), null, y0Var, 48, 4);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new pe3.b(this, i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P6(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof pe3.c
            if (r0 == 0) goto L13
            r0 = r8
            pe3.c r0 = (pe3.c) r0
            int r1 = r0.f353641f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f353641f = r1
            goto L18
        L13:
            pe3.c r0 = new pe3.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f353639d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f353641f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2b:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L79
        L2f:
            kotlin.ResultKt.throwOnFailure(r8)
            android.widget.FrameLayout r8 = r7.f353655g
            oe3.c r2 = r7.f353654f
            r2.getClass()
            java.lang.String r4 = "container"
            kotlin.jvm.internal.o.g(r8, r4)
            java.lang.Class<com.tencent.mm.plugin.magicbrush.d4> r4 = com.tencent.mm.plugin.magicbrush.d4.class
            i95.m r4 = i95.n0.c(r4)
            com.tencent.mm.plugin.magicbrush.d4 r4 = (com.tencent.mm.plugin.magicbrush.d4) r4
            android.content.Context r5 = r8.getContext()
            java.lang.String r6 = "getContext(...)"
            kotlin.jvm.internal.o.f(r5, r6)
            com.tencent.mm.plugin.magicbrush.m5 r4 = (com.tencent.mm.plugin.magicbrush.m5) r4
            bf3.p r4 = r4.Di(r5)
            r4.a(r8)
            r2.f344794x = r4
            r2.f344795y = r8
            r2.X0()
            r2.start()
            se3.e r8 = r7.f353653e
            kotlinx.coroutines.flow.i2 r8 = r8.f406914d
            pe3.d r2 = new pe3.d
            r2.<init>(r7)
            r0.f353641f = r3
            kotlinx.coroutines.flow.q2 r8 = (kotlinx.coroutines.flow.q2) r8
            r8.getClass()
            java.lang.Object r8 = kotlinx.coroutines.flow.q2.l(r8, r2, r0)
            if (r8 != r1) goto L79
            return r1
        L79:
            jz5.d r8 = new jz5.d
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pe3.f.P6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        kotlinx.coroutines.l.d(getMainScope(), null, null, new pe3.e(this, null), 3, null);
    }
}
