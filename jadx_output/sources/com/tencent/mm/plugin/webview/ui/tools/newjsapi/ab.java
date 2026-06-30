package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/ab;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
public final class ab implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.Object l17 = gm0.j1.u().c().l(6, null);
        java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
        if (str == null || r26.n0.N(str)) {
            str = "";
        }
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(str));
        }
    }
}
