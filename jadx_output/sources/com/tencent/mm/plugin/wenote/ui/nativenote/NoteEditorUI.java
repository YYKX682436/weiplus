package com.tencent.mm.plugin.wenote.ui.nativenote;

@db5.a(2048)
/* loaded from: classes12.dex */
public class NoteEditorUI extends com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI implements lz4.a, mz4.z, com.tencent.mm.modelbase.u0, com.tencent.mm.plugin.wenote.ui.nativenote.g2, tz4.k, jz4.a {

    /* renamed from: e2, reason: collision with root package name */
    public static final /* synthetic */ int f188140e2 = 0;
    public cz4.f F1;
    public com.tencent.mm.plugin.wenote.multitask.e G1;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f188141J;
    public com.tencent.mm.plugin.wenote.ui.nativenote.adapter.NoteLinearLayoutManager K;
    public com.tencent.mm.pluginsdk.ui.chat.ib O1;
    public r45.gp0 P;
    public gh5.a Y;
    public java.lang.String Z;

    /* renamed from: m, reason: collision with root package name */
    public mz4.j0 f188147m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f188148n;

    /* renamed from: o, reason: collision with root package name */
    public rz4.b f188149o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.FrameLayout f188150p;

    /* renamed from: q, reason: collision with root package name */
    public tz4.l f188153q;

    /* renamed from: x0, reason: collision with root package name */
    public int f188161x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f188164y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f188165y1;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.RelativeLayout f188154r = null;

    /* renamed from: s, reason: collision with root package name */
    public mz4.a0 f188155s = null;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f188156t = null;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f188157u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f188158v = false;

    /* renamed from: w, reason: collision with root package name */
    public long f188159w = -1;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f188160x = "";

    /* renamed from: y, reason: collision with root package name */
    public int f188163y = 0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f188166z = "";
    public long A = -1;
    public java.lang.String B = "";
    public java.lang.String C = "";
    public java.lang.String D = "";
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public java.lang.String I = "";
    public boolean L = false;
    public android.app.ProgressDialog M = null;
    public boolean N = false;
    public boolean Q = false;
    public final java.lang.Object R = new java.lang.Object();
    public android.view.View S = null;
    public java.lang.String T = "";
    public int U = 0;
    public int V = 0;
    public int W = 0;
    public int X = 0;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String[] f188151p0 = null;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f188146l1 = true;

