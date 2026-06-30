package ue2;

/* loaded from: classes3.dex */
public class o extends com.tencent.mm.plugin.finder.live.view.k0 implements io0.a {

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.String f426827y = "Finder.FinderLiveChatAnchorPluginLayout@" + new ue2.a(null).hashCode();

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f426828d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f426829e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f426830f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f426831g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f426832h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.constraintlayout.widget.ConstraintLayout f426833i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f426834m;

    /* renamed from: n, reason: collision with root package name */
    public wm2.n f426835n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f426836o;

    /* renamed from: p, reason: collision with root package name */
    public ue2.e0 f426837p;

    /* renamed from: q, reason: collision with root package name */
    public ue2.h0 f426838q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f426839r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.live.core.view.LivePreviewView f426840s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f426841t;

    /* renamed from: u, reason: collision with root package name */
    public tn0.w0 f426842u;

    /* renamed from: v, reason: collision with root package name */
    public ue2.x f426843v;

    /* renamed from: w, reason: collision with root package name */
    public final int f426844w;

    /* renamed from: x, reason: collision with root package name */
    public final int f426845x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.ui.MMActivity context, androidx.fragment.app.Fragment fragment, android.util.AttributeSet attributeSet) {
        super(context, fragment, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f426844w = 17;
        this.f426845x = 3;
    }

    private final hn0.f getCameraOpManager() {
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var != null) {
            return w0Var.f420773t;
        }
        return null;
    }

    private final int getContextRotate() {
        int i17;
        android.content.Context context = getContext();
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiveCoreAnchor", "Context is not Activity, using default rotation");
            return 0;
        }
        android.app.Activity activity = (android.app.Activity) context;
        kotlin.jvm.internal.o.g(activity, "activity");
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            i17 = 90;
        } else if (rotation == 2) {
            i17 = 180;
        } else {
            if (rotation != 3) {
                return 0;
            }
            i17 = 270;
        }
        return i17;
    }

    private final int getCurrentPullSource() {
        android.content.Intent intent;
        androidx.fragment.app.Fragment uicFragment = getUicFragment();
        android.os.Bundle arguments = uicFragment != null ? uicFragment.getArguments() : null;
        if (arguments == null || (intent = (android.content.Intent) arguments.getParcelable("KEY_PARAMS_LIVE_FROM_NEARBY_CHAT_INNER_INTENT")) == null) {
            return 1;
        }
        int intExtra = intent.getIntExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_PULL_SOURCE", 1);
        com.tencent.mars.xlog.Log.i(f426827y, "getCurrentPullSource: pullSource=" + intExtra);
        return intExtra;
    }

    private final long getEntranceId() {
        android.content.Intent intent;
        androidx.fragment.app.Fragment uicFragment = getUicFragment();
        android.os.Bundle arguments = uicFragment != null ? uicFragment.getArguments() : null;
        if (arguments == null || (intent = (android.content.Intent) arguments.getParcelable("KEY_PARAMS_LIVE_FROM_NEARBY_CHAT_INNER_INTENT")) == null) {
            return 0L;
        }
        long longExtra = intent.getLongExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", 0L);
        com.tencent.mars.xlog.Log.i(f426827y, "getEntranceId: entranceId=" + longExtra);
        return longExtra;
    }

    private final ya2.b2 getSelfContact() {
        return ((mm2.c1) business(mm2.c1.class)).J4;
    }

    public static final void r(ue2.o oVar) {
        rg2.a aVar;
        oVar.getClass();
        w(oVar, 13L, null, 2, null);
        if (!(oVar.getUicFragment() instanceof com.tencent.mm.plugin.finder.live.fragment.FinderLiveChatFragment) || (aVar = ((com.tencent.mm.plugin.finder.live.fragment.FinderLiveChatFragment) oVar.getUicFragment()).f111652n) == null) {
            return;
        }
        ((sp2.u2) aVar).f411229a.b(null);
    }

    public static final void s(ue2.o oVar) {
        rg2.a aVar;
        oVar.getClass();
        w(oVar, 4L, null, 2, null);
        if (!(oVar.getUicFragment() instanceof com.tencent.mm.plugin.finder.live.fragment.FinderLiveChatFragment) || (aVar = ((com.tencent.mm.plugin.finder.live.fragment.FinderLiveChatFragment) oVar.getUicFragment()).f111652n) == null) {
            return;
        }
        sp2.u2 u2Var = (sp2.u2) aVar;
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
        ml2.y4 y4Var = ml2.j0.f327583i;
        ml2.y3 y3Var = ml2.y3.f328281s;
        y4Var.m(y3Var);
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
        y4Var.f328291c0 = y3Var;
        com.tencent.mm.ui.MMActivity mMActivity = u2Var.f411230b;
        sp2.d3 d3Var = u2Var.f411229a;
        d3Var.b(new sp2.t2(mMActivity, d3Var, u2Var.f411231c, u2Var.f411232d));
    }

    private final void setupDialogButtonListeners(android.view.ViewGroup viewGroup) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewGroup.findViewById(com.tencent.mm.R.id.spd);
        android.widget.Button button = (android.widget.Button) viewGroup.findViewById(com.tencent.mm.R.id.sp7);
        linearLayout.setOnClickListener(new ue2.l(this));
        button.setOnClickListener(new ue2.m(this));
    }

    public static void t(ue2.o oVar, boolean z17, int i17, java.lang.Object obj) {
        kn0.p c17;
        kn0.p c18;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeCamera");
        }
        mm2.c1 c1Var = (mm2.c1) oVar.business(mm2.c1.class);
        int i18 = (int) ((mm2.c1) oVar.business(mm2.c1.class)).f328866q;
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        c1Var.p8(i18 | 256);
        com.tencent.mm.plugin.finder.live.util.n2.f115640a.e("closeCamera", (int) ((mm2.c1) oVar.business(mm2.c1.class)).f328866q);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", true);
        hn0.f cameraOpManager = oVar.getCameraOpManager();
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", (cameraOpManager == null || (c18 = ((hn0.p) cameraOpManager).c()) == null) ? false : c18.f309589i);
        oVar.statusChange(qo0.b.f365366i4, bundle);
        hn0.f cameraOpManager2 = oVar.getCameraOpManager();
        if (cameraOpManager2 != null && (c17 = ((hn0.p) cameraOpManager2).c()) != null) {
            c17.l();
        }
        oVar.D();
        oVar.E();
        if (oVar.f426836o) {
            com.tencent.mars.xlog.Log.i(f426827y, "closeCamera: 从视频模式切换到音频模式，当前正在显示美颜面板，需要隐藏");
            oVar.B();
        }
    }

    public static /* synthetic */ void w(ue2.o oVar, long j17, java.util.Map map, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21017");
        }
        if ((i17 & 2) != 0) {
            map = null;
        }
        oVar.v(j17, map);
    }

    public final void A() {
        hn0.f fVar;
        ue2.e0 e0Var = this.f426837p;
        if (e0Var != null && e0Var.f426808h) {
            return;
        }
        java.lang.String str = f426827y;
        com.tencent.mars.xlog.Log.i(str, "showChatDialogAndStartPreview: 开始显示弹窗和预览");
        w(this, 3L, null, 2, null);
        ue2.e0 e0Var2 = this.f426837p;
        if (e0Var2 != null) {
            e0Var2.b();
        }
        if (this.f426839r) {
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "startPreviewIfNeeded: 开始预览初始化");
        if (((mm2.o4) business(mm2.o4.class)).A.getValue() == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str2 = ((mm2.e1) business(mm2.e1.class)).f328987q.f380301n;
            if (str2 == null) {
                str2 = "DEFAULT_ANCHOR_USER_ID";
            }
            arrayList.add(new jo0.a(str2, new hn5.b(0.0f, 0.0f, 1.0f, 1.0f), false));
            android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mm.live.core.view.LivePreviewView livePreviewView = this.f426840s;
            if (livePreviewView != null) {
                livePreviewView.d(arrayList, new android.graphics.Rect(0, 0, b17.x, b17.y), false);
            }
            com.tencent.mars.xlog.Log.i(str, "createDefaultAnchorView: 创建默认主播视图，userId=".concat(str2));
        }
        com.tencent.mars.xlog.Log.i(str, "startPreview: fromMiniWindow=false, checkMode=false");
        tn0.w0 w0Var = this.f426842u;
        if (w0Var != null && (fVar = w0Var.f420773t) != null) {
            ((hn0.p) fVar).i(dk2.ef.f233372a.F());
        }
        int contextRotate = getContextRotate();
        tn0.w0 w0Var2 = this.f426842u;
        if (w0Var2 != null) {
            w0Var2.D0(this.f426840s, ko0.c0.f309825a.b().f319996e, contextRotate);
        }
        in0.q e17 = dk2.ef.f233372a.e();
        int a17 = com.tencent.mm.plugin.finder.live.util.l.f115587a.a(contextRotate, (e17 == null || e17.W()) ? false : true, ((mm2.c1) business(mm2.c1.class)).O7());
        com.tencent.mars.xlog.Log.i(str, "preview cameraRotate: " + a17 + ", contextRotate: " + contextRotate);
        tn0.w0 w0Var3 = this.f426842u;
        if (w0Var3 != null) {
            w0Var3.y0(a17);
        }
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView2 = this.f426840s;
        if (livePreviewView2 != null) {
            livePreviewView2.post(new ue2.n(this));
        }
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView3 = this.f426840s;
        if (livePreviewView3 != null) {
            com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout tRTCVideoRatioLayout = livePreviewView3.renderRatioLayout;
            tRTCVideoRatioLayout.getClass();
            tRTCVideoRatioLayout.f68576o.d(false);
        }
        this.f426839r = true;
    }

    public final void B() {
        java.lang.String str = f426827y;
        com.tencent.mars.xlog.Log.i(str, "showDialog: 显示dialog并隐藏美颜面板");
        boolean z17 = false;
        this.f426836o = false;
        wm2.n nVar = this.f426835n;
        if (nVar != null) {
            nVar.a(true, false);
        }
        android.view.View view = this.f426834m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "showDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "showDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup viewGroup = this.f426830f;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        com.tencent.mars.xlog.Log.i(str, "showDialog: 美颜面板已隐藏，切换回dialog模式");
        ue2.h0 h0Var = this.f426838q;
        if (h0Var != null) {
            h0Var.a();
        }
        ue2.e0 e0Var = this.f426837p;
        if (e0Var != null && e0Var.f426808h) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        if (e0Var != null) {
            e0Var.b();
        }
        com.tencent.mars.xlog.Log.i(str, "showChatDialog: 内部弹窗已显示");
    }

    public final void C(boolean z17) {
        r45.kz0 kz0Var;
        androidx.lifecycle.c1 business = business(mm2.c1.class);
        ya2.b2 b2Var = ((mm2.c1) business(mm2.c1.class)).J4;
        if (business == null || b2Var == null) {
            return;
        }
        mm2.c1 c1Var = (mm2.c1) business;
        if (z17) {
            int i17 = (int) b2Var.field_liveAnchorStatusFlag;
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            b2Var.field_liveAnchorStatusFlag = i17 | 256;
        } else {
            int i18 = (int) b2Var.field_liveAnchorStatusFlag;
            java.util.regex.Pattern pattern2 = pm0.v.f356802a;
            b2Var.field_liveAnchorStatusFlag = i18 & (-257);
        }
        ya2.h.f460484a.o(b2Var);
        m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
        long j17 = (I1 == null || (kz0Var = I1.field_liveInfo) == null) ? 0L : kz0Var.getLong(0);
        c1Var.Z9(z17 ? ((int) j17) | 256 : ((int) j17) & (-257));
    }

    public final void D() {
        boolean l76 = ((mm2.c1) business(mm2.c1.class)).l7();
        android.view.View view = this.f426831g;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = view != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.shj) : null;
        if (l76) {
            android.view.View view2 = this.f426831g;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(0.3f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "updateBeautyButtonState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "updateBeautyButtonState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (weImageView == null) {
                return;
            }
            weImageView.setAlpha(0.3f);
            return;
        }
        android.view.View view3 = this.f426831g;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "updateBeautyButtonState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "updateBeautyButtonState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (weImageView == null) {
            return;
        }
        weImageView.setAlpha(1.0f);
    }

    public final void E() {
        boolean l76 = ((mm2.c1) business(mm2.c1.class)).l7();
        android.view.View view = this.f426832h;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = view != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.vbn) : null;
        android.view.View view2 = this.f426832h;
        android.widget.TextView textView = view2 != null ? (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.vbo) : null;
        if (l76) {
            if (weImageView != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.video_off_filled);
            }
            if (textView == null) {
                return;
            }
            textView.setText(getContext().getResources().getString(com.tencent.mm.R.string.opm));
            return;
        }
        if (weImageView != null) {
            weImageView.setImageResource(com.tencent.mm.R.raw.video_filled);
        }
        if (textView == null) {
            return;
        }
        textView.setText(getContext().getResources().getString(com.tencent.mm.R.string.opn));
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void bindData(km2.m data) {
        int i17;
        android.widget.TextView textView;
        kotlin.jvm.internal.o.g(data, "data");
        super.bindData(data);
        this.f426841t = findViewById(com.tencent.mm.R.id.f484594th2);
        java.lang.String str = f426827y;
        com.tencent.mars.xlog.Log.i(str, "bindData: 开始初始化直播预览组件");
        if (in0.q.f292769b2 == null) {
            in0.q.f292769b2 = new in0.q(rn0.a.f397609a.a());
        }
        in0.q qVar = in0.q.f292769b2;
        kotlin.jvm.internal.o.d(qVar);
        this.f426842u = qVar;
        qVar.z0(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setupConfig selfContact.anchorStatus:");
        ya2.b2 selfContact = getSelfContact();
        sb6.append(selfContact != null ? java.lang.Long.valueOf(selfContact.field_liveAnchorStatusFlag) : null);
        sb6.append(" switchFlag:");
        ya2.b2 selfContact2 = getSelfContact();
        sb6.append(selfContact2 != null ? java.lang.Long.valueOf(selfContact2.field_liveSwitchFlag) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        mm2.c1 c1Var = (mm2.c1) business(mm2.c1.class);
        ya2.g gVar = ya2.h.f460484a;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        c1Var.J4 = gVar.b(xy2.c.e(context));
        mm2.c1 c1Var2 = (mm2.c1) business(mm2.c1.class);
        if (((mm2.c1) business(mm2.c1.class)).f328872r > 0) {
            i17 = ((mm2.c1) business(mm2.c1.class)).f328872r;
        } else {
            ya2.b2 b2Var = ((mm2.c1) business(mm2.c1.class)).J4;
            i17 = (int) (b2Var != null ? b2Var.field_liveAnchorStatusFlag : 0L);
        }
        c1Var2.p8(i17);
        com.tencent.mm.plugin.finder.live.util.n2.f115640a.e("onBindData", (int) ((mm2.c1) business(mm2.c1.class)).f328866q);
        ((mm2.c1) business(mm2.c1.class)).D8(0);
        ((mm2.c1) business(mm2.c1.class)).p8(((int) ((mm2.c1) business(mm2.c1.class)).f328866q) & (-257));
        C(false);
        zl2.r4 r4Var = zl2.r4.f473950a;
        ya2.b2 selfContact3 = getSelfContact();
        if (!pm0.v.z((int) (selfContact3 != null ? selfContact3.field_liveSwitchFlag : 0L), 8) || !r4Var.j()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
            statusChange(qo0.b.f365366i4, bundle);
        }
        com.tencent.mars.xlog.Log.i(str, "initializeCoreComponents: 核心组件初始化完成，enableAudioMode=" + ((mm2.c1) business(mm2.c1.class)).l7());
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView = (com.tencent.mm.live.core.view.LivePreviewView) findViewById(com.tencent.mm.R.id.icy);
        if (livePreviewView != null) {
            livePreviewView.setPluginCallback(this);
        } else {
            livePreviewView = null;
        }
        this.f426840s = livePreviewView;
        this.f426828d = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.l3x);
        this.f426829e = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.f484593th1);
        this.f426830f = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f483432au0);
        this.f426831g = findViewById(com.tencent.mm.R.id.shi);
        this.f426832h = findViewById(com.tencent.mm.R.id.vbm);
        this.f426834m = findViewById(com.tencent.mm.R.id.shk);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485639ig1);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ifw);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ify);
        ya2.b2 b2Var2 = ((mm2.c1) business(mm2.c1.class)).J4;
        if (b2Var2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            textView = textView2;
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "initializeTitleBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "initializeTitleBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (textView != null) {
                textView.setText(b2Var2.w0());
            }
            if (imageView != null) {
                java.lang.String u07 = ((mm2.d) business(mm2.d.class)).f328942f || getData().f309129d.f68552v == 4 ? b2Var2.u0() : b2Var2.y0();
                if (u07.length() > 0) {
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    g1Var.a().c(new mn2.n(u07, null, 2, null), imageView, g1Var.h(mn2.f1.f329957h));
                } else {
                    imageView.setImageDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.bhp));
                }
            }
        } else {
            textView = textView2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "initializeTitleBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatAnchorPluginLayout", "initializeTitleBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("initializeTitleBar: 标题栏初始化完成 - 主播昵称: ");
        sb7.append((java.lang.Object) (textView != null ? textView.getText() : null));
        com.tencent.mars.xlog.Log.i(str, sb7.toString());
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.enu);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f426843v = new ue2.x((android.view.ViewGroup) findViewById2, this);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) findViewById(com.tencent.mm.R.id.tgi);
        this.f426833i = constraintLayout;
        if (constraintLayout != null) {
            wm2.n nVar = new wm2.n(constraintLayout);
            this.f426835n = nVar;
            nVar.f447259i = new ue2.f(this);
            com.tencent.mars.xlog.Log.i(str, "initializeBeautyPanel: 美颜面板初始化完成");
        }
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ue2.e0 e0Var = new ue2.e0(context2);
        e0Var.setInternalDialogListener(new ue2.g(this));
        this.f426837p = e0Var;
        android.content.Context context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        this.f426838q = new ue2.h0(context3, this.f426828d, this.f426837p, this.f426841t, this.f426829e);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.e9e, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        ue2.e0 e0Var2 = this.f426837p;
        if (e0Var2 != null) {
            e0Var2.setContentView(viewGroup);
        }
        setupDialogButtonListeners(viewGroup);
        android.view.View view = this.f426841t;
        android.view.ViewGroup viewGroup2 = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.f426837p);
        }
        com.tencent.mars.xlog.Log.i(str, "initializeInternalDialog: 内部弹窗初始化完成（外部定义UI内容）");
        android.view.View view2 = this.f426831g;
        if (view2 != null) {
            view2.setOnClickListener(new ue2.h(this));
        }
        android.view.View view3 = this.f426832h;
        if (view3 != null) {
            view3.setOnClickListener(new ue2.i(this));
        }
        if (((mm2.c1) business(mm2.c1.class)).l7()) {
            com.tencent.mars.xlog.Log.i(str, "initializeUIComponents: 初始化为音频模式");
            t(this, false, 1, null);
        } else {
            u();
            com.tencent.mars.xlog.Log.i(str, "initializeUIComponents: 初始化为视频模式");
        }
        D();
        if (ko0.l.f309870a.c()) {
            com.tencent.mars.xlog.Log.i(str, "initializeUIComponents: 当前资源可用，无需下载");
        } else {
            com.tencent.mars.xlog.Log.i(str, "initializeUIComponents: 当前资源不可用，启动协程下载资源");
            kotlinx.coroutines.l.d(getViewScope(), null, null, new ue2.c(this, null), 3, null);
        }
        z(1, 1);
        z(1, 2);
        com.tencent.mars.xlog.Log.i(str, "initializeUIComponents: UI组件初始化完成");
        com.tencent.mars.xlog.Log.i(str, "bindData: 直播预览组件初始化完成");
    }

    public final int getDisplayMode() {
        return this.f426845x;
    }

    public final int getEntranceType() {
        return this.f426844w;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout, qo0.c
    public int getLiveRole() {
        return 1;
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout
    public int getRelativeLayoutId() {
        return com.tencent.mm.R.layout.e9b;
    }

    @Override // io0.a
    public java.lang.String getSelfUserId() {
        java.lang.String m86 = ((mm2.c1) business(mm2.c1.class)).m8();
        return m86 == null ? "" : m86;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public tn0.w0 getTRTCLiveCore() {
        return this.f426842u;
    }

    @Override // no0.g
    public void onBattleApply() {
    }

    @Override // no0.g
    public void onBattleClose() {
    }

    @Override // no0.g
    public void onBattleDismiss() {
    }

    @Override // no0.g
    public void onBattleEnd() {
    }

    @Override // no0.g
    public void onBattleStart() {
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout
    public void onCallStateChanged(int i17, java.lang.String incomingNumber) {
        kotlin.jvm.internal.o.g(incomingNumber, "incomingNumber");
        com.tencent.mars.xlog.Log.i(f426827y, "onCallStateChanged: state=" + i17);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        ue2.e0 e0Var = this.f426837p;
        boolean z17 = false;
        if (e0Var != null && e0Var.f426808h) {
            z17 = true;
        }
        java.lang.String str = f426827y;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "onConfigurationChanged: 配置变化，重新调整内部弹窗");
            ue2.e0 e0Var2 = this.f426837p;
            if (e0Var2 != null) {
                com.tencent.mars.xlog.Log.i("FinderLiveChatInternalDialog", "onConfigurationChanged: 配置变化，重新调整弹窗");
                android.view.ViewGroup viewGroup = e0Var2.f426805e;
                if (viewGroup != null) {
                    viewGroup.post(new ue2.a0(e0Var2));
                }
            }
        }
        if (this.f426836o) {
            com.tencent.mars.xlog.Log.i(str, "onConfigurationChanged: 配置变化，重新调整美颜面板");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void onLiveEventCallback(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i(f426827y, "onLiveEventCallback: errorCode=" + i17);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void release() {
        android.widget.FrameLayout frameLayout;
        com.tencent.mars.xlog.Log.i(f426827y, "release: 释放资源");
        ue2.e0 e0Var = this.f426837p;
        if (e0Var != null) {
            e0Var.a(false);
        }
        ue2.e0 e0Var2 = this.f426837p;
        if (e0Var2 != null) {
            if (e0Var2.f426808h || e0Var2.f426809i) {
                e0Var2.a(false);
            }
            e0Var2.removeAllViews();
            com.tencent.mars.xlog.Log.i("FinderLiveChatInternalDialog", "release: 内部弹窗资源已释放");
        }
        this.f426837p = null;
        ue2.h0 h0Var = this.f426838q;
        if (h0Var != null && (frameLayout = h0Var.f426817b) != null) {
            frameLayout.setTranslationY(0.0f);
            frameLayout.setTranslationX(0.0f);
            frameLayout.setElevation(0.0f);
        }
        this.f426838q = null;
        ue2.x xVar = this.f426843v;
        if (xVar != null) {
            xVar.K0(8);
            xVar.f426867q.setImageDrawable(null);
        }
        this.f426843v = null;
        this.f426839r = false;
        dk2.ef.S(dk2.ef.f233372a, "chatAnchorRelease", false, getMiniWinPermission(), java.lang.Boolean.TRUE, getFinishActivityNotReleaseLive(), 2, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout, qo0.c
    public void statusChange(qo0.b status, android.os.Bundle bundle) {
        ue2.x xVar;
        kotlin.jvm.internal.o.g(status, "status");
        super.statusChange(status, bundle);
        if (ue2.b.f426795a[status.ordinal()] == 1) {
            boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            boolean z18 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", false) : false;
            com.tencent.mars.xlog.Log.i(f426827y, "FINDER_LIVE_MODE_SWITCH isAudioMode:" + z17 + ", isShareMode:" + z18);
            ue2.x xVar2 = this.f426843v;
            if (xVar2 != null) {
                xVar2.M0(status, bundle);
            }
            if (!z18 || (xVar = this.f426843v) == null) {
                return;
            }
            xVar.K0(4);
        }
    }

    public final void u() {
        kn0.p c17;
        kn0.p c18;
        mm2.c1 c1Var = (mm2.c1) business(mm2.c1.class);
        int i17 = (int) ((mm2.c1) business(mm2.c1.class)).f328866q;
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        c1Var.p8(i17 & (-257));
        com.tencent.mm.plugin.finder.live.util.n2.f115640a.e("openCamera", (int) ((mm2.c1) business(mm2.c1.class)).f328866q);
        android.os.Bundle bundle = new android.os.Bundle();
        boolean z17 = false;
        bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
        hn0.f cameraOpManager = getCameraOpManager();
        if (cameraOpManager != null && (c18 = ((hn0.p) cameraOpManager).c()) != null) {
            z17 = c18.f309589i;
        }
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", z17);
        statusChange(qo0.b.f365366i4, bundle);
        hn0.f cameraOpManager2 = getCameraOpManager();
        if (cameraOpManager2 != null && (c17 = ((hn0.p) cameraOpManager2).c()) != null) {
            c17.m();
        }
        D();
        E();
        if (this.f426836o) {
            com.tencent.mars.xlog.Log.i(f426827y, "openCamera: 从音频模式切换到视频模式，当前正在显示美颜面板");
        }
    }

    public final void v(long j17, java.util.Map map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int i17 = this.f426844w;
        jSONObject.put("entrance_type", i17);
        jSONObject.put("entrance_id", getEntranceId());
        int i18 = this.f426845x;
        jSONObject.put("display_mode", i18);
        jSONObject.put("pull_source", getCurrentPullSource());
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.j5((zy2.zb) c17, j17, jSONObject.toString(), null, 4, null);
        com.tencent.mars.xlog.Log.i(f426827y, "report21017 entranceType=" + i17 + ", entranceId=" + getEntranceId() + ", displayMode=" + i18 + ", pullSource=" + getCurrentPullSource());
    }

    public final void z(int i17, int i18) {
        v(70L, kz5.c1.k(new jz5.l("type", java.lang.String.valueOf(i17)), new jz5.l("element", java.lang.String.valueOf(i18))));
    }
}
