package ef0;

/* loaded from: classes3.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ef0.m2 f252273d = new ef0.m2();

    public m2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int h17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ting.RepairerConfigShakeDiscoverEntry());
        com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "tingConfig enableShakeDiscoverEntry: " + h17);
        return java.lang.Boolean.valueOf(h17 == 1);
    }
}
