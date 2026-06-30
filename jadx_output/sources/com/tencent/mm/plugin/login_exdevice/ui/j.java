package com.tencent.mm.plugin.login_exdevice.ui;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI f145000e;

    public j(com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI loginAsExDeviceUI, java.lang.String str) {
        this.f145000e = loginAsExDeviceUI;
        this.f144999d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            android.graphics.Bitmap O = com.tencent.mm.sdk.platformtools.x.O(com.tencent.mm.network.n.b(this.f144999d, 10000, com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL));
            if (O != null) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.login_exdevice.ui.i(this, com.tencent.mm.sdk.platformtools.x.s0(O, true, com.tencent.mm.ui.zk.e(this.f145000e.getContext(), com.tencent.mm.R.dimen.f479688cn))));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LoginAsExDeviceUI", "download avatar failed");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LoginAsExDeviceUI", e17, "", new java.lang.Object[0]);
        }
    }
}
