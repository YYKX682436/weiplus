package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class a30 extends com.tencent.mm.plugin.finder.extension.reddot.rb {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f133710d;

    public a30(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f133710d = f50Var;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.rb
    public void a(com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var) {
        boolean z17 = false;
        if (z9Var != null && z9Var.f105327a) {
            z17 = true;
        }
        this.f133710d.w7(z17, z9Var != null ? z9Var.f105330d : null);
    }
}
