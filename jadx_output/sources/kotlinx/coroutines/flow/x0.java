package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class x0 implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f310449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f310450e;

    public x0(kotlinx.coroutines.flow.j jVar, int i17) {
        this.f310449d = jVar;
        this.f310450e = i17;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|27|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r8.f432972d != r7) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        throw r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // kotlinx.coroutines.flow.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlinx.coroutines.flow.k r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.w0
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.w0 r0 = (kotlinx.coroutines.flow.w0) r0
            int r1 = r0.f310435e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310435e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.w0 r0 = new kotlinx.coroutines.flow.w0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f310434d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310435e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.f310437g
            kotlinx.coroutines.flow.k r7 = (kotlinx.coroutines.flow.k) r7
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: v26.a -> L4f
            goto L54
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.jvm.internal.f0 r8 = new kotlin.jvm.internal.f0
            r8.<init>()
            kotlinx.coroutines.flow.j r2 = r6.f310449d     // Catch: v26.a -> L4f
            kotlinx.coroutines.flow.z0 r4 = new kotlinx.coroutines.flow.z0     // Catch: v26.a -> L4f
            int r5 = r6.f310450e     // Catch: v26.a -> L4f
            r4.<init>(r8, r5, r7)     // Catch: v26.a -> L4f
            r0.f310437g = r7     // Catch: v26.a -> L4f
            r0.f310435e = r3     // Catch: v26.a -> L4f
            java.lang.Object r7 = r2.a(r4, r0)     // Catch: v26.a -> L4f
            if (r7 != r1) goto L54
            return r1
        L4f:
            r8 = move-exception
            kotlinx.coroutines.flow.k r0 = r8.f432972d
            if (r0 != r7) goto L57
        L54:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        L57:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x0.a(kotlinx.coroutines.flow.k, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
