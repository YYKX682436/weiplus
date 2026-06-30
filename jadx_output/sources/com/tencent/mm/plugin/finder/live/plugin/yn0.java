package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yn0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin f115220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn0(com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin) {
        super(0);
        this.f115220d = finderVisitorRoleChooserPlugin;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = this.f115220d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eho);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        r4Var.f3(context, string);
        return jz5.f0.f302826a;
    }
}
