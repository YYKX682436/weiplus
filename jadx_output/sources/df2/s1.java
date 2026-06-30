package df2;

/* loaded from: classes10.dex */
public final class s1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.w1 f231282d;

    public s1(df2.w1 w1Var) {
        this.f231282d = w1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.widget.q30 q30Var;
        r45.tm1 tm1Var = (r45.tm1) obj;
        jz5.f0 f0Var = null;
        if (tm1Var != null) {
            int integer = tm1Var.getInteger(0);
            df2.w1 w1Var = this.f231282d;
            if (w1Var.f231650n.contains(java.lang.Integer.valueOf(integer))) {
                com.tencent.mars.xlog.Log.w("FinderLiveApplyMicGuideController", "observe: has shown this guide, msgType=" + integer);
                return;
            }
            w1Var.f231650n.add(java.lang.Integer.valueOf(integer));
            com.tencent.mars.xlog.Log.i("FinderLiveApplyMicGuideController", "showBubble info: " + tm1Var.toJSON());
            android.content.Context O6 = w1Var.O6();
            android.app.Activity activity = O6 instanceof android.app.Activity ? (android.app.Activity) O6 : null;
            if (activity != null) {
                com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) w1Var.R6(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
                android.view.ViewGroup viewGroup = (ag0Var == null || (q30Var = ag0Var.f111884z) == null) ? null : q30Var.f119467d;
                com.tencent.mm.plugin.finder.live.view.ub ubVar = w1Var.f291099e;
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
                if (k0Var != null && viewGroup != null) {
                    com.tencent.mm.plugin.finder.live.widget.rc rcVar = new com.tencent.mm.plugin.finder.live.widget.rc(activity);
                    rcVar.f119629k = tm1Var.getInteger(1);
                    java.lang.String string = tm1Var.getString(3);
                    if (string == null) {
                        string = "";
                    }
                    rcVar.f119626h = string;
                    rcVar.f119630l = true;
                    rcVar.f119627i = "ApplyMicGuideBubble";
                    rcVar.f119621c = df2.t1.f231395d;
                    rcVar.f119628j = com.tencent.mm.plugin.finder.live.widget.sc.f119750e;
                    rcVar.f119622d = df2.u1.f231493d;
                    com.tencent.mm.plugin.finder.live.widget.yc ycVar = new com.tencent.mm.plugin.finder.live.widget.yc(rcVar);
                    w1Var.f231651o = ycVar;
                    df2.v1 v1Var = df2.v1.f231577d;
                    com.tencent.mm.plugin.finder.live.widget.rc rcVar2 = ycVar.f120432a;
                    rcVar2.getClass();
                    rcVar2.f119620b = v1Var;
                    ycVar.b(viewGroup, k0Var.getViewScope());
                }
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveApplyMicGuideController", "observe: post null");
        }
    }
}
