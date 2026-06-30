package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.m0 f173856d;

    public f0(com.tencent.mm.plugin.textstatus.ui.m0 m0Var) {
        this.f173856d = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bi4.m0 m0Var = this.f173856d.K;
        if (m0Var != null) {
            m0Var.a(1, view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
