package pk2;

/* loaded from: classes3.dex */
public final class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f356141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f356142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356143f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk2.q3 f356144g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f356145h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f356146i;

    public p3(r45.t62 t62Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, pk2.o9 o9Var, pk2.q3 q3Var, android.view.View view, r45.t62 t62Var2) {
        this.f356141d = t62Var;
        this.f356142e = finderJumpInfo;
        this.f356143f = o9Var;
        this.f356144g = q3Var;
        this.f356145h = view;
        this.f356146i = t62Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption$addItem$2$3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        r45.t62 t62Var = this.f356141d;
        java.util.LinkedList list = t62Var.getList(2);
        kotlin.jvm.internal.o.f(list, "getRecommend_city_list(...)");
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.Integer num = (java.lang.Integer) obj;
            java.util.LinkedList list2 = t62Var.getList(4);
            kotlin.jvm.internal.o.f(list2, "getTranslate_recommend_city_list(...)");
            java.lang.String str = (java.lang.String) kz5.n0.a0(list2, i17);
            if (str == null) {
                str = "";
            }
            arrayList2.add(new jz5.l(str, num));
            i17 = i18;
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo = this.f356142e;
        r45.k74 lite_app_info = jumpInfo.getLite_app_info();
        if (lite_app_info != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.LinkedList<java.lang.Integer> list3 = t62Var.getList(2);
            kotlin.jvm.internal.o.f(list3, "getRecommend_city_list(...)");
            for (java.lang.Integer num2 : list3) {
                kotlin.jvm.internal.o.d(num2);
                jSONArray.put(num2.intValue());
            }
            jSONObject.put("area_ids", jSONArray);
            lite_app_info.set(2, jSONObject.toString());
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        com.tencent.mm.ui.MMActivity mMActivity = this.f356143f.f356078d;
        kotlin.jvm.internal.o.f(jumpInfo, "$jumpInfo");
        zy2.ta.g(e1Var, mMActivity, jumpInfo, new pk2.o3(t62Var, this.f356144g, this.f356145h, this.f356146i), null, true, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption$addItem$2$3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
