package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/l7;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class l7 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        boolean z17;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            try {
                java.lang.String string = bundle.getString("key_author_finder_name");
                if (string != null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_member_inlet_source", bundle.getInt("key_member_inlet_source"));
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Nk(context, intent, string, 0, 0);
                }
            } catch (java.lang.Exception e17) {
                z17 = false;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenFinderMemberView", e17, "OpenFinderMemberView exception", new java.lang.Object[0]);
            }
        }
        z17 = true;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17));
        }
    }
}
