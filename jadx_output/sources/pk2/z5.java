package pk2;

/* loaded from: classes3.dex */
public final class z5 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356425i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f356426j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356425i = "";
        this.f356426j = true;
    }

    @Override // qk2.f
    public boolean h() {
        return this.f356426j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356425i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        return ((mm2.c1) this.f364427a.c(mm2.c1.class)).D;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 bottomSheet, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f131959f;
        boolean m76 = ((mm2.c1) o9Var.c(mm2.c1.class)).m7();
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f485507hx3);
        if (findViewById != null) {
            int i17 = m76 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AssistantHonorOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AssistantHonorOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.view.LoadingSwitchBtn g17 = o9Var.g(view, com.tencent.mm.R.id.ntw, zl2.r4.f473950a.X1(o9Var.f356074b));
        kotlinx.coroutines.y0 j17 = j();
        if (j17 != null) {
            g17.g(j17, new pk2.w5(o9Var), new pk2.y5(o9Var, null));
        }
    }
}
