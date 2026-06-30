package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class h4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.k4 f117127d;

    public h4(com.tencent.mm.plugin.finder.live.viewmodel.k4 k4Var) {
        this.f117127d = k4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveGiftWallTopFirstDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.Z1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 8);
        com.tencent.mm.plugin.finder.live.viewmodel.k4 k4Var = this.f117127d;
        r45.kv1 kv1Var = k4Var.f117189h;
        if (kv1Var == null || (str = kv1Var.getString(0)) == null) {
            str = "";
        }
        jSONObject.put("gift_id", str);
        ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        k4Var.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveGiftWallTopFirstDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
