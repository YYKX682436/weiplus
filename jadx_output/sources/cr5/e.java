package cr5;

/* loaded from: classes11.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f222020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f222021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f222022f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f222023g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f222024h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ cr5.f f222025i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.util.List list, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, kotlin.jvm.internal.f0 f0Var3, kotlin.jvm.internal.f0 f0Var4, cr5.f fVar) {
        super(0);
        this.f222020d = list;
        this.f222021e = f0Var;
        this.f222022f = f0Var2;
        this.f222023g = f0Var3;
        this.f222024h = f0Var4;
        this.f222025i = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TileDrawHelper. drawTiles. tiles=");
        sb6.append(this.f222020d.size());
        sb6.append(", insideLoadCount=");
        sb6.append(this.f222021e.f310116d);
        sb6.append(", outsideLoadCount=");
        sb6.append(this.f222022f.f310116d);
        sb6.append(", realDrawCount=");
        sb6.append(this.f222023g.f310116d);
        sb6.append(", backgroundCount=");
        sb6.append(this.f222024h.f310116d);
        sb6.append(". '");
        yq5.k kVar = this.f222025i.f222029d.f23754c.f215006o;
        sb6.append(kVar != null ? kVar.a() : null);
        sb6.append('\'');
        return sb6.toString();
    }
}
