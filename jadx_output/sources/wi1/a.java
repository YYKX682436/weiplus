package wi1;

/* loaded from: classes5.dex */
public class a implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView f446151d;

    public a(com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView mMFormVerifyCodeInputView) {
        this.f446151d = mMFormVerifyCodeInputView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView mMFormVerifyCodeInputView = this.f446151d;
        if (view == mMFormVerifyCodeInputView.f87410e) {
            mMFormVerifyCodeInputView.f87419q = new int[]{mMFormVerifyCodeInputView.getPaddingLeft(), mMFormVerifyCodeInputView.getPaddingTop(), mMFormVerifyCodeInputView.getPaddingRight(), mMFormVerifyCodeInputView.getPaddingBottom()};
            if (z17) {
                mMFormVerifyCodeInputView.setBackgroundResource(com.tencent.mm.R.drawable.c7a);
            } else {
                mMFormVerifyCodeInputView.setBackgroundResource(com.tencent.mm.R.drawable.c7b);
            }
            int[] iArr = mMFormVerifyCodeInputView.f87419q;
            if (iArr != null) {
                mMFormVerifyCodeInputView.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = mMFormVerifyCodeInputView.f87420r;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
    }
}
