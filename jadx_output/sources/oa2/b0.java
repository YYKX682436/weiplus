package oa2;

/* loaded from: classes2.dex */
public final class b0 extends com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC {
    public int F;
    public long G;
    public long H;
    public final jz5.g I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.F = -1;
        this.I = jz5.h.b(new oa2.a0(this));
    }

    @Override // x92.m
    public void C7(int i17, java.lang.String str) {
        super.C7(i17, str);
        vb2.k0 k0Var = (vb2.k0) ((jz5.n) this.I).getValue();
        k0Var.f434641b.setVisibility(0);
        k0Var.f434643d.setVisibility(0);
        k0Var.f434642c.setVisibility(8);
        k0Var.f434641b.setOnClickListener(new oa2.z(this, k0Var));
    }

    @Override // x92.m
    public void E7(com.tencent.mm.protobuf.f fVar) {
        super.E7((r45.r03) fVar);
        vb2.k0 k0Var = (vb2.k0) ((jz5.n) this.I).getValue();
        k0Var.f434641b.setVisibility(8);
        k0Var.f434644e.setVisibility(0);
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC
    public boolean L7() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC
    public y92.b M7() {
        y92.b M7 = super.M7();
        java.lang.String stringExtra = getActivity().getIntent().getStringExtra("key_finder_user_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        M7.f460332t.set(11, stringExtra);
        return M7;
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC
    public boolean Q7(r45.r03 topicInfo) {
        java.util.LinkedList<r45.bo6> list;
        kotlin.jvm.internal.o.g(topicInfo, "topicInfo");
        r45.q03 q03Var = (r45.q03) topicInfo.getCustom(20);
        java.util.LinkedList list2 = q03Var != null ? q03Var.getList(0) : null;
        boolean z17 = list2 == null || list2.isEmpty();
        r45.q03 q03Var2 = (r45.q03) topicInfo.getCustom(20);
        if (q03Var2 != null && (list = q03Var2.getList(0)) != null) {
            for (r45.bo6 bo6Var : list) {
                com.tencent.mm.plugin.finder.activity.template.ui.FinderTemplateTopicFragment finderTemplateTopicFragment = new com.tencent.mm.plugin.finder.activity.template.ui.FinderTemplateTopicFragment(topicInfo);
                finderTemplateTopicFragment.f129265p = bo6Var.getInteger(1) - 1;
                finderTemplateTopicFragment.f129266q = bo6Var.getString(0);
                finderTemplateTopicFragment.f101753u = bo6Var.getLong(2);
                java.lang.String string = bo6Var.getString(0);
                if (string == null) {
                    string = "";
                }
                finderTemplateTopicFragment.f101754v = string;
                java.lang.String string2 = bo6Var.getString(0);
                com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6(this, new w92.a(-1, string2 == null ? "" : string2, false, bo6Var.getInteger(1), 18), finderTemplateTopicFragment, false, 4, null);
            }
        }
        r7();
        return !z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r12 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map R7(int r12) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oa2.b0.R7(int):java.util.Map");
    }

    public final void S7() {
        if (this.F < 0) {
            return;
        }
        if (this.H > 0) {
            this.G += android.os.SystemClock.elapsedRealtime() - this.H;
            this.H = 0L;
        }
        long j17 = this.G;
        if (j17 <= 0) {
            return;
        }
        int i17 = this.F;
        java.util.Map m17 = kz5.c1.m(R7(i17), kz5.c1.k(new jz5.l("page_name", "template_profile_page"), new jz5.l("stay_time", java.lang.Long.valueOf(j17))));
        com.tencent.mars.xlog.Log.i("Finder.FinderTemplateTopicTabUIC", "[reportTabOut] tabIndex=" + i17 + " stayTimeMs=" + j17 + " params=" + m17);
        i95.m c17 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) ((dy1.r) c17)).Aj(50081, "tab_out", m17, 1, false);
    }

    @Override // x92.m, com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void l7(int i17) {
        super.l7(i17);
        if (i17 < 0 || i17 >= f7().size() || i17 == this.F) {
            return;
        }
        S7();
        this.F = i17;
        this.G = 0L;
        this.H = android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC, com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        S7();
        this.F = -1;
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        if (this.H > 0) {
            this.G += android.os.SystemClock.elapsedRealtime() - this.H;
            this.H = 0L;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.F < 0 || this.H != 0) {
            return;
        }
        this.H = android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC, x92.m
    public int w7() {
        return com.tencent.mm.R.layout.b_2;
    }
}
