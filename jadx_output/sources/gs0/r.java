package gs0;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f275011a;

    /* renamed from: b, reason: collision with root package name */
    public ru5.i f275012b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f275014d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f275015e;

    /* renamed from: g, reason: collision with root package name */
    public int f275017g;

    /* renamed from: h, reason: collision with root package name */
    public int f275018h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f275019i;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f275013c = new com.tencent.mm.sdk.platformtools.n3("X264TransEncoder_writeDataThread");

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f275016f = new java.lang.Object();

    public r(int i17, int i18, int i19) {
        this.f275011a = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.X264TransEncoder", "create X264TransEncoder, width:" + i18 + ", height:" + i19);
    }

    public final void a() {
        this.f275014d = false;
        this.f275015e = false;
        this.f275017g = 0;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.sight.base.SightVideoJNI.setRotateForBufId(this.f275011a, 0);
        ru5.j jVar = ru5.g.f399797i;
        ru5.i iVar = new ru5.i(ru5.g.f399799k);
        iVar.f399801b = ru5.g.f399797i;
        gs0.q qVar = new gs0.q(this);
        ru5.i iVar2 = new ru5.i();
        iVar2.f399801b = iVar.e();
        iVar2.f399803d = iVar;
        iVar.f399804e = iVar2;
        iVar.f399802c = qVar;
        this.f275012b = iVar2;
        this.f275019i = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.X264TransEncoder", "start");
    }
}
