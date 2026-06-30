package com.tencent.mm.plugin.wepkg.utils;

/* loaded from: classes8.dex */
public class b extends com.tencent.mm.app.s2 {
    public b(com.tencent.mm.plugin.wepkg.utils.g gVar) {
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            com.tencent.mm.autogen.events.WepkgNotifyEvent wepkgNotifyEvent = new com.tencent.mm.autogen.events.WepkgNotifyEvent();
            wepkgNotifyEvent.f54992g.f7969a = 3;
            wepkgNotifyEvent.e();
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            com.tencent.mm.autogen.events.WepkgNotifyEvent wepkgNotifyEvent = new com.tencent.mm.autogen.events.WepkgNotifyEvent();
            wepkgNotifyEvent.f54992g.f7969a = 5;
            wepkgNotifyEvent.e();
        }
    }
}
