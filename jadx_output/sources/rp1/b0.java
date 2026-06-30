package rp1;

/* loaded from: classes14.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatBackgroundView f398358d;

    public b0(com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView) {
        this.f398358d = floatBackgroundView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/view/FloatBackgroundView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f398358d.f93439d).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.ball.ui.n nVar = ((com.tencent.mm.plugin.ball.ui.l) ((mp1.a) it.next())).f93308a;
            com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = nVar.f93320e;
            if (contentFloatBallView != null) {
                contentFloatBallView.h();
            }
            nVar.n();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/FloatBackgroundView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
