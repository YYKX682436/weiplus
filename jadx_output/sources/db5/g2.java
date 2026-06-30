package db5;

/* loaded from: classes5.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMFormVerifyCodeInputView f228343d;

    public g2(com.tencent.mm.ui.base.MMFormVerifyCodeInputView mMFormVerifyCodeInputView) {
        this.f228343d = mMFormVerifyCodeInputView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMFormVerifyCodeInputView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = this.f228343d.f197373e;
        mMClearEditText.setText("");
        mMClearEditText.d();
        yj0.a.h(this, "com/tencent/mm/ui/base/MMFormVerifyCodeInputView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
