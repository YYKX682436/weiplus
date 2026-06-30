package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class x8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f124348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124349e;

    public x8(ya2.b2 b2Var, com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f124348d = b2Var;
        this.f124349e = obVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleNickname$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putStringArrayListExtra("key_url_list", new java.util.ArrayList<>(kz5.b0.c(this.f124348d.y0())));
        intent.putExtra("key_preview_avatar", true);
        intent.putExtra("allow_long_click_save_image", false);
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f124349e;
        xy2.c.c(obVar.getActivity(), intent);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Bj(obVar.getActivity(), intent);
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        android.app.Activity context = obVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "icon_avatar", 1, null, false, null, 56, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleNickname$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
