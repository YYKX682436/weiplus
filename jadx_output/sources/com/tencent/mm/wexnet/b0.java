package com.tencent.mm.wexnet;

/* loaded from: classes.dex */
public final class b0 extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f214356d;

    public b0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent event = (com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (!gm0.j1.a()) {
            return false;
        }
        int i17 = event.f54053g.f7759a;
        if (i17 != 108 && i17 != 109) {
            return false;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(event.f54053g.f7760b);
        am.r2 r2Var = event.f54053g;
        com.tencent.mars.xlog.Log.i("MicroMsg.XNET.XNetLibResUpdateCacheFileEvent", "xnet lib update coming. resType: %d subtype: %d, file path: %s, file version: %d, isArm64: %b", valueOf, valueOf2, r2Var.f7761c, java.lang.Integer.valueOf(r2Var.f7762d), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.z.f193115k));
        am.r2 r2Var2 = event.f54053g;
        java.lang.String str = r2Var2.f7761c;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = r2Var2.f7764f;
        java.lang.String str4 = str3 == null ? "" : str3;
        int i18 = r2Var2.f7762d;
        int i19 = r2Var2.f7759a;
        int i27 = r2Var2.f7760b;
        com.tencent.mm.wexnet.p pVar = com.tencent.mm.wexnet.p.f214370d;
        if (!str2.equals("")) {
            ((ku5.t0) ku5.t0.f312615d).b(new com.tencent.mm.wexnet.a0(str2, str4, i18, i19, i27, pVar), "XNetLibResHelper#processXnetSoResourceUpdate");
        }
        f214356d = true;
        return true;
    }
}
