package com.tencent.mm.plugin.profile;

/* loaded from: classes.dex */
public final class a2 extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f153385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f153386e;

    public a2(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.storage.z3 z3Var) {
        this.f153385d = mMActivity;
        this.f153386e = z3Var;
        setColor(i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.f478524a5), i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.ahd));
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ProfileUtilsKt$getDescImageSpan$clickableSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.ui.MMActivity mMActivity = this.f153385d;
        android.content.Intent intent = mMActivity.getIntent();
        com.tencent.mm.storage.z3 z3Var = this.f153386e;
        com.tencent.mm.plugin.profile.p2.Bi(intent, 37, 1, z3Var.d1());
        com.tencent.mm.plugin.profile.n2.f153540a.c(z3Var, new com.tencent.mm.sdk.coroutines.LifecycleScope("MicroMsg.ProfileUtilsKt", this.f153385d, 0, 4, null), new com.tencent.mm.plugin.profile.y1(h0Var, mMActivity), new com.tencent.mm.plugin.profile.z1(h0Var, mMActivity, z3Var));
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ProfileUtilsKt$getDescImageSpan$clickableSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
