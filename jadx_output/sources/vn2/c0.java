package vn2;

/* loaded from: classes.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f438246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f438247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438248f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(xg2.h hVar, kotlin.coroutines.Continuation continuation, android.content.Context context, java.lang.String str) {
        super(2, continuation);
        this.f438246d = hVar;
        this.f438247e = context;
        this.f438248f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vn2.c0(this.f438246d, continuation, this.f438247e, this.f438248f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vn2.c0 c0Var = (vn2.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        pm0.v.X(new vn2.b0(this.f438247e, this.f438248f, (xg2.a) ((xg2.b) this.f438246d).f454381b));
        return jz5.f0.f302826a;
    }
}
