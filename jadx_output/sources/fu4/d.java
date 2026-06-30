package fu4;

/* loaded from: classes9.dex */
public class d implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fu4.f f266887a;

    public d(fu4.f fVar) {
        this.f266887a = fVar;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.c cVar = (eu5.c) eVar;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(cVar.f475605a);
        java.lang.String str = cVar.f475606b;
        fu4.f fVar = this.f266887a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintLockOpenDelegate", "prepareAuthKey onResult errCode: %d, errMsg: %s, isCancelled: %b", valueOf, str, java.lang.Boolean.valueOf(fVar.f266893h));
        if (fVar.f266893h) {
            return;
        }
        if (cVar.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintLockOpenDelegate", "update wallet lock auth key success");
            fu4.g gVar = fVar.f266889d;
            if (gVar != null) {
                gVar.h(0, "prepare auth key ok");
            }
            re4.g0.g(0);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FingerprintLockOpenDelegate", "error when prepare auth key");
        java.lang.String str2 = cVar.f475606b;
        int i17 = cVar.f475605a;
        if (i17 == 1003) {
            str2 = re4.g0.f394536b;
        } else if (i17 == 1004) {
            str2 = re4.g0.f394537c;
        }
        m05.i.f322570a.a("5", "2", java.lang.String.valueOf(i17), str2);
        com.tencent.mm.plugin.walletlock.model.m.b(2, cVar.f475605a, 1L);
        fu4.g gVar2 = fVar.f266889d;
        if (gVar2 != null) {
            gVar2.h(2, cVar.f475606b);
        }
        if (cVar.f475605a == 1004) {
            cu5.b.f(3);
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_SOTER_UPLOAD_AK_FAILURE_INT_SYNC, 0)).intValue() + 1;
            re4.g0.g(intValue);
            if (intValue >= 2) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FingerprintLockOpenDelegate", "remove ask");
                wt5.a.r();
            }
        }
    }
}
