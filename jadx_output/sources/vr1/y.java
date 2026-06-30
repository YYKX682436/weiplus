package vr1;

/* loaded from: classes3.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI f439606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr1.o f439607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vr1.b0 f439608f;

    public y(com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI bizPCRecentReadUI, vr1.o oVar, vr1.b0 b0Var) {
        this.f439606d = bizPCRecentReadUI;
        this.f439607e = oVar;
        this.f439608f = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initHasClosedTv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vr1.o oVar = this.f439607e;
        this.f439606d.T6(oVar.f439583e.f456194e, false, new vr1.x(oVar, this.f439608f));
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadStateUIC$initHasClosedTv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
