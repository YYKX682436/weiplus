package ko4;

/* loaded from: classes14.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ko4.l f310071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f310072e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ko4.l lVar, android.view.Surface surface) {
        super(0);
        this.f310071d = lVar;
        this.f310072e = surface;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ko4.l lVar = this.f310071d;
        lVar.f310082c = new com.tencent.tav.decoder.RenderContext(lVar.f310083d, lVar.f310084e, this.f310072e);
        ko4.d dVar = new ko4.d();
        lVar.f310090k = dVar;
        int i17 = lVar.f310083d;
        int i18 = lVar.f310084e;
        dVar.f310049a = i17;
        dVar.f310050b = i18;
        return jz5.f0.f302826a;
    }
}
