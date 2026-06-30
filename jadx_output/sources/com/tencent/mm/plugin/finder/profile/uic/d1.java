package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC f123605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ob1 f123606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f123607f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC finderProfileAllLayoutUIC, r45.ob1 ob1Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f123605d = finderProfileAllLayoutUIC;
        this.f123606e = ob1Var;
        this.f123607f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.profile.uic.d1(this.f123605d, this.f123606e, this.f123607f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.profile.uic.d1 d1Var = (com.tencent.mm.plugin.finder.profile.uic.d1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ce  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.profile.uic.d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
