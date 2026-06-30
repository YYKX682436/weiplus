package dv2;

/* loaded from: classes2.dex */
public final class t extends qz5.l implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f243945d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ boolean f243946e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f243947f;

    public t(kotlin.coroutines.Continuation continuation) {
        super(4, continuation);
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        dv2.t tVar = new dv2.t((kotlin.coroutines.Continuation) obj4);
        tVar.f243945d = booleanValue;
        tVar.f243946e = booleanValue2;
        tVar.f243947f = (dv2.i) obj3;
        return tVar.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f243945d;
        boolean z18 = this.f243946e;
        dv2.i iVar = (dv2.i) this.f243947f;
        if (!z17 && z18) {
            return iVar;
        }
        return null;
    }
}
