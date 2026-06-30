package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class c4 extends kotlinx.coroutines.internal.h0 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ThreadLocal f310150g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c4(oz5.l r3, kotlin.coroutines.Continuation r4) {
        /*
            r2 = this;
            kotlinx.coroutines.d4 r0 = kotlinx.coroutines.d4.f310168d
            oz5.i r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            oz5.l r0 = r3.plus(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f310150g = r0
            oz5.l r4 = r4.getContext()
            oz5.e r1 = oz5.e.f350327d
            oz5.i r4 = r4.get(r1)
            boolean r4 = r4 instanceof kotlinx.coroutines.p0
            if (r4 != 0) goto L36
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.r0.c(r3, r4)
            kotlinx.coroutines.internal.r0.a(r3, r4)
            jz5.l r1 = new jz5.l
            r1.<init>(r3, r4)
            r0.set(r1)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.c4.<init>(oz5.l, kotlin.coroutines.Continuation):void");
    }

    public final boolean k0() {
        java.lang.ThreadLocal threadLocal = this.f310150g;
        if (threadLocal.get() == null) {
            return false;
        }
        threadLocal.set(null);
        return true;
    }

    @Override // kotlinx.coroutines.internal.h0, kotlinx.coroutines.c3
    public void v(java.lang.Object obj) {
        java.lang.ThreadLocal threadLocal = this.f310150g;
        jz5.l lVar = (jz5.l) threadLocal.get();
        if (lVar != null) {
            kotlinx.coroutines.internal.r0.a((oz5.l) lVar.f302833d, lVar.f302834e);
            threadLocal.set(null);
        }
        kotlin.coroutines.Continuation continuation = this.f310497f;
        java.lang.Object a17 = kotlinx.coroutines.i0.a(obj, continuation);
        oz5.l context = continuation.getContext();
        java.lang.Object c17 = kotlinx.coroutines.internal.r0.c(context, null);
        kotlinx.coroutines.c4 c18 = c17 != kotlinx.coroutines.internal.r0.f310523a ? kotlinx.coroutines.m0.c(continuation, context, c17) : null;
        try {
            continuation.resumeWith(a17);
        } finally {
            if (c18 == null || c18.k0()) {
                kotlinx.coroutines.internal.r0.a(context, c17);
            }
        }
    }
}
