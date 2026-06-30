package jh1;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f299792a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f299793b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f299794c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f299795d = new java.util.concurrent.ConcurrentHashMap();

    public static void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AppBrandAudioClientService", "onCreate");
        ((java.util.concurrent.ConcurrentHashMap) f299792a).clear();
        com.tencent.mm.sdk.platformtools.n3 n3Var = com.tencent.mm.plugin.appbrand.jsapi.audio.b.f79129a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioApiTaskExecutor", "onCreate %s", str);
        ((java.util.concurrent.ConcurrentSkipListSet) com.tencent.mm.plugin.appbrand.jsapi.audio.b.f79132d).add(str);
        ((java.util.concurrent.ConcurrentHashMap) f299795d).put(str, java.lang.Boolean.TRUE);
    }

    public static void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AppBrandAudioClientService", "onDestroy");
        com.tencent.mm.sdk.platformtools.n3 n3Var = com.tencent.mm.plugin.appbrand.jsapi.audio.b.f79129a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioApiTaskExecutor", "onDestroy:%s", str);
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = (java.util.concurrent.ConcurrentSkipListSet) com.tencent.mm.plugin.appbrand.jsapi.audio.b.f79132d;
        if (concurrentSkipListSet.remove(str) && concurrentSkipListSet.isEmpty()) {
            synchronized (com.tencent.mm.plugin.appbrand.jsapi.audio.b.f79131c) {
                if (com.tencent.mm.plugin.appbrand.jsapi.audio.b.f79130b != null) {
                    ((java.util.concurrent.ConcurrentHashMap) lm5.i.f319609a).remove("app_brand_audio_player".toUpperCase(java.util.Locale.ENGLISH));
                    com.tencent.mm.plugin.appbrand.jsapi.audio.b.f79130b.quit();
                    com.tencent.mm.plugin.appbrand.jsapi.audio.b.f79130b = null;
                    com.tencent.mm.plugin.appbrand.jsapi.audio.b.f79129a = null;
                }
            }
        }
        ((java.util.concurrent.ConcurrentHashMap) f299792a).clear();
        java.util.Iterator it = f299794c.iterator();
        while (it.hasNext()) {
            com.tencent.mm.sdk.event.IListener iListener = (com.tencent.mm.sdk.event.IListener) ((java.util.HashMap) f299793b).remove((java.lang.String) it.next());
            if (iListener != null) {
                iListener.dead();
            }
        }
        ((java.util.HashMap) f299793b).clear();
        f299794c.clear();
        ((java.util.concurrent.ConcurrentHashMap) f299795d).remove(str);
    }

    public static void c(java.lang.String str) {
        java.util.Map map = f299793b;
        if (!((java.util.HashMap) map).containsKey(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AppBrandAudioClientService", "appId:%s not exist the appId for listener", str);
            return;
        }
        f299794c.remove(str);
        com.tencent.mm.sdk.event.IListener iListener = (com.tencent.mm.sdk.event.IListener) ((java.util.HashMap) map).remove(str);
        if (iListener != null) {
            iListener.dead();
        }
    }
}
