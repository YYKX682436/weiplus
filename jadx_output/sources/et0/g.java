package et0;

/* loaded from: classes14.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et0.k f256537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f256538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f256539f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(et0.k kVar, int i17, int i18) {
        super(0);
        this.f256537d = kVar;
        this.f256538e = i17;
        this.f256539f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        et0.k kVar = this.f256537d;
        kVar.getClass();
        ms0.c cVar = kVar.f256547h;
        if (cVar != null) {
            cVar.t(this.f256538e, this.f256539f);
        }
        return jz5.f0.f302826a;
    }
}
