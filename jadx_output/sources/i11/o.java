package i11;

/* loaded from: classes13.dex */
public class o extends i11.t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i11.h f287138b;

    public o(i11.h hVar) {
        this.f287138b = hVar;
    }

    @Override // i11.t
    public void a(boolean z17, double d17, double d18, int i17, double d19, double d27, double d28, java.lang.String str, java.lang.String str2, int i18) {
        i11.h.a(this.f287138b, z17, d17, d18, d28, d27, false);
        if (z17) {
            i11.h hVar = this.f287138b;
            hVar.f287102k = d17;
            hVar.f287103l = d18;
            hVar.f287104m = i17;
            hVar.f287105n = d19;
            hVar.f287106o = d27;
            hVar.f287107p = d28;
            hVar.f287108q = str;
            hVar.f287109r = str2;
            hVar.f287110s = i18;
            hVar.f287101j = true;
            hVar.f287100i = false;
            hVar.f287099h = java.lang.System.currentTimeMillis();
            final i11.h hVar2 = this.f287138b;
            hVar2.f287113v = d17;
            hVar2.f287114w = d18;
            hVar2.f287115x = i17;
            hVar2.f287116y = d19;
            hVar2.f287117z = d27;
            hVar2.A = d28;
            hVar2.f287112u = java.lang.System.currentTimeMillis();
            hVar2.f287111t = true;
            ku5.u0 u0Var = ku5.t0.f312615d;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: i11.h$$a
                @Override // java.lang.Runnable
                public final void run() {
                    i11.h hVar3 = i11.h.this;
                    long j17 = hVar3.f287112u;
                    if (j17 - hVar3.B > 1000) {
                        com.tencent.mm.sdk.platformtools.o4 o4Var = hVar3.E;
                        o4Var.B("wgs84_cache_time", j17);
                        o4Var.y("wgs84_latitude", hVar3.f287113v);
                        o4Var.y("wgs84_longitude", hVar3.f287114w);
                        hVar3.B = hVar3.f287112u;
                    }
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.t(runnable, 1000L, "SaveWgs84MMKVCacheTag");
            i11.h.b(this.f287138b, 67591);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationGeo", "onGetLocationWgs84 fLongitude: %f fLatitude:%f locType:%d %f:spped", java.lang.Double.valueOf(d18), java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(i17), java.lang.Double.valueOf(d19));
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postDelayed(new i11.n(this, z17, d17, d18, i17, d19, d27, d28), 200L);
    }
}
