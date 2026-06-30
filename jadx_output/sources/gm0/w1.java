package gm0;

/* loaded from: classes12.dex */
public class w1 implements pq5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gm0.y1 f273284a;

    public w1(gm0.y1 y1Var) {
        this.f273284a = y1Var;
    }

    @Override // pq5.b
    public void a(java.lang.Object obj) {
        hm0.t tVar = (hm0.t) obj;
        tVar.getClass();
        tVar.b();
        gm0.y1 y1Var = this.f273284a;
        if (y1Var.f273293f) {
            fm5.b bVar = new fm5.b(tVar, y1Var);
            synchronized (y1Var) {
                y1Var.f264181d.remove(bVar);
            }
        }
    }
}
