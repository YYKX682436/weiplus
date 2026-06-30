package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ib f135751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f135752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.t0 f135753f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135754g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(r45.ib ibVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.viewmodel.component.t0 t0Var, in5.s0 s0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f135751d = ibVar;
        this.f135752e = baseFinderFeed;
        this.f135753f = t0Var;
        this.f135754g = s0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.r0(this.f135751d, this.f135752e, this.f135753f, this.f135754g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.r0 r0Var = (com.tencent.mm.plugin.finder.viewmodel.component.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
