package db5;

/* loaded from: classes5.dex */
public class q8 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMVisiblePasswordEditText f228484d;

    public q8(com.tencent.mm.ui.base.MMVisiblePasswordEditText mMVisiblePasswordEditText) {
        this.f228484d = mMVisiblePasswordEditText;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMVisiblePasswordEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.ui.base.MMVisiblePasswordEditText mMVisiblePasswordEditText = this.f228484d;
        if (mMVisiblePasswordEditText.getCompoundDrawables()[2] == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/base/MMVisiblePasswordEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() != 1) {
            yj0.a.i(false, this, "com/tencent/mm/ui/base/MMVisiblePasswordEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getX() > (mMVisiblePasswordEditText.getWidth() - mMVisiblePasswordEditText.getPaddingRight()) - mMVisiblePasswordEditText.f197636d.getIntrinsicWidth()) {
            mMVisiblePasswordEditText.f197638f = !mMVisiblePasswordEditText.f197638f;
            mMVisiblePasswordEditText.b();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/base/MMVisiblePasswordEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
