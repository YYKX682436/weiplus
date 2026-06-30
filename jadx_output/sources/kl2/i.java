package kl2;

/* loaded from: classes.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.n f308783d;

    public i(kl2.n nVar) {
        this.f308783d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        kotlinx.coroutines.y0 b17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveRestrictConsumeDialogWidget$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kl2.n nVar = this.f308783d;
        nVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - nVar.f308801u;
        com.tencent.mars.xlog.Log.i("RestrictConsumeDialogWidget", "rightBtnClick offestTime: " + currentTimeMillis);
        kl2.l lVar = new kl2.l(nVar);
        long j17 = (long) nVar.f308799s;
        if (currentTimeMillis >= j17) {
            lVar.invoke();
        } else {
            com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(nVar.f118381d, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490604zq), false, 0, null);
            f17.show();
            long j18 = j17 - currentTimeMillis;
            com.tencent.mars.xlog.Log.i("RestrictConsumeDialogWidget", "delay time: " + j18);
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            if (k0Var == null || (b17 = k0Var.getViewScope()) == null) {
                b17 = kotlinx.coroutines.z0.b();
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a, null, new kl2.j(j18, lVar, f17, null), 2, null);
        }
        nVar.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveRestrictConsumeDialogWidget$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
