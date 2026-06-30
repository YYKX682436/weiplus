package et0;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et0.k f256540d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(et0.k kVar) {
        super(0);
        this.f256540d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        et0.k kVar = this.f256540d;
        ms0.c cVar = kVar.f256547h;
        if (cVar != null) {
            ms0.c.o(cVar, false, 1, null);
        }
        kVar.f256547h = null;
        return jz5.f0.f302826a;
    }
}
