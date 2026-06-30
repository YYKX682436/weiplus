package n;

/* loaded from: classes15.dex */
public class k extends n3.d2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f333414a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f333415b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n.l f333416c;

    public k(n.l lVar) {
        this.f333416c = lVar;
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        int i17 = this.f333415b + 1;
        this.f333415b = i17;
        n.l lVar = this.f333416c;
        if (i17 == lVar.f333417a.size()) {
            n3.c2 c2Var = lVar.f333420d;
            if (c2Var != null) {
                c2Var.b(null);
            }
            this.f333415b = 0;
            this.f333414a = false;
            lVar.f333421e = false;
        }
    }

    @Override // n3.d2, n3.c2
    public void c(android.view.View view) {
        if (this.f333414a) {
            return;
        }
        this.f333414a = true;
        n3.c2 c2Var = this.f333416c.f333420d;
        if (c2Var != null) {
            c2Var.c(null);
        }
    }
}
