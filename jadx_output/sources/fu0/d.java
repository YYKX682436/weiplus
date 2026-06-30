package fu0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im5.c f266767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nv3.f f266768e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(im5.c cVar, nv3.f fVar) {
        super(1);
        this.f266767d = cVar;
        this.f266768e = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f266767d.dead();
        this.f266768e.f340667i = null;
        return jz5.f0.f302826a;
    }
}
