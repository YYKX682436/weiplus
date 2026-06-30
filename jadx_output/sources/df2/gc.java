package df2;

/* loaded from: classes3.dex */
public final class gc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.jc f230210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(df2.jc jcVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230210d = jcVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.gc(this.f230210d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.gc gcVar = (df2.gc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gcVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        zl2.r4 r4Var = zl2.r4.f473950a;
        df2.jc jcVar = this.f230210d;
        boolean I1 = r4Var.I1(jcVar.getStore().getLiveRoomData());
        com.tencent.mars.xlog.Log.i("LiveAnchorDataPanelController", "onLiveMsg: isStartPolling=" + jcVar.f230466m + ", isDataPanelEnable=" + I1);
        if (!jcVar.f230466m) {
            df2.jc.Z6(jcVar, "onLiveMsg");
        } else if (!I1) {
            jcVar.d7("onLiveMsgDisable");
        }
        return jz5.f0.f302826a;
    }
}
