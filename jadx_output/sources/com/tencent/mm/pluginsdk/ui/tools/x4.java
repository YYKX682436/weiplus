package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class x4 implements android.webkit.ValueCallback {
    public x4(com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI) {
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "updateRetCallback onReceiveValue ret = %d", (java.lang.Integer) obj);
    }
}
