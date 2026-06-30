package u81;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f425440d;

    public k(u81.f0 f0Var) {
        this.f425440d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        u81.f0 f0Var = this.f425440d;
        for (k75.c cVar : f0Var.f425421s) {
            f0Var.c(cVar);
        }
        for (k75.c cVar2 : f0Var.f425422t) {
            f0Var.c(cVar2);
        }
        f0Var.c(f0Var.f425414i);
        f0Var.m(f0Var.f425414i);
        k75.j jVar = f0Var.f304847e;
        if (jVar == null) {
            return;
        }
        jVar.f304831b = true;
    }
}
