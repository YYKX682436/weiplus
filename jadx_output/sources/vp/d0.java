package vp;

/* loaded from: classes16.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f438763a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.Handler f438764b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.Handler f438765c;

    /* renamed from: d, reason: collision with root package name */
    public xp.d f438766d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f438767e;

    public d0(xp.d dVar) {
        this.f438763a = "";
        this.f438766d = dVar;
        this.f438763a = dVar.f455841i + "_DanmakuMeasureManager";
    }

    public static void b(xp.d dVar, wp.a aVar) {
        if (aVar.n()) {
            return;
        }
        wp.b c17 = dVar.c(aVar).c(aVar);
        aVar.f448338i = c17.f448356a + (xp.d.f().f455848e * 2);
        aVar.f448339j = c17.f448357b + (xp.d.f().f455847d * 2);
        wp.f fVar = (wp.f) aVar;
        fVar.f448352w = false;
        fVar.G = ((int) (fVar.h() + fVar.f448338i)) / ((float) fVar.f448334e.f474913a);
    }

    public static void e(xp.d dVar, wp.a aVar, yp.o oVar) {
        if (aVar.n() || oVar == null) {
            return;
        }
        wp.b d17 = dVar.c(aVar).d(aVar, oVar);
        aVar.f448338i = d17.f448356a + (xp.d.f().f455848e * 2);
        aVar.f448339j = d17.f448357b + (xp.d.f().f455847d * 2);
        wp.f fVar = (wp.f) aVar;
        fVar.f448352w = false;
        fVar.G = ((int) (fVar.h() + fVar.f448338i)) / ((float) fVar.f448334e.f474913a);
    }

    public final android.os.Handler a() {
        if (this.f438765c == null) {
            try {
                this.f438765c = new android.os.Handler(android.os.Looper.getMainLooper());
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e(this.f438763a, th6.toString());
            }
        }
        return this.f438765c;
    }

    public void c(java.util.List list, java.lang.Boolean bool, vp.c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.f438767e == null) {
            this.f438767e = new com.tencent.mm.sdk.platformtools.n3("DanmakuPremeasure");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        if (!bool.booleanValue() || a() == null) {
            this.f438767e.post(new vp.b0(this, arrayList, c0Var));
        } else {
            a().post(new vp.a0(this, arrayList, c0Var));
        }
    }

    public void d(wp.a aVar, vp.c0 c0Var) {
        if (this.f438764b == null) {
            try {
                this.f438764b = new android.os.Handler(android.os.Looper.getMainLooper());
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e(this.f438763a, th6.toString());
            }
        }
        android.os.Handler handler = this.f438764b;
        if (handler != null) {
            handler.post(new vp.y(this, aVar, c0Var));
        }
    }
}
