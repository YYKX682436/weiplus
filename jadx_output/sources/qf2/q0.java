package qf2;

/* loaded from: classes3.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f362541e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(qf2.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362541e = v0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.q0(this.f362541e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0038 -> B:5:0x003c). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f362540d
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r8)
            r1 = r0
            r0 = r7
            goto L3c
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.ResultKt.throwOnFailure(r8)
            r3 = 0
            r8 = r7
        L1d:
            java.lang.Class<mm2.c1> r1 = mm2.c1.class
            qf2.v0 r5 = r8.f362541e
            androidx.lifecycle.c1 r1 = r5.business(r1)
            mm2.c1 r1 = (mm2.c1) r1
            boolean r1 = r1.a8()
            if (r1 == 0) goto L45
            r8.f362540d = r2
            java.lang.String r1 = "timeSEISync"
            java.lang.Object r1 = qf2.v0.a7(r5, r3, r1, r8)
            if (r1 != r0) goto L38
            return r0
        L38:
            r6 = r0
            r0 = r8
            r8 = r1
            r1 = r6
        L3c:
            java.lang.Number r8 = (java.lang.Number) r8
            long r3 = r8.longValue()
            r8 = r0
            r0 = r1
            goto L1d
        L45:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
