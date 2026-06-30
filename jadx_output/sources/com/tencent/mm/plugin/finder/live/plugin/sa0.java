package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class sa0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wa0 f114236d;

    public sa0(com.tencent.mm.plugin.finder.live.plugin.wa0 wa0Var) {
        this.f114236d = wa0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mars.xlog.Log.i("FinderLiveSubtitlePlugin", "isOpenSubtitleData " + bool);
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.plugin.finder.live.plugin.wa0 wa0Var = this.f114236d;
        wa0Var.getClass();
        zl2.r4.f473950a.I0().putInt(wa0Var.y1(), booleanValue ? 1 : 0);
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
            com.tencent.mm.plugin.finder.live.plugin.wa0.t1(wa0Var);
        }
    }
}
