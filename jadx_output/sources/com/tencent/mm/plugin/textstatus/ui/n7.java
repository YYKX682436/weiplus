package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class n7 extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f174120c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f174121d;

    public n7(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2, kotlin.jvm.internal.h0 h0Var) {
        this.f174120c = textStatusDoWhatActivityV2;
        this.f174121d = h0Var;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f174120c.f173537e;
        java.lang.Integer valueOf = (wxRecyclerView == null || (adapter = wxRecyclerView.getAdapter()) == null) ? null : java.lang.Integer.valueOf(adapter.getItemViewType(i17));
        kotlin.jvm.internal.h0 h0Var = this.f174121d;
        return (valueOf != null && valueOf.intValue() == -1) ? ((androidx.recyclerview.widget.GridLayoutManager) h0Var.f310123d).f11861w : (valueOf != null && valueOf.intValue() == 1) ? ((androidx.recyclerview.widget.GridLayoutManager) h0Var.f310123d).f11861w : (valueOf != null && valueOf.intValue() == 2) ? ((androidx.recyclerview.widget.GridLayoutManager) h0Var.f310123d).f11861w : (valueOf != null && valueOf.intValue() == 3) ? ((androidx.recyclerview.widget.GridLayoutManager) h0Var.f310123d).f11861w : (valueOf != null && valueOf.intValue() == 4) ? ((androidx.recyclerview.widget.GridLayoutManager) h0Var.f310123d).f11861w : ((androidx.recyclerview.widget.GridLayoutManager) h0Var.f310123d).f11861w;
    }
}
