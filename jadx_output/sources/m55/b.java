package m55;

/* loaded from: classes10.dex */
public abstract class b implements m55.c {

    /* renamed from: a, reason: collision with root package name */
    public m55.c f324324a;

    public void a() {
        m55.c cVar;
        if (b() || (cVar = this.f324324a) == null) {
            return;
        }
        ((m55.b) cVar).a();
    }

    public boolean b() {
        return false;
    }

    public java.lang.Object c(og3.d dVar, og3.e eVar, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new m55.a(this, dVar, eVar, null), continuation);
    }

    public abstract java.lang.Object d(og3.d dVar, og3.e eVar, kotlin.coroutines.Continuation continuation);

    public m55.c e(m55.c chain) {
        kotlin.jvm.internal.o.g(chain, "chain");
        m55.c cVar = this.f324324a;
        if (cVar == null) {
            this.f324324a = chain;
            return this;
        }
        if (cVar != null) {
            ((m55.b) cVar).e(chain);
        }
        return this;
    }
}
