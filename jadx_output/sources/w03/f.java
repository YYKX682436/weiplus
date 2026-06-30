package w03;

/* loaded from: classes11.dex */
public final class f extends bj0.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w03.h f441880a;

    public f(w03.h hVar) {
        this.f441880a = hVar;
    }

    @Override // bj0.t
    public void a(bj0.u observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        w03.h hVar = this.f441880a;
        na5.b a17 = w03.h.a(hVar, observer, true);
        if (a17 != null) {
            hVar.getClass();
            java.util.ArrayList arrayList = (java.util.ArrayList) hVar.f335994d;
            if (arrayList.contains(a17)) {
                return;
            }
            arrayList.add(a17);
        }
    }
}
