package com.tencent.mm.plugin.recordvideo.activity;

@db5.a(4099)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/activity/MMRecordUI;", "Lcom/tencent/mm/ui/gallery/BaseMediaTabActivity;", "<init>", "()V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes10.dex */
public class MMRecordUI extends com.tencent.mm.ui.gallery.BaseMediaTabActivity {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f155625t = 0;

    /* renamed from: f, reason: collision with root package name */
    public ut3.b f155626f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f155627g;

    /* renamed from: i, reason: collision with root package name */
    public jt3.h f155629i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f155630m;

    /* renamed from: n, reason: collision with root package name */
    public f25.m0 f155631n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f155632o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f155634q;

    /* renamed from: h, reason: collision with root package name */
    public final jt3.a f155628h = new jt3.a();

    /* renamed from: p, reason: collision with root package name */
    public int f155633p = -1;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.activity.MMRecordUI$voipCallEventListener$1 f155635r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipCustomEvent>() { // from class: com.tencent.mm.plugin.recordvideo.activity.MMRecordUI$voipCallEventListener$1
        {
            super(com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.this);
            this.__eventId = 1496544185;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.VoipCustomEvent voipCustomEvent) {
            jt3.h hVar;
            com.tencent.mm.autogen.events.VoipCustomEvent event = voipCustomEvent;
            kotlin.jvm.internal.o.g(event, "event");
            boolean z17 = false;
            if (!gm0.j1.a()) {
                return false;
            }
            com.tencent.mm.plugin.recordvideo.activity.MMRecordUI mMRecordUI = com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.this;
            if (mMRecordUI.isFinishing() || mMRecordUI.isDestroyed()) {
                return false;
            }
            if (event.f54944g.f8333a == "Voip_End") {
                int i17 = com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.f155625t;
                mMRecordUI.b7();
                f25.m0 m0Var = mMRecordUI.f155631n;
                if (m0Var != null && ((g25.e) m0Var).f267980c) {
                    z17 = true;
                }
                if (z17 && (hVar = mMRecordUI.f155629i) != null) {
                    hVar.b();
                }
            }
            return true;
        }
    };

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.activity.MMRecordUI$voipMutiCallEventListener$1 f155636s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExitMultiTalkRoomEvent>() { // from class: com.tencent.mm.plugin.recordvideo.activity.MMRecordUI$voipMutiCallEventListener$1
        {
            super(com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.this);
            this.__eventId = -2057571736;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.ExitMultiTalkRoomEvent exitMultiTalkRoomEvent) {
            jt3.h hVar;
            com.tencent.mm.autogen.events.ExitMultiTalkRoomEvent event = exitMultiTalkRoomEvent;
            kotlin.jvm.internal.o.g(event, "event");
            boolean z17 = false;
            if (!gm0.j1.a()) {
                return false;
            }
            com.tencent.mm.plugin.recordvideo.activity.MMRecordUI mMRecordUI = com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.this;
            if (mMRecordUI.isFinishing() || mMRecordUI.isDestroyed()) {
                return false;
            }
            int i17 = com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.f155625t;
            mMRecordUI.b7();
            f25.m0 m0Var = mMRecordUI.f155631n;
            if (m0Var != null && ((g25.e) m0Var).f267980c) {
                z17 = true;
            }
            if (z17 && (hVar = mMRecordUI.f155629i) != null) {
                hVar.b();
            }
            return true;
        }
    };

