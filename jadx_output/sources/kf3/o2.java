package kf3;

/* loaded from: classes.dex */
public final class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendSelectPreviewFinderActivity f307408d;

    public o2(com.tencent.mm.plugin.masssend.ui.MassSendSelectPreviewFinderActivity massSendSelectPreviewFinderActivity) {
        this.f307408d = massSendSelectPreviewFinderActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/masssend/ui/MassSendSelectPreviewFinderActivity$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.masssend.ui.MassSendSelectPreviewFinderActivity massSendSelectPreviewFinderActivity = this.f307408d;
        massSendSelectPreviewFinderActivity.setResult(-1);
        massSendSelectPreviewFinderActivity.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/masssend/ui/MassSendSelectPreviewFinderActivity$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
