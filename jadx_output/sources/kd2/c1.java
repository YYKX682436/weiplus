package kd2;

/* loaded from: classes2.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f306712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f306713e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.mm.protocal.protobuf.FinderObject finderObject, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f306713e = finderObject;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kd2.c1(this.f306713e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kd2.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f306712d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vn2.u0 u0Var = vn2.u0.f438387a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f306713e;
            long id6 = finderObject.getId();
            java.lang.String sessionBuffer = finderObject.getSessionBuffer();
            kd2.a1 a1Var = new kd2.a1(finderObject, null);
            kd2.b1 b1Var = new kd2.b1(null);
            this.f306712d = 1;
            if (u0Var.o(context, id6, sessionBuffer, true, null, a1Var, b1Var, this) == aVar) {
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
