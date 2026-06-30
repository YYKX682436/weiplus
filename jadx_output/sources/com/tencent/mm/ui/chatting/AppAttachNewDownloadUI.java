package com.tencent.mm.ui.chatting;

/* loaded from: classes12.dex */
public class AppAttachNewDownloadUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements l75.q0, com.tencent.mm.modelbase.u0, bt3.q0, xg3.h0, com.tencent.mm.pluginsdk.ui.tools.w3 {
    public static final /* synthetic */ int Y1 = 0;
    public ot0.q A;
    public android.widget.ImageView A1;
    public java.lang.String B;
    public com.tencent.mm.pluginsdk.ui.tools.y3 B1;
    public java.lang.String C;
    public com.tencent.mm.pluginsdk.model.o2 C1;
    public java.lang.String E;
    public boolean E1;
    public long F;
    public boolean F1;
    public java.lang.String G;
    public boolean G1;
    public java.lang.String H;
    public boolean H1;
    public java.lang.String I;
    public java.lang.String I1;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f198098J;
    public final boolean J1;
    public java.lang.String K;
    public final com.tencent.mm.sdk.event.IListener K1;
    public java.lang.String L;
    public final com.tencent.mm.pluginsdk.model.n3 L1;
    public java.lang.String M1;
    public com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection N1;
    public zh1.v0 O1;
    public zh1.z0 P1;
    public com.tencent.mm.ui.widget.dialog.k0 Q1;
    public final android.view.View.OnClickListener R1;
    public rl5.r S1;
    public int T1;
    public int U;
    public int U1;
    public android.widget.LinearLayout V;
    public final db5.t4 V1;
    public android.widget.TextView W;
    public final android.view.View.OnTouchListener W1;
    public android.widget.TextView X;
    public final android.view.View.OnLongClickListener X1;
    public android.widget.TextView Y;
    public android.widget.ProgressBar Z;

    /* renamed from: d, reason: collision with root package name */
    public int f198099d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.MMImageView f198100e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.progress.RoundProgressBtn f198101f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.h0 f198102g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f198103h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f198104i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f198106m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f198107n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f198108o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f198109p;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.TextView f198110p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.plugin.handoff.model.AbsHandOffFile f198111p1;

    /* renamed from: q, reason: collision with root package name */
    public bt3.l0 f198112q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f198113r;

    /* renamed from: s, reason: collision with root package name */
    public int f198114s;

    /* renamed from: t, reason: collision with root package name */
    public long f198115t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f198116u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f198117v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f198118w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.modelbase.v0 f198119x;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.TextView f198120x0;

    /* renamed from: x1, reason: collision with root package name */
    public jk3.v f198121x1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f198122y;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.Button f198123y0;

    /* renamed from: y1, reason: collision with root package name */
    public gc5.c f198124y1;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f198125z;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.LinearLayout f198126z1;
    public int D = 0;
    public boolean M = false;
    public boolean N = false;
    public boolean P = true;
    public boolean Q = true;
    public boolean R = false;
    public boolean S = false;
    public boolean T = false;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f198105l1 = false;
    public boolean D1 = false;

