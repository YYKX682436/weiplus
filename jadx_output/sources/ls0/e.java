package ls0;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.k f320817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f320818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f320819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f320820g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f320821h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ls0.k kVar, boolean z17, long j17, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        super(0);
        this.f320817d = kVar;
        this.f320818e = z17;
        this.f320819f = j17;
        this.f320820g = bitmap;
        this.f320821h = bitmap2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (!this.f320817d.f320868v) {
            com.tencent.mars.xlog.Log.e(this.f320817d.f320848b, "requestDraw not init now");
        } else if (!this.f320818e || this.f320817d.f320855i) {
            try {
                java.lang.String str = this.f320817d.f320848b;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                android.os.SystemClock.elapsedRealtime();
                ms0.c cVar = this.f320817d.f320847a;
                if (cVar instanceof ms0.d) {
                    kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.media.render.MixRenderer");
                    ((ms0.d) cVar).v(this.f320820g, this.f320821h);
                }
                java.lang.String str2 = this.f320817d.f320848b;
                android.os.SystemClock.elapsedRealtime();
                android.os.SystemClock.elapsedRealtime();
                ls0.k kVar = this.f320817d;
                if (kVar.f320853g != null) {
                    kVar.i(this.f320819f);
                    rs0.h hVar = this.f320817d.f320851e;
                    if (hVar != null) {
                        rs0.i.f399296a.x(hVar.f399292a, hVar.f399293b);
                    }
                    java.lang.String str3 = this.f320817d.f320848b;
                    android.os.SystemClock.elapsedRealtime();
                }
                yz5.l lVar = this.f320817d.f320852f;
                if (lVar != null) {
                    lVar.invoke(java.lang.Boolean.TRUE);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f320817d.f320848b, e17, "", new java.lang.Object[0]);
                yz5.l lVar2 = this.f320817d.f320852f;
                if (lVar2 != null) {
                    lVar2.invoke(java.lang.Boolean.FALSE);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i(this.f320817d.f320848b, "waitFistFrameAvailable and not firstFrameAvailable now, ignore");
            yz5.l lVar3 = this.f320817d.f320852f;
            if (lVar3 != null) {
                lVar3.invoke(java.lang.Boolean.TRUE);
            }
        }
        return jz5.f0.f302826a;
    }
}
