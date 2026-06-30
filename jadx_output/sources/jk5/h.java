package jk5;

/* loaded from: classes13.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk5.i f300165d;

    public h(jk5.i iVar) {
        this.f300165d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f300165d.f300167e.a(jk5.c.Failed);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(583L, 4L, 1L, false);
    }
}
