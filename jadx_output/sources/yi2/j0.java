package yi2;

/* loaded from: classes10.dex */
public final class j0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi2.l0 f462539d;

    public j0(yi2.l0 l0Var) {
        this.f462539d = l0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        yi2.l0 l0Var = this.f462539d;
        dk2.u4 u4Var = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) l0Var.f462544b).a().a(mm2.o4.class)).Z;
        if ((u4Var != null ? u4Var.f234156c : 0) == 0) {
            if (!zl2.r4.f473950a.x1()) {
                return false;
            }
            com.tencent.mars.xlog.Log.i(l0Var.f462546d, "showCounting");
            android.view.View view = l0Var.f462547e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = l0Var.f462548f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l0Var.setVisible(0);
            return false;
        }
        dk2.u4 u4Var2 = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) l0Var.f462544b).a().a(mm2.o4.class)).Z;
        if (!(u4Var2 != null && u4Var2.f234158e == 2)) {
            dk2.u4 u4Var3 = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) l0Var.f462544b).a().a(mm2.o4.class)).Z;
            if (!(u4Var3 != null && u4Var3.f234158e == 8)) {
                return false;
            }
        }
        dk2.u4 u4Var4 = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) l0Var.f462544b).a().a(mm2.o4.class)).Z;
        if ((u4Var4 != null ? u4Var4.f234156c : 0) <= 0) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(l0Var.f462546d, "coundDown");
        l0Var.setVisible(0);
        com.tencent.mm.plugin.finder.live.widget.p8 p8Var = (com.tencent.mm.plugin.finder.live.widget.p8) l0Var.f462544b;
        dk2.u4 u4Var5 = ((mm2.o4) p8Var.a().a(mm2.o4.class)).Z;
        if (u4Var5 != null) {
            l0Var.g();
            u4Var5.f234156c--;
            l0Var.f462551i.setVisibility(0);
            android.view.View view3 = l0Var.f462548f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "coundDown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "coundDown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i17 = u4Var5.f234156c;
            android.widget.TextView textView = l0Var.f462550h;
            if (i17 < 10) {
                textView.setText("0" + u4Var5.f234156c);
                textView.setScaleX(1.5f);
                textView.setScaleY(1.5f);
                textView.animate().scaleX(1.0f).scaleY(1.0f).start();
            } else {
                no0.l lVar = no0.m.f338730a;
                dk2.u4 u4Var6 = ((mm2.o4) p8Var.a().a(mm2.o4.class)).Z;
                textView.setText(lVar.b(u4Var6 != null ? u4Var6.f234156c : 0, ":"));
            }
        }
        return true;
    }
}
