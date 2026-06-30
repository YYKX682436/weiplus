package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gk implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f112708d;

    public gk(com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        this.f112708d = hmVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.q2 q2Var = (mm2.q2) obj;
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f112708d;
        com.tencent.mars.xlog.Log.i(hmVar.f112831r, "receive panelOpenSwitch " + q2Var);
        if (!q2Var.f329364a) {
            hmVar.H1();
        } else {
            hmVar.R1 = q2Var.f329365b;
            com.tencent.mm.plugin.finder.live.plugin.hm.T1(hmVar, null, null, null, 7, null);
        }
    }
}
