package com.tencent.mm.plugin.multitalk.ui;

@db5.a(com.tencent.mm.plugin.appbrand.jsapi.m9.CTRL_INDEX)
@ul5.d(0)
/* loaded from: classes14.dex */
public class MultiTalkMainUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.multitalk.model.z, android.content.ServiceConnection, r90.j {
    public static final /* synthetic */ int D = 0;
    public di3.d C;

    /* renamed from: d, reason: collision with root package name */
    public sj3.m1 f150228d;

    /* renamed from: e, reason: collision with root package name */
    public sj3.a5 f150229e;

    /* renamed from: f, reason: collision with root package name */
    public sj3.o3 f150230f;

    /* renamed from: g, reason: collision with root package name */
    public sj3.g3 f150231g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f150232h;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f150235n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.ScreenActionReceiver f150236o;

    /* renamed from: p, reason: collision with root package name */
    public iq4.d f150237p;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.ui.b0 f150242u;

    /* renamed from: i, reason: collision with root package name */
    public boolean f150233i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f150234m = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f150238q = false;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f150239r = zj3.j.h();

    /* renamed from: s, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f150240s = new com.tencent.mm.plugin.multitalk.ui.k(this);

    /* renamed from: t, reason: collision with root package name */
    public boolean f150241t = false;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Runnable f150243v = new com.tencent.mm.plugin.multitalk.ui.l(this);

    /* renamed from: w, reason: collision with root package name */
    public boolean f150244w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f150245x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f150246y = false;

    /* renamed from: z, reason: collision with root package name */
    public int f150247z = 0;
    public final android.content.BroadcastReceiver A = new com.tencent.mm.plugin.multitalk.ui.p(this);
    public final com.tencent.mm.sdk.platformtools.n3 B = new com.tencent.mm.plugin.multitalk.ui.j(this);

