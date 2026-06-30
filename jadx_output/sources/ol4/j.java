package ol4;

/* loaded from: classes14.dex */
public final class j implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f346158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f346159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f346160f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f346161g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f346162h;

    public j(ol4.q qVar, kotlin.jvm.internal.c0 c0Var, long j17, float f17, long j18) {
        this.f346158d = qVar;
        this.f346159e = c0Var;
        this.f346160f = j17;
        this.f346161g = f17;
        this.f346162h = j18;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public final void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        ol4.q qVar = this.f346158d;
        boolean z17 = true;
        qVar.f346190l = true;
        kk4.c cVar = qVar.f346180b;
        int videoWidth = ((kk4.f0) cVar).getVideoWidth();
        int videoHeight = ((kk4.f0) cVar).getVideoHeight();
        long durationMs = ((kk4.f0) cVar).getDurationMs();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Ting-Trace-Time-Native, onPrepared! isPreload:");
        sb6.append(qVar.f346194p);
        sb6.append(", onlyPrepareWhenPlay:");
        kotlin.jvm.internal.c0 c0Var = this.f346159e;
        sb6.append(c0Var.f310112d);
        sb6.append(", hasCallStop:");
        sb6.append(qVar.f346188j);
        sb6.append(", hasCallPause:");
        sb6.append(qVar.f346189k);
        sb6.append(", videoWidth:");
        sb6.append(videoWidth);
        sb6.append(", videoHeight:");
        sb6.append(videoHeight);
        sb6.append(", duration:");
        sb6.append(durationMs);
        sb6.append(", hasCallPlay:");
        sb6.append(qVar.f346191m);
        sb6.append(", internalOnPreparedCallback:");
        sb6.append(qVar.f346198t != null);
        sb6.append(", hasCallInitSeek:");
        sb6.append(qVar.f346185g);
        sb6.append(", startTime:");
        long j17 = this.f346160f;
        sb6.append(j17);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = qVar.f346197s;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (qVar.f346188j || qVar.f346189k) {
            com.tencent.mars.xlog.Log.i(str, "has call stop " + qVar.f346188j + ", has call pause " + qVar.f346189k);
            return;
        }
        if (!qVar.f346185g) {
            if (j17 > 0 && j17 < ((kk4.f0) cVar).getDurationMs()) {
                qVar.seek(j17);
            }
            qVar.c(this.f346161g);
            qVar.f346185g = true;
        }
        int propertyLong = (int) ((kk4.f0) cVar).getPropertyLong(103);
        int propertyLong2 = (int) ((kk4.f0) cVar).getPropertyLong(105);
        if (qVar.t()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (qVar.u()) {
                ll4.b bVar = qVar.f346204z;
                if (bVar != null) {
                    bw5.y1 y1Var = new bw5.y1();
                    y1Var.f35305e = propertyLong2;
                    boolean[] zArr = y1Var.f35308h;
                    zArr[2] = true;
                    y1Var.f35306f = propertyLong;
                    zArr[3] = true;
                    y1Var.f35304d = bw5.x1.PCMFormatS16LE;
                    zArr[1] = true;
                    y1Var.f35307g = true;
                    zArr[4] = true;
                    bw5.lp0 lp0Var = qVar.f346183e;
                    if (lp0Var == null) {
                        kotlin.jvm.internal.o.o("mPlayingItem");
                        throw null;
                    }
                    boolean z18 = lp0Var.d().f34189e == 2;
                    bw5.b2 b2Var = new bw5.b2();
                    b2Var.f25484d = y1Var;
                    boolean[] zArr2 = b2Var.f25494q;
                    zArr2[1] = true;
                    bw5.lp0 lp0Var2 = qVar.f346183e;
                    if (lp0Var2 == null) {
                        kotlin.jvm.internal.o.o("mPlayingItem");
                        throw null;
                    }
                    b2Var.f25485e = lp0Var2.c().f27469x;
                    zArr2[2] = true;
                    bw5.lp0 lp0Var3 = qVar.f346183e;
                    if (lp0Var3 == null) {
                        kotlin.jvm.internal.o.o("mPlayingItem");
                        throw null;
                    }
                    b2Var.f25486f = lp0Var3.c().f27465t;
                    zArr2[3] = true;
                    bw5.lp0 lp0Var4 = qVar.f346183e;
                    if (lp0Var4 == null) {
                        kotlin.jvm.internal.o.o("mPlayingItem");
                        throw null;
                    }
                    b2Var.f25487g = lp0Var4.c().f27466u;
                    zArr2[4] = true;
                    b2Var.f25488h = qVar.s() && ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).bj();
                    zArr2[5] = true;
                    b2Var.f25489i = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di();
                    zArr2[6] = true;
                    b2Var.f25491n = z18 ? 2 : 3;
                    zArr2[8] = true;
                    b2Var.f25490m = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ni();
                    zArr2[7] = true;
                    b2Var.f25492o = false;
                    zArr2[9] = true;
                    bw5.lp0 lp0Var5 = qVar.f346183e;
                    if (lp0Var5 == null) {
                        kotlin.jvm.internal.o.o("mPlayingItem");
                        throw null;
                    }
                    java.lang.String listenId = lp0Var5.d().getListenId();
                    kotlin.jvm.internal.o.f(listenId, "getListenId(...)");
                    jm4.m0 m0Var = (jm4.m0) ((kl4.q) bVar).f308959a.f308877q.lock();
                    if (m0Var != null) {
                        byte[] byteArray = b2Var.toByteArray();
                        long cppPointer = ((jm4.n0) m0Var).getCppPointer();
                        kotlin.jvm.internal.o.d(byteArray);
                        urgen.ur_0025.UR_24F6.UR_844B(cppPointer, byteArray, listenId);
                    }
                }
            } else {
                com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPAudioMixTts tingTPAudioMixTts = qVar.f346200v;
                boolean booleanValue = tingTPAudioMixTts != null ? java.lang.Boolean.valueOf(tingTPAudioMixTts.setupMetaInfo(propertyLong, propertyLong2)).booleanValue() : false;
                com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPAudioEnhance tingTPAudioEnhance = qVar.f346202x;
                z17 = tingTPAudioEnhance != null ? java.lang.Boolean.valueOf(tingTPAudioEnhance.setupMetaInfo(propertyLong, propertyLong2)).booleanValue() : booleanValue;
                com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPHearingAid tingTPHearingAid = qVar.f346201w;
                if (tingTPHearingAid != null) {
                    z17 = java.lang.Boolean.valueOf(tingTPHearingAid.setupMetaInfo(propertyLong, propertyLong2)).booleanValue();
                }
            }
            if (z17 || qVar.f346203y != null) {
                ((kk4.f0) cVar).setOnAudioProcessFrameOutputListener(qVar.B);
            }
            com.tencent.mars.xlog.Log.i(str, "initPostProcess ret: " + z17 + ", cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", isEnableAudioPostProcessPlugin: " + qVar.u());
        }
        yz5.l lVar = qVar.f346198t;
        if (lVar != null) {
            lVar.invoke(qVar);
        }
        com.tencent.mars.xlog.Log.i(str, "Ting-Trace-Time-Native, onPrepared callback isPreload " + qVar.f346194p + ", onlyPrepareWhenPlay " + c0Var.f310112d + ", hasCallPlay " + qVar.f346191m + ", duration " + qVar.k() + ", cost: " + (java.lang.System.currentTimeMillis() - this.f346162h));
        if ((qVar.f346194p || c0Var.f310112d) && !qVar.f346191m) {
            return;
        }
        ((kk4.f0) cVar).start();
    }
}
