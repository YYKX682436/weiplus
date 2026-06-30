package yx0;

/* loaded from: classes5.dex */
public final class s1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pp0.p0 f467629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467630f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(pp0.p0 p0Var, yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467629e = p0Var;
        this.f467630f = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.s1(this.f467629e, this.f467630f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.s1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467628d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.maas.camstudio.MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc = this.f467630f.V;
            this.f467628d = 1;
            obj = this.f467629e.R(mJBeautyAdjustmentDesc, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
