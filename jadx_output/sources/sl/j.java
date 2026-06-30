package sl;

/* loaded from: classes12.dex */
public class j implements com.tencent.mm.modelbase.c1 {

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.String f409027q;

    /* renamed from: a, reason: collision with root package name */
    public tl.h f409028a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f409029b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f409030c;

    /* renamed from: d, reason: collision with root package name */
    public final int f409031d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.z0 f409032e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.b1 f409033f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.w0 f409034g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f409035h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f409036i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f409037j;

    /* renamed from: k, reason: collision with root package name */
    public final float f409038k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.List f409039l;

    /* renamed from: m, reason: collision with root package name */
    public final fl.a f409040m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f409041n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.modelbase.y0 f409042o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.modelbase.x0 f409043p;

    public j(android.content.Context context, int i17, float f17) {
        this(context, i17);
        this.f409038k = f17;
    }

    public double a() {
        tl.h hVar = this.f409028a;
        if (hVar == null) {
            return 0.0d;
        }
        return hVar.c();
    }

    public boolean b() {
        tl.h hVar = this.f409028a;
        return hVar != null && hVar.getStatus() == 2;
    }

    public boolean c() {
        tl.h hVar = this.f409028a;
        if (hVar == null) {
            return false;
        }
        return hVar.isPlaying();
    }

    public boolean d(boolean z17) {
        com.tencent.mm.modelbase.z0 z0Var;
        com.tencent.mm.modelbase.w0 w0Var;
        if (this.f409028a == null) {
            return false;
        }
        com.tencent.mm.modelbase.w0 w0Var2 = this.f409034g;
        fl.a aVar = this.f409040m;
        if (w0Var2 != null) {
            boolean D = aVar.D(z17, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "back pause ret:%s", java.lang.Boolean.valueOf(D));
            if (D && (w0Var = this.f409034g) != null) {
                ((com.tencent.mm.ui.chatting.v0) w0Var).q(true);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "backplay Player abandonFocus focus helper, needFocusOnPlay: %s, hasAudioFocus: %s", java.lang.Boolean.valueOf(this.f409036i), java.lang.Boolean.FALSE);
            return D;
        }
        boolean D2 = aVar.D(z17, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "pause ret:%s", java.lang.Boolean.valueOf(D2));
        if (D2 && (z0Var = this.f409032e) != null) {
            z0Var.c(z17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "jacks Player abandonFocus focus helper, needFocusOnPlay: %s, hasAudioFocus: %s", java.lang.Boolean.valueOf(this.f409036i), java.lang.Boolean.FALSE);
        return D2;
    }

    public boolean e() {
        if (this.f409028a == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "resume");
        fl.a aVar = this.f409040m;
        tl.h hVar = aVar.f263691q;
        boolean resume = hVar != null ? hVar.resume() : false;
        if (resume) {
            aVar.r("music", 2);
            if (ym1.f.f463134h.i()) {
                aVar.f263690p = false;
            }
            aVar.A(aVar.f263690p);
        }
        if (!aVar.f263689o) {
            if (j65.e.g()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceAudioManager", "resumePlaying set mute false");
                tl.h hVar2 = aVar.f263691q;
                if (hVar2 != null) {
                    hVar2.setMute(false);
                }
            } else {
                f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.j0.f259100c, aVar.f263685k);
                aVar.f263686l = m96;
                aVar.f263689o = m96 != null ? ((g25.e) m96).f267980c : false;
            }
        }
        com.tencent.mm.modelbase.w0 w0Var = this.f409034g;
        if (w0Var != null) {
            ((com.tencent.mm.ui.chatting.v0) w0Var).q(false);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "jacks Player requestFocus focus helper, needFocusOnPlay: %s, hasAudioFocus: %s", java.lang.Boolean.valueOf(this.f409036i), java.lang.Boolean.FALSE);
        return resume;
    }

    public void f(boolean z17) {
        this.f409040m.a(z17);
    }

