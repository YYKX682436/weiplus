package ue2;

/* loaded from: classes3.dex */
public class q extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f426847d;

    /* renamed from: e, reason: collision with root package name */
    public ue2.o f426848e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f426849f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f426850g;

    /* renamed from: h, reason: collision with root package name */
    public km2.m f426851h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f426847d = "MicroMsg.FinderLiveChatAnchorUIC";
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e9g;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        ue2.o oVar = this.f426848e;
        if (oVar != null) {
            oVar.onActivityResult(i17, i18, intent);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ue2.o oVar = this.f426848e;
        if (oVar != null) {
            oVar.release();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        km2.m mVar;
        ue2.o oVar;
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) contentView.findViewById(com.tencent.mm.R.id.evz);
        this.f426849f = frameLayout;
        java.lang.String str = this.f426847d;
        if (frameLayout == null) {
            com.tencent.mars.xlog.Log.e(str, "finder_live_content_root not found in layout");
            return;
        }
        android.view.View findViewById = contentView.findViewById(com.tencent.mm.R.id.f484712tl0);
        this.f426850g = findViewById;
        if (findViewById == null) {
            com.tencent.mars.xlog.Log.e(str, "finder_live_mask not found in layout");
        } else {
            com.tencent.mars.xlog.Log.i(str, "遮罩层初始化成功");
        }
        android.view.View view = this.f426850g;
        if (view != null) {
            view.setOnClickListener(new ue2.p(this));
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        jz5.f0 f0Var = null;
        this.f426848e = new ue2.o((com.tencent.mm.ui.MMActivity) activity, getFragment(), null);
        androidx.fragment.app.Fragment fragment = getFragment();
        android.os.Bundle arguments = fragment != null ? fragment.getArguments() : null;
        if (arguments == null) {
            com.tencent.mars.xlog.Log.w(str, "No arguments found");
        } else {
            android.content.Intent intent = (android.content.Intent) arguments.getParcelable("KEY_PARAMS_LIVE_FROM_NEARBY_CHAT_INNER_INTENT");
            if (intent == null) {
                com.tencent.mars.xlog.Log.w(str, "No intent found in arguments");
            } else {
                dk2.x4 a17 = dk2.x4.C.a(intent);
                com.tencent.mars.xlog.Log.i(str, "initDataFromArguments: configProvider = " + a17);
                if (a17 == null || !(!a17.f234318l.isEmpty())) {
                    com.tencent.mars.xlog.Log.w(str, "No valid config found in intent");
                    mVar = null;
                } else {
                    com.tencent.mm.live.api.LiveConfig liveConfig = (com.tencent.mm.live.api.LiveConfig) kz5.n0.Z(a17.f234318l);
                    if (liveConfig == null) {
                        liveConfig = com.tencent.mm.live.api.LiveConfig.a("", 0);
                    }
                    mVar = new km2.m(liveConfig);
                }
                this.f426851h = mVar;
                if (mVar != null) {
                    dk2.ef efVar = dk2.ef.f233372a;
                    gk2.e o07 = efVar.o0(mVar);
                    if (o07 == null) {
                        o07 = new gk2.e("FinderLiveAnchorUIC");
                    }
                    km2.m mVar2 = this.f426851h;
                    kotlin.jvm.internal.o.d(mVar2);
                    mVar2.f309132g = new r45.h32();
                    km2.m mVar3 = this.f426851h;
                    kotlin.jvm.internal.o.d(mVar3);
                    mVar3.f309141s = true;
                    km2.n nVar = new km2.n();
                    km2.m mVar4 = this.f426851h;
                    kotlin.jvm.internal.o.d(mVar4);
                    nVar.f309153e = kz5.c0.d(new km2.t(mVar4));
                    efVar.g0(nVar);
                    if (efVar.o0(this.f426851h) == null) {
                        new gk2.e("FinderLiveAnchorUIC");
                    }
                    km2.m mVar5 = this.f426851h;
                    kotlin.jvm.internal.o.d(mVar5);
                    dk2.ef.h(efVar, o07, mVar5.f309131f, this.f426848e, 0, null, 24, null);
                    ((mm2.c1) o07.a(mm2.c1.class)).H3 = a17 != null ? a17.f234319m : 1;
                    ((mm2.s1) o07.a(mm2.s1.class)).R6(intent, a17);
                }
            }
        }
        com.tencent.mars.xlog.Log.i(str, "initializePluginLayout: 创建插件布局实例");
        if (dk2.ef.f233372a.o0(this.f426851h) == null) {
            new gk2.e("FinderLiveAnchorUIC");
        }
        km2.m mVar6 = this.f426851h;
        if (mVar6 != null && (oVar = this.f426848e) != null) {
            oVar.bindData(mVar6);
        }
        android.widget.FrameLayout frameLayout2 = this.f426849f;
        if (frameLayout2 != null) {
            frameLayout2.addView(this.f426848e);
        }
        ue2.o oVar2 = this.f426848e;
        if (oVar2 != null) {
            oVar2.mount();
        }
        com.tencent.mars.xlog.Log.i(str, "initializePluginLayout: 插件布局已添加到容器，触发了layout逻辑");
        ue2.o oVar3 = this.f426848e;
        if (oVar3 != null) {
            oVar3.A();
            com.tencent.mars.xlog.Log.i(str, "showChatDialog: 请求PluginLayout显示弹窗并启动预览");
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(str, "showChatDialog: PluginLayout未初始化");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f426847d = "MicroMsg.FinderLiveChatAnchorUIC";
    }
}
