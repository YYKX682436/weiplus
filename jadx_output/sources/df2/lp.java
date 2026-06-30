package df2;

/* loaded from: classes3.dex */
public final class lp implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.sp f230690d;

    public lp(df2.sp spVar) {
        this.f230690d = spVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        int d76;
        android.view.ViewGroup J1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LivePkgGiftBubbleGuideViewController$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        df2.sp spVar = this.f230690d;
        com.tencent.mars.xlog.Log.i(spVar.f231353m, "click to dismiss");
        if (motionEvent.getAction() == 1) {
            com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) spVar.R6(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
            if ((ag0Var == null || (J1 = ag0Var.J1()) == null || !pm0.v.r(J1).contains((int) motionEvent.getX(), (int) motionEvent.getY())) ? false : true) {
                com.tencent.mars.xlog.Log.i(spVar.f231353m, "click gift entrance");
                android.view.View view2 = spVar.f231354n;
                java.lang.String str2 = null;
                java.lang.Object tag = view2 != null ? view2.getTag() : null;
                r45.o35 o35Var = tag instanceof r45.o35 ? (r45.o35) tag : null;
                if (o35Var != null) {
                    if (o35Var.getInteger(4) == 2 && (d76 = spVar.d7(o35Var)) > 0) {
                        android.view.View view3 = spVar.f231354n;
                        kotlin.jvm.internal.o.d(view3);
                        str2 = view3.getContext().getString(com.tencent.mm.R.string.lec, java.lang.Integer.valueOf(d76));
                    }
                    r45.zb4 zb4Var = new r45.zb4();
                    r45.kv1 kv1Var = (r45.kv1) o35Var.getCustom(1);
                    if (kv1Var == null || (str = kv1Var.getString(0)) == null) {
                        str = "";
                    }
                    zb4Var.set(0, str);
                    zb4Var.set(1, java.lang.Boolean.TRUE);
                    android.view.View view4 = spVar.f231354n;
                    kotlin.jvm.internal.o.d(view4);
                    zb4Var.set(2, view4.getContext().getString(com.tencent.mm.R.string.f491563dj5));
                    zb4Var.set(3, str2);
                    mm2.s2 s2Var = (mm2.s2) spVar.business(mm2.s2.class);
                    if (s2Var != null && (liveMutableData = s2Var.f329411p) != null) {
                        liveMutableData.postValue(zb4Var);
                    }
                }
            }
            df2.sp.a7(spVar);
        }
        boolean z17 = motionEvent.getAction() != 2;
        yj0.a.i(z17, this, "com/tencent/mm/plugin/finder/live/controller/LivePkgGiftBubbleGuideViewController$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
