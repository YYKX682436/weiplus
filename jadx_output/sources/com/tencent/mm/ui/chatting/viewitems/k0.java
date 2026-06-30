package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class k0 implements r01.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f204290d;

    /* renamed from: e, reason: collision with root package name */
    public final yb5.d f204291e;

    public k0(yb5.d dVar, java.lang.String str) {
        this.f204290d = str;
        this.f204291e = dVar;
    }

    @Override // r01.d0
    public void a(java.util.LinkedList linkedList) {
        r01.e0 fj6 = r01.q3.fj();
        synchronized (fj6.f368050d) {
            if (fj6.f368054h.contains(this)) {
                fj6.f368054h.remove(this);
            }
        }
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(linkedList.size());
        java.lang.String str = this.f204290d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItem", "onKFSceneEnd, workers size : %d. callbackid=%s", valueOf, str);
        if (this.f204291e != null) {
            boolean z17 = false;
            if (linkedList.size() != 0) {
                int i17 = 0;
                while (true) {
                    if (i17 >= linkedList.size()) {
                        break;
                    }
                    r45.ob7 ob7Var = (r45.ob7) linkedList.get(i17);
                    if (ob7Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(ob7Var.f382137d) && ob7Var.f382137d.equals(str)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItem", "needCallback find match kfopenid");
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(ob7Var.f382139f)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItem", "needCallback: true");
                            z17 = true;
                            break;
                        }
                    }
                    i17++;
                }
            }
            if (z17) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.viewitems.j0(this));
            }
        }
    }

    @Override // r01.d0
    public java.lang.String b() {
        return this.f204290d;
    }
}
