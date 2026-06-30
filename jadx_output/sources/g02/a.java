package g02;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f267415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f267416f;

    public a(java.lang.String str, long j17, long j18) {
        this.f267414d = str;
        this.f267415e = j17;
        this.f267416f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.model.app.m k17 = com.tencent.mm.pluginsdk.model.app.w.k(this.f267414d, false);
        if (k17 == null || !k17.k()) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(860L, this.f267415e, this.f267416f, false);
    }
}
