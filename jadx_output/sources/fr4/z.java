package fr4;

/* loaded from: classes8.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f265889d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265889d = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fr4.z(this.f265889d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fr4.z zVar = (fr4.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        zVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "[nativeSync] calling AffNewLifeSyncManager.doSync");
            com.tencent.wechat.aff.newlife.AffNewLifeSyncManager.getInstance().doSync(9, 8, "", this.f265889d);
            com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "[nativeSync] sync completed successfully");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("W1w.W1wPersonalMsgService", "[nativeSync] sync failed", e17);
        }
        return jz5.f0.f302826a;
    }
}
