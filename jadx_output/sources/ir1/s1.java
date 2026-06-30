package ir1;

/* loaded from: classes3.dex */
public final class s1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f294045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI f294046e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294046e = bizFansSettingUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ir1.s1(this.f294046e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ir1.s1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f294045d;
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("BizFans.BizFansSettingUI", "e = " + e17.getMessage());
        }
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f294045d = 1;
            if (kotlinx.coroutines.k1.b(800L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        ir1.r1 r1Var = new ir1.r1(this.f294046e, null);
        this.f294045d = 2;
        if (kotlinx.coroutines.l.g(g3Var, r1Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
