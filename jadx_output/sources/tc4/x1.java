package tc4;

/* loaded from: classes4.dex */
public abstract class x1 extends android.widget.LinearLayout {
    public static final tc4.n1 G = new tc4.n1(null);
    public static final jz5.g H = jz5.h.b(tc4.y0.f417534d);
    public static final jz5.g I = jz5.h.b(tc4.a1.f417272d);

    /* renamed from: J, reason: collision with root package name */
    public static final jz5.g f417509J = jz5.h.b(tc4.m1.f417409d);
    public static final jz5.g K;
    public static final jz5.g L;
    public static final jz5.g M;
    public static final jz5.g N;
    public static final jz5.g P;
    public static final jz5.g Q;
    public static final jz5.g R;
    public static final jz5.g S;
    public static final jz5.g T;
    public static final jz5.g U;
    public android.view.View A;
    public android.view.View B;
    public android.widget.LinearLayout C;
    public final com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemHeader D;
    public final com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter E;
    public final android.view.View F;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.y f417510d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f417511e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f417512f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f417513g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f417514h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f417515i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f417516m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f417517n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f417518o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.LinearLayout f417519p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f417520q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f417521r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f417522s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f417523t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f417524u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f417525v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f417526w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f417527x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f417528y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f417529z;

    static {
        jz5.h.b(tc4.l1.f417396d);
        K = jz5.h.b(tc4.b1.f417291d);
        L = jz5.h.b(tc4.f1.f417329d);
        M = jz5.h.b(tc4.k1.f417391d);
        N = jz5.h.b(tc4.g1.f417339d);
        jz5.h.b(tc4.h1.f417353d);
        P = jz5.h.b(tc4.c1.f417301d);
        Q = jz5.h.b(tc4.e1.f417322d);
        R = jz5.h.b(tc4.i1.f417365d);
        S = jz5.h.b(tc4.d1.f417312d);
        T = jz5.h.b(tc4.z0.f417542d);
        U = jz5.h.b(tc4.j1.f417380d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x1(android.content.Context context) {
        super(context);
        int i17;
        java.lang.String str;
        int i18;
        int i19;
        kotlin.jvm.internal.o.g(context, "context");
        this.f417510d = (androidx.lifecycle.y) context;
        this.f417512f = jz5.h.b(new tc4.o1(context));
        this.f417513g = jz5.h.b(new tc4.v1(context));
        this.f417514h = jz5.h.b(new tc4.u1(context));
        this.f417515i = jz5.h.b(new tc4.r1(context));
        this.f417516m = jz5.h.b(new tc4.t1(context, this));
        this.f417517n = jz5.h.b(new tc4.w1(context));
        this.f417518o = jz5.h.b(new tc4.s1(context));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        this.f417519p = linearLayout;
        this.f417521r = jz5.h.b(new tc4.q1(context));
        this.f417522s = new android.view.ViewStub(context);
        this.f417523t = new android.view.ViewStub(context);
        this.f417524u = new android.view.ViewStub(context);
        this.f417525v = new android.view.ViewStub(context);
        this.f417526w = new android.view.ViewStub(context);
        this.f417527x = new android.view.ViewStub(context);
        this.f417528y = new android.view.ViewStub(context);
        this.f417529z = new android.view.ViewStub(context);
        this.A = new android.view.ViewStub(context);
        this.B = new android.view.ViewStub(context);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context);
        linearLayout2.setId(com.tencent.mm.R.id.f487031n94);
        this.C = linearLayout2;
        com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemHeader improveItemHeader = new com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemHeader(context);
        this.D = improveItemHeader;
        com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter improveItemFooter = new com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter(context);
        this.E = improveItemFooter;
        android.view.View view = new android.view.View(context);
        this.F = view;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupSelfAttribute", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        setId(com.tencent.mm.R.id.n9a);
        setOrientation(1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getParent_Layout_Padding_Top", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getParent_Layout_Padding_Top$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        jz5.g gVar = R;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getParent_Layout_Padding_Top$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        int intValue = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getParent_Layout_Padding_Top", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        setPadding(0, intValue, 0, 0);
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupSelfAttribute", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildItemView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildHeaderLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        jz5.l lVar = new jz5.l(improveItemHeader, new android.widget.LinearLayout.LayoutParams(-1, -2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildHeaderLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        j(this, lVar, null, 2, null);
        android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(getContext());
        linearLayout3.setClipChildren(false);
        linearLayout3.setClipToPadding(false);
        this.f417511e = linearLayout3;
        linearLayout3.setId(com.tencent.mm.R.id.f487032n95);
        linearLayout3.setOrientation(0);
        tc4.n1 n1Var = G;
        linearLayout3.setPadding(n1Var.c(), 0, n1Var.c(), 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildAvatar", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        getAvatarImage().setId(com.tencent.mm.R.id.f482806od);
        getAvatarImage().setImageResource(com.tencent.mm.R.drawable.bhm);
        com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView avatarImage = getAvatarImage();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAvatar_Description", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAvatar_Description", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAvatar_Description$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        jz5.g gVar2 = H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAvatar_Description$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        java.lang.CharSequence charSequence = (java.lang.String) ((jz5.n) gVar2).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvatar_Description", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAvatar_Description", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        avatarImage.setContentDescription(charSequence);
        getAvatarImage().setPadding(n1Var.e(), n1Var.e(), n1Var.e(), n1Var.e());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(n1Var.a(), n1Var.a());
        layoutParams.setMargins(0, 0, 0, 0);
        jz5.l lVar2 = new jz5.l(getAvatarImage(), layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildAvatar", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        i(lVar2, linearLayout3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildRightPanelLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        boolean z17 = com.tencent.mm.plugin.sns.ui.improve.component.u.f169000d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
        if (z17) {
            int d17 = n1Var.d();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
            i17 = d17;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
            i17 = -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.TimelineItemBuild", "buildRightPanelLayout: width=" + i17 + ", enableLargeUI:" + z17);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(i17, -2);
        layoutParams2.setMarginStart(n1Var.f());
        jz5.l lVar3 = new jz5.l(getRightPanelLayout(), layoutParams2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildRightPanelLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        i(lVar3, linearLayout3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupRightPanelDetailLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildNickNameLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        getNickNameText().setId(com.tencent.mm.R.id.kbq);
        getNickNameText().setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.Link_100));
        getNickNameText().setTextSize(0, i65.a.p(getContext(), com.tencent.mm.R.dimen.f479897ia));
        getNickNameText().setSingleLine(true);
        getNickNameText().setEllipsize(android.text.TextUtils.TruncateAt.END);
        getNickNameText().setClickable(true);
        getNickNameText().setOnTouchListener(new com.tencent.mm.plugin.sns.ui.p5());
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams3 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(0, -2);
        layoutParams3.f10906q = 0;
        layoutParams3.f10893h = 0;
        layoutParams3.setMargins(0, n1Var.e(), i65.a.h(getContext(), com.tencent.mm.R.dimen.f479928j8), 0);
        getRightPanelLayout().addView(getNickNameText(), layoutParams3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildNickNameLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z18 = ld4.a.f318107c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        if (z18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildDebugTextView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            str = "access$getEnableLargeUI$cp";
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams4 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -2);
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).topMargin = n1Var.h();
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = n1Var.h();
            layoutParams4.f10895i = com.tencent.mm.R.id.kbq;
            jz5.l lVar4 = new jz5.l(getDebugLabel(), layoutParams4);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildDebugTextView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            i(lVar4, getRightPanelLayout());
        } else {
            str = "access$getEnableLargeUI$cp";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContentTextView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        getContentText().setId(com.tencent.mm.R.id.cuf);
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams5 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -2);
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams5).topMargin = m(3);
        layoutParams5.f10906q = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z19 = ld4.a.f318107c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        if (z19) {
            layoutParams5.f10895i = com.tencent.mm.R.id.n97;
        } else {
            layoutParams5.f10895i = com.tencent.mm.R.id.kbq;
        }
        getContentText().setStateChangeListener(new tc4.p1());
        jz5.l lVar5 = new jz5.l(getContentText(), layoutParams5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContentTextView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        i(lVar5, getRightPanelLayout());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processCustomLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        jz5.l k17 = k();
        if (getViewType() != 6) {
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams6 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) k17.f302834e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMiddle_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMiddle_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            jz5.g gVar3 = N;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMiddle_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            int intValue2 = ((java.lang.Number) ((jz5.n) gVar3).getValue()).intValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMiddle_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            i18 = 0;
            layoutParams6.setMargins(0, intValue2, 0, n1Var.h());
        } else {
            i18 = 0;
        }
        ((android.view.View) k17.f302833d).setId(com.tencent.mm.R.id.n96);
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams7 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) k17.f302834e;
        layoutParams7.f10906q = i18;
        layoutParams7.f10895i = com.tencent.mm.R.id.cuf;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processCustomLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        i(k17, getRightPanelLayout());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildFeedAboutLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(getContext());
        linearLayout4.setOrientation(1);
        linearLayout4.setGravity(16);
        linearLayout4.addView(this.f417522s);
        linearLayout4.addView(this.A);
        linearLayout4.addView(this.f417528y);
        linearLayout4.addView(this.f417529z);
        linearLayout4.addView(this.B);
        linearLayout4.addView(this.f417524u);
        linearLayout4.setId(com.tencent.mm.R.id.n98);
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams8 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
        layoutParams8.f10885d = 0;
        layoutParams8.f10895i = com.tencent.mm.R.id.n96;
        jz5.l lVar6 = new jz5.l(linearLayout4, layoutParams8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildFeedAboutLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        i(lVar6, getRightPanelLayout());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildBottomLineLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        java.lang.String str2 = str;
        android.widget.TextView l17 = l(this, true, com.tencent.mm.R.color.FG_2, com.tencent.mm.R.dimen.f479925j4, true, 0, 0, null, 112, null);
        this.f417520q = l17;
        linearLayout.addView(l17, new android.widget.LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(this.f417523t);
        linearLayout.addView(this.f417526w);
        linearLayout.addView(this.f417525v);
        linearLayout.addView(this.f417527x);
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(getContext());
        relativeLayout.setGravity(16);
        relativeLayout.setId(com.tencent.mm.R.id.f487030n93);
        getCommentImage().setId(com.tencent.mm.R.id.f482894r2);
        getCommentImage().setImageDrawable(pc4.d.f353410a.z() ? i65.a.i(getContext(), com.tencent.mm.R.drawable.d4t) : com.tencent.mm.ui.zk.d(getContext(), com.tencent.mm.R.attr.f478401iu));
        android.widget.RelativeLayout.LayoutParams layoutParams9 = new android.widget.RelativeLayout.LayoutParams(m(32), m(20));
        layoutParams9.setMargins(m(10), 0, 0, 0);
        layoutParams9.addRule(21, -1);
        layoutParams9.addRule(15, -1);
        relativeLayout.addView(getCommentImage(), layoutParams9);
        android.widget.RelativeLayout.LayoutParams layoutParams10 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams10.setMarginEnd(i65.a.h(getContext(), com.tencent.mm.R.dimen.f479718db));
        layoutParams10.addRule(15, -1);
        relativeLayout.addView(linearLayout, layoutParams10);
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams11 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(0, -2);
        layoutParams11.f10885d = 0;
        layoutParams11.f10891g = 0;
        layoutParams11.f10895i = com.tencent.mm.R.id.n98;
        layoutParams11.setMargins(0, n1Var.g(), 0, 0);
        jz5.l lVar7 = new jz5.l(relativeLayout, layoutParams11);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildBottomLineLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        i(lVar7, getRightPanelLayout());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams12 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(0, -2);
        layoutParams12.f10885d = 0;
        layoutParams12.f10891g = 0;
        layoutParams12.f10895i = com.tencent.mm.R.id.f487030n93;
        jz5.l lVar8 = new jz5.l(this.C, layoutParams12);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        i(lVar8, getRightPanelLayout());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildTip", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams13 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(0, -2);
        layoutParams13.f10885d = 0;
        layoutParams13.f10891g = 0;
        layoutParams13.f10895i = com.tencent.mm.R.id.f487031n94;
        jz5.l lVar9 = new jz5.l(improveItemFooter, layoutParams13);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildTip", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        i(lVar9, getRightPanelLayout());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupRightPanelDetailLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        boolean z27 = com.tencent.mm.plugin.sns.ui.improve.component.u.f169000d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
        int i27 = z27 ? -2 : -1;
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.TimelineItemBuild", "getContentLayoutParams: enableLargeUI=" + z27 + ", lp width:" + i27);
        android.widget.LinearLayout.LayoutParams layoutParams14 = new android.widget.LinearLayout.LayoutParams(i27, -2);
        if (z27) {
            i19 = 1;
            layoutParams14.gravity = 1;
        } else {
            i19 = 1;
            layoutParams14.gravity = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
        j(this, new jz5.l(linearLayout3, layoutParams14), null, 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildDivider", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        view.setBackgroundColor(i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.BW_90));
        android.widget.LinearLayout.LayoutParams layoutParams15 = new android.widget.LinearLayout.LayoutParams(-1, i19);
        layoutParams15.setMargins(0, id4.s.f290944d.a(), 0, 0);
        jz5.l lVar10 = new jz5.l(view, layoutParams15);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildDivider", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        j(this, lVar10, null, 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildItemView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.TimelineItemBuild", "buildItemView cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public static /* synthetic */ void j(tc4.x1 x1Var, jz5.l lVar, android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addCustomView$default", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCustomView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCustomView$default", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            throw unsupportedOperationException;
        }
        if ((i17 & 2) != 0) {
            viewGroup = x1Var;
        }
        x1Var.i(lVar, viewGroup);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCustomView$default", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public static android.widget.TextView l(tc4.x1 x1Var, boolean z17, int i17, int i18, boolean z18, int i19, int i27, java.lang.String contentDescription, int i28, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createImproveTextView$default", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createImproveTextView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createImproveTextView$default", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            throw unsupportedOperationException;
        }
        if ((i28 & 8) != 0) {
            z18 = true;
        }
        if ((i28 & 16) != 0) {
            i19 = -1;
        }
        if ((i28 & 32) != 0) {
            i27 = 0;
        }
        if ((i28 & 64) != 0) {
            contentDescription = "";
        }
        x1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createImproveTextView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        kotlin.jvm.internal.o.g(contentDescription, "contentDescription");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.TimelineItemBuild", "createImproveTextView: ");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView = new com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView(x1Var.getContext());
        if (z17) {
            improveTextView.setSingleLine();
        }
        improveTextView.setTextColor(i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, i17));
        if (z18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSpecialTextSize", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            improveTextView.setTextSize(0, java.lang.Math.min(i65.a.f(x1Var.getContext(), i18) * i65.a.t(x1Var.getContext()), i65.a.p(x1Var.getContext(), i18)));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSpecialTextSize", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        } else {
            improveTextView.setTextSize(0, i65.a.p(x1Var.getContext(), i18));
        }
        if (i19 > 0) {
            improveTextView.setId(i19);
        }
        if (i27 != 0) {
            improveTextView.setBackgroundResource(i27);
        }
        if (!kotlin.jvm.internal.o.b(contentDescription, "")) {
            improveTextView.setContentDescription(contentDescription);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createImproveTextView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createImproveTextView$default", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return improveTextView;
    }

    public final android.view.View getAddressStub() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAddressStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.f417523t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAddressStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final android.view.View getAppNameStub() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.f417528y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView getAvatarImage() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAvatarImage", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView snsAvatarImageView = (com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView) ((jz5.n) this.f417512f).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvatarImage", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return snsAvatarImageView;
    }

    public final android.widget.LinearLayout getCommentContainer() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.widget.LinearLayout linearLayout = this.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return linearLayout;
    }

    public final android.widget.ImageView getCommentImage() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentImage", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f417521r).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentImage", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return imageView;
    }

    public final com.tencent.mm.plugin.sns.ui.AsyncTextView getCompanyNameText() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCompanyNameText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.tencent.mm.plugin.sns.ui.AsyncTextView asyncTextView = (com.tencent.mm.plugin.sns.ui.AsyncTextView) ((jz5.n) this.f417515i).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCompanyNameText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return asyncTextView;
    }

