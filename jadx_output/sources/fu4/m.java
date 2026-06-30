package fu4;

/* loaded from: classes9.dex */
public class m implements d50.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.model.f f266905a;

    public m(fu4.n nVar, com.tencent.mm.plugin.walletlock.model.f fVar) {
        this.f266905a = fVar;
    }

    @Override // d50.o
    public void a() {
        this.f266905a.a();
    }

    @Override // d50.o
    public void b(eu5.a aVar) {
        com.tencent.mm.plugin.walletlock.model.l.instance.f181371e = (zt5.s) aVar.f256827c;
        this.f266905a.onResult(aVar.f475605a, aVar.f475606b);
    }

    @Override // d50.o
    public void c(int i17, eu5.a aVar) {
        m05.i.f322570a.a("5", "3", java.lang.String.valueOf(aVar.f475605a), aVar.f475606b);
        com.tencent.mm.plugin.walletlock.model.m.b(3, aVar.f475605a, 1L);
        if (i17 == 1) {
            return;
        }
        int i18 = aVar.f475605a;
        com.tencent.mm.plugin.walletlock.model.f fVar = this.f266905a;
        if (i18 == 1021 || i18 == 1022) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintAuthManager", "too many trial");
            if (fVar != null) {
                fVar.onResult(3, "too many trial");
                return;
            }
            return;
        }
        if (i18 == 1020 || i18 == 1029) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintAuthManager", "user cancelled");
            if (fVar != null) {
                fVar.onResult(4, "user cancelled");
                return;
            }
            return;
        }
        if (i18 == 1012) {
            if (fVar != null) {
                fVar.onResult(8, "no fingerprint enrolled in system");
            }
        } else if (fVar != null) {
            fVar.onResult(2, aVar.f475606b);
        }
    }
}
