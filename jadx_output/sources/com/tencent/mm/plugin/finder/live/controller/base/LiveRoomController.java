package com.tencent.mm.plugin.finder.live.controller.base;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomController;", "Landroidx/lifecycle/c1;", "", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "bu", "business", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "ctrl", "controller", "(Ljava/lang/Class;)Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomController;", "Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;", "store", "Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;", "getStore", "()Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;", "<init>", "(Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public abstract class LiveRoomController extends androidx.lifecycle.c1 {
    private final com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store;

    public LiveRoomController(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        kotlin.jvm.internal.o.g(store, "store");
        this.store = store;
    }

    public void afterViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
    }

    public final <T extends androidx.lifecycle.c1> T business(java.lang.Class<T> bu6) {
        kotlin.jvm.internal.o.g(bu6, "bu");
        return (T) this.store.business(bu6);
    }

    public final <T extends com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController> T controller(java.lang.Class<T> ctrl) {
        kotlin.jvm.internal.o.g(ctrl, "ctrl");
        return (T) this.store.controller(ctrl);
    }

    public final com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore getStore() {
        return this.store;
    }

    public java.lang.String name() {
        return getClass().getSimpleName();
    }

    public /* bridge */ /* synthetic */ void onFloatMode() {
    }

    public /* bridge */ /* synthetic */ void onLiveActivate() {
    }

    public abstract /* synthetic */ void onLiveDeactivate();

    public /* bridge */ /* synthetic */ void onLiveEnd() {
    }

    public /* bridge */ /* synthetic */ void onLiveMsg(r45.r71 r71Var) {
    }

    public /* bridge */ /* synthetic */ void onLivePause() {
    }

    public /* bridge */ /* synthetic */ void onLiveResume() {
    }

    public /* bridge */ /* synthetic */ void onLiveSquareMode() {
    }

    public /* bridge */ /* synthetic */ void onLiveStart(r45.hc1 hc1Var) {
    }

    public /* bridge */ /* synthetic */ void onLiveStartFromWindow() {
    }

    public /* bridge */ /* synthetic */ void onNormalMode() {
    }

    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
    }

    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
    }
}
