package hs;

/* loaded from: classes3.dex */
public final class f0 extends qz5.l implements yz5.p {
    public f0(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hs.f0(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        hs.f0 f0Var = new hs.f0((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        f0Var.invokeSuspend(f0Var2);
        return f0Var2;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (gm0.j1.b().t()) {
            long c17 = c01.id.c();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_AUTH_EX_DEVICE_TIMESTAMP_LONG, new java.lang.Long(c17));
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusNotifyFeatureService", "setExDeviceLoginTime " + c17);
        }
        return jz5.f0.f302826a;
    }
}
