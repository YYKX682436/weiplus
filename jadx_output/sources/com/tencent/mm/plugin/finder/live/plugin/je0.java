package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class je0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.le0 f113087d;

    public je0(com.tencent.mm.plugin.finder.live.plugin.le0 le0Var) {
        this.f113087d = le0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.le0 le0Var = this.f113087d;
        com.tencent.mars.xlog.Log.i(le0Var.f113390s, "onVideoPlayStateChange: " + ((mm2.f) obj));
        le0Var.t1();
    }
}
