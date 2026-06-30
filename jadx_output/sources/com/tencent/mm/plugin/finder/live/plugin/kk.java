package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class kk implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f113264d;

    public kk(com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        this.f113264d = hmVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f113264d;
        if (!booleanValue) {
            hmVar.C1 = true;
            return;
        }
        hmVar.C1 = false;
        dk2.xf j17 = dk2.ef.f233372a.j(hmVar.R0());
        if (j17 != null) {
            ((dk2.r4) j17).A(((mm2.e1) hmVar.P0(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) hmVar.P0(mm2.e1.class)).f328983m, ((mm2.e1) hmVar.P0(mm2.e1.class)).f328992v, 1, new com.tencent.mm.plugin.finder.live.plugin.jk(hmVar));
        }
    }
}
