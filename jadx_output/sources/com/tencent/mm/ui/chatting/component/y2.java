package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.p.class)
/* loaded from: classes5.dex */
public class y2 extends com.tencent.mm.ui.chatting.component.a implements sb5.p {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f200268e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f200269f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f200270g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f200272i;

    /* renamed from: h, reason: collision with root package name */
    public boolean f200271h = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f200273m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f200274n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f200275o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f200276p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f200277q = "";

    /* renamed from: r, reason: collision with root package name */
    public int f200278r = 0;

    /* renamed from: s, reason: collision with root package name */
    public volatile int f200279s = 1;

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "reset");
        this.f200272i = null;
        this.f200270g = null;
        this.f200269f = null;
        ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
        com.tencent.mm.pluginsdk.ui.tools.p0.b("", "");
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        m0();
    }

    @Override // yn.d
    public void R(android.content.res.Configuration configuration) {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        m0();
        lt.n0 n0Var = (lt.n0) i95.n0.c(lt.n0.class);
        java.lang.String str = this.f200270g;
        java.lang.String str2 = this.f200272i;
        ((kt.g) n0Var).getClass();
        com.tencent.mm.pluginsdk.ui.tools.p0.b(str, str2);
    }

    public final void m0() {
        if (this.f200268e == null) {
            try {
                this.f200268e = this.f198580d.f460717l.getBooleanExtra("key_biz_half_screen_chat_style", false);
                java.lang.String stringExtra = this.f198580d.f460717l.getStringExtra("key_biz_half_screen_chat_refer_info");
                this.f200269f = stringExtra;
                if (stringExtra == null) {
                    this.f200269f = "";
                }
                s0();
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "checkAndInitBizHalfScreenChattingStyle mIsBizHalfScreenStyle: %s, mReferInfo:%s", this.f200268e, this.f200269f);
            } catch (java.lang.Exception e17) {
                this.f200268e = java.lang.Boolean.FALSE;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", e17, "checkAndInitBizHalfScreenChattingStyle", new java.lang.Object[0]);
            }
        }
        this.f200273m = this.f198580d.f460717l.getBooleanExtra("key_template_history_msg", false).booleanValue();
    }

    public void n0() {
        m0();
        if (this.f200268e.booleanValue()) {
            ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
            com.tencent.mm.pluginsdk.ui.tools.p0.a();
        }
    }

    public final int o0(cl0.g gVar, java.lang.String str) {
        int i17 = 0;
        if (gVar == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "getJsonIntValue param is illegal:" + str);
            return 0;
        }
        try {
            i17 = java.lang.Integer.parseInt(gVar.optString(str));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", e17, "getJsonIntValue", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "getJsonIntValue key:" + str + ", value:" + i17);
        return i17;
    }

    public final java.lang.String p0(cl0.g gVar, java.lang.String str) {
        if (gVar == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "getJsonStringValue param is illegal:" + str);
            return "";
        }
        java.lang.String optString = gVar.optString(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "getJsonStringValue key:" + str + ", value:" + optString);
        return optString;
    }

    public int q0() {
        m0();
        if (!this.f200268e.booleanValue()) {
            return 0;
        }
        ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
        com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.pluginsdk.ui.tools.p0.f191821a;
        return i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 80) + com.tencent.mm.ui.bl.i(this.f198580d.g(), 0);
    }

    public long r0() {
        m0();
        if (!this.f200268e.booleanValue() || this.f200279s == 3) {
            return 0L;
        }
        lt.n0 n0Var = (lt.n0) i95.n0.c(lt.n0.class);
        java.lang.String articleIdentity = this.f200270g;
        ((kt.g) n0Var).getClass();
        com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.pluginsdk.ui.tools.p0.f191821a;
        kotlin.jvm.internal.o.g(articleIdentity, "articleIdentity");
        try {
            java.lang.String str = "late" + com.tencent.mm.pluginsdk.ui.tools.p0.f191822b;
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = com.tencent.mm.pluginsdk.ui.tools.p0.f191821a;
            long j17 = o4Var2 != null ? o4Var2.getLong(str, 0L) : 0L;
            if (j17 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizHalfScreenChattingUtil", "getMsgFoldTime latestTime == 0 fold all msg  articleIdentity:".concat(articleIdentity));
            } else {
                long a17 = c01.id.a();
                if (a17 - j17 <= 86400000) {
                    java.lang.String str2 = "early" + com.tencent.mm.pluginsdk.ui.tools.p0.f191822b;
                    com.tencent.mm.sdk.platformtools.o4 o4Var3 = com.tencent.mm.pluginsdk.ui.tools.p0.f191821a;
                    long j18 = (a17 - (o4Var3 != null ? o4Var3.getLong(str2, 0L) : 0L)) + 100;
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizHalfScreenChattingUtil", "getMsgFoldTime  articleIdentity:" + articleIdentity + "  result:" + j18);
                    return j18;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BizHalfScreenChattingUtil", "getMsgFoldTime fold all msg  articleIdentity:".concat(articleIdentity));
            }
            return 10L;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizHalfScreenChattingUtil", e17, "getMsgFoldTime", new java.lang.Object[0]);
            return 0L;
        }
    }

    public final void s0() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f200269f)) {
            return;
        }
        try {
            cl0.g gVar = new cl0.g(this.f200269f);
            java.lang.String p07 = p0(gVar, "biz");
            java.lang.String p08 = p0(gVar, "mid");
            java.lang.String p09 = p0(gVar, "idx");
            this.f200278r = o0(gVar, "itemShowType");
            this.f200274n = p0(gVar, "pageUrl");
            this.f200275o = p0(gVar, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            this.f200276p = p0(gVar, "desc");
            this.f200277q = p0(gVar, "cover");
            this.f200270g = p07 + p08 + p09 + this.f200278r;
            this.f200272i = "<mppageidentity><bizid>" + p07 + "</bizid><mid>" + p08 + "</mid><idx>" + p09 + "</idx><itemshowtype>" + this.f200278r + "</itemshowtype></mppageidentity>";
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", e17, "", new java.lang.Object[0]);
            this.f200270g = "";
            this.f200272i = "";
        }
    }

    public boolean t0() {
        m0();
        return this.f200268e.booleanValue();
    }

    public void u0(boolean z17) {
        m0();
        if (this.f200268e.booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "showMoreMsgHeader show:%b, moreMsgHeaderState:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f200279s));
            if (z17 && this.f200279s == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "showMoreMsgHeader do add Header");
                android.view.View inflate = com.tencent.mm.ui.id.b(this.f198580d.g()).inflate(com.tencent.mm.R.layout.f488579xt, (android.view.ViewGroup) null);
                inflate.setOnClickListener(new com.tencent.mm.ui.chatting.component.w2(this, inflate));
                ((com.tencent.mm.ui.chatting.BaseChattingUIFragment) this.f198580d.f460718m).C0().addHeaderView(inflate);
                this.f200279s = 2;
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        m0();
        if (this.f200268e.booleanValue()) {
            lt.n0 n0Var = (lt.n0) i95.n0.c(lt.n0.class);
            java.lang.String str = this.f200270g;
            java.lang.String str2 = this.f200272i;
            ((kt.g) n0Var).getClass();
            com.tencent.mm.pluginsdk.ui.tools.p0.b(str, str2);
        }
    }
}
