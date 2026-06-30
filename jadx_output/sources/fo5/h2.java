package fo5;

/* loaded from: classes11.dex */
public final class h2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f264998d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264998d = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.h2(this.f264998d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fo5.h2 h2Var = (fo5.h2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.pigeon.voipmp.VoIPMPV2DeviceFlutterApi voIPMPV2DeviceFlutterApi;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        fo5.s0 s0Var = fo5.q2.f265071d.c().f265146c;
        if (s0Var != null && (voIPMPV2DeviceFlutterApi = s0Var.f265113e) != null) {
            boolean z17 = this.f264998d;
            voIPMPV2DeviceFlutterApi.onSystemRotateLockedChanged(z17, new fo5.g2(z17));
        }
        return jz5.f0.f302826a;
    }
}
