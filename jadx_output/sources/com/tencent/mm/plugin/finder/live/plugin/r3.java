package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f114075d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        super(2);
        this.f114075d = v3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj2;
        kotlin.jvm.internal.o.g((com.tencent.mm.modelbase.i) obj, "<anonymous parameter 0>");
        if (this.f114075d.f113330o.f11605c != androidx.lifecycle.n.DESTROYED) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd errType:");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
            sb6.append(", errCode:");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
            com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", sb6.toString());
        }
        return jz5.f0.f302826a;
    }
}
