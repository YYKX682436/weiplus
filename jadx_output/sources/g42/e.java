package g42;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s42.b f268719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g42.f f268720e;

    public e(g42.f fVar, s42.b bVar) {
        this.f268720e = fVar;
        this.f268719d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        s42.b bVar = this.f268719d;
        if (bVar.f402937g == 0) {
            n42.a aVar = this.f268720e.f268727m;
            java.lang.String str = bVar.f402931a;
            if (u46.l.e(str)) {
                aVar.getClass();
                return;
            }
            synchronized (aVar.f334902a) {
                ((java.util.HashMap) aVar.f334902a).remove(str);
                aVar.a();
            }
        }
    }
}
