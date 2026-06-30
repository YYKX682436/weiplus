package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class fg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusShowExpireStatusUI f173883d;

    public fg(com.tencent.mm.plugin.textstatus.ui.TextStatusShowExpireStatusUI textStatusShowExpireStatusUI) {
        this.f173883d = textStatusShowExpireStatusUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusShowExpireStatusUI$onCreate$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusShowExpireStatusUI", " btnClose OnClickListener ");
        this.f173883d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusShowExpireStatusUI$onCreate$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
