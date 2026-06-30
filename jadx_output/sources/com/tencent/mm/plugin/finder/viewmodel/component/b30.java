package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class b30 extends com.tencent.mm.plugin.finder.extension.reddot.rb {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f133832d;

    public b30(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f133832d = f50Var;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.rb
    public void a(com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var) {
        r45.f03 f03Var;
        r45.f03 f03Var2;
        java.lang.String str = (z9Var == null || (f03Var2 = z9Var.f105328b) == null) ? null : f03Var2.f373906z;
        boolean z17 = str == null || str.length() == 0;
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f133832d;
        if (!z17) {
            if (!kotlin.jvm.internal.o.b((z9Var == null || (f03Var = z9Var.f105328b) == null) ? null : f03Var.f373906z, f50Var.f134338d)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("return show this reddot ");
                sb6.append(z9Var != null ? z9Var.f105329c : null);
                com.tencent.mars.xlog.Log.w("Finder.SelfUIC", sb6.toString());
                return;
            }
        }
        f50Var.y7();
    }
}
