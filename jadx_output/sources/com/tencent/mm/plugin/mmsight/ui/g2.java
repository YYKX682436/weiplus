package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149334d;

    public g2(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        this.f149334d = sightCaptureUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149334d;
        fp.e eVar = sightCaptureUI.f149249x0;
        if (eVar != null) {
            eVar.a();
        }
        sightCaptureUI.c7();
        sightCaptureUI.Y6(true);
        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