    public boolean g(java.lang.String str, boolean z17, boolean z18, int i17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z18);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
        int i18 = this.f409031d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "start file name:[%s] speakerOn:[%b], isFullPath: %s, type: %s, userType: %s", str, valueOf, valueOf2, valueOf3, java.lang.Integer.valueOf(i18));
        iz5.a.g(null, str.length() > 0);
        f409027q = this.f409035h;
        this.f409035h = str;
        if (!com.tencent.mm.vfs.w6.j(z18 ? str : ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(bm5.y.f22757j, str, false))) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = str;
            if (!z18) {
                str = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(bm5.y.f22757j, str, false);
            }
            objArr[1] = str;
            com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoicePlayer", "start, file %s not exist!, fullPath: %s", objArr);
            return false;
        }
        if (i17 == -1) {
            i17 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? -1 : w21.v0.g(bm5.y.f22757j, str, i18, z18) ? 0 : w21.v0.h(str, i18, z18) ? 2 : 1;
        }
        android.content.Context context = this.f409029b;
        if (i17 == 0) {
            if (context != null) {
                this.f409028a = new w21.d1(context);
            } else {
                this.f409028a = new w21.d1();
            }
        } else if (i17 == 1) {
            if (context != null) {
                this.f409028a = new w21.i0(context);
            } else {
                this.f409028a = new w21.i0();
            }
        } else if (i17 == 2) {
            float f17 = this.f409038k;
            if (context != null) {
                this.f409028a = new w21.d0(context, f17);
            } else {
                this.f409028a = new w21.d0(f17);
            }
            this.f409028a.d(new sl.b(this));
        }
        tl.h hVar = this.f409028a;
        fl.a aVar = this.f409040m;
        if (hVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "init player success %s", java.lang.Integer.valueOf(hashCode()));
            aVar.f263691q = this.f409028a;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoicePlayer", "init player failed %s", java.lang.Integer.valueOf(hashCode()));
        }
        aVar.F();
        aVar.f263690p = z17;
        if (ym1.f.Ri() || ym1.f.Ni()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "headset plugged: %b, bluetoothon: %b", java.lang.Boolean.valueOf(ym1.f.Ri()), java.lang.Boolean.valueOf(ym1.f.Ni()));
            aVar.f263690p = false;
        }
        aVar.A(aVar.f263690p);
        sl.i iVar = new sl.i(this);
        tl.h hVar2 = this.f409028a;
        if (hVar2 != null) {
            hVar2.b(iVar);
        }
        sl.d dVar = new sl.d(this);
        tl.h hVar3 = this.f409028a;
        if (hVar3 != null) {
            hVar3.a(dVar);
        }
        if (!z18) {
            str = i18 == 0 ? ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(bm5.y.f22757j, str, false) : null;
        }
        aVar.G(str, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "jacks Player requestFocus focus helper, needFocusOnPlay: %s", java.lang.Boolean.valueOf(this.f409036i));
        return true;
    }

    public void h(boolean z17) {
        com.tencent.mm.modelbase.b1 b1Var;
        tl.h hVar = this.f409028a;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoicePlayer", "stop player failed cause player is null %s", java.lang.Integer.valueOf(hashCode()));
            return;
        }
        hVar.stop();
        this.f409028a.b(null);
        this.f409028a.d(null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "stop player abandon focus, needFocusOnPlay: %s, hasAudioFocus: %s, abandonFocusOnStop: %s", java.lang.Boolean.valueOf(this.f409036i), java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(this.f409037j));
        fl.a aVar = this.f409040m;
        aVar.v();
        if (aVar.f263689o && aVar.f263688n) {
            f25.m0 m0Var = aVar.f263686l;
            if (m0Var != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            }
            aVar.f263686l = null;
            aVar.f263689o = false;
        }
        if (z17 || (b1Var = this.f409033f) == null) {
            return;
        }
        b1Var.onStop();
    }

    public void i() {
        this.f409040m.getClass();
        ym1.f.f463134h.o("music");
    }

    public j(android.content.Context context, int i17) {
        this.f409028a = null;
        this.f409029b = null;
        this.f409030c = false;
        this.f409031d = 0;
        this.f409035h = null;
        this.f409036i = true;
        this.f409037j = true;
        this.f409038k = 1.0f;
        this.f409039l = new java.util.ArrayList();
        this.f409041n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoiceResumeIgnoreOther()) == 1;
        this.f409042o = null;
        this.f409029b = context instanceof android.app.Activity ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
        this.f409031d = i17;
        this.f409040m = new fl.a(new sl.a(this));
    }
}
