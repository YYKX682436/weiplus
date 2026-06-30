package uu0;

/* loaded from: classes5.dex */
public class o {

    /* renamed from: b, reason: collision with root package name */
    public final uu0.k f431255b;

    /* renamed from: c, reason: collision with root package name */
    public final int f431256c;

    /* renamed from: d, reason: collision with root package name */
    public final int f431257d;

    /* renamed from: e, reason: collision with root package name */
    public final int f431258e;

    /* renamed from: f, reason: collision with root package name */
    public final int f431259f;

    /* renamed from: h, reason: collision with root package name */
    public uu0.n f431261h;

    /* renamed from: i, reason: collision with root package name */
    public uu0.a f431262i;

    /* renamed from: a, reason: collision with root package name */
    public tl.w f431254a = null;

    /* renamed from: g, reason: collision with root package name */
    public long f431260g = 0;

    /* renamed from: j, reason: collision with root package name */
    public final tl.v f431263j = new uu0.m(this);

    public o(uu0.k kVar) {
        kVar = kVar == null ? new uu0.k() : kVar;
        this.f431256c = kVar.f431244b;
        this.f431257d = kVar.f431245c;
        this.f431258e = kVar.f431249g;
        this.f431259f = kVar.f431251i;
        this.f431255b = kVar;
    }

    public boolean a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecorder", com.tencent.mm.plugin.appbrand.jsapi.audio.l3.NAME);
        tl.w wVar = this.f431254a;
        boolean l17 = wVar != null ? wVar.l() : false;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f431260g -= currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecorder", "stop time ticket:%d, costTimeInMs:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(this.f431260g));
        return l17;
    }
}
