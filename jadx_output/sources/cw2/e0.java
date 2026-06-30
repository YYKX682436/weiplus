package cw2;

/* loaded from: classes15.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final kk4.c f223659a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f223660b;

    /* renamed from: c, reason: collision with root package name */
    public cw2.w9 f223661c;

    /* renamed from: d, reason: collision with root package name */
    public final int f223662d;

    /* renamed from: e, reason: collision with root package name */
    public final int f223663e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f223664f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f223665g;

    /* renamed from: h, reason: collision with root package name */
    public int f223666h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f223667i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f223668j;

    /* renamed from: k, reason: collision with root package name */
    public so2.i3 f223669k;

    public e0(kk4.c player, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy proxy) {
        kotlin.jvm.internal.o.g(player, "player");
        kotlin.jvm.internal.o.g(proxy, "proxy");
        this.f223659a = player;
        this.f223660b = proxy;
        this.f223662d = 10000;
        this.f223663e = 15000;
        this.f223667i = "";
        this.f223662d = ((c61.l7) i95.n0.c(c61.l7.class)).ek().A * 1000;
        this.f223663e = ((c61.l7) i95.n0.c(c61.l7.class)).ek().f464708y * 1000;
    }

    public final long a() {
        kk4.c cVar = this.f223659a;
        return ((kk4.f0) cVar).getPlayerBufferedDurationMs() - ((kk4.f0) cVar).getCurrentPositionMs();
    }

    public final java.lang.String b() {
        return this.f223667i + ".FinderBufferProgressConsumer";
    }

    public final boolean c(cw2.wa waVar) {
        float a17 = (float) a();
        float f17 = this.f223662d;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return a17 >= f17 * (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Jf).getValue()).r()).booleanValue() ? this.f223660b.getPlaySpeedRatio() : 1.0f);
    }
}
