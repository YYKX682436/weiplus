package lg0;

/* loaded from: classes10.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f318544a;

    public static void a() {
        if (f318544a) {
            return;
        }
        if (!com.tencent.mm.plugin.sight.base.i.f162416a) {
            fp.d0.o("xffmpeg");
            com.tencent.mm.plugin.sight.base.i.f162416a = true;
        }
        lg0.p.class.getClassLoader();
        fp.d0.n("voipComm");
        lg0.p.class.getClassLoader();
        fp.d0.n("voipCodec");
        f318544a = true;
    }
}
