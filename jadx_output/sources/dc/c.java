package dc;

/* loaded from: classes16.dex */
public class c extends dc.j {

    /* renamed from: h, reason: collision with root package name */
    public final long f228604h;

    public c(long j17, dc.o oVar, long j18) {
        super(j17, oVar);
        this.f228604h = j18;
    }

    public java.util.List m() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ((ec.b) h()).f250928d = this.f228604h;
        for (dc.e i17 = i(); i17 != null; i17 = i17.o()) {
            for (dc.f fVar : i17.f228609n) {
                arrayList.add(new dc.b(fVar, l(fVar.f228614a)));
            }
        }
        return arrayList;
    }

    public final java.lang.String toString() {
        java.lang.String str = i().f228606h;
        long j17 = this.f228633f.f228625i.f228659f;
        long j18 = this.f228631d;
        return java.lang.String.format("%s@%d (0x%x)", str, java.lang.Long.valueOf(j17 & j18), java.lang.Long.valueOf(this.f228633f.f228625i.f228659f & j18));
    }
}
