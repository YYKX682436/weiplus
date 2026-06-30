package dh2;

/* loaded from: classes10.dex */
public final class m extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f232451d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f232452e;

    public m(kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        dh2.m mVar = new dh2.m((kotlin.coroutines.Continuation) obj3);
        mVar.f232451d = booleanValue;
        mVar.f232452e = (mm2.j6) obj2;
        return mVar.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f232451d;
        mm2.j6 j6Var = (mm2.j6) this.f232452e;
        mm2.i6 i6Var = j6Var instanceof mm2.i6 ? (mm2.i6) j6Var : null;
        return java.lang.Boolean.valueOf(z17 && (i6Var != null ? i6Var.f329143c : true));
    }
}
