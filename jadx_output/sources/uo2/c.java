package uo2;

/* loaded from: classes2.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.o03 f429603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView f429604e;

    public c(r45.o03 o03Var, com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView finderFollowTopicHeaderView) {
        this.f429603d = o03Var;
        this.f429604e = finderFollowTopicHeaderView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        r45.xk a17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$bindOriginFeed$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.o03 o03Var = this.f429603d;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) o03Var.getCustom(0);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView finderFollowTopicHeaderView = this.f429604e;
        if (finderContact == null || (a17 = ya2.d.a(finderContact, false)) == null) {
            f0Var = null;
        } else {
            android.content.Intent intent = new android.content.Intent();
            android.content.Context context = finderFollowTopicHeaderView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            iyVar.c(context, intent);
            intent.putExtra("Contact_User", a17.getString(0));
            intent.putExtra("Contact_Scene", 213);
            intent.putExtra("biz_profile_enter_from_finder", true);
            intent.putExtra("force_get_contact", true);
            intent.putExtra("key_use_new_contact_profile", true);
            intent.putExtra("biz_profile_tab_type", 1);
            j45.l.j(finderFollowTopicHeaderView.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            android.content.Intent intent2 = new android.content.Intent();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) o03Var.getCustom(0);
            intent2.putExtra("finder_username", finderContact2 != null ? finderContact2.getUsername() : null);
            android.content.Context context2 = finderFollowTopicHeaderView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context2, intent2, 0L, null, 0, 6, false, 0, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context3 = view.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            i0Var.mk(context3, intent2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$bindOriginFeed$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
