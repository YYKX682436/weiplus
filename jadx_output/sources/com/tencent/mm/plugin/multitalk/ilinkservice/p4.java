package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public abstract class p4 extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f149742d = new byte[1];

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.s4 f149743e;

    public p4(com.tencent.mm.plugin.multitalk.ilinkservice.s4 s4Var) {
        this.f149743e = s4Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        boolean z17;
        int i17;
        com.tencent.mm.plugin.multitalk.ilinkservice.s4 s4Var = this.f149743e;
        while (true) {
            try {
                synchronized (s4Var) {
                    z17 = s4Var.f149788f;
                }
                if (!z17) {
                    return;
                }
                com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
                byte[] bArr = this.f149742d;
                i4Var.getClass();
                com.tencent.wxmm.v2conference v2conferenceVar = com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c;
                int GetDecodeVideoData = v2conferenceVar.GetDecodeVideoData(bArr, 128);
                int i18 = v2conferenceVar.field_remoteScreenImgLength;
                int i19 = v2conferenceVar.field_remoteScreenImgHeight;
                int i27 = v2conferenceVar.field_remoteScreenImgWidth;
                int i28 = v2conferenceVar.field_remoteScreenImgMember;
                if (GetDecodeVideoData != -100) {
                    int i29 = v2conferenceVar.field_remoteScreenImgFormat;
                    if ((i29 & 256) == 0) {
                        int i37 = (i29 & 512) != 0 ? 2 : 1;
                        if ((i29 & 1024) != 0) {
                            i37 += 2;
                        }
                        i17 = i37;
                    } else {
                        i17 = 1;
                    }
                    int i38 = s4Var.f149785c + 1;
                    s4Var.f149785c = i38;
                    if (i38 % 100 == 0) {
                        int length = this.f149742d.length;
                    }
                    if (GetDecodeVideoData > 0 && i18 > 0) {
                        if (i28 >= 0) {
                            java.lang.String d17 = s4Var.f149783a.d(i28);
                            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkVideoMgr", "yuemwang: nGetVideoData mid : " + i28 + " user: " + d17 + "  size:" + i27 + "x" + i19);
                            boolean z18 = GetDecodeVideoData == 1 && i27 == 0 && i19 < 3;
                            if (d17 != null) {
                                if (z18) {
                                    zj3.i.f473328a.b(2);
                                    com.tencent.mm.plugin.multitalk.model.e3.Ri().q().b(d17, this.f149742d, i27, i19, 0, i17);
                                } else if (i27 > 480) {
                                    zj3.i.f473328a.b(1);
                                    com.tencent.mm.plugin.multitalk.model.e3.Ri().q().a(d17, com.tencent.mm.plugin.multitalk.ilinkservice.t4.E(this.f149742d, i18), i27, i19, 0, i17);
                                } else {
                                    int[] E = com.tencent.mm.plugin.multitalk.ilinkservice.t4.E(this.f149742d, i18);
                                    com.tencent.mm.plugin.multitalk.model.p3 q17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().q();
                                    int i39 = com.tencent.mm.plugin.voip.video.OpenGlRender.A;
                                    q17.c(d17, E, i27, i19, 0, 4);
                                }
                            }
                        }
                    }
                    return;
                }
                int i47 = i27 * i19 * 4;
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkVideoMgr", "realloc buffer, new size: " + i47);
                this.f149742d = new byte[i47];
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Multitalk.ILinkVideoMgr", e17, "timer task crash", new java.lang.Object[0]);
                return;
            }
        }
    }
}
