package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

/* loaded from: classes8.dex */
public final class z implements u53.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186204a;

    public z(com.tencent.mm.ipcinvoker.r rVar) {
        this.f186204a = rVar;
    }

    @Override // u53.d0
    public final void a(java.lang.String str) {
        boolean z17 = str == null || str.length() == 0;
        com.tencent.mm.ipcinvoker.r rVar = this.f186204a;
        if (z17) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeSessionIdData("", "get sessionId fail", false));
            }
        } else if (rVar != null) {
            kotlin.jvm.internal.o.d(str);
            rVar.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeSessionIdData(str, "get sessionId ok", true));
        }
    }
}
