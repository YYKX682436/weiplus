package com.tencent.mm.plugin.gif;

/* loaded from: classes12.dex */
public class c implements kk.h {
    public c(com.tencent.mm.plugin.gif.d dVar) {
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.gif.b bVar;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj2;
        if (weakReference == null || (bVar = (com.tencent.mm.plugin.gif.b) weakReference.get()) == null || !(bVar instanceof com.tencent.mm.plugin.gif.k)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GIF.MMAnimateDrawableCacheMgr", "recycle bitmap:%s", bVar.toString());
        bVar.b();
    }
}
