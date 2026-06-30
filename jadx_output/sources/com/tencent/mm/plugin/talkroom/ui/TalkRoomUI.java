package com.tencent.mm.plugin.talkroom.ui;

/* loaded from: classes15.dex */
public class TalkRoomUI extends com.tencent.mm.ui.MMBaseActivity implements p21.d, com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int P = 0;
    public android.view.animation.AlphaAnimation B;
    public android.view.animation.AlphaAnimation C;
    public android.view.animation.AlphaAnimation D;
    public android.view.animation.AlphaAnimation E;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f172457e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f172458f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Chronometer f172459g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageButton f172460h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f172461i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f172462m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f172463n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.talkroom.ui.TalkRoomVolumeMeter f172464o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.talkroom.ui.TalkRoomAvatarsFrame f172465p;

    /* renamed from: q, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f172466q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f172468s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f172469t;

    /* renamed from: r, reason: collision with root package name */
    public boolean f172467r = true;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f172470u = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public int f172471v = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f172472w = true;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f172473x = new com.tencent.mm.sdk.platformtools.b4(new fh4.p(this), false);

    /* renamed from: y, reason: collision with root package name */
    public boolean f172474y = true;

    /* renamed from: z, reason: collision with root package name */
    public int f172475z = 0;
    public final com.tencent.mm.sdk.platformtools.b4 A = new com.tencent.mm.sdk.platformtools.b4(new fh4.q(this), true);
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public final long f172456J = 500;
    public long K = 0;
    public final com.tencent.mm.sdk.platformtools.b4 L = new com.tencent.mm.sdk.platformtools.b4(new fh4.k(this), false);
    public final com.tencent.mm.sdk.platformtools.b4 M = new com.tencent.mm.sdk.platformtools.b4(new fh4.o(this), false);
    public int N = 0;

    public static boolean O6(com.tencent.mm.plugin.talkroom.ui.TalkRoomUI talkRoomUI, android.view.MotionEvent motionEvent) {
        if (talkRoomUI.F < 0.0f) {
            talkRoomUI.F = (talkRoomUI.f172460h.getWidth() - (talkRoomUI.f172460h.getPaddingLeft() * 2.0f)) / 2.0f;
            talkRoomUI.G = (talkRoomUI.f172460h.getWidth() * 1.0f) / 2.0f;
            talkRoomUI.H = (talkRoomUI.f172460h.getHeight() * 1.0f) / 2.0f;
        }
        float x17 = motionEvent.getX();
        float y17 = motionEvent.getY();
        float f17 = x17 - talkRoomUI.G;
        float f18 = y17 - talkRoomUI.H;
        return java.lang.Math.sqrt((double) ((f17 * f17) + (f18 * f18))) < ((double) talkRoomUI.F);
    }

    @Override // p21.d
    public void J0(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.f("MicroMsg.TalkRoomUI", "errType %d, errCode %d, errInfo %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        P6("");
    }

    @Override // p21.d
    public void J1(java.lang.String str, int i17, int i18) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.f("MicroMsg.TalkRoomUI", "onInitFailed %s", str);
        if (i17 != 4) {
            str2 = "";
        } else {
            if (i18 != -1) {
                this.f172467r = false;
                finish();
                return;
            }
            str2 = getString(com.tencent.mm.R.string.jok);
        }
        P6(str2);
    }

    @Override // p21.d
    public void N4(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomUI", "onSeizeMicFailed");
        if (i17 == 340) {
            if (this.f172471v != 3) {
                return;
            } else {
                this.f172471v = 4;
            }
        } else if (this.f172471v != 1) {
            return;
        } else {
            this.f172471v = 2;
        }
        Q6();
        R6();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.sdk.platformtools.r5 r5Var = new com.tencent.mm.sdk.platformtools.r5(new fh4.j(this));
        com.tencent.mm.sdk.platformtools.d6 d6Var = com.tencent.mm.sdk.platformtools.d6.f192524a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.sdk.platformtools.d6.e(context, com.tencent.mm.R.string.f493320jq4, com.tencent.mm.sdk.platformtools.x5.f193085e, -1, false, r5Var);
    }

    @Override // p21.d
    public void P2(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomUI", "add %s,  del %s", str, str2);
        W6();
        if (this.f172472w) {
            return;
        }
        S6();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.M;
        if (!K0) {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            T6(getString(com.tencent.mm.R.string.job, c01.a2.e(str)), com.tencent.mm.R.color.a8d);
            b4Var.c(3000L, 3000L);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        T6(getString(com.tencent.mm.R.string.jof, c01.a2.e(str2)), com.tencent.mm.R.color.a8d);
        b4Var.c(3000L, 3000L);
    }

    @Override // p21.d
    public void P3() {
        if (!this.f172467r) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomUI", "alertToFinish has exit, ignore ");
        } else {
            this.f172467r = false;
            finish();
        }
    }

    public final void P6(java.lang.String str) {
        if (!this.f172467r) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomUI", "alertToFinish has exit, ignore ");
            return;
        }
        this.f172467r = false;
        dh4.l.Di().i();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = !com.tencent.mars.comm.NetStatusUtil.isConnected(getApplication()) ? getString(com.tencent.mm.R.string.jol) : getString(com.tencent.mm.R.string.jok);
        }
        if (isFinishing()) {
            return;
        }
        db5.e1.t(this, str, "", new fh4.m(this));
    }

    public final void Q6() {
        int i17 = this.f172471v;
        if (i17 == 3 || i17 == 5) {
            this.f172464o.setShowFlame(true);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f172469t)) {
            this.f172464o.setShowFlame(false);
        } else {
            this.f172464o.setShowFlame(true);
        }
    }

    @Override // p21.d
    public void R() {
        U6(getString(com.tencent.mm.R.string.joo), com.tencent.mm.R.color.a8e);
    }

    public final void R6() {
        if (this.f172472w) {
            return;
        }
        if (dh4.l.Di().f232531z) {
            U6(getString(com.tencent.mm.R.string.jom), com.tencent.mm.R.color.a8e);
            this.f172465p.setCurMemeber(null);
            this.f172462m.setImageResource(com.tencent.mm.R.drawable.bnq);
            Y6();
            return;
        }
        int i17 = this.f172471v;
        if (i17 == 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f172469t)) {
                U6(dh4.l.Di().k().size() == 1 ? getString(com.tencent.mm.R.string.jou) : "", com.tencent.mm.R.color.a8d);
                this.f172465p.setCurMemeber(null);
                this.f172462m.setImageResource(com.tencent.mm.R.drawable.bnq);
                Y6();
                return;
            }
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = this.f172469t;
            ((sg3.a) v0Var).getClass();
            T6(c01.a2.e(str), com.tencent.mm.R.color.a8d);
            this.f172465p.setCurMemeber(this.f172469t);
            this.f172462m.setImageResource(com.tencent.mm.R.drawable.bnq);
            X6(1);
            return;
        }
        if (i17 == 1) {
            U6(getString(com.tencent.mm.R.string.joa), com.tencent.mm.R.color.a8d);
            this.f172462m.setImageResource(com.tencent.mm.R.drawable.bnt);
            return;
        }
        if (i17 == 2) {
            U6(getString(com.tencent.mm.R.string.jop), com.tencent.mm.R.color.a8e);
            this.f172462m.setImageResource(com.tencent.mm.R.drawable.bns);
            return;
        }
        if (i17 != 3) {
            if (i17 == 4) {
                U6(getString(com.tencent.mm.R.string.jor), com.tencent.mm.R.color.a8e);
                this.f172462m.setImageResource(com.tencent.mm.R.drawable.bns);
                Y6();
                return;
            } else if (i17 != 5) {
                return;
            }
        }
        U6(getString(com.tencent.mm.R.string.joq), com.tencent.mm.R.color.a8d);
        this.f172465p.setCurMemeber(c01.z1.r());
        this.f172462m.setImageResource(com.tencent.mm.R.drawable.bnr);
        X6(2);
    }

    public final void S6() {
        int size = dh4.l.Di().k().size();
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomUI", "displayCount %d", java.lang.Integer.valueOf(size));
        this.f172458f.setText(java.lang.String.valueOf(size));
    }

    @Override // p21.d
    public void T0(java.lang.String str) {
    }

    @Override // p21.d
    public void T1() {
        R6();
    }

    public final void T6(java.lang.String str, int i17) {
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = this.f172457e.getTextSize();
        ((ke0.e) xVar).getClass();
        U6(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str, textSize), i17);
    }

    @Override // p21.d
    public void U2() {
        R6();
    }

    public final void U6(java.lang.CharSequence charSequence, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(charSequence.toString())) {
            this.f172457e.startAnimation(this.E);
            return;
        }
        this.f172457e.setTextColor(getResources().getColor(i17));
        this.f172457e.setText(charSequence);
        this.f172457e.startAnimation(this.D);
    }

    public final void V6() {
        if (this.f172471v != 5) {
            return;
        }
        this.L.d();
        R6();
        Q6();
        com.tencent.mm.sdk.platformtools.v5.c(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.jpy, new fh4.l(this));
        this.f172473x.c(1000L, 1000L);
    }

    public final void W6() {
        java.util.List k17 = dh4.l.Di().k();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = k17.iterator();
        while (it.hasNext()) {
            linkedList.add(((r45.nk6) it.next()).f381474e);
        }
        this.f172465p.setMembersList(linkedList);
    }

    public final void X6(int i17) {
        if (i17 == 0 || this.N != i17) {
            this.f172459g.setVisibility(0);
            this.f172459g.startAnimation(this.B);
            android.widget.Chronometer chronometer = this.f172459g;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            chronometer.setBase(android.os.SystemClock.elapsedRealtime());
            this.f172459g.start();
            this.N = i17;
        }
    }

    public final void Y6() {
        if (this.N == 0) {
            return;
        }
        this.f172459g.stop();
        this.N = 0;
        this.f172459g.startAnimation(this.C);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // p21.d
    public void m3() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomUI", "onSeizeMicSuccess");
        if (this.f172471v != 1) {
            return;
        }
        this.f172471v = 5;
        long j17 = this.K;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        long j18 = this.f172456J;
        if (elapsedRealtime >= j18) {
            V6();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomUI", "onSeizeMicSuccess waiting to execute");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.L;
        long elapsedRealtime2 = j18 - (android.os.SystemClock.elapsedRealtime() - this.K);
        b4Var.c(elapsedRealtime2, elapsedRealtime2);
    }

    @Override // p21.d
    public void n1() {
        this.f172472w = false;
        this.f172460h.setEnabled(true);
        this.f172460h.setImageResource(com.tencent.mm.R.drawable.bnu);
        this.f172461i.setVisibility(0);
        R6();
        S6();
        W6();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("enter_room_username");
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomUI", "onCreate talkRoomName : %s", stringExtra);
        this.f172468s = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            P6("");
        } else {
            if (com.tencent.mm.storage.z3.R4(stringExtra)) {
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                java.util.List m17 = c01.v1.m(stringExtra);
                if (m17 == null) {
                    c01.n8.a().c(stringExtra, 30);
                } else {
                    this.f172470u = m17;
                }
            } else {
                ((java.util.LinkedList) this.f172470u).clear();
                ((java.util.LinkedList) this.f172470u).add(stringExtra);
                ((java.util.LinkedList) this.f172470u).add(c01.z1.r());
            }
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new fh4.i(this, stringExtra));
        }
        setContentView(com.tencent.mm.ui.id.b(com.tencent.mm.sdk.platformtools.x2.f193071a).inflate(com.tencent.mm.R.layout.cxn, (android.view.ViewGroup) null));
        this.f172466q = ((android.os.PowerManager) getSystemService("power")).newWakeLock(26, "TalkRoomUI Lock");
        this.f172463n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.odf);
        this.f172457e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485920jj3);
        this.f172458f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cjm);
        this.f172461i = (android.widget.Button) findViewById(com.tencent.mm.R.id.hck);
        this.f172459g = (android.widget.Chronometer) findViewById(com.tencent.mm.R.id.bwf);
        this.f172462m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hzw);
        new fh4.b(this);
        this.f172461i.setOnClickListener(new fh4.s(this));
        findViewById(com.tencent.mm.R.id.osz).setOnClickListener(new fh4.t(this));
        android.widget.ImageButton imageButton = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.jit);
        this.f172460h = imageButton;
        imageButton.setEnabled(false);
        this.f172460h.setImageResource(com.tencent.mm.R.drawable.bnw);
        this.f172460h.setOnTouchListener(new fh4.w(this));
        this.f172464o = (com.tencent.mm.plugin.talkroom.ui.TalkRoomVolumeMeter) findViewById(com.tencent.mm.R.id.p8_);
        findViewById(com.tencent.mm.R.id.ohz).setOnTouchListener(new fh4.y(this, new fh4.x(this)));
        this.f172465p = (com.tencent.mm.plugin.talkroom.ui.TalkRoomAvatarsFrame) findViewById(com.tencent.mm.R.id.a9z);
        this.f172463n.setOnClickListener(new fh4.z(this));
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        this.B = alphaAnimation;
        alphaAnimation.setDuration(300L);
        this.B.setFillAfter(true);
        android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        this.C = alphaAnimation2;
        alphaAnimation2.setDuration(300L);
        this.C.setFillAfter(true);
        android.view.animation.AlphaAnimation alphaAnimation3 = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        this.D = alphaAnimation3;
        alphaAnimation3.setDuration(300L);
        this.D.setFillAfter(true);
        android.view.animation.AlphaAnimation alphaAnimation4 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        this.E = alphaAnimation4;
        alphaAnimation4.setDuration(300L);
        this.E.setFillAfter(true);
        c01.d9.e().a(364, this);
        dh4.l.Di().a(this);
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        dh4.l.Di().r(this);
        c01.d9.e().q(364, this);
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 25) {
            i95.m c17 = i95.n0.c(ym1.f.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            xm1.h hVar = ((ym1.f) c17).f463136e;
            if (hVar == null) {
                hVar = new xm1.j();
                i95.m c18 = i95.n0.c(ym1.f.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ((ym1.f) c18).f463136e = hVar;
                i95.m c19 = i95.n0.c(ym1.f.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                ((ym1.f) c19).f463138g[0] = "music";
            }
            to.a.a(hVar.c(), 3, -1, 5);
            return true;
        }
        if (i17 != 24) {
            return super.onKeyDown(i17, keyEvent);
        }
        i95.m c27 = i95.n0.c(ym1.f.class);
        kotlin.jvm.internal.o.f(c27, "getService(...)");
        xm1.h hVar2 = ((ym1.f) c27).f463136e;
        if (hVar2 == null) {
            hVar2 = new xm1.j();
            i95.m c28 = i95.n0.c(ym1.f.class);
            kotlin.jvm.internal.o.f(c28, "getService(...)");
            ((ym1.f) c28).f463136e = hVar2;
            i95.m c29 = i95.n0.c(ym1.f.class);
            kotlin.jvm.internal.o.f(c29, "getService(...)");
            ((ym1.f) c29).f463138g[0] = "music";
        }
        to.a.a(hVar2.c(), 3, 1, 5);
        return true;
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        sendBroadcast(new android.content.Intent("com.tencent.mm.ui.ACTION_DEACTIVE").setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b).putExtra("classname", getClass().getName()), com.tencent.mm.sdk.platformtools.v9.a());
        android.os.PowerManager.WakeLock wakeLock = this.f172466q;
        yj0.a.c(wakeLock, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        wakeLock.release();
        yj0.a.f(wakeLock, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        this.A.d();
        dh4.l.Ai().f232561f = false;
        dh4.l.Ai().getClass();
        dh4.p Ai = dh4.l.Ai();
        if (Ai.f232560e) {
            Ai.b(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jon));
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(Ai.f232559d)) {
            Ai.b(dh4.g0.a(com.tencent.mm.sdk.platformtools.x2.f193071a, dh4.l.Di().f232516h));
        } else {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = Ai.f232559d;
            ((sg3.a) v0Var).getClass();
            java.lang.String string = context.getString(com.tencent.mm.R.string.jos, c01.a2.e(str));
            Ai.a();
            Ai.b(string);
        }
        com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = new com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent();
        pauseAutoGetBigImgEvent.f54607g.f6172a = false;
        pauseAutoGetBigImgEvent.b(getMainLooper());
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        sendBroadcast(new android.content.Intent("com.tencent.mm.ui.ACTION_ACTIVE").setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b).putExtra("isTalkroom", true).putExtra("classname", getClass().getName()), com.tencent.mm.sdk.platformtools.v9.a());
        android.os.PowerManager.WakeLock wakeLock = this.f172466q;
        yj0.a.c(wakeLock, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI", "onResume", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        wakeLock.acquire();
        yj0.a.f(wakeLock, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI", "onResume", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        java.lang.String a17 = dh4.g0.a(this, this.f172468s);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = this.f172463n.getTextSize();
        ((ke0.e) xVar).getClass();
        this.f172463n.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, a17, textSize));
        dh4.l.Ai().f232561f = true;
        dh4.l.Ai().getClass();
        dh4.l.Ai().a();
        com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = new com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent();
        pauseAutoGetBigImgEvent.f54607g.f6172a = true;
        pauseAutoGetBigImgEvent.b(getMainLooper());
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
    }

    @Override // p21.d
    public void q5(java.lang.String str) {
        this.f172469t = str;
        Q6();
        R6();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.A;
        if (K0) {
            b4Var.d();
        } else {
            com.tencent.mm.sdk.platformtools.v5.c(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f493317jq1, new fh4.n(this));
            b4Var.c(100L, 100L);
        }
    }
}
