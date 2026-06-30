package s65;

/* loaded from: classes11.dex */
public class z extends com.tencent.mm.sandbox.monitor.l {

    /* renamed from: g, reason: collision with root package name */
    public int f403560g;

    /* renamed from: h, reason: collision with root package name */
    public int f403561h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String[] f403562i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f403563j;

    /* renamed from: k, reason: collision with root package name */
    public final int f403564k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f403565l;

    /* renamed from: m, reason: collision with root package name */
    public q65.b f403566m;

    /* renamed from: n, reason: collision with root package name */
    public s65.y f403567n;

    /* renamed from: o, reason: collision with root package name */
    public final q65.b f403568o;

    public z(int i17, java.lang.String str, int i18, int i19, byte[] bArr, byte[] bArr2, byte[] bArr3, java.lang.String[] strArr, boolean z17) {
        super(i17, str, i18, z17);
        this.f403560g = 0;
        this.f403561h = 0;
        this.f403567n = null;
        this.f403568o = new s65.x(this);
        this.f403562i = strArr;
        if (strArr == null || strArr.length == 0) {
            this.f403562i = new java.lang.String[]{com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyk)};
        }
        this.f403564k = i19;
        this.f403563j = bArr;
        this.f403565l = bArr2;
    }

    @Override // q65.c
    public void a(q65.b bVar) {
        this.f403566m = bVar;
        int i17 = this.f403560g + 1;
        this.f403560g = i17;
        if (i17 > 1000) {
            bVar.d(-1, -1, null);
            return;
        }
        if (!fp.i.c(this.f192298b)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetUpdatePack", "SDCard full, packSize=[%s]", java.lang.Integer.valueOf(this.f192298b));
            bVar.d(-1, -1, null);
            return;
        }
        r45.xp3 xp3Var = new r45.xp3();
        r45.he heVar = new r45.he();
        heVar.f376080g = o45.wf.f343029g;
        heVar.f376082i = 0;
        heVar.f376078e = this.f403564k;
        com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(wo.w0.k().getBytes());
        heVar.f376079f = b17;
        if (b17.f192156a.length >= 16) {
            b17.f(16);
            heVar.f376079f = b17;
        }
        com.tencent.mm.protobuf.g b18 = com.tencent.mm.protobuf.g.b(wo.q.f447780a.getBytes());
        heVar.f376081h = b18;
        if (b18.f192156a.length >= 132) {
            b18.f(132);
            heVar.f376081h = b18;
        }
        try {
            heVar.f376077d = com.tencent.mm.protobuf.g.a(new java.lang.String("\u0000"), com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetUpdatePack", e17.getLocalizedMessage());
        }
        xp3Var.setBaseRequest(heVar);
        xp3Var.f390308d = this.f192297a;
        xp3Var.f390310f = this.f192299c;
        xp3Var.f390309e = this.f192298b;
        s65.y yVar = new s65.y(this, this.f403562i[this.f403561h / 5], this.f403568o);
        this.f403567n = yVar;
        yVar.execute(xp3Var);
    }

    @Override // q65.c
    public void cancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetUpdatePack", "do cancel, updateType = " + this.f192297a);
        s65.y yVar = this.f403567n;
        if (yVar == null || yVar.isCancelled()) {
            return;
        }
        this.f403567n.cancel(true);
    }
}
