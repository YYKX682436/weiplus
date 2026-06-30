package f11;

/* loaded from: classes.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent f258549d;

    public a(f11.b bVar, com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        this.f258549d = checkResUpdateCacheFileEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(933L, 12L);
        f11.j b17 = f11.j.b();
        am.r2 r2Var = this.f258549d.f54053g;
        b17.d(r2Var.f7761c, r2Var.f7759a, r2Var.f7760b, r2Var.f7762d);
    }
}
