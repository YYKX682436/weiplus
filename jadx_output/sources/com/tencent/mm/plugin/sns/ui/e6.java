package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class e6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.f6 f168224d;

    public e6(com.tencent.mm.plugin.sns.ui.f6 f6Var) {
        this.f168224d = f6Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.MusicWidget$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/MusicWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.f6 f6Var = this.f168224d;
        if (f6Var.q()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            f6Var.p();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            f6Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doBeginPlayMusic", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            if (f6Var.f168292g == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MusicWidget", "doBeingPlayMusic: but item is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBeginPlayMusic", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            } else {
                new com.tencent.mm.sdk.platformtools.n3(f6Var.f169957c.getMainLooper()).post(new com.tencent.mm.plugin.sns.ui.d6(f6Var));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBeginPlayMusic", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/MusicWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.MusicWidget$4");
    }
}
