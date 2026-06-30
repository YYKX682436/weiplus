package pf4;

/* loaded from: classes.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf4.a f353888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pf4.s f353889e;

    public r(gf4.a aVar, pf4.s sVar) {
        this.f353888d = aVar;
        this.f353889e = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/adapter/StoryCommentListAdapter$CommentViewHolder$onBindAvatar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f353888d.f271330a);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 12);
        j45.l.j(this.f353889e.f353891e.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/adapter/StoryCommentListAdapter$CommentViewHolder$onBindAvatar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
