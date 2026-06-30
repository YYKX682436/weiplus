package db5;

/* loaded from: classes5.dex */
public class h2 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMFormVerifyCodeInputView f228361d;

    public h2(com.tencent.mm.ui.base.MMFormVerifyCodeInputView mMFormVerifyCodeInputView) {
        this.f228361d = mMFormVerifyCodeInputView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f228361d.f197383r;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
    }
}
