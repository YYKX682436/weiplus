package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class dd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f112268d;

    /* renamed from: e, reason: collision with root package name */
    public long f112269e;

    /* renamed from: f, reason: collision with root package name */
    public int f112270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ad f112271g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f112272h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(com.tencent.mm.plugin.finder.live.plugin.ad adVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112271g = adVar;
        this.f112272h = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.dd(this.f112271g, this.f112272h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.dd) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00ec  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.dd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
