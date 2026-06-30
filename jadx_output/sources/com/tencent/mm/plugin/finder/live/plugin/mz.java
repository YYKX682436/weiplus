package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class mz implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.oz f113572d;

    public mz(com.tencent.mm.plugin.finder.live.plugin.oz ozVar) {
        this.f113572d = ozVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Float f17 = (java.lang.Float) obj;
        if (f17 != null) {
            f17.floatValue();
            this.f113572d.f113804p.setAlpha(f17.floatValue());
        }
    }
}
