package pk2;

/* loaded from: classes3.dex */
public final class x1 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356348h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356349i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f356350j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356348h = helper.F;
        this.f356349i = n() ? "anchorlive.more.morefunction" : "startlive.more.morefunction";
        this.f356350j = kz5.n0.V0(kz5.n0.t0(kz5.c0.i(new pk2.r1(helper, i17), new pk2.b4(helper, i17), new pk2.n4(helper, i17), new pk2.n1(helper, i17), new pk2.u0(helper, i17), new pk2.i1(helper, i17), new pk2.y0(helper, i17), new pk2.w0(helper, i17), new pk2.j(helper, i17), new pk2.k0(helper, i17), new pk2.n0(helper, i17), new pk2.t3(helper, i17), new pk2.t4(helper, i17), new pk2.b3(helper, i17), new pk2.f(helper, i17)), kz5.c0.i(new pk2.d0(helper, i17), new pk2.h4(helper, i17), new pk2.v(helper, i17), new pk2.b1(helper, i17), new pk2.o(helper, i17))));
        if (zl2.r4.f473950a.p()) {
            qk2.h.z(this, 24010, 0, "live_more_more_function", false, 10, null);
        }
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        pk2.d9 d9Var;
        pk2.g8 g8Var;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
        int i17 = (int) (mMActivity.getResources().getDisplayMetrics().heightPixels * 0.75d);
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(mMActivity);
        android.view.View inflate = android.view.LayoutInflater.from(mMActivity).inflate(com.tencent.mm.R.layout.am9, (android.view.ViewGroup) null);
        ((android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.shd)).setVisibility(8);
        boolean z17 = false;
        ((android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.swm)).setVisibility(0);
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "showAnchorMoreCommentSettingPanel peekHeight:" + i17);
        if (o9Var.h()) {
            e3Var.g(inflate, new android.widget.FrameLayout.LayoutParams(mMActivity.getResources().getDisplayMetrics().heightPixels, -2));
        } else {
            if (i17 <= 0) {
                i17 = -1;
            }
            e3Var.g(inflate, new android.widget.FrameLayout.LayoutParams(-1, i17));
        }
        android.view.View view = e3Var.f131959f;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.odf);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.jrn);
        findViewById.setOnClickListener(new pk2.v1(e3Var));
        findViewById.setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.dkw));
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.mcm);
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (r4Var.Y1(context)) {
            findViewById2.setPadding(findViewById2.getPaddingLeft(), findViewById2.getPaddingTop(), findViewById2.getPaddingRight(), 40);
        }
        e3Var.c(true);
        e3Var.b();
        if (n() && (d9Var = o9Var.f356082f) != null && (g8Var = d9Var.f355658a) != null) {
            ((pk2.k9) g8Var).c();
        }
        int i18 = 2;
        if (n()) {
            pk2.f8.a(pk2.f8.f355747a, 6, 2, null, 4, null);
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 6);
            jSONObject.put("type", 2);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f356350j).iterator();
        while (it.hasNext()) {
            qk2.f fVar = (qk2.f) it.next();
            qk2.d dVar = fVar instanceof qk2.d ? (qk2.d) fVar : null;
            if (dVar != null) {
                qk2.d.s(dVar, e3Var, null, i18, null);
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.qlz);
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                boolean z18 = false;
                for (int i19 = 0; i19 < childCount; i19++) {
                    android.view.View childAt = viewGroup.getChildAt(i19);
                    kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
                    z18 = z18 || childAt.getVisibility() == 0;
                }
                viewGroup.setVisibility(z18 ? 0 : 8);
                android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.ugk);
                if (findViewById3 != null) {
                    int visibility = viewGroup.getVisibility();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(visibility));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorMoreFunctionOption", "onItemClicked", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/moreaction/AnchorMoreFunctionOption", "onItemClicked", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            i18 = 2;
        }
        e3Var.f131968r = new pk2.w1(this);
        e3Var.i();
        pk2.o9 o9Var2 = this.f364427a;
        df2.od odVar = (df2.od) o9Var2.e(df2.od.class);
        if (odVar != null && odVar.c7(r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_SET_LIVE_COVER)) {
            z17 = true;
        }
        if (z17) {
            df2.dd ddVar = df2.od.f230952w;
            gk2.e eVar = o9Var2.f356074b;
            df2.od odVar2 = (df2.od) o9Var2.e(df2.od.class);
            ddVar.a(eVar, 2, 7, odVar2 != null ? odVar2.f230958r : null, 37);
        }
    }

    @Override // qk2.f
    public java.util.List g() {
        return this.f356350j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356349i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ee  */
    @Override // qk2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(pk2.o9 r18, db5.g4 r19) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.x1.v(pk2.o9, db5.g4):void");
    }

    @Override // qk2.h
    public int y() {
        return this.f356348h;
    }
}
