package ju5;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eu5.e f302083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju5.f f302084e;

    public e(ju5.f fVar, eu5.e eVar) {
        this.f302084e = fVar;
        this.f302083d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ju5.f fVar = this.f302084e;
        eu5.b bVar = fVar.f302088a;
        if (bVar == null || fVar.f302089b) {
            return;
        }
        bVar.a(this.f302083d);
        fVar.f302089b = true;
    }
}
