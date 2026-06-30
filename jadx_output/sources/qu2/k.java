package qu2;

/* loaded from: classes12.dex */
public final class k implements ts5.d {

    /* renamed from: a, reason: collision with root package name */
    public final ts5.a f366788a;

    /* renamed from: b, reason: collision with root package name */
    public kotlinx.coroutines.r2 f366789b;

    /* renamed from: c, reason: collision with root package name */
    public ts5.b f366790c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f366791d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f366792e;

    public k(ts5.a collectWhat) {
        kotlin.jvm.internal.o.g(collectWhat, "collectWhat");
        this.f366788a = collectWhat;
    }

    @Override // ts5.d
    public void a(java.util.Map map) {
        if (this.f366791d && !this.f366792e) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310568a, null, new qu2.j(this, null), 2, null);
        }
    }

    @Override // ts5.d
    public void cancel() {
        this.f366792e = true;
        kotlinx.coroutines.r2 r2Var = this.f366789b;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        ts5.b bVar = this.f366790c;
        if (bVar != null) {
            ou2.c cVar = (ou2.c) bVar;
            ou2.d dVar = cVar.f348929b;
            dVar.getClass();
            ts5.p uniqueTag = cVar.f348928a;
            kotlin.jvm.internal.o.g(uniqueTag, "uniqueTag");
            if (uniqueTag.f421741a.f421731d || ou2.a.a(ou2.d.f348931d)) {
                ou2.e eVar = dVar.f348932a;
                eVar.getClass();
                eVar.f348936b.remove(uniqueTag);
            }
        }
    }

    @Override // ts5.d
    public void start() {
        if (this.f366791d) {
            return;
        }
        this.f366791d = true;
        this.f366789b = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310568a, null, new qu2.i(this, null), 2, null);
    }
}
