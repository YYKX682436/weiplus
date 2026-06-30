package yf5;

/* loaded from: classes11.dex */
public final class y implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.n f462015d;

    public y(yf5.n nVar) {
        this.f462015d = nVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.graphics.drawable.Drawable background;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/adapter/ConversationItemBuilder$fillConvItemView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.view.View view2 = this.f462015d.f461930q;
        if (view2 != null && (background = view2.getBackground()) != null) {
            background.setHotspot(motionEvent.getX(), motionEvent.getY());
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/conversation/adapter/ConversationItemBuilder$fillConvItemView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
