package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class xj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f130028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f130029e;

    public xj(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI, boolean z17) {
        this.f130028d = finderShareFeedRelUI;
        this.f130029e = z17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initPersonalCenter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f130028d;
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI.v7(finderShareFeedRelUI, 2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_user_prepare_scene", 20);
        if (this.f130029e) {
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("TLPersonalCenter");
            intent.putExtra("RED_DOT_EXIST_ON_ENTER", (L0 != null ? L0.I0("TLPersonalCenter") : null) != null);
        }
        intent.putExtra("key_ref_feed_id", finderShareFeedRelUI.f128784p0);
        intent.putExtra("key_ref_feed_dup_flag", finderShareFeedRelUI.f128786x0);
        androidx.appcompat.app.AppCompatActivity context = finderShareFeedRelUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        intent.putExtra("key_ref_comment_scene", ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        androidx.appcompat.app.AppCompatActivity context2 = finderShareFeedRelUI.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context2, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        androidx.appcompat.app.AppCompatActivity context3 = finderShareFeedRelUI.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        i0Var.qk(context3, intent);
        finderShareFeedRelUI.overridePendingTransition(com.tencent.mm.ui.uc.f211078a, com.tencent.mm.ui.uc.f211079b);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initPersonalCenter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
