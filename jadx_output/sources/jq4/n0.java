package jq4;

/* loaded from: classes5.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f301173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f301174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301175f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.widget.ImageView imageView, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f301174e = imageView;
        this.f301175f = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jq4.n0(this.f301174e, this.f301175f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jq4.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f301173d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.widget.ImageView imageView = this.f301174e;
            android.graphics.Bitmap f07 = com.tencent.mm.sdk.platformtools.x.f0(com.tencent.mm.R.drawable.f482207ch5, null, null, null, false, 0.0f, imageView.getWidth(), imageView.getHeight());
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            jq4.m0 m0Var = new jq4.m0(imageView, this.f301175f, f07, null);
            this.f301173d = 1;
            if (kotlinx.coroutines.l.g(g3Var, m0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
