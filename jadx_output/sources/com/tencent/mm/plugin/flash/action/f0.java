package com.tencent.mm.plugin.flash.action;

/* loaded from: classes.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout f137135d;

    public f0(com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout faceFlashActionProcessLayout) {
        this.f137135d = faceFlashActionProcessLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/flash/action/FaceFlashActionProcessLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f137135d.f137089d.Y6();
        yj0.a.h(this, "com/tencent/mm/plugin/flash/action/FaceFlashActionProcessLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
