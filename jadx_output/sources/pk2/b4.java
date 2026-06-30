package pk2;

/* loaded from: classes3.dex */
public final class b4 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355577i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355577i = n() ? "anchorlive.more.morefunction.gift" : "startlive.more.morefunction.gift";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355577i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        ya2.b2 b17;
        boolean n17 = n();
        pk2.o9 o9Var = this.f364427a;
        if (!n17) {
            com.tencent.mm.plugin.finder.live.util.n2 n2Var = com.tencent.mm.plugin.finder.live.util.n2.f115640a;
            pk2.j9 j9Var = o9Var.f356084g;
            return n2Var.c((j9Var == null || (b17 = j9Var.b()) == null) ? 0L : b17.field_liveSwitchFlag);
        }
        if (zl2.r4.f473950a.P1(o9Var.f356074b) || !((mm2.c1) o9Var.c(mm2.c1.class)).f328862p3 || !((mm2.c1) o9Var.c(mm2.c1.class)).f328874r3) {
            return false;
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("xlab");
        return true;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 bottomSheet, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        java.lang.Integer num2 = 1;
        if (n()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 6);
            if (num2 != null) {
                num2.intValue();
                jSONObject.put("type", num2.intValue());
            }
            jSONObject.put("sub_element", 3);
            jSONObject.put("sub_type", 1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("element", 6);
            if (num2 != null) {
                num2.intValue();
                jSONObject2.put("type", num2.intValue());
            }
            jSONObject2.put("sub_element", 3);
            jSONObject2.put("sub_type", 1);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 37L, jSONObject2.toString(), null, 4, null);
        }
        android.view.View view = bottomSheet.f131959f;
        boolean m76 = n() ? ((mm2.c1) o9Var.c(mm2.c1.class)).m7() : zl2.r4.f473950a.U1(o9Var.f356074b);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.hxv);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRewardOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRewardOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.view.LoadingSwitchBtn g17 = o9Var.g(view, com.tencent.mm.R.id.ntm, m76);
        kotlinx.coroutines.y0 j17 = j();
        if (j17 != null) {
            g17.g(j17, new pk2.u3(this, o9Var), new pk2.a4(this, view, g17, o9Var, null));
        }
        i95.m c19 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        zy2.zb.I8((zy2.zb) c19, m76 ? ml2.u1.f328031J : ml2.u1.I, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(n() ? ml2.s1.f327916f : ml2.s1.f327915e), null, null, null, null, false, 124, null);
        java.lang.String obj = ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.m2q)).getText().toString();
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.hxv);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        v(obj, findViewById2, g17);
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.m2p);
    }
}
