package df2;

/* loaded from: classes3.dex */
public final class le extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f230659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f230660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xm1 f230661f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, r45.xm1 xm1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230659d = bitmap;
        this.f230660e = bitmap2;
        this.f230661f = xm1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.le(this.f230659d, this.f230660e, this.f230661f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.le) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.xm1 xm1Var = this.f230661f;
        android.graphics.Bitmap bitmap = this.f230659d;
        if (bitmap != null) {
            dk2.ef efVar = dk2.ef.f233372a;
            dk2.ef.f233411z.put(xm1Var.getInteger(0) + "_white", bitmap);
        }
        android.graphics.Bitmap bitmap2 = this.f230660e;
        if (bitmap2 == null) {
            return null;
        }
        dk2.ef efVar2 = dk2.ef.f233372a;
        dk2.ef.f233411z.put(xm1Var.getInteger(0) + "_#DEE9FF", bitmap2);
        return jz5.f0.f302826a;
    }
}
