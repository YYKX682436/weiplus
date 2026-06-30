package fz4;

/* loaded from: classes12.dex */
public final class m implements com.tencent.mm.modelbase.x0, com.tencent.mm.modelbase.y0, com.tencent.mm.modelbase.z0, com.tencent.mm.modelbase.b1, com.tencent.mm.sdk.platformtools.q7 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f267318d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f267320f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f267321g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.s7 f267322h;

    /* renamed from: m, reason: collision with root package name */
    public int f267324m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.SensorController f267325n;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.modelbase.c1 f267327p;

    /* renamed from: e, reason: collision with root package name */
    public boolean f267319e = true;

    /* renamed from: i, reason: collision with root package name */
    public long f267323i = -1;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f267326o = new java.util.ArrayList();

    public m() {
        if (this.f267325n == null) {
            this.f267325n = new com.tencent.mm.sdk.platformtools.SensorController(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        if (this.f267322h == null) {
            this.f267322h = new com.tencent.mm.sdk.platformtools.s7(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
    }

    @Override // com.tencent.mm.modelbase.y0
    public void a() {
        com.tencent.mars.xlog.Log.e("MicroMsg.WeNoteVoicePlayerControl", "on error, do stop play");
        j();
    }

    public final void b() {
        j();
        this.f267325n = null;
        this.f267322h = null;
        ((java.util.ArrayList) this.f267326o).clear();
        com.tencent.mm.modelbase.c1 c1Var = this.f267327p;
        if (c1Var != null) {
            sl.j jVar = (sl.j) c1Var;
            jVar.f409043p = null;
            jVar.f409042o = null;
            jVar.i();
        }
        this.f267327p = null;
    }

    @Override // com.tencent.mm.modelbase.z0
    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteVoicePlayerControl", "on pause!!");
    }

    public final double d() {
        com.tencent.mm.modelbase.c1 c1Var = this.f267327p;
        if (c1Var != null) {
            return ((sl.j) c1Var).a();
        }
        return 0.0d;
    }

    public final com.tencent.mm.modelbase.c1 e() {
        com.tencent.mm.modelbase.c1 c1Var = this.f267327p;
        if (c1Var == null) {
            jz5.f0 f0Var = null;
            sl.j jVar = ((com.tencent.mm.modelbase.d1) i95.n0.c(com.tencent.mm.modelbase.d1.class)) != null ? new sl.j(com.tencent.mm.sdk.platformtools.x2.f193071a, 0) : null;
            this.f267327p = jVar;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(jVar != null ? jVar.hashCode() : 0);
            objArr[1] = this.f267318d;
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteVoicePlayerControl", "getPlayer: created new player instance, hashCode=%d, path=%s", objArr);
            java.lang.Object l17 = c01.d9.b().p().l(26, java.lang.Boolean.FALSE);
            java.lang.Boolean bool = l17 instanceof java.lang.Boolean ? (java.lang.Boolean) l17 : null;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            this.f267320f = booleanValue;
            boolean z17 = !booleanValue;
            this.f267319e = z17;
            com.tencent.mm.modelbase.c1 c1Var2 = this.f267327p;
            if (c1Var2 != null) {
                sl.j jVar2 = (sl.j) c1Var2;
                jVar2.f409043p = this;
                jVar2.f409042o = this;
                jVar2.f409032e = this;
                jVar2.f409033f = this;
                jVar2.f(z17);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WeNoteVoicePlayerControl", "get voice player fail, it is null");
            }
        } else {
            if (c1Var != null) {
                ((sl.j) c1Var).c();
            }
            com.tencent.mm.modelbase.c1 c1Var3 = this.f267327p;
            if (c1Var3 != null) {
                ((sl.j) c1Var3).b();
            }
        }
        return this.f267327p;
    }

    public final boolean f() {
        com.tencent.mm.modelbase.c1 c1Var = this.f267327p;
        if (c1Var != null) {
            return ((sl.j) c1Var).b();
        }
        return false;
    }

    @Override // com.tencent.mm.sdk.platformtools.q7
    public void f1(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f267318d)) {
            return;
        }
        if (this.f267321g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteVoicePlayerControl", "onSensorEvent: hasSkip");
            this.f267321g = !z17;
            return;
        }
        if (!z17) {
            long j17 = this.f267323i;
            if (j17 != -1 && android.os.SystemClock.elapsedRealtime() - j17 > 400) {
                this.f267321g = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteVoicePlayerControl", "onSensorEvent: skip");
                return;
            }
        }
        this.f267321g = false;
        com.tencent.mm.modelbase.c1 c1Var = this.f267327p;
        e();
        if (this.f267320f) {
            com.tencent.mm.modelbase.c1 e17 = e();
            if (e17 != null) {
                ((sl.j) e17).f(false);
            }
            this.f267319e = false;
            return;
        }
        com.tencent.mm.modelbase.c1 e18 = e();
        if (!(e18 != null && ((sl.j) e18).c())) {
            com.tencent.mm.modelbase.c1 e19 = e();
            if (e19 != null) {
                ((sl.j) e19).f(true);
            }
            this.f267319e = true;
            return;
        }
        com.tencent.mm.modelbase.c1 e27 = e();
        if (e27 != null) {
            ((sl.j) e27).f(z17);
        }
        this.f267319e = z17;
        if (z17) {
            return;
        }
        i(this.f267318d, this.f267324m, 0);
    }

    public final boolean g() {
        com.tencent.mm.modelbase.c1 c1Var = this.f267327p;
        if (c1Var != null) {
            return ((sl.j) c1Var).c();
        }
        return false;
    }

    public final boolean h() {
        double d17 = d();
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = this.f267318d;
        objArr[1] = java.lang.Boolean.valueOf(g());
        objArr[2] = java.lang.Boolean.valueOf(f());
        objArr[3] = java.lang.Double.valueOf(d17);
        com.tencent.mm.modelbase.c1 c1Var = this.f267327p;
        objArr[4] = java.lang.Integer.valueOf(c1Var != null ? c1Var.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteVoicePlayerControl", "pausePlay: path=%s, isPlaying=%b, isPaused=%b, progressBeforePause=%.3f, playerHashCode=%d", objArr);
        if (!g()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeNoteVoicePlayerControl", "pausePlay: player is not playing! isPaused=%b", java.lang.Boolean.valueOf(f()));
        }
        com.tencent.mm.modelbase.c1 c1Var2 = this.f267327p;
        if (c1Var2 != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(c1Var2.hashCode());
            sl.j jVar = (sl.j) c1Var2;
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteVoicePlayerControl", "pausePlay: BEFORE pause - SceneVoicePlayer.hashCode=%d, SceneVoicePlayer.getNowProgress()=%.3f, SceneVoicePlayer.isPlaying()=%b, SceneVoicePlayer.isPause()=%b", valueOf, java.lang.Double.valueOf(jVar.a()), java.lang.Boolean.valueOf(jVar.c()), java.lang.Boolean.valueOf(jVar.b()));
        }
        com.tencent.mm.sdk.platformtools.c3.b("keep_app_silent");
        com.tencent.mm.modelbase.c1 e17 = e();
        boolean d18 = e17 != null ? ((sl.j) e17).d(true) : false;
        com.tencent.mm.modelbase.c1 c1Var3 = this.f267327p;
        if (c1Var3 != null) {
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c1Var3.hashCode());
            sl.j jVar2 = (sl.j) c1Var3;
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteVoicePlayerControl", "pausePlay: AFTER pause - SceneVoicePlayer.hashCode=%d, SceneVoicePlayer.getNowProgress()=%.3f, SceneVoicePlayer.isPlaying()=%b, SceneVoicePlayer.isPause()=%b", valueOf2, java.lang.Double.valueOf(jVar2.a()), java.lang.Boolean.valueOf(jVar2.c()), java.lang.Boolean.valueOf(jVar2.b()));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteVoicePlayerControl", "pausePlay: player.pause result=%b, after pause: isPlaying=%b, isPaused=%b, progressAfterPause=%.3f", java.lang.Boolean.valueOf(d18), java.lang.Boolean.valueOf(g()), java.lang.Boolean.valueOf(f()), java.lang.Double.valueOf(d()));
        if (d18) {
            java.util.Iterator it = this.f267326o.iterator();
            if (it.hasNext()) {
                android.support.v4.media.f.a(it.next());
                throw null;
            }
        }
        return d18;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(java.lang.String r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fz4.m.i(java.lang.String, int, int):boolean");
    }

    public final void j() {
        com.tencent.mm.modelbase.c1 e17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteVoicePlayerControl", "stop play");
        com.tencent.mm.sdk.platformtools.c3.b("keep_app_silent");
        if (this.f267327p != null && (e17 = e()) != null) {
            ((sl.j) e17).h(false);
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f267326o).iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
        com.tencent.mm.sdk.platformtools.SensorController sensorController = this.f267325n;
        if (sensorController != null) {
            sensorController.a();
        }
        com.tencent.mm.sdk.platformtools.s7 s7Var = this.f267322h;
        if (s7Var != null) {
            s7Var.b();
        }
    }

    @Override // com.tencent.mm.modelbase.x0
    public void onCompletion() {
        double d17 = d();
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = this.f267318d;
        objArr[1] = java.lang.Double.valueOf(d17);
        objArr[2] = java.lang.Boolean.valueOf(g());
        objArr[3] = java.lang.Boolean.valueOf(f());
        com.tencent.mm.modelbase.c1 c1Var = this.f267327p;
        objArr[4] = java.lang.Integer.valueOf(c1Var != null ? c1Var.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteVoicePlayerControl", "on completion, stop play, path=%s, currentProgress=%.3f, isPlaying=%b, isPaused=%b, playerHashCode=%d", objArr);
        if (d17 < 0.95d) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeNoteVoicePlayerControl", "onCompletion: ABNORMAL! completion triggered < 0.95, progress=%.3f", java.lang.Double.valueOf(d17));
        }
        if (this.f267327p != null) {
            j();
        }
    }

    @Override // com.tencent.mm.modelbase.b1
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteVoicePlayerControl", "on stop!!");
        java.util.Iterator it = ((java.util.ArrayList) this.f267326o).iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
        com.tencent.mm.sdk.platformtools.SensorController sensorController = this.f267325n;
        if (sensorController != null) {
            sensorController.a();
        }
        com.tencent.mm.sdk.platformtools.s7 s7Var = this.f267322h;
        if (s7Var != null) {
            s7Var.b();
        }
    }
}
