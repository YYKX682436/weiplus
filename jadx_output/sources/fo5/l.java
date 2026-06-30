package fo5;

/* loaded from: classes14.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f265014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f265015e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(fo5.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265015e = r0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.l(this.f265015e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fo5.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f265014d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "before call end");
            if (this.f265015e.k()) {
                com.tencent.mm.autogen.events.MultiTalkActionEvent multiTalkActionEvent = new com.tencent.mm.autogen.events.MultiTalkActionEvent();
                multiTalkActionEvent.f54504g.f6259a = 0;
                multiTalkActionEvent.e();
            }
            nq4.e.f339008a.a();
            if (this.f265015e.a()) {
                nq4.f.f339014a.d();
            }
            ((jp5.o) i95.n0.c(jp5.o.class)).y9();
            if (this.f265015e.n()) {
                this.f265015e.f265088g.b();
            }
            co5.c.f43814a.b();
            go5.x xVar = this.f265015e.f265088g;
            xVar.f274156h = false;
            go5.g0 f17 = xVar.f();
            f17.getClass();
            i95.m c17 = i95.n0.c(cv.w0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            cv.w0.f9((cv.w0) c17, 0, null, 2, null);
            ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).oj(f17.f274133b);
            ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).release();
            go5.z c18 = xVar.c();
            f25.m0 m0Var = c18.f274157a;
            if (m0Var != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            }
            c18.f274157a = null;
            go5.c0 c0Var = (go5.c0) xVar.d();
            c0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioPlayerImpl", "release: ");
            com.tencent.mm.plugin.voip.model.e eVar = c0Var.f274124a;
            if (eVar != null) {
                eVar.e();
            }
            com.tencent.mm.plugin.voip.model.e eVar2 = c0Var.f274124a;
            if (eVar2 != null) {
                eVar2.f();
            }
            c0Var.f274124a = null;
            ((go5.k) xVar.e()).a();
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.VoIPMPAudioController", "release");
            hp5.e eVar3 = this.f265015e.f265091j;
            if (eVar3 != null) {
                eVar3.a();
            }
            fo5.r0 r0Var = this.f265015e;
            r0Var.f265091j = null;
            r0Var.f265090i.g();
            io5.e eVar4 = this.f265015e.f265098q;
            if (eVar4.f293534b) {
                eVar4.f293534b = false;
                di3.d dVar = eVar4.f293543k;
                if (dVar != null) {
                    dVar.disable();
                }
                di3.d dVar2 = eVar4.f293543k;
                if (dVar2 != null) {
                    dVar2.f232689g = null;
                }
                eVar4.f293543k = null;
                eVar4.f293541i.unregisterContentObserver(eVar4.f293542j);
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPDeviceController", "device controller stopped");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPDeviceController", "device controller not started, ignore stop call");
            }
            qo5.b.f365663a.a();
            ro5.b bVar = this.f265015e.f265097p;
            if (bVar == null) {
                kotlin.jvm.internal.o.o("renderController");
                throw null;
            }
            bVar.B();
            lo5.h.b(this.f265015e.f265095n, false, 1, null);
            jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
            this.f265014d = 1;
            if (oVar.x4(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        hp5.l lVar = this.f265015e.f265092k;
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPSystemStatusController", "unregisterScreenBroadcastReceiver: ");
        if (lVar.f282960a) {
            lVar.f282960a = false;
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver((com.tencent.mm.voipmp.v2.sensor.VoIPMPSystemStatusController$screenStateReceiver$2$1) ((jz5.n) lVar.f282961b).getValue());
        }
        fo5.r0 r0Var2 = this.f265015e;
        r0Var2.f265087f = null;
        r0Var2.I = null;
        r0Var2.f265082J = false;
        if (!r0Var2.k()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "playEndSound() called");
            gp5.g gVar = r0Var2.f265096o;
            gVar.getClass();
            ((ku5.t0) ku5.t0.f312615d).g(new gp5.f(gVar));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "call end");
        return jz5.f0.f302826a;
    }
}
