package pn4;

@j95.b
/* loaded from: classes12.dex */
public final class z extends jm0.o implements cv.f1 {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f357261m = jz5.h.b(pn4.y.f357249d);

    /* renamed from: n, reason: collision with root package name */
    public tl.h f357262n;

    public static final void Zi(pn4.z zVar, android.content.Context context, java.lang.String str, kotlinx.coroutines.q qVar, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, boolean z17) {
        zVar.getClass();
        int b17 = w21.v0.b(str, true);
        tl.h d1Var = b17 != 0 ? b17 != 1 ? b17 != 2 ? new w21.d1(context) : new w21.d0(context, 1.0f) : new w21.i0(context) : new w21.d1(context);
        zVar.f357262n = d1Var;
        d1Var.i(z17);
        d1Var.b(new pn4.q(atomicBoolean, qVar));
        d1Var.a(new pn4.r(atomicBoolean, qVar));
        d1Var.j(str, true);
    }

    public final pn4.p aj() {
        return (pn4.p) ((jz5.n) this.f357261m).getValue();
    }

    public java.lang.Object bj(java.lang.String str, boolean z17, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        aj().O6(str, java.lang.System.currentTimeMillis(), new pn4.s(str, new java.util.concurrent.atomic.AtomicBoolean(false), rVar), z17, r45.jy3.INSTANT, r45.iy3.CHINESE);
        if (aVar != null) {
            aVar.invoke();
        }
        rVar.m(new pn4.t(this));
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f359186d ? j17 : jz5.f0.f302826a;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [com.tencent.mm.plugin.translate.model.TextToSpeechService$readVoiceMessageAndWait$3$downloadListener$1, com.tencent.mm.sdk.event.IListener] */
    public java.lang.Object cj(final com.tencent.mm.storage.f9 f9Var, final boolean z17, final yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        int i17;
        gm0.b bVar;
        ((ku5.t0) ku5.t0.f312615d).B(new pn4.u(this, f9Var));
        final kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        final android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (context != null) {
            cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            java.lang.String Ai = ((bv.p0) h1Var).Ai(f9Var);
            if (Ai.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.TextToSpeechService", "readVoiceMessage: fileName is empty");
                if (atomicBoolean.compareAndSet(false, true)) {
                    rVar.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
                }
            } else {
                final java.lang.String yj6 = ((k90.b) u0Var).yj(f9Var, Ai, false);
                if (com.tencent.mm.vfs.w6.j(yj6)) {
                    Zi(this, context, yj6, rVar, atomicBoolean, z17);
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    rVar.m(new pn4.v(this));
                } else {
                    w21.w0 z07 = w21.p0.Di().z0(Ai);
                    if (z07 == null || (i17 = z07.f442492i) == 99) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.TextToSpeechService", "readVoiceMessage: voice file not found and no voiceInfo");
                        if (atomicBoolean.compareAndSet(false, true)) {
                            rVar.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
                        }
                    } else {
                        if (i17 == 5 || i17 == 6) {
                            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
                            ?? r86 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoiceMsgDownloadFinishEvent>(a0Var) { // from class: com.tencent.mm.plugin.translate.model.TextToSpeechService$readVoiceMessageAndWait$3$downloadListener$1
                                {
                                    this.__eventId = -1397503360;
                                }

                                @Override // com.tencent.mm.sdk.event.IListener
                                public boolean callback(com.tencent.mm.autogen.events.VoiceMsgDownloadFinishEvent voiceMsgDownloadFinishEvent) {
                                    com.tencent.mm.autogen.events.VoiceMsgDownloadFinishEvent event = voiceMsgDownloadFinishEvent;
                                    kotlin.jvm.internal.o.g(event, "event");
                                    am.p00 p00Var = event.f54936g;
                                    if (p00Var.f7590a != com.tencent.mm.storage.f9.this.getMsgId()) {
                                        return false;
                                    }
                                    dead();
                                    if (p00Var.f7591b && com.tencent.mm.vfs.w6.j(yj6)) {
                                        pn4.z.Zi(this, context, yj6, rVar, atomicBoolean, z17);
                                        yz5.a aVar2 = aVar;
                                        if (aVar2 != null) {
                                            aVar2.invoke();
                                        }
                                    } else {
                                        com.tencent.mars.xlog.Log.w("MicroMsg.TextToSpeechService", "readVoiceMessage: download failed");
                                        if (atomicBoolean.compareAndSet(false, true)) {
                                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                            ((kotlinx.coroutines.r) rVar).resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
                                        }
                                    }
                                    return true;
                                }
                            };
                            r86.alive();
                            w21.p0.Bi().e();
                            rVar.m(new pn4.w(r86, this));
                            gm0.m b17 = gm0.j1.b();
                            com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = (b17 == null || (bVar = b17.f273245h) == null) ? null : bVar.f273145e;
                            if (lifecycleScope == null || v65.i.b(lifecycleScope, null, new pn4.x(atomicBoolean, r86, rVar, null), 1, null) == null) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.TextToSpeechService", "readVoiceMessage: scope is null");
                                rVar.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
                            }
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.TextToSpeechService", "readVoiceMessage: voice not in receiving state, status=" + z07.f442492i);
                            if (atomicBoolean.compareAndSet(false, true)) {
                                rVar.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
                            }
                        }
                    }
                }
            }
        } else if (atomicBoolean.compareAndSet(false, true)) {
            rVar.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
        }
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f359186d ? j17 : f0Var;
    }

    public void stop() {
        try {
            aj().P6();
            tl.h hVar = this.f357262n;
            if (hVar != null) {
                hVar.stop();
            }
            this.f357262n = null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextToSpeechService", e17, "stop", new java.lang.Object[0]);
        }
    }
}
