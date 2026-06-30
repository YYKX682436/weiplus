package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes7.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f189691a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f189692b = new java.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.String str) {
        java.util.concurrent.Future future = (java.util.concurrent.Future) ((java.util.concurrent.ConcurrentHashMap) this.f189692b).remove(str);
        if (future != null) {
            future.cancel(true);
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f189691a).remove(str);
    }

    public final void b() {
        java.util.Map map = this.f189692b;
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) map).keySet().iterator();
        while (it.hasNext()) {
            java.util.concurrent.Future future = (java.util.concurrent.Future) ((java.util.concurrent.ConcurrentHashMap) map).get((java.lang.String) it.next());
            if (future != null) {
                future.cancel(true);
            }
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f189691a).clear();
        ((java.util.concurrent.ConcurrentHashMap) map).clear();
    }

    public abstract ku5.f c();

    public synchronized boolean d(java.lang.String str) {
        boolean z17;
        if (!((java.util.concurrent.ConcurrentHashMap) this.f189692b).containsKey(str)) {
            z17 = ((java.util.concurrent.ConcurrentHashMap) this.f189691a).containsKey(str);
        }
        return z17;
    }

    public abstract com.tencent.mm.pluginsdk.res.downloader.model.m e(com.tencent.mm.pluginsdk.res.downloader.model.k kVar);

    public final void f(com.tencent.mm.pluginsdk.res.downloader.model.k kVar) {
        ((java.util.concurrent.ConcurrentHashMap) this.f189691a).put(kVar.a(), kVar);
        c().submit(e(kVar));
    }
}
