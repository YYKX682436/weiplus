package ke5;

/* loaded from: classes9.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ke5.a f307062d;

    public c(ke5.a aVar) {
        this.f307062d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tb5.v vVar = ((tb5.y) ((tb5.m0) this.f307062d.f307041b.f460708c.a(tb5.m0.class))).f417105f;
        if (vVar.f417100q != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - vVar.f417100q;
            if (currentTimeMillis > 100) {
                vVar.f417097n.add(java.lang.Long.valueOf(currentTimeMillis));
            }
        }
        vVar.f417100q = 0L;
    }
}
