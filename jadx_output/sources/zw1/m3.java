package zw1;

/* loaded from: classes5.dex */
public class m3 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI f476726d;

    public m3(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI) {
        this.f476726d = walletCollectQrCodeSettingUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeSettingUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f476726d.handleKeyboardTouchEvent(motionEvent);
        yj0.a.i(false, this, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeSettingUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
