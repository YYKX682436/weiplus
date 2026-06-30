package rb2;

/* loaded from: classes3.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.d1 f393846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f393848f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(rb2.d1 d1Var, java.lang.String str, android.graphics.Bitmap bitmap, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f393846d = d1Var;
        this.f393847e = str;
        this.f393848f = bitmap;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rb2.z0(this.f393846d, this.f393847e, this.f393848f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rb2.z0 z0Var = (rb2.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = rb2.d1.f393604i;
        rb2.d1 d1Var = this.f393846d;
        d1Var.a(this.f393847e);
        d1Var.f393607f = this.f393848f;
        d1Var.notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}
