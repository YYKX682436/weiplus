package nj2;

/* loaded from: classes10.dex */
public final class j extends nj2.n {

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f337837u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.View parentView, nj2.h panel, android.view.View root, gk2.e liveData, zh2.e micUserInterface) {
        super(root, liveData, micUserInterface);
        kotlin.jvm.internal.o.g(parentView, "parentView");
        kotlin.jvm.internal.o.g(panel, "panel");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(micUserInterface, "micUserInterface");
        this.f337837u = parentView;
        this.f337854t = new yh2.i(new com.tencent.mm.plugin.finder.live.mic.pk.factory.FinderLiveAnchorPayLinkConvertFactory(liveData, new nj2.i(this)), this.f337852r);
        this.f337846i.N(new ii2.c(new ii2.a(parentView.getContext().getResources().getColor(com.tencent.mm.R.color.f479314vu), new android.graphics.Rect(0, 0, 0, 1), ii2.b.f291621d, null, 8, null)));
        this.f337846i.setAdapter(h().f());
    }

    @Override // nj2.n
    public ej2.j c() {
        return new ej2.n(this.f337837u, this.f337842e, this.f337843f);
    }

    @Override // nj2.n
    public void d() {
        android.view.View view = this.f337841d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveApplyPayMicPanelWidget", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveApplyPayMicPanelWidget", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f337846i.setVisibility(0);
        android.view.View view2 = this.f337849o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveApplyPayMicPanelWidget", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveApplyPayMicPanelWidget", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f337851q.setText(this.f337841d.getContext().getResources().getString(com.tencent.mm.R.string.dvt, java.lang.Integer.valueOf(this.f337852r.size())));
    }

    @Override // nj2.n
    public void e() {
        this.f337846i.setVisibility(8);
        android.view.View view = this.f337849o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveApplyPayMicPanelWidget", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveApplyPayMicPanelWidget", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f337841d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveApplyPayMicPanelWidget", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveApplyPayMicPanelWidget", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // nj2.n
    public void f() {
        java.util.ArrayList<km2.q> arrayList;
        int i17;
        java.lang.String str;
        this.f337852r.clear();
        java.util.ArrayList arrayList2 = this.f337852r;
        java.util.List list = ((mm2.o4) this.f337842e.a(mm2.o4.class)).f329318o;
        kotlin.jvm.internal.o.f(list, "<get-linkMicUserList>(...)");
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            i17 = 0;
            for (java.lang.Object obj : list) {
                km2.q qVar = (km2.q) obj;
                java.lang.String str2 = qVar.f309170a;
                if (str2 == null) {
                    str2 = "";
                }
                boolean l17 = l(str2);
                boolean z17 = true;
                boolean z18 = qVar.A > 0 && c01.id.c() > qVar.A && !l17;
                if (z18) {
                    i17++;
                }
                if (qVar.f309177h || z18 || l17) {
                    z17 = false;
                }
                if (z17) {
                    arrayList.add(obj);
                }
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (km2.q qVar2 : arrayList) {
            km2.b0 b0Var = qVar2.f309169J;
            if (b0Var == null || (str = b0Var.f309075b) == null) {
                str = "";
            }
            arrayList3.add(new vi2.a(qVar2, str, b0Var != null ? b0Var.f309074a : 0));
        }
        arrayList2.addAll(arrayList3);
        com.tencent.mars.xlog.Log.i(this.f337844g, "fillApplyLinkUserList timeOutSize: " + i17 + " applyRealSize: " + this.f337852r.size());
    }

    @Override // nj2.n
    public java.lang.String j() {
        return "VoiceRoomApplyPanelWidget";
    }
}
