package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class e60 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f112375d;

    public e60(com.tencent.mm.plugin.finder.live.plugin.r60 r60Var) {
        this.f112375d = r60Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f112375d;
        com.tencent.mars.xlog.Log.i(r60Var.f114098s, "[liveBubbleShowStatusLiveData] " + bool);
        r60Var.F1(java.lang.Boolean.valueOf(bool.booleanValue() ^ true));
    }
}