    public AppAttachNewDownloadUI() {
        com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.m7h);
        this.E1 = false;
        this.F1 = true;
        this.G1 = false;
        this.H1 = false;
        this.I1 = "";
        this.J1 = ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ai(3);
        this.K1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.QBReaderLoadEndEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.1
            {
                this.__eventId = -1362078743;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.QBReaderLoadEndEvent qBReaderLoadEndEvent) {
                com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.this;
                if (!appAttachNewDownloadUI.E1) {
                    return false;
                }
                appAttachNewDownloadUI.finish();
                return false;
            }
        };
        this.L1 = new com.tencent.mm.ui.chatting.z(this);
        this.M1 = null;
        this.N1 = null;
        this.O1 = null;
        this.P1 = null;
        this.Q1 = null;
        this.R1 = new com.tencent.mm.ui.chatting.s(this);
        this.S1 = null;
        this.V1 = new com.tencent.mm.ui.chatting.t(this);
        this.W1 = new com.tencent.mm.ui.chatting.u(this);
        this.X1 = new com.tencent.mm.ui.chatting.v(this);
    }

    public static void U6(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI) {
        appAttachNewDownloadUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "start receive file");
        ez.v0 v0Var = ez.v0.f257777a;
        if (v0Var.k(java.lang.Integer.valueOf(appAttachNewDownloadUI.f198099d))) {
            appAttachNewDownloadUI.y7(12, -1);
            ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(appAttachNewDownloadUI.f198117v, null, 1, true);
        } else {
            appAttachNewDownloadUI.y7(13, -1);
            ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(appAttachNewDownloadUI.f198117v, null, 0, true);
        }
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(appAttachNewDownloadUI.f198115t, appAttachNewDownloadUI.f198117v);
        if (v0Var.k(java.lang.Integer.valueOf(appAttachNewDownloadUI.f198099d))) {
            appAttachNewDownloadUI.E7(true);
        } else {
            com.tencent.mm.pluginsdk.model.app.d c76 = appAttachNewDownloadUI.c7();
            if (c76 != null) {
                c76.field_status = 101L;
                c76.field_lastModifyTime = c01.id.e();
                com.tencent.mm.pluginsdk.model.app.u5.wi().update(c76, new java.lang.String[0]);
            }
            appAttachNewDownloadUI.H7();
        }
        d35.h.f226344a.d(appAttachNewDownloadUI.f198117v, appAttachNewDownloadUI.A);
    }

    public static com.tencent.mm.pluginsdk.model.app.d d7(int i17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.pluginsdk.model.app.d J0 = com.tencent.mm.pluginsdk.model.app.u5.wi().J0(j17, str);
        if (J0 != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            int i18 = x51.t1.f452086a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "summerapp getAppAttachInfo by msgId [%d] stack[%s]", valueOf, new x51.s1());
            return J0;
        }
        if (ez.v0.f257777a.k(java.lang.Integer.valueOf(i17)) || pd5.l.f353580b.a(com.tencent.mm.repairer.config.chatting.file.RepairerConfigMvvmItem_FileNewStyle.class, true)) {
            return null;
        }
        com.tencent.mm.pluginsdk.model.app.d h17 = com.tencent.mm.pluginsdk.model.app.k0.h(str2);
        if (h17 == null) {
            int i19 = x51.t1.f452086a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "summerapp getAppAttachInfo by msgId and mediaId is null stack[%s]", new x51.s1());
            return h17;
        }
        if (h17.field_msgInfoId != j17 && !com.tencent.mm.vfs.w6.j(h17.field_fileFullPath)) {
            int i27 = x51.t1.f452086a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "summerapp getAppAttachInfo by mediaId but not match stack[%s]", new x51.s1());
            com.tencent.mm.pluginsdk.model.app.k0.s(j17, str, str3, null);
            com.tencent.mm.pluginsdk.model.app.d J02 = com.tencent.mm.pluginsdk.model.app.u5.wi().J0(j17, str);
            if (J02 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppAttachNewDownloadUI", "summerapp getAppAttachInfo create new info from local but failed stack[%s]", new x51.s1());
                return h17;
            }
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.x(h17, J02), "copyAttachFromLocal");
        }
        return h17;
    }

    public static boolean n7(com.tencent.mm.pluginsdk.model.app.d dVar) {
        if (dVar == null) {
            return false;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(dVar.field_fileFullPath);
        return r6Var.m() && r6Var.C() == dVar.field_totalLen;
    }

    public final void A7(int i17) {
        if (this.J1) {
            return;
        }
        this.f198126z1.setVisibility(i17);
    }

    public final void B7(int i17) {
        if (!this.J1 || this.F1) {
            this.f198103h.setVisibility(i17);
        } else {
            this.f198109p.setVisibility(i17);
        }
    }

    public final void C7(int i17) {
        if (i17 == 8 && this.f198126z1.getVisibility() == 8) {
            A7(4);
        } else if (i17 == 0 && this.f198126z1.getVisibility() == 4) {
            A7(8);
        }
        if (i17 != this.f198101f.getVisibility()) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            int i18 = x51.t1.f452086a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "setRoundProgressBar %s %s", valueOf, new x51.s1());
            this.f198101f.setVisibility(i17);
            if (i17 == 0) {
                K7();
            }
        }
        J7();
    }

    @Override // bt3.q0
    public void D6(bt3.l0 l0Var) {
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$e
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.Y1;
                com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.this;
                appAttachNewDownloadUI.getClass();
                dp.a.makeText(appAttachNewDownloadUI, com.tencent.mm.R.string.brz, 0).show();
                appAttachNewDownloadUI.E7(false);
            }
        });
    }

    public final void D7() {
        com.tencent.mm.pluginsdk.model.app.d c76 = c7();
        if (c76 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppAttachNewDownloadUI", "info == null");
            return;
        }
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.tools.ShowImageUI.class);
        intent.putExtra("key_message_id", this.f198117v.getMsgId());
        intent.putExtra("key_message_talker", this.f198117v.Q0());
        intent.putExtra("key_image_path", c76.field_fileFullPath);
        intent.putExtra("key_favorite", true);
        intent.putExtra("key_scene", 2);
        intent.putExtra("key_conv_session_id", this.I1);
        if (getIntent().hasExtra("jumpChat")) {
            intent.putExtra("jumpChat", getIntent().getBundleExtra("jumpChat"));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI", "showFileImage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI", "showFileImage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a2, code lost:
    
        if (r10 != 101) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00cb, code lost:
    
        if (r8 == 101) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E7(boolean r17) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.E7(boolean):void");
    }

    public final void F7() {
        this.f198107n.setVisibility(0);
        if (this.C.equals("")) {
            this.f198107n.setText(getString(com.tencent.mm.R.string.f492674hf5));
        } else {
            this.f198107n.setText(this.C);
        }
    }

    public final void G7() {
        if (!this.M || this.C.contains(".apk") || this.D1) {
            if (this.D1) {
                this.f198120x0.setText(com.tencent.mm.R.string.m7g);
                this.f198120x0.setVisibility(0);
                this.W.setVisibility(8);
                this.X.setVisibility(8);
                return;
            }
            return;
        }
        if (this.J1) {
            jt.a0 a0Var = (jt.a0) i95.n0.c(jt.a0.class);
            java.lang.String str = this.E;
            java.lang.String g76 = g7();
            ((ht.s) a0Var).getClass();
            if (!com.tencent.mm.pluginsdk.model.t3.k(str, g76)) {
                this.f198104i.setVisibility(8);
                this.f198106m.setVisibility(0);
                if (this.F1) {
                    this.f198106m.setText(com.tencent.mm.R.string.ne9);
                    return;
                } else {
                    this.f198106m.setText(com.tencent.mm.R.string.brw);
                    return;
                }
            }
        }
        this.f198104i.setVisibility(8);
        jt.a0 a0Var2 = (jt.a0) i95.n0.c(jt.a0.class);
        java.lang.String str2 = this.E;
        java.lang.String g77 = g7();
        ((ht.s) a0Var2).getClass();
        if (!com.tencent.mm.pluginsdk.model.t3.k(str2, g77)) {
            this.f198106m.setVisibility(0);
            this.f198106m.setText(com.tencent.mm.R.string.brw);
        }
        if (this.R) {
            a7();
        }
    }

    public final void H7() {
        E7(true);
        if (I7()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "startToDownloadFile");
            if (this.f198112q != null) {
                c01.d9.e().d(this.f198112q);
            }
            ((kq3.e) ((bx1.s) i95.n0.c(bx1.s.class))).Ai(this.f198117v.I0(), this.f198117v.y0(), false, this.f198117v.getCreateTime());
            this.f198112q = new bt3.l0(this.f198115t, this.f198117v.Q0(), this.f198113r, this.f198119x);
            c01.d9.e().g(this.f198112q);
            de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
            com.tencent.mm.storage.f9 f9Var = this.f198117v;
            ((ce0.e) jVar).getClass();
            com.tencent.mm.modelsimple.g1.M(f9Var);
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).Ai(this.f198117v);
            y7(7, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean I7() {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.I7():boolean");
    }

    public final void J7() {
        java.util.Iterator it = java.util.Arrays.asList(this.f198101f, this.f198102g.f201626a).iterator();
        while (it.hasNext()) {
            if (((android.view.View) it.next()).getVisibility() == 0) {
                A7(8);
            }
        }
    }

    public final void K7() {
        com.tencent.mm.pluginsdk.model.app.d c76 = c7();
        if (c76 == null) {
            return;
        }
        long j17 = c76.field_totalLen;
        long j18 = c76.field_offset;
        this.F = j17;
        int i17 = j17 == 0 ? 0 : (int) ((j18 * 100) / j17);
        this.f198101f.setProgress(i17);
        if (c76.field_status == 199 && i17 >= 100 && !this.M) {
            java.lang.Object obj = this.f198121x1;
            if (obj != null) {
                ((md5.b) ((md5.c) obj)).e0(this.F);
            }
            this.M = true;
            if (this.f198105l1) {
                this.f198105l1 = false;
                com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                com.tencent.mm.pluginsdk.model.a2.j(doFavoriteEvent, this.f198117v, false);
                am.c4 c4Var = doFavoriteEvent.f54090g;
                c4Var.f6323i = this;
                c4Var.f6327m = 39;
                doFavoriteEvent.e();
            }
            if (this.f198114s == 3) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.B);
                intent.putExtra(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, this.C);
                intent.putExtra("fileExt", this.E);
                setResult(-1, intent);
                finish();
                return;
            }
            if (!u7(c76.field_fileFullPath, this.E, this.C, this.G)) {
                return;
            }
            g7();
            jt.a0 a0Var = (jt.a0) i95.n0.c(jt.a0.class);
            java.lang.String str = this.E;
            java.lang.String g76 = g7();
            ((ht.s) a0Var).getClass();
            if (com.tencent.mm.pluginsdk.model.t3.k(str, g76)) {
                w7();
            } else if (com.tencent.mm.sdk.platformtools.t8.G0(this.E)) {
                this.E1 = true;
            } else if (!this.C.contains(".apk") && this.J1) {
                l7();
            }
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.ui.chatting.y(this), 200L);
        }
        if (this.f198101f.getVisibility() == 0 || i17 >= 100 || c76.field_isUpload) {
            return;
        }
        long j19 = c76.field_status;
        f7(false);
        if (j19 == 101) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "summerapp still downloading updateProgress progress[%d]", java.lang.Integer.valueOf(i17));
            E7(false);
        }
    }

    public final void V6(final java.util.List list, final java.util.List list2) {
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalApplyResource()) == 1) {
            if (this.C.startsWith("fts_template") && (this.C.endsWith(".zip") || this.C.endsWith(".7z"))) {
                list.add(getString(com.tencent.mm.R.string.bqr));
                list2.add(25);
            } else if (this.C.startsWith("was_template") && this.C.endsWith(".zip")) {
                list.add(getString(com.tencent.mm.R.string.br6));
                list2.add(26);
            }
            if (this.C.startsWith("fts_feature") && this.C.endsWith(".zip")) {
                list.add(getString(com.tencent.mm.R.string.bqq));
                list2.add(27);
            }
            if (this.C.startsWith("wrd_template") && this.C.endsWith(".zip")) {
                list.add(getString(com.tencent.mm.R.string.bqo));
                list2.add(28);
            }
            if (this.C.startsWith("pardus") && this.C.endsWith(".zip")) {
                list.add(getString(com.tencent.mm.R.string.bqy));
                list2.add(212);
            }
            if (this.C.startsWith("box_template") && this.C.endsWith(".zip")) {
                list.add(getString(com.tencent.mm.R.string.bqm));
                list2.add(210);
            }
            if (this.C.startsWith("box_flight_number") && this.C.endsWith(".txt")) {
                list.add(getString(com.tencent.mm.R.string.bqn));
                list2.add(211);
            }
            if (this.C.startsWith("popup_scan") && this.C.endsWith(".zip")) {
                list.add(getString(com.tencent.mm.R.string.bqz));
                list2.add(213);
            }
            if ((this.C.startsWith("fs_kw_main") && this.C.endsWith(".zip")) || this.C.startsWith("73.1.data")) {
                list.add(getString(com.tencent.mm.R.string.bqt));
                list2.add(215);
            }
            if (this.C.startsWith("tsc") && this.C.endsWith(".zip")) {
                list.add(getString(com.tencent.mm.R.string.f491062br1));
                list2.add(216);
            }
            if (this.C.startsWith("ocr") && this.C.endsWith(".zip")) {
                list.add(getString(com.tencent.mm.R.string.bqu));
                list2.add(218);
            }
            if (this.C.startsWith("mv_default_video") && this.C.endsWith(".zip")) {
                list.add(getString(com.tencent.mm.R.string.bqv));
                list2.add(219);
            }
            if (this.C.startsWith("mv_transition") && this.C.endsWith(".zip")) {
                list.add(getString(com.tencent.mm.R.string.bqx));
                list2.add(java.lang.Integer.valueOf(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP));
            }
            if (this.C.startsWith("mv_app_icon") && this.C.endsWith(".zip")) {
                list.add(getString(com.tencent.mm.R.string.bqw));
                list2.add(java.lang.Integer.valueOf(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT));
            }
            if (this.C.startsWith("TextState") && this.C.endsWith(".zip")) {
                list.add(getString(com.tencent.mm.R.string.f491065br4));
                list2.add(220);
            }
            if (this.C.startsWith("ftshotsearch") && this.C.endsWith(".zip")) {
                list.add(getString(com.tencent.mm.R.string.bqs));
                list2.add(223);
            }
            if (this.C.startsWith("webcompt") && this.C.endsWith(".wcpkg")) {
                list.add(getString(com.tencent.mm.R.string.f491066br5));
                list2.add(230);
            }
            if (this.C.startsWith("esc") && this.C.endsWith(".zip")) {
                list.add(getString(com.tencent.mm.R.string.bqp));
                list2.add(228);
            }
            if (this.C.startsWith("biztestcase") && this.C.endsWith(".zip")) {
                list.add(getString(com.tencent.mm.R.string.bql));
                list2.add(java.lang.Integer.valueOf(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR));
            }
            if (this.C.startsWith("selecttext") && this.C.endsWith(".zip")) {
                list.add(getString(com.tencent.mm.R.string.f491061br0));
                list2.add(234);
            }
            if ((this.C.startsWith("runtime_package") || this.C.startsWith("pinusruntime") || this.C.startsWith("xwebruntime")) && this.C.endsWith(".zip")) {
                list.add(getString(com.tencent.mm.R.string.br7));
                list2.add(239);
            }
        }
        if (!z65.c.a()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return;
        }
        if (this.C.endsWith(".wspkg")) {
            final java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("webtimeline", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.bqj), 224));
            hashMap.put(ya.b.INDEX, new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.bqk), 225));
            hashMap.put("basic", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.bqj), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.contact.j.CTRL_INDEX)));
            hashMap.put("wx9e221f7828fa7482", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.bqk), 227));
            hashMap.put("wx2f3fb5db9f226462", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.bqj), 231));
            hashMap.put("wxe208ce76dfa39515", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.bqk), 232));
            hashMap.put("wxf337cbaa27790mb2", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.f491064br3), 235));
            hashMap.put("MagicBrandService", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.bqk), 237));
            hashMap.put("MagicEcsTimelineSubscribe", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.f491059ne3), 252));
            hashMap.put("MagicEcsTimeline", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.f491058ne2), 248));
            hashMap.put("MagicEcsShop", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.nmt), java.lang.Integer.valueOf(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR)));
            hashMap.put("MagicAdPublicService", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.f491063br2), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.j6.CTRL_INDEX)));
            hashMap.put("MagicEcsPublicService", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.f491057ne1), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.cd.CTRL_INDEX)));
            hashMap.put("MagicAdBrandService", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.bqk), 238));
            hashMap.put("MagicFinderCard", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.bqk), 240));
            hashMap.put("MagicEmojiCocos", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.bqk), 245));
            hashMap.put("MagicSclNativeDemo", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.ldf), 241));
            hashMap.put("MagicAdPlayableBasic", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.lde), 242));
            hashMap.put("MagicNewAdPlayableBasic", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.mft), 246));
            hashMap.put("MagicGameLoading", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.ldd), 243));
            hashMap.put("MagicBrushDemo", new android.util.Pair(java.lang.Integer.valueOf(com.tencent.mm.R.string.f491060ne4), 250));
            new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$d
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.List list3;
                    java.util.List list4;
                    java.util.Map.Entry entry;
                    java.lang.String str2;
                    java.util.Locale locale;
                    int i17 = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.Y1;
                    com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.this;
                    appAttachNewDownloadUI.getClass();
                    java.util.Iterator it = hashMap.entrySet().iterator();
                    do {
                        boolean hasNext = it.hasNext();
                        list3 = list;
                        list4 = list2;
                        if (!hasNext) {
                            java.util.Iterator it6 = ge3.s.f270974a.keySet().iterator();
                            while (it6.hasNext()) {
                                if (appAttachNewDownloadUI.C.startsWith((java.lang.String) it6.next())) {
                                    list3.add(appAttachNewDownloadUI.getString(com.tencent.mm.R.string.lpv));
                                    list4.add(244);
                                    return;
                                }
                            }
                            if (appAttachNewDownloadUI.C.split("\\.").length != 0) {
                                list3.add(appAttachNewDownloadUI.getString(com.tencent.mm.R.string.lpv));
                                list4.add(244);
                                return;
                            }
                            return;
                        }
                        entry = (java.util.Map.Entry) it.next();
                        str2 = appAttachNewDownloadUI.C;
                        locale = java.util.Locale.ROOT;
                    } while (!str2.toLowerCase(locale).startsWith(((java.lang.String) entry.getKey()).toLowerCase(locale)));
                    list3.add(appAttachNewDownloadUI.getString(((java.lang.Integer) ((android.util.Pair) entry.getValue()).first).intValue()));
                    list4.add((java.lang.Integer) ((android.util.Pair) entry.getValue()).second);
                }
            }.run();
            if (((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).pj(this.C.split("\\.")[0])) {
                list.add(getString(com.tencent.mm.R.string.ndl));
                list2.add(251);
            }
        }
    }

    public final void W6(boolean z17) {
        if (c7() != null) {
            java.lang.String str = c7().field_fileFullPath;
            java.lang.String str2 = lp0.b.D() + "jsengine/pkg/";
            if (!com.tencent.mm.vfs.w6.j(str2)) {
                com.tencent.mm.vfs.w6.u(str2);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str2);
            sb6.append(z17 ? "webtimeline.wspkg" : "index.wspkg");
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.vfs.w6.h(sb7);
            long d17 = com.tencent.mm.vfs.w6.d(str, sb7, false);
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Done, ret=" + d17, 1).show();
        }
    }

    public final void X6(int i17, int i18) {
        if (c7() != null) {
            com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent = new com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent();
            am.dj djVar = localCheckResUpdateCacheFileEvent.f54480g;
            djVar.f6471a = i17;
            djVar.f6472b = i18;
            if (c7() != null) {
                djVar.f6473c = c7().field_fileFullPath;
            }
            localCheckResUpdateCacheFileEvent.e();
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.format("apply to mv", new java.lang.Object[0]), 1).show();
        }
    }

    public final void Y6(java.lang.String str) {
        java.lang.String str2;
        if (c7() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppAttachNewDownloadUI", "getAppAttachInfo is null");
            return;
        }
        java.lang.String str3 = c7().field_fileFullPath;
        java.lang.String concat = ((com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class))).Di().concat("mbpkgs/");
        if (!com.tencent.mm.vfs.w6.j(concat)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "mkdir %s ret:%b", concat, java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.u(concat)));
        }
        com.tencent.mm.vfs.w6.t(concat);
        if (str == null || str.length() <= 0) {
            java.lang.String replaceAll = !this.C.isEmpty() ? this.C : str3.replaceAll(".*/", "").replaceAll(".*_", "");
            str2 = replaceAll;
            str = replaceAll.replaceAll("\\.wspkg.*$", "");
        } else {
            str2 = str.concat(".wspkg");
        }
        java.lang.String str4 = concat + str2;
        com.tencent.mm.vfs.w6.h(str4);
        long d17 = com.tencent.mm.vfs.w6.d(str3, str4, false);
        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Done, ret=" + d17, 1).show();
        ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).nj(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "appId: %s, baseFileName: %s, filePath: %s, toPath: %s", str, str2, str3, str4);
    }

    public final boolean Z6() {
        boolean isWifi;
        long j17 = this.F;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393259f) {
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(context);
        } else if (r75.d.f393257d == -100) {
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context);
            r75.d.f393257d = netType;
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(netType);
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(r75.d.f393257d);
        }
        return (!isWifi ? (j17 > ((long) ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FileClickdownloadSizeByteLimitNotInWifi", 1048576)) ? 1 : (j17 == ((long) ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FileClickdownloadSizeByteLimitNotInWifi", 1048576)) ? 0 : -1)) <= 0 : (j17 > ((long) ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FileClickdownloadSizeByteLimitInWifi", 10485760)) ? 1 : (j17 == ((long) ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FileClickdownloadSizeByteLimitInWifi", 10485760)) ? 0 : -1)) <= 0) && !this.D1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (com.tencent.mm.pluginsdk.model.t3.k(r7, r8) != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.a7():void");
    }

    public final void b7() {
        com.tencent.mm.pluginsdk.model.app.d o17;
        if (!this.M && this.f198117v.k2()) {
            ot0.q v17 = ot0.q.v(this.f198117v.j());
            if (ez.v0.f257777a.j(java.lang.Integer.valueOf(v17.f348666i)) && !com.tencent.mm.sdk.platformtools.t8.K0(v17.A) && (o17 = com.tencent.mm.pluginsdk.model.app.k0.o(this.f198117v, v17.f348694p)) != null && (!com.tencent.mm.vfs.w6.j(o17.field_fileFullPath) || com.tencent.mm.vfs.w6.k(o17.field_fileFullPath) != o17.field_totalLen)) {
                this.f198105l1 = true;
                f7(false);
                o17.field_status = 101;
                o17.field_lastModifyTime = c01.id.e();
                com.tencent.mm.pluginsdk.model.app.u5.wi().update(o17, new java.lang.String[0]);
                H7();
                return;
            }
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        com.tencent.mm.pluginsdk.model.a2.j(doFavoriteEvent, this.f198117v, false);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6323i = this;
        c4Var.f6327m = 39;
        doFavoriteEvent.e();
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        if (m0Var == null || l0Var == null) {
            return;
        }
        ez.v0 v0Var = ez.v0.f257777a;
        boolean k17 = v0Var.k(java.lang.Integer.valueOf(this.f198099d));
        java.util.ArrayList arrayList = l0Var.f454412c;
        if (!k17) {
            if (v0Var.j(java.lang.Integer.valueOf(this.f198099d))) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
                    if (this.f198115t == f9Var.getMsgId() && f9Var.j() != null) {
                        this.f198117v = f9Var;
                        this.f198125z = f9Var.j();
                        E7(false);
                    }
                }
                return;
            }
            return;
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) it6.next();
            if (this.f198115t == f9Var2.getMsgId()) {
                java.lang.String j17 = f9Var2.j();
                if (this.f198122y && f9Var2.A0() == 0) {
                    j17 = f9Var2.j();
                    if (this.f198122y && j17 != null) {
                        j17 = c01.w9.u(j17);
                    }
                }
                ot0.q v17 = ot0.q.v(j17);
                if (v17 != null) {
                    int ij6 = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).ij(f9Var2, c7());
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "update msgId:%s newType:%s newFileStatus:%s", java.lang.Long.valueOf(this.f198115t), java.lang.Integer.valueOf(v17.f348666i), java.lang.Integer.valueOf(ij6));
                    ez.v0 v0Var2 = ez.v0.f257777a;
                    if (v0Var2.j(java.lang.Integer.valueOf(v17.f348666i)) && ij6 == 1) {
                        if (m7() && i7()) {
                            E7(true);
                            return;
                        } else {
                            finish();
                            return;
                        }
                    }
                    if (v0Var2.j(java.lang.Integer.valueOf(v17.f348666i))) {
                        if (m7() && i7()) {
                            return;
                        }
                        finish();
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    public final com.tencent.mm.pluginsdk.model.app.d c7() {
        return d7(this.f198099d, this.f198115t, this.f198116u, this.f198113r, this.f198125z);
    }

    @Override // com.tencent.mm.ui.MMActivity
    /* renamed from: e7, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.ui.MMActivity getContext() {
        return (com.tencent.mm.ui.MMActivity) super.getContext();
    }

    public final int f7(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = ");
        sb6.append(false);
        sb6.append(", stack = ");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
        return 101;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        java.lang.Object obj = this.f198124y1;
        if (obj != null) {
            ((com.tencent.mm.plugin.ball.service.d) obj).p();
        }
        super.finish();
    }

    public final java.lang.String g7() {
        ot0.q v17 = ot0.q.v(this.f198125z);
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppAttachNewDownloadUI", "parse content error?? content:%s", this.f198125z);
            return "";
        }
        jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
        java.lang.String str = v17.f348690o;
        ((ht.a) vVar).getClass();
        return com.tencent.mm.pluginsdk.ui.tools.f.e(str);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a4p;
    }

    public final void h7() {
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        if (!m7()) {
            finish();
            return;
        }
        boolean T6 = ((qe5.o) pf5.z.f353948a.a(this).a(qe5.o.class)).T6(this.f198117v);
        this.G1 = T6;
        if (T6) {
            ((qe5.o) pf5.z.f353948a.a(this).a(qe5.o.class)).Z6(this.f198117v);
            return;
        }
        if (!i7()) {
            x7(true);
            finish();
            return;
        }
        if (this.f198117v.getType() == 1090519089) {
            com.tencent.mm.pluginsdk.model.app.d c76 = c7();
            if (this.f198117v.Z1() == 0 && !this.M) {
                ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(this.f198117v, c76, 0, true);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(this.f198115t, this.f198117v);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "checkFileStatus msgId:%s reset file sender", java.lang.Long.valueOf(this.f198115t));
            }
            if (c76 != null && c76.field_status == 199 && !com.tencent.mm.vfs.w6.j(c76.field_fileFullPath)) {
                c76.field_status = 102L;
                c76.field_offset = 0L;
                com.tencent.mm.pluginsdk.model.app.u5.wi().update(c76, new java.lang.String[0]);
                d35.h.f226344a.a(this.f198117v);
            }
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(lp0.b.t());
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        com.tencent.mm.pluginsdk.model.app.u5.wi().add(this);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this, android.os.Looper.getMainLooper());
        initView();
        x7(false);
        a7();
        j7();
        ty.i0 i0Var = (ty.i0) i95.n0.c(ty.i0.class);
        dp1.a aVar = new dp1.a(getContext());
        ((sy.x) i0Var).getClass();
        gc5.b bVar = new gc5.b(aVar);
        this.f198124y1 = bVar;
        bVar.u0(this.B, this.E, this.D, true);
        ((gc5.b) this.f198124y1).v0(this.E, this.C);
        final android.os.Bundle bundleExtra = getIntent().getBundleExtra("jumpChat");
        if (bundleExtra == null || !bundleExtra.containsKey("u")) {
            return;
        }
        c01.f8 f8Var = (c01.f8) i95.n0.c(c01.f8.class);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.u7v);
        textView.setVisibility(0);
        final yv1.b1 b1Var = (yv1.b1) f8Var;
        textView.setText(b1Var.Ri(this, bundleExtra, textView.getTextSize()));
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$c
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.Y1;
                com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.this;
                appAttachNewDownloadUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                c01.f8 f8Var2 = b1Var;
                arrayList.add(f8Var2);
                android.os.Bundle bundle = bundleExtra;
                arrayList.add(bundle);
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", appAttachNewDownloadUI, array);
                ((yv1.b1) f8Var2).Ai(appAttachNewDownloadUI, bundle);
                yj0.a.h(appAttachNewDownloadUI, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.w3
    public ty.l0 i5() {
        return new ty.l0(false, this.f198104i.getText().toString(), this.f198103h.getText().toString(), "", this.f198104i.getVisibility() == 0, this.f198103h.getVisibility() == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i7() {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.i7():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0327, code lost:
    
        if (r0 != 131) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0246  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.initView():void");
    }

    public final void j7() {
        ty.i0 i0Var = (ty.i0) i95.n0.c(ty.i0.class);
        ak3.i iVar = new ak3.i(getContext());
        ((sy.x) i0Var).getClass();
        md5.b bVar = new md5.b(iVar);
        this.f198121x1 = bVar;
        bVar.c0(this.B, this.E, this.D, true);
        ((md5.b) ((md5.c) this.f198121x1)).d0(this.E, this.C);
        this.f198111p1.saveToMultiTaskInfo(this.f198121x1.f300077a);
    }

    public final void k7() {
        com.tencent.mm.pluginsdk.model.g2 g2Var = new com.tencent.mm.pluginsdk.model.g2(g7(), this.B);
        g2Var.f189312e = this.f198115t;
        g2Var.f189313f = this.f198116u;
        g2Var.f189310c = this.C;
        g2Var.f189311d = this.E;
        g2Var.f189315h = 3;
        jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
        com.tencent.mm.pluginsdk.model.n3 n3Var = this.L1;
        ((ht.a) vVar).getClass();
        this.C1 = new com.tencent.mm.pluginsdk.ui.otherway.u0(this, g2Var, n3Var);
    }

    public final void l7() {
        if (!x51.t1.b(this.B) && this.C1 == null) {
            k7();
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f198109p;
            com.tencent.mm.pluginsdk.ui.otherway.u0 u0Var = (com.tencent.mm.pluginsdk.ui.otherway.u0) this.C1;
            if (u0Var.f190997p == null) {
                com.tencent.mm.pluginsdk.ui.otherway.r0 r0Var = new com.tencent.mm.pluginsdk.ui.otherway.r0(new com.tencent.mm.pluginsdk.ui.otherway.OtherOpenWayAdapterBuilder$buildAdapter$2(), u0Var.g());
                u0Var.f190997p = r0Var;
                r0Var.B = u0Var.f190999r;
            }
            recyclerView.setAdapter(u0Var.f190997p);
            ((com.tencent.mm.pluginsdk.ui.otherway.u0) this.C1).f190998q = new com.tencent.mm.ui.chatting.h(this);
        }
        com.tencent.mm.pluginsdk.model.o2 o2Var = this.C1;
        if (o2Var != null) {
            ((com.tencent.mm.pluginsdk.ui.otherway.u0) o2Var).m();
            java.util.ArrayList arrayList = ((com.tencent.mm.pluginsdk.ui.otherway.u0) this.C1).f191005f;
            boolean z17 = arrayList == null || arrayList.isEmpty();
            this.F1 = z17;
            if (z17) {
                B7(0);
                this.f198109p.setVisibility(8);
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f198103h.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479734dr));
                s7();
                this.f198106m.setText(com.tencent.mm.R.string.ne9);
            } else {
                this.f198103h.setVisibility(8);
                this.f198109p.setVisibility(0);
                this.f198109p.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this, 0, false));
                this.f198106m.setText(com.tencent.mm.R.string.brw);
                if (this.f198109p.getItemDecorationCount() == 0) {
                    this.f198109p.N(new com.tencent.mm.ui.chatting.i(this));
                }
            }
            E7(false);
        }
    }

    public final boolean m7() {
        com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem;
        this.f198114s = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f198115t = getIntent().getLongExtra("app_msg_id", -1L);
        this.f198116u = getIntent().getStringExtra("msg_talker");
        this.R = getIntent().getBooleanExtra("choose_way", false);
        this.U = getIntent().getIntExtra("msg_type", 0);
        if (this.f198115t == -1) {
            return false;
        }
        this.f198118w = getIntent().getBooleanExtra("app_show_share", true);
        this.f198117v = pt0.f0.f2(this.f198116u, this.f198115t);
        this.I1 = getIntent().getStringExtra("msg_conv_sesssionid");
        com.tencent.mm.storage.f9 f9Var = this.f198117v;
        if (f9Var == null || f9Var.getMsgId() == 0 || this.f198117v.j() == null) {
            if (!(this.U == 1) || (msgQuoteItem = (com.tencent.mm.plugin.msgquote.model.MsgQuoteItem) getIntent().getParcelableExtra("key_quoted_msg")) == null) {
                return false;
            }
            com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
            this.f198117v = f9Var2;
            f9Var2.setType(msgQuoteItem.f149482d);
            this.f198117v.o1(msgQuoteItem.f149483e);
            this.f198117v.u1(msgQuoteItem.f149484f);
            this.f198117v.u3(msgQuoteItem.f149487i);
            this.f198117v.d1(msgQuoteItem.f149488m);
            if (com.tencent.mm.sdk.platformtools.t8.D0(msgQuoteItem.f149485g, c01.z1.r())) {
                this.f198117v.j1(1);
            }
        }
        this.f198122y = com.tencent.mm.storage.z3.R4(this.f198117v.Q0());
        return true;
    }

    public final boolean o7() {
        com.tencent.mm.pluginsdk.model.app.d c76 = c7();
        if (c76 == null) {
            return true;
        }
        if (com.tencent.mm.vfs.w6.j(c76.field_fileFullPath)) {
            this.f198102g.a(8);
            return true;
        }
        p7();
        if (this.f198114s != 3) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("resLoadFailed", true);
        setResult(-1, intent);
        finish();
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
        boolean z17 = this.Q;
        ((ht.a) vVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.f.f(this, i17, i18, intent, z17, com.tencent.mm.R.string.brq, com.tencent.mm.R.string.brr, 1);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        h7();
        this.K1.alive();
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 0, 0, getString(com.tencent.mm.R.string.f490359sr));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        bt3.l0 l0Var = this.f198112q;
        if (l0Var != null) {
            l0Var.f24314f = null;
        }
        com.tencent.mm.pluginsdk.model.app.u5.wi().remove(this);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
        super.onDestroy();
        jk3.v vVar = this.f198121x1;
        if (vVar != null) {
            vVar.getClass();
        }
        java.lang.Object obj = this.f198124y1;
        if (obj != null) {
            ((com.tencent.mm.plugin.ball.service.s4) obj).o0();
        }
        if (this.f198111p1 != null) {
            ((d73.i) i95.n0.c(d73.i.class)).a9(this.f198111p1);
        }
        this.K1.dead();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        jk3.v vVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "onKeyDown keyCode %d", java.lang.Integer.valueOf(i17));
        if (i17 == 4 && (vVar = this.f198121x1) != null && vVar.U(2, false)) {
            return true;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        jk3.v vVar = this.f198121x1;
        if (vVar != null) {
            vVar.A();
            this.f198121x1.getClass();
        }
        h7();
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        K7();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.G1) {
            return;
        }
        c01.d9.e().q(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, this);
        c01.d9.e().q(728, this);
        jk3.v vVar = this.f198121x1;
        if (vVar != null) {
            vVar.A();
        }
        java.lang.Object obj = this.f198124y1;
        if (obj != null) {
            ((com.tencent.mm.plugin.ball.service.s4) obj).z();
        }
        com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = new com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent();
        am.ao aoVar = pauseAutoGetBigImgEvent.f54607g;
        aoVar.f6172a = false;
        com.tencent.mm.storage.f9 f9Var = this.f198117v;
        aoVar.f6173b = f9Var == null ? "" : f9Var.Q0();
        pauseAutoGetBigImgEvent.b(getMainLooper());
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.G1) {
            return;
        }
        c01.d9.e().a(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, this);
        c01.d9.e().a(728, this);
        com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = new com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent();
        am.ao aoVar = pauseAutoGetBigImgEvent.f54607g;
        aoVar.f6172a = true;
        aoVar.f6173b = this.f198117v.Q0();
        pauseAutoGetBigImgEvent.b(getMainLooper());
        this.E1 = false;
        this.f198103h.setEnabled(true);
        this.f198104i.setEnabled(true);
        jk3.v vVar = this.f198121x1;
        if (vVar != null) {
            vVar.z();
        }
        java.lang.Object obj = this.f198124y1;
        if (obj != null) {
            ((com.tencent.mm.plugin.ball.service.s4) obj).x();
        }
        G7();
        ((sy.x) ((ty.m0) i95.n0.c(ty.m0.class))).wi(java.lang.Integer.toString(hashCode()), this.E, com.tencent.mm.sdk.platformtools.w2.a(this.C), 9L, g7(), i5());
        if (this.J1) {
            l7();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "summerapp onSceneEnd type[%d], [%d, %d, %s]", java.lang.Integer.valueOf(m1Var.getType()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var.getType() == 221 || m1Var.getType() == 728) {
            if (m1Var.getType() == 728 && i17 == 0 && i18 == 0) {
                com.tencent.mm.pluginsdk.model.app.d c76 = c7();
                if (c76 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "summerapp onSceneEnd getAppAttachInfo is null");
                } else {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    java.lang.String str2 = c76.field_signature;
                    objArr[0] = java.lang.Integer.valueOf(str2 != null ? str2.length() : -1);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "summerapp onSceneEnd CheckBigFileDownload ok signature len[%d] start NetSceneDownloadAppAttach", objArr);
                }
                if (c76 != null) {
                    f7(false);
                    c76.field_status = 101;
                    c76.field_lastModifyTime = c01.id.e();
                    com.tencent.mm.pluginsdk.model.app.u5.wi().update(c76, new java.lang.String[0]);
                }
                if (this.f198112q != null) {
                    c01.d9.e().d(this.f198112q);
                }
                this.f198112q = new bt3.l0(this.f198115t, this.f198117v.Q0(), this.f198113r, this.f198119x);
                c01.d9.e().g(this.f198112q);
                return;
            }
            if (this.f198112q == null && (m1Var instanceof bt3.l0)) {
                bt3.l0 l0Var = (bt3.l0) m1Var;
                com.tencent.mm.pluginsdk.model.app.d c77 = c7();
                if (c77 != null && !x51.t1.b(c77.field_mediaSvrId) && c77.field_mediaSvrId.equals(l0Var.L())) {
                    this.f198112q = l0Var;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "summerapp onSceneEnd reset downloadAppAttachScene[%s] by mediaSvrId[%s]", l0Var, c77.field_mediaSvrId);
                }
            }
            if (i17 == 0 && i18 == 0) {
                if (ez.v0.f257777a.j(java.lang.Integer.valueOf(this.A.f348666i))) {
                    y7(0, 2);
                    com.tencent.mm.pluginsdk.model.app.d c78 = c7();
                    if (c78 != null) {
                        jx3.f.INSTANCE.idkeyStat(1203L, 5L, c78.field_totalLen, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i18 != 0 && z65.c.a()) {
                dp.a.makeText(this, "errCode[" + i18 + "]", 0).show();
            }
            if (i18 == -5103087 || i18 == -5103017 || i18 == -5103059) {
                com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f198116u, this.f198115t);
                ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(this.f198117v, c7(), 4, true);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.getMsgId(), Li, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "msgId:%s fail, errCode:%s", java.lang.Long.valueOf(this.f198115t), java.lang.Integer.valueOf(i18));
            }
            if (i18 != -5103059) {
                E7(false);
                com.tencent.mars.xlog.Log.e("MicroMsg.AppAttachNewDownloadUI", "summerapp onSceneEnd, download fail, type = " + m1Var.getType() + " errType = " + i17 + ", errCode = " + i18);
                return;
            }
            p7();
            C7(8);
            y7(1, 3);
            if (this.f198114s == 3) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("resLoadFailed", true);
                setResult(-1, intent);
                finish();
            }
        }
    }

    public final void p7() {
        this.V.setVisibility(0);
        this.f198102g.b(false);
        this.Y.setVisibility(8);
    }

    public final void q7(int i17) {
        if (i17 == 215) {
            com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent = new com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent();
            am.dj djVar = localCheckResUpdateCacheFileEvent.f54480g;
            djVar.f6471a = 73;
            djVar.f6472b = 1;
            if (c7() != null) {
                djVar.f6473c = c7().field_fileFullPath;
            }
            localCheckResUpdateCacheFileEvent.e();
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.format("apply success", new java.lang.Object[0]), 1).show();
            return;
        }
        if (i17 != 216) {
            switch (i17) {
                case 25:
                    if (c7() != null) {
                        com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent2 = new com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent();
                        am.dj djVar2 = localCheckResUpdateCacheFileEvent2.f54480g;
                        djVar2.f6471a = 27;
                        djVar2.f6472b = 1;
                        if (c7() != null) {
                            djVar2.f6473c = c7().field_fileFullPath;
                        }
                        localCheckResUpdateCacheFileEvent2.e();
                        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.format("current template is %d", java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(0))), 1).show();
                        com.tencent.mm.xwebutil.s0.b("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
                        return;
                    }
                    return;
                case 26:
                    com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent3 = new com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent();
                    am.dj djVar3 = localCheckResUpdateCacheFileEvent3.f54480g;
                    djVar3.f6471a = 40;
                    djVar3.f6472b = 1;
                    if (c7() != null) {
                        djVar3.f6473c = c7().field_fileFullPath;
                        djVar3.f6473c = c7().field_fileFullPath;
                    }
                    localCheckResUpdateCacheFileEvent3.e();
                    db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.format("current wxa template is %d", java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(3))), 1).show();
                    return;
                case 27:
                    com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = new com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent();
                    am.r2 r2Var = checkResUpdateCacheFileEvent.f54053g;
                    r2Var.f7759a = 35;
                    r2Var.f7760b = 1;
                    if (c7() != null) {
                        r2Var.f7761c = c7().field_fileFullPath;
                    }
                    checkResUpdateCacheFileEvent.e();
                    db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.format("apply success", new java.lang.Object[0]), 1).show();
                    return;
                case 28:
                    com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent4 = new com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent();
                    am.dj djVar4 = localCheckResUpdateCacheFileEvent4.f54480g;
                    djVar4.f6471a = 27;
                    djVar4.f6472b = 2;
                    if (c7() != null) {
                        djVar4.f6473c = c7().field_fileFullPath;
                    }
                    localCheckResUpdateCacheFileEvent4.e();
                    db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.format("current browse template is %d", java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(1))), 1).show();
                    return;
                default:
                    switch (i17) {
                        case 210:
                            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent2 = new com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent();
                            am.r2 r2Var2 = checkResUpdateCacheFileEvent2.f54053g;
                            r2Var2.f7759a = 62;
                            r2Var2.f7760b = 1;
                            if (c7() != null) {
                                r2Var2.f7761c = c7().field_fileFullPath;
                            }
                            checkResUpdateCacheFileEvent2.e();
                            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.format("apply success", new java.lang.Object[0]), 1).show();
                            return;
                        case 211:
                            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent3 = new com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent();
                            am.r2 r2Var3 = checkResUpdateCacheFileEvent3.f54053g;
                            r2Var3.f7759a = 62;
                            r2Var3.f7760b = 2;
                            if (c7() != null) {
                                r2Var3.f7761c = c7().field_fileFullPath;
                            }
                            checkResUpdateCacheFileEvent3.e();
                            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.format("apply success", new java.lang.Object[0]), 1).show();
                            return;
                        case 212:
                            com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent5 = new com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent();
                            am.dj djVar5 = localCheckResUpdateCacheFileEvent5.f54480g;
                            djVar5.f6471a = 66;
                            djVar5.f6472b = 1;
                            if (c7() != null) {
                                djVar5.f6473c = c7().field_fileFullPath;
                            }
                            localCheckResUpdateCacheFileEvent5.e();
                            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.format("current pardus template is %d", java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(5))), 1).show();
                            return;
                        case 213:
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "applyToScanGoods");
                            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent4 = new com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent();
                            am.r2 r2Var4 = checkResUpdateCacheFileEvent4.f54053g;
                            r2Var4.f7759a = 64;
                            r2Var4.f7760b = 1;
                            if (c7() != null) {
                                r2Var4.f7761c = c7().field_fileFullPath;
                            }
                            checkResUpdateCacheFileEvent4.e();
                            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.format("apply success", new java.lang.Object[0]), 1).show();
                            return;
                        default:
                            switch (i17) {
                                case 218:
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "applyToImageOcr");
                                    com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent5 = new com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent();
                                    am.r2 r2Var5 = checkResUpdateCacheFileEvent5.f54053g;
                                    r2Var5.f7759a = 84;
                                    r2Var5.f7760b = 1;
                                    if (c7() != null) {
                                        r2Var5.f7761c = c7().field_fileFullPath;
                                    }
                                    checkResUpdateCacheFileEvent5.e();
                                    db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.format("apply success", new java.lang.Object[0]), 1).show();
                                    return;
                                case 219:
                                    X6(87, 1);
                                    return;
                                case 220:
                                    if (c7() != null) {
                                        com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent6 = new com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent();
                                        am.dj djVar6 = localCheckResUpdateCacheFileEvent6.f54480g;
                                        djVar6.f6471a = 86;
                                        djVar6.f6472b = 2;
                                        if (c7() != null) {
                                            djVar6.f6473c = c7().field_fileFullPath;
                                        }
                                        localCheckResUpdateCacheFileEvent6.e();
                                        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.format("apply to TextStatus", new java.lang.Object[0]), 1).show();
                                        return;
                                    }
                                    return;
                                case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP /* 221 */:
                                    X6(92, 1);
                                    return;
                                case com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT /* 222 */:
                                    X6(92, 2);
                                    return;
                                case 223:
                                    com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent7 = new com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent();
                                    am.dj djVar7 = localCheckResUpdateCacheFileEvent7.f54480g;
                                    djVar7.f6471a = 95;
                                    djVar7.f6472b = 1;
                                    if (c7() != null) {
                                        djVar7.f6473c = c7().field_fileFullPath;
                                    }
                                    localCheckResUpdateCacheFileEvent7.e();
                                    db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.format("current ftshotsearch template is %d", java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(9))), 1).show();
                                    return;
                                case 224:
                                    W6(true);
                                    return;
                                case 225:
                                    W6(false);
                                    return;
                                case com.tencent.mm.plugin.appbrand.jsapi.contact.j.CTRL_INDEX /* 226 */:
                                    Y6("");
                                    return;
                                case 227:
                                    Y6("wx9e221f7828fa7482");
                                    return;
                                case 228:
                                    com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent8 = new com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent();
                                    am.dj djVar8 = localCheckResUpdateCacheFileEvent8.f54480g;
                                    djVar8.f6471a = 79;
                                    djVar8.f6472b = 2;
                                    if (c7() != null) {
                                        djVar8.f6473c = c7().field_fileFullPath;
                                    }
                                    localCheckResUpdateCacheFileEvent8.e();
                                    db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.format("current emojisearch template is %d", java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(10))), 1).show();
                                    return;
                                default:
                                    switch (i17) {
                                        case 230:
                                            break;
                                        case 231:
                                            Y6("wx2f3fb5db9f226462");
                                            return;
                                        case 232:
                                            Y6("wxe208ce76dfa39515");
                                            return;
                                        case com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR /* 233 */:
                                            break;
                                        case 234:
                                            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "applyToSelectText");
                                            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent6 = new com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent();
                                            am.r2 r2Var6 = checkResUpdateCacheFileEvent6.f54053g;
                                            r2Var6.f7759a = 84;
                                            r2Var6.f7760b = 2;
                                            if (c7() != null) {
                                                r2Var6.f7761c = c7().field_fileFullPath;
                                            }
                                            checkResUpdateCacheFileEvent6.e();
                                            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.format("apply success", new java.lang.Object[0]), 1).show();
                                            return;
                                        case 235:
                                            Y6("wxf337cbaa27790mb2");
                                            return;
                                        case com.tencent.mm.plugin.appbrand.jsapi.j6.CTRL_INDEX /* 236 */:
                                            Y6("MagicAdPublicService");
                                            return;
                                        case 237:
                                            Y6("MagicBrandService");
                                            return;
                                        case 238:
                                            Y6("MagicAdBrandService");
                                            return;
                                        case 239:
                                            if (c7() == null) {
                                                com.tencent.mars.xlog.Log.w("MicroMsg.AppAttachNewDownloadUI", "applyToXWebRuntime, no attach info");
                                                return;
                                            }
                                            java.lang.String str = c7().field_fileFullPath;
                                            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "applyToXWebRuntime, attach filePath: " + str);
                                            java.lang.String D = lp0.b.D();
                                            if (com.tencent.mm.vfs.w6.j(D)) {
                                                com.tencent.mm.vfs.w6.f(D);
                                            }
                                            com.tencent.mm.vfs.w6.u(D);
                                            java.lang.String str2 = D + "runtime_package.zip";
                                            com.tencent.mm.vfs.w6.h(str2);
                                            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "applyToXWebRuntime, toPath: " + str2 + ", result:" + com.tencent.mm.vfs.w6.d(str, str2, false));
                                            com.tencent.xweb.a3.n(getContext(), str2);
                                            com.tencent.mm.vfs.w6.h(str2);
                                            return;
                                        case 240:
                                            Y6("MagicFinderCard");
                                            return;
                                        case 241:
                                            Y6("MagicSclNativeDemo");
                                            return;
                                        case 242:
                                            Y6("MagicAdPlayableBasic");
                                            return;
                                        case 243:
                                            Y6("MagicGameLoading");
                                            return;
                                        case 244:
                                            Y6(null);
                                            break;
                                        case 245:
                                            Y6("MagicEmojiCocos");
                                            return;
                                        case 246:
                                            Y6("MagicNewAdPlayableBasic");
                                            return;
                                        case 247:
                                            Y6("MagicEcsKFDynamicCard");
                                            return;
                                        case 248:
                                            Y6("MagicEcsTimeline");
                                            return;
                                        case com.tencent.mm.plugin.appbrand.jsapi.cd.CTRL_INDEX /* 249 */:
                                            Y6("MagicEcsPublicService");
                                            return;
                                        case 250:
                                            Y6("MagicBrushDemo");
                                            return;
                                        case 251:
                                            if (!com.tencent.mm.vfs.w6.h(((com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class))).Di() + "mbpkgs/" + this.C)) {
                                                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "No debug pkg found", 1).show();
                                                return;
                                            }
                                            ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).wi(this.C.split("\\.")[0]);
                                            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Done", 1).show();
                                            return;
                                        case 252:
                                            Y6("MagicEcsTimelineSubscribe");
                                            return;
                                        case com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR /* 253 */:
                                            Y6("MagicEcsShop");
                                            return;
                                        default:
                                            return;
                                    }
                                    if (c7() != null) {
                                        java.lang.String str3 = c7().field_fileFullPath;
                                        java.lang.String str4 = lp0.b.D() + "webcompt_debug/jsapi/";
                                        if (!com.tencent.mm.vfs.w6.j(str4)) {
                                            com.tencent.mm.vfs.w6.u(str4);
                                        }
                                        java.lang.String str5 = str4 + "webcompt.wcpkg";
                                        com.tencent.mm.vfs.w6.h(str5);
                                        long d17 = com.tencent.mm.vfs.w6.d(str3, str5, false);
                                        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Done, ret=" + d17, 1).show();
                                        return;
                                    }
                                    return;
                            }
                    }
            }
        }
        com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent9 = new com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent();
        am.dj djVar9 = localCheckResUpdateCacheFileEvent9.f54480g;
        djVar9.f6471a = 79;
        djVar9.f6472b = 1;
        if (c7() != null) {
            djVar9.f6473c = c7().field_fileFullPath;
        }
        localCheckResUpdateCacheFileEvent9.e();
        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.format("apply success", new java.lang.Object[0]), 1).show();
        if (c7() != null) {
            java.lang.String str6 = c7().field_fileFullPath;
            java.lang.String str7 = lp0.b.D() + "biztest/";
            if (com.tencent.mm.vfs.w6.j(str7)) {
                com.tencent.mm.vfs.w6.f(str7);
            }
            com.tencent.mm.vfs.w6.u(str7);
            long Q = com.tencent.mm.vfs.w6.Q(str6, str7);
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Done, ret=" + Q, 1).show();
        }
    }

    public final void r7() {
        int i17 = this.f198099d;
        if (i17 != 0) {
            if (i17 != 2) {
                if (i17 != 74 && i17 != 6) {
                    if (i17 == 7) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("App_MsgId", this.f198115t);
                        intent.putExtra("App_MsgTalker", this.f198117v.Q0());
                        setResult(-1, intent);
                        finish();
                    } else if (i17 != 130 && i17 != 131) {
                        B7(0);
                        G7();
                        C7(8);
                    }
                }
                if (o7()) {
                    if (com.tencent.mm.sdk.platformtools.t8.G0(this.E)) {
                        D7();
                        x7(true);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "onDownLoadImpl");
                        E7(false);
                    }
                }
            } else if (o7()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "[ImageGalleryUI] showImage");
                android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.class);
                intent2.putExtra("img_gallery_msg_id", this.f198117v.getMsgId());
                intent2.putExtra("img_gallery_talker", this.f198117v.Q0());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI", "showImage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI", "showImage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                finish();
                overridePendingTransition(0, 0);
                x7(true);
            }
        } else if (o7()) {
            if (com.tencent.mm.sdk.platformtools.t8.G0(this.E)) {
                D7();
                x7(true);
            } else {
                C7(8);
                this.f198102g.a(8);
                if (x51.t1.b(g7())) {
                    this.f198104i.setVisibility(8);
                    B7(8);
                } else {
                    B7(0);
                    G7();
                }
                F7();
            }
        }
        if (this.f198111p1.getFileStatus() != 1) {
            this.f198111p1.setFileStatus(1);
            com.tencent.mm.pluginsdk.model.app.d c76 = c7();
            if (c76 != null) {
                com.tencent.mm.plugin.handoff.model.AbsHandOffFile absHandOffFile = this.f198111p1;
                java.lang.String str = c76.field_fileFullPath;
                int i18 = x51.t1.f452086a;
                if (str == null) {
                    str = "";
                }
                absHandOffFile.setFullPath(str);
            }
            ((d73.i) i95.n0.c(d73.i.class)).Ja(this.f198111p1);
            ((d73.i) i95.n0.c(d73.i.class)).Jc(this.f198111p1);
        }
        jt.a0 a0Var = (jt.a0) i95.n0.c(jt.a0.class);
        java.lang.String str2 = this.E;
        java.lang.String g76 = g7();
        ((ht.s) a0Var).getClass();
        if (com.tencent.mm.pluginsdk.model.t3.k(str2, g76)) {
            return;
        }
        if (x51.t1.b(this.B)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials, filePath is empty");
            return;
        }
        if (this.B.equals(this.M1) && this.N1 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials, already load");
            return;
        }
        com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel b17 = com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel.b(this.B, this.E);
        com.tencent.mm.plugin.appbrand.service.k5 k5Var = (com.tencent.mm.plugin.appbrand.service.k5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k5.class);
        if (k5Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials, openMaterialService is null");
            return;
        }
        zh1.p pVar = (zh1.p) k5Var;
        if (pVar.Vi(bi1.g.ATTACH)) {
            pVar.Ni(b17, new com.tencent.mm.ui.chatting.i0(this, b17, pVar));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials, openMaterialService is not enabled");
        }
    }

    public final void s7() {
        this.f198103h.setBackgroundColor(getColor(com.tencent.mm.R.color.abt));
        this.f198103h.setTextColor(getColor(com.tencent.mm.R.color.abu));
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(qe5.o.class);
    }

    public final boolean t7() {
        return u7(this.B, this.E, this.C, this.G);
    }

    public final boolean u7(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (!((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Ai(str2)) {
            return true;
        }
        bw5.l80 wi6 = ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).wi(str, str2, str3, str4);
        il4.e eVar = new il4.e();
        eVar.f292106c = 1300;
        eVar.f292107d = false;
        com.tencent.mm.storage.f9 f9Var = this.f198117v;
        if (f9Var != null) {
            il4.f fVar = eVar.f292122s;
            java.util.Map map = fVar.f292132d;
            java.lang.String Q0 = f9Var.Q0();
            int i17 = x51.t1.f452086a;
            if (Q0 == null) {
                Q0 = "";
            }
            map.put("chat", Q0);
            com.tencent.mm.storage.f9 f9Var2 = this.f198117v;
            java.lang.String v17 = com.tencent.mm.ui.chatting.viewitems.a0.v(f9Var2, com.tencent.mm.storage.z3.R4(f9Var2.Q0()), false);
            fVar.f292132d.put("sourceuser", v17 != null ? v17 : "");
        }
        if (!((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Ni(wi6, eVar)) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "openByTing");
        return false;
    }

    public final boolean v7(boolean z17) {
        boolean z18;
        r45.w60 w60Var = new r45.w60();
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_multi_task_common_info");
        if (byteArrayExtra != null) {
            try {
                w60Var.parseFrom(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppAttachNewDownloadUI", e17, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.storage.f9 f9Var = this.f198117v;
        if (f9Var != null) {
            boolean A = c01.ia.A(f9Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "shareForbidden: %s", java.lang.Boolean.valueOf(A));
            z18 = A;
        } else {
            z18 = false;
        }
        return ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).Ai(this.f198115t, this.f198117v.Q0(), z18, this.B, this.E, this.C, this.D, w60Var);
    }

    public final void w7() {
        com.tencent.mm.pluginsdk.model.app.d c76 = c7();
        if (c76 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppAttachNewDownloadUI", "open fail, info is null");
            return;
        }
        java.lang.String str = c76.field_fileFullPath;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppAttachNewDownloadUI", "open fail, field fileFullPath is null");
            return;
        }
        java.lang.String str2 = c76.field_fileFullPath;
        if (this.f198114s == 1) {
            jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
            long j17 = this.f198115t;
            java.lang.String Q0 = this.f198117v.Q0();
            java.lang.String str3 = this.E;
            java.lang.String str4 = this.C;
            ((ht.a) vVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.f.i(this, j17, Q0, str2, str3, str4, 7);
        } else {
            jt.v vVar2 = (jt.v) i95.n0.c(jt.v.class);
            long j18 = this.f198115t;
            java.lang.String Q02 = this.f198117v.Q0();
            java.lang.String str5 = this.E;
            java.lang.String str6 = this.C;
            ((ht.a) vVar2).getClass();
            com.tencent.mm.pluginsdk.ui.tools.f.i(this, j18, Q02, str2, str5, str6, 1);
        }
        android.widget.Button button = this.f198103h;
        if (button != null) {
            button.setEnabled(false);
        }
        android.widget.Button button2 = this.f198104i;
        if (button2 != null) {
            button2.setEnabled(false);
        }
        this.E1 = true;
    }

    public final void x7(boolean z17) {
        java.lang.String str;
        if (this.S) {
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("download_file", false);
        com.tencent.mm.storage.f9 f9Var = this.f198117v;
        if (f9Var == null || (str = this.E) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppAttachNewDownloadUI", "reportFilePreviewAutoOpen msgInfo or fileExt is null");
            return;
        }
        this.S = true;
        com.tencent.mm.ui.report.o oVar = new com.tencent.mm.ui.report.o(f9Var, str, "", this.F);
        oVar.f209714i = com.tencent.mm.ui.report.h.f209645g;
        if (z17 && booleanExtra) {
            oVar.f209713h = com.tencent.mm.ui.report.n.f209703g;
        } else {
            oVar.f209713h = com.tencent.mm.ui.report.n.f209702f;
        }
        com.tencent.mm.ui.report.d0.f209626a.d(com.tencent.mm.ui.report.p.f209727o, oVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "reportFilePreviewAutoOpen isOpened[%b]", java.lang.Boolean.valueOf(z17));
    }

    public final void y7(int i17, int i18) {
        long j17;
        rt0.b bVar;
        if (ez.v0.f257777a.i(java.lang.Integer.valueOf(this.f198099d))) {
            if (i18 != -1) {
                jx3.f.INSTANCE.idkeyStat(1203L, i18, 1L, false);
            }
            long I0 = this.f198117v.I0();
            ot0.q qVar = this.A;
            if (qVar != null && (bVar = (rt0.b) qVar.y(rt0.b.class)) != null) {
                long j18 = bVar.f399372b;
                if (j18 != 0) {
                    j17 = j18;
                    ct3.d.f222303a.a(this.f198117v, this.A, i17, j17);
                }
            }
            j17 = I0;
            ct3.d.f222303a.a(this.f198117v, this.A, i17, j17);
        }
    }

    public final void z7(boolean z17) {
        java.lang.String str;
        if (this.T && z17) {
            return;
        }
        com.tencent.mm.storage.f9 f9Var = this.f198117v;
        if (f9Var == null || (str = this.E) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppAttachNewDownloadUI", "reportFilePreviewAutoOpen msgInfo or fileExt is null");
            return;
        }
        if (z17) {
            this.T = true;
        }
        com.tencent.mm.ui.report.o oVar = new com.tencent.mm.ui.report.o(f9Var, str, "", this.F);
        oVar.f209718m = z17;
        com.tencent.mm.ui.report.d0.f209626a.d(com.tencent.mm.ui.report.p.f209726n, oVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "reportOpenByOtherAppBtn isViewExp[%b]", java.lang.Boolean.valueOf(z17));
    }
}
