package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes4.dex */
public class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149340d;

    public h2(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        this.f149340d = sightCaptureUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.N1;
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149340d;
        int i18 = sightCaptureUI.f149231g;
        boolean z17 = true;
        if (i18 != 4 && i18 != 3 && i18 != 1 && i18 != 8 && i18 != 9) {
            z17 = false;
        }
        if (!z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        sightCaptureUI.finish();
        sightCaptureUI.overridePendingTransition(-1, com.tencent.mm.R.anim.f477877e1);
        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
