package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class j5 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo f154373a;

    public j5(com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        this.f154373a = contactWidgetTabBizInfo;
    }

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "update biz contact username:%s, succ: %b", str, java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.tencent.mm.plugin.appbrand.utils.d5.b(new com.tencent.mm.plugin.profile.ui.tab.i5(this.f154373a, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true)));
        }
    }
}
