package kh;

/* loaded from: classes12.dex */
public final class d2 {

    /* renamed from: c, reason: collision with root package name */
    public static final kh.v1 f307778c = new kh.v1(null);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f307779d = jz5.h.a(jz5.i.f302829d, kh.u1.f307928d);

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f307780a = jz5.h.a(jz5.i.f302829d, kh.x1.f307941d);

    /* renamed from: b, reason: collision with root package name */
    public yz5.a f307781b;

    public final void a() {
        if (f307778c.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskProfiler", "#clearAllStats");
            b().lock(new kh.y1(this));
        }
    }

    public final com.tencent.matrix.battery.TaskProfiler$AccTaskJiffyStats b() {
        return (com.tencent.matrix.battery.TaskProfiler$AccTaskJiffyStats) this.f307780a.getValue();
    }
}
