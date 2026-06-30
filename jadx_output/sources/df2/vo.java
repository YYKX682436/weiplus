package df2;

/* loaded from: classes3.dex */
public final class vo extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zo f231619e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(df2.zo zoVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231619e = zoVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.vo(this.f231619e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.vo) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231618d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f231618d = 1;
            if (kotlinx.coroutines.k1.b(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        df2.zo zoVar = this.f231619e;
        android.widget.FrameLayout Z6 = zoVar.Z6();
        if ((Z6 != null ? Z6.getChildCount() : 0) <= 0) {
            com.tencent.mars.xlog.Log.i(zoVar.f231979m, "[checkRootGone]");
            android.widget.FrameLayout Z62 = zoVar.Z6();
            if (Z62 != null) {
                Z62.setVisibility(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
