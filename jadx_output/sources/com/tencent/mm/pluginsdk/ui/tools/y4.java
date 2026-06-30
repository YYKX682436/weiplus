package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class y4 extends uh0.v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI f192009b;

    public y4(com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI) {
        this.f192009b = miniQBReaderUI;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (this.f427739a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "openReadFile, ignore ret = %d", num);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "openReadFile, ret = %d", num);
        com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI = this.f192009b;
        com.tencent.mm.xwebutil.i.g(miniQBReaderUI, miniQBReaderUI.f191394i, miniQBReaderUI.f191395m, num.intValue());
        if (num.intValue() != 0) {
            miniQBReaderUI.finish();
        }
    }
}
