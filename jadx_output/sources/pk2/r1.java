package pk2;

/* loaded from: classes3.dex */
public final class r1 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356208i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f356209j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356208i = n() ? "anchorlive.more.morefunction.connectmic" : "startlive.more.morefunction.connectmic";
        this.f356209j = true;
    }

    @Override // qk2.f
    public boolean h() {
        return this.f356209j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356208i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
    
        if (((mm2.c1) r0.c(mm2.c1.class)).f328778a5 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x011f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011d, code lost:
    
        if (pm0.v.z((int) ((r5 == null || (r2 = r5.b()) == null) ? 0 : r2.field_liveSwitchFlag), 4) != false) goto L36;
     */
    @Override // qk2.d, qk2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o() {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.r1.o():boolean");
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 bottomSheet, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f131959f;
        boolean O7 = ((mm2.c1) this.f364427a.c(mm2.c1.class)).O7();
        boolean z17 = !O7 && pm0.v.z((int) ((mm2.c1) o9Var.c(mm2.c1.class)).f328866q, 64);
        zl2.r4 r4Var = zl2.r4.f473950a;
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "canShowLinkMic:$, linkMicEnable:" + z17 + ", isSecondDevice:" + (r4Var.w1() && !r4Var.x1()));
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.hx7);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorLinkMicOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorLinkMicOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.view.LoadingSwitchBtn g17 = o9Var.g(view, com.tencent.mm.R.id.ntj, z17);
        if (((mm2.e1) o9Var.c(mm2.e1.class)).g7()) {
            g17.setCheck(true);
            g17.setEnabled(false);
            if (!pm0.v.z((int) ((mm2.c1) o9Var.c(mm2.c1.class)).f328866q, 64)) {
                ((mm2.c1) o9Var.c(mm2.c1.class)).p8(64 | ((int) ((mm2.c1) o9Var.c(mm2.c1.class)).f328866q));
            }
            ((mm2.c1) o9Var.c(mm2.c1.class)).p8(((int) ((mm2.c1) o9Var.c(mm2.c1.class)).f328866q) & (-16385));
        } else {
            kotlinx.coroutines.y0 j17 = j();
            if (j17 != null) {
                g17.g(j17, new pk2.o1(O7, o9Var), new pk2.q1(this, view, g17, O7, o9Var, null));
            }
        }
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.H, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.I8((zy2.zb) c18, ml2.u1.G, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        }
        java.lang.String obj = ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485553i31)).getText().toString();
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.hx7);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        v(obj, findViewById2, g17);
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.f485552i30);
    }
}
