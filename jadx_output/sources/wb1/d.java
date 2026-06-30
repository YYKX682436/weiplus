package wb1;

/* loaded from: classes7.dex */
public final class d implements gh.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wb1.h f444361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MagicBrush f444362b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f444363c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f444364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f444365e;

    public d(wb1.h hVar, com.tencent.magicbrush.MagicBrush magicBrush, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var) {
        this.f444361a = hVar;
        this.f444362b = magicBrush;
        this.f444363c = lVar;
        this.f444364d = i17;
        this.f444365e = k0Var;
    }

    @Override // gh.w
    public void onPrepared() {
        if (this.f444361a.f444384s) {
            return;
        }
        this.f444362b.f48583g.k(new wb1.c(this.f444363c, this.f444364d, this.f444365e), false);
    }
}
