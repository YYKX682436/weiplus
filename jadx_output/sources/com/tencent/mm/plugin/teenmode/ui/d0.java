package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f172962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI f172963e;

    public d0(android.widget.RelativeLayout relativeLayout, com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI authorizationRequestUI) {
        this.f172962d = relativeLayout;
        this.f172963e = authorizationRequestUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/AuthorizationRequestUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
        android.content.Context context = this.f172962d.getContext();
        com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI authorizationRequestUI = this.f172963e;
        c0Var.u6(context, authorizationRequestUI.getIntent().getIntExtra("intent_extra_type", 0), authorizationRequestUI.getIntent().getStringExtra("intent_extra_key"), authorizationRequestUI.getIntent().getStringExtra("intent_extra_title"), authorizationRequestUI.getIntent().getStringExtra("intent_extra_digest"), authorizationRequestUI.getIntent().getStringExtra("intent_extra_content"), null, new com.tencent.mm.plugin.teenmode.ui.c0(authorizationRequestUI));
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/AuthorizationRequestUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
