package com.tencent.mm.plugin.finder.live.wish.view;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.view.x f120627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ot3 f120628e;

    public e(com.tencent.mm.plugin.finder.live.wish.view.x xVar, r45.ot3 ot3Var) {
        this.f120627d = xVar;
        this.f120628e = ot3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper$GiftWallItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 3);
        r45.ot3 ot3Var = this.f120628e;
        java.lang.String string = ot3Var.getString(0);
        if (string == null) {
            string = "";
        }
        jSONObject.put("gift_id", string);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.finder.live.wish.view.x xVar = this.f120627d;
        xVar.l(jSONObject2);
        com.tencent.mm.plugin.finder.live.wish.view.x.e(xVar, new com.tencent.mm.plugin.finder.live.wish.view.d(ot3Var, xVar));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper$GiftWallItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
