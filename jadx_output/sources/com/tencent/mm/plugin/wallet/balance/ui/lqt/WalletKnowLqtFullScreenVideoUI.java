package com.tencent.mm.plugin.wallet.balance.ui.lqt;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/wallet/balance/ui/lqt/WalletKnowLqtFullScreenVideoUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "Lcom/tencent/mm/plugin/wallet/balance/ui/lqt/a;", "<init>", "()V", "com/tencent/mm/plugin/wallet/balance/ui/lqt/l", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class WalletKnowLqtFullScreenVideoUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity implements com.tencent.mm.plugin.wallet.balance.ui.lqt.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.balance.ui.lqt.l f177920d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f177921e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.SeekBar f177922f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f177923g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f177924h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f177925i;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d6y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x008b, code lost:
    
        if (r3.getPlayer().isPlaying() == true) goto L17;
     */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletKnowLqtFullScreenVideoUIUI", "ondestroy");
        super.onDestroy();
        com.tencent.mm.plugin.wallet.balance.ui.lqt.l lVar = this.f177920d;
        if (lVar != null) {
            lVar.t();
            lVar.getPlayer().release();
        }
    }
}
