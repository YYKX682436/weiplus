package wh5;

/* loaded from: classes3.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f446084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f446085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wh5.s f446086f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446087g;

    public q(android.view.View.OnClickListener onClickListener, android.view.View view, wh5.s sVar, java.lang.String str) {
        this.f446084d = onClickListener;
        this.f446085e = view;
        this.f446086f = sVar;
        this.f446087g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/chat/live/ChatLiveBottomBarLayer$reportAndClickable$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View.OnClickListener onClickListener = this.f446084d;
        if (onClickListener != null) {
            onClickListener.onClick(this.f446085e);
        }
        vh5.a aVar = this.f446086f.f446091x;
        if (aVar != null) {
            java.lang.String viewId = this.f446087g;
            kotlin.jvm.internal.o.g(viewId, "viewId");
            h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
            ((g90.s) vVar).Ri(aVar.f437200a, aVar.f437201b, 1, viewId);
        }
        yj0.a.h(this, "com/tencent/mm/ui/media/chat/live/ChatLiveBottomBarLayer$reportAndClickable$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
