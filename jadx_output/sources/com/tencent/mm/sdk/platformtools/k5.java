package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public class k5 implements android.media.AudioManager.OnModeChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.l5 f192809a;

    public k5(com.tencent.mm.sdk.platformtools.l5 l5Var, com.tencent.mm.sdk.platformtools.g5 g5Var) {
        this.f192809a = l5Var;
    }

    @Override // android.media.AudioManager.OnModeChangedListener
    public void onModeChanged(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStatusWatcher", "onModeChanged, mode: %d", java.lang.Integer.valueOf(i17));
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                i18 = 0;
            }
        }
        if (((java.util.ArrayList) this.f192809a.f192837d).size() > 0) {
            for (com.tencent.mm.sdk.platformtools.h5 h5Var : (com.tencent.mm.sdk.platformtools.h5[]) ((java.util.ArrayList) this.f192809a.f192837d).toArray(new com.tencent.mm.sdk.platformtools.h5[((java.util.ArrayList) this.f192809a.f192837d).size()])) {
                h5Var.a(i18);
            }
        }
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.sdk.platformtools.j5.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((ll3.n0) ((com.tencent.mm.sdk.platformtools.j5) ((fs.n) qVar.get()))).b(i18);
            }
        }
    }
}
