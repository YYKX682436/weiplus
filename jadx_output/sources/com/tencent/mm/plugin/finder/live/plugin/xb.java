package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class xb implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f115066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ac f115067e;

    public xb(boolean z17, com.tencent.mm.plugin.finder.live.plugin.ac acVar) {
        this.f115066d = z17;
        this.f115067e = acVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (this.f115066d && !booleanValue) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveBoxPlugin", "box finish");
            com.tencent.mm.plugin.finder.live.plugin.ac acVar = this.f115067e;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveBoxPlugin", "stopBox ".concat(pm0.v.u(acVar.f111851u)));
            com.tencent.mm.plugin.finder.live.util.y.m(acVar, null, null, new com.tencent.mm.plugin.finder.live.plugin.zb(acVar, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
