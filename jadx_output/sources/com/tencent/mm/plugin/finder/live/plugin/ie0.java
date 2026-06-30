package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ie0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.le0 f112963d;

    public ie0(com.tencent.mm.plugin.finder.live.plugin.le0 le0Var) {
        this.f112963d = le0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Float f17 = (java.lang.Float) obj;
        if (f17 != null) {
            float floatValue = f17.floatValue();
            com.tencent.mm.plugin.finder.live.plugin.le0 le0Var = this.f112963d;
            com.tencent.mars.xlog.Log.i(le0Var.f113390s, "initPlugin scrollAlphaData data:" + floatValue);
            le0Var.f113387p.setAlpha(floatValue);
        }
    }
}
