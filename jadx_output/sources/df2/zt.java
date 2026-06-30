package df2;

/* loaded from: classes3.dex */
public final class zt extends if2.b implements if2.e {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.List f231995o = kz5.c0.i(1, 2, 4, 8, 16, 256);

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.List f231996p = kz5.c0.i(2, 4);

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.List f231997q = kz5.c0.i(1, 8);

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231998m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f231999n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231998m = "Finder.JoinLivePreloadController";
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x029f, code lost:
    
        if (r2 != false) goto L137;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(boolean r11) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.zt.Z6(boolean):void");
    }

    public final void a7() {
        android.content.Intent intent;
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        android.content.Context context = k0Var != null ? k0Var.getContext() : null;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity == null || (intent = mMActivity.getIntent()) == null) {
            return;
        }
        intent.removeExtra("FunctionGuideAction");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onFloatMode() {
        super.onFloatMode();
        this.f231999n = true;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        super.onLiveMsg(r71Var);
        pm0.v.X(new df2.yt(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        Z6(false);
    }

    @Override // if2.e
    public void onNewIntent(android.content.Intent intent) {
        Z6(false);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onNormalMode() {
        super.onNormalMode();
        if (this.f231999n) {
            Z6(false);
            this.f231999n = false;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        if (((mm2.c1) business(mm2.c1.class)).T7()) {
            Z6(false);
        }
    }
}
