package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj4.h f174042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.m0 f174043e;

    public l0(mj4.h hVar, com.tencent.mm.plugin.textstatus.ui.m0 m0Var) {
        this.f174042d = hVar;
        this.f174043e = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView$update$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mj4.h hVar = this.f174042d;
        pj4.o0 a17 = hVar != null ? xe0.j0.a(hVar, false, 1, null) : null;
        if (a17 != null) {
            com.tencent.mm.plugin.textstatus.ui.m0 m0Var = this.f174043e;
            android.content.Context context = m0Var.f174067g;
            wi4.a.d(a17);
            bi4.o0 d17 = ((cj4.k) m0Var.f174075r).d();
            java.util.LinkedList jumpInfos = a17.f355216g;
            kotlin.jvm.internal.o.f(jumpInfos, "jumpInfos");
            kotlin.jvm.internal.o.g(context, "context");
            if (d17 != null) {
                d17.c(context);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView$update$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
