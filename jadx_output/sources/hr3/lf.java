package hr3;

/* loaded from: classes5.dex */
public final class lf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283779e;

    public lf(hr3.pf pfVar, java.lang.String str) {
        this.f283778d = pfVar;
        this.f283779e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$showWithLocalPath$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hr3.pf pfVar = this.f283778d;
        android.content.Intent intent = new android.content.Intent(pfVar.getActivity(), (java.lang.Class<?>) com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI.class);
        lk5.s.e(intent, true);
        intent.putExtra("Contact_User", pfVar.getUsername());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(this.f283779e);
        intent.putExtra("remark_image_path", arrayList2);
        intent.putExtra("selected_item", 0);
        intent.putExtra("view_only", false);
        pfVar.getActivity().startActivityForResult(intent, 103);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$showWithLocalPath$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
