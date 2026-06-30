package sf1;

/* loaded from: classes5.dex */
public final class q implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f407010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f407011b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf1.g f407012c;

    public q(int i17, kotlin.jvm.internal.c0 c0Var, yz5.a aVar, sf1.g gVar) {
        this.f407010a = c0Var;
        this.f407011b = aVar;
        this.f407012c = gVar;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.Integer next;
        if (4660 != i17) {
            return false;
        }
        this.f407010a.f310112d = true;
        java.util.ArrayList<java.lang.Integer> integerArrayListExtra = intent != null ? intent.getIntegerArrayListExtra("android.provider.extra.WIFI_NETWORK_RESULT_LIST") : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "tryKeepConnectedWifi, onActivityResult, resultCode: " + i18 + ", addWifiNetworkResultList: " + integerArrayListExtra);
        yz5.a aVar = this.f407011b;
        sf1.g gVar = this.f407012c;
        if (i18 != -1 || com.tencent.mm.sdk.platformtools.t8.L0(integerArrayListExtra)) {
            aVar.invoke();
            gVar.b("user denied");
        } else {
            kotlin.jvm.internal.o.d(integerArrayListExtra);
            java.util.Iterator<java.lang.Integer> it = integerArrayListExtra.iterator();
            while (it.hasNext() && ((next = it.next()) == null || next.intValue() != 0)) {
                aVar.invoke();
                if (next != null && next.intValue() == 2) {
                    gVar.b("wifi config already exists");
                } else {
                    sf1.g.c(gVar, null, 1, null);
                }
            }
        }
        return true;
    }
}
