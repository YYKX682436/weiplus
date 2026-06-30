package im1;

/* loaded from: classes14.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f292212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf.s f292213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ im1.x f292214f;

    public t(im1.x xVar, java.lang.String str, yf.s sVar) {
        this.f292214f = xVar;
        this.f292212d = str;
        this.f292213e = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f292212d;
        im1.x xVar = this.f292214f;
        if (xVar.f292221c) {
            t85.f fVar = new t85.f();
            try {
                kotlin.jvm.internal.o.g(str, "<set-?>");
                fVar.f416468d = str;
                fVar.a(new org.json.JSONObject(com.tencent.mm.vfs.w6.M(str.concat("/config.json"))));
                int ordinal = this.f292213e.ordinal();
                if (ordinal == 0) {
                    long j17 = xVar.f292228j;
                    if (j17 != 0) {
                        ((p05.l4) xVar.f292220b).t(j17);
                        xVar.f292228j = 0L;
                    }
                    ((p05.l4) xVar.f292220b).s(12, true);
                    xVar.f292228j = ((p05.l4) xVar.f292220b).n(fVar);
                    ((p05.l4) xVar.f292220b).H(true);
                    return;
                }
                if (ordinal == 1) {
                    long j18 = xVar.f292229k;
                    if (j18 != 0) {
                        ((p05.l4) xVar.f292220b).t(j18);
                        xVar.f292229k = 0L;
                    }
                    ((p05.l4) xVar.f292220b).s(13, true);
                    xVar.f292229k = ((p05.l4) xVar.f292220b).n(fVar);
                    return;
                }
                if (ordinal != 2) {
                    return;
                }
                long j19 = xVar.f292227i;
                if (j19 != 0) {
                    ((p05.l4) xVar.f292220b).t(j19);
                    xVar.f292227i = 0L;
                }
                ((p05.l4) xVar.f292220b).s(11, true);
                xVar.f292227i = ((p05.l4) xVar.f292220b).n(fVar);
            } catch (java.io.IOException | org.json.JSONException unused) {
            }
        }
    }
}
