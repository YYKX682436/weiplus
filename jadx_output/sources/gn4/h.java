package gn4;

/* loaded from: classes15.dex */
public class h implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gn4.i f273625a;

    public h(gn4.i iVar) {
        this.f273625a = iVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            gn4.i iVar = this.f273625a;
            gn4.z zVar = iVar.f273629d;
            int i17 = gn4.z.V;
            pm4.y.i(zVar.A.r0(), iVar.f273629d.E, 2);
            l81.b1 b1Var = new l81.b1();
            r45.on6 on6Var = iVar.f273629d.E.Y.f383243n;
            b1Var.f317014b = on6Var.f382387i;
            b1Var.f317022f = on6Var.f382384f;
            b1Var.f317032k = dc1.e.CTRL_INDEX;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(iVar.f273629d.getContext(), b1Var);
            android.view.View view = iVar.f273629d.P;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$11$1", "onDialogClick", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$11$1", "onDialogClick", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
