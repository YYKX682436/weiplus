package yx3;

/* loaded from: classes15.dex */
public final class j extends yx3.k {

    /* renamed from: c, reason: collision with root package name */
    public final m8.d f467908c;

    /* renamed from: d, reason: collision with root package name */
    public final q9.h f467909d;

    /* renamed from: e, reason: collision with root package name */
    public float f467910e;

    /* renamed from: f, reason: collision with root package name */
    public m8.i0 f467911f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(dk4.a mediaInfo, vx3.c soundInfo, boolean z17) {
        super(mediaInfo, soundInfo, z17);
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(soundInfo, "soundInfo");
        this.f467908c = new m8.d(com.tencent.mm.sdk.platformtools.x2.f193071a, null, 0);
        this.f467909d = new q9.h(new q9.a(new r9.p()));
        this.f467910e = 1.0f;
        pm0.v.O("MicroMsg.RingtonePlayer", new yx3.a(this, soundInfo));
    }

    @Override // yx3.k
    public void a(float f17, float f18) {
        pm0.v.O("MicroMsg.RingtonePlayer", new yx3.b(this, f17));
    }

    @Override // yx3.k
    public long b() {
        m8.i0 i0Var = this.f467911f;
        if (i0Var != null) {
            return i0Var.getCurrentPosition();
        }
        return 0L;
    }

    @Override // yx3.k
    public int c() {
        return this.f467913b.f441271b;
    }

    @Override // yx3.k
    public boolean d() {
        m8.i0 i0Var = this.f467911f;
        if (i0Var != null && i0Var.t() == 3) {
            m8.i0 i0Var2 = this.f467911f;
            if (i0Var2 != null && i0Var2.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // yx3.k
    public void e() {
        pm0.v.O("MicroMsg.RingtonePlayer", new yx3.c(this));
    }

    @Override // yx3.k
    public void f() {
        pm0.v.O("MicroMsg.RingtonePlayer", new yx3.d(this));
    }

    @Override // yx3.k
    public void g(long j17) {
        pm0.v.O("MicroMsg.RingtonePlayer", new yx3.e(this, j17));
    }

    @Override // yx3.k
    public void h() {
        pm0.v.O("MicroMsg.RingtonePlayer", new yx3.f(this));
    }

    @Override // yx3.k
    public void i(boolean z17) {
        pm0.v.O("MicroMsg.RingtonePlayer", new yx3.g(z17, this));
    }

    @Override // yx3.k
    public void j(yz5.l listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        m8.i0 i0Var = this.f467911f;
        if (i0Var != null) {
            i0Var.g(new yx3.h(listener));
        }
    }

    @Override // yx3.k
    public void k() {
        pm0.v.O("MicroMsg.RingtonePlayer", new yx3.i(this));
    }
}
