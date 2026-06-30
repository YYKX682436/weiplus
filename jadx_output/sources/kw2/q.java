package kw2;

/* loaded from: classes15.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.g f313078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kw2.e f313080f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kw2.g gVar, java.lang.String str, kw2.e eVar) {
        super(0);
        this.f313078d = gVar;
        this.f313079e = str;
        this.f313080f = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kw2.g gVar = this.f313078d;
        if (gVar.f313013a) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PLAY_onPlayerStart#onDownloaderStart ");
            sb6.append(this.f313079e);
            sb6.append(' ');
            kw2.e eVar = this.f313080f;
            sb6.append(eVar);
            com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", sb6.toString());
            eVar.B = true;
            eVar.C = false;
            kw2.e.V.c(eVar, gVar.f313014b);
        }
        return jz5.f0.f302826a;
    }
}
