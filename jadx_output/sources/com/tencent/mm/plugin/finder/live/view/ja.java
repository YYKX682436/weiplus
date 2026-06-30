package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class ja extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f116419d;

    /* renamed from: e, reason: collision with root package name */
    public int f116420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.ka f116421f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f116422g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(com.tencent.mm.plugin.finder.live.view.ka kaVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f116421f = kaVar;
        this.f116422g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.view.ja(this.f116421f, this.f116422g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.view.ja) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0107  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.ja.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
