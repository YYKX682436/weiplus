package com.tencent.mm.plugin.normsg;

/* loaded from: classes8.dex */
class l implements com.tencent.mm.ipcinvoker.k0 {
    private l() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            bundle.putParcelableArrayList("result", lo3.g.INSTANCE.h());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NormsgSourceImpl", "run cssfv error:" + th6);
        }
        return bundle;
    }
}
