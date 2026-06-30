package kt2;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final kt2.d f311974d = new kt2.d();

    public d() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.magicbrush.o4.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        jc3.t c57 = jc3.e0.c5((jc3.e0) c17, "MagicReward", null, 2, null);
        com.tencent.mars.xlog.Log.i("MagicRewardView", "initialize kv storage " + c57);
        return c57;
    }
}
