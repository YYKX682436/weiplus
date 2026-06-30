package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public abstract class q4 implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f149752d = new byte[1];

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.s4 f149753e;

    public q4(com.tencent.mm.plugin.multitalk.ilinkservice.s4 s4Var) {
        this.f149753e = s4Var;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "iLinkVideoMgr.DecodeTimerTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mm.plugin.multitalk.ilinkservice.s4 s4Var = this.f149753e;
        while (true) {
            try {
                synchronized (s4Var) {
                    z17 = s4Var.f149788f;
                }
                if (!z17) {
                    return;
                }
                com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
                byte[] bArr = this.f149752d;
                i4Var.getClass();
                com.tencent.wxmm.v2conference v2conferenceVar = com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c;
                int GetDecodeVideoData = v2conferenceVar.GetDecodeVideoData(bArr, 0);
                int i17 = v2conferenceVar.field_remoteImgLength;
                int i18 = v2conferenceVar.field_remoteImgHeight;
                int i19 = v2conferenceVar.field_remoteImgWidth;
                int i27 = v2conferenceVar.field_remoteImgMember;
                if (GetDecodeVideoData != -100) {
                    int i28 = s4Var.f149784b + 1;
                    s4Var.f149784b = i28;
                    if (i28 % 100 == 0) {
                        int length = this.f149752d.length;
                    }
                    if (GetDecodeVideoData > 0 && i17 > 0 && i18 > 0 && i19 > 0) {
                        if (i27 >= 0) {
                            java.lang.String d17 = s4Var.f149783a.d(i27);
                            int[] E = com.tencent.mm.plugin.multitalk.ilinkservice.t4.E(this.f149752d, i17);
                            if (d17 != null) {
                                com.tencent.mm.plugin.multitalk.model.e3.Ri().q().c(d17, E, i19, i18, 0, 90);
                            }
                        }
                    }
                    return;
                }
                int i29 = i19 * i18 * 4;
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkVideoMgr", "realloc buffer, new size: " + i29);
                this.f149752d = new byte[i29];
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Multitalk.ILinkVideoMgr", e17, "timer task crash", new java.lang.Object[0]);
                return;
            }
        }
    }
}
