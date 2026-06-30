package wl4;

/* loaded from: classes11.dex */
public final class h extends sl4.g {
    public final rl4.c A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(rl4.c playAppConfig) {
        super(playAppConfig.b());
        kotlin.jvm.internal.o.g(playAppConfig, "playAppConfig");
        this.A = playAppConfig;
    }

    @Override // sl4.a
    public void a() {
        this.A.a();
    }

    @Override // sl4.g, sl4.a
    public void f(com.tencent.unit_rc.WeakPtr weakPtr) {
        super.f(weakPtr);
    }

    @Override // sl4.g
    public bl4.a f0() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new com.tencent.mm.plugin.ting.playapp.custom.TingCustomFlotBallView(context);
    }

    @Override // sl4.g
    public java.lang.String g0() {
        return this.A.e();
    }

    @Override // sl4.g
    public int h0() {
        return this.A.c();
    }

    @Override // sl4.g
    public boolean l0() {
        return this.A.b() != bw5.eq0.StandAlone;
    }

    @Override // sl4.g
    public boolean m0() {
        return this.A.d();
    }
}
