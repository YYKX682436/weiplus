package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.e0 f153481d;

    public h1(com.tencent.mm.plugin.profile.e0 e0Var) {
        this.f153481d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/NewContactWidgetNormal$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f153481d.f153433t.i();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/NewContactWidgetNormal$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
