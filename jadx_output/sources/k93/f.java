package k93;

/* loaded from: classes8.dex */
public class f implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.widget.InputClearablePreference f305888d;

    public f(com.tencent.mm.plugin.label.ui.widget.InputClearablePreference inputClearablePreference) {
        this.f305888d = inputClearablePreference;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/widget/InputClearablePreference$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f305888d.S;
        if (mMEditText != null) {
            mMEditText.clearFocus();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/label/ui/widget/InputClearablePreference$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
