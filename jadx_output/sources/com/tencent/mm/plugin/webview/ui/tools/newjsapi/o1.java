package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002(\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/o1;", "Lcom/tencent/mm/ipcinvoker/j;", "", "", "", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class o1 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.util.HashMap hashMap;
        java.util.Map map = (java.util.Map) obj;
        if (rVar != null) {
            if (!(map == null || map.isEmpty()) && kotlin.jvm.internal.o.b(map.getOrDefault("entranceType", ""), "3")) {
                boolean z17 = (c01.z1.j() & 2097152) == 0;
                hashMap = new java.util.HashMap();
                hashMap.put("hasEntrance", java.lang.Boolean.TRUE);
                hashMap.put("open", java.lang.Boolean.valueOf(z17));
            } else {
                hashMap = null;
            }
            rVar.a(hashMap);
        }
    }
}
