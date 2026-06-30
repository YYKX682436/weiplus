package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class tb implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ub f210779d;

    public tb(com.tencent.mm.ui.tools.ub ubVar) {
        this.f210779d = ubVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/ShowImageUI$ImageAdapter$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.ui.tools.ShowImageUI showImageUI = this.f210779d.f210827n;
        if (showImageUI.f210194g) {
            showImageUI.f210203s = 1;
            showImageUI.Z6();
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/tools/ShowImageUI$ImageAdapter$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
