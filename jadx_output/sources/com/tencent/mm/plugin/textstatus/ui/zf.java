package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class zf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusPreviewFinderActivity f174492d;

    public zf(com.tencent.mm.plugin.textstatus.ui.TextStatusPreviewFinderActivity textStatusPreviewFinderActivity) {
        this.f174492d = textStatusPreviewFinderActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusPreviewFinderActivity$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.TextStatusPreviewFinderActivity textStatusPreviewFinderActivity = this.f174492d;
        textStatusPreviewFinderActivity.setResult(-1);
        textStatusPreviewFinderActivity.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusPreviewFinderActivity$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
