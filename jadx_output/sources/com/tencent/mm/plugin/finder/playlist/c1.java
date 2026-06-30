package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f122270d;

    /* renamed from: e, reason: collision with root package name */
    public int f122271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.q6 f122273g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f122274h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f122275i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.mm.plugin.finder.playlist.s1 s1Var, so2.q6 q6Var, yz5.l lVar, java.lang.Long l17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f122272f = s1Var;
        this.f122273g = q6Var;
        this.f122274h = lVar;
        this.f122275i = l17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.playlist.c1(this.f122272f, this.f122273g, this.f122274h, this.f122275i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.playlist.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0176  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.playlist.c1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
