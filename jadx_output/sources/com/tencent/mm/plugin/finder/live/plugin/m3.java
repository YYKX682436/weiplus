package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class m3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f113458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        super(1);
        this.f113458d = v3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "onReplayCancelCallBack triggered with isEnabled=" + booleanValue);
        if (booleanValue) {
            com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f113458d;
            com.tencent.mm.plugin.finder.live.plugin.l3 l3Var = new com.tencent.mm.plugin.finder.live.plugin.l3(v3Var);
            v3Var.getClass();
            com.tencent.mm.plugin.finder.live.util.y.m(v3Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.z2(v3Var, l3Var, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
