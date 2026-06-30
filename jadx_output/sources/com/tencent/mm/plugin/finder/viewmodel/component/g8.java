package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class g8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f134475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.i8 f134476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f134477f;

    public g8(android.content.Context context, com.tencent.mm.plugin.finder.viewmodel.component.i8 i8Var, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f134475d = context;
        this.f134476e = i8Var;
        this.f134477f = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderCreateAccountFullScreenUIC$initDialog$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f134475d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(xy2.c.e(context));
        com.tencent.mm.plugin.finder.viewmodel.component.i8 i8Var = this.f134476e;
        if (!K0) {
            com.tencent.mm.plugin.finder.viewmodel.component.i8.O6(i8Var, 4);
        } else if (context instanceof android.app.Activity) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_create_scene", i8Var.f134717h);
            intent.putExtra("key_router_to_profile", false);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).qj(context, intent);
        }
        i8Var.f134719m = true;
        this.f134477f.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCreateAccountFullScreenUIC$initDialog$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
