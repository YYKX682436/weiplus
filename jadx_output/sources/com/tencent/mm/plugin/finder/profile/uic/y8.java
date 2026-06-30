package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class y8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124385d;

    public y8(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f124385d = obVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleOriginCount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.assist.n5 n5Var = com.tencent.mm.plugin.finder.assist.n5.f102402a;
        androidx.appcompat.app.AppCompatActivity context = this.f124385d.getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(dm.i4.COL_USERNAME, xy2.c.e(context));
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        n5Var.d(context, "wxalite17bb73d0180cae18320aefbf49ecd90d", "pages/home/entry", jSONObject2, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleOriginCount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
