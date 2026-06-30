package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class x30 extends com.tencent.mm.plugin.finder.extension.reddot.rb {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f136391d;

    public x30(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f136391d = f50Var;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.rb
    public void a(com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var) {
        boolean z17 = false;
        if (z9Var != null && z9Var.f105327a) {
            z17 = true;
        }
        this.f136391d.v7(z17, z9Var != null ? z9Var.f105330d : null);
    }
}
