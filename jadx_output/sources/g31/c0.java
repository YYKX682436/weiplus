package g31;

/* loaded from: classes9.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final k31.a f268069a;

    /* renamed from: b, reason: collision with root package name */
    public l31.i f268070b;

    /* renamed from: c, reason: collision with root package name */
    public l31.y f268071c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f268072d = new java.util.LinkedHashMap();

    public c0(k31.a aVar) {
        this.f268069a = aVar;
    }

    public final void a(boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.util.Map map = this.f268072d;
        com.tencent.mars.xlog.Log.i("SubscribeSwitchInfoSyncer", "notifyGlobalCallbacks isGlobalAutoNotify: %b, callback size: %d", valueOf, java.lang.Integer.valueOf(map.size()));
        java.util.Iterator it = ((java.util.LinkedHashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            g31.z zVar = (g31.z) ((java.lang.ref.WeakReference) entry.getValue()).get();
            if (zVar == null) {
                it.remove();
                com.tencent.mars.xlog.Log.i("SubscribeSwitchInfoSyncer", "notifyGlobalCallbacks: callback for key %s has been garbage collected", entry.getKey());
            } else {
                ((tw.b) ((g31.i) zVar).f268080a).f422394a.V6();
            }
        }
    }
}
