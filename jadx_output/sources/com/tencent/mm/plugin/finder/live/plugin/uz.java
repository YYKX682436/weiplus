package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class uz implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.zz f114627d;

    public uz(com.tencent.mm.plugin.finder.live.plugin.zz zzVar) {
        this.f114627d = zzVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        com.tencent.mars.xlog.Log.i("MultiStreamPlugin", "receive multiStreamUpdateMock " + linkedList);
        kotlin.jvm.internal.o.d(linkedList);
        com.tencent.mm.plugin.finder.live.plugin.zz.t1(this.f114627d, linkedList);
    }
}
