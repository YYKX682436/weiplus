package y35;

/* loaded from: classes3.dex */
public final class h0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.preference.VerifyRecordListView f459214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459215e;

    public h0(com.tencent.mm.pluginsdk.ui.preference.VerifyRecordListView verifyRecordListView, java.lang.String str) {
        this.f459214d = verifyRecordListView;
        this.f459215e = str;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/preference/VerifyRecordListView$bindCloudProviders$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.pluginsdk.ui.preference.VerifyRecordListView verifyRecordListView = this.f459214d;
        db5.e1.f(verifyRecordListView.getContext(), null, new java.lang.String[]{verifyRecordListView.getContext().getString(com.tencent.mm.R.string.b1i)}, null, null, new y35.g0(this.f459215e));
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/preference/VerifyRecordListView$bindCloudProviders$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
