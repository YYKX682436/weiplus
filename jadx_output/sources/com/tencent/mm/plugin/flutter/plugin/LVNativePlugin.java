package com.tencent.mm.plugin.flutter.plugin;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/flutter/plugin/LVNativePlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Landroidx/lifecycle/v;", "Lcom/tencent/pigeon/mega_video/MegaVideoNativeApi;", "Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class LVNativePlugin implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, androidx.lifecycle.v, com.tencent.pigeon.mega_video.MegaVideoNativeApi, io.flutter.plugin.common.PluginRegistry.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f137296d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f137297e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f137298f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.BroadcastReceiver f137299g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.pigeon.mega_video.MegaVideoCommCallback f137300h;

    /* renamed from: i, reason: collision with root package name */
    public float f137301i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.flutter.plugin.LVNativePlugin$lifecycleObserver$1 f137302m = new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.flutter.plugin.LVNativePlugin$lifecycleObserver$1
        @Override // androidx.lifecycle.f, androidx.lifecycle.h
        public void onPause(androidx.lifecycle.y owner) {
            kotlin.jvm.internal.o.g(owner, "owner");
            com.tencent.mm.plugin.flutter.plugin.LVNativePlugin lVNativePlugin = com.tencent.mm.plugin.flutter.plugin.LVNativePlugin.this;
            lVNativePlugin.getClass();
            try {
                android.content.BroadcastReceiver broadcastReceiver = lVNativePlugin.f137299g;
                if (broadcastReceiver != null) {
                    com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(broadcastReceiver);
                }
                lVNativePlugin.f137299g = null;
                com.tencent.mars.xlog.Log.i("MicroMsg.LVNativePlugin", "did stop observing volume change");
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LVNativePlugin", "failed to stop observing volume");
            }
        }

        @Override // androidx.lifecycle.f, androidx.lifecycle.h
        public void onResume(androidx.lifecycle.y owner) {
            kotlin.jvm.internal.o.g(owner, "owner");
            final com.tencent.mm.plugin.flutter.plugin.LVNativePlugin lVNativePlugin = com.tencent.mm.plugin.flutter.plugin.LVNativePlugin.this;
            if (lVNativePlugin.f137299g != null) {
                return;
            }
            lVNativePlugin.f137301i = lVNativePlugin.a();
            lVNativePlugin.f137299g = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.flutter.plugin.LVNativePlugin$startObserveVolumeChangeEvent$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(android.content.Context context, android.content.Intent intent) {
                    kotlin.jvm.internal.o.g(context, "context");
                    kotlin.jvm.internal.o.g(intent, "intent");
                    if (kotlin.jvm.internal.o.b(intent.getAction(), "android.media.VOLUME_CHANGED_ACTION")) {
                        com.tencent.mm.plugin.flutter.plugin.LVNativePlugin lVNativePlugin2 = com.tencent.mm.plugin.flutter.plugin.LVNativePlugin.this;
                        float a17 = lVNativePlugin2.a();
                        com.tencent.mars.xlog.Log.i("MicroMsg.LVNativePlugin", "newVolume:" + a17);
                        java.util.Map<java.lang.String, ? extends java.lang.Object> l17 = kz5.c1.l(new jz5.l("volume", java.lang.Float.valueOf(a17)), new jz5.l("oldVolume", java.lang.Float.valueOf(lVNativePlugin2.f137301i)));
                        com.tencent.pigeon.mega_video.MegaVideoCommCallback megaVideoCommCallback = lVNativePlugin2.f137300h;
                        if (megaVideoCommCallback != null) {
                            megaVideoCommCallback.onEvent("VolumeChanged", l17, h03.r.f277915d);
                        }
                        lVNativePlugin2.f137301i = a17;
                    }
                }
            };
            try {
                com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(lVNativePlugin.f137299g, new android.content.IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
                com.tencent.mars.xlog.Log.i("MicroMsg.LVNativePlugin", "did start observing volume");
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LVNativePlugin", "failed to start observing volume");
            }
        }
    };

    public final float a() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        android.media.AudioManager audioManager = systemService instanceof android.media.AudioManager ? (android.media.AudioManager) systemService : null;
        return (audioManager != null ? audioManager.getStreamVolume(3) : 0) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : 1);
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoNativeApi
    public void didGetGestureEvent(boolean z17) {
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlutterContainer megaVideoFlutterContainer;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlutterContainer megaVideoFlutterContainer2;
        if (z17) {
            java.lang.ref.WeakReference weakReference = this.f137298f;
            if (weakReference == null || (megaVideoFlutterContainer2 = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlutterContainer) weakReference.get()) == null) {
                return;
            }
            megaVideoFlutterContainer2.f120898d = true;
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.f137298f;
        if (weakReference2 == null || (megaVideoFlutterContainer = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlutterContainer) weakReference2.get()) == null) {
            return;
        }
        megaVideoFlutterContainer.f120898d = false;
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoNativeApi
    public com.tencent.pigeon.mega_video.MegaMainFeedListContext getInitMainFeedListContext() {
        return null;
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoNativeApi
    public java.lang.Boolean isStarred(java.lang.String str, long j17) {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
        multiTaskInfo.field_id = str;
        multiTaskInfo.field_type = 25;
        return java.lang.Boolean.valueOf(((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ri(multiTaskInfo));
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026b  */
    @Override // com.tencent.pigeon.mega_video.MegaVideoNativeApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void markStar(com.tencent.pigeon.mega_video.MegaVideoFeedInfo r19, byte[] r20, long r21, com.tencent.pigeon.mega_video.LVSnapshotInfo r23) {
        /*
            Method dump skipped, instructions count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.flutter.plugin.LVNativePlugin.markStar(com.tencent.pigeon.mega_video.MegaVideoFeedInfo, byte[], long, com.tencent.pigeon.mega_video.LVSnapshotInfo):void");
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoNativeApi
    public void minimize(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LVNativePlugin", "minimize playerId " + j17);
        android.app.Activity activity = this.f137297e;
        com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity megaVideoFlutterActivity = activity instanceof com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity ? (com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity) activity : null;
        if (megaVideoFlutterActivity != null) {
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(megaVideoFlutterActivity).a(w03.u.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            w03.u.S6((w03.u) a17, false, false, false, java.lang.Long.valueOf(j17), 7, null);
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.LVNativePlugin", "onAttachedToActivity");
        this.f137297e = binding.getActivity();
        binding.addActivityResultListener(this);
        android.app.Activity activity = this.f137297e;
        com.tencent.mm.plugin.flutter.plugin.LVNativePlugin$lifecycleObserver$1 lVNativePlugin$lifecycleObserver$1 = this.f137302m;
        if (activity != null) {
            bm5.a1.a(activity).c(lVNativePlugin$lifecycleObserver$1);
        }
        android.app.Activity activity2 = this.f137297e;
        if (activity2 != null) {
            bm5.a1.a(activity2).a(lVNativePlugin$lifecycleObserver$1);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        this.f137300h = new com.tencent.pigeon.mega_video.MegaVideoCommCallback(binaryMessenger, null, 2, null);
        this.f137296d = binding.getApplicationContext();
        com.tencent.pigeon.mega_video.MegaVideoNativeApi.Companion companion = com.tencent.pigeon.mega_video.MegaVideoNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        com.tencent.pigeon.mega_video.MegaVideoNativeApi.Companion.setUp$default(companion, binaryMessenger2, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LVNativePlugin", "onDetachedFromActivity");
        this.f137297e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f137297e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mega_video.MegaVideoNativeApi.Companion companion = com.tencent.pigeon.mega_video.MegaVideoNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mega_video.MegaVideoNativeApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f137300h = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f137297e = binding.getActivity();
        binding.addActivityResultListener(this);
        android.app.Activity activity = this.f137297e;
        com.tencent.mm.plugin.flutter.plugin.LVNativePlugin$lifecycleObserver$1 lVNativePlugin$lifecycleObserver$1 = this.f137302m;
        if (activity != null) {
            bm5.a1.a(activity).c(lVNativePlugin$lifecycleObserver$1);
        }
        android.app.Activity activity2 = this.f137297e;
        if (activity2 != null) {
            bm5.a1.a(activity2).a(lVNativePlugin$lifecycleObserver$1);
        }
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoNativeApi
    public void openFeedPlayerDetail(java.lang.String checkroomTicket, byte[] openParamsBytes) {
        bw5.id0 id0Var;
        bw5.zc0 b17;
        bw5.yr b18;
        kotlin.jvm.internal.o.g(checkroomTicket, "checkroomTicket");
        kotlin.jvm.internal.o.g(openParamsBytes, "openParamsBytes");
        try {
            id0Var = new bw5.id0().parseFrom(openParamsBytes);
        } catch (com.google.protobuf.y6 unused) {
            id0Var = null;
        }
        bw5.id0 id0Var2 = id0Var;
        if (c03.k.f37665a.a(pm0.v.u((id0Var2 == null || (b17 = id0Var2.b()) == null || (b18 = b17.b()) == null) ? 0L : b18.f35632d))) {
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            c0Var.f310112d = id0Var2 != null ? id0Var2.f28542g : false;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = new android.os.Bundle();
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new h03.s(id0Var2 != null ? id0Var2.f28555w : false, h0Var, this, linkedHashMap, checkroomTicket, c0Var, id0Var2, null), 3, null);
        }
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoNativeApi
    public void openKitchen(long j17, com.tencent.pigeon.mega_video.MegaVideoFeedInfo megaVideoFeedInfo, java.util.Map params) {
        kotlin.jvm.internal.o.g(params, "params");
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoNativeApi
    public void openWatchLaterList(java.lang.String ticket) {
        kotlin.jvm.internal.o.g(ticket, "ticket");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("checkroom_ticket", ticket);
        com.tencent.mars.xlog.Log.i("MicroMsg.LVNativePlugin", "openWatchLaterList ticket ".concat(ticket));
        android.app.Activity activity = this.f137297e;
        if (activity != null) {
            a03.h0 h0Var = (a03.h0) ((n40.o) i95.n0.c(n40.o.class));
            h0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoUniversalService", "jumpWatchLaterUI ");
            kotlinx.coroutines.l.d(h0Var.f425m, null, null, new a03.c0(h0Var, linkedHashMap, activity, null), 3, null);
        }
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoNativeApi
    public void removeStar(java.lang.String str, long j17) {
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.multitask.l0.C7((com.tencent.mm.plugin.multitask.l0) c17, str, 25, false, 4, null);
        android.app.Activity activity = this.f137297e;
        if (activity != null) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
            e4Var.d(com.tencent.mm.R.string.nlg);
            e4Var.c();
        }
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoNativeApi
    public void setOnceOrientation(long j17) {
        android.app.Activity activity;
        int i17 = (int) j17;
        if (i17 != 0) {
            if (i17 == 1 && (activity = this.f137297e) != null) {
                activity.setRequestedOrientation(0);
                return;
            }
            return;
        }
        android.app.Activity activity2 = this.f137297e;
        if (activity2 == null) {
            return;
        }
        activity2.setRequestedOrientation(1);
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoNativeApi
    public void showLastExitFeedHint(com.tencent.pigeon.mega_video.MegaVideoFeedInfo feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        ((ku5.t0) ku5.t0.f312615d).a(new h03.t(feed));
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoNativeApi
    public void showSharePanel(com.tencent.pigeon.mega_video.MegaVideoFeedInfo feed, long j17) {
        kotlin.jvm.internal.o.g(feed, "feed");
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoNativeApi
    public void updatePlaySessionId(java.lang.String playSessionId, long j17) {
        kotlin.jvm.internal.o.g(playSessionId, "playSessionId");
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoNativeApi
    public void updateStarInfo(java.lang.String startId) {
        kotlin.jvm.internal.o.g(startId, "startId");
        android.app.Activity activity = this.f137297e;
        if (activity == null) {
            return;
        }
        pf5.z zVar = pf5.z.f353948a;
        if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.sb0) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.sb0.class)).getClass();
    }
}
