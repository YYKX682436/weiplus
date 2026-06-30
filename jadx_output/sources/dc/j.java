package dc;

/* loaded from: classes16.dex */
public abstract class j {

    /* renamed from: d, reason: collision with root package name */
    public final long f228631d;

    /* renamed from: e, reason: collision with root package name */
    public long f228632e;

    /* renamed from: f, reason: collision with root package name */
    public dc.h f228633f;

    /* renamed from: g, reason: collision with root package name */
    public int f228634g;

    public j(long j17, dc.o oVar) {
        new java.util.ArrayList();
        this.f228631d = j17;
    }

    public ec.a h() {
        return this.f228633f.f228625i.f228654a;
    }

    public dc.e i() {
        return this.f228633f.f228625i.b(this.f228632e);
    }

    public int j() {
        return this.f228634g;
    }

    public long k() {
        dc.m mVar = this.f228633f.f228625i;
        dc.q qVar = dc.q.OBJECT;
        int i17 = mVar.f228658e[2];
        if (i17 == 1) {
            return ((ec.b) h()).c();
        }
        if (i17 == 2) {
            return ((ec.b) h()).f();
        }
        if (i17 == 4) {
            return ((ec.b) h()).d();
        }
        if (i17 != 8) {
            return 0L;
        }
        return ((ec.b) h()).e();
    }

    public java.lang.Object l(dc.q qVar) {
        switch (qVar.ordinal()) {
            case 0:
                return this.f228633f.f228625i.d(k());
            case 1:
                return java.lang.Boolean.valueOf(((ec.b) h()).c() != 0);
            case 2:
                ec.b bVar = (ec.b) h();
                char c17 = bVar.f250926b[bVar.a()].getChar(bVar.b());
                bVar.f250928d += 2;
                return java.lang.Character.valueOf(c17);
            case 3:
                ec.b bVar2 = (ec.b) h();
                float f17 = bVar2.f250926b[bVar2.a()].getFloat(bVar2.b());
                bVar2.f250928d += 4;
                return java.lang.Float.valueOf(f17);
            case 4:
                ec.b bVar3 = (ec.b) h();
                double d17 = bVar3.f250926b[bVar3.a()].getDouble(bVar3.b());
                bVar3.f250928d += 8;
                return java.lang.Double.valueOf(d17);
            case 5:
                return java.lang.Byte.valueOf(((ec.b) h()).c());
            case 6:
                return java.lang.Short.valueOf(((ec.b) h()).f());
            case 7:
                return java.lang.Integer.valueOf(((ec.b) h()).d());
            case 8:
                return java.lang.Long.valueOf(((ec.b) h()).e());
            default:
                return null;
        }
    }
}
