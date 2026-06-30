package se4;

/* loaded from: classes9.dex */
public class a implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ se4.b f406919a;

    public a(se4.b bVar) {
        this.f406919a = bVar;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        android.content.SharedPreferences d17;
        eu5.d dVar = (eu5.d) eVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterInitFunc", "SoterInitFunc onResult errCode: %d, errMsg: %s", java.lang.Integer.valueOf(dVar.f475605a), dVar.f475606b);
        boolean a17 = dVar.a();
        se4.b bVar = this.f406919a;
        if (a17) {
            java.lang.System.currentTimeMillis();
            se4.h.f406925a = true;
            bVar.getClass();
            android.content.SharedPreferences d18 = com.tencent.mm.sdk.platformtools.x2.d();
            if (d18 != null) {
                bVar.f406921b = 1;
                d18.edit().putBoolean("init_success", true).commit();
            }
            bVar.f406920a.resume();
            return;
        }
        re4.n.c(0, dVar.f475605a, 0L);
        if (bVar.f406921b <= 0 && (d17 = com.tencent.mm.sdk.platformtools.x2.d()) != null) {
            bVar.f406921b = d17.getBoolean("init_success", false) ? 1 : 2;
        }
        if (bVar.f406921b == 2 && dVar.f475605a == 2 && wo.v1.f447828h.f447810a) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 3);
            m05.i.f322570a.a("5", "1", "9999", "ever init success");
        }
        int i17 = dVar.f475605a;
        if (i17 != 1028) {
            se4.h.f406925a = false;
        }
        se4.h.f406926b = i17;
        bVar.f406920a.a(nm5.j.c(java.lang.Integer.valueOf(i17), dVar.f475606b));
    }
}
