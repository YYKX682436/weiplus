package zw1;

/* loaded from: classes5.dex */
public class j3 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f476675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI f476676e;

    public j3(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI, android.view.View.OnClickListener onClickListener) {
        this.f476676e = walletCollectQrCodeSettingUI;
        this.f476675d = onClickListener;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66 && this.f476676e.f96431h.isShown()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeSettingUI", "click enter");
            this.f476675d.onClick(null);
        }
        return true;
    }
}
