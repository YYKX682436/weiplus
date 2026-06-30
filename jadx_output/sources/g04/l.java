package g04;

/* loaded from: classes12.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f267469a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final int f267470b;

    public l(g04.k kVar) {
        this.f267470b = -1;
        if (kVar != null) {
            this.f267470b = kVar.f267465a;
        } else {
            this.f267470b = -1;
        }
        if (kVar == null || kVar.f267468d == null) {
            return;
        }
        for (int i17 = 0; i17 < kVar.f267468d.length; i17++) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WordDetectDetailResultWrapper", "%d ratio %f", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(kVar.f267468d[i17]));
            this.f267469a.add(java.lang.Float.valueOf(kVar.f267468d[i17]));
        }
    }
}
