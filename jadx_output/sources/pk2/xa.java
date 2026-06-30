package pk2;

/* loaded from: classes3.dex */
public final class xa extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356378i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356378i = "audience.more.morefunction.p2pswitch";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356378i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 bottomSheet, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f131959f;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.uo8);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) view.findViewById(com.tencent.mm.R.id.uo6);
        pk2.o9 o9Var2 = this.f364427a;
        r45.q82 q82Var = (r45.q82) ((mm2.e1) o9Var2.c(mm2.e1.class)).f328988r.getCustom(9);
        boolean z17 = q82Var != null && q82Var.getInteger(2) == 1;
        r45.q82 q82Var2 = (r45.q82) ((mm2.e1) o9Var2.c(mm2.e1.class)).f328988r.getCustom(9);
        boolean z18 = q82Var2 != null && q82Var2.getInteger(1) == 1;
        com.tencent.mars.xlog.Log.i("VisitorP2PSwitchOption", "isP2PEnabled: " + z18 + ", isAudienceP2PSwitchOpen: " + z17);
        int i17 = z18 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/VisitorP2PSwitchOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/VisitorP2PSwitchOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mMSwitchBtn.setCheck(z17);
        mMSwitchBtn.setSwitchListener(new pk2.wa(this, o9Var));
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.uo_);
    }
}
