package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes7.dex */
public class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI f149371d;

    public n0(com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI mMSightRecordViewTestUI) {
        this.f149371d = mMSightRecordViewTestUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/ui/MMSightRecordViewTestUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f149371d.f149214d.j(new com.tencent.mm.plugin.mmsight.ui.m0(this), true, false);
        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/ui/MMSightRecordViewTestUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
