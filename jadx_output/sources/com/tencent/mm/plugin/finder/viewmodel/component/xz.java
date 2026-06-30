package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class xz extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f136504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.lz f136505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f136506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.h00 f136507g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz(android.content.Intent intent, com.tencent.mm.plugin.finder.viewmodel.component.lz lzVar, java.lang.String str, com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var) {
        super(0);
        this.f136504d = intent;
        this.f136505e = lzVar;
        this.f136506f = str;
        this.f136507g = h00Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.lz lzVar = this.f136505e;
        java.lang.Long l17 = lzVar.f135101e;
        android.content.Intent intent = this.f136504d;
        intent.putExtra("feed_object_id", l17);
        intent.putExtra("key_comment_scene", 385);
        intent.putExtra("key_reuqest_scene", 61);
        intent.putExtra("TARGET_FINDER_USERNAME_INTENT_KEY", lzVar.f135100d);
        intent.putExtra("key_from_session_id", this.f136506f);
        com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var = this.f136507g;
        intent.setClass(h00Var.getContext(), com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI.class);
        android.app.Activity context = h00Var.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$onItemClicked$jumpRelUI$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$onItemClicked$jumpRelUI$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f302826a;
    }
}
