package wl5;

/* loaded from: classes4.dex */
public class c implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl5.x f447106d;

    public c(wl5.x xVar) {
        this.f447106d = xVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/textview/SelectableTextHelper$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.ui.yk.a("SelectableTextHelper", "interceptor onTouch. event.getAction():%s", java.lang.Integer.valueOf(motionEvent.getAction()));
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        wl5.x xVar = this.f447106d;
        if (action == 0 && (x17 < 0 || x17 >= xVar.f447155a.getWidth() || y17 < 0 || y17 >= xVar.f447155a.getHeight())) {
            com.tencent.mm.ui.yk.a("SelectableTextHelper", "interceptor onTouch, down, outside.", new java.lang.Object[0]);
            xVar.f447165j.postDelayed(xVar.V, 100L);
            yj0.a.i(true, this, "com/tencent/mm/ui/widget/textview/SelectableTextHelper$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (motionEvent.getAction() != 4) {
            yj0.a.i(false, this, "com/tencent/mm/ui/widget/textview/SelectableTextHelper$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        com.tencent.mm.ui.yk.a("SelectableTextHelper", "interceptor onTouch, outside.", new java.lang.Object[0]);
        xVar.f447165j.postDelayed(xVar.V, 100L);
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/textview/SelectableTextHelper$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
