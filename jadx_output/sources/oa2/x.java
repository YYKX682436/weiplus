package oa2;

/* loaded from: classes2.dex */
public final class x extends com.tencent.mm.plugin.finder.feed.x10 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x(oa2.y r12, com.tencent.mm.ui.MMActivity r13, int r14, int r15, boolean r16, boolean r17, int r18, kotlin.jvm.internal.i r19) {
        /*
            r11 = this;
            r0 = r18 & 8
            r1 = 0
            if (r0 == 0) goto L7
            r6 = r1
            goto L9
        L7:
            r6 = r16
        L9:
            r0 = r18 & 16
            if (r0 == 0) goto Lf
            r7 = r1
            goto L11
        Lf:
            r7 = r17
        L11:
            java.lang.String r0 = "context"
            r1 = r13
            kotlin.jvm.internal.o.g(r13, r0)
            r8 = 0
            r9 = 32
            r10 = 0
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oa2.x.<init>(oa2.y, com.tencent.mm.ui.MMActivity, int, int, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void J(in5.s0 holder, int i17) {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (i17 < 0 || i17 >= z().f107156e.getSize()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f107156e.getDataListJustForAdapter().get(i17);
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            androidx.fragment.app.Fragment fragment = this.K;
            r45.qt2 V6 = (fragment == null || (nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)) == null) ? null : nyVar.V6();
            android.view.View itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(j5Var.getItemId()));
            lVarArr[1] = new jz5.l(ya.b.INDEX, java.lang.Integer.valueOf(i17));
            lVarArr[2] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
            lVarArr[3] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
            lVarArr[4] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            lVarArr[5] = new jz5.l("session_buffer", ((com.tencent.mm.plugin.finder.report.o3) c17).ek(j5Var.getItemId(), null, V6 != null ? V6.getInteger(5) : 0));
            hc2.v0.e(itemView, "finder_dstream_feed", 40, 0, false, false, kz5.c1.k(lVarArr), null, 92, null);
        }
    }
}
