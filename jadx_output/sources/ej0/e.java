package ej0;

/* loaded from: classes9.dex */
public class e implements com.tenpay.android.wechat.OnPasswdInputListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tenpay.android.wechat.TenpaySecureEditText f253273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.framework.app.UIPageFragmentActivity f253274b;

    public e(com.tencent.mm.framework.app.UIPageFragmentActivity uIPageFragmentActivity, com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText) {
        this.f253274b = uIPageFragmentActivity;
        this.f253273a = tenpaySecureEditText;
    }

    @Override // com.tenpay.android.wechat.OnPasswdInputListener
    public void onDone() {
        com.tenpay.android.wechat.TenpaySecureEditText.EditState editState = this.f253273a.getEditState();
        com.tenpay.android.wechat.TenpaySecureEditText.EditState editState2 = com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD;
        fo3.s sVar = fo3.s.INSTANCE;
        com.tencent.mm.framework.app.UIPageFragmentActivity uIPageFragmentActivity = this.f253274b;
        if (editState == editState2) {
            int i17 = com.tencent.mm.framework.app.UIPageFragmentActivity.f68150v;
            uIPageFragmentActivity.getClass();
            sVar.sb(true);
        } else {
            int i18 = com.tencent.mm.framework.app.UIPageFragmentActivity.f68150v;
            uIPageFragmentActivity.getClass();
            sVar.sb(false);
        }
    }
}
