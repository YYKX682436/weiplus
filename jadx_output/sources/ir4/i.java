package ir4;

/* loaded from: classes11.dex */
public final class i implements hr4.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ir4.k f294269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294270b;

    public i(ir4.k kVar, java.lang.String str) {
        this.f294269a = kVar;
        this.f294270b = str;
    }

    @Override // hr4.q
    public void a(boolean z17, kr4.e eVar) {
        if (!z17 || eVar == null) {
            return;
        }
        vo0.d dVar = ir4.o.f294280a;
        wo0.c a17 = ir4.o.f294280a.a(new ir4.e(eVar.field_avatar));
        ir4.h hVar = new ir4.h(this.f294269a, this.f294270b);
        a17.getClass();
        a17.f447873d = hVar;
        a17.a();
    }

    @Override // hr4.q
    public void b() {
    }
}
