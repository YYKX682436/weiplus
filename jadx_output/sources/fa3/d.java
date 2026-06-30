package fa3;

/* loaded from: classes10.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.g f260753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fa3.b f260754f;

    public d(fa3.b bVar, java.lang.String str, com.tencent.mm.plugin.lite.api.g gVar) {
        this.f260754f = bVar;
        this.f260752d = str;
        this.f260753e = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        try {
            str = fa3.t.b(this.f260752d);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppCameraManager", "stopRecord, remux failed, callback with origin videoexp = %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            str = null;
        }
        ik1.h0.b(new fa3.c(this, str));
    }
}
