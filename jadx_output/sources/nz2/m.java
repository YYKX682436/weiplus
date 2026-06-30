package nz2;

/* loaded from: classes9.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nz2.b f341564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nz2.f f341565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nz2.n f341566f;

    public m(nz2.n nVar, nz2.b bVar, nz2.f fVar) {
        this.f341566f = nVar;
        this.f341564d = bVar;
        this.f341565e = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr;
        int i17;
        mb.e c17 = this.f341566f.c();
        nz2.f fVar = this.f341565e;
        nz2.b bVar = this.f341564d;
        if (c17 == null) {
            if (bVar != null) {
                bVar.a(nz2.c.a(fVar.f341555c, -1, -1, -1, -1));
                return;
            }
            return;
        }
        mb.g gVar = c17.f325281b;
        mb.j jVar = c17.f325280a;
        try {
            iArr = ((mb.h) jVar).e(gVar);
        } catch (android.os.RemoteException unused) {
            iArr = new int[0];
        }
        nz2.l lVar = new nz2.l(this);
        if (iArr != null) {
            c17.f325283d = lVar;
            c17.f325284e = 0;
            try {
                i17 = ((mb.h) jVar).j(gVar, iArr, null);
            } catch (android.os.RemoteException unused2) {
            }
            if (i17 != 0 || bVar == null) {
            }
            bVar.a(nz2.c.a(fVar.f341555c, -1, -1, -1, -1));
            return;
        }
        i17 = -1;
        if (i17 != 0) {
        }
    }
}
