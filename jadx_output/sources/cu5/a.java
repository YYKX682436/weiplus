package cu5;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f222480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju5.h f222481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eu5.b f222482f;

    public a(android.content.Context context, ju5.h hVar, eu5.b bVar) {
        this.f222480d = context;
        this.f222481e = hVar;
        this.f222482f = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ju5.n0 n0Var = new ju5.n0(this.f222480d, this.f222481e);
        n0Var.f302088a = this.f222482f;
        if (ju5.n.c().a(n0Var, new eu5.d())) {
            return;
        }
        zt5.h.b("Soter.SoterWrapperApi", "soter: add init task failed.", new java.lang.Object[0]);
    }
}
