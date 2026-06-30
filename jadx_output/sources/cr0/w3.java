package cr0;

/* loaded from: classes12.dex */
public final class w3 implements kh.e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final cr0.w3 f221800a = new cr0.w3();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f221801b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f221802c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f221803d;

    static {
        jz5.i iVar = jz5.i.f302829d;
        f221801b = jz5.h.a(iVar, cr0.q3.f221722d);
        f221802c = jz5.h.a(iVar, cr0.o3.f221700d);
        f221803d = mm.o.j(false, 1, null);
    }

    public final com.tencent.mm.matrix.battery.AccNetworkStats a() {
        return (com.tencent.mm.matrix.battery.AccNetworkStats) f221802c.getValue();
    }

    public boolean b() {
        return ((java.lang.Boolean) f221801b.getValue()).booleanValue();
    }

    @Override // kh.e2
    public void d() {
        b();
    }

    @Override // kh.e2
    public void f() {
        if (b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetworkTracker", "#clearStats");
            a().lock(cr0.p3.f221709d);
        }
    }
}
