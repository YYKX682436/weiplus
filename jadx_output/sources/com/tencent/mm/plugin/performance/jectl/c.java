package com.tencent.mm.plugin.performance.jectl;

/* loaded from: classes12.dex */
public class c implements com.tencent.mm.app.h4 {
    public c(com.tencent.mm.plugin.performance.jectl.JeVersion$JeService jeVersion$JeService) {
    }

    @Override // com.tencent.mm.app.h4
    public void a(java.lang.Thread thread, java.lang.String str, java.lang.Throwable th6) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.plugin.performance.jectl.a.f152996a;
        o4Var.A("JV_KEY_CRASH_TIMES_INT", o4Var.o("JV_KEY_CRASH_TIMES_INT", 0) + 1);
    }

    @Override // com.tencent.mm.app.h4
    public void e(int i17, java.lang.String str) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.plugin.performance.jectl.a.f152996a;
        o4Var.A("JV_KEY_CRASH_TIMES_INT", o4Var.o("JV_KEY_CRASH_TIMES_INT", 0) + 1);
    }
}
