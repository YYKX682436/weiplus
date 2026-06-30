package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class p90 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f113844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f113845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ea0 f113846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f113847g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f113848h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f113849i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p90(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var, boolean z17, cm2.m0 m0Var, r45.y23 y23Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113845e = finderJumpInfo;
        this.f113846f = ea0Var;
        this.f113847g = z17;
        this.f113848h = m0Var;
        this.f113849i = y23Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.p90(this.f113845e, this.f113846f, this.f113847g, this.f113848h, this.f113849i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.p90) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0136  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.p90.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
