package pf4;

/* loaded from: classes4.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pf4.e f353856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pf4.c f353857f;

    public d(java.lang.String str, pf4.e eVar, pf4.c cVar) {
        this.f353855d = str;
        this.f353856e = eVar;
        this.f353857f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/adapter/GalleryAvatarAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.isSelected()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", this.f353855d);
            intent.putExtra("Contact_ChatRoomId", this.f353856e.f353860e);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 15);
            j45.l.j(this.f353857f.itemView.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/adapter/GalleryAvatarAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
