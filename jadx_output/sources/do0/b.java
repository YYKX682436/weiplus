package do0;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.debug.LiveDebugView f242065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f242066e;

    public b(com.tencent.mm.live.core.debug.LiveDebugView liveDebugView, android.content.Context context) {
        this.f242065d = liveDebugView;
        this.f242066e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/debug/LiveDebugView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.live.core.debug.LiveDebugView liveDebugView = this.f242065d;
        int currentTextColor = liveDebugView.f68571d.getCurrentTextColor();
        android.content.Context context = this.f242066e;
        if (currentTextColor == i65.a.d(context, com.tencent.mm.R.color.f478712f3)) {
            liveDebugView.f68571d.setTextColor(i65.a.d(context, com.tencent.mm.R.color.aaw));
            liveDebugView.f68572e.setTextColor(i65.a.d(context, com.tencent.mm.R.color.aaw));
        } else {
            liveDebugView.f68571d.setTextColor(i65.a.d(context, com.tencent.mm.R.color.f478712f3));
            liveDebugView.f68572e.setTextColor(i65.a.d(context, com.tencent.mm.R.color.f478712f3));
        }
        yj0.a.h(this, "com/tencent/mm/live/core/debug/LiveDebugView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
