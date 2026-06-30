package wu;

/* loaded from: classes.dex */
public final class i1 implements android.view.View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailTextItemConvert$onBindContainerView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent != null && motionEvent.getAction() == 0) {
            int[] iArr = {(int) motionEvent.getRawX(), (int) motionEvent.getRawY()};
            if (view != null) {
                view.setTag(com.tencent.mm.R.id.ohu, iArr);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailTextItemConvert$onBindContainerView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
