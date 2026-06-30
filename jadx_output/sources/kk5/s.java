package kk5;

/* loaded from: classes.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.w f308681d;

    public s(kk5.w wVar) {
        this.f308681d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/uic/ImportFromGroupUIC$onCreate$1$1$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kk5.w wVar = this.f308681d;
        wVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(wVar.getActivity(), "com.tencent.mm.plugin.label.ui.ContactLabelSelectUI");
        intent.putExtra("privacy_from_select_contact_ui", true);
        intent.putExtra("option_button_wording_res_id", com.tencent.mm.R.string.f490459vn);
        wVar.getActivity().startActivityForResult(intent, 8);
        yj0.a.h(this, "com/tencent/mm/ui/uic/ImportFromGroupUIC$onCreate$1$1$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
