package ej0;

/* loaded from: classes9.dex */
public class c implements com.tencent.kinda.framework.widget.base.BaseFrActivity.IWalletTenpayKBStateCallBackListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.framework.app.UIPageFragmentActivity f253272a;

    public c(com.tencent.mm.framework.app.UIPageFragmentActivity uIPageFragmentActivity) {
        this.f253272a = uIPageFragmentActivity;
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFrActivity.IWalletTenpayKBStateCallBackListener
    public void onCallBackKinda(boolean z17, float f17, com.tencent.kinda.framework.widget.base.BaseFragment baseFragment) {
        com.tencent.mm.framework.app.UIPageFragmentActivity uIPageFragmentActivity = this.f253272a;
        if (baseFragment == null) {
            baseFragment = uIPageFragmentActivity.f68153f.getCurrent();
        }
        float c17 = f17 <= 0.0f ? 230.0f : i65.a.c(uIPageFragmentActivity.getContext(), (int) f17);
        if (baseFragment != null) {
            boolean z18 = false;
            if (!z17) {
                baseFragment.onKeyboardShow(false, (int) c17);
                return;
            }
            baseFragment.onKeyboardShow(true, (int) c17);
            if (uIPageFragmentActivity.f68162r) {
                return;
            }
            com.tenpay.android.wechat.MyKeyboardWindow keyboard = uIPageFragmentActivity.getKeyboard();
            com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = uIPageFragmentActivity.getTenpaySecureEditText();
            if (keyboard == null || tenpaySecureEditText == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "Keyboard or EditText not found");
            } else {
                ej0.g gVar = new ej0.g(null);
                keyboard.setOnTouchListener(gVar);
                fo3.s.INSTANCE.lj(new ej0.d(uIPageFragmentActivity, gVar));
                tenpaySecureEditText.setOnPasswdInputListener(new ej0.e(uIPageFragmentActivity, tenpaySecureEditText));
                z18 = true;
            }
            uIPageFragmentActivity.f68162r = z18;
        }
    }
}
