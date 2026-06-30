package p61;

/* loaded from: classes5.dex */
public class w2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI f352400d;

    public w2(com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI bindMobileVerifyUI) {
        this.f352400d = bindMobileVerifyUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI bindMobileVerifyUI = this.f352400d;
        android.widget.TextView textView = bindMobileVerifyUI.f73054i;
        if (textView == null) {
            return true;
        }
        textView.post(new p61.x2(bindMobileVerifyUI));
        return true;
    }
}
