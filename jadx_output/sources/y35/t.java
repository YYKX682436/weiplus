package y35;

/* loaded from: classes3.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y35.z f459254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y35.r f459255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459256f;

    public t(y35.z zVar, y35.r rVar, java.lang.String str) {
        this.f459254d = zVar;
        this.f459255e = rVar;
        this.f459256f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder$bindData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        y35.z zVar = this.f459254d;
        intent.setClassName((android.content.Context) ((jz5.n) zVar.f459269e).getValue(), "com.tencent.mm.ui.contact.ContactSayHiImagePreviewUI");
        lk5.s.e(intent, true);
        intent.putExtra("Contact_User", this.f459255e.f459232a);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(this.f459256f);
        intent.putExtra("remark_image_path", arrayList2);
        intent.putExtra("selected_item", 0);
        intent.putExtra("view_only", true);
        android.content.Context context = (android.content.Context) ((jz5.n) zVar.f459269e).getValue();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(intent);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder$bindData$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList3.get(0));
        yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder$bindData$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder$bindData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
