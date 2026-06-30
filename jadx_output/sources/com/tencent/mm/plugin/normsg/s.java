package com.tencent.mm.plugin.normsg;

@mk0.a
/* loaded from: classes13.dex */
class s implements com.tencent.mm.ipcinvoker.j {
    private s() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        try {
            com.tencent.mm.plugin.normsg.u.f152419f.post(new com.tencent.mm.plugin.normsg.r(this, (android.os.Bundle) obj));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NormsgSourceImpl", "run wkat failed:%s", th6.toString());
        }
    }
}
