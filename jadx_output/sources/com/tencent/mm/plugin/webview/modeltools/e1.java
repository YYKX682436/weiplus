package com.tencent.mm.plugin.webview.modeltools;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes8.dex */
public class e1 implements com.tencent.mm.ipcinvoker.j {
    private e1() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (iPCString == null || com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
            return;
        }
        b21.p pVar = new b21.p();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(iPCString.f68406d);
            pVar.f17342a = jSONObject.optString("current_musicid", "");
            pVar.f17343b = jSONObject.optString("report_list", "");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave, ex = %s", e17.getMessage());
        }
        com.tencent.mm.sdk.platformtools.u3.h(new b21.c(pVar));
    }
}
