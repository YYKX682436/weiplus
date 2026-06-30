package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f150133a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.concurrent.CopyOnWriteArrayList f150134b;

    public t0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkEngine", "init multiTalk engine");
        com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().f273148a.a(1));
    }

    public void a(boolean z17) {
        byte[] bArr = {z17 ? (byte) 1 : (byte) 0};
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MT.MultiTalkEngine", "setEngineHeadsetPlugged, %s", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.getClass();
        com.tencent.mm.plugin.multitalk.ilinkservice.g0.c(425, bArr, 1);
        if (!z17) {
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.c(com.tencent.mm.plugin.appbrand.jsapi.appdownload.l1.CTRL_INDEX, bArr, 1);
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.c(com.tencent.mm.plugin.appbrand.jsapi.appdownload.m0.CTRL_INDEX, bArr, 1);
            c(ym1.f.f463134h.k());
        } else {
            if (ym1.f.Ri()) {
                com.tencent.mm.plugin.multitalk.ilinkservice.g0.c(com.tencent.mm.plugin.appbrand.jsapi.appdownload.l1.CTRL_INDEX, bArr, 1);
            }
            if (ym1.f.Ni()) {
                com.tencent.mm.plugin.multitalk.ilinkservice.g0.c(com.tencent.mm.plugin.appbrand.jsapi.appdownload.m0.CTRL_INDEX, bArr, 1);
            }
        }
    }

    public void b(boolean z17) {
        byte[] bArr = new byte[1];
        com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.MT.MultiTalkEngine", "setEngineMicOn, %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            bArr[0] = 1;
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.getClass();
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.c(413, bArr, 1);
        } else {
            bArr[0] = 0;
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.getClass();
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.c(412, bArr, 1);
        }
    }

    public void c(boolean z17) {
        byte[] bArr = new byte[1];
        com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.MT.MultiTalkEngine", "qipengfeng, setEngineSpeakerOn, %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            bArr[0] = 1;
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.getClass();
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.c(401, bArr, 1);
        } else {
            bArr[0] = 0;
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.getClass();
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.c(402, bArr, 1);
        }
    }

    public void d() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f150133a;
        if (b4Var != null) {
            b4Var.d();
            this.f150133a.quitSafely();
            this.f150133a.removeCallbacksAndMessages(null);
        }
    }
}
