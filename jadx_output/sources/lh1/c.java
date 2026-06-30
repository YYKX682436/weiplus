package lh1;

/* loaded from: classes15.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam f318652b;

    /* renamed from: c, reason: collision with root package name */
    public final int f318653c;

    /* renamed from: d, reason: collision with root package name */
    public final int f318654d;

    /* renamed from: f, reason: collision with root package name */
    public lh1.b f318656f;

    /* renamed from: g, reason: collision with root package name */
    public final int f318657g;

    /* renamed from: a, reason: collision with root package name */
    public tl.w f318651a = null;

    /* renamed from: e, reason: collision with root package name */
    public long f318655e = 0;

    /* renamed from: h, reason: collision with root package name */
    public final tl.v f318658h = new lh1.a(this);

    public c(com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam) {
        this.f318653c = 0;
        this.f318654d = 0;
        this.f318657g = -1;
        recordParam = recordParam == null ? new com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam() : recordParam;
        this.f318653c = recordParam.f85836e;
        this.f318654d = recordParam.f85837f;
        this.f318657g = recordParam.f85841m;
        this.f318652b = recordParam;
    }

    public boolean a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AppBrandRecorder", com.tencent.mm.plugin.appbrand.jsapi.audio.l3.NAME);
        tl.w wVar = this.f318651a;
        boolean l17 = wVar != null ? wVar.l() : false;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f318655e -= currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AppBrandRecorder", "stop time ticket:%d, costTimeInMs:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(this.f318655e));
        return l17;
    }
}
