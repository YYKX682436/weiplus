package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class vb implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ac f114701d;

    public vb(com.tencent.mm.plugin.finder.live.plugin.ac acVar) {
        this.f114701d = acVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("boxChangedObserver, ");
        sb6.append(concurrentHashMap != null ? java.lang.Integer.valueOf(concurrentHashMap.size()) : null);
        java.lang.String str = sb6.toString();
        kotlin.jvm.internal.o.g(str, "str");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveBoxPlugin", "liveDataLog ".concat(str));
        if (concurrentHashMap == null) {
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveBoxPlugin", "getAllBoxInfo is null");
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.ac acVar = this.f114701d;
        boolean z17 = true;
        if (acVar.f111852v.size() == concurrentHashMap.size()) {
            boolean z18 = false;
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                if (!acVar.f111852v.containsKey(entry.getKey()) || !kotlin.jvm.internal.o.b(acVar.f111852v.get(entry.getKey()), entry.getValue())) {
                    z18 = true;
                }
            }
            z17 = z18;
        }
        acVar.f111852v.clear();
        acVar.f111852v.putAll(concurrentHashMap);
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveBoxPlugin", "mainFlowLog ".concat("status FINDER_LIVE_UPDATE_BOX_INFO"));
            acVar.f111846p.statusChange(qo0.b.f365371j5, new android.os.Bundle());
        }
    }
}
