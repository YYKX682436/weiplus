package li3;

/* loaded from: classes9.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f318776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f318777e;

    public e(li3.g gVar, int i17, int i18) {
        this.f318776d = i17;
        this.f318777e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        at4.g0.e(this.f318776d);
        if (at4.g0.c() != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17162, java.lang.Integer.valueOf(this.f318777e), at4.g0.c().f384415o, at4.g0.c().f384414n, at4.g0.c().f384416p);
        }
    }
}
