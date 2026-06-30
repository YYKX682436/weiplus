package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class l1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f122358d;

    /* renamed from: e, reason: collision with root package name */
    public int f122359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f122360f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122361g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.q6 f122362h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(boolean z17, com.tencent.mm.plugin.finder.playlist.s1 s1Var, so2.q6 q6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f122360f = z17;
        this.f122361g = s1Var;
        this.f122362h = q6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.playlist.l1(this.f122360f, this.f122361g, this.f122362h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.playlist.l1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0124  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.playlist.l1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
