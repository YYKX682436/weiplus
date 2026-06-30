package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class j3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117156d;

    /* renamed from: e, reason: collision with root package name */
    public int f117157e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f117158f;

    /* renamed from: g, reason: collision with root package name */
    public int f117159g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.m3 f117160h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.tencent.mm.plugin.finder.live.viewmodel.m3 m3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117160h = m3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.j3(this.f117160h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.j3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0042 -> B:5:0x0045). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f117159g
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L16
            int r1 = r8.f117157e
            int r3 = r8.f117156d
            java.lang.Object r4 = r8.f117158f
            com.tencent.mm.plugin.finder.live.viewmodel.m3 r4 = (com.tencent.mm.plugin.finder.live.viewmodel.m3) r4
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r8
            goto L45
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            kotlin.ResultKt.throwOnFailure(r9)
            com.tencent.mm.plugin.finder.live.viewmodel.m3 r9 = r8.f117160h
            r1 = 60
            r9.f117242f = r1
            r9.X6()
            int r1 = r9.f117242f
            r3 = 0
            r4 = r9
            r9 = r8
            r7 = r3
            r3 = r1
            r1 = r7
        L32:
            if (r1 >= r3) goto L50
            r9.f117158f = r4
            r9.f117156d = r3
            r9.f117157e = r1
            r9.f117159g = r2
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r5 = kotlinx.coroutines.k1.b(r5, r9)
            if (r5 != r0) goto L45
            return r0
        L45:
            int r5 = r4.f117242f
            int r5 = r5 + (-1)
            r4.f117242f = r5
            r4.X6()
            int r1 = r1 + r2
            goto L32
        L50:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.j3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
