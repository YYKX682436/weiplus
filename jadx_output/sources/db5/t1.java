package db5;

/* loaded from: classes5.dex */
public class t1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMClearEditText f228516d;

    public t1(com.tencent.mm.ui.base.MMClearEditText mMClearEditText) {
        this.f228516d = mMClearEditText;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMClearEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = this.f228516d;
        if (mMClearEditText.getCompoundDrawables()[2] == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/base/MMClearEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() != 1) {
            yj0.a.i(false, this, "com/tencent/mm/ui/base/MMClearEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getX() > (mMClearEditText.getWidth() - mMClearEditText.getPaddingRight()) - mMClearEditText.f197326e.getIntrinsicWidth()) {
            mMClearEditText.setText("");
            mMClearEditText.d();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/base/MMClearEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
