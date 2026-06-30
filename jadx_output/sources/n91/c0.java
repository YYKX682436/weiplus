package n91;

/* loaded from: classes7.dex */
public final class c0 implements n91.f {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.custom_loading.MagicGameLoadingImpl$mWxAudioStateEventListener$1 f335857a;

    /* renamed from: b, reason: collision with root package name */
    public final int f335858b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f335859c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f335860d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.constraintlayout.widget.ConstraintLayout f335861e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.constraintlayout.widget.ConstraintLayout f335862f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f335863g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f335864h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f335865i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f335866j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f335867k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.ui.widget.RoundCornerLinearLayout f335868l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView f335869m;

    /* renamed from: n, reason: collision with root package name */
    public n91.e f335870n;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.appbrand.custom_loading.MagicGameLoadingImpl$mWxAudioStateEventListener$1] */
    public c0() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        ?? r17 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WxAudioStateEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.custom_loading.MagicGameLoadingImpl$mWxAudioStateEventListener$1
            {
                this.__eventId = -1479723090;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WxAudioStateEvent wxAudioStateEvent) {
                com.tencent.mm.autogen.events.WxAudioStateEvent event = wxAudioStateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                event.f54993g.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingImpl", "WxAudioStateEvent CREATE");
                com.tencent.mm.autogen.events.CustomLoadingStateEvent customLoadingStateEvent = new com.tencent.mm.autogen.events.CustomLoadingStateEvent();
                customLoadingStateEvent.f54078g.f7690a = 0;
                customLoadingStateEvent.e();
                return false;
            }
        };
        this.f335857a = r17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingImpl", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        com.tencent.mm.autogen.events.CustomLoadingStateEvent customLoadingStateEvent = new com.tencent.mm.autogen.events.CustomLoadingStateEvent();
        customLoadingStateEvent.f54078g.f7690a = 0;
        customLoadingStateEvent.e();
        r17.alive();
        this.f335858b = 11;
        this.f335859c = "MagicGameLoading";
    }
}
