package k93;

/* loaded from: classes8.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.widget.InputClearablePreference f305887d;

    public e(com.tencent.mm.plugin.label.ui.widget.InputClearablePreference inputClearablePreference) {
        this.f305887d = inputClearablePreference;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/widget/InputClearablePreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.label.ui.widget.InputClearablePreference inputClearablePreference = this.f305887d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = inputClearablePreference.S;
        if (mMEditText != null) {
            mMEditText.setText("");
            inputClearablePreference.L = "";
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/widget/InputClearablePreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
