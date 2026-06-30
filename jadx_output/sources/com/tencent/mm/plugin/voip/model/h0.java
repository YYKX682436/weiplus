package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.voip.model.h0 f176554d = new com.tencent.mm.plugin.voip.model.h0();

    public static final void a(dm.sb sbVar) {
        if (!com.tencent.mm.plugin.voip.model.j0.d()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VoIPBubbleHelper", "shutDownNetScene: switch not enable, skip cgi call");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "shutDownNetScene: " + sbVar.Q0() + ' ' + sbVar.A0() + ' ' + sbVar.y0());
        new mq4.u((int) sbVar.Q0(), sbVar.R0(), "", 8, (int) (java.lang.System.currentTimeMillis() - sbVar.z0()), sbVar.w0() == 0 ? 0 : (int) (((sbVar.u0() > 0 ? sbVar.u0() : java.lang.System.currentTimeMillis()) - sbVar.w0()) / 1000)).L();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voip.model.h0.run():void");
    }
}