    @Override // com.tencent.mm.ui.gallery.BaseMediaTabActivity
    public void V6(androidx.appcompat.app.AppCompatActivity activity) {
        com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout basePluginLayout;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "onPageSelected: ");
        activity.getWindow().addFlags(1024);
        jt3.h hVar = this.f155629i;
        if (hVar != null && (basePluginLayout = hVar.f301635g) != null) {
            basePluginLayout.s();
        }
        this.f155634q = true;
    }

    @Override // com.tencent.mm.ui.gallery.BaseMediaTabActivity
    public void W6(androidx.appcompat.app.AppCompatActivity activity) {
        com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout basePluginLayout;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "onPageUnselected: ");
        jt3.h hVar = this.f155629i;
        if (hVar != null && (basePluginLayout = hVar.f301635g) != null) {
            basePluginLayout.u();
        }
        this.f155634q = false;
    }

    public final void X6() {
        android.view.ViewGroup.LayoutParams layoutParams;
        if (com.tencent.mm.ui.bk.w()) {
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f155627g;
            boolean z17 = false;
            if (recordConfigProvider != null && recordConfigProvider.N) {
                z17 = true;
            }
            if (z17) {
                getContext().getWindow().getDecorView().setBackgroundColor(i65.a.d(getContext(), com.tencent.mm.R.color.f478712f3));
                int i17 = com.tencent.mm.ui.bl.b(getContext()).y;
                int i18 = (int) (i17 * 0.5625f);
                android.view.ViewGroup viewGroup = this.f155630m;
                if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                    layoutParams.width = i18;
                    layoutParams.height = i17;
                    if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
                        ((android.widget.LinearLayout.LayoutParams) layoutParams).gravity = 17;
                    } else if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
                        ((android.widget.FrameLayout.LayoutParams) layoutParams).gravity = 17;
                    } else if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
                        ((android.widget.RelativeLayout.LayoutParams) layoutParams).addRule(13);
                    }
                }
                int i19 = vt3.q.f440037a;
                vt3.q.f440037a = i18;
                vt3.q.f440038b = i17;
                return;
            }
        }
        android.view.ViewGroup viewGroup2 = this.f155630m;
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.width = -1;
        }
        android.view.ViewGroup viewGroup3 = this.f155630m;
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup3 != null ? viewGroup3.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.height = -1;
        }
        int i27 = vt3.q.f440037a;
        vt3.q.f440037a = com.tencent.mm.ui.bl.b(getContext()).x;
        vt3.q.f440038b = com.tencent.mm.ui.bl.b(getContext()).y;
    }

    public final void Y6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "enableVPSlide: " + z17);
        if (z17) {
            xg5.a aVar = this.f208685e;
            if (aVar != null) {
                ((b33.f) aVar).V6();
                return;
            }
            return;
        }
        xg5.a aVar2 = this.f208685e;
        if (aVar2 != null) {
            ((b33.f) aVar2).X6();
        }
    }

    public final void Z6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("report", nu3.i.f340218a.l());
        setResult(0, intent);
        nu3.m.f340229a.i(2, 3L);
        finish();
    }

    public final boolean a7() {
        f25.m0 m0Var = this.f155631n;
        return m0Var != null && ((g25.e) m0Var).f267980c;
    }

    public final void b7() {
        com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.e();
        if (voipCheckIsDeviceUsingEvent.f54943g.f8247c || iq.b.H()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMRecordUI", "requestFocus fail for voip");
            return;
        }
        f25.m0 m0Var = this.f155631n;
        if (m0Var != null) {
            i95.m c17 = i95.n0.c(f25.n0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((f25.n0) c17).yg(m0Var);
        }
        this.f155631n = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.i0.f259099c, new it3.a0(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "finish  " + hashCode());
        super.finish();
        dw3.f0.f244206a.a();
        ut3.f.f431176c.f431177a = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightRecordConfig", "unInit");
        st3.t.f412601e = false;
        lt3.v vVar = lt3.v.f321277a;
        com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.VideoMixHandler", "VideoMixHandler resumeBgMix!");
        lt3.v.f321279c = false;
        lt3.v.f321282f = null;
        vVar.b();
        jt3.h hVar = this.f155629i;
        if (hVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordUIRouter", "finish " + hVar.f301635g);
            hVar.f301637i = true;
            com.tencent.mm.sdk.platformtools.u3.h(new jt3.c(hVar));
        }
        if (getIntent() == null || getIntent().getIntExtra("KEY_PARAMS_EXIT_ANIM", -1) == -1) {
            return;
        }
        overridePendingTransition(-1, getIntent().getIntExtra("KEY_PARAMS_EXIT_ANIM", -1));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cdb;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "requestCode : " + i17 + " resultCode:" + i18 + "  " + hashCode());
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && i17 == 1 && intent != null) {
            setResult(-1, intent);
            ut3.b bVar = this.f155626f;
            if (bVar != null) {
                bVar.a(this, intent);
                return;
            }
            return;
        }
        jt3.h hVar = this.f155629i;
        if (hVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordUIRouter", "onActivityResult " + i17 + ' ' + i18 + ' ' + intent);
            if (hVar.f301639k) {
                ((ku5.t0) ku5.t0.f312615d).B(new jt3.d(hVar, i17, i18, intent));
            } else {
                com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout basePluginLayout = hVar.f301635g;
                if (basePluginLayout != null) {
                    basePluginLayout.onActivityResult(i17, i18, intent);
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "onBackPressed  " + hashCode());
        jt3.h hVar = this.f155629i;
        boolean z17 = false;
        if (hVar != null) {
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f155627g;
            int i17 = recordConfigProvider != null ? recordConfigProvider.F : 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordUIRouter", "onBackPressed " + i17);
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout basePluginLayout = hVar.f301635g;
            boolean onBackPress = basePluginLayout != null ? basePluginLayout.onBackPress() : false;
            if (!onBackPress) {
                nu3.i iVar = nu3.i.f340218a;
                iVar.d(14);
                iVar.i(i17);
            }
            if (onBackPress) {
                z17 = true;
            }
        }
        if (z17) {
            return;
        }
        Z6();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i17 = newConfig.screenLayout;
        boolean z17 = ((i17 & 3) == 0 || (i17 & 16) == 0) ? false : true;
        if (z17 != this.f155632o) {
            this.f155632o = z17;
            X6();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x01fb, code lost:
    
        if (r26.i0.p(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MPEG, r0, true) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0210, code lost:
    
        if (r0 == 999) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02db A[Catch: Exception -> 0x0302, TryCatch #2 {Exception -> 0x0302, blocks: (B:43:0x02be, B:45:0x02ce, B:62:0x02db, B:64:0x02e8, B:66:0x02f4), top: B:42:0x02be }] */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r41) {
        /*
            Method dump skipped, instructions count: 1661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "MMRecordUI onDestroy " + hashCode());
        super.onDestroy();
        jt3.h hVar = this.f155629i;
        if (hVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordUIRouter", "onDestroy " + hVar.f301635g);
            com.tencent.mm.sdk.platformtools.u3.h(new jt3.e(hVar));
            if (hVar.f301635g instanceof com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout) {
                nu3.i.f340218a.n("KEY_EXIT_TIME_MS_LONG", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
        }
        dw3.f0.f244206a.a();
        int intExtra = getIntent().getIntExtra("KEY_PARAMS_SELECTED_BIZ_INT", -1);
        if (intExtra == 2 || intExtra == 3) {
            ((wb0.e) ((xb0.e) i95.n0.c(xb0.e.class))).getClass();
            new rj.l().a();
        }
        nu3.m.f340229a.a();
        is0.b.f294391a.c();
        rm5.l.f397520a.a();
        dead();
        dead();
        f25.m0 m0Var = this.f155631n;
        if (m0Var != null) {
            i95.m c17 = i95.n0.c(f25.n0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((f25.n0) c17).yg(m0Var);
        }
        this.f155631n = null;
        vt3.l.f440005a.d();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        java.lang.Object obj;
        jt3.h hVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "MMRecordUI onPause  isFinishing  : " + isFinishing() + "  " + hashCode() + "  ");
        super.onPause();
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        java.util.List p07 = Bi.p0();
        kotlin.jvm.internal.o.f(p07, "getBallInfoListSync(...)");
        java.util.Iterator it = p07.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int i17 = ((com.tencent.mm.plugin.ball.model.BallInfo) obj).f93046d;
            if (i17 == 35 || i17 == 34 || i17 == 21 || i17 == 32) {
                break;
            }
        }
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) obj;
        if (this.f155633p != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "abandonFocus");
            f25.m0 m0Var = this.f155631n;
            if (m0Var != null) {
                i95.m c17 = i95.n0.c(f25.n0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((f25.n0) c17).yg(m0Var);
            }
            this.f155631n = null;
            jt3.h hVar2 = this.f155629i;
            if (hVar2 != null) {
                hVar2.d();
            }
        }
        if (this.f155633p == 0 && ballInfo != null) {
            Bi.X(false);
            Bi.y(true);
        }
        if (isFinishing() || (hVar = this.f155629i) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordUIRouter", "onPause " + hVar.f301635g);
        com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout basePluginLayout = hVar.f301635g;
        if (basePluginLayout != null) {
            basePluginLayout.onPause();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "onRequestPermissionsResult, requestCode:" + i17);
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        jt3.h hVar = this.f155629i;
        if (hVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordUIRouter", "onRequestPermissionsResult " + i17);
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout basePluginLayout = hVar.f301635g;
            if (basePluginLayout != null) {
                basePluginLayout.onRequestPermissionsResult(i17, permissions, grantResults);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[LOOP:0: B:4:0x0023->B:40:?, LOOP_END, SYNTHETIC] */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            r9 = this;
            java.lang.String r0 = "MMRecordUI onResume "
            java.lang.String r1 = "MicroMsg.MMRecordUI"
            r2 = 0
            super.onResume()     // Catch: java.lang.Exception -> Lbf
            java.lang.Class<pv.d0> r3 = pv.d0.class
            i95.m r3 = i95.n0.c(r3)     // Catch: java.lang.Exception -> Lbf
            pv.d0 r3 = (pv.d0) r3     // Catch: java.lang.Exception -> Lbf
            ov.i0 r3 = (ov.i0) r3     // Catch: java.lang.Exception -> Lbf
            gp1.v r3 = r3.Bi()     // Catch: java.lang.Exception -> Lbf
            java.util.List r4 = r3.p0()     // Catch: java.lang.Exception -> Lbf
            java.lang.String r5 = "getBallInfoListSync(...)"
            kotlin.jvm.internal.o.f(r4, r5)     // Catch: java.lang.Exception -> Lbf
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> Lbf
        L23:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Exception -> Lbf
            r6 = 1
            if (r5 == 0) goto L4a
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Exception -> Lbf
            r7 = r5
            com.tencent.mm.plugin.ball.model.BallInfo r7 = (com.tencent.mm.plugin.ball.model.BallInfo) r7     // Catch: java.lang.Exception -> Lbf
            int r7 = r7.f93046d     // Catch: java.lang.Exception -> Lbf
            r8 = 35
            if (r7 == r8) goto L46
            r8 = 34
            if (r7 == r8) goto L46
            r8 = 21
            if (r7 == r8) goto L46
            r8 = 32
            if (r7 != r8) goto L44
            goto L46
        L44:
            r7 = r2
            goto L47
        L46:
            r7 = r6
        L47:
            if (r7 == 0) goto L23
            goto L4b
        L4a:
            r5 = 0
        L4b:
            com.tencent.mm.plugin.ball.model.BallInfo r5 = (com.tencent.mm.plugin.ball.model.BallInfo) r5     // Catch: java.lang.Exception -> Lbf
            jt3.h r4 = r9.f155629i     // Catch: java.lang.Exception -> Lbf
            if (r4 == 0) goto L6d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbf
            java.lang.String r8 = "onResume "
            r7.<init>(r8)     // Catch: java.lang.Exception -> Lbf
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout r8 = r4.f301635g     // Catch: java.lang.Exception -> Lbf
            r7.append(r8)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> Lbf
            java.lang.String r8 = "MicroMsg.RecordUIRouter"
            com.tencent.mars.xlog.Log.i(r8, r7)     // Catch: java.lang.Exception -> Lbf
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout r4 = r4.f301635g     // Catch: java.lang.Exception -> Lbf
            if (r4 == 0) goto L6d
            r4.onResume()     // Catch: java.lang.Exception -> Lbf
        L6d:
            int r4 = r9.f155633p     // Catch: java.lang.Exception -> Lbf
            if (r4 == r6) goto L81
            r9.b7()     // Catch: java.lang.Exception -> Lbf
            boolean r4 = r9.a7()     // Catch: java.lang.Exception -> Lbf
            if (r4 == 0) goto L81
            jt3.h r4 = r9.f155629i     // Catch: java.lang.Exception -> Lbf
            if (r4 == 0) goto L81
            r4.b()     // Catch: java.lang.Exception -> Lbf
        L81:
            int r4 = r9.f155633p     // Catch: java.lang.Exception -> Lbf
            if (r4 != 0) goto L8d
            if (r5 == 0) goto L8d
            r3.X(r6)     // Catch: java.lang.Exception -> Lbf
            r3.d(r6)     // Catch: java.lang.Exception -> Lbf
        L8d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbf
            r3.<init>()     // Catch: java.lang.Exception -> Lbf
            r3.append(r0)     // Catch: java.lang.Exception -> Lbf
            int r4 = r9.hashCode()     // Catch: java.lang.Exception -> Lbf
            r3.append(r4)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r4 = " toWhere:"
            r3.append(r4)     // Catch: java.lang.Exception -> Lbf
            int r4 = r9.f155633p     // Catch: java.lang.Exception -> Lbf
            r3.append(r4)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r4 = " hasGainFocus("
            r3.append(r4)     // Catch: java.lang.Exception -> Lbf
            boolean r4 = r9.a7()     // Catch: java.lang.Exception -> Lbf
            r3.append(r4)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r4 = ") "
            r3.append(r4)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Lbf
            com.tencent.mars.xlog.Log.i(r1, r3)     // Catch: java.lang.Exception -> Lbf
            goto Ldd
        Lbf:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            int r0 = r9.hashCode()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.mars.xlog.Log.e(r1, r0)
            java.lang.String r0 = ""
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r3, r0, r2)
            r9.finish()
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.activity.MMRecordUI.onResume():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(outState, "outState");
        super.onSaveInstanceState(outState);
        jt3.h hVar = this.f155629i;
        if (hVar != null) {
            java.util.Map viewMap = hVar.f301634f;
            kotlin.jvm.internal.o.f(viewMap, "viewMap");
            java.util.Iterator it = viewMap.entrySet().iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout) ((java.util.Map.Entry) it.next()).getValue()).x(outState);
            }
        }
        ut3.b bVar = this.f155626f;
        if (bVar != null) {
            bVar.onSaveInstanceState(outState);
        }
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(ht3.l.class);
        set.add(ht3.g.class);
        set.addAll(((pc0.s2) ((qc0.k1) i95.n0.c(qc0.k1.class))).f353306e);
    }
}
