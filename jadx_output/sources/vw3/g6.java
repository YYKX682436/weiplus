package vw3;

/* loaded from: classes.dex */
public final class g6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUDRUI f440966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f440967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f440968f;

    public g6(com.tencent.mm.plugin.repairer.ui.RepairerUDRUI repairerUDRUI, int i17, int i18) {
        this.f440966d = repairerUDRUI;
        this.f440967e = i17;
        this.f440968f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp.a.makeText(this.f440966d.getContext(), "check fail errNo:" + this.f440967e + ",errCode:" + this.f440968f, 1).show();
    }
}
