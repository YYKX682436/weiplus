package yi;

/* loaded from: classes15.dex */
public class d extends yi.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yi.g f462449b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yi.g gVar) {
        super(null);
        this.f462449b = gVar;
    }

    @Override // yi.j
    public void b(java.lang.String str, int i17, long j17) {
        yi.g gVar = this.f462449b;
        gVar.f462463l = i17;
        gVar.f462464m = new zi.b(new byte[i17]);
    }

    @Override // yi.j
    public yi.h c(int i17, int i18, long j17) {
        return new yi.c(this, null);
    }

    @Override // yi.j
    public void d(int i17, zi.b bVar, int i18, zi.b bVar2, int i19, long j17) {
        zi.b bVar3;
        zi.b bVar4;
        yi.g gVar = this.f462449b;
        if (gVar.f462457f == null && (bVar4 = gVar.f462456e) != null && bVar4.equals(bVar2)) {
            gVar.f462457f = bVar;
        } else if (gVar.f462461j == null && (bVar3 = gVar.f462460i) != null && bVar3.equals(bVar2)) {
            gVar.f462461j = bVar;
        }
    }

    @Override // yi.j
    public void g(zi.b bVar, java.lang.String str, int i17, long j17) {
        yi.g gVar = this.f462449b;
        if (gVar.f462456e == null && "android.graphics.Bitmap".equals(str)) {
            gVar.f462456e = bVar;
            return;
        }
        if (gVar.f462458g == null && "mBuffer".equals(str)) {
            gVar.f462458g = bVar;
            return;
        }
        if (gVar.f462459h == null && "mRecycled".equals(str)) {
            gVar.f462459h = bVar;
            return;
        }
        if (gVar.f462460i == null && "java.lang.String".equals(str)) {
            gVar.f462460i = bVar;
        } else if (gVar.f462462k == null && "value".equals(str)) {
            gVar.f462462k = bVar;
        }
    }
}
