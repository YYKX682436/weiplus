package com.tencent.mm.plugin.finder.live.controller.base;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 $2\u00020\u0001:\u0002%\u001dB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J%\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0007*\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ\u0006\u0010\u0012\u001a\u00020\u0011R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;", "Lpf5/f;", "Landroidx/lifecycle/l1;", "getViewModelStore", "Ljz5/f0;", "clear", "Landroidx/lifecycle/c1;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "bu", "business", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomController;", "controller", "(Ljava/lang/Class;)Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomController;", "", "getKey", "", "hasInitialized", "Lgk2/e;", "liveRoomData", "Lgk2/e;", "getLiveRoomData", "()Lgk2/e;", "Ljava/util/HashSet;", "controllers", "Ljava/util/HashSet;", "getControllers", "()Ljava/util/HashSet;", "Lif2/c0;", "storeMap", "Lif2/c0;", "viewModel", "Landroidx/lifecycle/l1;", "<init>", "(Lgk2/e;)V", "Companion", "if2/b0", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LiveRoomControllerStore implements pf5.f {
    public static final if2.b0 Companion = new if2.b0(null);
    private static final java.lang.String TAG = "Finder.LiveRoomControllerStore";
    private final java.util.HashSet<com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController> controllers;
    private final gk2.e liveRoomData;
    private final if2.c0 storeMap;
    private final androidx.lifecycle.l1 viewModel;

    public LiveRoomControllerStore(gk2.e liveRoomData) {
        kotlin.jvm.internal.o.g(liveRoomData, "liveRoomData");
        this.liveRoomData = liveRoomData;
        this.controllers = new java.util.HashSet<>();
        if2.c0 c0Var = new if2.c0(hashCode());
        this.storeMap = c0Var;
        androidx.lifecycle.l1 l1Var = new androidx.lifecycle.l1();
        this.viewModel = l1Var;
        java.lang.String str = TAG;
        com.tencent.mars.xlog.Log.i(str, "init " + hashCode() + " check map " + c0Var);
        java.lang.reflect.Field declaredField = androidx.lifecycle.l1.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        java.lang.Object obj = declaredField.get(l1Var);
        declaredField.set(l1Var, c0Var);
        com.tencent.mars.xlog.Log.i(str, "init check map srcMap1:" + obj.hashCode() + " srcMap2:" + declaredField.get(l1Var).hashCode() + " storeMap:" + c0Var.hashCode());
    }

    public final <T extends androidx.lifecycle.c1> T business(java.lang.Class<T> bu6) {
        kotlin.jvm.internal.o.g(bu6, "bu");
        return (T) this.liveRoomData.a(bu6);
    }

    public final void clear() {
        com.tencent.mars.xlog.Log.i(TAG, "clear " + this.storeMap.size() + ", " + this.controllers.size());
        try {
            java.util.LinkedList<com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController> linkedList = new java.util.LinkedList();
            java.util.Iterator<T> it = this.controllers.iterator();
            while (it.hasNext()) {
                linkedList.add((com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) it.next());
            }
            this.controllers.clear();
            for (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController : linkedList) {
                com.tencent.mars.xlog.Log.i(TAG, "[clear] " + liveRoomController.hashCode());
                liveRoomController.onLiveDeactivate();
            }
            this.storeMap.clear();
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "LiveRoomControllerStore clear");
        }
    }

    public final <T extends com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController> T controller(java.lang.Class<T> bu6) {
        kotlin.jvm.internal.o.g(bu6, "bu");
        java.lang.String key = getKey(bu6);
        if (this.storeMap.containsKey(key)) {
            Companion.getClass();
            return (T) new androidx.lifecycle.j1(getViewModel(), new if2.a0(this)).b(key, bu6);
        }
        com.tencent.mars.xlog.Log.e(TAG, "get controller but not exist, key:" + key);
        return null;
    }

    public final java.util.HashSet<com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController> getControllers() {
        return this.controllers;
    }

    public final <T extends com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController> java.lang.String getKey(java.lang.Class<T> bu6) {
        kotlin.jvm.internal.o.g(bu6, "bu");
        java.lang.String canonicalName = bu6.getCanonicalName();
        if (canonicalName == null || canonicalName.length() == 0) {
            pm0.z.b(xy2.b.f458155b, "LiveRoomController_getKey_invalid", false, null, null, false, false, null, 124, null);
        }
        return "LiveRoomControllerStore:" + canonicalName;
    }

    public final gk2.e getLiveRoomData() {
        return this.liveRoomData;
    }

    @Override // androidx.lifecycle.m1
    /* renamed from: getViewModelStore, reason: from getter */
    public androidx.lifecycle.l1 getViewModel() {
        return this.viewModel;
    }

    public final boolean hasInitialized() {
        return !this.storeMap.isEmpty();
    }
}
