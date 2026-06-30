package u84;

/* loaded from: classes4.dex */
public abstract class m1 extends com.tencent.mm.plugin.sns.ui.widget.l {
    public static final kotlinx.coroutines.r0 N;
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public android.animation.ObjectAnimator D;
    public android.animation.ObjectAnimator E;
    public final android.view.animation.PathInterpolator F;
    public final android.view.animation.PathInterpolator G;
    public u84.o1 H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public s34.d f425593J;
    public kotlinx.coroutines.r2 K;
    public boolean L;
    public final android.os.Handler M;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f425594o;

    /* renamed from: p, reason: collision with root package name */
    public final int f425595p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f425596q;

    /* renamed from: r, reason: collision with root package name */
    public final w64.n f425597r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f425598s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f425599t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f425600u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.FrameLayout f425601v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f425602w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f425603x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f425604y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f425605z;

    static {
        int i17 = kotlinx.coroutines.r0.N0;
        N = new u84.l1(kotlinx.coroutines.q0.f310567d);
    }

    public m1(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, int i17, boolean z17, i64.b1 b1Var, w64.n nVar) {
        super(str, yVar, view);
        this.f425594o = view;
        this.f425595p = i17;
        this.f425596q = z17;
        this.f425597r = nVar;
        this.f425598s = jz5.h.b(new u84.x0(this));
        this.f425599t = jz5.h.b(new u84.z0(this));
        this.f425602w = jz5.h.b(new u84.f1(this));
        this.f425603x = jz5.h.b(new u84.b1(this));
        this.f425604y = jz5.h.b(new u84.a1(this));
        this.f425605z = jz5.h.b(new u84.c1(this));
        this.A = jz5.h.b(new u84.e1(this));
        this.B = jz5.h.b(new u84.d1(this));
        this.C = jz5.h.b(new u84.y0(this));
        this.F = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.5f, 1.0f);
        this.G = new android.view.animation.PathInterpolator(0.5f, 0.0f, 1.0f, 1.0f);
        this.M = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static final /* synthetic */ android.view.ViewGroup A(u84.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMStateSettingAfterContainer", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.view.ViewGroup E = m1Var.E();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMStateSettingAfterContainer", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return E;
    }

    public static final /* synthetic */ android.view.ViewGroup B(u84.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMStateSettingBeforeContainer", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.view.ViewGroup F = m1Var.F();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMStateSettingBeforeContainer", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return F;
    }

    public static final /* synthetic */ u84.o1 y(u84.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdStateSettingBarInfo$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        u84.o1 o1Var = m1Var.H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdStateSettingBarInfo$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return o1Var;
    }

    public static final /* synthetic */ android.widget.FrameLayout z(u84.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMBottomStateSettingBarView$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.widget.FrameLayout frameLayout = m1Var.f425601v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMBottomStateSettingBarView$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return frameLayout;
    }

    public final void C() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cancelAnimation", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.animation.ObjectAnimator objectAnimator = this.D;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        android.animation.ObjectAnimator objectAnimator2 = this.E;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancelAnimation", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
    }

    public final w64.n D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return this.f425597r;
    }

    public final android.view.ViewGroup E() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStateSettingAfterContainer", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f425604y).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStateSettingAfterContainer", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return viewGroup;
    }

    public final android.view.ViewGroup F() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStateSettingBeforeContainer", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f425603x).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStateSettingBeforeContainer", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return viewGroup;
    }

    public final android.widget.TextView G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStateSettingLinkDesc", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.B).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStateSettingLinkDesc", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return textView;
    }

    public final android.widget.TextView H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStateSettingLinkTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.A).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStateSettingLinkTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return textView;
    }

    public final android.widget.TextView I() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStateSettingTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f425602w).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStateSettingTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        return textView;
    }

    public final void J(android.widget.TextView textView, java.lang.String str, s34.g1 g1Var, int i17) {
        int e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initDiffStageText", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        if (textView != null) {
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
        if (textView != null) {
            if (com.tencent.mm.ui.bk.C()) {
                e17 = ca4.n0.e(g1Var != null ? g1Var.b() : null, i17);
            } else {
                e17 = ca4.n0.e(g1Var != null ? g1Var.a() : null, i17);
            }
            textView.setTextColor(e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDiffStageText", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
    }

    public final void K(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rebuildEmoticon", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        s34.d dVar = adClickActionInfo.f162610u0;
        if (dVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rebuildEmoticon", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
            return;
        }
        java.lang.String j17 = j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("override emoticon by worldCupAvatar (using avatar as emoji source), aid=");
        sb6.append(str3);
        sb6.append(", originUrlLen=");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEmoticonUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmoticonUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str4 = dVar.f402611h;
        sb6.append(str4 != null ? str4.length() : 0);
        sb6.append(", customUrlLen=");
        sb6.append(str.length());
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickActionType", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickActionType", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        int i17 = dVar.f402604a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str5 = dVar.f402605b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIconId", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIconId", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str6 = dVar.f402606c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCustomIconDescription", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCustomIconDescription", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str7 = dVar.f402607d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSourceFooterData", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceFooterData", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str8 = dVar.f402608e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSourceVerifyInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceVerifyInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str9 = dVar.f402609f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDesc", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDesc", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str10 = dVar.f402610g;
        java.lang.String a17 = dVar.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoMd5", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoMd5", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str11 = dVar.f402614k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpiredTime", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpiredTime", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        long j18 = dVar.f402615l;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpiredToast", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpiredToast", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        adClickActionInfo.f162610u0 = new s34.d(i17, str5, str6, str7, str8, str9, str10, str, str2, a17, str11, j18, dVar.f402616m);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rebuildEmoticon", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0390  */
    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.Object r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u84.m1.d(java.lang.Object, boolean):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void v(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        super.v((com.tencent.mm.plugin.sns.storage.SnsInfo) obj);
        this.M.removeCallbacksAndMessages(null);
        android.widget.FrameLayout frameLayout = this.f425601v;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        C();
        this.L = false;
        kotlinx.coroutines.r2 r2Var = this.K;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.K = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
    }
}
