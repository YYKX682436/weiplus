package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes7.dex */
public class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI f149404d;

    public q0(com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI mMSightRecordViewTestUI) {
        this.f149404d = mMSightRecordViewTestUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/ui/MMSightRecordViewTestUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f149404d.f149214d.g(true, false);
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.mmsight.ui.p0(this), 5000L);
        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/ui/MMSightRecordViewTestUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
