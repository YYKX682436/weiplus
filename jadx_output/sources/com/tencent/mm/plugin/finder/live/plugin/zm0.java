package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class zm0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f115359d;

    /* renamed from: e, reason: collision with root package name */
    public int f115360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f115361f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f115362g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm0(com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f115361f = wn0Var;
        this.f115362g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.zm0(this.f115361f, this.f115362g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.zm0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ed  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.zm0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
