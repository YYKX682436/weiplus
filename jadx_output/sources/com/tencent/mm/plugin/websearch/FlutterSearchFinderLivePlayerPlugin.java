package com.tencent.mm.plugin.websearch;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/websearch/FlutterSearchFinderLivePlayerPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Landroidx/lifecycle/v;", "Lcom/tencent/pigeon/websearch/SearchResultFinderLivePlayersManager;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class FlutterSearchFinderLivePlayerPlugin implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, androidx.lifecycle.v, com.tencent.pigeon.websearch.SearchResultFinderLivePlayersManager {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.pigeon.websearch.SearchResultFinderLivePlayersCallbackApi f181404e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f181405f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.view.TextureRegistry f181406g;

    /* renamed from: p, reason: collision with root package name */
    public boolean f181412p;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f181403d = "MicroMsg.FlutterSearchFinderLivePlayerPlugin";

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f181407h = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f181408i = new java.util.LinkedHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f181409m = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f181410n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f181411o = new java.util.HashSet();

    public final void a(com.tencent.pigeon.websearch.SearchResultFinderLivePlayInfo searchResultFinderLivePlayInfo, mn0.b0 b0Var, long j17) {
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        java.lang.String exportId = searchResultFinderLivePlayInfo.getExportId();
        if (exportId == null) {
            exportId = "";
        }
        s40.w0.U9(w0Var, 0L, "", 65, 2, "", true, null, 0L, null, false, false, exportId, null, 0, 10176, null).l().K(new com.tencent.mm.plugin.websearch.w0(this, j17, b0Var));
    }

    @Override // com.tencent.pigeon.websearch.SearchResultFinderLivePlayersManager
    public void createPlayer(com.tencent.pigeon.websearch.SearchResultFinderLivePlayInfo finderLivePlayInfo, boolean z17, long j17, yz5.l result) {
        kotlin.jvm.internal.o.g(finderLivePlayInfo, "finderLivePlayInfo");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.ui.MMActivity mMActivity = this.f181405f;
        java.lang.String str = this.f181403d;
        if (mMActivity == null) {
            com.tencent.mars.xlog.Log.e(str, "create player but activity is null");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            result.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.NullPointerException("activity is null")))));
            return;
        }
        if (this.f181406g == null) {
            com.tencent.mars.xlog.Log.e(str, "create player but textureRegistry is null");
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            result.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.NullPointerException("textureRegistry is null")))));
            return;
        }
        c50.q0 q0Var = (c50.q0) i95.n0.c(c50.q0.class);
        com.tencent.mm.ui.MMActivity mMActivity2 = this.f181405f;
        kotlin.jvm.internal.o.d(mMActivity2);
        mn0.b0 wi6 = ((v40.q) q0Var).wi(mMActivity2);
        io.flutter.view.TextureRegistry textureRegistry = this.f181406g;
        io.flutter.view.TextureRegistry.SurfaceTextureEntry createSurfaceTexture = textureRegistry != null ? textureRegistry.createSurfaceTexture() : null;
        kotlin.jvm.internal.o.d(createSurfaceTexture);
        mn0.y yVar = (mn0.y) wi6;
        yVar.G(true);
        yVar.K(mn0.d0.f329720s, 17);
        ls5.d dVar = yVar.f329807f;
        if (dVar != null) {
            dVar.f321128h = new com.tencent.mm.plugin.websearch.r0(this);
        }
        yVar.Q(0);
        android.graphics.SurfaceTexture surfaceTexture = createSurfaceTexture.surfaceTexture();
        surfaceTexture.setDefaultBufferSize(1920, 1080);
        java.lang.Long containerWidth = finderLivePlayInfo.getContainerWidth();
        int longValue = containerWidth != null ? (int) containerWidth.longValue() : 0;
        java.lang.Long containerHeight = finderLivePlayInfo.getContainerHeight();
        int longValue2 = containerHeight != null ? (int) containerHeight.longValue() : 0;
        nn0.o oVar = ((nn0.i) ((nn0.c) wi6).p()).f338584b;
        if (oVar != null) {
            oVar.le(surfaceTexture, longValue, longValue2);
        }
        com.tencent.pigeon.websearch.SearchResultTLPlayerInfo searchResultTLPlayerInfo = new com.tencent.pigeon.websearch.SearchResultTLPlayerInfo(new com.tencent.pigeon.websearch.SearchResultTLTextureInfo(java.lang.Long.valueOf(createSurfaceTexture.id()), null, null, 6, null), java.lang.Long.valueOf(this.f181409m.incrementAndGet()));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createPlayer: ");
        java.lang.Long playerId = searchResultTLPlayerInfo.getPlayerId();
        kotlin.jvm.internal.o.d(playerId);
        sb6.append(playerId.longValue());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        java.util.Map map = this.f181407h;
        java.lang.Long playerId2 = searchResultTLPlayerInfo.getPlayerId();
        kotlin.jvm.internal.o.d(playerId2);
        map.put(playerId2, new com.tencent.mm.plugin.websearch.v1(wi6, finderLivePlayInfo));
        java.util.Map map2 = this.f181408i;
        java.lang.Long playerId3 = searchResultTLPlayerInfo.getPlayerId();
        kotlin.jvm.internal.o.d(playerId3);
        map2.put(playerId3, createSurfaceTexture);
        yVar.J(new com.tencent.mm.plugin.websearch.v0(this, searchResultTLPlayerInfo));
        result.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(searchResultTLPlayerInfo)));
        if (z17) {
            java.lang.Long playerId4 = searchResultTLPlayerInfo.getPlayerId();
            kotlin.jvm.internal.o.d(playerId4);
            a(finderLivePlayInfo, wi6, playerId4.longValue());
        }
    }

    @Override // com.tencent.pigeon.websearch.SearchResultFinderLivePlayersManager
    public void destroy(long j17) {
        mn0.b0 b0Var;
        java.util.Map map = this.f181407h;
        com.tencent.mm.plugin.websearch.v1 v1Var = (com.tencent.mm.plugin.websearch.v1) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
        if (v1Var != null && (b0Var = v1Var.f181684a) != null) {
            mn0.b0.C(b0Var, false, false, false, 6, null);
            ((mn0.y) b0Var).w();
        }
        map.remove(java.lang.Long.valueOf(j17));
        java.util.Map map2 = this.f181408i;
        io.flutter.view.TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = (io.flutter.view.TextureRegistry.SurfaceTextureEntry) ((java.util.LinkedHashMap) map2).get(java.lang.Long.valueOf(j17));
        if (surfaceTextureEntry != null) {
            surfaceTextureEntry.release();
        }
        map2.remove(java.lang.Long.valueOf(j17));
        ((java.util.HashSet) this.f181411o).remove(java.lang.Long.valueOf(j17));
        ((java.util.concurrent.ConcurrentHashMap) this.f181410n).remove(java.lang.Long.valueOf(j17));
        com.tencent.mars.xlog.Log.i(this.f181403d, "destroy player " + j17);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f181403d, "onAttachedToActivity");
        android.app.Activity activity = binding.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        this.f181405f = mMActivity;
        com.tencent.mm.ui.MMActivity mMActivity2 = mMActivity instanceof com.tencent.mm.ui.MMActivity ? mMActivity : null;
        if (mMActivity2 == null || (mo133getLifecycle = mMActivity2.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f181403d, "onAttachedToEngine");
        com.tencent.pigeon.websearch.SearchResultFinderLivePlayersManager.Companion companion = com.tencent.pigeon.websearch.SearchResultFinderLivePlayersManager.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.websearch.SearchResultFinderLivePlayersManager.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        this.f181406g = binding.getTextureRegistry();
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f181404e = new com.tencent.pigeon.websearch.SearchResultFinderLivePlayersCallbackApi(binaryMessenger2, null, 2, 0 == true ? 1 : 0);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        androidx.lifecycle.o mo133getLifecycle;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivity ");
        com.tencent.mm.ui.MMActivity mMActivity = this.f181405f;
        sb6.append(mMActivity != null ? java.lang.Boolean.valueOf(mMActivity.isFinishing()) : null);
        com.tencent.mars.xlog.Log.i(this.f181403d, sb6.toString());
        com.tencent.mm.ui.MMActivity mMActivity2 = this.f181405f;
        if (!(mMActivity2 instanceof com.tencent.mm.ui.MMActivity)) {
            mMActivity2 = null;
        }
        if (mMActivity2 != null && (mo133getLifecycle = mMActivity2.mo133getLifecycle()) != null) {
            mo133getLifecycle.c(this);
        }
        this.f181405f = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f181405f = null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivityForConfigChanges playerKeepers.size = ");
        java.util.Map map = this.f181407h;
        sb6.append(map.size());
        com.tencent.mars.xlog.Log.i(this.f181403d, sb6.toString());
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(((java.util.LinkedHashMap) map).keySet());
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            destroy(((java.lang.Number) it.next()).longValue());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromEngine playerKeepers.size = ");
        java.util.Map map = this.f181407h;
        sb6.append(map.size());
        com.tencent.mars.xlog.Log.i(this.f181403d, sb6.toString());
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(((java.util.LinkedHashMap) map).keySet());
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            destroy(((java.lang.Number) it.next()).longValue());
        }
        com.tencent.pigeon.websearch.SearchResultFinderLivePlayersManager.Companion companion = com.tencent.pigeon.websearch.SearchResultFinderLivePlayersManager.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.websearch.SearchResultFinderLivePlayersManager.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f181404e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        android.app.Activity activity = binding.getActivity();
        this.f181405f = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.String str = this.f181403d;
        com.tencent.mars.xlog.Log.i(str, "onStateChanged() event = " + event);
        if (event == androidx.lifecycle.m.ON_START) {
            this.f181412p = true;
        }
        if (event == androidx.lifecycle.m.ON_STOP) {
            this.f181412p = false;
            java.util.Map map = this.f181410n;
            if (!((java.util.concurrent.ConcurrentHashMap) map).isEmpty()) {
                for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) map).entrySet()) {
                    if (((java.lang.Boolean) entry.getValue()).booleanValue()) {
                        com.tencent.mars.xlog.Log.i(str, "stop when onStop: " + ((java.lang.Number) entry.getKey()).longValue());
                        stop(((java.lang.Number) entry.getKey()).longValue());
                    }
                }
            }
        }
    }

    @Override // com.tencent.pigeon.websearch.SearchResultFinderLivePlayersManager
    public void play(long j17) {
        java.lang.String str = this.f181403d;
        com.tencent.mars.xlog.Log.i(str, "play: " + j17);
        if (!this.f181412p) {
            com.tencent.mars.xlog.Log.w(str, "try play when background, playerId: " + j17);
            return;
        }
        com.tencent.mm.plugin.websearch.v1 v1Var = (com.tencent.mm.plugin.websearch.v1) ((java.util.LinkedHashMap) this.f181407h).get(java.lang.Long.valueOf(j17));
        if (v1Var != null) {
            ((java.util.HashSet) this.f181411o).add(java.lang.Long.valueOf(j17));
            a(v1Var.f181685b, v1Var.f181684a, j17);
        }
    }

    @Override // com.tencent.pigeon.websearch.SearchResultFinderLivePlayersManager
    public void setMute(long j17, boolean z17) {
        mn0.b0 b0Var;
        com.tencent.mars.xlog.Log.i(this.f181403d, "setMute: " + j17 + ' ' + z17);
        com.tencent.mm.plugin.websearch.v1 v1Var = (com.tencent.mm.plugin.websearch.v1) ((java.util.LinkedHashMap) this.f181407h).get(java.lang.Long.valueOf(j17));
        if (v1Var == null || (b0Var = v1Var.f181684a) == null) {
            return;
        }
        ((mn0.y) b0Var).G(z17);
    }

    @Override // com.tencent.pigeon.websearch.SearchResultFinderLivePlayersManager
    public void stop(long j17) {
        mn0.b0 b0Var;
        com.tencent.mars.xlog.Log.i(this.f181403d, "stop: " + j17);
        com.tencent.mm.plugin.websearch.v1 v1Var = (com.tencent.mm.plugin.websearch.v1) ((java.util.LinkedHashMap) this.f181407h).get(java.lang.Long.valueOf(j17));
        if (v1Var == null || (b0Var = v1Var.f181684a) == null) {
            return;
        }
        ((java.util.HashSet) this.f181411o).remove(java.lang.Long.valueOf(j17));
        mn0.b0.C(b0Var, false, false, false, 6, null);
        ((java.util.concurrent.ConcurrentHashMap) this.f181410n).put(java.lang.Long.valueOf(j17), java.lang.Boolean.FALSE);
    }
}
