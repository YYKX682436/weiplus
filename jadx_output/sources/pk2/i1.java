package pk2;

/* loaded from: classes3.dex */
public final class i1 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355833i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f355834j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355833i = "";
        this.f355834j = true;
    }

    @Override // qk2.f
    public boolean h() {
        return this.f355834j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355833i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        boolean n17 = n();
        pk2.o9 o9Var = this.f364427a;
        if (n17) {
            return ((mm2.c1) o9Var.c(mm2.c1.class)).D;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        pk2.j9 j9Var = o9Var.f356084g;
        if (j9Var != null) {
            j9Var.b();
        }
        return true;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 bottomSheet, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f131959f;
        boolean n17 = n();
        gk2.e eVar = o9Var.f356074b;
        boolean m76 = n17 ? ((mm2.c1) o9Var.c(mm2.c1.class)).m7() : zl2.r4.f473950a.U1(eVar);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f485507hx3);
        if (findViewById != null) {
            ym5.a1.h(findViewById, new pk2.e1(this));
            int i17 = m76 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorHonorOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorHonorOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.view.LoadingSwitchBtn g17 = o9Var.g(view, com.tencent.mm.R.id.ntw, zl2.r4.f473950a.X1(eVar));
        kotlinx.coroutines.y0 j17 = j();
        if (j17 != null) {
            g17.g(j17, new pk2.f1(o9Var), new pk2.h1(this, view, g17, o9Var, null));
        }
        java.lang.String obj = ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.onh)).getText().toString();
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f485507hx3);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        v(obj, findViewById2, g17);
    }
}
