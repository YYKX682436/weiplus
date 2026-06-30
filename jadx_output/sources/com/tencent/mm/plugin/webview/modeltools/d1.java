package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes.dex */
public class d1 implements com.tencent.mm.ipcinvoker.wx_extension.v {
    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewReportOnLeaveHelper", "doReport callback errType:%d errCode:%d msg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
    }
}
