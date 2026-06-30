package hr3;

/* loaded from: classes5.dex */
public final class he extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f283615e;

    public he(hr3.pf pfVar, kotlin.jvm.internal.h0 h0Var) {
        this.f283614d = pfVar;
        this.f283615e = h0Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$initCommonSayHi$1$1$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        java.lang.String path = (java.lang.String) this.f283615e.f310123d;
        hr3.pf pfVar = this.f283614d;
        pfVar.getClass();
        kotlin.jvm.internal.o.g(path, "path");
        android.content.Intent intent = new android.content.Intent(pfVar.getActivity(), (java.lang.Class<?>) com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI.class);
        lk5.s.e(intent, true);
        intent.putExtra("Contact_User", pfVar.getUsername());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(path);
        intent.putExtra("remark_image_path", arrayList2);
        intent.putExtra("selected_item", 0);
        intent.putExtra("view_only", true);
        pfVar.getActivity().startActivityForResult(intent, 103);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$initCommonSayHi$1$1$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }
}
