package df2;

/* loaded from: classes3.dex */
public final class y9 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231852m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231852m = "Finder.LifeCycleLogController";
    }

    @Override // if2.e
    public void T2(boolean z17, int i17) {
        V6(this.f231852m, "keyboardChange show:" + z17 + ", height:" + i17);
    }

    @Override // if2.e
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        V6(this.f231852m, "onActivityResult requestCode:" + i17 + ", resultCode:" + i18);
    }

    @Override // if2.e
    public boolean onBackPress() {
        V6(this.f231852m, "onBackPress");
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onFloatMode() {
        V6(this.f231852m, "onFloatMode");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        V6(this.f231852m, "onLiveActivate");
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        V6(this.f231852m, "onLiveDeactivate");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveEnd() {
        V6(this.f231852m, "onLiveEnd");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLivePause() {
        V6(this.f231852m, "onLivePause");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveResume() {
        V6(this.f231852m, "onLiveResume");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        V6(this.f231852m, "onLiveStart");
    }

    @Override // if2.e
    public void onNewIntent(android.content.Intent intent) {
        V6(this.f231852m, "onNewIntent");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onNormalMode() {
        V6(this.f231852m, "onNormalMode");
    }

    @Override // if2.e
    public boolean onSwipeBack() {
        V6(this.f231852m, "onSwipeBack");
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        V6(this.f231852m, "onViewMount pluginLayout:" + pluginLayout.hashCode());
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        V6(this.f231852m, "onViewUnmount pluginLayout:" + pluginLayout.hashCode());
    }

    @Override // if2.e
    public void pause() {
        V6(this.f231852m, "pause");
    }

    @Override // if2.e
    public void resume() {
        V6(this.f231852m, "resume");
    }
}
