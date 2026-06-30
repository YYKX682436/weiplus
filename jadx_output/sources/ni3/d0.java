package ni3;

/* loaded from: classes2.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.monitor.FinderStreamMonitorView f337556d;

    public d0(com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView) {
        this.f337556d = finderStreamMonitorView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/monitor/FinderStreamMonitorView$notifyChange$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lu2.j jVar = lu2.j.f321376a;
        android.content.Context context = this.f337556d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.util.Calendar calendar = xb2.a.f452891a;
        lu2.j.c(jVar, context, xb2.a.f452892b, null, null, null, null, 60, null);
        yj0.a.h(this, "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$notifyChange$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
