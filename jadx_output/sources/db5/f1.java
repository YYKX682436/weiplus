package db5;

/* loaded from: classes4.dex */
public class f1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMAutoCompleteTextView f228331d;

    public f1(com.tencent.mm.ui.base.MMAutoCompleteTextView mMAutoCompleteTextView) {
        this.f228331d = mMAutoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMAutoCompleteTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.ui.base.MMAutoCompleteTextView mMAutoCompleteTextView = this.f228331d;
        if (mMAutoCompleteTextView.getCompoundDrawables()[2] == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/base/MMAutoCompleteTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() != 1) {
            yj0.a.i(false, this, "com/tencent/mm/ui/base/MMAutoCompleteTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getX() > (mMAutoCompleteTextView.getWidth() - mMAutoCompleteTextView.getPaddingRight()) - mMAutoCompleteTextView.f197310d.getIntrinsicWidth()) {
            mMAutoCompleteTextView.setText("");
            mMAutoCompleteTextView.setCompoundDrawables(mMAutoCompleteTextView.getCompoundDrawables()[0], mMAutoCompleteTextView.getCompoundDrawables()[1], null, mMAutoCompleteTextView.getCompoundDrawables()[3]);
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/base/MMAutoCompleteTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
