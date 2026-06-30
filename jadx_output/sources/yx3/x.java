package yx3;

/* loaded from: classes10.dex */
public final class x extends yx3.k {

    /* renamed from: c, reason: collision with root package name */
    public final kk4.v f467968c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(dk4.a mediaInfo, vx3.c soundInfo, boolean z17) {
        super(mediaInfo, soundInfo, z17);
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(soundInfo, "soundInfo");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f467968c = new kk4.v(context);
    }

    @Override // yx3.k
    public void a(float f17, float f18) {
        this.f467968c.K(f17);
    }

    @Override // yx3.k
    public long b() {
        return this.f467968c.o();
    }

    @Override // yx3.k
    public int c() {
        return this.f467913b.f441271b;
    }

    @Override // yx3.k
    public boolean d() {
        return this.f467968c.s();
    }

    @Override // yx3.k
    public void e() {
        kk4.b.i(this.f467968c, false, false, 3, null);
    }

    @Override // yx3.k
    public void f() {
        this.f467968c.O();
    }

    @Override // yx3.k
    public void g(long j17) {
        kk4.v vVar = this.f467968c;
        dk4.a aVar = this.f467912a;
        vVar.B(aVar);
        vVar.A(aVar.f234475l);
        vVar.f308585j = true;
        vVar.P = j17;
        vVar.F = this.f467913b.f441271b;
    }

    @Override // yx3.k
    public void h() {
        this.f467968c.recycle();
    }

    @Override // yx3.k
    public void i(boolean z17) {
        this.f467968c.C(z17);
    }

    @Override // yx3.k
    public void j(yz5.l listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f467968c.D(new yx3.w(listener));
    }

    @Override // yx3.k
    public void k() {
        this.f467968c.P();
    }
}
