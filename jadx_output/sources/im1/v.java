package im1;

/* loaded from: classes14.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf.r f292216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f292217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ im1.x f292218f;

    public v(im1.x xVar, yf.r rVar, java.lang.String str) {
        this.f292218f = xVar;
        this.f292216d = rVar;
        this.f292217e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        im1.x xVar = this.f292218f;
        if (xVar.f292221c) {
            int ordinal = this.f292216d.ordinal();
            java.lang.String str = this.f292217e;
            if (ordinal == 0) {
                long j17 = xVar.f292230l;
                if (j17 != 0) {
                    ((p05.l4) xVar.f292220b).t(j17);
                    xVar.f292230l = 0L;
                }
                ((p05.l4) xVar.f292220b).s(14, true);
                xVar.f292230l = ((p05.l4) xVar.f292220b).m(0, str);
                return;
            }
            if (ordinal == 1) {
                long j18 = xVar.f292231m;
                if (j18 != 0) {
                    ((p05.l4) xVar.f292220b).t(j18);
                    xVar.f292231m = 0L;
                }
                ((p05.l4) xVar.f292220b).s(15, true);
                xVar.f292231m = ((p05.l4) xVar.f292220b).m(1, str);
                return;
            }
            if (ordinal == 2) {
                long j19 = xVar.f292232n;
                if (j19 != 0) {
                    ((p05.l4) xVar.f292220b).t(j19);
                    xVar.f292232n = 0L;
                }
                ((p05.l4) xVar.f292220b).s(16, true);
                xVar.f292232n = ((p05.l4) xVar.f292220b).m(2, str);
                return;
            }
            if (ordinal == 3) {
                long j27 = xVar.f292233o;
                if (j27 != 0) {
                    ((p05.l4) xVar.f292220b).t(j27);
                    xVar.f292233o = 0L;
                }
                ((p05.l4) xVar.f292220b).s(17, true);
                xVar.f292233o = ((p05.l4) xVar.f292220b).m(3, str);
                return;
            }
            if (ordinal != 4) {
                return;
            }
            long j28 = xVar.f292234p;
            if (j28 != 0) {
                ((p05.l4) xVar.f292220b).t(j28);
                xVar.f292234p = 0L;
            }
            ((p05.l4) xVar.f292220b).s(18, true);
            xVar.f292234p = ((p05.l4) xVar.f292220b).m(4, str);
        }
    }
}
