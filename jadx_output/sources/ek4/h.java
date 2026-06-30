package ek4;

/* loaded from: classes12.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f253647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f253649f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f253650g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ek4.s sVar, java.lang.String str, int i17, int i18) {
        super(0);
        this.f253647d = sVar;
        this.f253648e = str;
        this.f253649f = i17;
        this.f253650g = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ek4.s sVar = this.f253647d;
        dn.o oVar = (dn.o) sVar.f253685a.get(this.f253648e);
        if (oVar != null) {
            java.lang.String str = this.f253648e;
            int i17 = this.f253649f;
            long j17 = i17;
            oVar.W1 = j17;
            dn.n nVar = oVar.f241815c2;
            if (nVar != null) {
                ek4.s.a(sVar);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback by CdnTaskController onDataAvailable mediaId:");
                sb6.append(str);
                sb6.append(" offset:");
                sb6.append(i17);
                sb6.append(" length:");
                int i18 = this.f253650g;
                sb6.append(i18);
                sb6.append(" callback:");
                sb6.append(nVar.hashCode());
                com.tencent.mars.xlog.Log.i("MicroMsg.TP.CdnTaskController", sb6.toString());
                long j18 = i18;
                nVar.onDataAvailable(str, j17, j18);
                ek4.t.b(sVar.f253689e, str, j17 + j18, -1L);
            }
        }
        return jz5.f0.f302826a;
    }
}
