package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ra0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wa0 f114120d;

    public ra0(com.tencent.mm.plugin.finder.live.plugin.wa0 wa0Var) {
        this.f114120d = wa0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Float f17 = (java.lang.Float) obj;
        if (f17 != null) {
            this.f114120d.f365323d.setAlpha(f17.floatValue());
        }
    }
}
