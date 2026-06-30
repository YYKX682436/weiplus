package ek4;

/* loaded from: classes12.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f253654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f253656f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f253657g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CdnManager.VideoInfo f253658h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ek4.s sVar, java.lang.String str, int i17, int i18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        super(0);
        this.f253654d = sVar;
        this.f253655e = str;
        this.f253656f = i17;
        this.f253657g = i18;
        this.f253658h = videoInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ek4.s sVar = this.f253654d;
        dn.o oVar = (dn.o) sVar.f253685a.get(this.f253655e);
        if (oVar != null) {
            java.lang.String str = this.f253655e;
            com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo = this.f253658h;
            int i17 = this.f253656f;
            long j17 = i17;
            oVar.W1 = j17;
            dn.n nVar = oVar.f241815c2;
            if (nVar != null) {
                ek4.s.a(sVar);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback by CdnTaskController onMoovReady mediaId:");
                sb6.append(str);
                sb6.append(" offset:");
                sb6.append(i17);
                sb6.append(" length:");
                int i18 = this.f253657g;
                sb6.append(i18);
                com.tencent.mars.xlog.Log.i("MicroMsg.TP.CdnTaskController", sb6.toString());
                nVar.onMoovReady(str, j17, i18, videoInfo);
            }
        }
        return jz5.f0.f302826a;
    }
}
