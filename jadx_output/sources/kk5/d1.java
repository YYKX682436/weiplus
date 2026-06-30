package kk5;

/* loaded from: classes8.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.i1 f308631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308632e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(kk5.i1 i1Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f308631d = i1Var;
        this.f308632e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kk5.d1(this.f308631d, this.f308632e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kk5.d1 d1Var = (kk5.d1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kk5.i1 i1Var = this.f308631d;
        i1Var.getContext().grantUriPermission(this.f308632e, (android.net.Uri) ((jz5.n) i1Var.f308658i).getValue(), 193);
        return jz5.f0.f302826a;
    }
}
