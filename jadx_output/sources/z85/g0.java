package z85;

/* loaded from: classes2.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f470797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f470798e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f470798e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new z85.g0(this.f470798e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((z85.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17 = this.f470798e;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f470797d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mars.xlog.Log.i("MicroMsg.SwitchLocalEmojiRecommendCgi", "sending request: enabled=" + z17);
                z85.h0 h0Var = new z85.h0(z17);
                this.f470797d = 1;
                obj = rm0.h.a(h0Var, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SwitchLocalEmojiRecommendCgi", "received response: " + ((r45.qi6) obj));
        } catch (rm0.j e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SwitchLocalEmojiRecommendCgi", "SwitchLocalEmojiRecommendRequest: " + e17.getLocalizedMessage());
        }
        return jz5.f0.f302826a;
    }
}
