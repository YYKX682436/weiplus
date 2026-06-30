package cz1;

/* loaded from: classes13.dex */
public class a implements cz1.b {

    /* renamed from: g, reason: collision with root package name */
    public static volatile cz1.a f224977g;

    /* renamed from: d, reason: collision with root package name */
    public final cz1.b f224978d = new com.tencent.mm.plugin.datareport.monitor.adapter.page.a();

    /* renamed from: e, reason: collision with root package name */
    public final cz1.b f224979e = new iz1.a();

    /* renamed from: f, reason: collision with root package name */
    public final cz1.b f224980f = new fz1.a();

    public static cz1.a a() {
        if (f224977g == null) {
            synchronized (cz1.a.class) {
                if (f224977g == null) {
                    f224977g = new cz1.a();
                }
            }
        }
        return f224977g;
    }
}
