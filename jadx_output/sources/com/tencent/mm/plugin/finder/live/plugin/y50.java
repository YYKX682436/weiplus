package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class y50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f115157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y50(com.tencent.mm.plugin.finder.live.plugin.r60 r60Var) {
        super(0);
        this.f115157d = r60Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f115157d;
        android.view.ViewGroup viewGroup = r60Var.f114102w;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("promoteBubbleContainer");
            throw null;
        }
        viewGroup.removeAllViews();
        df2.pv pvVar = (df2.pv) r60Var.U0(df2.pv.class);
        if (pvVar != null) {
            pvVar.b7(r60Var);
        }
        com.tencent.mm.plugin.finder.live.plugin.l.b1(r60Var, null, r60Var.f114098s, false, 4, null);
        return jz5.f0.f302826a;
    }
}
