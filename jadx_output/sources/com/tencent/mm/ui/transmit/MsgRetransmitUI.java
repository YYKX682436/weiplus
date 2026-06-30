package com.tencent.mm.ui.transmit;

/* loaded from: classes9.dex */
public class MsgRetransmitUI extends com.tencent.mm.ui.MMBaseActivity {
    public static final /* synthetic */ int H1 = 0;
    public java.lang.String C;
    public int E;
    public float F;
    public float G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f210951J;
    public int N;
    public java.lang.String Q;
    public java.lang.String R;
    public int S;

    /* renamed from: e, reason: collision with root package name */
    public int f210952e;

    /* renamed from: f, reason: collision with root package name */
    public long f210953f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f210954g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f210955h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f210956i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f210958m;

    /* renamed from: o, reason: collision with root package name */
    public int f210960o;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f210962p0;

    /* renamed from: n, reason: collision with root package name */
    public int f210959n = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f210961p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f210964q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f210965r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f210966s = false;

    /* renamed from: t, reason: collision with root package name */
    public android.app.ProgressDialog f210967t = null;

    /* renamed from: u, reason: collision with root package name */
    public android.app.ProgressDialog f210968u = null;

    /* renamed from: v, reason: collision with root package name */
    public int f210969v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f210970w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f210971x = 0;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f210974y = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f210977z = false;
    public boolean A = false;
    public boolean B = false;
    public int D = -1;
    public boolean K = true;
    public boolean L = true;
    public int M = 0;
    public long P = 0;
    public boolean T = true;
    public boolean U = false;
    public int V = 0;
    public boolean W = false;
    public boolean X = true;
    public boolean Y = false;
    public boolean Z = false;

    /* renamed from: x0, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f210972x0 = new java.util.concurrent.CountDownLatch(1);

    /* renamed from: y0, reason: collision with root package name */
    public boolean f210975y0 = false;

    /* renamed from: l1, reason: collision with root package name */
    public com.tencent.mm.modelmulti.WxaInfo f210957l1 = null;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.modelmulti.BizScreenshotMsgInfo f210963p1 = null;

    /* renamed from: x1, reason: collision with root package name */
    public com.tencent.mm.modelscan.ScanCodeInfo f210973x1 = null;

    /* renamed from: y1, reason: collision with root package name */
    public com.tencent.mm.modelmulti.SourceImgInfo f210976y1 = null;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f210978z1 = false;
    public java.lang.String A1 = "";
    public final com.tencent.mm.sdk.platformtools.n3 B1 = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    public boolean C1 = false;
    public boolean D1 = false;
    public java.lang.String E1 = "";
    public java.lang.String F1 = "";
    public java.lang.String G1 = "";

    public static void O6(java.lang.String str, java.lang.Long l17) {
        if (l17 == null) {
            return;
        }
        com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent updateForwardMsgIdEvent = new com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent();
        long longValue = l17.longValue();
        am.xz xzVar = updateForwardMsgIdEvent.f54918g;
        xzVar.f8409a = longValue;
        xzVar.f8410b = 0;
        xzVar.f8411c = str;
        updateForwardMsgIdEvent.e();
    }

    public static void P6(w11.n1 n1Var) {
        com.tencent.mm.modelbase.m1 m1Var;
        if (n1Var == null || (m1Var = n1Var.f442095a) == null || 522 != m1Var.getType()) {
            return;
        }
        com.tencent.mm.modelbase.m1 m1Var2 = n1Var.f442095a;
        if (m1Var2 instanceof w11.r0) {
            O6(((w11.r0) m1Var2).f442118g, java.lang.Long.valueOf(((w11.r0) m1Var2).f442117f));
        }
    }

    public final boolean Q6() {
        if (c01.d9.b().E()) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MsgRetransmitUI", "sdcard is not available, type = " + this.f210952e);
        db5.t7.k(this, null);
        return false;
    }

