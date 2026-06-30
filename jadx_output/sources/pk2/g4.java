package pk2;

/* loaded from: classes3.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f355773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.h4 f355774f;

    public g4(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 e3Var, pk2.h4 h4Var) {
        this.f355772d = o9Var;
        this.f355773e = e3Var;
        this.f355774f = h4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorSensitiveWordsOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pk2.o9 o9Var = this.f355772d;
        android.content.Intent intent = new android.content.Intent(o9Var.f356078d, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39.class);
        com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mMActivity, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorSensitiveWordsOption$addItem$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMActivity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(mMActivity, "com/tencent/mm/plugin/finder/live/moreaction/AnchorSensitiveWordsOption$addItem$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f355773e.h();
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.y4 y4Var = ml2.j0.f327583i;
        ((ml2.j0) c17).Nj("live_sensitive_word_button", "view_clk", null);
        pk2.h4 h4Var = this.f355774f;
        qk2.f.f(h4Var, false, 1, null);
        if (h4Var.n()) {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.z4 z4Var = ml2.z4.f328354h;
            ml2.d1[] d1VarArr = ml2.d1.f327350d;
            zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(4), null, 4, null);
        } else {
            java.lang.Integer num = 1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 6);
            if (num != null) {
                num.intValue();
                jSONObject.put("type", num.intValue());
            }
            jSONObject.put("sub_element", 2);
            jSONObject.put("sub_type", 3);
            i95.m c19 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            zy2.zb zbVar2 = (zy2.zb) c19;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar2, 37L, jSONObject.toString(), null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorSensitiveWordsOption$addItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
