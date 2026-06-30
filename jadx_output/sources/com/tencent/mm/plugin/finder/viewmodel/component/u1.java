package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f2 f136079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f136080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.tencent.mm.plugin.finder.viewmodel.component.f2 f2Var, long j17) {
        super(0);
        this.f136079d = f2Var;
        this.f136080e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.f2 f2Var = this.f136079d;
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) f2Var.f134320h.remove(java.lang.Long.valueOf(this.f136080e));
        if (multiTaskInfo != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.t1(f2Var, multiTaskInfo));
        }
        return jz5.f0.f302826a;
    }
}
