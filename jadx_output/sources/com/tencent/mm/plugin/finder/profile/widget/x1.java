package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f124818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xk f124819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.z1 f124820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124821g;

    public x1(ya2.b2 b2Var, r45.xk xkVar, com.tencent.mm.plugin.finder.profile.widget.z1 z1Var, java.lang.String str) {
        this.f124818d = b2Var;
        this.f124819e = xkVar;
        this.f124820f = z1Var;
        this.f124821g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderMediaEntranceWidget$handleMediaEntrance$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
        ya2.b2 b2Var = this.f124818d;
        java.lang.String D0 = b2Var != null ? b2Var.D0() : "";
        r45.xk xkVar = this.f124819e;
        java.lang.String string = xkVar.getString(0);
        java.lang.String str = string == null ? "" : string;
        com.tencent.mm.plugin.finder.profile.widget.z1 z1Var = this.f124820f;
        androidx.appcompat.app.AppCompatActivity activity = z1Var.f124841a;
        kotlin.jvm.internal.o.g(activity, "activity");
        o3Var.Ak(4, D0, str, "", ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", xkVar.getString(0));
        intent.putExtra("Contact_Scene", 183);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("Contact_Scene", 210);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = z1Var.f124841a;
        j45.l.j(appCompatActivity, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        com.tencent.mm.plugin.finder.report.t2.f125363a.a(z1Var.f124841a, this.f124821g, true, xkVar.getString(6), xkVar.getString(0), appCompatActivity.getIntent().getLongExtra("finder_from_feed_id", 0L));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderMediaEntranceWidget$handleMediaEntrance$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
