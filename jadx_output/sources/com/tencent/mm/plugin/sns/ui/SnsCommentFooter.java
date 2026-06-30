package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsCommentFooter extends com.tencent.mm.ui.widget.InputPanelLinearLayout implements p94.u0 {
    public static java.lang.String I1;
    public int A;
    public java.lang.String A1;
    public int B;
    public java.util.List B1;
    public int C;
    public boolean C1;
    public java.lang.String D;
    public boolean D1;
    public com.tencent.mm.plugin.sns.storage.SnsInfo E;
    public final android.text.TextWatcher E1;
    public ta4.x0 F;
    public com.tencent.mm.plugin.sns.ui.cg F1;
    public boolean G;
    public com.tencent.mm.plugin.sns.ui.eg G1;
    public com.tencent.mm.ui.widget.imageview.WeImageButton H;
    public com.tencent.mm.plugin.sns.ui.zx H1;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f167089J;
    public android.view.View K;
    public android.view.View L;
    public android.view.View M;
    public android.widget.ImageView N;
    public android.view.View P;
    public android.widget.ImageView Q;
    public android.view.View R;
    public zb4.a S;
    public final bc4.d T;
    public boolean U;
    public java.util.Map V;
    public android.view.View W;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f167090g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageButton f167091h;

    /* renamed from: i, reason: collision with root package name */
    public fl5.i f167092i;

    /* renamed from: l1, reason: collision with root package name */
    public final android.view.inputmethod.InputMethodManager f167093l1;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f167094m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f167095n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f167096o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f167097p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f167098p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f167099p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f167100q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel f167101r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f167102s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget f167103t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f167104u;

    /* renamed from: v, reason: collision with root package name */
    public r45.e86 f167105v;

    /* renamed from: w, reason: collision with root package name */
    public int f167106w;

    /* renamed from: x, reason: collision with root package name */
    public int f167107x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f167108x0;

    /* renamed from: x1, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.o4 f167109x1;

    /* renamed from: y, reason: collision with root package name */
    public int f167110y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f167111y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f167112y1;

    /* renamed from: z, reason: collision with root package name */
    public int f167113z;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f167114z1;

    static {
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        I1 = o13.n.l(79);
    }

    public SnsCommentFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f167105v = null;
        this.f167106w = 0;
        this.f167107x = 0;
        this.f167110y = -1;
        this.f167113z = -1;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        com.tencent.mm.sdk.platformtools.d2.j(getContext());
        this.G = false;
        this.I = false;
        this.f167089J = false;
        this.S = new zb4.a();
        this.T = new bc4.d();
        this.U = false;
        this.V = new java.util.HashMap();
        this.f167098p0 = false;
        this.f167108x0 = true;
        this.f167111y0 = false;
        this.f167099p1 = false;
        this.f167112y1 = "";
        this.A1 = "";
        this.C1 = false;
        this.D1 = true;
        this.E1 = new com.tencent.mm.plugin.sns.ui.wf(this);
        this.f167090g = (com.tencent.mm.ui.MMActivity) context;
        this.F = ta4.x0.f416851j.b();
        this.f167093l1 = (android.view.inputmethod.InputMethodManager) context.getSystemService("input_method");
    }

    public static void I(android.content.Context context, java.lang.Object obj, boolean z17, java.lang.String str, int i17, java.lang.String str2, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportInputMenu", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (!(obj instanceof com.tencent.mm.plugin.sns.storage.SnsInfo)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportInputMenu", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        ((sg0.c2) ((tg0.n1) i95.n0.c(tg0.n1.class))).wi(null, z17 ? 3 : 2, context instanceof com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI ? 3 : context instanceof com.tencent.mm.plugin.sns.ui.SnsCommentUI ? 2 : 1, snsInfo.field_userName, ca4.z0.t0(snsInfo.field_snsId), snsInfo.isAd() ? 2 : snsInfo.isWxWork() ? 3 : 1, java.lang.String.valueOf(str), I1, i17, str2, j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportInputMenu", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public static /* synthetic */ jz5.f0 f(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter, java.lang.String str, java.lang.String str2) {
        snsCommentFooter.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$getEmoticonThumbImageTask$7", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        java.lang.String currentEmojiMd5 = snsCommentFooter.getCurrentEmojiMd5();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "emoticon load success md5: %s currentMd5: %s", str, currentEmojiMd5);
        if (currentEmojiMd5.equals(str)) {
            android.widget.ImageView imageView = snsCommentFooter.Q;
            bc4.d dVar = snsCommentFooter.T;
            dVar.b(imageView, str2);
            snsCommentFooter.S.h(dVar.a(str2));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$getEmoticonThumbImageTask$7", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return null;
    }

    public static /* synthetic */ jz5.f0 g(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter, java.lang.String str) {
        snsCommentFooter.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$getEmoticonThumbImageTask$8", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "emoticon load failed md5: %s currentMd5: %s", str, snsCommentFooter.getCurrentEmojiMd5());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$getEmoticonThumbImageTask$8", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return null;
    }

    private java.lang.String getCurrentEmojiMd5() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentEmojiMd5", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (this.S.a() != 1 || this.S.b() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentEmojiMd5", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return "";
        }
        java.lang.String md52 = this.S.b().getMd5();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentEmojiMd5", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return md52;
    }

    private long getImeSupportFileAbility() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImeSupportFileAbility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImeSupportFileAbility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return 7L;
    }

    private long getImeSupportIdentityAbility() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImeSupportIdentityAbility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImeSupportIdentityAbility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return 7L;
    }

    private int getSmilePanelHeight() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSmilePanelHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        int max = (this.I && this.f167098p0) ? java.lang.Math.max(qk.w9.a(getContext()), this.A) : this.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSmilePanelHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return max;
    }

    private java.lang.String getSmileyInitTab() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSmileyInitTab", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f167109x1;
        if (o4Var != null) {
            java.lang.String u17 = o4Var.u("smiley_panel_tab", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "getSmileyInitTab >> cacheTab: %s", u17);
            if (!android.text.TextUtils.isEmpty(u17)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSmileyInitTab", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                return u17;
            }
        }
        java.util.Iterator it = gr.t.g().a().iterator();
        while (it.hasNext()) {
            if (!n22.m.l((com.tencent.mm.storage.emotion.EmojiInfo) it.next())) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSmileyInitTab", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                return "custom";
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSmileyInitTab", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return "smiley";
    }

    private long getWxKeyboardAbility() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWxKeyboardAbility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWxKeyboardAbility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return 33L;
    }

    public static /* synthetic */ void h(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        snsCommentFooter.o(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public static /* synthetic */ com.tencent.mm.ui.MMActivity i(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.ui.MMActivity mMActivity = snsCommentFooter.f167090g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return mMActivity;
    }

    public static boolean j(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        snsCommentFooter.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInReply", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        r45.e86 e86Var = snsCommentFooter.f167105v;
        if (e86Var == null || com.tencent.mm.sdk.platformtools.t8.K0(e86Var.f373126d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInReply", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            z17 = false;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInReply", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return z17;
    }

    public static /* synthetic */ zb4.a k(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        zb4.a aVar = snsCommentFooter.S;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return aVar;
    }

    public static /* synthetic */ fl5.i l(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        fl5.i iVar = snsCommentFooter.f167092i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return iVar;
    }

    public static /* synthetic */ java.lang.String m(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        java.lang.String str = snsCommentFooter.D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return str;
    }

    public static boolean n(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        snsCommentFooter.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkBtnEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        boolean z18 = true;
        boolean z19 = snsCommentFooter.f167092i.getText().toString().trim().length() > 0;
        zb4.a aVar = snsCommentFooter.S;
        aVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isImageComment", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        boolean z27 = aVar.f471307e == 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isImageComment", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        if (!z27) {
            zb4.a aVar2 = snsCommentFooter.S;
            aVar2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEmoticonComment", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            boolean z28 = aVar2.f471307e == 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEmoticonComment", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            if (!z28) {
                z17 = false;
                if (!z19 && !z17) {
                    z18 = false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkBtnEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                return z18;
            }
        }
        z17 = true;
        if (!z19) {
            z18 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkBtnEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return z18;
    }

    public void A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestory", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "onDestory: ");
        this.H1 = null;
        if (this.f167101r != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "commentfooter release");
            this.f167101r.l();
            this.f167101r.a();
        }
        fl5.i iVar = this.f167092i;
        if (iVar != null) {
            iVar.destroy();
        }
        bc4.d dVar = this.T;
        dVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroy", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCmtFooterImageLoader", "destroy");
        kotlinx.coroutines.r2 r2Var = dVar.f19170a;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.z0.e(dVar.f19171b, null, 1, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroy", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestory", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "onResume state: %d", java.lang.Integer.valueOf(this.f167107x));
        if (this.f167107x == 2) {
            postDelayed(new com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$d(this), 200L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void C(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSelectEmoticon", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "onSelectEmoticon >> mdt: %s", iEmojiInfo.getMd5());
        boolean e17 = this.S.e();
        this.S.g(1);
        zb4.a aVar = this.S;
        aVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEmoji", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        aVar.f471303a = iEmojiInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEmoji", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        this.S.h(new android.util.Size(0, 0));
        zb4.a aVar2 = this.S;
        aVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        aVar2.f471305c = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        com.tencent.mm.plugin.sns.ui.widget.r2.f171259a.k(this.L, this.R, this.S, e17);
        G();
        o(true);
        W();
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$d snsCommentFooter$$d = new com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$d(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(snsCommentFooter$$d, 200L, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSelectEmoticon", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsCommentFooter.D(java.lang.String):void");
    }

    public void E() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshAtBtnColor", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "refreshAtBtnColor");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.E;
        com.tencent.mm.ui.MMActivity mMActivity = this.f167090g;
        if (snsInfo != null && snsInfo.isFireworkCheerAd() && (this.f167095n instanceof com.tencent.mm.ui.widget.imageview.WeImageView)) {
            java.lang.Boolean bool = (java.lang.Boolean) k84.e4.f305021d.b(a84.d0.c(this.E));
            if (bool == null || !bool.booleanValue()) {
                ((com.tencent.mm.ui.widget.imageview.WeImageView) this.f167095n).setIconColor(i65.a.d(mMActivity, com.tencent.mm.R.color.am6));
            } else {
                ((com.tencent.mm.ui.widget.imageview.WeImageView) this.f167095n).setIconColor(k84.d4.V.b(this.E));
            }
        } else {
            ((com.tencent.mm.ui.widget.imageview.WeImageView) this.f167095n).setIconColor(i65.a.d(mMActivity, com.tencent.mm.R.color.am6));
        }
        ((com.tencent.mm.ui.widget.imageview.WeImageView) this.f167095n).setEnableColorFilter(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshAtBtnColor", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void F() {
        android.view.ViewGroup.LayoutParams layoutParams;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshBottomPanelHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        int smilePanelHeight = getSmilePanelHeight();
        if (smilePanelHeight <= 0) {
            smilePanelHeight = com.tencent.mm.sdk.platformtools.d2.g(getContext());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "refreshBottomPanelHeight: %s", java.lang.Integer.valueOf(smilePanelHeight));
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f167101r;
        if (chatFooterPanel != null && (layoutParams = chatFooterPanel.getLayoutParams()) != null) {
            this.B = smilePanelHeight;
            layoutParams.height = smilePanelHeight;
            this.f167101r.setLayoutParams(layoutParams);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeRootDy", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            int i17 = this.B;
            int i18 = i17 - this.A;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "changeRootDy >> smileyPanelHeight: %d mKeyboardHeight: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.A));
            if (i18 > 0) {
                this.C = i18;
                U(false);
            } else {
                J(false);
                this.C = 0;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeRootDy", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshBottomPanelHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshPostContentView", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "refreshPostContentView currentContentType: %d", java.lang.Integer.valueOf(this.S.a()));
        int a17 = this.S.a();
        if (a17 != 0) {
            bc4.d dVar = this.T;
            if (a17 == 1) {
                android.view.View view = this.K;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.P;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = this.M;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadEmoji", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                com.tencent.mm.api.IEmojiInfo b17 = this.S.b();
                if (b17 != null) {
                    java.lang.String wi6 = ((com.tencent.mm.feature.emoji.n4) ((com.tencent.mm.feature.emoji.api.s6) i95.n0.c(com.tencent.mm.feature.emoji.api.s6.class))).wi(b17);
                    if (com.tencent.mm.vfs.w6.j(wi6)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "load emoji is exist: %s", b17.getMd5());
                        dVar.b(this.Q, wi6);
                        this.S.h(dVar.a(wi6));
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "load emoji is no exist to loadMd5: %s", b17.getMd5());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEmoticonThumbImageTask", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                        com.tencent.mm.feature.emoji.api.a aVar = new com.tencent.mm.feature.emoji.api.a();
                        java.lang.String md52 = b17.getMd5();
                        kotlin.jvm.internal.o.g(md52, "<set-?>");
                        aVar.f66042a = md52;
                        aVar.f66043b = b17;
                        aVar.f66044c = new yz5.p() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$f
                            @Override // yz5.p
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                com.tencent.mm.plugin.sns.ui.SnsCommentFooter.f(com.tencent.mm.plugin.sns.ui.SnsCommentFooter.this, (java.lang.String) obj, (java.lang.String) obj2);
                                return null;
                            }
                        };
                        aVar.f66045d = new yz5.l() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$g
                            @Override // yz5.l
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                com.tencent.mm.plugin.sns.ui.SnsCommentFooter.g(com.tencent.mm.plugin.sns.ui.SnsCommentFooter.this, (java.lang.String) obj);
                                return null;
                            }
                        };
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmoticonThumbImageTask", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                        com.tencent.mm.feature.emoji.n4 n4Var = (com.tencent.mm.feature.emoji.n4) ((com.tencent.mm.feature.emoji.api.s6) i95.n0.c(com.tencent.mm.feature.emoji.api.s6.class));
                        n4Var.getClass();
                        wr.j jVar = n4Var.f66406d;
                        jVar.getClass();
                        pm0.v.X(new wr.h(jVar, aVar));
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadEmoji", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                this.N.setImageDrawable(null);
            } else if (a17 == 2) {
                android.view.View view4 = this.K;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view5 = this.P;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view6 = this.M;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                dVar.b(this.N, this.S.c());
            }
        } else {
            android.view.View view7 = this.K;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.Q.setImageDrawable(null);
            this.N.setImageDrawable(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshPostContentView", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void H(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replaceCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f167106w = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void J(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetTransY", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (this.f167108x0) {
            int translationY = (int) getTranslationY();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "resetTransY >> transY: %d, currentTransY: %d", java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(translationY));
            if (this.C != 0 && translationY != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "resetTransY >> needAni: %b", java.lang.Boolean.valueOf(z17));
                if (z17) {
                    animate().translationY(0.0f).setDuration(200L).start();
                    if (this.W != null) {
                        com.tencent.mm.autogen.events.SnsInputScrollEvent snsInputScrollEvent = new com.tencent.mm.autogen.events.SnsInputScrollEvent();
                        android.view.View view = this.W;
                        am.aw awVar = snsInputScrollEvent.f54818g;
                        awVar.f6191a = view;
                        awVar.f6192b = this;
                        snsInputScrollEvent.e();
                    }
                } else {
                    setTranslationY(0.0f);
                }
            }
        } else if (this.C != 0) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) getLayoutParams();
            int i17 = marginLayoutParams.bottomMargin;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "transToDy >> transY: %d, bottomMargin: %d", java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(i17));
            if (i17 != 0) {
                marginLayoutParams.bottomMargin = 0;
                setLayoutParams(marginLayoutParams);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetTransY", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    @Override // com.tencent.mm.ui.widget.InputPanelLinearLayout, al5.e0
    public void J2(boolean z17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableWindowSoftInputModeAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        boolean z18 = this.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableWindowSoftInputModeAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (z18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        super.J2(z17, i17);
        X(z17, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void K(int i17, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectImageActivityResult", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "selectImageActivityResult >> resultCode: %d", java.lang.Integer.valueOf(i17));
        if (i17 == -1 && (stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List")) != null && !stringArrayListExtra.isEmpty()) {
            D(stringArrayListExtra.get(0));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectImageActivityResult", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendETListen", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        fl5.i iVar = this.f167092i;
        if (iVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentFooter", "send edittext is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendETListen", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        } else {
            android.text.TextWatcher textWatcher = this.E1;
            iVar.removeTextChangedListener(textWatcher);
            this.f167092i.addTextChangedListener(textWatcher);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendETListen", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        }
    }

    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDefaultEmojiPanelConfig", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f167101r.setShowSearch(false);
        this.f167101r.c();
        this.f167101r.p(false, false);
        this.f167101r.o(false, false);
        this.f167101r.setShowStore(false);
        this.f167101r.setCallback(null);
        this.f167112y1 = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDefaultEmojiPanelConfig", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N(java.util.List r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "setText"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsCommentFooter"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r6.A1 = r8
            r6.B1 = r7
            fl5.i r2 = r6.f167092i
            if (r2 == 0) goto L88
            zb4.a r2 = new zb4.a
            r2.<init>()
            r6.S = r2
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r8)
            java.lang.String r3 = ""
            if (r2 != 0) goto L48
            java.util.Iterator r2 = r7.iterator()
        L23:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r2.next()
            com.tencent.mm.plugin.sns.ui.t1 r4 = (com.tencent.mm.plugin.sns.ui.t1) r4
            java.lang.String r5 = r4.f170493a
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L23
            r7.remove(r4)
            zb4.a r8 = r4.f170494b
            java.lang.String r8 = r8.d()
            if (r8 != 0) goto L43
            r8 = r3
        L43:
            zb4.a r2 = r4.f170494b
            r6.S = r2
            goto L49
        L48:
            r8 = r3
        L49:
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r8)
            if (r2 != 0) goto L5a
            fl5.i r2 = r6.f167092i
            r2.setText(r3)
            fl5.i r2 = r6.f167092i
            r2.n(r8)
            goto L5f
        L5a:
            fl5.i r8 = r6.f167092i
            r8.setText(r3)
        L5f:
            r6.G()
            zb4.a r8 = r6.S
            boolean r8 = r8.f()
            if (r8 == 0) goto L77
            android.widget.Button r8 = r6.f167100q
            r2 = 0
            r8.setVisibility(r2)
            android.widget.Button r8 = r6.f167097p
            r2 = 8
            r8.setVisibility(r2)
        L77:
            boolean r8 = r6.C1
            if (r8 != 0) goto L85
            fl5.i r8 = r6.f167092i
            com.tencent.mm.plugin.sns.ui.xf r2 = new com.tencent.mm.plugin.sns.ui.xf
            r2.<init>(r6, r7)
            r8.addTextChangedListener(r2)
        L85:
            r7 = 1
            r6.C1 = r7
        L88:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsCommentFooter.N(java.util.List, java.lang.String):void");
    }

    public void O(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showAtBtn", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (this.f167095n != null) {
            if (z17) {
                android.view.View view = this.f167094m;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "showAtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "showAtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f167095n.setVisibility(0);
                E();
                if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsAdAtFriendRedDot", 0) == 1 && gm0.j1.u().c().o(com.tencent.mm.storage.u3.NEW_BANDAGE_SNS_AD_COMMENT_AT_RED_DOT_BOOLEAN_SYNC, true)) {
                    this.f167096o.setVisibility(0);
                } else {
                    this.f167096o.setVisibility(8);
                }
            } else {
                android.view.View view2 = this.f167094m;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "showAtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "showAtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f167095n.setVisibility(8);
                this.f167096o.setVisibility(8);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAtBtn", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "showInput: ");
        ((android.view.inputmethod.InputMethodManager) this.f167090g.getSystemService("input_method")).showSoftInput(this.f167092i.j(), 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void Q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(hc1.i.NAME, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f167101r.i();
        if (com.tencent.mm.sdk.platformtools.d2.j(getContext())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowKeyboard", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            int j17 = com.tencent.mm.ui.bk.j(getContext());
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "is show key board %d, %d, %d", java.lang.Integer.valueOf(this.f167113z), java.lang.Integer.valueOf(this.f167110y), java.lang.Integer.valueOf(j17));
            int i17 = this.f167113z;
            boolean z17 = i17 > 0 && i17 < this.f167110y - j17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowKeyboard", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            if (z17) {
                getInputPanelHelper().e(new com.tencent.mm.plugin.sns.ui.uf(this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(hc1.i.NAME, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", hc1.i.NAME);
        q(true);
        com.tencent.mm.plugin.sns.ui.eg egVar = this.G1;
        if (egVar != null) {
            ((com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass35) egVar).a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(hc1.i.NAME, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void R(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (this.f167101r == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        this.f167114z1 = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "showState " + z17);
        if (z17) {
            if (this.f167107x == 0) {
                this.f167092i.k();
                P();
                q(false);
            } else {
                this.f167092i.k();
                u();
                Q();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        r(false, false);
        this.f167092i.clearFocus();
        p();
        this.f167091h.setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
        u();
        requestLayout();
        S();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void S() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("smileyPanelPause", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f167101r;
        if (chatFooterPanel == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("smileyPanelPause", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        if (this.f167099p1) {
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSmileyInitTabToCache", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            if (this.f167109x1 != null && !this.f167112y1.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "setSmileyInitTabToCache >> currentTab: %s", this.f167112y1);
                this.f167109x1.D("smiley_panel_tab", this.f167112y1);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSmileyInitTabToCache", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        } else {
            chatFooterPanel.h();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("smileyPanelPause", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void T() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchToEditState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "switchToEditState currentState: %d", java.lang.Integer.valueOf(this.f167107x));
        U(true);
        if (!x()) {
            w();
        }
        this.f167092i.k();
        P();
        setToSendTextColor(true);
        this.f167091h.setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
        this.f167091h.setContentDescription(getContext().getString(com.tencent.mm.R.string.axk));
        if (!x()) {
            this.f167107x = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchToEditState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void U(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("transToDy", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (this.f167108x0) {
            int translationY = (int) getTranslationY();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "transToDy >> transY: %d, currentTransY: %d isTransing: %b", java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(translationY), java.lang.Boolean.valueOf(this.f167111y0));
            int i17 = this.C;
            if (i17 != 0 && ((translationY == 0 || translationY != i17) && !this.f167111y0)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "transToDy >> needAni: %b", java.lang.Boolean.valueOf(z17));
                if (z17) {
                    this.f167111y0 = true;
                    animate().translationY(this.C).setDuration(200L).setListener(new com.tencent.mm.plugin.sns.ui.nf(this)).start();
                    if (this.W != null) {
                        com.tencent.mm.autogen.events.SnsInputScrollEvent snsInputScrollEvent = new com.tencent.mm.autogen.events.SnsInputScrollEvent();
                        android.view.View view = this.W;
                        am.aw awVar = snsInputScrollEvent.f54818g;
                        awVar.f6191a = view;
                        awVar.f6192b = this;
                        snsInputScrollEvent.e();
                    }
                } else {
                    setTranslationY(this.C);
                }
            }
        } else if (this.C != 0) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) getLayoutParams();
            int i18 = marginLayoutParams.bottomMargin;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "transToDy >> transY: %d, bottomMargin: %d", java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(i18));
            if (marginLayoutParams.bottomMargin == 0 || java.lang.Math.abs(i18) != this.C) {
                marginLayoutParams.bottomMargin = -this.C;
                setLayoutParams(marginLayoutParams);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("transToDy", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void V(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unsetCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f167106w = (~i17) & this.f167106w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unsetCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void W() {
        java.util.List list;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCommentCache", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "update commentkey:" + this.A1);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.A1) && (list = this.B1) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                com.tencent.mm.plugin.sns.ui.t1 t1Var = (com.tencent.mm.plugin.sns.ui.t1) it.next();
                if (this.A1.equals(t1Var.f170493a)) {
                    t1Var.f170494b.i(this.f167092i.getText().toString());
                    t1Var.f170495c = this.f167106w;
                    z17 = true;
                    break;
                }
            }
            if (!z17) {
                com.tencent.mm.plugin.sns.ui.t1 t1Var2 = new com.tencent.mm.plugin.sns.ui.t1();
                t1Var2.f170493a = this.A1;
                this.S.i(this.f167092i.getText().toString());
                t1Var2.f170494b = this.S;
                t1Var2.f170495c = this.f167106w;
                this.B1.add(t1Var2);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCommentCache", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void X(boolean z17, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int a17;
        com.tencent.mm.plugin.sns.ui.zx zxVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateOnKeyBoardChange", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "updateOnKeyBoardChange: isKeyboardShow:%b, smiley state:%b, keyboardHeight:%d", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(y()), java.lang.Integer.valueOf(i17));
        if (z17 && getVisibility() == 0 && (zxVar = this.H1) != null) {
            zxVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollUp", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            zxVar.f171725f = true;
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(zxVar.f171729j, 30L);
            zxVar.f171726g = 10;
            com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineScrollAnimation", "footerTop when up :" + zxVar.f171728i.getTop());
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollUp", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        }
        fl5.i iVar = this.f167092i;
        if (iVar != null) {
            iVar.m(z17);
            if (z17 && i17 != 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshSendEditTextMaxHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                com.tencent.mm.ui.MMActivity context = this.f167090g;
                int e17 = com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f479623ay);
                gc4.c cVar = gc4.c.f270447a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshInputViewMaxHeightOnKeyboardShow", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
                kotlin.jvm.internal.o.g(context, "context");
                if (e17 < 0) {
                    str2 = "refreshSendEditTextMaxHeight";
                    str = "updateOnKeyBoardChange";
                    str3 = "MicroMsg.SnsCommentFooter";
                    a17 = gc4.c.a(cVar, context, i17, 0, 0, 0, 0, 0, 0, 252, null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshInputViewMaxHeightOnKeyboardShow", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
                } else {
                    str2 = "refreshSendEditTextMaxHeight";
                    str = "updateOnKeyBoardChange";
                    str3 = "MicroMsg.SnsCommentFooter";
                    a17 = gc4.c.a(cVar, context, i17, e17, 0, 0, 0, 0, 0, 248, null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshInputViewMaxHeightOnKeyboardShow", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
                }
                this.f167092i.setMaxHeight(a17);
                if (x()) {
                    this.f167107x = 0;
                }
                com.tencent.mars.xlog.Log.i(str3, "refreshSendEditTextMaxHeight maxHeight:%d", java.lang.Integer.valueOf(a17));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                U(false);
                if (this.A != i17 && i17 != 0) {
                    this.A = i17;
                    fp.w.m(getContext(), i17);
                    F();
                }
                r(z17, y());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        }
        str = "updateOnKeyBoardChange";
        if (this.A != i17) {
            this.A = i17;
            fp.w.m(getContext(), i17);
            F();
        }
        r(z17, y());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    @Override // p94.u0
    public void b(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceiveImeEmoji", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "onReceiveImeEmoji -> %s", iEmojiInfo);
        C(iEmojiInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceiveImeEmoji", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    @Override // p94.u0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceiveImeImg", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "onReceiveImeImg -> %s", str);
        D(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceiveImeImg", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public java.lang.String getCommentAtPrefix() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentAtPrefix", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        java.lang.String str = this.D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentAtPrefix", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return str;
    }

    public int getCommentFlag() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        int i17 = this.f167106w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return i17;
    }

    public r45.e86 getCommentInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        r45.e86 e86Var = this.f167105v;
        if (e86Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return e86Var;
        }
        r45.e86 e86Var2 = new r45.e86();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return e86Var2;
    }

    public int getCurrBottom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrBottom", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        int i17 = this.f167113z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrBottom", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return i17;
    }

    public final void o(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477843d1);
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477848d6);
        loadAnimation.setDuration(150L);
        loadAnimation2.setDuration(150L);
        android.widget.Button button = this.f167097p;
        if (button == null || this.f167100q == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        if (z17) {
            if (button.getVisibility() == 8 || this.f167097p.getVisibility() == 4) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                return;
            }
            this.f167100q.startAnimation(loadAnimation);
            this.f167100q.setVisibility(0);
            this.f167097p.startAnimation(loadAnimation2);
            this.f167097p.setVisibility(8);
        } else {
            if (button.getVisibility() == 0 || this.f167097p.getVisibility() == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                return;
            }
            this.f167097p.startAnimation(loadAnimation);
            this.f167097p.setVisibility(0);
            this.f167100q.startAnimation(loadAnimation2);
            this.f167100q.setVisibility(8);
        }
        this.f167100q.getParent().requestLayout();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        super.onConfigurationChanged(configuration);
        if (this.f167101r != null) {
            F();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = this.f167110y;
        if (i28 < i27) {
            i28 = i27;
        }
        this.f167110y = i28;
        this.f167113z = i27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeSmileyPanelGone", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f167101r.setVisibility(8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeSmileyPanelGone", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void q(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeSmileyPanelVisibility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f167101r;
        if (chatFooterPanel != null) {
            if (z17) {
                chatFooterPanel.setVisibility(0);
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableWindowSoftInputModeAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                boolean z18 = this.G;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableWindowSoftInputModeAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                if (!z18) {
                    p();
                } else if (this.f167101r.getVisibility() == 8) {
                    this.f167101r.setVisibility(4);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "changeSmileyPanelVisibility: to %d", java.lang.Integer.valueOf(this.f167101r.getVisibility()));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeSmileyPanelVisibility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void r(boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkReadyInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (this.f167092i == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkReadyInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        if (!z17 && !z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "checkReadyInput: reset input");
            if (!(this.f167090g.getResources().getConfiguration().orientation == 2) && this.f167092i.j().hasFocus()) {
                t(false);
            }
            this.F = ta4.x0.f416851j.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkReadyInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void s() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearComment", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f167092i.setText("");
        this.f167092i.setHint("");
        this.f167105v = null;
        this.f167106w = 0;
        this.f167107x = 0;
        this.S = new zb4.a();
        G();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearComment", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setAfterEditAction(java.lang.Runnable runnable) {
        java.lang.String Ni;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAfterEditAction", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.ui.MMActivity mMActivity = this.f167090g;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.f489501cr5, this);
        this.f167104u = viewGroup.findViewById(com.tencent.mm.R.id.r2z);
        this.f167094m = viewGroup.findViewById(com.tencent.mm.R.id.scf);
        this.f167095n = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.f482823ow);
        this.f167096o = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.f482824ox);
        this.f167097p = (android.widget.Button) viewGroup.findViewById(com.tencent.mm.R.id.f482836pa);
        this.f167100q = (android.widget.Button) viewGroup.findViewById(com.tencent.mm.R.id.f482830p4);
        this.f167103t = (com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget) viewGroup.findViewById(com.tencent.mm.R.id.f482839pd);
        fl5.i iVar = (fl5.i) viewGroup.findViewById(com.tencent.mm.R.id.f482827p0);
        this.f167092i = iVar;
        iVar.d(((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).cj());
        this.f167097p.setContentDescription(mMActivity.getString(com.tencent.mm.R.string.j9u));
        pc4.d dVar = pc4.d.f353410a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSnsEmojiPanelCustomTab", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_emoji_panel_tab_custom, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsEmojiPanelCustomTab", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        this.f167099p1 = fj6;
        this.f167109x1 = com.tencent.mm.sdk.platformtools.o4.J("sns_comment_footer", gm0.j1.b().h(), 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSelectHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f167092i.b(((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).bj(), com.tencent.mm.sdk.platformtools.m2.f(mMActivity), new com.tencent.mm.plugin.sns.ui.of(this), null);
        this.f167092i.addTextChangedListener(new com.tencent.mm.plugin.sns.ui.pf(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSelectHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        o(false);
        this.f167097p.setTextSize(0, i65.a.f(mMActivity, com.tencent.mm.R.dimen.f479919iy) * i65.a.m(mMActivity));
        this.f167100q.setTextSize(0, i65.a.f(mMActivity, com.tencent.mm.R.dimen.f479919iy) * i65.a.m(mMActivity));
        this.f167095n.setOnClickListener(new com.tencent.mm.plugin.sns.ui.yf(this));
        android.widget.ImageButton imageButton = (android.widget.ImageButton) viewGroup.findViewById(com.tencent.mm.R.id.f482835p9);
        this.f167091h = imageButton;
        imageButton.setOnClickListener(new com.tencent.mm.plugin.sns.ui.zf(this));
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = (com.tencent.mm.ui.widget.imageview.WeImageButton) viewGroup.findViewById(com.tencent.mm.R.id.u3h);
        this.H = weImageButton;
        weImageButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.String str = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I1;
                com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.this;
                snsCommentFooter.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$init$0", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", snsCommentFooter, array);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "sendImgBtn onClick");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goAlbumUI", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                snsCommentFooter.v();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("max_select_count", 1);
                intent.putExtra("query_source_type", 4);
                intent.putExtra("is_from_sns_comment", true);
                intent.putExtra("query_media_type", 1);
                intent.putExtra("show_header_view", false);
                intent.addFlags(67108864);
                j45.l.n(snsCommentFooter.f167090g, "gallery", ".ui.GalleryEntryUI", intent, 26);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goAlbumUI", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                yj0.a.h(snsCommentFooter, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$init$0", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        });
        com.tencent.mm.plugin.sns.ui.widget.r2 r2Var = com.tencent.mm.plugin.sns.ui.widget.r2.f171259a;
        android.widget.ImageButton view = this.f167091h;
        boolean z17 = this.U;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommonViewParam", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        kotlin.jvm.internal.o.g(view, "view");
        java.util.HashMap hashMap = new java.util.HashMap();
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (r2Var.b(context) == 3) {
            Ni = z17 ? ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni() : ca4.z0.f40071d;
            kotlin.jvm.internal.o.d(Ni);
        } else {
            Ni = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
            kotlin.jvm.internal.o.d(Ni);
        }
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        hashMap.put("sns_scene", java.lang.Integer.valueOf(r2Var.b(context2)));
        hashMap.put("sessionid_sns", Ni);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommonViewParam", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        this.V = hashMap;
        r2Var.d(this.f167091h, "sns_cmt_emo", hashMap);
        r2Var.d(this.H, "sns_cmt_album", this.V);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPostContentLayout", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.K = viewGroup.findViewById(com.tencent.mm.R.id.v8k);
        this.L = viewGroup.findViewById(com.tencent.mm.R.id.v8j);
        this.R = viewGroup.findViewById(com.tencent.mm.R.id.v8b);
        this.P = viewGroup.findViewById(com.tencent.mm.R.id.v8c);
        this.M = viewGroup.findViewById(com.tencent.mm.R.id.v8e);
        this.N = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.v8g);
        this.Q = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.v8d);
        this.K.setOnClickListener(new com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$i());
        this.R.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$j
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                java.lang.String str = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I1;
                com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.this;
                snsCommentFooter.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$initPostContentLayout$4", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view2);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", snsCommentFooter, array);
                zb4.a aVar = snsCommentFooter.S;
                aVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isImageComment", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
                boolean z18 = aVar.f471307e == 2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isImageComment", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
                if (z18 && snsCommentFooter.S.c() != null && snsCommentFooter.S.c().contains("cmt_temp_")) {
                    com.tencent.mm.vfs.w6.h(snsCommentFooter.S.c());
                }
                snsCommentFooter.S.g(0);
                zb4.a aVar2 = snsCommentFooter.S;
                aVar2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetMediaContent", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
                aVar2.f471303a = null;
                aVar2.f471305c = null;
                aVar2.f471304b = new android.util.Size(0, 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetMediaContent", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
                snsCommentFooter.G();
                if (snsCommentFooter.f167092i.getText().toString().trim().isEmpty()) {
                    snsCommentFooter.o(false);
                }
                snsCommentFooter.W();
                yj0.a.h(snsCommentFooter, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$initPostContentLayout$4", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        });
        this.Q.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$k
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                java.lang.String str = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I1;
                com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.this;
                snsCommentFooter.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$initPostContentLayout$5", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view2);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", snsCommentFooter, array);
                if (snsCommentFooter.S.a() == 1 && snsCommentFooter.S.b() != null) {
                    com.tencent.mm.api.IEmojiInfo b17 = snsCommentFooter.S.b();
                    int[] iArr = new int[2];
                    if (com.tencent.mm.ui.bk.y()) {
                        snsCommentFooter.Q.getLocationOnScreen(iArr);
                    } else {
                        snsCommentFooter.Q.getLocationInWindow(iArr);
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("IntentKeyEmojiMd5", b17.getMd5());
                    intent.putExtra("IntentKeyIEmojiInfo", b17);
                    int i17 = iArr[0];
                    int i18 = iArr[1];
                    intent.putExtra("IntentKeyThumbLocation", new android.graphics.Rect(i17, i18, snsCommentFooter.Q.getWidth() + i17, snsCommentFooter.Q.getHeight() + i18));
                    intent.setClass(snsCommentFooter.f167090g, com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI.class);
                    com.tencent.mm.ui.MMActivity mMActivity2 = snsCommentFooter.f167090g;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(mMActivity2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "lambda$initPostContentLayout$5", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mMActivity2.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(mMActivity2, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "lambda$initPostContentLayout$5", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    snsCommentFooter.v();
                }
                yj0.a.h(snsCommentFooter, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$initPostContentLayout$5", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        });
        this.N.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$b
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                java.lang.String str = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I1;
                com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.this;
                snsCommentFooter.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$initPostContentLayout$6", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view2);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", snsCommentFooter, array);
                int[] iArr = new int[2];
                if (com.tencent.mm.ui.bk.y()) {
                    snsCommentFooter.N.getLocationOnScreen(iArr);
                } else {
                    snsCommentFooter.N.getLocationInWindow(iArr);
                }
                r45.jj4 jj4Var = new r45.jj4();
                jj4Var.f377855d = "sns_cmt_local_" + snsCommentFooter.S.c();
                java.lang.String c17 = snsCommentFooter.S.c();
                jj4Var.f377858g = c17;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "click image path: %s", c17);
                new com.tencent.mm.plugin.sns.ui.kj(snsCommentFooter.f167090g).b(snsCommentFooter.E.getSnsId(), jj4Var, c01.z1.r(), 0, -1L, iArr, snsCommentFooter.N.getWidth(), snsCommentFooter.N.getHeight());
                snsCommentFooter.v();
                yj0.a.h(snsCommentFooter, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$initPostContentLayout$6", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        });
        r2Var.c(this.L, "sns_cmt_bub", this.V);
        r2Var.c(this.R, "sns_cmt_bub_x", this.V);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPostContentLayout", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f167092i.setHint(mMActivity.getString(com.tencent.mm.R.string.jgp));
        this.f167092i.setOnTouchListener(new com.tencent.mm.plugin.sns.ui.ag(this));
        this.f167092i.a(new nl5.p() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$c
            @Override // nl5.p
            public final boolean a(java.lang.String str, android.os.Bundle bundle) {
                java.lang.String str2 = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I1;
                com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.this;
                snsCommentFooter.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$init$1", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                boolean z18 = false;
                try {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canRevivedIMECommand", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                    pc4.d dVar2 = pc4.d.f353410a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSnsCommentSupportImeEmoji", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsCommentSupportImeEmoji", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                    android.view.inputmethod.InputMethodManager inputMethodManager = snsCommentFooter.f167093l1;
                    inputMethodManager.isActive();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSnsCommentSupportImeEmoji", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsCommentSupportImeEmoji", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                    boolean z19 = pc4.d.f353415f && snsCommentFooter.I && snsCommentFooter.f167089J && inputMethodManager.isActive();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canRevivedIMECommand", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                    if (z19) {
                        z18 = ((i05.n) ((p94.t0) i95.n0.c(p94.t0.class))).Bi((android.view.View) snsCommentFooter.f167092i.getRealEditText(), snsCommentFooter, str, bundle);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$init$1", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$init$1", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsCommentFooter", e17, null, new java.lang.Object[0]);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$init$1", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                }
                return z18;
            }
        });
        if (com.tencent.mm.pluginsdk.ui.chat.i6.a() == null) {
            this.f167101r = new com.tencent.mm.pluginsdk.ui.chat.t5(mMActivity);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        } else {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel wi6 = ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(getContext());
            this.f167101r = wi6;
            wi6.setEntranceScene(105);
            this.f167101r.setSearchSource(6501);
            yb4.a aVar = yb4.a.f460697a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canSendEmoticon", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
            aVar.c();
            boolean z18 = yb4.a.f460698b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canSendEmoticon", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
            if (z18) {
                this.f167101r.setShowSearch(true);
            }
            this.f167101r.setVisibility(8);
            this.f167102s = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.m7g);
            int g17 = com.tencent.mm.sdk.platformtools.d2.g(getContext());
            this.A = g17;
            this.B = g17;
            this.f167102s.addView(this.f167101r, -1, g17);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "init: height %s, addView, Gone smileyPanel", java.lang.Integer.valueOf(this.A));
            if (((mMActivity.getWindow().getDecorView().getSystemUiVisibility() & 512) != 0) && !com.tencent.mm.ui.b4.c(mMActivity)) {
                int c17 = i65.a.c(mMActivity, com.tencent.mm.ui.bl.c(mMActivity));
                android.widget.LinearLayout linearLayout = this.f167102s;
                linearLayout.setPadding(linearLayout.getPaddingLeft(), this.f167102s.getPaddingTop(), this.f167102s.getPaddingRight(), this.f167102s.getPaddingBottom() + c17);
            }
            this.f167101r.i();
            this.f167101r.setOnTextOperationListener(new com.tencent.mm.plugin.sns.ui.bg(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAfterEditAction", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setAnitiomAdjust(com.tencent.mm.plugin.sns.ui.zx zxVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAnitiomAdjust", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.H1 = zxVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAnitiomAdjust", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setCommentAtPrefix(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommentAtPrefix", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "setCommentAtPrefix: %s", str);
        this.D = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentAtPrefix", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setCommentFlag(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f167106w = i17 | this.f167106w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setCommentHint(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommentHint", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f167092i.setHint("");
        } else if (com.tencent.mm.plugin.sns.ui.widget.t2.i(this.f167106w, 1)) {
            fl5.i iVar = this.f167092i;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = getContext();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.tencent.mm.ui.MMActivity mMActivity = this.f167090g;
            sb6.append(mMActivity.getString(com.tencent.mm.R.string.j69));
            sb6.append(str);
            sb6.append(mMActivity.getString(com.tencent.mm.R.string.j8z, java.lang.Float.valueOf(this.f167092i.getTextSize())));
            java.lang.String sb7 = sb6.toString();
            float textSize = this.f167092i.getTextSize();
            ((ke0.e) xVar).getClass();
            iVar.setHint(com.tencent.mm.pluginsdk.ui.span.c0.j(context, sb7, textSize));
        } else {
            fl5.i iVar2 = this.f167092i;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = getContext();
            float textSize2 = this.f167092i.getTextSize();
            ((ke0.e) xVar2).getClass();
            iVar2.setHint(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str, textSize2));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentHint", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setCommentInfo(r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f167105v = e86Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setEnlargeEmoticonSmileyHeight(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEnlargeEmoticonSmileyHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f167098p0 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEnlargeEmoticonSmileyHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setFeedEmojiCommentEnable(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFeedEmojiCommentEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "setFeedEmojiCommentEnable:%s", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFeedEmojiCommentEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setIsFromMsgUIToDetailUI(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsFromMsgUIToDetailUI", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.U = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsFromMsgUIToDetailUI", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setModeClick(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setModeClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setModeClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setOnCommentSendImp(com.tencent.mm.plugin.sns.ui.dg dgVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnCommentSendImp", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f167100q.setOnClickListener(new com.tencent.mm.plugin.sns.ui.sf(this, dgVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnCommentSendImp", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setOnEditTouchListener(com.tencent.mm.plugin.sns.ui.cg cgVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnEditTouchListener", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.F1 = cgVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnEditTouchListener", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setOnSmileyShowListener(com.tencent.mm.plugin.sns.ui.eg egVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnSmileyShowListener", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.G1 = egVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnSmileyShowListener", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setOutsideScrollView(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOutsideScrollView", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.W = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOutsideScrollView", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setSnsInfo(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.E = snsInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshUIStyle", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = (com.tencent.mm.ui.widget.imageview.WeImageButton) this.f167091h;
        com.tencent.mm.ui.MMActivity mMActivity = this.f167090g;
        if (weImageButton != null) {
            weImageButton.setIconColor(i65.a.d(mMActivity, com.tencent.mm.R.color.abw));
        }
        android.view.View view = this.f167104u;
        if (view != null) {
            view.setBackgroundColor(i65.a.d(mMActivity, com.tencent.mm.R.color.BW_97));
        }
        fl5.i iVar = this.f167092i;
        if (iVar != null && android.os.Build.VERSION.SDK_INT >= 29) {
            iVar.setTextCursorDrawable(i65.a.i(mMActivity, com.tencent.mm.R.drawable.afr));
        }
        this.f167111y0 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshUIStyle", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (snsInfo != null) {
            java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
            com.tencent.mm.plugin.sns.ui.widget.r2 r2Var = com.tencent.mm.plugin.sns.ui.widget.r2.f171259a;
            r2Var.l(this.f167091h, "sns_feed_id", t07);
            r2Var.l(this.H, "sns_feed_id", t07);
            r2Var.l(this.L, "sns_feed_id", t07);
            r2Var.l(this.R, "sns_feed_id", t07);
            ((java.util.HashMap) this.V).put("sns_feed_id", t07);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkEmoticonAndImageEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            yb4.a aVar = yb4.a.f460697a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canSendEmoticon", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
            aVar.c();
            boolean z17 = yb4.a.f460698b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canSendEmoticon", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
            this.I = (!z17 || (snsInfo3 = this.E) == null || snsInfo3.isAd()) ? false : true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canSendCmtImg", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
            boolean z18 = yb4.a.f460700d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canSendCmtImg", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
            this.f167089J = (!z18 || (snsInfo2 = this.E) == null || snsInfo2.isAd()) ? false : true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeEmoticonAndImageEntrance", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            if (this.f167089J) {
                this.H.setVisibility(0);
            } else {
                this.H.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initEmoticonConfig", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            if (this.I) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSmileyInitTab", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                if (this.f167099p1 && this.f167101r != null) {
                    java.lang.String smileyInitTab = getSmileyInitTab();
                    this.f167112y1 = smileyInitTab;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "setSmileyInitTab >> currentTab: %s", smileyInitTab);
                    this.f167101r.setInitSelectTab(this.f167112y1);
                    this.f167101r.setOnEmojiSelectTabChangeListener(new com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$e(this));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSmileyInitTab", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                this.f167101r.p(true, false);
                this.f167101r.setShowSearch(true);
                this.f167101r.setShowGame(false);
                this.f167101r.setShowStore(true);
                this.f167101r.setCallback(new com.tencent.mm.plugin.sns.ui.qf(this));
            } else {
                M();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initEmoticonConfig", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeEmoticonAndImageEntrance", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkEmoticonAndImageEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeSmileyPanelParams", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            int smilePanelHeight = getSmilePanelHeight();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "changeSmileyPanelParams >> panelTargetHeight: %d smileyPanelHeight: %d", java.lang.Integer.valueOf(smilePanelHeight), java.lang.Integer.valueOf(this.B));
            if (this.B != smilePanelHeight) {
                F();
            } else if (this.C != 0) {
                U(false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeSmileyPanelParams", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            pc4.d dVar = pc4.d.f353410a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSnsCommentSupportImeEmoji", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsCommentSupportImeEmoji", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            if (!pc4.d.f353415f || snsInfo.isAd()) {
                android.os.Bundle inputExtras = this.f167092i.getInputExtras(true);
                inputExtras.putBoolean("if_support_wx_emoji", false);
                inputExtras.putBoolean("if_support_new_wxkb", false);
                inputExtras.putInt("wechat_scene", 6);
            } else {
                android.os.Bundle inputExtras2 = this.f167092i.getInputExtras(true);
                inputExtras2.putBoolean("if_support_wx_emoji", true);
                inputExtras2.putBoolean("if_support_new_wxkb", true);
                inputExtras2.putInt("wechat_scene", 6);
                inputExtras2.putLong("if_support_file_ability", getImeSupportFileAbility());
                inputExtras2.putLong("if_support_identity_ability", getImeSupportIdentityAbility());
                inputExtras2.putLong("wechat_support_ability", getWxKeyboardAbility());
            }
        } else {
            M();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setText(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        fl5.i iVar = this.f167092i;
        if (iVar != null) {
            iVar.setText("");
            this.f167092i.n(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setToSendTextColor(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setToSendTextColor", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "setToSendTextColor: enable=%b", java.lang.Boolean.valueOf(z17));
        fl5.i iVar = this.f167092i;
        if (iVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setToSendTextColor", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        if (z17) {
            iVar.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479411yi));
        } else {
            iVar.setTextColor(getResources().getColor(com.tencent.mm.R.color.t_));
            t(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setToSendTextColor", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setUseTransAniToLargeFooter(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUseTransAniToLargeFooter", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f167108x0 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUseTransAniToLargeFooter", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f167107x = 0;
        boolean z17 = i17 == 0;
        R(z17);
        if (!z17) {
            this.W = null;
        }
        super.setVisibility(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void t(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("focusEdt", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "focusEdt: %s, %s", java.lang.Boolean.valueOf(z17), this.f167092i);
        fl5.i iVar = this.f167092i;
        if (iVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("focusEdt", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        if (z17) {
            iVar.k();
        } else {
            iVar.clearFocus();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("focusEdt", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "hideInput: ");
        this.f167090g.hideVKB();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hidePanel", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$h
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String str = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I1;
                com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.this;
                snsCommentFooter.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$hidePanel$2", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                if (!snsCommentFooter.y()) {
                    snsCommentFooter.f167101r.setVisibility(4);
                }
                snsCommentFooter.u();
                snsCommentFooter.t(false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                if (snsCommentFooter.f167101r != null) {
                    snsCommentFooter.S();
                }
                snsCommentFooter.f167092i.onPause();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                snsCommentFooter.f167107x = 2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$hidePanel$2", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 200L, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hidePanel", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void w() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        S();
        if (com.tencent.mm.sdk.platformtools.d2.j(getContext())) {
            getInputPanelHelper().f(new com.tencent.mm.plugin.sns.ui.vf(this));
        } else {
            q(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public boolean x() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInPendingState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        boolean z17 = this.f167107x == 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInPendingState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return z17;
    }

    public boolean y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInSmileState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        boolean z17 = this.f167107x == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInSmileState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return z17;
    }

    public boolean z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReplyingContentEmpty", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        boolean z17 = (this.f167092i.getText() == null || com.tencent.mm.sdk.platformtools.t8.K0(this.f167092i.getText().toString())) && this.S.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReplyingContentEmpty", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return z17;
    }
}
