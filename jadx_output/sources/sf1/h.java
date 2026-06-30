package sf1;

/* loaded from: classes13.dex */
public final class h implements rf1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406973b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f406974c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf1.m f406975d;

    public h(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.h0 h0Var, sf1.m mVar) {
        this.f406972a = str;
        this.f406973b = str2;
        this.f406974c = h0Var;
        this.f406975d = mVar;
    }

    @Override // rf1.c
    public void a(rf1.h wiFiItem) {
        kotlin.jvm.internal.o.g(wiFiItem, "wiFiItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onConnect#sysListener");
    }

    @Override // rf1.c
    public void b(rf1.h wiFiItem) {
        kotlin.jvm.internal.o.g(wiFiItem, "wiFiItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onConnectAcceptIncomplete#sysListener");
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f406972a, wiFiItem.f394622a)) {
            java.lang.String str = this.f406973b;
            if ((str.length() == 0) || com.tencent.mm.sdk.platformtools.t8.D0(str, wiFiItem.f394623b)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onConnectInternal#sysListener, match");
                wu5.c cVar = (wu5.c) this.f406974c.f310123d;
                if (cVar != null) {
                    cVar.cancel(true);
                }
                rf1.d.c(this);
                this.f406975d.a();
            }
        }
    }

    @Override // rf1.c
    public void h() {
    }
}
