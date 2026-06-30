package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ad0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f111871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f111872e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad0(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f111872e = nd0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.ad0(this.f111872e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.ad0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r5.f310292f == r3) goto L18;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f111871d
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            kotlin.ResultKt.throwOnFailure(r8)
            goto L52
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            kotlin.ResultKt.throwOnFailure(r8)
            com.tencent.mm.plugin.finder.live.plugin.nd0 r8 = r7.f111872e
            java.lang.Class<mm2.n0> r1 = mm2.n0.class
            androidx.lifecycle.c1 r1 = r8.P0(r1)
            mm2.n0 r1 = (mm2.n0) r1
            kotlinx.coroutines.flow.f3 r1 = r1.f329271p
            if (r1 == 0) goto L52
            com.tencent.mm.plugin.finder.live.plugin.yc0 r3 = com.tencent.mm.plugin.finder.live.plugin.yc0.f115185d
            kotlinx.coroutines.flow.d0 r4 = kotlinx.coroutines.flow.d0.f310226d
            r5 = 2
            kotlin.jvm.internal.m0.e(r3, r5)
            boolean r5 = r1 instanceof kotlinx.coroutines.flow.i
            if (r5 == 0) goto L3e
            r5 = r1
            kotlinx.coroutines.flow.i r5 = (kotlinx.coroutines.flow.i) r5
            yz5.l r6 = r5.f310291e
            if (r6 != r4) goto L3e
            yz5.p r5 = r5.f310292f
            if (r5 != r3) goto L3e
            goto L44
        L3e:
            kotlinx.coroutines.flow.i r5 = new kotlinx.coroutines.flow.i
            r5.<init>(r1, r4, r3)
            r1 = r5
        L44:
            com.tencent.mm.plugin.finder.live.plugin.zc0 r3 = new com.tencent.mm.plugin.finder.live.plugin.zc0
            r3.<init>(r8)
            r7.f111871d = r2
            java.lang.Object r8 = r1.a(r3, r7)
            if (r8 != r0) goto L52
            return r0
        L52:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ad0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
