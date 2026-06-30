package d23;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d23.g f225880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d23.h f225881e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d23.g gVar, d23.h hVar) {
        super(1);
        this.f225880d = gVar;
        this.f225881e = hVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        b23.a state = (b23.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof b23.c)) {
            d23.g gVar = this.f225880d;
            gVar.e(this.f225881e.getWebView(), ((b23.c) dVar).f17386b / a06.d.b(i65.a.g(gVar.f225895h)));
        }
        return jz5.f0.f302826a;
    }
}
