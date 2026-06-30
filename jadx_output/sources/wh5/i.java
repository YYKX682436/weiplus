package wh5;

/* loaded from: classes12.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh5.s f446069d;

    public i(wh5.s sVar) {
        this.f446069d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/chat/live/ChatLiveBottomBarLayer$attach$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wh5.s.g0(this.f446069d, dg3.q.f232341e);
        yj0.a.h(this, "com/tencent/mm/ui/media/chat/live/ChatLiveBottomBarLayer$attach$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
