package df2;

/* loaded from: classes3.dex */
public final class n00 extends if2.b implements com.tencent.mm.app.t2 {

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f230826m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f230827n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n00(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230826m = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if ((r4 != null && r4.X()) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6() {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.n00.Z6():void");
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        Z6();
        com.tencent.mars.xlog.Log.i("AnchorForegroundServiceController", "onAppBackground: " + str);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("AnchorForegroundServiceController", "unBindForegroundServiceIfNeed, isBindForegroundService:" + this.f230827n);
        if (this.f230827n) {
            try {
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.live.core.mini.LiveTRTCForegroundService.class);
                com.tencent.mm.sdk.platformtools.x2.f193071a.stopService(intent);
                z17 = true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("AnchorForegroundServiceController", e17, "unBind foreground service error: %s", e17.getMessage());
                z17 = false;
            }
            com.tencent.mars.xlog.Log.i("AnchorForegroundServiceController", "unBindForegroundServiceIfNeed res: " + z17);
            if (z17) {
                this.f230827n = false;
            }
        }
        com.tencent.mars.xlog.Log.i("AnchorForegroundServiceController", "onAppForeground: " + str);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        super.onLiveActivate();
        com.tencent.mm.app.w.INSTANCE.a(this);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        com.tencent.mm.app.w.INSTANCE.p(this);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        android.content.Context context = pluginLayout.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        java.lang.String name = activity != null ? activity.getClass().getName() : null;
        if (name == null) {
            name = "";
        }
        this.f230826m = name;
        com.tencent.mars.xlog.Log.i("AnchorForegroundServiceController", "bind actName: " + this.f230826m);
    }
}
