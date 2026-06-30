package kw2;

/* loaded from: classes15.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.e f313030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kw2.g f313031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313032f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kw2.y f313033g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f313034h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kw2.h f313035i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kw2.e eVar, kw2.g gVar, java.lang.String str, kw2.y yVar, boolean z17, kw2.h hVar) {
        super(0);
        this.f313030d = eVar;
        this.f313031e = gVar;
        this.f313032f = str;
        this.f313033g = yVar;
        this.f313034h = z17;
        this.f313035i = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17;
        kw2.e eVar = this.f313030d;
        eVar.C = true;
        long j18 = eVar.f312964j;
        kw2.g gVar = this.f313031e;
        dn.h hVar = gVar.f313016d;
        kw2.d dVar = kw2.e.V;
        so2.i3 i3Var = gVar.f313015c;
        kw2.y yVar = this.f313033g;
        java.lang.String str = this.f313032f;
        if (hVar != null) {
            dVar.e(eVar, hVar);
            kw2.e eVar2 = eVar.S;
            dn.h hVar2 = gVar.f313016d;
            if (eVar2 != null) {
                eVar.G = i3Var != null ? i3Var.field_cacheSize : 0L;
                kotlin.jvm.internal.o.d(hVar2);
                long j19 = hVar2.field_recvedBytes;
                j17 = j18;
                long j27 = eVar.G - eVar.F;
                long j28 = j19 - j27;
                if (j27 < 0 || j28 < 0) {
                    kw2.e eVar3 = eVar.S;
                    kotlin.jvm.internal.o.d(eVar3);
                    eVar3.f312964j = 0L;
                    eVar.f312964j = j19;
                    kw2.e eVar4 = eVar.S;
                    kotlin.jvm.internal.o.d(eVar4);
                    eVar4.N = true;
                    com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#closeitem segment invalid trp:" + j19 + '-' + j28 + '-' + j27 + "  " + eVar.Q + ' ' + str);
                } else {
                    kw2.e eVar5 = eVar.S;
                    kotlin.jvm.internal.o.d(eVar5);
                    eVar5.N = true;
                    kw2.e eVar6 = eVar.S;
                    kotlin.jvm.internal.o.d(eVar6);
                    eVar6.f312964j = j28;
                    eVar.f312964j = j27;
                    com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#closeitem segment valid trp:" + j19 + '-' + j28 + '-' + j27 + "  " + eVar.Q + ' ' + str);
                }
            } else {
                j17 = j18;
                com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#closeitem " + eVar.Q + ' ' + str);
            }
            kotlin.jvm.internal.o.d(hVar2);
            yVar.c(hVar2.field_recvedBytes);
        } else {
            j17 = j18;
            if (i3Var != null) {
                dVar.d(eVar, i3Var);
                com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#closeitem " + eVar.Q + ' ' + str + " updateFromMediaCacheOnStop from " + eVar.f312964j);
            } else {
                com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#closeitem " + eVar.Q + ' ' + str + " invalid state.");
            }
        }
        boolean z17 = this.f313034h;
        if (j17 > 0) {
            eVar.f312964j += j17;
            com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#onDownloaderStop " + z17 + ' ' + eVar.Q + ' ' + str + " beforeItemSize:" + j17 + ' ' + eVar);
        } else {
            com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#onDownloaderStop " + z17 + ' ' + eVar.Q + ' ' + str + ' ' + eVar);
        }
        if (z17) {
            kw2.y.a(yVar, eVar.f312976v, this.f313035i, "handleOnPlayItemClose#" + str);
        }
        return jz5.f0.f302826a;
    }
}
