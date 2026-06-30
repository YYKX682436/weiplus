package eg4;

/* loaded from: classes11.dex */
public final class h implements ns.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f252717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y35.r f252718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eg4.t f252719c;

    public h(android.content.Context context, y35.r rVar, eg4.t tVar) {
        this.f252717a = context;
        this.f252718b = rVar;
        this.f252719c = tVar;
    }

    @Override // ns.j
    public void a(boolean z17) {
        y35.r rVar = this.f252718b;
        android.content.Context context = this.f252717a;
        eg4.t tVar = this.f252719c;
        if (!z17) {
            eg4.t.n(tVar, context, rVar);
            return;
        }
        ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Bi(context, 1, rVar.f459232a, new eg4.g(tVar, context, rVar));
    }
}
