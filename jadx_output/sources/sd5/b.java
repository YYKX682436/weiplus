package sd5;

/* loaded from: classes9.dex */
public final class b implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public final sd5.o f406698a;

    /* renamed from: b, reason: collision with root package name */
    public final hd5.n f406699b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f406700c;

    /* renamed from: d, reason: collision with root package name */
    public final hd5.q f406701d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f406702e;

    public b(yb5.d chattingContext, sd5.o coreDataSource, hd5.n action, android.os.Bundle bundle, hd5.q qVar) {
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        kotlin.jvm.internal.o.g(coreDataSource, "coreDataSource");
        kotlin.jvm.internal.o.g(action, "action");
        this.f406698a = coreDataSource;
        this.f406699b = action;
        this.f406700c = bundle;
        this.f406701d = qVar;
        this.f406702e = chattingContext.x();
    }

    @Override // he5.t
    public int a() {
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7(this.f406702e);
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s success) {
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(success, "success");
        sd5.p.a("fillItem", new sd5.a(this, list));
        ((hd5.f) success).a();
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        if (oVar != null) {
            oVar.next();
        }
    }

    @Override // he5.t
    public void close() {
    }

    @Override // he5.t
    public long d() {
        return this.f406698a.c();
    }
}
