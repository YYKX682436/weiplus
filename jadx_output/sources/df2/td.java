package df2;

/* loaded from: classes3.dex */
public final class td implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ud f231434d;

    public td(df2.ud udVar) {
        this.f231434d = udVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((r45.rk6) lVar.f302833d).getInteger(1));
        df2.ud udVar = this.f231434d;
        udVar.f231518u = valueOf;
        udVar.f231519v = (java.lang.String) lVar.f302834e;
        com.tencent.mars.xlog.Log.i(udVar.f231510m, "curTargetType:" + udVar.f231518u + ", curTaskId:" + udVar.f231519v);
        android.view.View view = udVar.f231512o;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController$onViewMount$1$1", "onChanged", "(Lkotlin/Pair;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController$onViewMount$1$1", "onChanged", "(Lkotlin/Pair;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = udVar.f231516s;
        if (textView != null) {
            r45.d62 a17 = r45.d62.a(((r45.rk6) lVar.f302833d).getInteger(1));
            kotlin.jvm.internal.o.f(a17, "forNumber(...)");
            int ordinal = a17.ordinal();
            java.lang.String string = ordinal != 4 ? ordinal != 15 ? ordinal != 22 ? ordinal != 26 ? ordinal != 40 ? ordinal != 43 ? ordinal != 44 ? ordinal != 59 ? ordinal != 60 ? "" : udVar.O6().getString(com.tencent.mm.R.string.mpq) : udVar.O6().getString(com.tencent.mm.R.string.mpi) : udVar.O6().getString(com.tencent.mm.R.string.mpt) : udVar.O6().getString(com.tencent.mm.R.string.mpp) : udVar.O6().getString(com.tencent.mm.R.string.mpb) : udVar.O6().getString(com.tencent.mm.R.string.f491860mq4) : udVar.O6().getString(com.tencent.mm.R.string.mph) : udVar.O6().getString(com.tencent.mm.R.string.mq7) : udVar.O6().getString(com.tencent.mm.R.string.mps);
            kotlin.jvm.internal.o.d(string);
            textView.setText(string);
        }
        android.view.View view2 = udVar.f231512o;
        if (view2 != null) {
            view2.post(new df2.sd(udVar, lVar));
        }
    }
}
