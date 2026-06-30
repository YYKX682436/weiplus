package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class m2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.z2 f124622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cq2 f124623e;

    public m2(com.tencent.mm.plugin.finder.profile.widget.z2 z2Var, r45.cq2 cq2Var) {
        this.f124622d = z2Var;
        this.f124623e = cq2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderPostPlayBannerWidget$handlePostPlayBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.cq2 cq2Var = this.f124623e;
        com.tencent.mm.plugin.finder.profile.widget.z2 z2Var = this.f124622d;
        androidx.appcompat.app.AppCompatActivity context = z2Var.f124845a;
        try {
            java.util.LinkedList idea_list = cq2Var.f371784d;
            kotlin.jvm.internal.o.f(idea_list, "idea_list");
            if (!idea_list.isEmpty()) {
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerNewUI.class);
                java.lang.String str = cq2Var.f371786f;
                if (str == null) {
                    str = "";
                }
                intent.putExtra("by_pass", str);
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                intent.putExtra("key_from_comment_scene", nyVar != null ? nyVar.f135380n : 0);
                androidx.appcompat.app.AppCompatActivity appCompatActivity = z2Var.f124845a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(appCompatActivity, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/widget/HeaderPostPlayBannerWidget", "jumpToPostPlayList", "(Lcom/tencent/mm/protocal/protobuf/FinderPostPlayBanner;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                appCompatActivity.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(appCompatActivity, "com/tencent/mm/plugin/finder/profile/widget/HeaderPostPlayBannerWidget", "jumpToPostPlayList", "(Lcom/tencent/mm/protocal/protobuf/FinderPostPlayBanner;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("HeaderPostPlayBannerWidget", "jumpToPostPlayList error: " + e17.getMessage());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderPostPlayBannerWidget$handlePostPlayBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
