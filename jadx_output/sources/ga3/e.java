package ga3;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam f269845b;

    /* renamed from: c, reason: collision with root package name */
    public final int f269846c;

    /* renamed from: d, reason: collision with root package name */
    public final int f269847d;

    /* renamed from: f, reason: collision with root package name */
    public ga3.d f269849f;

    /* renamed from: g, reason: collision with root package name */
    public final int f269850g;

    /* renamed from: a, reason: collision with root package name */
    public tl.w f269844a = null;

    /* renamed from: e, reason: collision with root package name */
    public long f269848e = 0;

    /* renamed from: h, reason: collision with root package name */
    public final tl.v f269851h = new ga3.c(this);

    public e(com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam) {
        this.f269846c = 0;
        this.f269847d = 0;
        this.f269850g = -1;
        recordParam = recordParam == null ? new com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam() : recordParam;
        this.f269846c = recordParam.f85836e;
        this.f269847d = recordParam.f85837f;
        this.f269850g = recordParam.f85841m;
        this.f269845b = recordParam;
    }

    public boolean a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecorder", "LiteApp stopRecord");
        tl.w wVar = this.f269844a;
        boolean l17 = wVar != null ? wVar.l() : false;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f269848e -= currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecorder", "LiteApp stop time ticket:%d, costTimeInMs:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(this.f269848e));
        return l17;
    }
}
