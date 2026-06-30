package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class fy extends com.tencent.mm.plugin.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.opensdk.modelmsg.WXMediaMessage f168372g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f168373h;

    /* renamed from: i, reason: collision with root package name */
    public r45.zs4 f168374i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.ting.widget.MusicView f168375j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f168376k;

    /* renamed from: l, reason: collision with root package name */
    public m21.r f168377l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f168378m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f168379n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f168380o;

    /* renamed from: p, reason: collision with root package name */
    public int f168381p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f168382q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f168383r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f168384s;

    /* renamed from: t, reason: collision with root package name */
    public m21.w f168385t;

    /* renamed from: u, reason: collision with root package name */
    public int f168386u;

    /* renamed from: v, reason: collision with root package name */
    public int f168387v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f168388w;

    /* renamed from: x, reason: collision with root package name */
    public int f168389x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f168390y;

    public fy(com.tencent.mm.ui.MMActivity mMActivity) {
        super(mMActivity);
        this.f168372g = null;
        this.f168380o = "";
        this.f168381p = 0;
        this.f168382q = "";
        this.f168383r = false;
        this.f168384s = false;
        this.f168385t = null;
        this.f168387v = 1;
        this.f168388w = "";
        this.f168389x = -1;
        this.f168390y = false;
    }

    public static void o(com.tencent.mm.plugin.sns.ui.fy fyVar, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        fyVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateThumbData", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        byte[] N = com.tencent.mm.vfs.w6.N(str, 0, -1);
        if (N != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingMusicWidget", "updateThumbData replace msg.thumbData, size: %s", java.lang.Integer.valueOf(N.length));
            fyVar.f168372g.thumbData = N;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateThumbData", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f169957c).inflate(com.tencent.mm.R.layout.csk, (android.view.ViewGroup) null);
        this.f168373h = inflate;
        com.tencent.mm.plugin.ting.widget.MusicView musicView = (com.tencent.mm.plugin.ting.widget.MusicView) inflate.findViewById(com.tencent.mm.R.id.qap);
        this.f168375j = musicView;
        this.f168376k = musicView.getMusicCover();
        q();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateMusicCover", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        byte[] bArr = this.f168372g.thumbData;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f168378m)) {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).bj(this.f168378m, this.f168376k, new com.tencent.mm.plugin.sns.ui.cy(this));
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Bi(this.f168378m, new com.tencent.mm.plugin.sns.ui.dy(this));
        } else if (this.f168372g.thumbData != null) {
            this.f168374i.f392353h = new com.tencent.mm.protobuf.g(this.f168372g.thumbData);
            q();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMusicCover", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        android.view.View view = this.f168373h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        return view;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, java.lang.String str2, int i27, int i28) {
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.plugin.sns.ui.fy fyVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        if (this.f168372g.thumbData != null) {
            p(i17, iVar, str, list, ed4Var, linkedList, i19, z17, list2, pInt, i27, i28);
            com.tencent.mm.plugin.sns.model.l4.Nj().d();
            str4 = "com.tencent.mm.plugin.sns.ui.TingMusicWidget";
            fyVar = this;
            str3 = "commit";
        } else {
            str3 = "commit";
            str4 = "com.tencent.mm.plugin.sns.ui.TingMusicWidget";
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Bi(this.f168378m, new com.tencent.mm.plugin.sns.ui.ey(this, i17, iVar, str, list, ed4Var, linkedList, i19, z17, list2, pInt, i27, i28));
            fyVar = this;
        }
        fyVar.f169957c.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str4);
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        super.e();
        this.f168390y = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        super.i(bundle);
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        this.f168372g = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req(mMActivity.getIntent().getBundleExtra("Ksnsupload_timeline")).message;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initMusicViewData", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        if (this.f168374i == null) {
            ((if0.w) ((ff0.q) i95.n0.c(ff0.q.class))).getClass();
            this.f168374i = new r45.zs4();
        }
        r45.zs4 zs4Var = this.f168374i;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = this.f168372g;
        zs4Var.f392349d = wXMediaMessage.title;
        zs4Var.f392350e = wXMediaMessage.description;
        zs4Var.f392353h = null;
        zs4Var.f392352g = "";
        zs4Var.f392351f = "";
        zs4Var.f392355m = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initMusicViewData", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("Ksnsupload_music_share_object_xml");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d("<msg>" + stringExtra + "</msg>", "msg", null);
            if (d17 != null) {
                m21.r rVar = new m21.r();
                this.f168377l = rVar;
                rVar.f322999a = zy2.pc.b(".msg", d17);
            }
        }
        if (this.f168377l == null) {
            this.f168377l = new m21.r();
        }
        if (this.f168372g.getType() == 76) {
            this.f168378m = mMActivity.getIntent().getStringExtra("music_mv_cover_url");
            com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject wXMusicVideoObject = (com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject) this.f168372g.mediaObject;
            if (wXMusicVideoObject != null) {
                this.f168379n = wXMusicVideoObject.songLyric;
                this.f168377l.f322999a.set(4, wXMusicVideoObject.singerName);
                this.f168377l.f322999a.set(5, wXMusicVideoObject.albumName);
                this.f168377l.f322999a.set(7, wXMusicVideoObject.musicGenre);
                this.f168377l.f322999a.set(8, java.lang.Long.valueOf(wXMusicVideoObject.issueDate));
                this.f168377l.f322999a.set(9, wXMusicVideoObject.identification);
                this.f168377l.f322999a.set(10, java.lang.Integer.valueOf(wXMusicVideoObject.duration));
                this.f168377l.f322999a.set(6, this.f168372g.messageExt);
                this.f168377l.f322999a.set(12, wXMusicVideoObject.musicOperationUrl);
                r45.xs4 xs4Var = this.f168377l.f322999a;
                com.tencent.mm.opensdk.modelmsg.WXMusicVipInfo wXMusicVipInfo = wXMusicVideoObject.musicVipInfo;
                xs4Var.set(11, wXMusicVipInfo != null ? b21.m.e(wXMusicVipInfo.musicId) : "");
            }
        } else if (this.f168372g.getType() == 3) {
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage2 = this.f168372g;
            com.tencent.mm.opensdk.modelmsg.WXMusicObject wXMusicObject = (com.tencent.mm.opensdk.modelmsg.WXMusicObject) wXMediaMessage2.mediaObject;
            if (wXMusicObject != null) {
                this.f168379n = wXMusicObject.songLyric;
                this.f168378m = wXMusicObject.songAlbumUrl;
                this.f168377l.f322999a.set(6, wXMediaMessage2.messageExt);
            }
        }
        r45.xs4 xs4Var2 = this.f168377l.f322999a;
        if (xs4Var2 != null) {
            this.f168374i.f392358p = il4.l.g(xs4Var2.getInteger(18));
        }
        this.f168385t = m21.w.f(mMActivity.getIntent());
        java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("Ksnsupload_appid");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f168380o = stringExtra2;
        java.lang.String stringExtra3 = mMActivity.getIntent().getStringExtra("Ksnsupload_appname");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f168382q = stringExtra3;
        this.f168383r = mMActivity.getIntent().getBooleanExtra("KThrid_app", false);
        this.f168381p = mMActivity.getIntent().getIntExtra("Ksnsupload_isHidden", 0);
        this.f168384s = mMActivity.getIntent().getBooleanExtra("KSnsAction", false);
        this.f168386u = mMActivity.getIntent().getIntExtra("Ksnsupload_source", 0);
        if (mMActivity.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f168387v = 1;
        } else {
            this.f168387v = 0;
        }
        java.lang.String stringExtra4 = mMActivity.getIntent().getStringExtra("SendAppMessageWrapper_PkgName");
        this.f168388w = stringExtra4 != null ? stringExtra4 : "";
        int intExtra = mMActivity.getIntent().getIntExtra("Ksnsupload_type", -1);
        this.f168389x = intExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMusicWidget", "TingMusicWidget.onCreate snsUploadType: %s, appId: %s, albumCoverUrl: %s", java.lang.Integer.valueOf(intExtra), this.f168380o, this.f168378m);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(int r24, l56.i r25, java.lang.String r26, java.util.List r27, r45.ed4 r28, java.util.LinkedList r29, int r30, boolean r31, java.util.List r32, com.tencent.mm.pointers.PInt r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.fy.p(int, l56.i, java.lang.String, java.util.List, r45.ed4, java.util.LinkedList, int, boolean, java.util.List, com.tencent.mm.pointers.PInt, int, int):boolean");
    }

    public final void q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateMusicView", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        this.f168375j.c(this.f168374i);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMusicView", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
    }
}
