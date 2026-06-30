package com.tencent.mm.plugin.wepkg.event;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class g implements com.tencent.mm.ipcinvoker.j {
    private g() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.util.Iterator it = com.tencent.mm.plugin.wepkg.event.h.f188332a.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference.get() != null) {
                ((com.tencent.mm.plugin.wepkg.event.c) weakReference.get()).a(obj);
            }
        }
        rVar.a(null);
    }
}
