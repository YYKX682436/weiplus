package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class cn implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.kn f112178d;

    public cn(com.tencent.mm.plugin.finder.live.plugin.kn knVar) {
        this.f112178d = knVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.widget.rk rkVar;
        if (((java.lang.Boolean) obj).booleanValue() && (rkVar = this.f112178d.f113290q) != null) {
            rkVar.a("editingCustomGift");
        }
        return jz5.f0.f302826a;
    }
}
