package q20;

/* loaded from: classes14.dex */
public final class j implements q20.l {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f359799a = new java.util.concurrent.CopyOnWriteArrayList();

    @Override // q20.k
    public void a() {
        f(q20.c.f359792d);
    }

    @Override // q20.k
    public void b() {
        f(q20.e.f359794d);
    }

    @Override // q20.k
    public void c() {
        f(q20.a.f359790d);
    }

    @Override // q20.k
    public void d() {
        f(q20.i.f359798d);
    }

    @Override // q20.k
    public void e() {
        f(q20.b.f359791d);
    }

    public final void f(yz5.l lVar) {
        for (q20.k kVar : this.f359799a) {
            try {
                kotlin.jvm.internal.o.d(kVar);
                lVar.invoke(kVar);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // q20.k
    public void onPause() {
        f(q20.d.f359793d);
    }

    @Override // q20.k
    public void onResume() {
        f(q20.f.f359795d);
    }

    @Override // q20.k
    public void onStart() {
        f(q20.g.f359796d);
    }

    @Override // q20.k
    public void onStop() {
        f(q20.h.f359797d);
    }
}
