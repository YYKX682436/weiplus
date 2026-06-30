package com.tencent.mm.plugin.wepkg.event;

/* loaded from: classes8.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentLinkedQueue f188332a = new java.util.concurrent.ConcurrentLinkedQueue();

    public static void a(android.os.Parcelable parcelable, com.tencent.mm.plugin.wepkg.event.f fVar) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            java.util.Iterator it = f188332a.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                if (weakReference.get() != null) {
                    ((com.tencent.mm.plugin.wepkg.event.c) weakReference.get()).a(parcelable);
                }
            }
        }
        com.tencent.mm.ipcinvoker.wx_extension.j0 j0Var = (com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class);
        com.tencent.mm.plugin.wepkg.event.e eVar = new com.tencent.mm.plugin.wepkg.event.e(fVar);
        ((h80.k) j0Var).getClass();
        com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.a(parcelable, com.tencent.mm.plugin.wepkg.event.g.class, eVar);
    }

    public static void b(com.tencent.mm.plugin.wepkg.event.c cVar) {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = f188332a;
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference.get() == cVar) {
                concurrentLinkedQueue.remove(weakReference);
            }
        }
    }
}
