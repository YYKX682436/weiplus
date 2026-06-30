package lr;

/* loaded from: classes15.dex */
public final class g extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final lr.f f320521f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.view.View itemView, lr.k0 k0Var) {
        super(itemView, k0Var);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        lr.e eVar = new lr.e(this);
        this.f320521f = new lr.f(this, itemView);
        itemView.addOnAttachStateChangeListener(eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r2.f293831b == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final pr.b1 j(lr.g r2) {
        /*
            ir.u0 r2 = r2.f320581e
            ir.e0 r2 = (ir.e0) r2
            r0 = 0
            if (r2 == 0) goto Ld
            int r2 = r2.f293831b
            r1 = 1
            if (r2 != r1) goto Ld
            goto Le
        Ld:
            r1 = r0
        Le:
            if (r1 == 0) goto L17
            pr.z r2 = pr.k0.f357723q
            pr.b1 r2 = r2.a(r0)
            goto L1d
        L17:
            pr.z r2 = pr.k0.f357723q
            pr.b1 r2 = r2.b(r0)
        L1d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lr.g.j(lr.g):pr.b1");
    }
}
