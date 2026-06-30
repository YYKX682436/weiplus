package k13;

/* loaded from: classes3.dex */
public final class t implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI f303265d;

    public t(com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI forceNotifyListUI) {
        this.f303265d = forceNotifyListUI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(event, "event");
        if (event.getAction() == 0) {
            com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI forceNotifyListUI = this.f303265d;
            forceNotifyListUI.f137341m[0] = (int) event.getRawX();
            forceNotifyListUI.f137341m[1] = (int) event.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
