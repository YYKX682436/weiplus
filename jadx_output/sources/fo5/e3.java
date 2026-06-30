package fo5;

/* loaded from: classes14.dex */
public final class e3 extends qz5.l implements yz5.p {
    public e3(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.e3(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fo5.e3 e3Var = new fo5.e3((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        fo5.a aVar2 = fo5.f3.f264986c;
        if (aVar2 != null) {
            fo5.r0 r0Var = (fo5.r0) aVar2;
            ro5.b bVar = r0Var.f265097p;
            if (bVar == null) {
                kotlin.jvm.internal.o.o("renderController");
                throw null;
            }
            bVar.x();
            io5.e eVar = r0Var.f265098q;
            if (eVar.f293534b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPDeviceController", "device controller already started, ignore duplicate start call");
            } else {
                eVar.f293534b = true;
                eVar.f293535c = 0;
                eVar.f293539g = 1;
                eVar.f293537e = false;
                eVar.f293536d = 0;
                eVar.e();
                eVar.b();
                io5.a aVar3 = eVar.f293542j;
                aVar3.getClass();
                eVar.d(android.provider.Settings.System.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "accelerometer_rotation", 0) == 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPDeviceController", "initCurrentOri: uiRotate " + eVar.f293535c + ", systemRotateLocked = " + eVar.f293537e + ", naturalOrientation " + eVar.f293539g);
                di3.d dVar = new di3.d(com.tencent.mm.sdk.platformtools.x2.f193071a);
                dVar.f232689g = new io5.c(eVar);
                eVar.f293543k = dVar;
                dVar.enable();
                eVar.f293541i.registerContentObserver(android.provider.Settings.System.getUriFor("accelerometer_rotation"), true, aVar3);
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPDeviceController", "device controller started");
            }
            r0Var.x();
        }
        return jz5.f0.f302826a;
    }
}
