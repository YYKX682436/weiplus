package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.r f202986e;

    public l(java.util.List list, com.tencent.mm.ui.chatting.view.r rVar) {
        this.f202985d = list;
        this.f202986e = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.f202985d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.ui.chatting.view.r rVar = this.f202986e;
            if (!hasNext) {
                rVar.F();
                return;
            }
            jz5.l lVar = (jz5.l) it.next();
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) lVar.f302833d;
            ((java.lang.Boolean) lVar.f302834e).booleanValue();
            rVar.h(k3Var);
        }
    }
}
