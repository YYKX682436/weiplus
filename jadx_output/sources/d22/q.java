package d22;

/* loaded from: classes15.dex */
public final class q implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d22.v f225867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d22.p f225868b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f225869c;

    public q(d22.v vVar, d22.p pVar, android.content.Context context) {
        this.f225867a = vVar;
        this.f225868b = pVar;
        this.f225869c = context;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "OpenLiteApp fail");
        d22.p pVar = this.f225868b;
        if (pVar.l()) {
            pVar.k(this.f225869c, this.f225867a);
        }
    }

    @Override // q80.f0
    public boolean listenOnCreate() {
        return true;
    }

    @Override // q80.f0
    public void onCreate(long j17, java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        d22.v vVar = this.f225867a;
        java.lang.Object g17 = vVar.b().g(vVar);
        if (g17 == null) {
            return;
        }
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).dk(j17, vVar.b().c(), g17);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "OpenLiteApp success");
    }
}
