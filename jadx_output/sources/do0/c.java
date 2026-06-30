package do0;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.debug.LiveDebugView f242067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f242068e;

    public c(com.tencent.mm.live.core.debug.LiveDebugView liveDebugView, android.content.Context context) {
        this.f242067d = liveDebugView;
        this.f242068e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/debug/LiveDebugView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.live.core.debug.LiveDebugView liveDebugView = this.f242067d;
        int visibility = liveDebugView.f68571d.getVisibility();
        android.content.Context context = this.f242068e;
        if (visibility == 0) {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.Button");
            ((android.widget.Button) view).setText(i65.a.r(context, com.tencent.mm.R.string.gcg));
            liveDebugView.f68571d.setVisibility(4);
            liveDebugView.f68572e.setVisibility(4);
        } else {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.Button");
            ((android.widget.Button) view).setText(i65.a.r(context, com.tencent.mm.R.string.gcf));
            liveDebugView.f68571d.setVisibility(0);
            liveDebugView.f68572e.setVisibility(0);
        }
        yj0.a.h(this, "com/tencent/mm/live/core/debug/LiveDebugView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
