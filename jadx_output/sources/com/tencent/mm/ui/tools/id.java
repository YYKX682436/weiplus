package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class id implements com.tencent.mm.modelbase.j1 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f210499d = new java.util.LinkedList();

    public static void b(final com.tencent.mm.ui.tools.hd hdVar, androidx.lifecycle.y yVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncOnSceneEnd", "addListener() called with: listener = [" + hdVar + "], owner = [" + yVar + "]");
        if (yVar == null) {
            return;
        }
        ((java.util.LinkedList) f210499d).add(hdVar);
        yVar.mo133getLifecycle().a(new androidx.lifecycle.f() { // from class: com.tencent.mm.ui.tools.SyncOnSceneEnd$1
            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onDestroy(androidx.lifecycle.y yVar2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SyncOnSceneEnd", "onDestroy() called with: owner = [" + yVar2 + "]");
                ((java.util.LinkedList) com.tencent.mm.ui.tools.id.f210499d).remove(com.tencent.mm.ui.tools.hd.this);
            }
        });
    }

    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("current is wechat = ");
        sb6.append(c01.e2.a0());
        sb6.append(", listeners = ");
        java.util.List list = f210499d;
        sb6.append(list);
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncOnSceneEnd", sb6.toString());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.tools.hd) it.next()).a();
        }
    }
}
