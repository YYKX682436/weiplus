package se4;

/* loaded from: classes9.dex */
public class i implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm5.b f406928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ se4.j f406929b;

    public i(se4.j jVar, nm5.b bVar) {
        this.f406929b = jVar;
        this.f406928a = bVar;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.c cVar = (eu5.c) eVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterPrepareAskFunc", "SoterPrepareAskFunc onResult errCode: %d, errMsg: %s", java.lang.Integer.valueOf(cVar.f475605a), cVar.f475606b);
        boolean a17 = cVar.a();
        se4.j jVar = this.f406929b;
        if (a17) {
            jVar.f406930a.c(this.f406928a.a(1));
            if (!com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet").getBoolean("MMKV_KEY_SOTER_IS_LAST_UPLOAD_ASK_SUCCESS", false)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 29);
            }
            if (!com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet").getBoolean("MMKV_KEY_SOTER_IS_LAST_GEN_ASK_SUCCESS", false)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 30);
            }
            com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet").putBoolean("MMKV_KEY_SOTER_IS_LAST_GEN_ASK_SUCCESS", true);
            com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet").putBoolean("MMKV_KEY_SOTER_IS_LAST_UPLOAD_ASK_SUCCESS", true);
        } else {
            if (cVar.f475605a == 1003) {
                jVar.getClass();
                com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet").putBoolean("MMKV_KEY_SOTER_IS_LAST_UPLOAD_ASK_SUCCESS", false);
            }
            if (cVar.f475605a == 4) {
                jVar.getClass();
                com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet").putBoolean("MMKV_KEY_SOTER_IS_LAST_GEN_ASK_SUCCESS", false);
            }
            re4.n.c(1, cVar.f475605a, 1L);
            jVar.f406930a.a(nm5.j.c(java.lang.Integer.valueOf(cVar.f475605a), cVar.f475606b));
        }
        if (wt5.a.g() == 1) {
            re4.n.c(1, -2, 1L);
        } else {
            re4.n.c(1, -3, 1L);
        }
    }
}
