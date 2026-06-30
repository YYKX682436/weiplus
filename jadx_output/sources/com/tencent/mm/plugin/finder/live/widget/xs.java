package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class xs extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f120376d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f120377e;

    /* renamed from: f, reason: collision with root package name */
    public int f120378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f120379g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f120380h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs(r45.dz1 dz1Var, com.tencent.mm.plugin.finder.live.widget.et etVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120379g = dz1Var;
        this.f120380h = etVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.xs(this.f120379g, this.f120380h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.xs) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.xs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
