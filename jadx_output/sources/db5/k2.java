package db5;

/* loaded from: classes5.dex */
public class k2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMFormVerifyCodeInputView f228419d;

    public k2(com.tencent.mm.ui.base.MMFormVerifyCodeInputView mMFormVerifyCodeInputView) {
        this.f228419d = mMFormVerifyCodeInputView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.ui.base.MMFormVerifyCodeInputView mMFormVerifyCodeInputView = this.f228419d;
        mMFormVerifyCodeInputView.f197381p--;
        mMFormVerifyCodeInputView.f197374f.setText(mMFormVerifyCodeInputView.getContext().getString(com.tencent.mm.R.string.gwu, java.lang.Integer.valueOf(mMFormVerifyCodeInputView.f197381p)));
        if (mMFormVerifyCodeInputView.f197381p != 0) {
            return true;
        }
        mMFormVerifyCodeInputView.f197382q.d();
        mMFormVerifyCodeInputView.f197381p = mMFormVerifyCodeInputView.f197380o;
        mMFormVerifyCodeInputView.f197375g.setVisibility(0);
        mMFormVerifyCodeInputView.f197374f.setVisibility(8);
        return true;
    }
}
