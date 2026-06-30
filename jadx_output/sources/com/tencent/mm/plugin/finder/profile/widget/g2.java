package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f124551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.i2 f124552f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f124553g;

    public g2(java.lang.String str, java.util.LinkedList linkedList, com.tencent.mm.plugin.finder.profile.widget.i2 i2Var, ya2.b2 b2Var) {
        this.f124550d = str;
        this.f124551e = linkedList;
        this.f124552f = i2Var;
        this.f124553g = b2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderMiniProgramWidget$handleMIniProgramList$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        java.lang.String str = this.f124550d;
        java.lang.String str2 = str == null ? "" : str;
        java.util.LinkedList linkedList = this.f124551e;
        java.lang.String string = ((r45.ch2) linkedList.get(0)).getString(0);
        java.lang.String str3 = string == null ? "" : string;
        com.tencent.mm.plugin.finder.profile.widget.i2 i2Var = this.f124552f;
        androidx.appcompat.app.AppCompatActivity activity = i2Var.f124574a;
        kotlin.jvm.internal.o.g(activity, "activity");
        o3Var.Ak(6, str2, "", str3, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        java.lang.String string2 = ((r45.ch2) linkedList.get(0)).getString(0);
        java.lang.String string3 = ((r45.ch2) linkedList.get(0)).getString(1);
        if (string2 != null && string3 != null) {
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            androidx.appcompat.app.AppCompatActivity appCompatActivity = i2Var.f124574a;
            ya2.b2 b2Var = this.f124553g;
            i0Var.ll(appCompatActivity, string2, string3, com.tencent.mm.plugin.appbrand.jsapi.profile.r.CTRL_INDEX, b2Var != null ? b2Var.D0() : "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderMiniProgramWidget$handleMIniProgramList$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
