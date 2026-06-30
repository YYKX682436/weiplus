package com.tencent.mm.plugin.multitask;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/multitask/z1;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class z1 implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView;
        ck3.t tVar;
        com.tencent.mm.plugin.multitask.s1.f150502d.a();
        tk3.d dVar = tk3.t.f419947o.a().f419949d;
        return new com.tencent.mm.ipcinvoker.type.IPCBoolean((dVar == null || (multiTaskNewFloatBallView = dVar.f419913a) == null || (tVar = multiTaskNewFloatBallView.f150539g) == null || (!tVar.e() && !tVar.d())) ? false : true);
    }
}
