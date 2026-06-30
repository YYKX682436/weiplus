package wi1;

/* loaded from: classes5.dex */
public class c implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView f446153d;

    public c(com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView mMFormVerifyCodeInputView) {
        this.f446153d = mMFormVerifyCodeInputView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView mMFormVerifyCodeInputView = this.f446153d;
        mMFormVerifyCodeInputView.f87417o--;
        mMFormVerifyCodeInputView.f87411f.setText(mMFormVerifyCodeInputView.getContext().getString(com.tencent.mm.R.string.f490647a30, java.lang.Integer.valueOf(mMFormVerifyCodeInputView.f87417o)));
        if (mMFormVerifyCodeInputView.f87417o != 0) {
            return true;
        }
        mMFormVerifyCodeInputView.f87418p.d();
        mMFormVerifyCodeInputView.f87417o = mMFormVerifyCodeInputView.f87416n;
        mMFormVerifyCodeInputView.f87412g.setVisibility(0);
        mMFormVerifyCodeInputView.f87411f.setVisibility(8);
        return true;
    }
}
