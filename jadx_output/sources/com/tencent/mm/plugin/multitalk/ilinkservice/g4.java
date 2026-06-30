package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes7.dex */
class g4 implements com.tencent.mm.ipcinvoker.k0 {
    private g4() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = new android.os.Bundle();
        boolean z17 = iq.b.H() || vq4.p0.c() || vq4.p0.d();
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "steve: check voip state:%b,%b,%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(iq.b.H()), java.lang.Boolean.valueOf(vq4.p0.c()), java.lang.Boolean.valueOf(vq4.p0.d()));
        bundle.putBoolean("is_in_voip", z17);
        return bundle;
    }
}
