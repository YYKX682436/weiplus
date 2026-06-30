package db5;

/* loaded from: classes5.dex */
public class c2 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMFormMobileInputView f228302d;

    public c2(com.tencent.mm.ui.base.MMFormMobileInputView mMFormMobileInputView) {
        this.f228302d = mMFormMobileInputView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.ui.base.MMFormMobileInputView mMFormMobileInputView = this.f228302d;
        if (view == mMFormMobileInputView.f197362d || view == mMFormMobileInputView.f197363e) {
            mMFormMobileInputView.a(z17);
        }
    }
}