    public final boolean R6(dk5.e2 e2Var, t21.v2 v2Var, java.lang.String str) {
        if (v2Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgRetransmitUI", "checkVideoCdnInfo info is null !!!");
            return false;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(v2Var.g(), "msg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgRetransmitUI", "%s cdntra parse video recv xml failed");
            return false;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return false;
        }
        java.lang.String str3 = (java.lang.String) d17.get(".msg.videomsg.$aeskey");
        java.lang.String str4 = (java.lang.String) d17.get(".msg.videomsg.$md5");
        java.lang.String str5 = (java.lang.String) d17.get(".msg.videomsg.$newmd5");
        java.lang.String str6 = (java.lang.String) d17.get(".msg.videomsg.$cdnrawvideoaeskey");
        java.lang.String str7 = (java.lang.String) d17.get(".msg.videomsg.$cdnrawvideourl");
        java.lang.String str8 = (java.lang.String) d17.get(".msg.videomsg.$rawmd5");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.videomsg.$rawlength"), 0);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.videomsg.$length"), 0);
        int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.videomsg.$playlength"), 0);
        int P4 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.videomsg.$cdnthumblength"), 0);
        java.lang.String str9 = (java.lang.String) d17.get(".msg.videomsg.$originsourcemd5");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            if (!com.tencent.mm.vfs.w6.j(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, v2Var.d(), false))) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1328L, 1L, 1L, true);
                return false;
            }
        }
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_MsgRetransmitUI_3";
        mVar.f241787f = new dk5.n1(this, str7, str2, str6, str3, P4, P, P2, str, str8, str4, str5, str9, P3, v2Var);
        mVar.field_mediaId = com.tencent.mm.modelcdntran.i2.b("checkExist", java.lang.System.currentTimeMillis(), str, "" + this.f210953f);
        mVar.field_fileId = str2;
        mVar.field_aesKey = str3;
        mVar.field_filemd5 = str4;
        mVar.field_fileType = 4;
        mVar.field_talker = str;
        mVar.field_priority = 2;
        mVar.field_svr_signature = "";
        mVar.field_onlycheckexist = true;
        mVar.field_trysafecdn = true;
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            this.f210966s = false;
            finish();
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MsgRetransmitUI", "check exist fail! download video before retransmit");
        finish();
        return false;
    }

    public final void S6(dk5.e2 e2Var, java.lang.String str) {
        r45.uf6 uf6Var;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MsgRetransmitUI", "start copy video", new java.lang.Object[0]);
        dk5.c2 c2Var = new dk5.c2();
        this.f210967t = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490552yb), true, true, new dk5.k1(this, c2Var));
        java.util.concurrent.CountDownLatch countDownLatch = this.f210972x0;
        if (countDownLatch.getCount() > 0) {
            this.f210975y0 = true;
            c2Var.f234560t = countDownLatch;
        }
        c2Var.f234542b = this;
        c2Var.f234546f = this.f210954g;
        c2Var.f234541a = this.f210967t;
        c2Var.f234544d = this.f210970w;
        c2Var.f234545e = this.f210960o;
        c2Var.f234550j = false;
        c2Var.f234548h = str;
        c2Var.f234551k = true;
        c2Var.f234552l = this.f210966s;
        c2Var.f234555o = e2Var;
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String str2 = this.f210954g;
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(str2);
        if (h17 != null && (uf6Var = h17.E) != null) {
            c2Var.f234554n = uf6Var;
            c2Var.f234556p = h17.h();
            c2Var.f234557q = new com.tencent.mm.plugin.msg.MsgIdTalker(h17.f415016n, h17.f415020r);
        }
        if (h17 != null) {
            c2Var.f234559s = h17.N;
        }
        c2Var.f234565y = h17.R;
        c2Var.f234564x = h17.Q;
        c2Var.execute(new java.lang.Object[0]);
        c01.sc.d().a(c01.sc.f37461d, null);
        long j17 = this.f210953f;
        if (j17 == -1) {
            return;
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.R, j17);
        boolean R4 = com.tencent.mm.storage.z3.R4(str);
        com.tencent.mm.ui.chatting.e.c(R4 ? com.tencent.mm.ui.chatting.c.Chatroom : com.tencent.mm.ui.chatting.c.Chat, this.f210951J ? com.tencent.mm.ui.chatting.d.Full : com.tencent.mm.ui.chatting.d.Samll, Li, R4 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str) : 0);
    }

    public final void T6() {
        ((ku5.t0) ku5.t0.f312615d).h(new dk5.j1(this), "MicroMsg.MsgRetransmitUI");
        finish();
        this.f210966s = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0232, code lost:
    
        if (r4.getInteger(r4.f368365d + 6) == 24) goto L164;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:119:0x026f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:159:0x02f8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x09c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6(java.lang.String r51) {
        /*
            Method dump skipped, instructions count: 3546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.transmit.MsgRetransmitUI.U6(java.lang.String):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0070. Please report as an issue. */
    public final void V6() {
        android.view.View inflate;
        int i17 = this.f210952e;
        if (i17 == 2 || i17 == 16) {
            java.lang.String string = getIntent().getExtras().getString(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE);
            com.tencent.mm.pluginsdk.model.app.m mVar = new com.tencent.mm.pluginsdk.model.app.m();
            mVar.field_packageName = string;
            com.tencent.mm.pluginsdk.model.app.u5.Di().get(mVar, com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req(getIntent().getExtras()).message;
            dk5.r4 r4Var = new dk5.r4(new dk5.u1(this));
            byte[] bArr = wXMediaMessage.thumbData;
            android.graphics.Bitmap G = bArr == null ? null : com.tencent.mm.sdk.platformtools.x.G(bArr);
            int type = wXMediaMessage.mediaObject.type();
            if (type != 130) {
                switch (type) {
                    case 1:
                        inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.f488155in, null);
                        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf)).setText(wXMediaMessage.title);
                        android.view.View view = inflate;
                        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.nec)).setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(this, mVar));
                        r4Var.f234850a = db5.e1.r(this, null, view, getString(com.tencent.mm.R.string.f490551ya), getString(com.tencent.mm.R.string.f490347sg), new dk5.o4(r4Var), new dk5.p4(r4Var));
                    case 2:
                        inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.f488154im, null);
                        ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f487295o70)).setImageBitmap(G);
                        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf)).setText(wXMediaMessage.title);
                        android.view.View view2 = inflate;
                        ((android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.nec)).setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(this, mVar));
                        r4Var.f234850a = db5.e1.r(this, null, view2, getString(com.tencent.mm.R.string.f490551ya), getString(com.tencent.mm.R.string.f490347sg), new dk5.o4(r4Var), new dk5.p4(r4Var));
                    case 3:
                        inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.f488153il, null);
                        ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f487295o70)).setImageBitmap(G);
                        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
                        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
                        textView.setText(wXMediaMessage.title);
                        textView2.setText(wXMediaMessage.description);
                        android.view.View view22 = inflate;
                        ((android.widget.TextView) view22.findViewById(com.tencent.mm.R.id.nec)).setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(this, mVar));
                        r4Var.f234850a = db5.e1.r(this, null, view22, getString(com.tencent.mm.R.string.f490551ya), getString(com.tencent.mm.R.string.f490347sg), new dk5.o4(r4Var), new dk5.p4(r4Var));
                    case 4:
                        inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.f488153il, null);
                        ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f487295o70)).setImageBitmap(G);
                        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
                        android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
                        textView3.setText(wXMediaMessage.title);
                        textView4.setText(wXMediaMessage.description);
                        android.view.View view222 = inflate;
                        ((android.widget.TextView) view222.findViewById(com.tencent.mm.R.id.nec)).setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(this, mVar));
                        r4Var.f234850a = db5.e1.r(this, null, view222, getString(com.tencent.mm.R.string.f490551ya), getString(com.tencent.mm.R.string.f490347sg), new dk5.o4(r4Var), new dk5.p4(r4Var));
                    case 5:
                        inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.f488153il, null);
                        ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f487295o70)).setImageBitmap(G);
                        android.widget.TextView textView5 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
                        android.widget.TextView textView6 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
                        textView5.setText(wXMediaMessage.title);
                        textView6.setText(wXMediaMessage.description);
                        android.view.View view2222 = inflate;
                        ((android.widget.TextView) view2222.findViewById(com.tencent.mm.R.id.nec)).setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(this, mVar));
                        r4Var.f234850a = db5.e1.r(this, null, view2222, getString(com.tencent.mm.R.string.f490551ya), getString(com.tencent.mm.R.string.f490347sg), new dk5.o4(r4Var), new dk5.p4(r4Var));
                    case 6:
                        break;
                    case 7:
                        inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.f488153il, null);
                        ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f487295o70)).setImageBitmap(G);
                        android.widget.TextView textView7 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
                        android.widget.TextView textView8 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
                        textView7.setText(wXMediaMessage.title);
                        textView8.setText(wXMediaMessage.description);
                        android.view.View view22222 = inflate;
                        ((android.widget.TextView) view22222.findViewById(com.tencent.mm.R.id.nec)).setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(this, mVar));
                        r4Var.f234850a = db5.e1.r(this, null, view22222, getString(com.tencent.mm.R.string.f490551ya), getString(com.tencent.mm.R.string.f490347sg), new dk5.o4(r4Var), new dk5.p4(r4Var));
                    default:
                        com.tencent.mars.xlog.Log.e("MicroMsg.SendAppMessage", "unkown app message type, skipped, type=" + wXMediaMessage.mediaObject.type());
                        return;
                }
            }
            inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.f488153il, null);
            ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f487295o70)).setImageBitmap(G);
            android.widget.TextView textView9 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
            android.widget.TextView textView10 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
            textView9.setText(wXMediaMessage.title);
            textView10.setText(wXMediaMessage.description);
            android.view.View view222222 = inflate;
            ((android.widget.TextView) view222222.findViewById(com.tencent.mm.R.id.nec)).setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(this, mVar));
            r4Var.f234850a = db5.e1.r(this, null, view222222, getString(com.tencent.mm.R.string.f490551ya), getString(com.tencent.mm.R.string.f490347sg), new dk5.o4(r4Var), new dk5.p4(r4Var));
        }
    }

    public final void W6(java.lang.String str) {
        boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.forward.RepairerConfigForwardSnackBarFix()) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "done isWaitedForRecreateCompressVideo:%s showSuccessTips:%s isFixSnackBar:%s goToChattingUI:%s, StayWhereYouAre:%s sessionId:%s", java.lang.Boolean.valueOf(this.f210975y0), java.lang.Boolean.valueOf(this.f210966s), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f210965r), java.lang.Boolean.valueOf(this.K), com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209295b);
        if (!com.tencent.mm.repairer.config.forward.RepairerConfigForwardSnackBarJumpChatting.f192214a.a()) {
            int i17 = al5.u4.f6058t;
            al5.t4 t4Var = new al5.t4(this);
            t4Var.f6042e = getString(com.tencent.mm.R.string.fw6);
            t4Var.e(com.tencent.mm.R.raw.check_mark_regular);
            t4Var.f6050m = z17;
            t4Var.g();
        }
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        arrayList.addAll(this.f210955h);
        intent.putStringArrayListExtra("SendMsgUsernames", arrayList);
        intent.putExtra("sendResult", 0);
        setResult(-1, intent);
        if (this.T && !this.f210975y0) {
            this.B1.postDelayed(new dk5.f1(this), z17 ? 0L : this.f210966s ? 2000L : 0L);
        }
        if (!this.f210965r || this.K) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class);
        intent2.addFlags(67108864);
        intent2.putExtra("Chat_User", str);
        intent2.putExtra("scene_from", this.V);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/ui/transmit/MsgRetransmitUI", "done", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/transmit/MsgRetransmitUI", "done", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final java.lang.String X6(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (com.tencent.mm.storage.z3.R4((java.lang.String) list.get(i17))) {
                arrayList.add("group");
            } else {
                arrayList.add("chat");
            }
        }
        return com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ";");
    }

    public final void Y6(ot0.q qVar, boolean z17) {
        r45.kv2 shareObj;
        if (!this.X || qVar == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f210955h);
        long j17 = z17 ? 1L : 2L;
        zy2.i iVar = (zy2.i) qVar.y(zy2.i.class);
        if (iVar == null || (shareObj = iVar.f477411b) == null) {
            return;
        }
        zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
        java.lang.String receiver = com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ";");
        long size = arrayList.size();
        ((c61.w8) paVar).getClass();
        kotlin.jvm.internal.o.g(shareObj, "shareObj");
        kotlin.jvm.internal.o.g(receiver, "receiver");
        ((com.tencent.mm.plugin.finder.report.o3) ((zy2.qa) i95.n0.c(zy2.qa.class))).Uj(shareObj, 7, j17, receiver, null, size);
    }

    public final boolean Z6(byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "isImage called, data[0-4]:[%d,%d,%d,%d,%d]", java.lang.Byte.valueOf(bArr[0]), java.lang.Byte.valueOf(bArr[1]), java.lang.Byte.valueOf(bArr[2]), java.lang.Byte.valueOf(bArr[3]), java.lang.Byte.valueOf(bArr[4]));
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.tencent.mm.graphics.e.b(bArr, 0, bArr.length, options);
        return options.outWidth >= 0 && options.outHeight >= 0;
    }

    public final boolean a7(final java.lang.String str) {
        java.lang.String str2 = this.f210956i;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        ot0.q v17 = ot0.q.v(str2);
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgRetransmitUI", "processAppMessageTransfer error: app content null");
            return false;
        }
        int i17 = v17.f348666i;
        if (i17 == 53 || i17 == 57) {
            java.lang.String str3 = v17.f348654f;
            c01.z1.r();
            if (w11.t1.a(str)) {
                w11.r1 a17 = w11.s1.a(str);
                a17.g(str);
                a17.e(str3);
                a17.h(c01.e2.C(str));
                c01.h7 h7Var = new c01.h7();
                h7Var.f37230e = getIntent().getStringExtra("msg_forward_sns_obj_id");
                h7Var.f37227b = this.f210953f;
                h7Var.f37229d = this.R;
                a17.f(h7Var);
                a17.c(new yz5.l() { // from class: dk5.b1$$c
                    @Override // yz5.l
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        com.tencent.mm.ui.transmit.MsgRetransmitUI.O6(str, (java.lang.Long) obj);
                        return null;
                    }
                });
            } else {
                w11.r1 a18 = w11.s1.a(str);
                a18.g(str);
                a18.e(str3);
                a18.h(c01.e2.C(str));
                a18.f442131f = 0;
                a18.f442134i = 4;
                c01.h7 h7Var2 = new c01.h7();
                h7Var2.f37230e = getIntent().getStringExtra("msg_forward_sns_obj_id");
                h7Var2.f37227b = this.f210953f;
                h7Var2.f37229d = this.R;
                a18.f(h7Var2);
                w11.n1 a19 = a18.a();
                a19.a();
                P6(a19);
            }
            return true;
        }
        if (i17 == 101) {
            com.tencent.mm.pluginsdk.ui.tools.g0 g0Var = (com.tencent.mm.pluginsdk.ui.tools.g0) v17.y(com.tencent.mm.pluginsdk.ui.tools.g0.class);
            g0Var.f191637i = 0;
            g0Var.f191638j = "";
            v17.f(g0Var);
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.R, this.f210953f);
        byte[] bArr = null;
        if (!Li.t2()) {
            java.lang.String str4 = this.f210961p;
            if (str4 != null) {
                try {
                    bArr = com.tencent.mm.vfs.w6.N(str4, 0, -1);
                    if (!Z6(bArr)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MsgRetransmitUI", "processAppMessageTransfer thumb file is not image");
                        return false;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgRetransmitUI", e17, "processAppMessageTransfer send to user: %s, exception", str);
                }
            } else if (this.D < 0) {
                try {
                    bArr = com.tencent.mm.vfs.w6.N(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(Li, Li.z0(), true), 0, -1);
                    if (!Z6(bArr)) {
                        return false;
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgRetransmitUI", e18, "processAppMessageTransfer send to user: %s, exception", str);
                }
            }
            byte[] bArr2 = bArr;
            ot0.a aVar = (ot0.a) v17.y(ot0.a.class);
            if (aVar == null) {
                aVar = new ot0.a();
            }
            aVar.K = this.Y;
            com.tencent.mm.modelmulti.WxaInfo wxaInfo = this.f210957l1;
            if (wxaInfo != null) {
                aVar.P = wxaInfo.c();
            }
            if (this.f210978z1) {
                aVar.R = this.A1;
            }
            v17.f(aVar);
            ((ku5.t0) ku5.t0.f312615d).h(new dk5.w1(this, v17, bArr2, str, v17, Li), "MicroMsg.MsgRetransmitUI");
        } else if (v17.f348666i == 33) {
            com.tencent.mm.ui.chatting.a4.c(str, this.B, v17, c01.od.c(((java.util.HashMap) getIntent().getSerializableExtra("appbrand_params")).get("img_url"), null));
        } else {
            com.tencent.mm.ui.chatting.n3.F(this, str, this.f210956i, Li.A0(), this.B);
        }
        return true;
    }

    public final boolean b7(java.lang.String str, boolean z17) {
        if (this.f210954g == null) {
            return false;
        }
        com.tencent.mm.storage.emotion.EmojiInfo N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(this.f210954g);
        long k17 = com.tencent.mm.vfs.w6.k(N == null ? this.f210954g : N.N0());
        java.lang.String N0 = N == null ? this.f210954g : N.N0();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.tencent.mm.sdk.platformtools.x.J(N0, options);
        boolean z18 = options.outHeight > ip.c.c() || options.outWidth > ip.c.c();
        if (k17 > ip.c.a() || z18) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = N == null ? com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME : N.getMd5();
            objArr[1] = java.lang.Integer.valueOf(this.f210960o);
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "emoji is over size. md5:%s size:%d", objArr);
            this.T = false;
            this.f210966s = false;
            db5.e1.y(this, getString(com.tencent.mm.R.string.bvm), "", getString(com.tencent.mm.R.string.f492294fz1), new dk5.e1(this));
            if (this.E == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13459, java.lang.Long.valueOf(k17), 1, N.getMd5(), 1);
            }
            return true;
        }
        if (this.E == 1) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[4];
            objArr2[0] = java.lang.Long.valueOf(k17);
            objArr2[1] = 0;
            objArr2[2] = N == null ? "" : N.getMd5();
            objArr2[3] = 1;
            g0Var.d(13459, objArr2);
        }
        if (!z17) {
            if (N != null && k17 > ip.c.e()) {
                com.tencent.mm.ui.chatting.n3.h(N, str, null);
                return true;
            }
            if (((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).W(this, str, this.f210954g, new com.tencent.mm.plugin.msg.MsgIdTalker(this.f210953f, this.R), 9)) {
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgRetransmitUI", "Retransmit emoji failed.");
            return false;
        }
        if (N == null) {
            N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).J(getApplicationContext(), new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(new com.tencent.mm.opensdk.modelmsg.WXEmojiObject(this.f210954g)), ""));
        }
        if (N != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13459, java.lang.Long.valueOf(k17), 0, N.getMd5(), 2);
            com.tencent.mm.modelmulti.WxaInfo wxaInfo = this.f210957l1;
            if (wxaInfo != null || this.f210978z1) {
                ot0.q qVar = new ot0.q();
                qVar.f348646d = "";
                qVar.H = "";
                qVar.f348706s = 1;
                ot0.a aVar = new ot0.a();
                if (wxaInfo != null) {
                    aVar.P = wxaInfo.c();
                }
                aVar.R = this.A1;
                qVar.f(aVar);
                com.tencent.mm.ui.chatting.n3.h(N, str, qVar);
                if (this.V == 23) {
                    setResult(-1);
                }
            } else {
                com.tencent.mm.ui.chatting.n3.h(N, str, null);
            }
        }
        finish();
        return true;
    }

    public final void c7(java.lang.String str, boolean z17, com.tencent.mm.ui.chatting.w3 w3Var, boolean z18) {
        if ((this.f210972x0.getCount() > 0) && this.f210968u == null) {
            this.f210975y0 = true;
            this.f210968u = db5.e1.Q(com.tencent.mm.sdk.platformtools.x2.f193071a, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, null);
        }
        ((ku5.t0) ku5.t0.f312615d).r(new dk5.t1(this, z17, str, w3Var, z18), "MultiSendMsg");
    }

    public final boolean d7(final java.lang.String str, java.lang.String str2) {
        c01.z1.r();
        if (w11.t1.a(str)) {
            w11.r1 a17 = w11.s1.a(str);
            a17.g(str);
            a17.e(str2);
            a17.h(c01.e2.C(str));
            c01.h7 h7Var = new c01.h7();
            h7Var.f37230e = getIntent().getStringExtra("msg_forward_sns_obj_id");
            h7Var.f37227b = this.f210953f;
            h7Var.f37229d = this.R;
            a17.f(h7Var);
            boolean z17 = this.f210978z1;
            java.lang.String str3 = this.A1;
            a17.f442138m = z17;
            a17.f442139n = str3;
            a17.c(new yz5.l() { // from class: dk5.b1$$b
                @Override // yz5.l
                public final java.lang.Object invoke(java.lang.Object obj) {
                    java.lang.Long l17 = (java.lang.Long) obj;
                    int i17 = com.tencent.mm.ui.transmit.MsgRetransmitUI.H1;
                    com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI = com.tencent.mm.ui.transmit.MsgRetransmitUI.this;
                    msgRetransmitUI.getClass();
                    long longValue = l17.longValue();
                    java.lang.String str4 = str;
                    com.tencent.mm.storage.f9 Li = pt0.f0.Li(str4, longValue);
                    c01.h7 h7Var2 = new c01.h7();
                    h7Var2.f37227b = msgRetransmitUI.f210953f;
                    h7Var2.f37229d = msgRetransmitUI.R;
                    ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).Di(Li, h7Var2);
                    ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).wi();
                    com.tencent.mm.ui.transmit.MsgRetransmitUI.O6(str4, l17);
                    return null;
                }
            });
            return true;
        }
        w11.r1 a18 = w11.s1.a(str);
        a18.g(str);
        a18.e(str2);
        a18.h(c01.e2.C(str));
        a18.f442131f = 0;
        a18.f442134i = 4;
        c01.h7 h7Var2 = new c01.h7();
        h7Var2.f37230e = getIntent().getStringExtra("msg_forward_sns_obj_id");
        h7Var2.f37227b = this.f210953f;
        h7Var2.f37229d = this.R;
        a18.f(h7Var2);
        boolean z18 = this.f210978z1;
        java.lang.String str4 = this.A1;
        a18.f442138m = z18;
        a18.f442139n = str4;
        w11.n1 a19 = a18.a();
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, a19.f442096b);
        c01.h7 h7Var3 = new c01.h7();
        h7Var3.f37227b = this.f210953f;
        h7Var3.f37229d = this.R;
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).Di(Li, h7Var3);
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).wi();
        a19.a();
        P6(a19);
        return true;
    }

    public final void e7(java.lang.String str, ot0.q qVar, byte[] bArr, com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.pluginsdk.model.app.d h17 = com.tencent.mm.pluginsdk.model.app.k0.h(qVar.f348694p);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(qVar.A)) {
            h17 = com.tencent.mm.pluginsdk.model.app.k0.o(f9Var, qVar.f348694p);
        }
        com.tencent.mm.pluginsdk.model.app.d dVar = h17;
        if (dVar == null || (str4 = dVar.field_fileFullPath) == null || str4.equals("")) {
            str2 = "";
        } else {
            if (ez.v0.f257777a.j(java.lang.Integer.valueOf(qVar.f348666i))) {
                ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).cj(f9Var.getMsgId(), f9Var.Q0());
            }
            java.lang.String f17 = com.tencent.mm.pluginsdk.model.app.k0.f(com.tencent.mm.pluginsdk.model.app.k0.k(), qVar.n(), qVar.f348690o);
            int i17 = j62.e.g().i("clicfg_attachment_retransmit_copy_link", 1, false, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "copyFile, status = " + dVar.field_status + ", linkExpt = " + i17);
            if (i17 == 0) {
                com.tencent.mm.vfs.w6.c(dVar.field_fileFullPath, f17);
            } else if (dVar.field_status == 199) {
                com.tencent.mm.vfs.w6.d(dVar.field_fileFullPath, f17, true);
            } else {
                com.tencent.mm.vfs.w6.c(dVar.field_fileFullPath, f17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "summerbig send old path[%s], title[%s] attachPath[%s]， finish[%b]", dVar.field_fileFullPath, qVar.n(), f17, java.lang.Boolean.valueOf(dVar.t0()));
            str2 = f17;
        }
        ot0.q i18 = ot0.q.i(qVar);
        i18.f348706s = 3;
        if (f9Var != null && ez.v0.f257777a.j(java.lang.Integer.valueOf(qVar.f348666i)) && !com.tencent.mm.sdk.platformtools.t8.K0(qVar.A)) {
            ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).cj(f9Var.getMsgId(), f9Var.Q0());
            if (dVar != null && (!com.tencent.mm.vfs.w6.j(dVar.field_fileFullPath) || com.tencent.mm.vfs.w6.k(dVar.field_fileFullPath) != dVar.field_totalLen)) {
                dn.m mVar = new dn.m();
                mVar.f241785d = "task_MsgRetransmitUI_1";
                mVar.f241787f = new dk5.d1(this, dVar, str2, f9Var, i18, str, bArr);
                mVar.field_mediaId = com.tencent.mm.modelcdntran.i2.b("checkExist", java.lang.System.currentTimeMillis(), f9Var.Q0(), "" + f9Var.getMsgId());
                mVar.field_aesKey = i18.T;
                mVar.field_fileType = 19;
                mVar.field_authKey = i18.E;
                mVar.f241811z = i18.A;
                mVar.field_fullpath = str2;
                if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar)) {
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgRetransmitUI", "openim attach download failed before rescend");
                return;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) && ((qVar.f348714u != 0 || qVar.f348682m > 26214400) && ((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).bj())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "summerbig send attachPath is null islargefilemsg[%d], attachlen[%d]", java.lang.Integer.valueOf(qVar.f348714u), java.lang.Long.valueOf(qVar.f348682m));
            c01.d9.e().g(new g35.e(qVar, null, str, new dk5.c1(this, qVar, i18, str, bArr)));
            return;
        }
        if (com.tencent.mm.storage.z3.L4(str) && f9Var != null && this.f210953f > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "sendAppMsg: claw user with newSendUrl type=%d forwardMsgId:%d, converting to text", java.lang.Integer.valueOf(i18.f348666i), java.lang.Long.valueOf(this.f210953f));
            qx.d0 d0Var = (qx.d0) i95.n0.c(qx.d0.class);
            java.lang.String str5 = this.R;
            long j17 = this.f210953f;
            java.lang.String str6 = i18.f348654f;
            ((px.a) d0Var).Ni(str, str5, j17, str6 == null ? "" : str6);
            return;
        }
        if (f9Var != null) {
            if (((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).sj(i18.f348666i, str)) {
                l15.c cVar = new l15.c();
                cVar.fromXml(ot0.q.u(qVar, null, null));
                av.b bVar = new av.b(str, cVar, bArr);
                p15.e eVar = new p15.e();
                eVar.fromXml(f9Var.G);
                bVar.f412183e = eVar;
                bVar.f412187i = this.I;
                c01.h7 h7Var = new c01.h7();
                h7Var.f37227b = this.f210953f;
                h7Var.f37229d = this.R;
                h7Var.f37230e = getIntent().getStringExtra("msg_forward_sns_obj_id");
                bVar.f412182d = h7Var;
                ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).getClass();
                ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).uj(new av.a(bVar));
                return;
            }
        }
        if ("wxid_wi_1d142z0zdj03".equals(str) && i18.f348666i == 33) {
            ot0.a aVar = (ot0.a) i18.y(ot0.a.class);
            if (aVar == null || com.tencent.mm.sdk.platformtools.t8.K0(i18.f348677k2)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MsgRetransmitUI", "sendAppMsg to yuanbao appId:%s piece is null", i18.f348677k2);
            } else {
                com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.c0 Ai = ((com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p) ((com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.b0) i95.n0.c(com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.b0.class))).Ai(i18.f348677k2);
                if (Ai == null || !Ai.f80292a) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MsgRetransmitUI", "sendAppMsg to yuanbao appId:%s result is null", i18.f348677k2);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "sendAppMsg to yuanbao appId:%s result:%s", i18.f348677k2, Ai);
                    aVar.S = Ai.f80294c;
                    aVar.T = Ai.f80295d;
                }
            }
        }
        str3 = "";
        java.lang.Object obj = com.tencent.mm.pluginsdk.model.app.k0.K(i18, qVar.f348646d, qVar.H, str, str2, bArr, this.I, "", c01.ia.v(f9Var.G), new com.tencent.mm.plugin.msg.MsgIdTalker(this.f210953f, this.R)).second;
        if (obj != null) {
            O6(str, (java.lang.Long) obj);
        }
        if (i18.f348666i == 36) {
            boolean endsWith = str.endsWith("chatroom");
            java.lang.String str7 = i18.f348674k;
            if (str7 == null) {
                str7 = str3;
            }
            java.lang.String encode = java.net.URLEncoder.encode(str7);
            java.lang.String str8 = i18.f348654f;
            if (str8 == null) {
                str8 = str3;
            }
            java.lang.String encode2 = java.net.URLEncoder.encode(str8);
            java.lang.String str9 = i18.f348658g;
            if (str9 == null) {
                str9 = str3;
            }
            java.lang.String encode3 = java.net.URLEncoder.encode(str9);
            java.lang.String str10 = i18.f348669i2;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14127, i18.f348646d, i18.f348673j2, java.net.URLEncoder.encode(str10 != null ? str10 : ""), encode2, encode3, "", encode, 0, 1, 1, java.lang.Integer.valueOf(endsWith ? 1 : 0), str, 1, qVar.f348689n2, "");
        }
    }

    public final void f7(java.lang.String str, java.util.List list) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.util.HashMap a17 = com.tencent.mm.ui.i1.a(str);
        if (list.size() > 0) {
            java.lang.String str2 = (java.lang.String) list.get(0);
            boolean R4 = com.tencent.mm.storage.z3.R4(str2);
            if (list.size() != 1 || !R4 || a17 == null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it.next();
                    com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
                    am.mt mtVar = sendMsgEvent.f54752g;
                    mtVar.f7362a = str3;
                    mtVar.f7363b = str;
                    mtVar.f7364c = c01.e2.C(str3);
                    mtVar.f7365d = 0;
                    sendMsgEvent.e();
                }
                return;
            }
            if (w11.t1.a(str2)) {
                w11.r1 a18 = w11.s1.a(str2);
                a18.e(str);
                a18.h(c01.e2.C(str2));
                a18.f442131f = 1;
                a18.f442133h = a17;
                a18.b();
                return;
            }
            w11.r1 a19 = w11.s1.a(str2);
            a19.g(str2);
            a19.e(str);
            a19.h(c01.e2.C(str2));
            a19.f442131f = 1;
            a19.f442133h = a17;
            a19.f442134i = 5;
            a19.a().a();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void g7(android.content.Intent intent, java.lang.String str) {
        if (!this.f210977z) {
            h7(str);
            return;
        }
        this.f210974y.size();
        java.util.ArrayList parcelableArrayList = intent.getExtras().getParcelableArrayList("android.intent.extra.STREAM");
        if (parcelableArrayList == null || parcelableArrayList.size() <= 0) {
            finish();
            return;
        }
        java.util.Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            if (this.C1) {
                return;
            } else {
                h7(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        if (r11.f210954g.startsWith(com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir().getAbsolutePath() + "/share_img_tmp_") != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h7(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r0 = "sendMultiVideo"
            java.lang.String r1 = "MicroMsg.MsgRetransmitUI"
            com.tencent.mars.xlog.Log.i(r1, r0)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r2 = "KISFileFromCopyTmpPath"
            r3 = 0
            boolean r0 = r0.getBooleanExtra(r2, r3)
            if (r0 == 0) goto L59
            java.lang.String r0 = r11.f210954g
            java.lang.String r2 = zo3.p.Vi()
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L43
            java.lang.String r0 = r11.f210954g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.io.File r3 = r3.getCacheDir()
            java.lang.String r3 = r3.getAbsolutePath()
            r2.append(r3)
            java.lang.String r3 = "/share_img_tmp_"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L59
        L43:
            java.lang.String r0 = r11.f210954g
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "sendMultiVideo, fileName is from shareImgTmpPath:%s"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r1 = "ImportVideoTempPath"
            java.lang.String r2 = r11.f210954g
            r0.putExtra(r1, r2)
        L59:
            com.tencent.mm.pluginsdk.model.c3 r0 = new com.tencent.mm.pluginsdk.model.c3
            r5 = 0
            android.content.Intent r6 = r11.getIntent()
            r8 = 1
            dk5.g1 r9 = new dk5.g1
            r9.<init>(r11)
            r10 = 0
            r3 = r0
            r4 = r11
            r7 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            ku5.u0 r12 = ku5.t0.f312615d
            ku5.t0 r12 = (ku5.t0) r12
            r12.g(r0)
            r12 = 2131756315(0x7f10051b, float:1.9143534E38)
            java.lang.String r2 = r11.getString(r12)
            r12 = 2131756354(0x7f100542, float:1.9143613E38)
            java.lang.String r3 = r11.getString(r12)
            r4 = 1
            r5 = 1
            dk5.h1 r6 = new dk5.h1
            r6.<init>(r11, r0)
            r1 = r11
            com.tencent.mm.ui.widget.dialog.u3 r12 = db5.e1.Q(r1, r2, r3, r4, r5, r6)
            r11.f210967t = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.transmit.MsgRetransmitUI.h7(java.lang.String):void");
    }

    public final void i7(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "transferVideo originFullPath = " + str + ", outputFullPath = " + str2);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.modelcontrol.VideoTransPara b17 = com.tencent.mm.pluginsdk.model.c3.b(str, pInt, new com.tencent.mm.pluginsdk.model.z2(), null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "transferVideo, checkRet = " + pInt.value);
        int i17 = pInt.value;
        if (i17 == 1) {
            com.tencent.mm.vfs.w6.d(str, str2, true);
        } else if (i17 == 0) {
            com.tencent.mm.pluginsdk.model.f3.b(str, str2, b17, false, null);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "transferVideo done, duration = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).wi();
        }
        java.lang.String str3 = "";
        if (intent != null) {
            str = intent.getStringExtra("custom_send_text");
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                this.f210955h = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
            }
        } else {
            str = "";
        }
        if (this.U) {
            a14.g a17 = a14.g.a();
            java.util.List list = this.f210955h;
            a17.getClass();
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(list, ";");
            com.tencent.mm.autogen.mmdata.rpt.MultiMessageForwardStruct multiMessageForwardStruct = a17.f609a;
            multiMessageForwardStruct.f59347j = multiMessageForwardStruct.b("ToUsername", c17, true);
            a14.g.a().f609a.f59343f = com.tencent.mm.sdk.platformtools.t8.K0(str) ? 2L : 1L;
        }
        if (i18 == -1) {
            if (i17 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgRetransmitUI", "onActivityResult, unknown requestCode = " + i17);
                return;
            }
            if (intent.getBooleanExtra("key_is_biz_chat", false)) {
                intent.getLongExtra("key_biz_chat_id", -1L);
            }
            int intExtra = intent.getIntExtra("Retr_Msg_Type", -1);
            if (intExtra != -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "summerbig replace msgType %d->%d", java.lang.Integer.valueOf(this.f210952e), java.lang.Integer.valueOf(intExtra));
                this.f210952e = intExtra;
            }
            this.Y = intent.getBooleanExtra("KSendGroupToDo", false);
            intent.getIntExtra("KShowTodoIntroduceView", 0);
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(this.f210952e);
            objArr[1] = java.lang.Integer.valueOf(this.f210971x);
            objArr[2] = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.L0(this.f210955h) ? 0 : ((java.util.ArrayList) this.f210955h).size());
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "summersafecdn onActivityResult doRetransmit msgType[%d], iScene[%d], size[%d]", objArr);
            int i19 = this.f210952e;
            java.lang.String msgContent = this.f210956i;
            vg3.l4 l4Var = (vg3.l4) ((com.tencent.mm.plugin.messenger.foundation.k2) ((vg3.b4) i95.n0.c(vg3.b4.class))).f148689d.get(java.lang.Integer.valueOf(i19));
            if (l4Var != null) {
                com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.f490604zq), true, 3, null);
                java.lang.String toUserName = (java.lang.String) ((java.util.ArrayList) this.f210955h).get(0);
                dk5.q1 q1Var = new dk5.q1(this, f17);
                kotlin.jvm.internal.o.g(toUserName, "toUserName");
                kotlin.jvm.internal.o.g(msgContent, "msgContent");
                ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Ui(toUserName, msgContent, new c61.l6(q1Var)).l();
            }
            if (l4Var != null) {
                return;
            }
            U6(str);
            f7(str, this.f210955h);
            if (this.U) {
                a14.g a18 = a14.g.a();
                a18.c(1);
                com.tencent.mm.autogen.mmdata.rpt.MultiMessageForwardStruct multiMessageForwardStruct2 = a18.f609a;
                multiMessageForwardStruct2.f59346i = 1L;
                multiMessageForwardStruct2.n();
                multiMessageForwardStruct2.k();
                return;
            }
            return;
        }
        java.lang.String str4 = this.f210956i;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        ot0.q v17 = ot0.q.v(str4);
        if (v17 != null && v17.f348666i == 5 && (str2 = v17.f348674k) != null) {
            try {
                str3 = java.net.URLEncoder.encode(str2, com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgRetransmitUI", e17, "", new java.lang.Object[0]);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13378, str3, java.lang.Long.valueOf(this.P), java.lang.Integer.valueOf(this.N), 1, 3);
        } else if (v17 != null && v17.f348666i == 33) {
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent appBrandOuterMenuClickReportEvent = new com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent();
            am.w wVar = appBrandOuterMenuClickReportEvent.f53983g;
            wVar.getClass();
            int i27 = this.S;
            wVar.f8235d = i27;
            if (2 == i27) {
                wVar.f8237f = this.R + ":" + this.Q;
            } else {
                wVar.f8237f = this.R;
            }
            wVar.f8236e = v17.f348737z2 + 1;
            wVar.f8238g = v17.f348669i2;
            wVar.f8232a = v17.f348673j2;
            wVar.f8233b = v17.f348677k2;
            wVar.f8234c = v17.A2;
            wVar.f8239h = 1;
            wVar.f8240i = "";
            wVar.f8241j = com.tencent.mm.sdk.platformtools.t8.i1();
            wVar.f8242k = 3;
            wVar.f8243l = v17.f348689n2;
            appBrandOuterMenuClickReportEvent.e();
        }
        if (this.U) {
            a14.g.a().b();
        }
        if (this.D1) {
            com.tencent.mm.plugin.appbrand.service.e5 e5Var = (com.tencent.mm.plugin.appbrand.service.e5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.e5.class);
            java.lang.String userName = gm0.j1.b().k();
            ((com.tencent.mm.plugin.appbrand.report.h0) e5Var).getClass();
            kotlin.jvm.internal.o.g(userName, "userName");
            com.tencent.mm.autogen.mmdata.rpt.AppMsgImageShareStruct appMsgImageShareStruct = new com.tencent.mm.autogen.mmdata.rpt.AppMsgImageShareStruct();
            appMsgImageShareStruct.f55298d = appMsgImageShareStruct.b("Username", userName, true);
            appMsgImageShareStruct.f55299e = 0;
            appMsgImageShareStruct.k();
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0872  */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r31) {
        /*
            Method dump skipped, instructions count: 2332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.transmit.MsgRetransmitUI.onCreate(android.os.Bundle):void");
    }
}
