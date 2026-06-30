package cr0;

/* loaded from: classes12.dex */
public final class k3 implements kh.e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final cr0.k3 f221666a = new cr0.k3();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f221667b = jz5.h.a(jz5.i.f302829d, cr0.g3.f221631d);

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.matrix.battery.NetSceneProfiler$AccCgiStats f221668c = new com.tencent.mm.matrix.battery.NetSceneProfiler$AccCgiStats();

    public final boolean a() {
        return ((java.lang.Boolean) f221667b.getValue()).booleanValue();
    }

    @Override // kh.e2
    public void d() {
        a();
    }

    @Override // kh.e2
    public void f() {
        if (a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTrackerDelegate", "#clearStats");
            f221668c.lock(cr0.f3.f221625d);
        }
    }
}
