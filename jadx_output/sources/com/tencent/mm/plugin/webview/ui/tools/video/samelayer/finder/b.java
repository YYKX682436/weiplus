package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b f186984a = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f186985b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f186986c = new java.util.ArrayList();

    public void a(com.tencent.mm.plugin.webview.model.l0 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.ArrayList arrayList = f186986c;
        synchronized (arrayList) {
            arrayList.size();
            arrayList.add(listener);
        }
    }

    public void b(android.os.Bundle data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.util.ArrayList arrayList = f186985b;
        synchronized (arrayList) {
            arrayList.size();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.webview.model.k0) it.next()).a(data);
            }
        }
    }

    public void c(int i17, android.os.Bundle bundle) {
        java.util.ArrayList arrayList = f186986c;
        synchronized (arrayList) {
            arrayList.size();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.webview.model.l0) it.next()).a(i17, bundle);
            }
        }
    }

    public void d(int i17, com.tencent.mm.sdk.event.IEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        byte[] bArr = null;
        if (i17 != 2 || !(event instanceof com.tencent.mm.autogen.events.OnExitFinderFullscreenEvent)) {
            if (i17 == 1 && (event instanceof com.tencent.mm.autogen.events.OnEnterFinderFullscreenEvent)) {
                c(i17, null);
                return;
            }
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        am.om omVar = ((com.tencent.mm.autogen.events.OnExitFinderFullscreenEvent) event).f54569g;
        bundle.putString("status", omVar.f7558a);
        bundle.putFloat("playbackTime", omVar.f7559b);
        bundle.putFloat("playbackRate", omVar.f7561d);
        bundle.putBoolean("isPause", omVar.f7560c);
        omVar.getClass();
        bundle.putBoolean("showBarrage", false);
        try {
            r45.n23 n23Var = ((com.tencent.mm.autogen.events.OnExitFinderFullscreenEvent) event).f54569g.f7562e;
            if (n23Var != null) {
                bArr = n23Var.toByteArray();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FinderFeedInfoUpdateEventManager", e17, "FinderVideoInfoForMp.toByteArray exception", new java.lang.Object[0]);
        }
        if (bArr != null) {
            bundle.putByteArray("videoInfoForMp", bArr);
        }
        c(i17, bundle);
    }
}
