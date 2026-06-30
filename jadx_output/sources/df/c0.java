package df;

/* loaded from: classes15.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f229432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df.p0 f229433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.android.RenderMode f229434f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(kotlinx.coroutines.r2 r2Var, df.p0 p0Var, io.flutter.embedding.android.RenderMode renderMode, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229432d = r2Var;
        this.f229433e = p0Var;
        this.f229434f = renderMode;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df.c0(this.f229432d, this.f229433e, this.f229434f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df.c0 c0Var = (df.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.r2 r2Var = this.f229432d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f229433e.f229532a.e(this.f229434f, true);
        return jz5.f0.f302826a;
    }
}
