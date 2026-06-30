package km2;

/* loaded from: classes3.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f309125d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f309126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ km2.m0 f309127f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(km2.m0 m0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f309127f = m0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        km2.l0 l0Var = new km2.l0(this.f309127f, continuation);
        l0Var.f309126e = obj;
        return l0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((km2.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0063 -> B:7:0x002f). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f309125d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r10.f309126e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r1
            goto L2e
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            java.lang.Object r1 = r10.f309126e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r11)
            r4 = r1
            r1 = r10
            goto L48
        L27:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f309126e
            kotlinx.coroutines.y0 r11 = (kotlinx.coroutines.y0) r11
        L2e:
            r1 = r10
        L2f:
            boolean r4 = kotlinx.coroutines.z0.h(r11)
            if (r4 != 0) goto L36
            goto L65
        L36:
            km2.m0 r4 = r1.f309127f
            km2.k0 r4 = r4.f309143a
            r1.f309126e = r11
            r1.f309125d = r3
            java.lang.Object r4 = r4.c(r1)
            if (r4 != r0) goto L45
            return r0
        L45:
            r9 = r4
            r4 = r11
            r11 = r9
        L48:
            km2.j0 r11 = (km2.j0) r11
            boolean r5 = r11.f309112a
            if (r5 == 0) goto L65
            km2.m0 r5 = r1.f309127f
            long r5 = r5.f309145c
            long r7 = r11.f309113b
            long r5 = java.lang.Math.max(r7, r5)
            r1.f309126e = r4
            r1.f309125d = r2
            java.lang.Object r11 = kotlinx.coroutines.k1.b(r5, r1)
            if (r11 != r0) goto L63
            return r0
        L63:
            r11 = r4
            goto L2f
        L65:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: km2.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
