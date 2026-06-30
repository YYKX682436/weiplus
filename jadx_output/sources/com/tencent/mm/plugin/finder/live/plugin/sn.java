package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class sn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.tn f114282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f114283e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(com.tencent.mm.plugin.finder.live.plugin.tn tnVar, com.tencent.mm.plugin.finder.live.plugin.ap apVar) {
        super(0);
        this.f114282d = tnVar;
        this.f114283e = apVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.zo zoVar;
        androidx.lifecycle.j0 j0Var;
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar = this.f114282d;
        com.tencent.mm.view.MMPAGView mMPAGView = tnVar.f114447n.f114596f;
        if (mMPAGView != null && (zoVar = (df2.zo) this.f114283e.U0(df2.zo.class)) != null && (j0Var = zoVar.f231980n) != null) {
            j0Var.postValue(new jz5.l(tnVar.f114452s, pm0.v.t(mMPAGView)));
        }
        return jz5.f0.f302826a;
    }
}
