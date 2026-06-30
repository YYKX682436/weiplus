package vn2;

/* loaded from: classes.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f438342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f438343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438344f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(android.content.Context context, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f438343e = context;
        this.f438344f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        vn2.o0 o0Var = new vn2.o0(this.f438343e, this.f438344f, continuation);
        o0Var.f438342d = obj;
        return o0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vn2.o0 o0Var = (vn2.o0) create((xg2.a) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        pm0.v.X(new vn2.n0(this.f438343e, this.f438344f, (xg2.a) this.f438342d));
        return jz5.f0.f302826a;
    }
}
