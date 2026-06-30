package t56;

/* loaded from: classes16.dex */
public class o implements r56.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a66.e f415914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r56.a f415915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p56.s f415916f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t56.p f415917g;

    public o(t56.p pVar, a66.e eVar, r56.a aVar, p56.s sVar) {
        this.f415917g = pVar;
        this.f415914d = eVar;
        this.f415915e = aVar;
        this.f415916f = sVar;
    }

    @Override // r56.a
    public void call() {
        a66.e eVar = this.f415914d;
        if (eVar.b()) {
            return;
        }
        p56.s d17 = this.f415917g.d(this.f415915e);
        eVar.a(d17);
        if (d17.getClass() == t56.c0.class) {
            ((t56.c0) d17).f415862d.a(this.f415916f);
        }
    }
}
