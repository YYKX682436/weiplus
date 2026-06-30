package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class z5 extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity f174474c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f174475d;

    public z5(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity textStatusDoWhatActivity, kotlin.jvm.internal.h0 h0Var) {
        this.f174474c = textStatusDoWhatActivity;
        this.f174475d = h0Var;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f174474c.f173513d;
        java.lang.Integer valueOf = (wxRecyclerView == null || (adapter = wxRecyclerView.getAdapter()) == null) ? null : java.lang.Integer.valueOf(adapter.getItemViewType(i17));
        kotlin.jvm.internal.h0 h0Var = this.f174475d;
        if (valueOf != null && valueOf.intValue() == -1) {
            return ((androidx.recyclerview.widget.GridLayoutManager) h0Var.f310123d).f11861w;
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            return ((androidx.recyclerview.widget.GridLayoutManager) h0Var.f310123d).f11861w;
        }
        return 1;
    }
}
