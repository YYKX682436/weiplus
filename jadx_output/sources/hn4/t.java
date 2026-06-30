package hn4;

/* loaded from: classes15.dex */
public class t implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hn4.u f282601a;

    public t(hn4.u uVar) {
        this.f282601a = uVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        r45.pn6 pn6Var;
        if (z17) {
            hn4.u uVar = this.f282601a;
            hn4.z zVar = uVar.f282602d;
            int i17 = hn4.z.T;
            r45.xn6 xn6Var = zVar.E;
            if (xn6Var == null || (pn6Var = xn6Var.Y) == null || pn6Var.f383243n == null) {
                return;
            }
            pm4.y.i(zVar.A.r0(), uVar.f282602d.E, 2);
            l81.b1 b1Var = new l81.b1();
            r45.on6 on6Var = uVar.f282602d.E.Y.f383243n;
            b1Var.f317014b = on6Var.f382387i;
            b1Var.f317022f = on6Var.f382384f;
            b1Var.f317032k = dc1.e.CTRL_INDEX;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(uVar.f282602d.getContext(), b1Var);
            android.view.View view = uVar.f282602d.M;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$7$1", "onDialogClick", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$7$1", "onDialogClick", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
