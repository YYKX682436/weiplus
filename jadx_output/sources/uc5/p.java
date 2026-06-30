package uc5;

/* loaded from: classes10.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public final ad5.l0[] f426539a = {ad5.f.f3249a, ad5.q.f3294a, ad5.e.f3244a, ad5.d.f3242a};

    public final uc5.d a(android.content.Context context, com.tencent.mm.storage.f9 msgInfo, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        uc5.d dVar = (uc5.d) c().getConstructor(com.tencent.mm.storage.f9.class).newInstance(msgInfo);
        if (z17) {
            uc5.b bVar = new uc5.b(false);
            dVar.getClass();
            dVar.f426476d = bVar;
        }
        uc5.r0 r0Var = null;
        try {
            r0Var = (uc5.r0) kotlinx.coroutines.l.f(null, new uc5.o(this, context, msgInfo, null), 1, null);
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
        }
        dVar.f426477e = r0Var;
        return dVar;
    }

    public abstract java.util.Set b();

    public abstract java.lang.Class c();

    public abstract uc5.n d();

    public abstract boolean e(oi3.g gVar);

    public abstract java.lang.Boolean f(int i17, int i18);
}
