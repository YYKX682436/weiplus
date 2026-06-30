package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public final class y1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.a2 f192007d;

    public y1(com.tencent.mm.pluginsdk.ui.tools.a2 a2Var) {
        this.f192007d = a2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.tools.a2 a2Var = this.f192007d;
        com.tencent.mars.xlog.Log.i(a2Var.f191502d, "FolderViewHolder: selectorWrapper clicked");
        kotlin.jvm.internal.o.d(view);
        a2Var.l(view);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
