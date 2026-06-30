package pk2;

/* loaded from: classes3.dex */
public final class k0 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355897i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355897i = "";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355897i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        ya2.b2 b17;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean n17 = n();
        pk2.o9 o9Var = this.f364427a;
        if (n17) {
            return ((mm2.c1) o9Var.c(mm2.c1.class)).N;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        pk2.j9 j9Var = o9Var.f356084g;
        return pm0.v.z((int) ((j9Var == null || (b17 = j9Var.b()) == null) ? 0L : b17.field_liveSwitchFlag), 65536);
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 bottomSheet, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f131959f;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f485503ra4);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorDataPanelOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorDataPanelOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.view.LoadingSwitchBtn g17 = o9Var.g(view, com.tencent.mm.R.id.rba, zl2.r4.f473950a.I1(o9Var.f356074b));
        if (n()) {
            java.lang.Integer num2 = 1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 6);
            if (num2 != null) {
                num2.intValue();
                jSONObject.put("type", num2.intValue());
            }
            jSONObject.put("sub_element", 8);
            jSONObject.put("sub_type", 1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        } else {
            java.lang.Integer num3 = 1;
            int i17 = g17.f211363x ? 10 : 11;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("element", 6);
            if (num3 != null) {
                num3.intValue();
                jSONObject2.put("type", num3.intValue());
            }
            jSONObject2.put("sub_element", 7);
            jSONObject2.put("sub_type", i17);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 37L, jSONObject2.toString(), null, 4, null);
        }
        kotlinx.coroutines.y0 j17 = j();
        if (j17 != null) {
            g17.g(j17, new pk2.h0(o9Var), new pk2.j0(this, view, g17, o9Var, null));
        }
        java.lang.String obj = ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.rbp)).getText().toString();
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f485503ra4);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        v(obj, findViewById2, g17);
    }
}
