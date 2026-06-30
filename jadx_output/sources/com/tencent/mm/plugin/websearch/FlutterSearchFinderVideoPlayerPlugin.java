package com.tencent.mm.plugin.websearch;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/websearch/FlutterSearchFinderVideoPlayerPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Landroidx/lifecycle/v;", "Lcom/tencent/pigeon/websearch/SearchResultFinderVideoPlayersManager;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class FlutterSearchFinderVideoPlayerPlugin implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, androidx.lifecycle.v, com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersManager {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f181413d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.view.TextureRegistry f181414e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersCallbackApi f181415f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f181416g = new java.util.LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f181417h = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f181418i = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f181419m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public boolean f181420n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f181421o;

    public final void a(zy2.g5 g5Var) {
        g5Var.setVideoViewFocused(true);
        g5Var.setMute(true);
        zy2.g5.u(g5Var, null, 1, null);
        android.view.View videoView = g5Var.getVideoView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(videoView, arrayList.toArray(), "com/tencent/mm/plugin/websearch/FlutterSearchFinderVideoPlayerPlugin", "playInner", "(Lcom/tencent/mm/plugin/findersdk/api/IBaseFinderVideoView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        videoView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(videoView, "com/tencent/mm/plugin/websearch/FlutterSearchFinderVideoPlayerPlugin", "playInner", "(Lcom/tencent/mm/plugin/findersdk/api/IBaseFinderVideoView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersManager
    public void createPlayer(com.tencent.pigeon.websearch.SearchResultFinderVideoPlayInfo finderVideoPlayInfo, boolean z17, long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(finderVideoPlayInfo, "finderVideoPlayInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "Create player with nonceId " + finderVideoPlayInfo.getNonceId() + " and objectId " + finderVideoPlayInfo.getEncryptedObjectId());
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.websearch.x0(finderVideoPlayInfo, j17, this, new java.lang.ref.WeakReference(this), callback, z17, null), 3, null);
    }

    @Override // com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersManager
    public void destroy(long j17) {
        java.util.Map map = this.f181416g;
        zy2.g5 g5Var = (zy2.g5) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
        if (g5Var != null) {
            g5Var.stop();
            g5Var.setVideoViewFocused(false);
            g5Var.d();
            g5Var.b();
        }
        map.remove(java.lang.Long.valueOf(j17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("release texture  ");
        java.util.Map map2 = this.f181417h;
        io.flutter.view.TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = (io.flutter.view.TextureRegistry.SurfaceTextureEntry) ((java.util.LinkedHashMap) map2).get(java.lang.Long.valueOf(j17));
        sb6.append(surfaceTextureEntry != null ? java.lang.Long.valueOf(surfaceTextureEntry.id()) : null);
        sb6.append("  nativeHandle=");
        sb6.append(android.opengl.EGL14.eglGetCurrentContext().getNativeHandle());
        sb6.append(" Tid=");
        sb6.append(java.lang.Thread.currentThread().getId());
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", sb6.toString());
        io.flutter.view.TextureRegistry.SurfaceTextureEntry surfaceTextureEntry2 = (io.flutter.view.TextureRegistry.SurfaceTextureEntry) ((java.util.LinkedHashMap) map2).get(java.lang.Long.valueOf(j17));
        if (surfaceTextureEntry2 != null) {
            surfaceTextureEntry2.release();
        }
        map2.remove(java.lang.Long.valueOf(j17));
        ((java.util.concurrent.ConcurrentHashMap) this.f181419m).remove(java.lang.Long.valueOf(j17));
    }

    @Override // com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersManager
    public long getCurrentPlayMs(long j17) {
        zy2.g5 g5Var = (zy2.g5) ((java.util.LinkedHashMap) this.f181416g).get(java.lang.Long.valueOf(j17));
        if (g5Var != null) {
            return g5Var.getCurrentPlayMs();
        }
        return 0L;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "onAttachedToActivity");
        android.app.Activity activity = binding.getActivity();
        this.f181413d = activity;
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity == null || (mo133getLifecycle = mMActivity.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "onAttachedToEngine");
        this.f181421o = true;
        com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersManager.Companion companion = com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersManager.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersManager.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f181415f = new com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersCallbackApi(binaryMessenger2, null, 2, 0 == true ? 1 : 0);
        this.f181414e = binding.getTextureRegistry();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        androidx.lifecycle.o mo133getLifecycle;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivity ");
        android.app.Activity activity = this.f181413d;
        sb6.append(activity != null ? java.lang.Boolean.valueOf(activity.isFinishing()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", sb6.toString());
        android.app.Activity activity2 = this.f181413d;
        com.tencent.mm.ui.MMActivity mMActivity = activity2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity2 : null;
        if (mMActivity != null && (mo133getLifecycle = mMActivity.mo133getLifecycle()) != null) {
            mo133getLifecycle.c(this);
        }
        this.f181413d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f181413d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "onDetachedFromEngine");
        com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersManager.Companion companion = com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersManager.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersManager.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(((java.util.LinkedHashMap) this.f181416g).keySet());
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            destroy(((java.lang.Number) it.next()).longValue());
        }
        this.f181414e = binding.getTextureRegistry();
        this.f181415f = null;
        this.f181421o = false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f181413d = binding.getActivity();
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "onStateChanged() event = " + event);
        if (event == androidx.lifecycle.m.ON_START) {
            this.f181420n = true;
        }
        if (event == androidx.lifecycle.m.ON_STOP) {
            this.f181420n = false;
            java.util.Map map = this.f181419m;
            if (!((java.util.concurrent.ConcurrentHashMap) map).isEmpty()) {
                for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) map).entrySet()) {
                    if (((java.lang.Boolean) entry.getValue()).booleanValue()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "pause when onStop: " + ((java.lang.Number) entry.getKey()).longValue());
                        pause(((java.lang.Number) entry.getKey()).longValue());
                    }
                }
            }
        }
    }

    @Override // com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersManager
    public void pause(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "pause: " + j17);
        zy2.g5 g5Var = (zy2.g5) ((java.util.LinkedHashMap) this.f181416g).get(java.lang.Long.valueOf(j17));
        if (g5Var != null) {
            g5Var.pause();
            g5Var.setVideoViewFocused(false);
            ((java.util.concurrent.ConcurrentHashMap) this.f181419m).put(java.lang.Long.valueOf(j17), java.lang.Boolean.FALSE);
        }
    }

    @Override // com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersManager
    public void play(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "play: " + j17);
        if (!this.f181420n) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "try play when background, playerId: " + j17);
            return;
        }
        java.util.Map map = this.f181419m;
        if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(java.lang.Long.valueOf(j17))) {
            if (kotlin.jvm.internal.o.b(((java.util.concurrent.ConcurrentHashMap) map).get(java.lang.Long.valueOf(j17)), java.lang.Boolean.TRUE)) {
                return;
            }
        }
        zy2.g5 g5Var = (zy2.g5) ((java.util.LinkedHashMap) this.f181416g).get(java.lang.Long.valueOf(j17));
        if (g5Var != null) {
            a(g5Var);
            ((java.util.concurrent.ConcurrentHashMap) map).put(java.lang.Long.valueOf(j17), java.lang.Boolean.TRUE);
        }
    }

    @Override // com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersManager
    public void setMute(long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "setMute: " + j17 + ' ' + z17);
        zy2.g5 g5Var = (zy2.g5) ((java.util.LinkedHashMap) this.f181416g).get(java.lang.Long.valueOf(j17));
        if (g5Var != null) {
            g5Var.setMute(z17);
        }
    }

    @Override // com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersManager
    public void stop(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "stop: " + j17);
        zy2.g5 g5Var = (zy2.g5) ((java.util.LinkedHashMap) this.f181416g).get(java.lang.Long.valueOf(j17));
        if (g5Var != null) {
            g5Var.stop();
            g5Var.setVideoViewFocused(false);
            ((java.util.concurrent.ConcurrentHashMap) this.f181419m).put(java.lang.Long.valueOf(j17), java.lang.Boolean.FALSE);
        }
    }
}
