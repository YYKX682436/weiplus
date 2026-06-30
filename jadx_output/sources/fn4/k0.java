package fn4;

/* loaded from: classes15.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f264567a;

    /* renamed from: b, reason: collision with root package name */
    public pm4.s f264568b;

    /* renamed from: c, reason: collision with root package name */
    public int f264569c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.network.r0 f264570d;

    public k0() {
        fn4.j0 j0Var = new fn4.j0(this);
        this.f264570d = j0Var;
        this.f264567a = false;
        this.f264569c = a();
        gm0.j1.n().a(j0Var);
    }

    public final int a() {
        if (com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 1 : 2;
        }
        return 0;
    }

    public boolean b() {
        return this.f264569c != 0;
    }
}
