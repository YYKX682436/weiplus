package d32;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d32.j f226142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f226143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f226144f;

    public f(d32.j jVar, boolean z17, yz5.a aVar) {
        this.f226142d = jVar;
        this.f226143e = z17;
        this.f226144f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d32.j jVar = this.f226142d;
        d32.k kVar = jVar.f226156i;
        if (kVar == null) {
            kotlin.jvm.internal.o.o("renderer");
            throw null;
        }
        javax.microedition.khronos.opengles.GL10 gl10 = jVar.f226155h;
        if (gl10 == null) {
            kotlin.jvm.internal.o.o("gl");
            throw null;
        }
        kVar.onSurfaceCreated(gl10, jVar.f226154g);
        d32.k kVar2 = jVar.f226156i;
        if (kVar2 == null) {
            kotlin.jvm.internal.o.o("renderer");
            throw null;
        }
        javax.microedition.khronos.opengles.GL10 gl102 = jVar.f226155h;
        if (gl102 == null) {
            kotlin.jvm.internal.o.o("gl");
            throw null;
        }
        jVar.getClass();
        jVar.getClass();
        kVar2.onSurfaceChanged(gl102, com.tencent.mapsdk.internal.km.f50100e, com.tencent.mapsdk.internal.km.f50100e);
        d32.k kVar3 = jVar.f226156i;
        if (kVar3 == null) {
            kotlin.jvm.internal.o.o("renderer");
            throw null;
        }
        kVar3.f226170i = this.f226143e;
        try {
            p05.l4 l4Var = new p05.l4(0, false, false, false, false, false, rh0.z.f395612f, null, false, 445, null);
            kVar3.f226187z = l4Var;
            l4Var.J(640, 640);
            p05.l4 l4Var2 = kVar3.f226187z;
            if (l4Var2 != null) {
                l4Var2.H(kVar3.f226170i);
            }
            p05.l4 l4Var3 = kVar3.f226187z;
            if (l4Var3 != null) {
                l4Var3.i(kVar3.f226163b);
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markSdkSegmentInitFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1012L, 45L);
        }
        yz5.a aVar = this.f226144f;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
