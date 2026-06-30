package w0;

/* loaded from: classes14.dex */
public final class m implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0.l f441845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0.p f441846b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f441847c;

    public m(w0.l lVar, w0.p pVar, java.lang.Object obj) {
        this.f441845a = lVar;
        this.f441846b = pVar;
        this.f441847c = obj;
    }

    @Override // n0.a2
    public void dispose() {
        w0.p pVar = this.f441846b;
        java.util.Map map = pVar.f441856a;
        w0.l lVar = this.f441845a;
        lVar.getClass();
        kotlin.jvm.internal.o.g(map, "map");
        if (lVar.f441843b) {
            map.put(lVar.f441842a, ((w0.u) lVar.f441844c).a());
        }
        pVar.f441857b.remove(this.f441847c);
    }
}
