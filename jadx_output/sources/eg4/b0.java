package eg4;

/* loaded from: classes11.dex */
public final class b0 implements ns.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f252673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252674b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eg4.i0 f252675c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.ib f252676d;

    public b0(android.content.Context context, java.lang.String str, eg4.i0 i0Var, com.tencent.mm.storage.ib ibVar) {
        this.f252673a = context;
        this.f252674b = str;
        this.f252675c = i0Var;
        this.f252676d = ibVar;
    }

    @Override // ns.j
    public void a(boolean z17) {
        com.tencent.mm.storage.ib ibVar = this.f252676d;
        android.content.Context context = this.f252673a;
        eg4.i0 i0Var = this.f252675c;
        if (!z17) {
            eg4.i0.o(i0Var, context, ibVar);
            return;
        }
        ns.k kVar = (ns.k) i95.n0.c(ns.k.class);
        ((ms.a) kVar).Bi(context, 3, this.f252674b, new eg4.a0(i0Var, context, ibVar));
    }
}
