package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f113053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.b f113054e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, km2.b bVar) {
        super(4);
        this.f113053d = v3Var;
        this.f113054e = bVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String path = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj3).booleanValue();
        boolean booleanValue3 = ((java.lang.Boolean) obj4).booleanValue();
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "genCallback triggered with path: " + path + ", needGenHighLight: " + booleanValue + ", isChecked: " + booleanValue2 + ", onlyMember: " + booleanValue3);
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f113053d;
        com.tencent.mm.plugin.finder.live.util.y.m(v3Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.i3(v3Var, path, booleanValue2, booleanValue3, booleanValue, this.f113054e, null), 3, null);
        return jz5.f0.f302826a;
    }
}
