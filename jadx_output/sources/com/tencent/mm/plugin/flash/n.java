package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.FaceFlashProcessLayout f137231d;

    public n(com.tencent.mm.plugin.flash.FaceFlashProcessLayout faceFlashProcessLayout) {
        this.f137231d = faceFlashProcessLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/flash/FaceFlashProcessLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f137231d.f137041d.Y6();
        yj0.a.h(this, "com/tencent/mm/plugin/flash/FaceFlashProcessLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
