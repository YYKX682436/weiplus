package com.tencent.mm.plugin.profile;

/* loaded from: classes.dex */
public final class d2 extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f153416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f153417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153418f;

    public d2(android.content.Intent intent, com.tencent.mm.storage.z3 z3Var, java.lang.String str) {
        this.f153416d = intent;
        this.f153417e = z3Var;
        this.f153418f = str;
        setColor(i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.f478524a5), i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.ahd));
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ProfileUtilsKt$getPhoneSpan$1$clickableSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        com.tencent.mm.plugin.profile.p2.Bi(this.f153416d, 17, 1, this.f153417e.d1());
        android.content.Context context = widget.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, false, 1);
        k0Var.f211872n = new com.tencent.mm.plugin.profile.l2(context);
        k0Var.f211881s = new com.tencent.mm.plugin.profile.m2(this.f153418f, context);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ProfileUtilsKt$getPhoneSpan$1$clickableSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
