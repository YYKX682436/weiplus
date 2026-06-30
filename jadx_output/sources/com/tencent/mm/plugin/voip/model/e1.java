package com.tencent.mm.plugin.voip.model;

/* loaded from: classes13.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f176466d;

    /* renamed from: e, reason: collision with root package name */
    public int f176467e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f176468f = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.d1 f176469g;

    public e1(com.tencent.mm.plugin.voip.model.g1 g1Var, com.tencent.mm.plugin.voip.model.q0 q0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        byte[] address;
        java.lang.String defaultHost = android.net.Proxy.getDefaultHost();
        int defaultPort = android.net.Proxy.getDefaultPort();
        if (defaultHost != null && defaultHost.length() > 0 && defaultPort > 0) {
            this.f176466d = 1;
            this.f176467e = defaultPort;
            try {
                try {
                    address = java.net.InetAddress.getByName(java.net.InetAddress.getByName(defaultHost).getHostAddress()).getAddress();
                } catch (java.net.UnknownHostException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoipHelper", e17, "", new java.lang.Object[0]);
                }
                if (address != null) {
                    i17 = 0;
                    for (byte b17 : address) {
                        i17 = (i17 << 8) | (b17 & 255);
                    }
                    this.f176468f = i17;
                }
                i17 = 0;
                this.f176468f = i17;
            } catch (java.net.UnknownHostException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Voip.VoipContext", e18, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.plugin.voip.model.d1 d1Var = this.f176469g;
        int i18 = this.f176466d;
        int i19 = this.f176467e;
        int i27 = this.f176468f;
        com.tencent.mm.plugin.voip.model.z0 z0Var = (com.tencent.mm.plugin.voip.model.z0) d1Var;
        z0Var.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.voip.model.y0(z0Var, i18, i27, i19));
    }
}
