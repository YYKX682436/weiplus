package qt2;

/* loaded from: classes2.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.m f366598d;

    public k(qt2.m mVar) {
        this.f366598d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        int bl6;
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qt2.m mVar = this.f366598d;
        mVar.getClass();
        long j17 = c01.z1.j();
        if ((34359738368L & j17) != 0) {
            long j18 = j17 & (-34359738369L);
            gm0.j1.u().c().w(147457, java.lang.Long.valueOf(j18));
            com.tencent.mars.xlog.Log.i(mVar.f366587d, "openFinderEntrance extstatus:" + j18);
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = 57;
            p53Var.f382762e = 1;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127594a3).getValue()).r()).intValue();
        if (intValue == 0) {
            i17 = 3;
            bl6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bl(3);
            str = "KEY_FINDER_JUMP_FOLLOW_TAB";
        } else if (intValue != 2) {
            bl6 = 18;
            str = "KEY_FINDER_JUMP_FRIEND_TAB";
            i17 = 1;
        } else {
            bl6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bl(4);
            str = "KEY_FINDER_JUMP_HOT_TAB";
            i17 = 4;
        }
        java.lang.String string = mVar.getString(com.tencent.mm.R.string.cmp);
        pf5.u uVar = pf5.u.f353936a;
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.c(mVar.getActivity()).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        com.tencent.mm.plugin.finder.report.y3 y3Var = com.tencent.mm.plugin.finder.report.y3.f125472a;
        long c17 = c01.id.c();
        kotlin.jvm.internal.o.d(string);
        com.tencent.mm.plugin.finder.report.y3.a(y3Var, V6, 2, c17, 0, 2, string, 0, null, 128, null);
        mVar.getActivity().finish();
        ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(i17).a(ey2.q0.f257472e);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(str, true);
        intent.putExtra("KEY_FROM_SHARE_REL", true);
        intent.putExtra("KEY_TARGET_TAB_TYPE", 4);
        intent.putExtra("KEY_GUIDE_BAR_OBJ_ID", (java.io.Serializable) null);
        java.lang.String string2 = V6.getString(1);
        int parseInt = (string2 == null || (str2 = (java.lang.String) r26.n0.e0(string2, new char[]{'-'}, false, 0, 6, null).get(0)) == null) ? -1 : java.lang.Integer.parseInt(str2);
        if (parseInt > 0 && bl6 > 0) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(parseInt, 9, bl6, intent);
        }
        com.tencent.mm.plugin.finder.report.v1.f125393a.d();
        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        c61.ub.L7((c61.ub) c18, mVar.getActivity(), intent, 1, false, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
