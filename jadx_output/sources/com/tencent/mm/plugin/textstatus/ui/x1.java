package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes8.dex */
public final class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.j2 f174416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f174417e;

    public x1(com.tencent.mm.plugin.textstatus.ui.j2 j2Var, java.lang.String str) {
        this.f174416d = j2Var;
        this.f174417e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/MultipleTextStatusCardDialog$addSetStatusButton$button$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.j2.c(this.f174416d, this.f174417e);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/MultipleTextStatusCardDialog$addSetStatusButton$button$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