    /* renamed from: p1, reason: collision with root package name */
    public long f188152p1 = 0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f188162x1 = false;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f188167z1 = false;
    public boolean A1 = false;
    public boolean B1 = false;
    public final boolean C1 = true;
    public int D1 = 0;
    public androidx.recyclerview.widget.w2 E1 = null;
    public boolean H1 = false;
    public boolean I1 = false;
    public final mz4.d J1 = new mz4.d();
    public final hz4.t K1 = new hz4.t();
    public final uz4.d L1 = new uz4.d();
    public boolean M1 = false;
    public final boolean N1 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_fav_note_restore_note_open, true);
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener P1 = new com.tencent.mm.plugin.wenote.ui.nativenote.f(this);
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener Q1 = new com.tencent.mm.plugin.wenote.ui.nativenote.g(this);
    public boolean R1 = false;
    public float S1 = 0.0f;
    public float T1 = 0.0f;
    public final android.view.View.OnTouchListener U1 = new com.tencent.mm.plugin.wenote.ui.nativenote.o(this);
    public com.tencent.mm.ui.widget.dialog.u3 V1 = null;
    public boolean W1 = false;
    public int X1 = -1;
    public boolean Y1 = false;
    public final com.tencent.mm.ui.widget.snackbar.g Z1 = new com.tencent.mm.plugin.wenote.ui.nativenote.o0(this);

    /* renamed from: a2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f188142a2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FavNoteSaveEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.56
        {
            this.__eventId = 998161952;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.FavNoteSaveEvent favNoteSaveEvent) {
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.this;
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "FavNoteSaveEvent, isFinish:%s", java.lang.Boolean.valueOf(noteEditorUI.f188143b2));
            noteEditorUI.m7(1);
            return true;
        }
    };

    /* renamed from: b2, reason: collision with root package name */
    public boolean f188143b2 = false;

    /* renamed from: c2, reason: collision with root package name */
    public wu5.c f188144c2 = null;

    /* renamed from: d2, reason: collision with root package name */
    public final boolean f188145d2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_fav_note_pre_minute_upload_open, false);

    public static void Z6(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, db5.g4 g4Var) {
        noteEditorUI.getClass();
        if (noteEditorUI.p7(mz4.b0.c().a())) {
            g4Var.f(6, noteEditorUI.getString(com.tencent.mm.R.string.l_f));
        } else {
            g4Var.f(5, noteEditorUI.getString(com.tencent.mm.R.string.l_k));
        }
    }

    public static void a7(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, android.content.Intent intent) {
        r45.bq0 bq0Var;
        noteEditorUI.getClass();
        if (((hz4.f) hz4.f.wi()).f286407d.f286421o == null || (bq0Var = ((hz4.f) hz4.f.wi()).f286407d.f286421o) == null) {
            return;
        }
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_content", ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).Zi(bq0Var.f370972q, bq0Var.f370974s, bq0Var));
        intent.putExtra("content_type_forward_to_wework", 13);
    }

    public static void b7(final com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, final iz4.r rVar) {
        noteEditorUI.getClass();
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(noteEditorUI.A);
        o72.g4 zj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj();
        if (F == null || !((s72.p0) zj6).T6(F)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "handlePinOnTop failed with localId=%d", java.lang.Long.valueOf(noteEditorUI.A));
            return;
        }
        int i17 = F.field_id;
        ((s72.p0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj()).f404129o = true;
        ((s72.p0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj()).Y6(i17, true, new o72.o5() { // from class: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$$c
            @Override // o72.o5
            public final void invoke() {
                int i18 = com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.f188140e2;
                final com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI2 = com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.this;
                noteEditorUI2.getClass();
                mz4.b0.c().d(rVar);
                com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$$e
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i19 = com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.f188140e2;
                        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI3 = com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.this;
                        com.tencent.mm.ui.widget.snackbar.j.c(noteEditorUI3.getString(com.tencent.mm.R.string.l_m), null, noteEditorUI3, null, null);
                    }
                });
            }
        });
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "handlePinOnTop send request with favId=%d", java.lang.Integer.valueOf(i17));
    }

    public static void c7(com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI, java.lang.String str) {
        noteEditorUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_type", 15);
        intent.putExtra("need_result", true);
        java.lang.String r17 = noteEditorUI.J1.r(noteEditorUI.getString(com.tencent.mm.R.string.l_l));
        intent.putExtra("fav_note_xml", str);
        intent.putExtra("Ksnsupload_title", r17);
        intent.putExtra("Ksnsupload_link", com.tencent.mm.ui.v2.f211101a);
        intent.putExtra("fav_note_link_description", "note description");
        intent.putExtra("Ksnsupload_imgbuf", com.tencent.mm.vfs.w6.N(noteEditorUI.Z, 0, -1));
        j45.l.n(noteEditorUI, "sns", ".ui.SnsUploadUI", intent, 4359);
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "startSnsActivity() called notelinktitle:%s", r17);
    }

    public static void i7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "dealExpose()");
        if (j62.e.g().l("clicfg_note_expose_config_switch_android", false, false, true)) {
            android.os.Bundle bundle = new android.os.Bundle();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
            bundle.putString("query", "{\"scene\":57}");
            bundle.putBundle(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, bundle2);
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(com.tencent.mm.sdk.platformtools.x2.f193071a, bundle, true, false, new com.tencent.mm.plugin.wenote.ui.nativenote.h1());
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", java.lang.String.format(com.tencent.mm.ui.n2.f209398a, 57));
            j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        hz4.h hVar = ((hz4.f) hz4.f.wi()).f286407d;
        if (hVar == null) {
            return;
        }
        java.lang.String h17 = hVar.h();
        hz4.i iVar = hVar.f286418i;
        java.lang.String a17 = iVar.a(h17);
        boolean g17 = hVar.g();
        com.tencent.mm.autogen.mmdata.rpt.WeNoteMenuOperationStruct weNoteMenuOperationStruct = new com.tencent.mm.autogen.mmdata.rpt.WeNoteMenuOperationStruct();
        weNoteMenuOperationStruct.f62914d = weNoteMenuOperationStruct.b("sessionID", iVar.f286425a, true);
        weNoteMenuOperationStruct.f62915e = weNoteMenuOperationStruct.b("noteid", a17, true);
        weNoteMenuOperationStruct.f62916f = g17 ? 1 : 0;
        weNoteMenuOperationStruct.f62917g = 7;
        weNoteMenuOperationStruct.k();
        pz4.a.f359185a.b(weNoteMenuOperationStruct);
    }

    public void A7(java.lang.String str, boolean z17, boolean z18, int i17, java.lang.String str2, long j17, r45.bq0 bq0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "setEditorExportLogic, localId:%s, htmlLength: %s, isInsert:%s, htmlstr:%s", java.lang.Long.valueOf(this.A), java.lang.Integer.valueOf(str.length()), java.lang.Boolean.valueOf(z17), str);
        if (!z17 && str.equals(this.I)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "not insert and same with last html");
            if (this.f188167z1 || i17 <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(str2) || j17 <= 0) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "try repair");
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var = favoriteOperationEvent.f54243g;
            z9Var.f8528a = 19;
            z9Var.f8540m = -3;
            z9Var.f8532e = this.A;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("fav_note_item_status", i17);
            intent.putExtra("fav_note_xml", str2);
            intent.putExtra("fav_note_item_updatetime", j17);
            z9Var.f8534g = intent;
            favoriteOperationEvent.e();
            return;
        }
        if (bq0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "protoitem is null,return");
            return;
        }
        if (z17) {
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent2 = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var2 = favoriteOperationEvent2.f54243g;
            z9Var2.f8528a = 19;
            z9Var2.f8531d = bq0Var;
            z9Var2.f8529b = str;
            z9Var2.f8532e = this.A;
            z9Var2.f8530c = "fav_add_new_note";
            favoriteOperationEvent2.e();
        } else {
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent3 = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var3 = favoriteOperationEvent3.f54243g;
            z9Var3.f8528a = 19;
            z9Var3.f8531d = bq0Var;
            z9Var3.f8529b = str;
            z9Var3.f8532e = this.A;
            z9Var3.f8530c = "";
            if (this.H) {
                z9Var3.f8540m = -2;
            }
            favoriteOperationEvent3.e();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "write html to file suc localId:%s", java.lang.Long.valueOf(this.A));
        int i18 = 20;
        if (!z17) {
            while (true) {
                o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.A);
                if (o72.x1.l0(F)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "hasUploadToServer: update, %s", java.lang.Integer.valueOf(F.field_itemStatus));
                    break;
                }
                java.lang.Thread.sleep(1000L);
                if (z18) {
                    int i19 = i18 - 1;
                    if (i18 > 0) {
                        i18 = i19;
                    }
                }
            }
            this.I = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "setEditorExportLogic end");
        }
        while (true) {
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent4 = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var4 = favoriteOperationEvent4.f54243g;
            z9Var4.f8528a = 30;
            z9Var4.f8540m = 6;
            z9Var4.f8532e = this.A;
            favoriteOperationEvent4.e();
            if (favoriteOperationEvent4.f54244h.f6134a == 1) {
                this.E = false;
                this.G = false;
                this.F = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "hasUploadToServer: insert");
                break;
            }
            java.lang.Thread.sleep(1000L);
            if (z18) {
                int i27 = i18 - 1;
                if (i18 > 0) {
                    i18 = i27;
                }
            }
        }
        this.I = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "setEditorExportLogic end");
        this.I = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "setEditorExportLogic end");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a0 A[Catch: all -> 0x022c, TryCatch #2 {, blocks: (B:9:0x0043, B:11:0x0056, B:12:0x005b, B:16:0x005e, B:18:0x006f, B:20:0x0073, B:22:0x007f, B:23:0x0084, B:26:0x0087, B:30:0x009c, B:32:0x00a2, B:34:0x00ae, B:36:0x00b4, B:40:0x00b8, B:39:0x00e8, B:44:0x00eb, B:45:0x00f0, B:47:0x00f6, B:49:0x0109, B:52:0x0115, B:65:0x0121, B:113:0x0124, B:114:0x01b4, B:67:0x0128, B:70:0x0130, B:73:0x0138, B:76:0x0140, B:79:0x0148, B:81:0x0152, B:82:0x0156, B:84:0x0166, B:85:0x01ad, B:87:0x016c, B:89:0x0175, B:93:0x017d, B:95:0x0183, B:97:0x018c, B:107:0x01a0, B:110:0x01c3, B:117:0x01bb, B:60:0x01cc, B:121:0x01d5, B:122:0x01d7, B:126:0x01db, B:128:0x01df, B:129:0x01ec, B:152:0x022b, B:124:0x01d8, B:125:0x01da), top: B:8:0x0043, outer: #3, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void B7(java.lang.Object r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.B7(java.lang.Object, boolean):void");
    }

    public void C7(boolean z17) {
        final int i17;
        tz4.l lVar = this.f188153q;
        if (lVar != null && lVar.f423359e) {
            lVar.f423359e = false;
            lVar.b(tz4.u.Recording, false);
            hz4.b0 a17 = hz4.b0.a();
            if (a17.f286382a && !a17.f286385d) {
                a17.b();
            }
            hz4.b0 a18 = hz4.b0.a();
            java.lang.String str = com.tencent.mm.vfs.w6.j(a18.f286392k) ? a18.f286392k : "";
            int i18 = (int) hz4.b0.a().f286384c;
            int a19 = (int) c31.a.a(i18);
            mz4.d dVar = this.J1;
            synchronized (dVar) {
                if (dVar.f333229a != null) {
                    i17 = 0;
                    while (i17 < dVar.f333229a.size()) {
                        if (((iz4.c) dVar.f333229a.get(i17)).d() == 4 && ((iz4.l) dVar.f333229a.get(i17)).f296121y.booleanValue()) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                i17 = -1;
            }
            iz4.c l17 = this.J1.l(i17);
            if (!com.tencent.mm.vfs.w6.j(str)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "voicePath not exist, remove data from datalist and ui");
                this.J1.z(i17, false, null);
                if (z17) {
                    x1(i17);
                }
                iz4.i iVar = new iz4.i();
                iVar.f296155t = "";
                iVar.f296104b = true;
                iVar.f296110h = false;
                this.J1.a(i17, iVar, true);
                this.J1.e(i17 - 1, i17 + 1, true);
                return;
            }
            if (i17 == -1 || l17 == null || l17.d() != 4) {
                return;
            }
            iz4.l lVar2 = (iz4.l) l17;
            lVar2.f296121y = java.lang.Boolean.FALSE;
            lVar2.f296133q = 4;
            lVar2.f296134r = true;
            lVar2.f296161v = ((java.lang.String) c31.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, a19)).toString();
            lVar2.f296135s = str;
            lVar2.f296163x = i18;
            final mz4.d dVar2 = this.J1;
            dVar2.getClass();
            com.tencent.mm.plugin.appbrand.utils.d5.b(new java.lang.Runnable() { // from class: mz4.d$$f
                @Override // java.lang.Runnable
                public final void run() {
                    lz4.a aVar = mz4.d.this.f333230b;
                    if (aVar != null) {
                        ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) aVar).j3(i17, 0L);
                    }
                }
            });
        }
    }

    public final void D7() {
        cz4.f fVar = this.F1;
        if (fVar != null) {
            fVar.Z(this.J1.r(getString(com.tencent.mm.R.string.l_l)));
        }
    }

    public final void E7() {
        this.f188141J.postDelayed(new com.tencent.mm.plugin.wenote.ui.nativenote.r0(this), 200L);
    }

    @Override // jz4.a
    public void F0() {
        C7(false);
    }

    public boolean F7() {
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.O1;
        return (ibVar == null || ibVar.getVisibility() == 8) ? false : true;
    }

    @Override // jz4.a
    public void G5() {
        db5.e1.H(getContext(), getContext().getString(com.tencent.mm.R.string.h_y), "", true, new com.tencent.mm.plugin.wenote.ui.nativenote.a2(this), new com.tencent.mm.plugin.wenote.ui.nativenote.b2(this));
    }

    public final boolean G7(boolean z17) {
        if (!(!o72.x1.l0(((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.A)))) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "syncWNNoteFavItem wait upload %s", java.lang.Long.valueOf(this.A));
        if (z17) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.wenote.ui.nativenote.j(this));
        }
        int i17 = 20;
        while (true) {
            o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.A);
            if (o72.x1.l0(F)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "hasUploadToServer: update, %s", java.lang.Integer.valueOf(F.field_itemStatus));
                break;
            }
            try {
                java.lang.Thread.sleep(1000L);
                int i18 = i17 - 1;
                if (i17 <= 0) {
                    break;
                }
                i17 = i18;
            } catch (java.lang.InterruptedException unused) {
            }
        }
        if (z17) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.wenote.ui.nativenote.k(this));
        }
        return o72.x1.l0(((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.A));
    }

    public void b5() {
        int i17;
        if (this.f188164y0 == 2 && this.f188147m.f333310r) {
            mz4.d dVar = this.J1;
            synchronized (dVar) {
                if (dVar.f333229a != null) {
                    i17 = 0;
                    while (i17 < dVar.f333229a.size()) {
                        if (((iz4.c) dVar.f333229a.get(i17)).f296104b) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                i17 = -1;
            }
            iz4.c l17 = this.J1.l(i17);
            if (l17 != null) {
                l17.f296104b = false;
                l17.f296110h = false;
                j3(i17, 0L);
            }
            this.f188141J.post(new com.tencent.mm.plugin.wenote.ui.nativenote.q0(this));
            z7(false, 0L);
            y7(0, 0L);
        }
    }

    public final void d7(java.util.ArrayList arrayList) {
        if (this.J1.f(0, arrayList.size())) {
            v7();
        } else {
            this.M = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.wenote.ui.nativenote.i0(this));
            gm0.j1.e().j(new com.tencent.mm.plugin.wenote.ui.nativenote.j0(this, arrayList));
        }
    }

    public final void e7(java.lang.String str) {
        java.lang.String str2 = str;
        mz4.d dVar = this.J1;
        if (dVar.f(0, 1)) {
            v7();
            return;
        }
        ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str2, true);
        if (d17 == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            if (str2 == null) {
                str2 = "";
            }
            objArr[0] = str2;
            com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "mediaInfo is null, videoPath is %s", objArr);
            return;
        }
        int a17 = d17.a();
        iz4.k kVar = new iz4.k();
        kVar.f296134r = true;
        kVar.f296117t = "";
        kVar.f296135s = "";
        kVar.f296118u = a17;
        kVar.f296133q = 6;
        kVar.f296131o = dVar.j();
        kVar.f296119v = com.tencent.mm.vfs.w6.n(str);
        kVar.f296103a = hz4.l.b(kVar.toString(), 18);
        r45.gp0 gp0Var = new r45.gp0();
        this.P = gp0Var;
        gp0Var.e0(kVar.f296103a);
        this.P.i0(kVar.f296119v);
        java.lang.String e17 = hz4.l.e(this.P);
        java.lang.String c17 = hz4.l.c(this.P);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "video is null");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str2);
        mz4.s sVar = new mz4.s(arrayList, e17, c17, kVar, new com.tencent.mm.plugin.wenote.ui.nativenote.l0(this));
        this.M = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.wenote.ui.nativenote.m0(this, sVar, kVar));
        s75.d.b(sVar, "NoteEditor_importVideo");
    }

    public final boolean f7(java.lang.String str) {
        java.lang.String a17 = qz4.b.a(java.util.regex.Pattern.compile("<object[^>]*>", 2).matcher(str).replaceAll("#WNNoteNode#<ThisisNoteNodeObj>#WNNoteNode#"));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17) && a17.length() != 0) {
            a17 = java.util.regex.Pattern.compile("\\s*|\t|\r|\n").matcher(a17).replaceAll("");
        }
        return com.tencent.mm.sdk.platformtools.t8.K0(a17);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "finish, %s, isFinish:%s", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f188143b2));
        this.f188143b2 = true;
        cz4.f fVar = this.F1;
        if (fVar != null) {
            fVar.p();
        }
        super.finish();
    }

    public final void g7() {
        int D = this.J1.D();
        int childCount = this.f188148n.getChildCount();
        if (D == childCount) {
            float f17 = 0.0f;
            for (int i17 = childCount - 1; i17 >= 0; i17--) {
                android.view.View childAt = this.f188148n.getChildAt(i17);
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                float translationY = childAt.getTranslationY();
                if (f17 <= childAt.getBottom() + translationY) {
                    f17 = childAt.getBottom() + translationY;
                }
            }
            if (f17 >= com.tencent.mm.sdk.platformtools.d2.f(getApplicationContext())[1] || f17 <= 0.0f) {
                return;
            }
            this.I1 = true;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c88;
    }

    public final void h7(float f17) {
        if (F7()) {
            this.O1.animate().cancel();
            this.O1.animate().translationY(f17).withEndAction(new com.tencent.mm.plugin.wenote.ui.nativenote.k1(this)).start();
        }
    }

    public void j3(int i17, long j17) {
        android.os.Handler handler = getWindow().getDecorView().getHandler();
        if (handler == null) {
            return;
        }
        handler.postDelayed(new com.tencent.mm.plugin.wenote.ui.nativenote.q(this, i17), j17);
    }

    public final void j7() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.V1;
        if (u3Var != null) {
            u3Var.dismiss();
            this.V1 = null;
        }
    }

    public void k7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "finishWNNoteFavitem() called isDeleteAndFinish:%s isNeedSave:%s isEditStatus:%s isUpdateStatus:%s", java.lang.Boolean.valueOf(this.H1), java.lang.Boolean.valueOf(this.G), java.lang.Boolean.valueOf(this.E), java.lang.Boolean.valueOf(this.F));
        if (this.H1) {
            return;
        }
        C7(true);
        mz4.d dVar = this.J1;
        java.lang.String p17 = dVar.p(true);
        if (!f7(p17)) {
            if (this.G || this.E) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "leave noteeditorui, do savewnnotefavitem %s", java.lang.Long.valueOf(this.A));
                mz4.j0 j0Var = this.f188147m;
                s75.d.b(new com.tencent.mm.plugin.wenote.ui.nativenote.l(this, p17, j0Var.f333306n, j0Var.f333307o, j0Var.f333308p, dVar.n(p17)), "AddFavNoteSync");
                return;
            } else {
                if (this.F) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "leave noteeditorui, do updateWNNoteFavitem %s", java.lang.Long.valueOf(this.A));
                    mz4.j0 j0Var2 = this.f188147m;
                    s75.d.b(new com.tencent.mm.plugin.wenote.ui.nativenote.m(this, p17, j0Var2.f333306n, j0Var2.f333307o, j0Var2.f333308p, dVar.n(p17)), "AddFavNoteSync");
                    return;
                }
                return;
            }
        }
        if (!this.N1) {
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var = favoriteOperationEvent.f54243g;
            z9Var.f8528a = 12;
            z9Var.f8547t = 22;
            z9Var.f8532e = this.A;
            favoriteOperationEvent.e();
            return;
        }
        if (!this.M1) {
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent2 = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var2 = favoriteOperationEvent2.f54243g;
            z9Var2.f8528a = 12;
            z9Var2.f8547t = 22;
            z9Var2.f8532e = this.A;
            favoriteOperationEvent2.e();
            return;
        }
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.A);
        int i17 = F != null ? F.field_id : -1;
        com.tencent.mm.autogen.mmdata.rpt.FavSpecificActionStruct favSpecificActionStruct = new com.tencent.mm.autogen.mmdata.rpt.FavSpecificActionStruct();
        favSpecificActionStruct.f56307d = 1L;
        favSpecificActionStruct.f56310g = i17;
        favSpecificActionStruct.f56308e = 33L;
        favSpecificActionStruct.f56309f = 3L;
        favSpecificActionStruct.k();
    }

    public final boolean l7(java.lang.Class cls) {
        mz4.j0 j0Var = this.f188147m;
        if (j0Var != null) {
            return j0Var.c(j0Var.b(), cls);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m7(int i17) {
        mz4.d dVar = this.J1;
        uz4.d dVar2 = this.L1;
        boolean z17 = this.C1;
        pz4.a aVar = pz4.a.f359185a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "goback %s, localid:%s, hasDoGoBack:%s isUpdateStatus:%s, isEditStatus:%s", java.lang.Integer.valueOf(hashCode()), java.lang.Long.valueOf(this.A), java.lang.Boolean.valueOf(this.R1), java.lang.Boolean.valueOf(this.F), java.lang.Boolean.valueOf(this.E));
        if (i17 == 1 && this.R1) {
            return;
        }
        if (i17 == 1) {
            this.R1 = true;
        }
        try {
            if (this.f188164y0 == 2 && this.f188147m.f333310r) {
                if (!this.F && !this.E) {
                    com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
                    am.z9 z9Var = favoriteOperationEvent.f54243g;
                    z9Var.f8528a = 19;
                    z9Var.f8532e = this.A;
                    z9Var.f8540m = -1;
                    favoriteOperationEvent.e();
                    if (!favoriteOperationEvent.f54244h.f6142i) {
                        D7();
                        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "directly return for nothing changed");
                        return;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "htmlData is null, try to save favitem");
                        this.F = true;
                        this.H = true;
                    }
                }
                k7();
                D7();
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "goback %s finally", java.lang.Integer.valueOf(hashCode()));
                aVar.a();
                if (z17) {
                    nz4.y.h().t();
                }
                mz4.j0 j0Var = this.f188147m;
                if (j0Var != null) {
                    j0Var.f();
                }
                dVar2.d();
                hz4.b0 b0Var = hz4.b0.f286381q;
                if (b0Var != null) {
                    b0Var.getClass();
                    hz4.b0.f286381q = null;
                }
                dVar.v();
                if (((hz4.f) hz4.f.wi()).f286407d != null) {
                    ((hz4.f) hz4.f.wi()).f286407d.o();
                }
                bz4.n0.f36834d = null;
                return;
            }
            D7();
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "goback %s finally", java.lang.Integer.valueOf(hashCode()));
            aVar.a();
            if (z17) {
                nz4.y.h().t();
            }
            mz4.j0 j0Var2 = this.f188147m;
            if (j0Var2 != null) {
                j0Var2.f();
            }
            dVar2.d();
            hz4.b0 b0Var2 = hz4.b0.f286381q;
            if (b0Var2 != null) {
                b0Var2.getClass();
                hz4.b0.f286381q = null;
            }
            dVar.v();
            if (((hz4.f) hz4.f.wi()).f286407d != null) {
                ((hz4.f) hz4.f.wi()).f286407d.o();
            }
            bz4.n0.f36834d = null;
        } finally {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "goback %s finally", java.lang.Integer.valueOf(hashCode()));
            aVar.a();
            if (z17) {
                nz4.y.h().t();
            }
            mz4.j0 j0Var3 = this.f188147m;
            if (j0Var3 != null) {
                j0Var3.f();
            }
            dVar2.d();
            hz4.b0 b0Var3 = hz4.b0.f286381q;
            if (b0Var3 != null) {
                b0Var3.getClass();
                hz4.b0.f286381q = null;
            }
            dVar.v();
            if (((hz4.f) hz4.f.wi()).f286407d != null) {
                ((hz4.f) hz4.f.wi()).f286407d.o();
            }
            bz4.n0.f36834d = null;
        }
    }

    public void n7() {
        if (this.E || this.F) {
            return;
        }
        this.I = this.J1.p(false);
        this.F = true;
    }

    public final void o7(java.util.ArrayList arrayList) {
        mz4.d dVar = this.J1;
        if (dVar.g(arrayList)) {
            v7();
            return;
        }
        com.tencent.mm.plugin.appbrand.utils.d5.b(new mz4.d$$k(dVar, false));
        this.J1.u(arrayList, null, false, true, false, false, false);
        b5();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x008f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0092. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r25, int r26, android.content.Intent r27) {
        /*
            Method dump skipped, instructions count: 1504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        boolean z17;
        tz4.l lVar = this.f188153q;
        if (lVar == null || !lVar.f423359e) {
            z17 = true;
        } else {
            w7();
            z17 = false;
        }
        if (z17) {
            g7();
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onBackPressed: bReadEnd=%b", java.lang.Boolean.valueOf(this.I1));
            com.tencent.mm.plugin.wenote.multitask.e eVar = this.G1;
            if (eVar != null) {
                if (eVar.c0(2, this.J1.r(getString(com.tencent.mm.R.string.l_l)), this.I1)) {
                    return;
                }
            }
            cz4.f fVar = this.F1;
            if (fVar == null || !fVar.m0(2)) {
                m7(1);
                super.onBackPressed();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onCancel() {
        super.onCancel();
        if (this.C1) {
            nz4.y.h().A(false);
            nz4.y.h().C(false);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onConfigurationChanged: orientation=%d", java.lang.Integer.valueOf(configuration.orientation));
        tz4.l lVar = this.f188153q;
        if (lVar != null) {
            lVar.a(true);
        }
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        k82.c cVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onCreate %s", java.lang.Integer.valueOf(hashCode()));
        customfixStatusbar(true);
        setMMOrientation();
        bz4.n0.f36834d = this.J1;
        this.f188161x0 = getIntent().getIntExtra("note_fav_scene", -1);
        this.f188164y0 = getIntent().getIntExtra("note_open_from_scene", 2);
        this.f188159w = getIntent().getLongExtra("note_msgid", -1L);
        this.f188160x = getIntent().getStringExtra("note_msgtalker");
        this.f188163y = getIntent().getIntExtra("SecurityPreviewType", 0);
        this.f188166z = getIntent().getStringExtra("SecurityMsgUsername");
        this.A1 = getIntent().getBooleanExtra("record_show_share", false);
        this.A = getIntent().getLongExtra("note_fav_localid", -1L);
        this.B = getIntent().getStringExtra("note_link_sns_localid");
        this.C = getIntent().getStringExtra("note_link_sns_serverid");
        this.D = getIntent().getStringExtra("note_link_sns_username");
        this.E = getIntent().getBooleanExtra("edit_status", false);
        boolean booleanExtra = getIntent().getBooleanExtra("need_save", false);
        this.G = booleanExtra;
        this.F = booleanExtra;
        this.T = getIntent().getStringExtra("fav_note_xml");
        this.W = getIntent().getIntExtra("fav_note_scroll_to_position", 0);
        this.X = getIntent().getIntExtra("fav_note_scroll_to_offset", 0);
        this.Z = getIntent().getStringExtra("fav_note_thumbpath");
        this.f188146l1 = getIntent().getBooleanExtra("show_share", true);
        this.f188165y1 = getIntent().getStringExtra("fav_note_link_sns_xml");
        java.lang.String stringExtra = getIntent().getStringExtra("fav_note_link_source_info");
        this.B1 = getIntent().getBooleanExtra("fav_note_out_of_date", false);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.f188151p0 = stringExtra.split(";");
        }
        if (getIntent().getIntExtra("note_fav_post_scene", 0) == 6) {
            this.f188162x1 = true;
        }
        hz4.h.f286412t = false;
        k82.c cVar2 = k82.c.f304887a;
        long j17 = this.A;
        long j18 = this.f188159w;
        java.lang.String str = this.B;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = this.C;
        cVar2.a(j17, j18, str2, str3 == null ? "" : str3, this.f188162x1 || this.E);
        if (this.f188151p0 == null && this.A > 0) {
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var = favoriteOperationEvent.f54243g;
            z9Var.f8528a = 30;
            z9Var.f8540m = 3;
            z9Var.f8532e = this.A;
            favoriteOperationEvent.e();
            this.f188151p0 = com.tencent.mm.sdk.platformtools.t8.K0(favoriteOperationEvent.f54244h.f6136c) ? null : favoriteOperationEvent.f54244h.f6136c.split(";");
        }
        java.lang.String[] strArr = this.f188151p0;
        if (strArr != null && strArr.length < 3) {
            cVar2.e(this.A, 3);
            return;
        }
        this.f188141J = new com.tencent.mm.sdk.platformtools.n3();
        mz4.d dVar = this.J1;
        int i17 = this.f188164y0;
        long j19 = i17;
        long j27 = i17 == 1 ? this.f188159w : this.A;
        dVar.getClass();
        dVar.f333229a = java.util.Collections.synchronizedList(new mz4.k());
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteDataManager", "onInit call, mDataList reset, size = 0");
        dVar.f333230b = this;
        dVar.f333231c = new r45.gp0();
        dVar.f333232d = 0;
        dVar.f333233e = 0;
        dVar.f333234f = 0;
        dVar.f333235g = j19;
        dVar.f333236h = j27;
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "OnCreate MainActivity, before setContentView msgId:%s localId:%s mSnsLocalId:%s", java.lang.Long.valueOf(this.f188159w), java.lang.Long.valueOf(this.A), this.B);
        o25.n1.f(this);
        super.onCreate(bundle);
        this.f188156t = getContentView();
        if (((hz4.f) hz4.f.wi()).f286407d != null && ((hz4.f) hz4.f.wi()).f286407d.f286422p != null) {
            this.F1 = new cz4.f(new cz4.e(this));
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.B)) {
                this.F1.b(3, "" + this.A + "_" + this.f188159w);
            } else {
                this.F1.b(3, "fav_" + this.B);
            }
            cz4.f fVar = this.F1;
            fVar.t().f93087g = "" + this.A;
            fVar.g();
            this.F1.c0("eventData", ((hz4.f) hz4.f.wi()).f286407d.f286422p);
            this.F1.Y("eventType", ((hz4.f) hz4.f.wi()).f286407d.f286423q);
            this.G1 = new com.tencent.mm.plugin.wenote.multitask.e(this, new com.tencent.mm.plugin.wenote.multitask.f(this));
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.B)) {
                this.G1.y(3, "" + this.A + "_" + this.f188159w);
            } else {
                this.G1.y(3, "fav_" + this.B);
            }
        }
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.A);
        if (F != null) {
            Y6(F);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "OnCreate MainActivity, after setContentView");
        iz4.i iVar = new iz4.i();
        iVar.f296155t = "";
        iVar.f296104b = true;
        iVar.f296110h = false;
        if (this.E) {
            this.J1.b(iVar, false);
            this.f188162x1 = true;
        }
        this.f188148n = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.pll);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f188156t.findViewById(com.tencent.mm.R.id.f484151d61);
        this.f188150p = frameLayout;
        frameLayout.setVisibility(8);
        this.S = this.f188150p.findViewById(com.tencent.mm.R.id.qmk);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.pla);
        this.f188154r = relativeLayout;
        relativeLayout.setOnClickListener(new com.tencent.mm.plugin.wenote.ui.nativenote.p(this));
        mz4.a0 a0Var = new mz4.a0(this, this.f188154r);
        this.f188155s = a0Var;
        a0Var.f333222c = this;
        com.tencent.mm.plugin.wenote.ui.nativenote.adapter.NoteLinearLayoutManager noteLinearLayoutManager = new com.tencent.mm.plugin.wenote.ui.nativenote.adapter.NoteLinearLayoutManager(this);
        this.K = noteLinearLayoutManager;
        noteLinearLayoutManager.f188181x = com.tencent.mm.sdk.platformtools.d2.f(this)[1];
        this.f188148n.setLayoutManager(this.K);
        this.f188148n.setHasFixedSize(true);
        this.f188148n.i(new com.tencent.mm.plugin.wenote.ui.nativenote.f2(this));
        mz4.j0 j0Var = new mz4.j0(this);
        this.f188147m = j0Var;
        long j28 = this.A;
        j0Var.f333303k = j28;
        j0Var.f333309q = this.f188164y0;
        j0Var.f333293a = this.A1;
        j0Var.f333294b = this.f188159w;
        j0Var.f333295c = this.f188160x;
        j0Var.f333296d = this.f188166z;
        j0Var.f333297e = this.C;
        j0Var.f333298f = this.D;
        j0Var.f333310r = this.f188162x1;
        if (this.G && j0Var.f333301i < 0 && j28 > 0) {
            j0Var.f333313u.c(60000L, 60000L);
            j0Var.f333301i = android.os.SystemClock.elapsedRealtime();
            j0Var.f333302j = "";
        }
        mz4.j0 j0Var2 = this.f188147m;
        if (j0Var2 != null) {
            j0Var2.f333311s = new com.tencent.mm.plugin.wenote.ui.nativenote.a0(this);
        }
        rz4.b bVar = new rz4.b(j0Var2, this.J1, this.L1);
        this.f188149o = bVar;
        this.f188148n.setAdapter(bVar);
        if (this.f188164y0 == 2) {
            this.f188148n.setOnTouchListener(this.U1);
        }
        this.f188148n.getItemAnimator().f12168c = 0L;
        this.f188148n.getItemAnimator().f12171f = 0L;
        this.f188148n.getItemAnimator().f12170e = 0L;
        this.f188148n.getItemAnimator().f12169d = 120L;
        ((androidx.recyclerview.widget.o3) this.f188148n.getItemAnimator()).f12182g = false;
        int i18 = this.f188164y0;
        if (i18 == 1 || i18 == 4 || i18 == 5) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ked);
            this.f188157u = textView;
            textView.setOnClickListener(new com.tencent.mm.plugin.wenote.ui.nativenote.n0(this));
        }
        this.D1 = i65.a.b(this, 48);
        if (this.C1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "use multiselect");
            boolean z17 = this.f188164y0 == 2 && this.f188162x1;
            int color = getResources().getColor(com.tencent.mm.R.color.a0f);
            nz4.y h17 = nz4.y.h();
            h17.getClass();
            com.tencent.mars.xlog.Log.i("NoteSelectManager", "onInit start");
            h17.f341643a = z17;
            h17.f341646d = 14;
            h17.f341647e = 32;
            h17.f341648f = i65.a.b(this, 21) - h17.f341647e;
            h17.f341649g = i65.a.b(this, 40) + (h17.f341647e * 2);
            h17.f341650h = i65.a.b(this, 240) + (h17.f341647e * 2);
            h17.f341644b = i65.a.b(this, 22);
            h17.f341645c = i65.a.b(this, 1);
            h17.f341652j = getResources().getDisplayMetrics().heightPixels;
            h17.f341653k = getResources().getDisplayMetrics().widthPixels;
            h17.f341656n = new int[]{-1, -1};
            h17.f341657o = new int[]{-1, -1};
            h17.f341658p = new int[]{-1, -1};
            h17.f341659q = new int[]{-1, -1};
            cVar = cVar2;
            nz4.b bVar2 = new nz4.b(this, 2, h17.f341644b, h17.f341645c, color, h17);
            android.widget.PopupWindow popupWindow = new android.widget.PopupWindow((android.view.View) bVar2, bVar2.getViewWidth(), bVar2.getViewHeight(), false);
            h17.f341660r = popupWindow;
            popupWindow.setClippingEnabled(false);
            h17.f341660r.setAnimationStyle(com.tencent.mm.R.style.f494805wr);
            h17.f341654l = bVar2.getOffsetForCursorMid();
            h17.f341655m = i65.a.b(this, 6);
            nz4.b bVar3 = new nz4.b(this, 3, h17.f341644b, h17.f341645c, color, h17);
            android.widget.PopupWindow popupWindow2 = new android.widget.PopupWindow((android.view.View) bVar3, bVar3.getViewWidth(), bVar2.getViewHeight(), false);
            h17.f341661s = popupWindow2;
            popupWindow2.setClippingEnabled(false);
            h17.f341661s.setAnimationStyle(com.tencent.mm.R.style.f494804wq);
            nz4.b bVar4 = new nz4.b(this, 4, h17.f341644b, h17.f341645c, color, h17);
            android.widget.PopupWindow popupWindow3 = new android.widget.PopupWindow((android.view.View) bVar4, bVar4.getViewWidth(), bVar2.getViewHeight(), false);
            h17.f341662t = popupWindow3;
            popupWindow3.setClippingEnabled(false);
            h17.f341662t.setAnimationStyle(com.tencent.mm.R.style.f494806ws);
            android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.c8d, (android.view.ViewGroup) null);
            inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            android.widget.PopupWindow popupWindow4 = new android.widget.PopupWindow(inflate, -2, -2, false);
            h17.f341663u = popupWindow4;
            popupWindow4.setClippingEnabled(false);
            h17.f341663u.setAnimationStyle(com.tencent.mm.R.style.f494808wu);
            h17.B = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ke7);
            h17.C = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486164kf2);
            h17.D = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kex);
            h17.E = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kew);
            h17.F = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.keg);
            h17.G = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kef);
            h17.H = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kee);
            h17.I = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kes);
            h17.f341642J = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kez);
            h17.K = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ke6);
            h17.z(h17.B, h17.f341646d);
            h17.z(h17.C, h17.f341646d);
            h17.z(h17.D, h17.f341646d);
            h17.z(h17.E, h17.f341646d);
            h17.z(h17.F, h17.f341646d);
            h17.z(h17.G, h17.f341646d);
            h17.z(h17.H, h17.f341646d);
            h17.z(h17.I, h17.f341646d);
            h17.z(h17.f341642J, h17.f341646d);
            h17.z(h17.K, h17.f341646d);
            h17.B.setOnClickListener(new nz4.u(h17));
            h17.C.setOnClickListener(new nz4.v(h17));
            h17.D.setOnClickListener(new nz4.w(h17));
            h17.E.setOnClickListener(new nz4.x(h17));
            h17.F.setOnClickListener(new nz4.i(h17));
            h17.G.setOnClickListener(new nz4.j(h17));
            h17.H.setOnClickListener(new nz4.k(h17));
            h17.I.setOnClickListener(new nz4.l(h17));
            h17.K.setOnClickListener(new nz4.m(h17));
            h17.f341642J.setOnClickListener(new nz4.n(h17));
            h17.f341651i = bVar2.getViewPadding();
            h17.f341664v = this;
            h17.f341665w = new nz4.h(this);
            h17.f341666x = new nz4.f();
            h17.A = new com.tencent.mm.sdk.platformtools.n3();
            nz4.y.M = true;
            com.tencent.mars.xlog.Log.i("NoteSelectManager", "onInit end");
            com.tencent.mm.plugin.wenote.ui.nativenote.h hVar = new com.tencent.mm.plugin.wenote.ui.nativenote.h(this);
            this.E1 = hVar;
            this.f188148n.i(hVar);
        } else {
            cVar = cVar2;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.V1;
        if (u3Var != null) {
            u3Var.dismiss();
            this.V1 = null;
        }
        if (!this.E && !this.B1) {
            this.V1 = db5.e1.P(getContext(), "", 3, getString(com.tencent.mm.R.string.laz), false, true, new com.tencent.mm.plugin.wenote.ui.nativenote.x0(this));
        }
        if (this.B1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "open msg note,  out of date");
            cVar.e(this.A, 1);
            db5.e1.s(getContext(), getContext().getString(com.tencent.mm.R.string.h_r), null);
        }
        if (this.f188146l1) {
            if (com.tencent.mm.ui.bk.v0() && (com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.eg.d(getTaskId()))) {
                com.tencent.mm.ui.bk.z(getTaskId());
                if (com.tencent.mm.ui.bk.w0()) {
                    com.tencent.mm.ui.fj.b(this);
                }
                addIconOptionMenu(0, com.tencent.mm.R.string.f489943g7, com.tencent.mm.R.raw.icons_outlined_multi_task, new com.tencent.mm.plugin.wenote.ui.nativenote.l1(this));
            }
            addIconOptionMenu(1, com.tencent.mm.R.string.jzq, com.tencent.mm.R.raw.actionbar_icon_dark_more, new com.tencent.mm.plugin.wenote.ui.nativenote.m1(this));
        }
        if (this.f188162x1) {
            setMMTitle(getString(com.tencent.mm.R.string.f491221ce2));
        } else {
            setMMTitle(getString(com.tencent.mm.R.string.f491222ce3));
        }
        setBackBtnVisible(true);
        setBackBtn(new com.tencent.mm.plugin.wenote.ui.nativenote.c2(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        o25.n1.c(this);
        if (this.E) {
            z7(true, 300L);
            y7(1, 0L);
        }
        if (this.f188164y0 == 2 && this.f188162x1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "create toolbar for FROM_FAVORITE scene");
            tz4.l lVar = new tz4.l();
            this.f188153q = lVar;
            android.widget.FrameLayout frameLayout2 = this.f188150p;
            lVar.f423355a = frameLayout2;
            lVar.f423360f = new java.lang.ref.WeakReference(this);
            mz4.j0.f333290v.f333304l = lVar;
            lVar.f423358d = (androidx.recyclerview.widget.RecyclerView) frameLayout2.findViewById(com.tencent.mm.R.id.qov);
            tz4.i iVar2 = new tz4.i(this, this);
            lVar.f423357c = iVar2;
            iVar2.f423347g = new tz4.l$$a(lVar);
            android.view.View findViewById = frameLayout2.findViewById(com.tencent.mm.R.id.qox);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder", "initFootPanel", "(Landroid/view/View;Landroid/content/Context;Lcom/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewDelegate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder", "initFootPanel", "(Landroid/view/View;Landroid/content/Context;Lcom/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewDelegate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            lVar.f423358d.setAdapter(lVar.f423357c);
            lVar.f423358d.setLayoutManager(new tz4.m(lVar, this, 0, false));
            android.widget.ImageButton imageButton = (android.widget.ImageButton) frameLayout2.findViewById(com.tencent.mm.R.id.qmd).findViewById(com.tencent.mm.R.id.qme);
            imageButton.setImageResource(com.tencent.mm.R.raw.icons_outlined_note_extend);
            imageButton.setContentDescription(imageButton.getContext().getString(com.tencent.mm.R.string.lyn));
            imageButton.setOnClickListener(new tz4.n(lVar, this));
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) frameLayout2.findViewById(com.tencent.mm.R.id.qmk);
            lVar.f423356b = linearLayout;
            lVar.f423361g = (com.tencent.mm.ui.widget.imageview.WeImageButton) linearLayout.findViewById(com.tencent.mm.R.id.qkz);
            lVar.f423362h = (com.tencent.mm.ui.widget.imageview.WeImageButton) lVar.f423356b.findViewById(com.tencent.mm.R.id.f485306ql0);
            lVar.f423363i = (com.tencent.mm.ui.widget.imageview.WeImageButton) lVar.f423356b.findViewById(com.tencent.mm.R.id.qkx);
            lVar.f423364j = (com.tencent.mm.ui.widget.imageview.WeImageButton) lVar.f423356b.findViewById(com.tencent.mm.R.id.qkw);
            lVar.f423365k = (com.tencent.mm.ui.widget.imageview.WeImageButton) lVar.f423356b.findViewById(com.tencent.mm.R.id.qky);
            java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
            if (d17.equals("zh_CN") || d17.equals("zh_TW") || d17.equals("zh_HK") || d17.equals("en")) {
                lVar.f423366l = (com.tencent.mm.ui.widget.imageview.WeImageButton) lVar.f423356b.findViewById(com.tencent.mm.R.id.f485307ql1);
            } else {
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) lVar.f423356b.findViewById(com.tencent.mm.R.id.qml);
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) linearLayout2.getParent();
                int indexOfChild = viewGroup.indexOfChild(linearLayout2);
                android.view.View view = (android.widget.LinearLayout) lVar.f423356b.findViewById(com.tencent.mm.R.id.qmf);
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view.getParent();
                int indexOfChild2 = viewGroup2.indexOfChild(view);
                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) lVar.f423356b.findViewById(com.tencent.mm.R.id.qmh);
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) linearLayout3.getParent();
                int indexOfChild3 = viewGroup3.indexOfChild(linearLayout3);
                if (indexOfChild >= 0 && indexOfChild2 >= 0 && indexOfChild3 >= 0) {
                    viewGroup.removeView(linearLayout2);
                    viewGroup2.removeView(view);
                    viewGroup3.removeView(linearLayout3);
                    view.setPadding(0, 0, 0, 0);
                    android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.weight = 1.0f;
                        layoutParams.width = 0;
                        view.setLayoutParams(layoutParams);
                    }
                    viewGroup.addView(view, indexOfChild);
                    viewGroup2.addView(linearLayout3, indexOfChild3);
                }
                lVar.f423366l = null;
            }
            lVar.f423361g.setOnClickListener(new tz4.o(lVar));
            lVar.f423362h.setOnClickListener(new tz4.p(lVar));
            com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = lVar.f423363i;
            weImageButton.setIconColor(i65.a.d(weImageButton.getContext(), com.tencent.mm.R.color.FG_0));
            lVar.f423363i.setOnClickListener(new tz4.q(lVar));
            com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton2 = lVar.f423366l;
            if (weImageButton2 != null) {
                weImageButton2.setIconColor(i65.a.d(lVar.f423363i.getContext(), com.tencent.mm.R.color.FG_0));
                lVar.f423366l.setOnClickListener(new tz4.r(lVar));
            }
            lVar.f423364j.setOnClickListener(new tz4.s(lVar));
            lVar.f423365k.setOnClickListener(new tz4.t(lVar));
            getWindow().setSoftInputMode(18);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "skipping toolbar init canEdit=%b", java.lang.Boolean.valueOf(this.f188162x1));
            this.f188150p.setVisibility(8);
        }
        this.f188148n.getViewTreeObserver().addOnGlobalLayoutListener(this.P1);
        if (this.f188157u != null) {
            this.f188148n.getViewTreeObserver().addOnGlobalLayoutListener(this.Q1);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f188152p1 = currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "startnoteeditorui, oncreate , currenttime is %d", java.lang.Long.valueOf(currentTimeMillis));
        c01.d9.e().a(921, this);
        androidx.appcompat.app.b bVar5 = this.mController.G;
        if (bVar5 != null && bVar5.j() != null) {
            this.mController.G.j().postDelayed(new com.tencent.mm.plugin.wenote.ui.nativenote.d2(this), 100L);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "startPreMinuteUpload upload = " + this.f188145d2);
        if (this.f188145d2 && this.f188144c2 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "startPreMinuteUpload");
            this.f188144c2 = ((ku5.t0) ku5.t0.f312615d).d(new com.tencent.mm.plugin.wenote.ui.nativenote.j1(this), 60000L, 60000L);
        }
        long j29 = this.A;
        k82.b bVar6 = (k82.b) k82.c.f304888b.get(java.lang.Long.valueOf(j29));
        if (bVar6 != null) {
            bVar6.f304880j = java.lang.System.currentTimeMillis();
        } else {
            com.tencent.mars.xlog.Log.e("FavEnterReporter", "notifyNoteInit: localId not found, localId=" + j29);
        }
        if (com.tencent.mm.ui.b4.c(this)) {
            gh5.b a17 = gh5.d.a(this);
            a17.f271978i = 1;
            android.widget.FrameLayout frameLayout3 = this.f188150p;
            if (frameLayout3 != null) {
                a17.f271975f.addIfAbsent(new java.lang.ref.WeakReference(frameLayout3));
            }
            this.Y = new com.tencent.mm.plugin.wenote.ui.nativenote.e2(this);
            gh5.d.a(this).f(this.Y);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f482483fr);
        if (findViewById != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(findViewById, "split_view_icon");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(findViewById, 40, 26430);
        }
        return onCreateOptionsMenu;
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "cancelPreMinuteUpload upload = " + this.f188145d2);
        if (this.f188144c2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "cancelPreMinuteUpload");
            this.f188144c2.cancel(false);
            this.f188144c2 = null;
        }
        if (!com.tencent.mm.ui.bk.y() && !com.tencent.mm.ui.eg.d(getTaskId())) {
            m7(1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onDestroy %s %s", java.lang.Integer.valueOf(hashCode()), java.lang.Long.valueOf(this.A));
        this.f188143b2 = true;
        cz4.f fVar = this.F1;
        if (fVar != null) {
            fVar.o0();
        }
        com.tencent.mm.plugin.wenote.multitask.e eVar = this.G1;
        if (eVar != null) {
            eVar.f188132x.clear();
            com.tencent.mars.xlog.Log.i("MicroMsg.NoteMultiTaskHelper", "onDestroy");
        }
        if (this.C1 && (recyclerView = this.f188148n) != null) {
            recyclerView.V0(this.E1);
            this.f188148n.getViewTreeObserver().removeOnGlobalLayoutListener(this.Q1);
        }
        c01.d9.e().q(921, this);
        this.f188149o.getClass();
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.O1;
        if (ibVar != null) {
            ibVar.f();
            this.O1.setVisibility(8);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onDrag() {
        super.onDrag();
        if (this.C1) {
            nz4.y.h().n();
            nz4.y.h().p();
        }
        if (this.N) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onSwipeBack close vkb");
            hideVKB();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onKeyboardStateChanged() {
        super.onKeyboardStateChanged();
        boolean z17 = keyboardState() == 1;
        this.N = z17;
        if (z17 && !F7()) {
            y7(1, 0L);
        }
        if (this.C1) {
            E7();
        }
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        mz4.j0 j0Var = this.f188147m;
        if (j0Var != null) {
            j0Var.a();
        }
        cz4.f fVar = this.F1;
        if (fVar != null) {
            fVar.z();
        }
        com.tencent.mm.plugin.wenote.multitask.e eVar = this.G1;
        if (eVar != null) {
            eVar.A();
        }
        C7(true);
        uz4.d dVar = this.L1;
        if (dVar.f()) {
            dVar.h();
        }
        this.Y1 = this.N;
        z7(false, 0L);
        iz4.r a17 = mz4.b0.c().a();
        if (p7(a17)) {
            a17.f296144i = this.J1.r(getString(com.tencent.mm.R.string.l_l));
            a17.f296146n = this.U;
            a17.f296147o = this.V;
            mz4.b0.c().d(a17);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 64) {
            if (i17 == 80 && iArr[0] != 0) {
                s7();
                return;
            }
            return;
        }
        if (!u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null)) || iArr[0] == 0) {
            return;
        }
        db5.e1.C(getContext(), getString(com.tencent.mm.R.string.hhm), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.plugin.wenote.ui.nativenote.b1(this), null);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        boolean z17;
        r45.bq0 bq0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onRestoreInstanceState() called with: savedInstanceState = [" + bundle + "]");
        try {
            o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.A);
            if (F == null || (bq0Var = F.field_favProto) == null || bq0Var.f370964f.size() <= 1) {
                z17 = false;
            } else {
                r45.gp0 gp0Var = (r45.gp0) F.field_favProto.f370964f.get(0);
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "CheckHtmlCdnUrlNull:%s", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375434s)));
                z17 = com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375434s);
            }
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(1945L, 0L, 1L, false);
            if (z17) {
                fVar.idkeyStat(1945L, 1L, 1L, false);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onRestoreInstanceState inMagicWindowMode:%s", java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.y()));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Note.NoteEditorUI", th6, "report err", new java.lang.Object[0]);
        }
        this.M1 = true;
        super.onRestoreInstanceState(bundle);
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onResume %s", java.lang.Integer.valueOf(hashCode()));
        cz4.f fVar = this.F1;
        if (fVar != null) {
            fVar.x();
        }
        com.tencent.mm.plugin.wenote.multitask.e eVar = this.G1;
        if (eVar != null) {
            eVar.z();
        }
        if (this.f188164y0 == 2) {
            tz4.l lVar = this.f188153q;
            if (lVar != null && this.f188162x1) {
                lVar.a(false);
            }
            int i17 = this.X1;
            if (i17 != -1) {
                if (i17 != 4097) {
                    if (i17 == 4099 || i17 == 4100) {
                        z7(true, 100L);
                        y7(1, 0L);
                    }
                } else if (!this.W1) {
                    z7(true, 100L);
                    y7(1, 0L);
                }
            } else if (this.Y1) {
                z7(true, 100L);
                y7(1, 0L);
            }
        }
        this.X1 = -1;
        this.W1 = false;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public synchronized void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        android.graphics.Bitmap createBitmap;
        if (m1Var.getType() != 921) {
            return;
        }
        if (m1Var instanceof hz4.e) {
            hz4.e eVar = (hz4.e) m1Var;
            int i19 = 1;
            if (eVar.f286402f != 1) {
                return;
            }
            if (i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "genlong pic , allow");
                androidx.recyclerview.widget.f2 adapter = this.f188148n.getAdapter();
                if (adapter != null) {
                    int itemCount = adapter.getItemCount();
                    if (itemCount <= 0) {
                        j7();
                        dp.a.makeText(getContext(), getContext().getString(com.tencent.mm.R.string.h_w), 1).show();
                        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        java.lang.Object[] objArr = new java.lang.Object[5];
                        objArr[0] = 0;
                        objArr[1] = 0;
                        objArr[2] = 0;
                        objArr[3] = 1;
                        if (!this.f188162x1) {
                            i19 = 0;
                        }
                        objArr[4] = java.lang.Integer.valueOf(i19);
                        g0Var.d(14811, objArr);
                        return;
                    }
                    try {
                        try {
                            jt0.i iVar = new jt0.i(((int) (java.lang.Runtime.getRuntime().maxMemory() / 1024)) / 8, getClass());
                            int i27 = 0;
                            for (int i28 = 0; i28 < itemCount; i28++) {
                                androidx.recyclerview.widget.k3 createViewHolder = adapter.createViewHolder(this.f188148n, adapter.getItemViewType(i28));
                                adapter.onBindViewHolder(createViewHolder, i28);
                                createViewHolder.itemView.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.f188148n.getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                android.view.View view = createViewHolder.itemView;
                                view.layout(0, 0, view.getMeasuredWidth(), createViewHolder.itemView.getMeasuredHeight());
                                int width = createViewHolder.itemView.getWidth();
                                int height = createViewHolder.itemView.getHeight();
                                if (width > 0 && height > 0) {
                                    try {
                                        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        arrayList.add(config);
                                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                        arrayList.add(java.lang.Integer.valueOf(height));
                                        arrayList.add(java.lang.Integer.valueOf(width));
                                        java.lang.Object obj = new java.lang.Object();
                                        java.util.Collections.reverse(arrayList);
                                        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                                        android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                                        yj0.a.e(obj, createBitmap2, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                                        try {
                                            createViewHolder.itemView.draw(new android.graphics.Canvas(createBitmap2));
                                        } catch (java.lang.Exception unused) {
                                            j7();
                                            dp.a.makeText(getContext(), getContext().getString(com.tencent.mm.R.string.h_w), 1).show();
                                            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                                            java.lang.Object[] objArr2 = new java.lang.Object[5];
                                            objArr2[0] = 0;
                                            objArr2[1] = 0;
                                            objArr2[2] = 0;
                                            objArr2[3] = 1;
                                            objArr2[4] = java.lang.Integer.valueOf(this.f188162x1 ? 1 : 0);
                                            g0Var2.d(14811, objArr2);
                                        }
                                        iVar.put(java.lang.String.valueOf(i28), createBitmap2);
                                        i27 += createViewHolder.itemView.getMeasuredHeight();
                                    } catch (java.lang.Throwable unused2) {
                                        for (int i29 = 0; i29 < i28; i29++) {
                                            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) iVar.get(java.lang.String.valueOf(i29));
                                            if (bitmap != null && !bitmap.isRecycled()) {
                                                bitmap.recycle();
                                            }
                                        }
                                        j7();
                                        dp.a.makeText(getContext(), getContext().getString(com.tencent.mm.R.string.h_w), 1).show();
                                        return;
                                    }
                                }
                            }
                            try {
                                int b17 = i65.a.b(getContext(), 14);
                                try {
                                    int measuredWidth = this.f188148n.getMeasuredWidth() + 0;
                                    android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    arrayList2.add(config2);
                                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                                    arrayList2.add(java.lang.Integer.valueOf(i27 + b17));
                                    arrayList2.add(java.lang.Integer.valueOf(measuredWidth));
                                    java.lang.Object obj2 = new java.lang.Object();
                                    java.util.Collections.reverse(arrayList2);
                                    yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                                    createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                                    yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                                } catch (java.lang.Throwable unused3) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "favorite, note, gen long pic ,rgb 888  error,errormsg ");
                                    try {
                                        int measuredWidth2 = this.f188148n.getMeasuredWidth() + 0;
                                        int i37 = i27 + b17;
                                        android.graphics.Bitmap.Config config3 = android.graphics.Bitmap.Config.RGB_565;
                                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                        arrayList3.add(config3);
                                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                                        arrayList3.add(java.lang.Integer.valueOf(i37));
                                        arrayList3.add(java.lang.Integer.valueOf(measuredWidth2));
                                        java.lang.Object obj3 = new java.lang.Object();
                                        java.util.Collections.reverse(arrayList3);
                                        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                                        createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList3.get(0)).intValue(), ((java.lang.Integer) arrayList3.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList3.get(2));
                                        yj0.a.e(obj3, createBitmap, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                                    } catch (java.lang.Throwable unused4) {
                                        com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                                        java.lang.Object[] objArr3 = new java.lang.Object[5];
                                        objArr3[0] = 0;
                                        objArr3[1] = 0;
                                        objArr3[2] = 0;
                                        objArr3[3] = 2;
                                        objArr3[4] = java.lang.Integer.valueOf(this.f188162x1 ? 1 : 0);
                                        g0Var3.d(14811, objArr3);
                                        com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "favorite, note, gen long pic , 565 error,errormsg is er:");
                                        j7();
                                        dp.a.makeText(getContext(), getContext().getString(com.tencent.mm.R.string.h_w), 1).show();
                                        for (int i38 = 0; i38 < itemCount; i38++) {
                                            android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) iVar.get(java.lang.String.valueOf(i38));
                                            if (bitmap2 != null && !bitmap2.isRecycled()) {
                                                bitmap2.recycle();
                                            }
                                        }
                                        return;
                                    }
                                }
                                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                                canvas.drawColor(-1);
                                int b18 = i65.a.b(getContext(), 8);
                                for (int i39 = 0; i39 < itemCount; i39++) {
                                    android.graphics.Bitmap bitmap3 = (android.graphics.Bitmap) iVar.get(java.lang.String.valueOf(i39));
                                    if (bitmap3 != null) {
                                        canvas.drawBitmap(bitmap3, 0, b18, (android.graphics.Paint) null);
                                        b18 += bitmap3.getHeight();
                                        if (!bitmap3.isRecycled()) {
                                            bitmap3.recycle();
                                        }
                                    }
                                }
                                com.tencent.mm.ui.widget.dialog.u3 u3Var = this.V1;
                                if (u3Var != null && u3Var.isShowing()) {
                                    j7();
                                    gm0.j1.e().j(new com.tencent.mm.plugin.wenote.ui.nativenote.g1(this, createBitmap));
                                } else if (createBitmap != null && !createBitmap.isRecycled()) {
                                    createBitmap.recycle();
                                }
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "genlongpic fail,error msg Exception");
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Note.NoteEditorUI", e17, "", new java.lang.Object[0]);
                                j7();
                                dp.a.makeText(getContext(), getContext().getString(com.tencent.mm.R.string.h_w), 1).show();
                                com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                                java.lang.Object[] objArr4 = new java.lang.Object[5];
                                objArr4[0] = 0;
                                objArr4[1] = 0;
                                objArr4[2] = 0;
                                objArr4[3] = 1;
                                objArr4[4] = java.lang.Integer.valueOf(this.f188162x1 ? 1 : 0);
                                g0Var4.d(14811, objArr4);
                                return;
                            }
                        } catch (java.lang.Exception unused5) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "genlongpic fail,Exception error msg a");
                            j7();
                            dp.a.makeText(getContext(), getContext().getString(com.tencent.mm.R.string.h_w), 1).show();
                            com.tencent.mm.plugin.report.service.g0 g0Var5 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                            java.lang.Object[] objArr5 = new java.lang.Object[5];
                            objArr5[0] = 0;
                            objArr5[1] = 0;
                            objArr5[2] = 0;
                            objArr5[3] = 2;
                            objArr5[4] = java.lang.Integer.valueOf(this.f188162x1 ? 1 : 0);
                            g0Var5.d(14811, objArr5);
                        }
                    } catch (java.lang.Throwable unused6) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "genlongpic fail,Throwable error msg throw");
                        j7();
                        dp.a.makeText(getContext(), getContext().getString(com.tencent.mm.R.string.h_w), 1).show();
                        com.tencent.mm.plugin.report.service.g0 g0Var6 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        java.lang.Object[] objArr6 = new java.lang.Object[5];
                        objArr6[0] = 0;
                        objArr6[1] = 0;
                        objArr6[2] = 0;
                        objArr6[3] = 2;
                        objArr6[4] = java.lang.Integer.valueOf(this.f188162x1 ? 1 : 0);
                        g0Var6.d(14811, objArr6);
                    }
                } else {
                    com.tencent.mm.plugin.report.service.g0 g0Var7 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Object[] objArr7 = new java.lang.Object[5];
                    objArr7[0] = 0;
                    objArr7[1] = 0;
                    objArr7[2] = 0;
                    objArr7[3] = 1;
                    objArr7[4] = java.lang.Integer.valueOf(this.f188162x1 ? 1 : 0);
                    g0Var7.d(14811, objArr7);
                    j7();
                    dp.a.makeText(getContext(), getContext().getString(com.tencent.mm.R.string.h_w), 1).show();
                }
            } else {
                com.tencent.mm.plugin.report.service.g0 g0Var8 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr8 = new java.lang.Object[5];
                objArr8[0] = 0;
                objArr8[1] = 0;
                objArr8[2] = 0;
                objArr8[3] = 4;
                objArr8[4] = java.lang.Integer.valueOf(this.f188162x1 ? 1 : 0);
                g0Var8.d(14811, objArr8);
                com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "genlong pic , not allow");
                j7();
                dp.a.makeText(getContext(), getContext().getString(com.tencent.mm.R.string.h_w), 1).show();
            }
            this.f188147m.f333309q = eVar.f286406m;
            mz4.d dVar = this.J1;
            dVar.z(dVar.D() - 1, false, null);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onStart %s", java.lang.Integer.valueOf(hashCode()));
        this.f188142a2.alive();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onStop %s", java.lang.Integer.valueOf(hashCode()));
        this.f188142a2.dead();
    }

    public final boolean p7(iz4.r rVar) {
        if (rVar == null) {
            return false;
        }
        boolean z17 = rVar.f296139d;
        int i17 = this.f188164y0;
        if (z17 == (i17 == 1)) {
            return (i17 == 1 && rVar.f296141f == this.f188159w && rVar.f296142g == this.f188160x) || (i17 == 2 && rVar.f296140e == this.A);
        }
        return false;
    }

    public void q7(boolean z17, boolean z18) {
        iz4.w wVar;
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,force:%B", java.lang.Boolean.valueOf(z17));
        if (this.f188158v || ((hz4.f) hz4.f.wi()).f286407d == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(this.f188158v);
            objArr[1] = java.lang.Boolean.valueOf(((hz4.f) hz4.f.wi()).f286407d == null);
            com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,isInitDataList:%B,SubCoreWNNoteMsg.getCore().getWnNoteBase() == null :%B", objArr);
            return;
        }
        if (this.f188159w <= 0 || !((i17 = this.f188164y0) == 1 || i17 == 5)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,open from fav");
            if (((hz4.f) hz4.f.wi()).f286407d.f286414e == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,SubCoreWNNoteMsg.getCore().getWnNoteBase().mClickedFavItemInfo == null ");
                return;
            }
            wVar = (iz4.w) ((hz4.f) hz4.f.wi()).f286407d.f286415f.get(java.lang.Long.toString(((hz4.f) hz4.f.wi()).f286407d.f286414e.field_localId));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,open from Session");
            if (((hz4.f) hz4.f.wi()).f286407d.f286413d == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,SubCoreWNNoteMsg.getCore().getWnNoteBase().mWNNoteData == null ");
                return;
            }
            wVar = (iz4.w) ((hz4.f) hz4.f.wi()).f286407d.f286415f.get(java.lang.Long.toString(((hz4.f) hz4.f.wi()).f286407d.f286413d.f296126d));
        }
        if (wVar != null && !this.E) {
            boolean z19 = wVar.f296166c;
            this.Q = z19;
            if (z19) {
                B7(wVar.f296165b, false);
            } else {
                this.f188158v = true;
                B7(wVar.f296165b, true);
            }
        }
        if (z18) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.this;
                    noteEditorUI.I = noteEditorUI.J1.p(false);
                }
            });
        }
    }

    public void r7(com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText, boolean z17, int i17) {
        if (this.f188164y0 == 2 && this.f188147m.f333310r) {
            ((com.tencent.mm.plugin.wenote.ui.nativenote.adapter.NoteLinearLayoutManager) this.f188148n.getLayoutManager()).f188182y = z17;
            if (this.L) {
                ((com.tencent.mm.plugin.wenote.ui.nativenote.adapter.NoteLinearLayoutManager) this.f188148n.getLayoutManager()).f188182y = false;
            }
            mz4.d dVar = this.J1;
            if (!z17) {
                dVar.B(-1, false, true);
                return;
            }
            n7();
            if (wXRTEditText == null || wXRTEditText.getEditTextType() != 1) {
                dVar.A(i17, false);
            } else {
                dVar.A(i17, true);
            }
        }
    }

    public void s7() {
        db5.e1.C(this, getString(com.tencent.mm.R.string.hhn), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.plugin.wenote.ui.nativenote.c1(this), new com.tencent.mm.plugin.wenote.ui.nativenote.d1(this));
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(m82.o.class);
        hashSet.add(gk5.c1.class);
    }

    public void t7() {
        com.tencent.mm.plugin.appbrand.utils.d5.b(new com.tencent.mm.plugin.wenote.ui.nativenote.v(this));
    }

    public void u7(int i17, int i18) {
        com.tencent.mm.plugin.appbrand.utils.d5.b(new com.tencent.mm.plugin.wenote.ui.nativenote.u(this, i17, i18));
    }

    public void v7() {
        if (this.E || this.F) {
            b5();
            if (this.C1) {
                nz4.y.h().c();
            }
            this.f188141J.postDelayed(new com.tencent.mm.plugin.wenote.ui.nativenote.a1(this), 100L);
        }
    }

    public void w7() {
        db5.e1.s(getContext(), getString(com.tencent.mm.R.string.h_x), null);
    }

    public void x1(int i17) {
        com.tencent.mm.plugin.appbrand.utils.d5.b(new com.tencent.mm.plugin.wenote.ui.nativenote.r(this, i17));
    }

    public void x7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onOperateWindowDelete %s", java.lang.Long.valueOf(this.A));
        iz4.i iVar = new iz4.i();
        iVar.f296155t = "";
        iVar.f296104b = true;
        iVar.f296110h = false;
        iVar.f296105c = 0;
        mz4.d dVar = this.J1;
        dVar.getClass();
        com.tencent.mm.plugin.appbrand.utils.d5.b(new mz4.d$$k(dVar, false));
        dVar.b(iVar, false);
        t7();
        z7(true, 50L);
        y7(1, 0L);
    }

    public void y7(int i17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onUpdateToolBarVisibility, style:%s, delay:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        if (this.f188164y0 == 2 && this.f188147m.f333310r) {
            if (i17 != 3) {
                h7(0.0f);
            }
            this.f188141J.postDelayed(new com.tencent.mm.plugin.wenote.ui.nativenote.t0(this, i17), j17);
        }
    }

    public void z7(boolean z17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onUpdateVKBVisibility setShow:%s, delay:%s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17));
        if (this.f188164y0 == 2 && this.f188147m.f333310r) {
            this.f188141J.postDelayed(new com.tencent.mm.plugin.wenote.ui.nativenote.s0(this, z17), j17);
        }
    }
}
