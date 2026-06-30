package df2;

/* loaded from: classes3.dex */
public final class p5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.s5 f231040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f231041f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(df2.s5 s5Var, android.widget.ImageView imageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231040e = s5Var;
        this.f231041f = imageView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.p5(this.f231040e, this.f231041f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.p5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231039d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f231039d = 1;
            obj = this.f231040e.a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f231041f.setImageBitmap(com.tencent.mm.graphics.e.c((java.lang.String) obj));
        return jz5.f0.f302826a;
    }
}
