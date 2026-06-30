package im2;

/* loaded from: classes2.dex */
public final class m4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.p4 f292440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f292441e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(im2.p4 p4Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f292440d = p4Var;
        this.f292441e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new im2.m4(this.f292440d, this.f292441e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        im2.m4 m4Var = (im2.m4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        m4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        im2.p4.P6(this.f292440d);
        im2.p4 p4Var = this.f292440d;
        pf5.e.launchUI$default(p4Var, null, null, new im2.l4(p4Var, this.f292441e, null), 3, null);
        return jz5.f0.f302826a;
    }
}
