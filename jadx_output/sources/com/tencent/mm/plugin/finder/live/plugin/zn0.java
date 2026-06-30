package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zn0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin f115364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f115365e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin, int i17) {
        super(0);
        this.f115364d = finderVisitorRoleChooserPlugin;
        this.f115365e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin = this.f115364d;
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.yn0(finderVisitorRoleChooserPlugin));
        g92.b bVar = g92.b.f269769e;
        m92.f fVar = new m92.f();
        fVar.set(4, java.lang.Integer.valueOf(this.f115365e));
        com.tencent.mars.xlog.Log.i(finderVisitorRoleChooserPlugin.getTAG(), "[changeRole] current_alias_role_type:" + fVar.getInteger(4));
        bVar.S1(fVar, m92.j.f324996n);
        return jz5.f0.f302826a;
    }
}
