package im1;

/* loaded from: classes14.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf.q f292205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f292206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f292207f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ im1.x f292208g;

    public r(im1.x xVar, yf.q qVar, int i17, float f17) {
        this.f292208g = xVar;
        this.f292205d = qVar;
        this.f292206e = i17;
        this.f292207f = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        im1.x xVar = this.f292208g;
        if (xVar.f292221c) {
            int ordinal = this.f292205d.ordinal();
            float f17 = this.f292207f;
            int i17 = this.f292206e;
            if (ordinal == 0) {
                ((p05.l4) xVar.f292220b).D(3, i17);
                xVar.f292222d = f17;
                return;
            }
            if (ordinal == 1) {
                ((p05.l4) xVar.f292220b).D(0, i17);
                xVar.f292223e = f17;
            } else if (ordinal == 2) {
                ((p05.l4) xVar.f292220b).D(2, i17 * 2);
                xVar.f292224f = f17 * 2.0f;
            } else {
                if (ordinal != 3) {
                    return;
                }
                ((p05.l4) xVar.f292220b).D(1, i17);
                xVar.f292225g = f17;
            }
        }
    }
}
