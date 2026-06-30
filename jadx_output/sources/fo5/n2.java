package fo5;

/* loaded from: classes11.dex */
public final class n2 extends qz5.l implements yz5.p {
    public n2(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.n2(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fo5.n2 n2Var = new fo5.n2((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.pigeon.voipmp.VoIPMPV2DeviceFlutterApi voIPMPV2DeviceFlutterApi;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.Launcher", "resetDeviceInfo");
        fo5.s0 s0Var = fo5.q2.f265071d.c().f265146c;
        if (s0Var != null && (voIPMPV2DeviceFlutterApi = s0Var.f265113e) != null) {
            voIPMPV2DeviceFlutterApi.onDevicePhysicalOrientationChanged(0L, fo5.i2.f265003d);
            voIPMPV2DeviceFlutterApi.onSystemRotateLockedChanged(false, fo5.j2.f265007d);
            voIPMPV2DeviceFlutterApi.onRemoteDevicePhysicalOrientationChanged(0L, fo5.k2.f265013d);
            voIPMPV2DeviceFlutterApi.onLocalUiOrientationChanged(0L, fo5.l2.f265021d);
            voIPMPV2DeviceFlutterApi.onLocalNaturalOrientationChanged(0L, fo5.m2.f265028d);
        }
        return jz5.f0.f302826a;
    }
}
