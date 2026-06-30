package gf;

/* loaded from: classes7.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f271159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f271160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f271161f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f271162g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(java.lang.Integer num, int i17, float f17, float f18) {
        super(0);
        this.f271159d = num;
        this.f271160e = i17;
        this.f271161f = f17;
        this.f271162g = f18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        io.flutter.plugin.platform.SkylineTextureLogic.updateSkylineTextureScale(this.f271159d.intValue(), this.f271160e, this.f271161f, this.f271162g);
        return jz5.f0.f302826a;
    }
}
