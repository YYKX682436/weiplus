package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class eo0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin f112442d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo0(com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin) {
        super(1);
        this.f112442d = finderVisitorRoleChooserPlugin;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.of1 it = (r45.of1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f112442d.setVisitorRole(it);
        return jz5.f0.f302826a;
    }
}
