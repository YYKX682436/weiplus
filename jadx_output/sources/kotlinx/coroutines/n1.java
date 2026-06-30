package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class n1 extends kotlinx.coroutines.scheduling.j {
    public int resumeMode;

    public n1(int i17) {
        super(0L, kotlinx.coroutines.scheduling.n.f310619f);
        this.resumeMode = i17;
    }

    public abstract void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object obj, java.lang.Throwable th6);

    public abstract kotlin.coroutines.Continuation getDelegate$kotlinx_coroutines_core();

    public java.lang.Throwable getExceptionalResult$kotlinx_coroutines_core(java.lang.Object obj) {
        kotlinx.coroutines.e0 e0Var = obj instanceof kotlinx.coroutines.e0 ? (kotlinx.coroutines.e0) obj : null;
        if (e0Var != null) {
            return e0Var.f310172a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(java.lang.Object obj) {
        return obj;
    }

    public final void handleFatalException(java.lang.Throwable th6, java.lang.Throwable th7) {
        if (th6 == null && th7 == null) {
            return;
        }
        if (th6 != null && th7 != null) {
            jz5.a.a(th6, th7);
        }
        if (th6 == null) {
            th6 = th7;
        }
        kotlin.jvm.internal.o.d(th6);
        kotlinx.coroutines.u0.a(getDelegate$kotlinx_coroutines_core().getContext(), new kotlinx.coroutines.b1("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r7 = (kotlinx.coroutines.r2) r7.get(kotlinx.coroutines.q2.f310571d);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r13 = this;
            jz5.f0 r0 = jz5.f0.f302826a
            kotlinx.coroutines.scheduling.k r1 = r13.taskContext
            kotlin.coroutines.Continuation r2 = r13.getDelegate$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> Lb2
            kotlinx.coroutines.internal.DispatchedContinuation r2 = (kotlinx.coroutines.internal.DispatchedContinuation) r2     // Catch: java.lang.Throwable -> Lb2
            kotlin.coroutines.Continuation<T> r3 = r2.continuation     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r2 = r2.countOrElement     // Catch: java.lang.Throwable -> Lb2
            oz5.l r4 = r3.getContext()     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r2 = kotlinx.coroutines.internal.r0.c(r4, r2)     // Catch: java.lang.Throwable -> Lb2
            kotlinx.coroutines.internal.l0 r5 = kotlinx.coroutines.internal.r0.f310523a     // Catch: java.lang.Throwable -> Lb2
            r6 = 0
            if (r2 == r5) goto L20
            kotlinx.coroutines.c4 r5 = kotlinx.coroutines.m0.c(r3, r4, r2)     // Catch: java.lang.Throwable -> Lb2
            goto L21
        L20:
            r5 = r6
        L21:
            oz5.l r7 = r3.getContext()     // Catch: java.lang.Throwable -> La5
            java.lang.Object r8 = r13.takeState$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> La5
            java.lang.Throwable r9 = r13.getExceptionalResult$kotlinx_coroutines_core(r8)     // Catch: java.lang.Throwable -> La5
            if (r9 != 0) goto L44
            int r10 = r13.resumeMode     // Catch: java.lang.Throwable -> La5
            r11 = 1
            if (r10 == r11) goto L39
            r12 = 2
            if (r10 != r12) goto L38
            goto L39
        L38:
            r11 = 0
        L39:
            if (r11 == 0) goto L44
            kotlinx.coroutines.q2 r10 = kotlinx.coroutines.q2.f310571d     // Catch: java.lang.Throwable -> La5
            oz5.i r7 = r7.get(r10)     // Catch: java.lang.Throwable -> La5
            kotlinx.coroutines.r2 r7 = (kotlinx.coroutines.r2) r7     // Catch: java.lang.Throwable -> La5
            goto L45
        L44:
            r7 = r6
        L45:
            if (r7 == 0) goto L62
            boolean r10 = r7.a()     // Catch: java.lang.Throwable -> La5
            if (r10 != 0) goto L62
            java.util.concurrent.CancellationException r7 = r7.x()     // Catch: java.lang.Throwable -> La5
            r13.cancelCompletedResult$kotlinx_coroutines_core(r8, r7)     // Catch: java.lang.Throwable -> La5
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> La5
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)     // Catch: java.lang.Throwable -> La5
            java.lang.Object r7 = kotlin.Result.m521constructorimpl(r7)     // Catch: java.lang.Throwable -> La5
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> La5
            goto L7f
        L62:
            if (r9 == 0) goto L72
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> La5
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r9)     // Catch: java.lang.Throwable -> La5
            java.lang.Object r7 = kotlin.Result.m521constructorimpl(r7)     // Catch: java.lang.Throwable -> La5
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> La5
            goto L7f
        L72:
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> La5
            java.lang.Object r7 = r13.getSuccessfulResult$kotlinx_coroutines_core(r8)     // Catch: java.lang.Throwable -> La5
            java.lang.Object r7 = kotlin.Result.m521constructorimpl(r7)     // Catch: java.lang.Throwable -> La5
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> La5
        L7f:
            if (r5 == 0) goto L87
            boolean r3 = r5.k0()     // Catch: java.lang.Throwable -> Lb2
            if (r3 == 0) goto L8a
        L87:
            kotlinx.coroutines.internal.r0.a(r4, r2)     // Catch: java.lang.Throwable -> Lb2
        L8a:
            r1.getClass()     // Catch: java.lang.Throwable -> L92
            java.lang.Object r0 = kotlin.Result.m521constructorimpl(r0)     // Catch: java.lang.Throwable -> L92
            goto L9d
        L92:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m521constructorimpl(r0)
        L9d:
            java.lang.Throwable r0 = kotlin.Result.m524exceptionOrNullimpl(r0)
            r13.handleFatalException(r6, r0)
            goto Lcf
        La5:
            r3 = move-exception
            if (r5 == 0) goto Lae
            boolean r5 = r5.k0()     // Catch: java.lang.Throwable -> Lb2
            if (r5 == 0) goto Lb1
        Lae:
            kotlinx.coroutines.internal.r0.a(r4, r2)     // Catch: java.lang.Throwable -> Lb2
        Lb1:
            throw r3     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> Lbd
            r1.getClass()     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r0 = kotlin.Result.m521constructorimpl(r0)     // Catch: java.lang.Throwable -> Lbd
            goto Lc8
        Lbd:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m521constructorimpl(r0)
        Lc8:
            java.lang.Throwable r0 = kotlin.Result.m524exceptionOrNullimpl(r0)
            r13.handleFatalException(r2, r0)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.n1.run():void");
    }

    public abstract java.lang.Object takeState$kotlinx_coroutines_core();
}
