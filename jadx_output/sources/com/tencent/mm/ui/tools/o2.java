package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CropImageNewUI f210617d;

    public o2(com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI) {
        this.f210617d = cropImageNewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/CropImageNewUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.tools.CropImageNewUI.V6(this.f210617d, true);
        yj0.a.h(this, "com/tencent/mm/ui/tools/CropImageNewUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
