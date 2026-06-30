package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class ba implements l81.v0 {
    @Override // l81.v0
    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.prerenderMiniProgram", "prerender mini pro fail,errCode:" + i17 + ",errMsg:" + str);
    }

    @Override // l81.v0
    public void onSuccess() {
        com.tencent.mars.xlog.Log.i("MicroMsg.prerenderMiniProgram", "prerender mini pro success!");
    }
}
