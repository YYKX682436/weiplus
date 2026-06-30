package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/c0;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/SendMsgParams;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GamelifeGeneralReturnParam;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
final class c0 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.f fVar;
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.SendMsgParams sendMsgParams = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.SendMsgParams) obj;
        if (sendMsgParams == null) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeGeneralReturnParam(false, "system err"));
                return;
            }
            return;
        }
        z53.t Di = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Di();
        java.lang.String str = sendMsgParams.f186165d;
        if (Di.z0(str).systemRowid == -1) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeGeneralReturnParam(false, "no conversation"));
                return;
            }
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.f.f186177e.getClass();
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.f[] values = com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.f.values();
        int length = values.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                fVar = null;
                break;
            }
            fVar = values[i17];
            if (fVar.f186179d == sendMsgParams.f186169h) {
                break;
            } else {
                i17++;
            }
        }
        int i18 = fVar == null ? -1 : com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.b0.f186170a[fVar.ordinal()];
        java.lang.String selfUserName = sendMsgParams.f186167f;
        java.lang.String content = sendMsgParams.f186166e;
        if (i18 == 1) {
            kotlin.jvm.internal.o.g(content, "content");
            kotlin.jvm.internal.o.g(selfUserName, "selfUserName");
            ((dk5.s5) tg3.t1.a()).fj(str, content, c01.e2.C(str), 0);
        } else if (i18 == 2) {
            kotlin.jvm.internal.o.g(content, "md5");
        } else if (i18 != 3) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeGeneralReturnParam(false, "system err"));
                return;
            }
            return;
        } else {
            kotlin.jvm.internal.o.g(content, "content");
            java.lang.String talker = sendMsgParams.f186168g;
            kotlin.jvm.internal.o.g(talker, "talker");
            kotlin.jvm.internal.o.g(selfUserName, "selfUserName");
        }
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeGeneralReturnParam(true, "sendmsg"));
        }
    }
}
