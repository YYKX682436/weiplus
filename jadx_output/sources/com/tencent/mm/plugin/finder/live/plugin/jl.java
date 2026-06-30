package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f113132d;

    /* renamed from: e, reason: collision with root package name */
    public int f113133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az2.j f113134f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f113135g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vg2.m f113136h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(az2.j jVar, com.tencent.mm.plugin.finder.live.plugin.hm hmVar, vg2.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113134f = jVar;
        this.f113135g = hmVar;
        this.f113136h = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.jl(this.f113134f, this.f113135g, this.f113136h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.jl) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f113133e
            vg2.m r3 = r0.f113136h
            com.tencent.mm.plugin.finder.live.plugin.hm r4 = r0.f113135g
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L35
            if (r2 == r7) goto L2f
            if (r2 == r6) goto L27
            if (r2 != r5) goto L1f
            java.lang.Object r1 = r0.f113132d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r17)
            goto L91
        L1f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L27:
            java.lang.Object r2 = r0.f113132d
            xg2.h r2 = (xg2.h) r2
            kotlin.ResultKt.throwOnFailure(r17)
            goto L75
        L2f:
            kotlin.ResultKt.throwOnFailure(r17)
            r2 = r17
            goto L57
        L35:
            kotlin.ResultKt.throwOnFailure(r17)
            az2.j r2 = r0.f113134f
            android.view.ViewGroup r9 = r4.f365323d
            android.content.Context r10 = r9.getContext()
            java.lang.String r9 = "getContext(...)"
            kotlin.jvm.internal.o.f(r10, r9)
            r11 = 0
            r12 = 0
            r14 = 6
            r15 = 0
            r9 = r2
            az2.j.u(r9, r10, r11, r12, r14, r15)
            r0.f113133e = r7
            java.lang.Object r2 = xg2.g.d(r2, r8, r0, r7, r8)
            if (r2 != r1) goto L57
            return r1
        L57:
            xg2.h r2 = (xg2.h) r2
            boolean r7 = r2 instanceof xg2.i
            if (r7 == 0) goto L75
            oz5.l r7 = r2.f454392a
            if (r7 != 0) goto L65
            oz5.l r7 = r16.getContext()
        L65:
            com.tencent.mm.plugin.finder.live.plugin.il r9 = new com.tencent.mm.plugin.finder.live.plugin.il
            r9.<init>(r2, r8, r4, r3)
            r0.f113132d = r2
            r0.f113133e = r6
            java.lang.Object r4 = kotlinx.coroutines.l.g(r7, r9, r0)
            if (r4 != r1) goto L75
            return r1
        L75:
            boolean r4 = r2 instanceof xg2.b
            if (r4 == 0) goto L91
            oz5.l r4 = r2.f454392a
            if (r4 != 0) goto L81
            oz5.l r4 = r16.getContext()
        L81:
            com.tencent.mm.plugin.finder.live.plugin.hl r6 = new com.tencent.mm.plugin.finder.live.plugin.hl
            r6.<init>(r2, r8, r3)
            r0.f113132d = r2
            r0.f113133e = r5
            java.lang.Object r2 = kotlinx.coroutines.l.g(r4, r6, r0)
            if (r2 != r1) goto L91
            return r1
        L91:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.jl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