    /* loaded from: classes11.dex */
    public class ScreenActionReceiver extends android.content.BroadcastReceiver {
        public ScreenActionReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            java.lang.String action = intent.getAction();
            if (action == null || !action.equals("android.intent.action.SCREEN_OFF")) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkMainUI", "receive action screen off");
            com.tencent.mm.sdk.platformtools.n3 n3Var = com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.this.B;
            n3Var.removeCallbacksAndMessages(null);
            n3Var.sendEmptyMessage(0);
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void C() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkMainUI", "onEnterMultiTalk");
        X6();
        com.tencent.mm.plugin.multitalk.model.e3.Di().K();
        this.f150228d.a();
        if (this.f150239r) {
            this.f150231g.n();
        } else {
            this.f150229e.i(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t);
            this.f150229e.j();
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void D2(java.lang.String path) {
        sj3.o3 o3Var = this.f150230f;
        if (o3Var != null) {
            o3Var.getClass();
            kotlin.jvm.internal.o.g(path, "path");
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(path);
            am.c4 c4Var = doFavoriteEvent.f54090g;
            if (K0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MultiTalkScreenProjectUILogic", "fill favorite event fail, event is null or image path is empty");
                c4Var.f6326l = com.tencent.mm.R.string.cac;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkScreenProjectUILogic", "do fill event info(fav simple image), path %s sourceType %d", path, 2);
                r45.bq0 bq0Var = new r45.bq0();
                r45.jq0 jq0Var = new r45.jq0();
                r45.gp0 gp0Var = new r45.gp0();
                gp0Var.h0(2);
                gp0Var.A0(path);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(gp0Var);
                sb6.append('2');
                sb6.append(java.lang.System.currentTimeMillis());
                byte[] bytes = sb6.toString().getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                gp0Var.e0(kk.k.g(bytes));
                com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
                am.z9 z9Var = favoriteOperationEvent.f54243g;
                z9Var.f8528a = 27;
                z9Var.f8533f = gp0Var;
                favoriteOperationEvent.e();
                java.lang.String str = favoriteOperationEvent.f54244h.f6137d;
                com.tencent.mm.sdk.platformtools.x.x(path, 150, 150, android.graphics.Bitmap.CompressFormat.JPEG, 90, str, true);
                gp0Var.B0(str);
                jq0Var.e(c01.z1.r());
                jq0Var.j(c01.z1.r());
                jq0Var.g(2);
                jq0Var.c(java.lang.System.currentTimeMillis());
                bq0Var.o(jq0Var);
                bq0Var.f370964f.add(gp0Var);
                c4Var.f6318d = gp0Var.f375404d;
                c4Var.f6315a = bq0Var;
                c4Var.f6317c = 2;
            }
            c4Var.f6323i = o3Var.f408667a;
            c4Var.f6327m = 6;
            doFavoriteEvent.e();
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void I5(sj3.e4 e4Var, sj3.e4 e4Var2) {
        if (e4Var2 != sj3.e4.Talking) {
            if (e4Var2 == sj3.e4.Starting && this.f150239r) {
                boolean isMobile = com.tencent.mars.comm.NetStatusUtil.isMobile(com.tencent.mm.sdk.platformtools.x2.f193071a);
                if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ilink_voip.RepairConfigVoIPMPSimulateCellularNetwork()) == 1) {
                    isMobile = true;
                }
                if (isMobile) {
                    android.widget.Toast c17 = db5.t7.c(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.oaa));
                    c17.setDuration(3000);
                    c17.show();
                    return;
                }
                return;
            }
            return;
        }
        if (!this.f150239r) {
            sj3.a5 a5Var = this.f150229e;
            if (a5Var.V > 0) {
                a5Var.V = java.lang.System.currentTimeMillis();
                return;
            }
            return;
        }
        if (!ym1.f.Ri()) {
            ym1.f.Ni();
        }
        com.tencent.mm.plugin.multitalk.ui.b0 b0Var = this.f150242u;
        b0Var.getClass();
        com.tencent.mm.plugin.multitalk.model.e3.Di().f473174o.getClass();
        int i17 = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi().f222516a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkUIViewModel", "updateIconState: cameraEnable true, audioType " + i17);
        b0Var.f150273x.postValue(java.lang.Boolean.TRUE);
        b0Var.f150258f.postValue(java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void J5(java.lang.String imgPath) {
        sj3.o3 o3Var = this.f150230f;
        if (o3Var != null) {
            o3Var.getClass();
            kotlin.jvm.internal.o.g(imgPath, "imgPath");
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(o3Var.f408667a, "com.tencent.mm.ui.transmit.MsgRetransmitUI");
            intent.putExtra("Retr_File_Name", imgPath);
            intent.putExtra("Retr_Msg_Type", 0);
            intent.putExtra("Retr_Compress_Type", 1);
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = o3Var.f408667a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(multiTalkMainUI, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkScreenProjectUILogic", "doSendTOFriend", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            multiTalkMainUI.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(multiTalkMainUI, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkScreenProjectUILogic", "doSendTOFriend", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void N0() {
        setRequestedOrientation(1);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectReportHelper", "markClickStopProject");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1538L, 5L, 1L);
        com.tencent.mm.plugin.multitalk.model.e3.Ri().f150168m = false;
        com.tencent.mm.plugin.multitalk.model.e3.Ri().f150169n = false;
        getIntent().removeExtra("enterMainUIScreenProjectOnline");
        getIntent().removeExtra("enterMainUIScreenProjectParams");
        this.f150230f.b();
        com.tencent.mm.plugin.multitalk.model.e3.Ri().Z(1, false);
        if (this.f150239r) {
            this.f150231g.n();
            return;
        }
        this.f150229e.m();
        sj3.a5 a5Var = this.f150229e;
        if (a5Var.L) {
            a5Var.H.setVisibility(0);
        }
        android.view.View view = this.f150229e.f408418e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showMiniUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showMiniUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f150229e.getClass();
        com.tencent.mm.plugin.multitalk.model.v0 Ri = com.tencent.mm.plugin.multitalk.model.e3.Ri();
        Ri.getClass();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = Ri.f150174q.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!c01.z1.r().equals(str)) {
                hashSet.add(str);
            }
        }
        Ri.f150174q.clear();
        Ri.f150174q = hashSet;
        com.tencent.mm.plugin.multitalk.model.z zVar = Ri.C;
        if (zVar != null) {
            zVar.x5();
        }
        this.f150229e.i(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t);
        sj3.a5 a5Var2 = this.f150229e;
        android.view.View view2 = a5Var2.f408427q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = a5Var2.f408423m;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f150229e.j();
        if (!com.tencent.mm.plugin.multitalk.model.e3.Ri().y() || this.f150235n == null) {
            return;
        }
        sj3.a5 a5Var3 = this.f150229e;
        android.widget.FrameLayout frameLayout = a5Var3.Q;
        a5Var3.f408420g.k(a5Var3.f408419f, frameLayout, a5Var3.f408417d, a5Var3);
        com.tencent.mm.plugin.multitalk.model.e3.Ri().getClass();
        ((com.tencent.mm.plugin.multitalk.model.r3) com.tencent.mm.plugin.multitalk.model.e3.Ri().r()).a(true);
    }

    public android.view.ViewGroup T6() {
        return (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.m7w);
    }

    public void U6() {
        if (this.f150245x || com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t == null) {
            return;
        }
        this.f150245x = true;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("kintent_talker", com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t.f71608f);
        intent.putExtra("key_media_type", 2);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
        j45.l.v(this, "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", intent, 3);
    }

    public boolean V6() {
        sj3.o3 o3Var = this.f150230f;
        if (o3Var != null) {
            return o3Var.d();
        }
        return false;
    }

    public void W6(int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this, "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera");
        intent.putExtra("activity_caller_params", 1);
        startActivityForResult(intent, 1);
        this.f150246y = true;
        this.f150247z = i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X6() {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.X6():void");
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void Z(boolean z17) {
        java.lang.Boolean bool;
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().y()) {
            if (!this.f150239r) {
                sj3.a5 a5Var = this.f150229e;
                a5Var.getClass();
                ((ku5.t0) ku5.t0.f312615d).B(new sj3.n4(a5Var, z17));
                return;
            }
            com.tencent.mm.plugin.multitalk.ui.b0 b0Var = this.f150242u;
            boolean z18 = true;
            if (b0Var != null && (bool = (java.lang.Boolean) b0Var.f150257e.getValue()) != null) {
                if (bool.booleanValue() == z17) {
                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.this.f150242u.P6(false);
                        }
                    });
                }
                z18 = false;
            }
            if (z18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MT.MultiTalkMainUI", "onMuteStateChange mTalkingViewModel or micOn is null");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.multitalk.model.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Z3() {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.Z3():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        sj3.g3 g3Var;
        super.finish();
        sj3.a5 a5Var = this.f150229e;
        if (a5Var != null) {
            a5Var.X = false;
        }
        if (this.f150239r && (g3Var = this.f150231g) != null) {
            sj3.a1 e17 = g3Var.e();
            e17.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", "disableClick");
            e17.f408407u = false;
        }
        di3.d dVar = this.C;
        if (dVar != null) {
            dVar.disable();
            this.C.f232689g = null;
            this.C = null;
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public boolean g4() {
        if (this.f150239r) {
            return java.lang.Boolean.TRUE.equals(this.f150242u.f150263n.getValue());
        }
        if (this.f150229e != null) {
            return com.tencent.mm.plugin.multitalk.model.e3.wi().c();
        }
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return !this.f150230f.d() ? 1 : 4;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c3c;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void h0(boolean z17) {
        java.lang.Integer num;
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().y()) {
            if (!this.f150239r) {
                sj3.a5 a5Var = this.f150229e;
                a5Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "onSpeakerStateChange: %s", java.lang.Boolean.valueOf(z17));
                ((ku5.t0) ku5.t0.f312615d).B(new sj3.o4(a5Var, z17));
                return;
            }
            com.tencent.mm.plugin.multitalk.ui.b0 b0Var = this.f150242u;
            boolean z18 = true;
            if (b0Var != null && (num = (java.lang.Integer) b0Var.f150259g.getValue()) != null) {
                z18 = false;
                if (num.equals(1) != z17) {
                    this.f150242u.Q6(false);
                }
            }
            if (z18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MT.MultiTalkMainUI", "onSpeakerStateChange mTalkingViewModel or speakerOn is null");
            }
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void i1(com.tencent.mm.plugin.multitalk.model.n2 n2Var, com.tencent.mm.plugin.multitalk.model.n2 n2Var2) {
        if (n2Var2 == com.tencent.mm.plugin.multitalk.model.n2._4G) {
            com.tencent.mm.plugin.multitalk.model.e3.aj().a(this);
            return;
        }
        if (n2Var2 != com.tencent.mm.plugin.multitalk.model.n2._3GOr_2G) {
            if (n2Var2 == com.tencent.mm.plugin.multitalk.model.n2.None) {
                p21.i.b(this, com.tencent.mm.R.string.f490500wu, null);
            }
        } else {
            com.tencent.mm.plugin.multitalk.model.l2 aj6 = com.tencent.mm.plugin.multitalk.model.e3.aj();
            if (aj6.f150037a) {
                return;
            }
            aj6.f150037a = true;
            p21.i.b(this, com.tencent.mm.R.string.h2k, null);
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void i4() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkMainUI", "onVideoGroupMemberChange, SubCoreMultiTalk.getMultiTalkManager().getCurrentVideoUserSet().size(): " + com.tencent.mm.plugin.multitalk.model.e3.Ri().f150174q.size());
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().y()) {
            java.util.HashSet hashSet = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150174q;
            if (hashSet.size() <= 0) {
                com.tencent.mm.plugin.multitalk.model.v0 Ri = com.tencent.mm.plugin.multitalk.model.e3.Ri();
                Ri.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "try to stopNetworkDataSource");
                if (Ri.n() != null) {
                    com.tencent.mm.plugin.multitalk.model.a2 n17 = Ri.n();
                    n17.getClass();
                    com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MTR.MultiTalkRenderLogic", "stopDecodeVideo", new java.lang.Object[0]);
                    cj3.n nVar = n17.f149876b;
                    if (nVar != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MultiTalkEngineOp", "stopDecodeVideo");
                        com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.R(null);
                        nVar.f41899c = false;
                    }
                }
            } else if (hashSet.size() == 1 && hashSet.contains(c01.z1.r())) {
                com.tencent.mm.plugin.multitalk.model.e3.Ri().W();
            } else {
                com.tencent.mm.plugin.multitalk.model.e3.Ri().T();
            }
            if (V6() || this.f150239r) {
                return;
            }
            sj3.a5 a5Var = this.f150229e;
            if (a5Var.f408420g.j()) {
                return;
            }
            java.util.HashSet hashSet2 = new java.util.HashSet(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150174q);
            int i17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150165h;
            if (i17 == 1 || i17 == 3) {
                a5Var.l(hashSet2);
            }
            int size = hashSet2.size();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(220L, 19L, 1L, false);
            g0Var.idkeyStat(220L, 20L, size, false);
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void j(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkMainUI", "onError " + i17);
        if (i17 == -1700) {
            if (this.f150239r) {
                this.f150242u.O6(java.lang.Boolean.FALSE);
                return;
            }
            sj3.a5 a5Var = this.f150229e;
            a5Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "onSwitchVideoDisabled");
            a5Var.f408435y.setChecked(false);
            a5Var.v(false);
            com.tencent.mm.plugin.multitalk.model.e3.Ri().Z(1, com.tencent.mm.plugin.multitalk.model.e3.Ri().f150168m);
            com.tencent.mm.plugin.multitalk.model.u0.a(6);
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.H();
            com.tencent.mm.plugin.multitalk.model.e3.Zi().getClass();
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void k() {
        sj3.a5 a5Var = this.f150229e;
        if (a5Var != null) {
            if (this.f150239r) {
                this.f150231g.p(5);
            } else {
                a5Var.q(5);
            }
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void n3(boolean z17) {
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().y()) {
            if (!this.f150239r) {
                com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout = this.f150229e.A;
                if (multiTalkControlIconLayout != null) {
                    multiTalkControlIconLayout.setEnabled(z17);
                    multiTalkControlIconLayout.setIconEnabled(z17);
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.multitalk.ui.b0 b0Var = this.f150242u;
            b0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkUIViewModel", "setHandsFreeEnable: " + z17);
            b0Var.f150272w.postValue(java.lang.Boolean.valueOf(z17));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        sj3.a5 a5Var;
        boolean z17;
        int i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkMainUI", "onActivityResult " + i17 + " resultCode " + i18);
        super.onActivityResult(i17, i18, intent);
        this.f150244w = false;
        this.f150245x = false;
        if (i18 == -1 && i17 == 1) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkMainUI", "add member " + stringExtra);
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
            if (P1 == null) {
                return;
            }
            com.tencent.mm.plugin.multitalk.model.v0 Ri = com.tencent.mm.plugin.multitalk.model.e3.Ri();
            if (Ri.x()) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(Ri.f150177t.f71606d)) {
                    java.lang.String str = Ri.f150177t.f71607e;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "addMemberList: %s, wifigateway:%s, groupid:%s", com.tencent.mm.plugin.multitalk.model.o2.b(Ri.f150177t), com.tencent.mm.plugin.voip.model.v2protocal.w(), Ri.f150177t.f71608f);
                com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
                i4Var.Z = new com.tencent.mm.plugin.multitalk.ilinkservice.u4() { // from class: com.tencent.mm.plugin.multitalk.model.v0$$b
                    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.u4
                    public final void a(int i27, java.lang.String str2) {
                        com.tencent.mm.plugin.multitalk.model.e3.Ri().N(this);
                    }
                };
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.ArrayList a17 = i4Var.f149623f.a();
                java.util.Iterator it = P1.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    java.util.Iterator it6 = a17.iterator();
                    while (it6.hasNext()) {
                        com.tencent.mm.plugin.multitalk.ilinkservice.w wVar = (com.tencent.mm.plugin.multitalk.ilinkservice.w) it6.next();
                        if (str2.equals(wVar.f149842c) && ((i19 = wVar.f149844e) == 1 || i19 == 2 || i19 == 3)) {
                            z17 = true;
                            break;
                        }
                    }
                    z17 = false;
                    if (!z17) {
                        linkedList.add(str2);
                    }
                }
                if (linkedList.size() != 0) {
                    i4Var.J(new com.tencent.mm.plugin.multitalk.ilinkservice.s2(i4Var, linkedList));
                }
            }
        }
        if (i17 == 1 && (a5Var = this.f150229e) != null && this.f150246y) {
            this.f150246y = false;
            int i27 = this.f150247z;
            boolean z18 = this.f150239r;
            if (i27 == 1) {
                if (z18) {
                    this.f150231g.o(5);
                    return;
                } else {
                    a5Var.p(5);
                    return;
                }
            }
            if (i27 == 2) {
                if (z18) {
                    this.f150231g.p(5);
                } else {
                    a5Var.q(5);
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        android.view.ViewGroup T6;
        super.onConfigurationChanged(configuration);
        if (V6()) {
            this.f150230f.e();
            return;
        }
        getWindow().clearFlags(1024);
        getWindow().addFlags(134217728);
        if (!this.f150239r) {
            sj3.a5 a5Var = this.f150229e;
            a5Var.getClass();
            if (com.tencent.mm.plugin.multitalk.model.e3.Ri().z()) {
                androidx.recyclerview.widget.RecyclerView recyclerView = a5Var.f408419f;
                recyclerView.requestLayout();
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().notifyDataSetChanged();
                }
                a5Var.f408421h.requestLayout();
                return;
            }
            return;
        }
        sj3.g3 g3Var = this.f150231g;
        g3Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "refreshLayout: ");
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = g3Var.f408520a;
        if (multiTalkMainUI != null && (T6 = multiTalkMainUI.T6()) != null) {
            T6.requestLayout();
        }
        sj3.a1 e17 = g3Var.e();
        e17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", "refreshLayout: ");
        e17.d().requestLayout();
        e17.c().requestLayout();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f150242u = (com.tencent.mm.plugin.multitalk.ui.b0) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.multitalk.ui.b0.class);
        ((tf0.a) ((uf0.e) i95.n0.c(uf0.e.class))).getClass();
        ((com.tencent.mm.booter.notification.x) mo3.f.f330406a).f(41);
        com.tencent.mm.plugin.multitalk.model.e3.Di().L(this, false);
        com.tencent.mm.plugin.multitalk.model.e3.Ri().L();
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        int intExtra = getIntent().getIntExtra("enterMainUiSource", 0);
        if (intExtra == 1 || intExtra == 2) {
            overridePendingTransition(com.tencent.mm.R.anim.f477843d1, com.tencent.mm.R.anim.f477728p);
        } else {
            overridePendingTransition(com.tencent.mm.R.anim.f477891ef, com.tencent.mm.R.anim.f477892eg);
        }
        hideTitleView();
        getWindow().addFlags(6815872);
        getWindow().addFlags(67108864);
        com.tencent.mm.plugin.multitalk.model.e3.Ri().d(false);
        if (!com.tencent.mm.plugin.multitalk.model.e3.Ri().x()) {
            finish();
            if (intExtra == 2) {
                getIntent().getStringExtra("enterMainUiWxGroupId");
                return;
            }
            return;
        }
        com.tencent.mm.plugin.multitalk.model.e3.Di().L(this, false);
        this.f150228d = new sj3.m1(this);
        this.f150229e = new sj3.a5(this);
        this.f150230f = new sj3.o3(this);
        this.f150231g = new sj3.g3(this);
        com.tencent.mm.plugin.multitalk.model.m2 m2Var = com.tencent.mm.plugin.multitalk.model.e3.Ri().K;
        sj3.e4 e4Var = sj3.e4.Init;
        while (true) {
            sj3.e4 e4Var2 = (sj3.e4) ((java.util.ArrayDeque) m2Var.f150045a).poll();
            if (e4Var2 == null) {
                break;
            }
            I5(e4Var, e4Var2);
            e4Var = e4Var2;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        registerReceiver(this.A, intentFilter);
        this.f150234m = true;
        this.f150235n = new com.tencent.mm.sdk.platformtools.n3();
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.a(this, "android.permission.RECORD_AUDIO", 82, "", "")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkMainUI", "has not audio record permission!");
        }
        if (fp.h.c(26)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkMainUI", "initScreenObserver");
            this.f150236o = new com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.ScreenActionReceiver();
            android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
            intentFilter2.addAction("android.intent.action.SCREEN_OFF");
            intentFilter2.addAction("android.intent.action.SCREEN_ON");
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(this.f150236o, intentFilter2);
        }
        iq4.d dVar = new iq4.d(new dp1.u(this));
        this.f150237p = dVar;
        dVar.b(9, "VOIPFloatBall");
        di3.d dVar2 = new di3.d(this);
        this.C = dVar2;
        dVar2.enable();
        this.C.f232689g = this;
        this.f150241t = false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        sj3.g3 g3Var;
        if (this.f150239r && (g3Var = this.f150231g) != null) {
            g3Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "onDestroy");
            com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout d17 = g3Var.d();
            d17.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAvatarLayout", "close");
            java.util.Iterator it = d17.f150363d.entrySet().iterator();
            while (it.hasNext()) {
                ((tj3.p) ((java.util.Map.Entry) it.next()).getValue()).f419783b.c();
            }
        }
        if (this.f150244w || this.f150245x || this.f150246y) {
            com.tencent.mm.plugin.multitalk.model.e3.Ri().C(false);
        }
        if (this.f150234m) {
            unregisterReceiver(this.A);
        }
        sj3.o3 o3Var = this.f150230f;
        if (o3Var != null) {
            boolean z17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150186y1;
            uj3.p pVar = o3Var.f408668b;
            if (pVar != null) {
                pVar.t(z17);
            }
            uj3.i iVar = o3Var.f408669c;
            if (iVar != null) {
                iVar.t(z17);
            }
        }
        com.tencent.mm.plugin.multitalk.model.e3.Di().L(null, false);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.B;
        n3Var.removeCallbacksAndMessages(null);
        n3Var.sendEmptyMessage(1);
        if (fp.h.c(26)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkMainUI", "unInitScreenObserver");
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.ScreenActionReceiver screenActionReceiver = this.f150236o;
            if (screenActionReceiver != null) {
                try {
                    com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(screenActionReceiver);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkMainUI", "unregisterBatteryChange err:%s", e17.getMessage());
                }
                this.f150236o = null;
            }
        }
        T6().getViewTreeObserver().removeOnGlobalLayoutListener(this.f150240s);
        super.onDestroy();
        iq4.d dVar = this.f150237p;
        if (dVar != null) {
            dVar.o0();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        int i18;
        boolean z17 = false;
        if (keyEvent.getKeyCode() == 4) {
            if (V6()) {
                sj3.o3 o3Var = this.f150230f;
                uj3.p pVar = o3Var.f408668b;
                if (pVar != null) {
                    pVar.o();
                }
                uj3.i iVar = o3Var.f408669c;
                if (iVar != null) {
                    iVar.o();
                }
            } else {
                sj3.a5 a5Var = this.f150229e;
                com.tencent.mm.plugin.multitalk.model.j jVar = a5Var.f408420g;
                if (jVar != null && jVar.j()) {
                    a5Var.m();
                    a5Var.H.e();
                    jVar.f();
                    z17 = true;
                }
                if (!z17) {
                    db5.e1.j(this, com.tencent.mm.R.string.h1r, com.tencent.mm.R.string.h0y, com.tencent.mm.R.string.f490008ib, com.tencent.mm.R.string.f490347sg, new com.tencent.mm.plugin.multitalk.ui.m(this), null);
                }
            }
            return true;
        }
        sj3.e4 e4Var = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150176s;
        if (e4Var == sj3.e4.Inviting) {
            if (i17 == 25 || i17 == 24) {
                com.tencent.mm.plugin.multitalk.model.e3.Ri().X();
                this.f150233i = false;
                return true;
            }
        } else if (e4Var == sj3.e4.Creating || e4Var == sj3.e4.Starting) {
            yx3.v Ai = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Ai();
            if (Ai != null) {
                vx3.c cVar = Ai.f467945e;
                if (cVar != null) {
                    i18 = cVar.f441271b;
                } else {
                    yx3.k kVar = Ai.f467943c;
                    i18 = kVar != null ? kVar.c() : 3;
                }
            } else {
                i18 = 5;
            }
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
                to.a.a(hVar.c(), i18, -1, 5);
                return true;
            }
            if (i17 == 24) {
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
                to.a.a(hVar2.c(), i18, 1, 5);
                return true;
            }
        } else {
            if (i17 == 25) {
                if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J != null) {
                    ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).sj();
                }
                return true;
            }
            if (i17 == 24) {
                if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J != null) {
                    ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).tj();
                }
                return true;
            }
        }
        return super.onKeyDown(i17, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (((java.util.HashSet) o35.a.f342751a).contains(r2.toLowerCase()) == false) goto L17;
     */
    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNewIntent(android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.onNewIntent(android.content.Intent):void");
    }

    @Override // r90.j
    public void onOrientationChange(int i17) {
        if (!V6()) {
            this.f150229e.b(i17);
            return;
        }
        sj3.o3 o3Var = this.f150230f;
        o3Var.getClass();
        sj3.n3 n3Var = sj3.o3.f408666e;
        if (n3Var.a(this) != o3Var.f408670d) {
            o3Var.e();
            if (n3Var.a(this) == 90 || n3Var.a(this) == 270) {
                com.tencent.mm.plugin.multitalk.model.u0.f150148h++;
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        iq4.d dVar;
        com.tencent.mm.plugin.multitalk.model.e3.Ri().W();
        super.onPause();
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("keyguard");
        android.os.PowerManager powerManager = (android.os.PowerManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
        boolean z17 = (hasWindowFocus() || !keyguardManager.inKeyguardRestrictedInputMode()) && powerManager.isScreenOn();
        this.f150232h = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkMainUI", "onPause, screenOn: %b", java.lang.Boolean.valueOf(z17));
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().y() && !this.f150239r) {
            this.f150229e.getClass();
        }
        if (this.f150245x || this.f150244w || this.f150246y || V6()) {
            if (V6() && (dVar = this.f150237p) != null && !this.f150246y) {
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(true);
                com.tencent.mm.plugin.ball.model.BallInfo ballInfo = dVar.f93132d;
                ballInfo.M.f93090m = 4;
                gp1.v vVar = dVar.f93136h;
                if (vVar != null) {
                    vVar.i(ballInfo);
                }
            }
            qp1.h0.a(true, true, true);
        } else {
            iq4.d dVar2 = this.f150237p;
            if (dVar2 != null) {
                dVar2.z();
                qp1.h0.b();
            }
        }
        if (V6()) {
            iq4.c cVar = iq4.b.f293798a;
            cVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipFloatBallHelper", "updateHideWhenAppBackground %b", java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = cVar.f93132d;
            if (ballInfo2 != null) {
                ballInfo2.Q = true;
                cVar.g();
                return;
            }
            return;
        }
        iq4.c cVar2 = iq4.b.f293798a;
        cVar2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipFloatBallHelper", "updateHideWhenAppBackground %b", java.lang.Boolean.FALSE);
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo3 = cVar2.f93132d;
        if (ballInfo3 != null) {
            ballInfo3.Q = false;
            cVar2.g();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (strArr == null || strArr.length == 0 || iArr == null || iArr.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MT.MultiTalkMainUI", "[multitalk]onRequestPermissionsResult %d data is invalid", java.lang.Integer.valueOf(i17));
            return;
        }
        int i18 = iArr[0];
        java.lang.Thread.currentThread().getId();
        if (i17 == 22) {
            if (iArr[0] == 0) {
                return;
            }
            db5.e1.C(this, getString(com.tencent.mm.R.string.hh8), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.multitalk.ui.s(this), new com.tencent.mm.plugin.multitalk.ui.i(this));
        } else if (i17 == 82 && iArr[0] != 0) {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhn), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.multitalk.ui.q(this), new com.tencent.mm.plugin.multitalk.ui.r(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkMainUI", "onResume");
        super.onResume();
        this.f150238q = false;
        com.tencent.mm.plugin.multitalk.model.e3.Ri().f150186y1 = false;
        com.tencent.mm.plugin.multitalk.model.e3.Ri().C = this;
        com.tencent.mm.plugin.multitalk.model.e3.wi().f150116h = this;
        com.tencent.mm.plugin.multitalk.model.e3.Di().K();
        T6().getViewTreeObserver().addOnGlobalLayoutListener(this.f150240s);
        com.tencent.mm.plugin.multitalk.model.k2 o17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().o();
        java.util.ArrayList arrayList = o17.f150030c;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o17.d((java.lang.String) it.next());
            }
        }
        X6();
        iq4.d dVar = this.f150237p;
        if (dVar != null && !this.f150246y) {
            dVar.p0();
            qp1.h0.a(true, false, true);
        }
        com.tencent.mm.plugin.appbrand.backgroundrunning.x0 x0Var = (com.tencent.mm.plugin.appbrand.backgroundrunning.x0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class);
        if (x0Var != null) {
            com.tencent.mm.plugin.appbrand.backgroundrunning.b1 b1Var = (com.tencent.mm.plugin.appbrand.backgroundrunning.b1) x0Var;
            b1Var.Ai();
            b1Var.wi();
        }
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = new com.tencent.mm.plugin.ball.model.BallInfo(6, "MusicFloatBall", null);
            ballInfo.f93048f = 2;
            Bi.U(ballInfo);
        }
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().y()) {
            this.f150235n.postDelayed(this.f150243v, 2000L);
        }
        boolean V6 = V6();
        boolean z17 = this.f150239r;
        if (V6) {
            com.tencent.mm.plugin.multitalk.model.e3.Ri().a0(101);
            com.tencent.mm.plugin.multitalk.model.e3.Ri().f150168m = true;
            com.tencent.mm.plugin.multitalk.model.e3.Ri().f150169n = false;
        } else {
            boolean booleanExtra = getIntent().getBooleanExtra("enterMainUIScreenProjectOnline", false);
            android.os.Bundle bundleExtra = getIntent().getBundleExtra("enterMainUIScreenProjectParams");
            if (booleanExtra && bundleExtra != null) {
                this.f150230f.c(2);
                sj3.o3 o3Var = this.f150230f;
                o3Var.getClass();
                com.tencent.mm.plugin.multitalk.model.e3.Ri().f150170o = bundleExtra;
                uj3.p pVar = o3Var.f408668b;
                if (pVar != null) {
                    pVar.x(bundleExtra, -1);
                }
                if (!this.f150230f.d()) {
                    this.f150228d.a();
                    if (z17) {
                        this.f150231g.n();
                        return;
                    } else {
                        this.f150229e.i(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t);
                        this.f150229e.j();
                        return;
                    }
                }
                if (z17) {
                    this.f150231g.b();
                    this.f150231g.c();
                } else {
                    this.f150229e.c();
                    this.f150228d.a();
                    this.f150229e.H.setVisibility(4);
                    this.f150229e.f(true);
                    this.f150229e.d();
                    this.f150229e.h();
                }
                this.f150245x = false;
                setRequestedOrientation(4);
                return;
            }
        }
        int ordinal = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150176s.ordinal();
        if (ordinal == 1) {
            this.f150229e.d();
            if (z17) {
                this.f150231g.c();
            }
            this.f150228d.b(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t);
            if (com.tencent.mars.comm.NetStatusUtil.is4G(this)) {
                com.tencent.mm.plugin.multitalk.model.e3.aj().a(this);
            } else if (com.tencent.mars.comm.NetStatusUtil.is2G(this) || com.tencent.mars.comm.NetStatusUtil.is3G(this)) {
                com.tencent.mm.plugin.multitalk.model.l2 aj6 = com.tencent.mm.plugin.multitalk.model.e3.aj();
                if (!aj6.f150037a) {
                    aj6.f150037a = true;
                    p21.i.b(this, com.tencent.mm.R.string.h2k, null);
                }
            }
            if (this.f150233i) {
                com.tencent.mm.plugin.multitalk.model.e3.Ri().U(false);
            }
        } else if (ordinal == 2 || ordinal == 3) {
            this.f150228d.a();
            if (z17) {
                this.f150231g.n();
            } else {
                this.f150229e.i(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t);
            }
            if (com.tencent.mars.comm.NetStatusUtil.is4G(this)) {
                com.tencent.mm.plugin.multitalk.model.e3.aj().a(this);
            } else if (com.tencent.mars.comm.NetStatusUtil.is2G(this) || com.tencent.mars.comm.NetStatusUtil.is3G(this)) {
                com.tencent.mm.plugin.multitalk.model.l2 aj7 = com.tencent.mm.plugin.multitalk.model.e3.aj();
                if (!aj7.f150037a) {
                    aj7.f150037a = true;
                    p21.i.b(this, com.tencent.mm.R.string.h2k, null);
                }
            }
            com.tencent.mm.plugin.multitalk.model.e3.Ri().U(true);
        } else if (ordinal == 4) {
            if (this.f150230f.d()) {
                this.f150228d.a();
                if (z17) {
                    this.f150231g.c();
                } else {
                    this.f150229e.f(true);
                    this.f150229e.d();
                }
            } else {
                this.f150228d.a();
                if (z17) {
                    this.f150231g.n();
                } else {
                    this.f150229e.i(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t);
                    this.f150229e.j();
                }
            }
        }
        com.tencent.mm.plugin.multitalk.model.e3.Ri().I();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        if (V6() && this.f150232h) {
            com.tencent.mm.plugin.multitalk.model.e3.Ri().a0(102);
            com.tencent.mm.plugin.multitalk.model.e3.Ri().f150168m = false;
            com.tencent.mm.plugin.multitalk.model.e3.Ri().f150169n = true;
            com.tencent.mm.plugin.multitalk.model.e3.Ri().Z(1, true);
        }
        if (!this.f150244w && !this.f150245x && !this.f150246y && this.f150232h && !this.f150238q && !this.f150241t) {
            com.tencent.mm.plugin.multitalk.model.e3.Ri().C(false);
        }
        super.onStop();
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void p() {
        sj3.a5 a5Var = this.f150229e;
        if (a5Var != null) {
            if (this.f150239r) {
                this.f150231g.o(5);
            } else {
                a5Var.p(5);
            }
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void p0(int i17, int i18) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
        com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView;
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().y()) {
            if (!this.f150239r) {
                sj3.a5 a5Var = this.f150229e;
                boolean g17 = com.tencent.mm.plugin.multitalk.model.o2.g(i18);
                com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout = a5Var.f408435y;
                com.tencent.mm.plugin.multitalk.model.j jVar = a5Var.f408420g;
                if (!g17) {
                    if (com.tencent.mm.plugin.multitalk.model.o2.g(i17)) {
                        multiTalkControlIconLayout.setChecked(false);
                        jVar.l(c01.z1.r(), 0);
                        android.view.View view = a5Var.f408433w;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "onVideoStateChange", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "onVideoStateChange", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    a5Var.v(false);
                } else if (com.tencent.mm.plugin.multitalk.model.o2.g(i18) && !com.tencent.mm.plugin.multitalk.model.o2.g(i17)) {
                    multiTalkControlIconLayout.setChecked(true);
                    jVar.l(c01.z1.r(), 1);
                    android.view.View view2 = a5Var.f408433w;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "onVideoStateChange", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "onVideoStateChange", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    a5Var.x();
                }
                java.util.HashSet hashSet = new java.util.HashSet(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150174q);
                if (i18 == 1 || i18 == 3) {
                    if (i18 == 1 || i18 == 3) {
                        if (!(i17 == 1 || i17 == 3)) {
                            a5Var.l(hashSet);
                        }
                    }
                } else {
                    if (i17 == 1 || i17 == 3) {
                        jVar.getClass();
                        sj3.d dVar = jVar.f150009i;
                        if (dVar != null && (copyOnWriteArrayList = dVar.f408460e) != null) {
                            java.util.Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                java.lang.String usrName = ((aj3.c) it.next()).f5303a.f71612d;
                                kotlin.jvm.internal.o.f(usrName, "usrName");
                                sj3.j g18 = jVar.g(usrName);
                                if (g18 != null && (multitalkFrameView = g18.f408577d) != null) {
                                    if (!((multitalkFrameView.getF150344m() == null || kotlin.jvm.internal.o.b(c01.z1.r(), multitalkFrameView.getF150344m())) ? false : true)) {
                                        multitalkFrameView = null;
                                    }
                                    if (multitalkFrameView != null) {
                                        if (hashSet.contains(multitalkFrameView.getF150344m())) {
                                            if (multitalkFrameView.status == sj3.c5.f408454d) {
                                                jVar.l(multitalkFrameView.getF150344m(), 1);
                                            }
                                        } else {
                                            jVar.l(multitalkFrameView.getF150344m(), 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            X6();
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void p3() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkMainUI", "onExitMultiTalk");
        this.f150238q = true;
        zi3.f fVar = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J;
        if (fVar != null) {
            fVar.I(false, 1);
        }
        com.tencent.mm.autogen.events.MultiTalkActionEvent multiTalkActionEvent = new com.tencent.mm.autogen.events.MultiTalkActionEvent();
        multiTalkActionEvent.f54504g.f6259a = 0;
        multiTalkActionEvent.e();
        this.f150235n.post(new com.tencent.mm.plugin.multitalk.ui.n(this));
        sj3.o3 o3Var = this.f150230f;
        if (o3Var != null) {
            o3Var.b();
        }
        com.tencent.mm.plugin.multitalk.model.e3.Di().L(null, true);
        com.tencent.mm.plugin.multitalk.model.e3.Ri().C = null;
        com.tencent.mm.plugin.multitalk.model.e3.wi().f150116h = null;
        com.tencent.mm.plugin.multitalk.model.e3.Ri().X();
        zi3.f fVar2 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J;
        if (fVar2 != null) {
            fVar2.G();
        }
        com.tencent.mm.plugin.multitalk.model.v0 Ri = com.tencent.mm.plugin.multitalk.model.e3.Ri();
        zi3.f fVar3 = Ri.f150160J;
        if (fVar3 != null) {
            fVar3.R();
        }
        ((java.util.ArrayDeque) Ri.K.f150045a).clear();
        com.tencent.mm.plugin.multitalk.model.e3.wi().f();
        com.tencent.mm.plugin.multitalk.model.e3.Di().R();
        finish();
    }

    public void q2(java.util.List devices) {
        com.tencent.mm.plugin.multitalk.ui.b0 b0Var = this.f150242u;
        b0Var.getClass();
        kotlin.jvm.internal.o.g(devices, "devices");
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkUIViewModel", "onExternalDeviceChanged: " + devices);
        b0Var.f150260h.postValue(devices);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void r2() {
        if (!V6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkMainUI", "onMiniMultiTalk");
            com.tencent.mm.autogen.events.MultiTalkActionEvent multiTalkActionEvent = new com.tencent.mm.autogen.events.MultiTalkActionEvent();
            multiTalkActionEvent.f54504g.f6259a = 0;
            multiTalkActionEvent.e();
            if (this.f150239r) {
                this.f150231g.c();
            } else {
                this.f150229e.k(true, false);
            }
            if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150176s == sj3.e4.Inviting) {
                com.tencent.mm.plugin.multitalk.model.e3.Ri().X();
            }
            finish();
        }
        com.tencent.mm.plugin.multitalk.model.e3.Ri().C = null;
        com.tencent.mm.plugin.multitalk.model.e3.wi().f150116h = null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(yi3.d.class);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void v4() {
        com.tencent.mars.xlog.Log.e("MicroMsg.MT.MultiTalkMainUI", "onCameraError");
        com.tencent.mm.ui.widget.dialog.j0 b17 = p21.i.b(this, com.tencent.mm.R.string.kcm, new com.tencent.mm.plugin.multitalk.ui.o(this));
        if (!b17.isShowing()) {
            b17.show();
        }
        com.tencent.mm.plugin.multitalk.model.e3.Ri().Z(1, com.tencent.mm.plugin.multitalk.model.e3.Ri().f150168m);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.z
    public void x5() {
        X6();
        int ordinal = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150176s.ordinal();
        if (ordinal == 1) {
            com.tencent.mm.plugin.multitalk.model.e3.Ri().b();
            this.f150228d.b(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t);
        } else if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
            com.tencent.mm.plugin.multitalk.model.e3.Ri().b();
            if (this.f150239r) {
                return;
            }
            this.f150229e.i(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t);
        }
    }
}
