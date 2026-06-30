package g4;

/* loaded from: classes5.dex */
public final class d2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268253d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.a1 f268255f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(g4.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f268255f = a1Var;
    }

    @Override // yz5.q
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        g4.t0 previous = (g4.t0) obj;
        g4.t0 next = (g4.t0) obj2;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) obj3;
        kotlin.jvm.internal.o.g(previous, "previous");
        kotlin.jvm.internal.o.g(next, "next");
        kotlin.jvm.internal.o.g(continuation, "continuation");
        g4.d2 d2Var = new g4.d2(this.f268255f, continuation);
        d2Var.f268253d = previous;
        d2Var.f268254e = next;
        return d2Var.invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.f268253d
            g4.t0 r7 = (g4.t0) r7
            java.lang.Object r0 = r6.f268254e
            g4.t0 r0 = (g4.t0) r0
            java.lang.String r1 = "$this$shouldPrioritizeOver"
            kotlin.jvm.internal.o.g(r0, r1)
            java.lang.String r1 = "previous"
            kotlin.jvm.internal.o.g(r7, r1)
            java.lang.String r1 = "loadType"
            g4.a1 r2 = r6.f268255f
            kotlin.jvm.internal.o.g(r2, r1)
            int r1 = r0.f268562a
            int r3 = r7.f268562a
            if (r1 <= r3) goto L25
            goto L60
        L25:
            g4.b5 r1 = r7.f268563b
            boolean r3 = r1 instanceof g4.a5
            g4.b5 r4 = r0.f268563b
            if (r3 == 0) goto L32
            boolean r3 = r4 instanceof g4.z4
            if (r3 == 0) goto L32
            goto L60
        L32:
            boolean r3 = r4 instanceof g4.a5
            if (r3 == 0) goto L3b
            boolean r3 = r1 instanceof g4.z4
            if (r3 == 0) goto L3b
            goto L5e
        L3b:
            int r3 = r4.f268217c
            int r5 = r1.f268217c
            if (r3 == r5) goto L42
            goto L60
        L42:
            int r3 = r4.f268218d
            int r5 = r1.f268218d
            if (r3 == r5) goto L49
            goto L60
        L49:
            g4.a1 r3 = g4.a1.PREPEND
            if (r2 != r3) goto L54
            int r3 = r1.f268215a
            int r5 = r4.f268215a
            if (r3 >= r5) goto L54
            goto L5e
        L54:
            g4.a1 r3 = g4.a1.APPEND
            if (r2 != r3) goto L60
            int r1 = r1.f268216b
            int r2 = r4.f268216b
            if (r1 >= r2) goto L60
        L5e:
            r1 = 0
            goto L61
        L60:
            r1 = 1
        L61:
            if (r1 == 0) goto L64
            r7 = r0
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.d2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
