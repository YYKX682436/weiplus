package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class h8 implements com.tencent.mm.plugin.finder.view.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.i8 f134595a;

    public h8(com.tencent.mm.plugin.finder.viewmodel.component.i8 i8Var) {
        this.f134595a = i8Var;
    }

    @Override // com.tencent.mm.plugin.finder.view.d3
    public final void onDismiss() {
        com.tencent.mm.plugin.finder.viewmodel.component.i8 i8Var = this.f134595a;
        if (!i8Var.f134719m) {
            com.tencent.mm.plugin.finder.viewmodel.component.i8.O6(i8Var, 2);
        }
        i8Var.f134718i = null;
        if (i8Var.getActivity().isFinishing()) {
            return;
        }
        i8Var.getActivity().finish();
    }
}