    public final android.view.ViewGroup getContentContainer() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.ViewGroup viewGroup = this.f417511e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return viewGroup;
    }

    public final com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView getContentText() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView) ((jz5.n) this.f417518o).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return improveContentView;
    }

    public final com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView getDebugLabel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDebugLabel", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView) ((jz5.n) this.f417516m).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDebugLabel", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return improveTextView;
    }

    public final android.view.View getDelIconStub() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDelIconStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.f417527x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDelIconStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final android.view.View getDivider() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDivider", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDivider", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final android.view.View getFestivalStub() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFestivalStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFestivalStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final android.view.View getGameAboutStub() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGameAboutStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.f417522s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGameAboutStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final android.view.View getGroupImageStub() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroupImageStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.f417525v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupImageStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter getItemFooter() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemFooter", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemFooter", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return this.E;
    }

    public final com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemHeader getItemHeader() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemHeader", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemHeader", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return this.D;
    }

    public final androidx.lifecycle.y getLifecycleOwner() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLifecycleOwner", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLifecycleOwner", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return this.f417510d;
    }

    public final android.view.ViewGroup.LayoutParams getMatchWidthWrapHeightParams() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMatchWidthWrapHeightParams", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMatchWidthWrapHeightParams", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return layoutParams;
    }

    public final com.tencent.mm.plugin.sns.ui.AsyncTextView getNickNameText() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNickNameText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.tencent.mm.plugin.sns.ui.AsyncTextView asyncTextView = (com.tencent.mm.plugin.sns.ui.AsyncTextView) ((jz5.n) this.f417514h).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNickNameText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return asyncTextView;
    }

    public final android.widget.TextView getPublishTimeText() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPublishTimeText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.widget.TextView textView = this.f417520q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPublishTimeText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return textView;
    }

    public final androidx.constraintlayout.widget.ConstraintLayout getRightPanelLayout() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRightPanelLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) ((jz5.n) this.f417513g).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRightPanelLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return constraintLayout;
    }

    public final android.view.View getShopNameStub() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShopNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.f417529z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShopNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final android.view.View getStarIconStub() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarIconStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.f417526w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarIconStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final android.widget.LinearLayout getSubLayout() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSubLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.widget.LinearLayout linearLayout = this.f417519p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return linearLayout;
    }

    public abstract int getViewType();

    public final nd4.g getWeComTagImage() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWeComTagImage", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        nd4.g gVar = (nd4.g) ((jz5.n) this.f417517n).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWeComTagImage", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return gVar;
    }

    public final android.view.View getWeappView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWeappView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWeappView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final android.view.View getWithFriendStub() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWithFriendStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.f417524u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWithFriendStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final void i(jz5.l pair, android.view.ViewGroup view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        kotlin.jvm.internal.o.g(pair, "pair");
        kotlin.jvm.internal.o.g(view, "view");
        view.addView((android.view.View) pair.f302833d, (android.view.ViewGroup.LayoutParams) pair.f302834e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public abstract jz5.l k();

    public final int m(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dip", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dip", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return b17;
    }

    public abstract java.lang.String name();

    public final void setAddressStub(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAddressStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.f417523t = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAddressStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setAppNameStub(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAppNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.f417528y = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAppNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setCommentContainer(android.widget.LinearLayout linearLayout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        kotlin.jvm.internal.o.g(linearLayout, "<set-?>");
        this.C = linearLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setContentContainer(android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        this.f417511e = viewGroup;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setDelIconStub(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDelIconStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.f417527x = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDelIconStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setFestivalStub(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFestivalStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.B = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFestivalStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setGameAboutStub(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGameAboutStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.f417522s = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGameAboutStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setGroupImageStub(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGroupImageStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.f417525v = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGroupImageStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setPublishTimeText(android.widget.TextView textView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPublishTimeText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        this.f417520q = textView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPublishTimeText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setShopNameStub(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShopNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.f417529z = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShopNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setStarIconStub(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStarIconStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.f417526w = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStarIconStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setWeappView(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWeappView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.A = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWeappView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setWithFriendStub(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWithFriendStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.f417524u = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWithFriendStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }
}
