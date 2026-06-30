package pk2;

/* loaded from: classes3.dex */
public final class y0 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356389i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356389i = "anchorlive.more.edittitle";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356389i;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 bottomSheet, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f131959f;
        if (!n()) {
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.d1h);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.hwi);
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.T;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.e1[] e1VarArr = ml2.e1.f327373d;
        ml2.f1[] f1VarArr = ml2.f1.f327422d;
        jSONObject.put("type", 1);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        i95.m c18 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb.I8((zy2.zb) c18, ml2.u1.K, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.d1h);
        if (findViewById3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484160d72)).setText(o9Var.f356078d.getResources().getString(((mm2.c1) o9Var.c(mm2.c1.class)).X1 ? com.tencent.mm.R.string.npa : com.tencent.mm.R.string.dcc));
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.hwi);
        if (findViewById4 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/live/moreaction/AnchorEditTitleOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setOnClickListener(new pk2.x0(o9Var, bottomSheet, this));
        }
        if (n()) {
            java.lang.Integer num2 = 1;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("element", 6);
            if (num2 != null) {
                num2.intValue();
                jSONObject2.put("type", num2.intValue());
            }
            jSONObject2.put("sub_element", 2);
            jSONObject2.put("sub_type", 1);
            i95.m c19 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            zy2.zb.y6((zy2.zb) c19, ml2.z4.D1, jSONObject2.toString(), null, 4, null);
        }
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.f484159d71);
    }
}
