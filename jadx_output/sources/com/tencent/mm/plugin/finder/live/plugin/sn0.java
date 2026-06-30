package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class sn0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f114284d;

    /* renamed from: e, reason: collision with root package name */
    public int f114285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f114286f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f114287g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.c04 f114288h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f114289i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.q f114290m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn0(com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var, int i17, r45.c04 c04Var, yz5.a aVar, yz5.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114286f = wn0Var;
        this.f114287g = i17;
        this.f114288h = c04Var;
        this.f114289i = aVar;
        this.f114290m = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.sn0(this.f114286f, this.f114287g, this.f114288h, this.f114289i, this.f114290m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.sn0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0105  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.sn0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
