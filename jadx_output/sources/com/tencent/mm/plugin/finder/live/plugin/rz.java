package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class rz implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.zz f114201d;

    public rz(com.tencent.mm.plugin.finder.live.plugin.zz zzVar) {
        this.f114201d = zzVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        if (bool.booleanValue()) {
            com.tencent.mm.plugin.finder.live.plugin.zz zzVar = this.f114201d;
            com.tencent.mm.plugin.finder.live.plugin.hz hzVar = (com.tencent.mm.plugin.finder.live.plugin.hz) zzVar.X0(com.tencent.mm.plugin.finder.live.plugin.hz.class);
            if (hzVar != null) {
                hzVar.w1();
            }
            zzVar.u1().w();
        }
    }
}
