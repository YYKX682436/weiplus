package dv2;

/* loaded from: classes10.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f243813d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f243814e = "";

    @Override // java.lang.Runnable
    public void run() {
        if (this.f243813d.length() == 0) {
            return;
        }
        com.tencent.wechat.aff.finder.FinderDataService.getInstance().reportMsgReadCGIAsync(this.f243814e, this.f243813d, bw5.cu.FinderPersonalMsgReadReportScene_Read, new dv2.a(this));
    }
}
