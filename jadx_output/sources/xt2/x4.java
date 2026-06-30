package xt2;

/* loaded from: classes3.dex */
public final class x4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f457099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f457100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f457101f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(kotlin.jvm.internal.h0 h0Var, xt2.b5 b5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457100e = h0Var;
        this.f457101f = b5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xt2.x4(this.f457100e, this.f457101f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.x4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f457099d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f457099d = 1;
            if (kotlinx.coroutines.k1.b(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.ui.MMActivity mMActivity = this.f457101f.f456636h;
        this.f457100e.f310123d = com.tencent.mm.ui.widget.dialog.u3.f(mMActivity, mMActivity.getString(com.tencent.mm.R.string.ggc), false, 0, null);
        return jz5.f0.f302826a;
    }
}
