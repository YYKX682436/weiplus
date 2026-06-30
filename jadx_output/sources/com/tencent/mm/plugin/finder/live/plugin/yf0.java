package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yf0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ag0 f115193d;

    public yf0(com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var) {
        this.f115193d = ag0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.f fVar = (mm2.f) obj;
        com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = this.f115193d;
        com.tencent.mars.xlog.Log.i(ag0Var.f111881w, "onVideoPlayStateChange: " + fVar);
        int i17 = fVar == null ? -1 : com.tencent.mm.plugin.finder.live.plugin.xf0.f115084a[fVar.ordinal()];
        com.tencent.mm.plugin.finder.live.widget.e30 e30Var = ag0Var.B;
        if (i17 == 1 || i17 == 2) {
            e30Var.f118221z.setAlpha(1.0f);
            e30Var.f118220y.setAlpha(1.0f);
        } else if (i17 == 3 || i17 == 4) {
            e30Var.f118221z.setAlpha(0.0f);
            e30Var.f118220y.setAlpha(0.0f);
        }
    }
}
