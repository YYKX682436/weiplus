package pk2;

/* loaded from: classes3.dex */
public final class j extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355850i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355850i = n() ? "anchorlive.more.morefunction.hidenick" : "startlive.more.morefunction.hidenick";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355850i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        ya2.b2 b17;
        pk2.o9 o9Var = this.f364427a;
        if (((mm2.e1) o9Var.c(mm2.e1.class)).g7()) {
            return false;
        }
        if (n()) {
            return ((mm2.c1) o9Var.c(mm2.c1.class)).f328916y;
        }
        pk2.j9 j9Var = o9Var.f356084g;
        return pm0.v.z((int) ((j9Var == null || (b17 = j9Var.b()) == null) ? 0L : b17.field_liveSwitchFlag), 4096);
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 bottomSheet, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f131959f;
        boolean z17 = !pm0.v.z((int) ((mm2.c1) o9Var.c(mm2.c1.class)).f328866q, 8192);
        boolean o17 = o();
        int i17 = com.tencent.mm.R.id.hvi;
        if (!o17) {
            if (!n()) {
                i17 = com.tencent.mm.R.id.qlg;
            }
            android.view.View findViewById = view.findViewById(i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorAnonymousOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorAnonymousOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById2 = view.findViewById(n() ? com.tencent.mm.R.id.hvi : com.tencent.mm.R.id.qlg);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorAnonymousOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorAnonymousOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.view.LoadingSwitchBtn g17 = o9Var.g(view, n() ? com.tencent.mm.R.id.ntd : com.tencent.mm.R.id.qqd, z17);
        kotlinx.coroutines.y0 j17 = j();
        if (j17 != null) {
            g17.g(j17, new pk2.g(this, o9Var), new pk2.h(this, view, g17, o9Var, null));
        }
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.Z, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.I8((zy2.zb) c18, ml2.u1.Y, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        }
        if (n()) {
            java.lang.Integer num2 = 1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 6);
            if (num2 != null) {
                num2.intValue();
                jSONObject.put("type", num2.intValue());
            }
            jSONObject.put("sub_element", 5);
            jSONObject.put("sub_type", 1);
            i95.m c19 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            zy2.zb.y6((zy2.zb) c19, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        } else {
            java.lang.Integer num3 = 1;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("element", 6);
            if (num3 != null) {
                num3.intValue();
                jSONObject2.put("type", num3.intValue());
            }
            jSONObject2.put("sub_element", 5);
            jSONObject2.put("sub_type", 1);
            i95.m c27 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c27, "getService(...)");
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5((zy2.zb) c27, 37L, jSONObject2.toString(), null, 4, null);
        }
        java.lang.String obj = ((android.widget.TextView) view.findViewById(n() ? com.tencent.mm.R.id.okv : com.tencent.mm.R.id.qqx)).getText().toString();
        if (!n()) {
            i17 = com.tencent.mm.R.id.qlg;
        }
        android.view.View findViewById3 = view.findViewById(i17);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        v(obj, findViewById3, g17);
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(n() ? com.tencent.mm.R.id.f483069vq : com.tencent.mm.R.id.gdk);
    }
}
