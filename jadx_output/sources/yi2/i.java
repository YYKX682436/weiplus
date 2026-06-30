package yi2;

/* loaded from: classes10.dex */
public final class i implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi2.p f462516d;

    public i(yi2.p pVar) {
        this.f462516d = pVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        yi2.p pVar = this.f462516d;
        dk2.u4 u4Var = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) pVar.f462562b).a().a(mm2.o4.class)).Z;
        if ((u4Var != null ? u4Var.f234156c : 0) == 0) {
            if (!zl2.r4.f473950a.x1()) {
                return false;
            }
            pVar.r();
            return false;
        }
        if (pVar.o()) {
            return false;
        }
        dk2.u4 u4Var2 = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) pVar.f462562b).a().a(mm2.o4.class)).Z;
        if ((u4Var2 != null ? u4Var2.f234156c : 0) <= 0) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(pVar.f462563c, "coundDown");
        android.view.View view = pVar.f462570j;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "coundDown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "coundDown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.live.widget.p8 p8Var = (com.tencent.mm.plugin.finder.live.widget.p8) pVar.f462562b;
        dk2.u4 u4Var3 = ((mm2.o4) p8Var.a().a(mm2.o4.class)).Z;
        if (u4Var3 != null) {
            pVar.h();
            int i17 = u4Var3.f234156c - 1;
            u4Var3.f234156c = i17;
            android.widget.TextView textView = pVar.f462579s;
            if (i17 < 10) {
                textView.setText("0" + u4Var3.f234156c);
                textView.setScaleX(1.5f);
                textView.setScaleY(1.5f);
                textView.animate().scaleX(1.0f).scaleY(1.0f).start();
            } else {
                no0.l lVar = no0.m.f338730a;
                dk2.u4 u4Var4 = ((mm2.o4) p8Var.a().a(mm2.o4.class)).Z;
                textView.setText(lVar.b(u4Var4 != null ? u4Var4.f234156c : 0, ":"));
            }
        }
        return true;
    }
}
