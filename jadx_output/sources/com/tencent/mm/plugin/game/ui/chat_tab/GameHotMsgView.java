package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class GameHotMsgView extends com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView {

    /* renamed from: l2, reason: collision with root package name */
    public static final /* synthetic */ int f141122l2 = 0;

    /* renamed from: f2, reason: collision with root package name */
    public android.content.Context f141123f2;

    /* renamed from: g2, reason: collision with root package name */
    public long f141124g2;

    /* renamed from: h2, reason: collision with root package name */
    public long f141125h2;

    /* renamed from: i2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.chat_tab.z f141126i2;

    /* renamed from: j2, reason: collision with root package name */
    public final l75.q0 f141127j2;

    /* renamed from: k2, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.event.IListenerMStorage f141128k2;

    public GameHotMsgView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f141127j2 = new com.tencent.mm.plugin.game.ui.chat_tab.u(this);
        this.f141128k2 = new com.tencent.mm.pluginsdk.event.IListenerMStorage() { // from class: com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView.2
            @Override // com.tencent.mm.pluginsdk.event.IListenerMStorage
            public void c(com.tencent.mm.sdk.event.IEvent iEvent) {
                if (iEvent instanceof com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent) {
                    int i17 = com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView.f141122l2;
                    com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView.this.l1();
                }
            }
        };
        h1();
    }

    public final void h1() {
        android.content.Context context = getContext();
        this.f141123f2 = context;
        this.f141124g2 = ((android.app.Activity) context).getIntent().getLongExtra("game_report_sourceid", 0L);
        this.f141125h2 = ((android.app.Activity) this.f141123f2).getIntent().getLongExtra("game_report_ssid", 0L);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this.f141123f2);
        linearLayoutManager.Q(0);
        setLayoutManager(linearLayoutManager);
        com.tencent.mm.plugin.game.ui.chat_tab.z zVar = new com.tencent.mm.plugin.game.ui.chat_tab.z(this);
        this.f141126i2 = zVar;
        setAdapter(zVar);
        l1();
    }

    public final void l1() {
        u53.a0 a0Var = (u53.a0) i95.n0.c(u53.a0.class);
        com.tencent.mm.plugin.game.ui.chat_tab.w wVar = new com.tencent.mm.plugin.game.ui.chat_tab.w(this);
        ((z53.q) a0Var).getClass();
        z53.o.f470261a.c(0, 15, new z53.p(wVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).wi(this.f141127j2);
        com.tencent.mm.pluginsdk.event.IListenerMStorage.d(com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent.class.getName(), this.f141128k2);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameHotMsgView", "onAttachedToWindow");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Vi(this.f141127j2);
        com.tencent.mm.pluginsdk.event.IListenerMStorage.e(com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent.class.getName(), this.f141128k2);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameHotMsgView", "onDetachedFromWindow");
    }

    public GameHotMsgView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f141127j2 = new com.tencent.mm.plugin.game.ui.chat_tab.u(this);
        this.f141128k2 = new com.tencent.mm.pluginsdk.event.IListenerMStorage() { // from class: com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView.2
            @Override // com.tencent.mm.pluginsdk.event.IListenerMStorage
            public void c(com.tencent.mm.sdk.event.IEvent iEvent) {
                if (iEvent instanceof com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent) {
                    int i172 = com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView.f141122l2;
                    com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView.this.l1();
                }
            }
        };
        h1();
    }
}
