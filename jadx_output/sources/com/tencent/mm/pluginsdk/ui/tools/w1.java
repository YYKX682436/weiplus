package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public final class w1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.a2 f191965d;

    public w1(com.tencent.mm.pluginsdk.ui.tools.a2 a2Var) {
        this.f191965d = a2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.d(view);
        this.f191965d.l(view);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
