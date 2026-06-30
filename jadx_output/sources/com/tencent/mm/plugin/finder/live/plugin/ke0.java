package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ke0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.le0 f113226d;

    public ke0(com.tencent.mm.plugin.finder.live.plugin.le0 le0Var) {
        this.f113226d = le0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var;
        com.tencent.mm.plugin.finder.live.plugin.le0 le0Var = this.f113226d;
        if (le0Var.x0() && (r60Var = (com.tencent.mm.plugin.finder.live.plugin.r60) le0Var.X0(com.tencent.mm.plugin.finder.live.plugin.r60.class)) != null) {
            le0Var.f365323d.post(new com.tencent.mm.plugin.finder.live.plugin.ge0(le0Var, r60Var));
        }
    }
}
