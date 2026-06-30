package pk2;

/* loaded from: classes3.dex */
public final class za extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356433i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356433i = "audience.more.morefunction.minimize";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356433i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 bottomSheet, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        pk2.f8.f355747a.b(4, 0, 1, 1, num);
        android.view.View view = bottomSheet.f131959f;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.cvo);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.cvp);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) view.findViewById(com.tencent.mm.R.id.nth);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/VisitorPlayDesktopOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/VisitorPlayDesktopOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/VisitorPlayDesktopOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/VisitorPlayDesktopOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mMSwitchBtn.setCheck(zl2.r4.f473950a.O0());
        mMSwitchBtn.setSwitchListener(new pk2.ya(num, this));
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.f328079r, null, null, null, null, null, false, 126, null);
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.cvr);
    }
}
