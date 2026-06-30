package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class j9 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.o9 f113070d;

    public j9(com.tencent.mm.plugin.finder.live.plugin.o9 o9Var) {
        this.f113070d = o9Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.q12 q12Var = (r45.q12) obj;
        if (q12Var != null) {
            int integer = q12Var.getInteger(0);
            com.tencent.mm.plugin.finder.live.plugin.o9 o9Var = this.f113070d;
            if (integer == 3) {
                o9Var.f113717r.setVisibility(8);
            } else {
                o9Var.f113717r.setVisibility(0);
            }
        }
        return jz5.f0.f302826a;
    }
}
