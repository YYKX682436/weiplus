package jk5;

/* loaded from: classes13.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk5.i f300164d;

    public g(jk5.i iVar) {
        this.f300164d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f300164d.f300167e.a(jk5.c.Finished);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(583L, 1L, 1L, false);
    }
}
