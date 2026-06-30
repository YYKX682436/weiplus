package gs3;

/* loaded from: classes15.dex */
public class a extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.pwdgroup.ui.widget.MMCallBackScrollView f275078a;

    public a(com.tencent.mm.plugin.pwdgroup.ui.widget.MMCallBackScrollView mMCallBackScrollView) {
        this.f275078a = mMCallBackScrollView;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.plugin.pwdgroup.ui.widget.MMCallBackScrollView mMCallBackScrollView = this.f275078a;
        int scrollY = mMCallBackScrollView.getScrollY();
        if (scrollY == mMCallBackScrollView.f154774d) {
            mMCallBackScrollView.a(0);
            return;
        }
        mMCallBackScrollView.f154774d = scrollY;
        com.tencent.mm.sdk.platformtools.n3 n3Var = mMCallBackScrollView.f154777g;
        n3Var.sendMessageDelayed(n3Var.obtainMessage(), 5L);
        mMCallBackScrollView.a(1);
    }
}
