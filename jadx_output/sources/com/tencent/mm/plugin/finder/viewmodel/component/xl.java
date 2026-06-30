package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class xl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f136470d;

    /* renamed from: e, reason: collision with root package name */
    public int f136471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f136472f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.zl f136473g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.q6 f136474h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(boolean z17, com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar, so2.q6 q6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136472f = z17;
        this.f136473g = zlVar;
        this.f136474h = q6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.xl(this.f136472f, this.f136473g, this.f136474h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.xl) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0138  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.xl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
