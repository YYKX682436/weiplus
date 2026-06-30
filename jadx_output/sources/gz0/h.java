package gz0;

/* loaded from: classes13.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f277661a;

    /* renamed from: b, reason: collision with root package name */
    public final long f277662b;

    /* renamed from: c, reason: collision with root package name */
    public final long f277663c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f277664d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.thumbplayer.api.ITPPlayer f277665e;

    /* renamed from: f, reason: collision with root package name */
    public final gz0.d f277666f;

    public h(java.lang.String playUrl, long j17, long j18, int i17, kotlin.jvm.internal.i iVar) {
        j18 = (i17 & 4) != 0 ? -1L : j18;
        kotlin.jvm.internal.o.g(playUrl, "playUrl");
        this.f277661a = playUrl;
        this.f277662b = j17;
        this.f277663c = j18;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f277664d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipCallingStatusEvent>(a0Var) { // from class: com.tencent.mm.mj_template.sns.MusicPlayer$voipCallEventListener$1
            {
                this.__eventId = 1965200980;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipCallingStatusEvent voipCallingStatusEvent) {
                com.tencent.thumbplayer.api.ITPPlayer iTPPlayer;
                com.tencent.mm.autogen.events.VoipCallingStatusEvent event = voipCallingStatusEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (!gm0.j1.a()) {
                    return false;
                }
                int i18 = event.f54942g.f8161d;
                gz0.h hVar = gz0.h.this;
                if (i18 == 11) {
                    com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = hVar.f277665e;
                    if (iTPPlayer2 != null) {
                        iTPPlayer2.setAudioGainRatio(1.0f);
                    }
                } else if (i18 == 7 && (iTPPlayer = hVar.f277665e) != null) {
                    iTPPlayer.setAudioGainRatio(0.0f);
                }
                return true;
            }
        };
        this.f277666f = new gz0.d();
    }

    public final void a() {
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicPlayer", "pausePlay: " + this.f277665e);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f277665e;
            if (iTPPlayer != null) {
                iTPPlayer.pause();
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MusicPlayer", "pausePlay: error", m524exceptionOrNullimpl);
        }
    }

    public final void b() {
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicPlayer", "resumePlay: " + this.f277665e);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f277665e;
            if (iTPPlayer != null) {
                iTPPlayer.start();
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MusicPlayer", "resumePlay: error", m524exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof gz0.e
            if (r0 == 0) goto L13
            r0 = r7
            gz0.e r0 = (gz0.e) r0
            int r1 = r0.f277658g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f277658g = r1
            goto L18
        L13:
            gz0.e r0 = new gz0.e
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f277656e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f277658g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L7a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            java.lang.Object r2 = r0.f277655d
            gz0.h r2 = (gz0.h) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L62
        L3a:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "startPlay: "
            r7.<init>(r2)
            java.lang.String r2 = r6.f277661a
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.String r2 = "MicroMsg.MusicPlayer"
            com.tencent.mars.xlog.Log.i(r2, r7)
            com.tencent.thumbplayer.api.ITPPlayer r7 = r6.f277665e
            if (r7 == 0) goto L61
            r0.f277655d = r6
            r0.f277658g = r4
            java.lang.Object r7 = r6.d(r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            r2 = r6
        L62:
            com.tencent.mm.sdk.event.IListener r7 = r2.f277664d
            r7.alive()
            kotlinx.coroutines.p0 r7 = kotlinx.coroutines.q1.f310570c
            gz0.f r4 = new gz0.f
            r5 = 0
            r4.<init>(r2, r5)
            r0.f277655d = r5
            r0.f277658g = r3
            java.lang.Object r7 = kotlinx.coroutines.l.g(r7, r4, r0)
            if (r7 != r1) goto L7a
            return r1
        L7a:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gz0.h.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object d(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicPlayer", "stopPlay: " + this.f277661a);
        this.f277664d.dead();
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new gz0.g(this, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }
}
