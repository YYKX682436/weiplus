package q50;

/* loaded from: classes.dex */
public final class m implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f360156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f360157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.a3 f360158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.forward.ui.PreviewProfileUI f360159g;

    public m(java.util.List list, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.storage.a3 a3Var, com.tencent.mm.feature.forward.ui.PreviewProfileUI previewProfileUI) {
        this.f360156d = list;
        this.f360157e = h0Var;
        this.f360158f = a3Var;
        this.f360159g = previewProfileUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/forward/ui/PreviewProfileUI$onCreate$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e eVar = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_chat_group_avatar", "view_clk", kz5.c1.k(new jz5.l("forward_sid", com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209295b), new jz5.l("forw_confirm_screen_from", java.lang.Integer.valueOf(com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209297d))), 32337);
        java.lang.String str = (java.lang.String) this.f360156d.get(i17);
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str2 = (java.lang.String) this.f360157e.f310123d;
        com.tencent.mm.storage.a3 a3Var = this.f360158f;
        java.lang.String z07 = a3Var != null ? a3Var.z0(str) : null;
        intent.putExtra("room_name", str2);
        intent.putExtra("Contact_User", str);
        intent.putExtra("Contact_ChatRoomId", str2);
        intent.putExtra("Contact_RoomNickname", z07);
        intent.putExtra("Contact_Scene", 14);
        j45.l.j(this.f360159g.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/feature/forward/ui/PreviewProfileUI$onCreate$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
