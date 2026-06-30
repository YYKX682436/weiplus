package km1;

/* loaded from: classes7.dex */
public final class m implements gh.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MagicBrush f309015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km1.s f309016b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f309017c;

    public m(com.tencent.magicbrush.MagicBrush magicBrush, km1.s sVar, yz5.l lVar) {
        this.f309015a = magicBrush;
        this.f309016b = sVar;
        this.f309017c = lVar;
    }

    @Override // gh.w
    public void onPrepared() {
        this.f309015a.f48583g.k(new km1.l(this.f309016b, this.f309017c), false);
    }
}
