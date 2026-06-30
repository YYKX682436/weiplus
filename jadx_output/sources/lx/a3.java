package lx;

/* loaded from: classes11.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f321685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f321686e;

    public a3(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin, long j17) {
        this.f321685d = flutterBizPlugin;
        this.f321686e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f321685d.f65253d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteMsg: delete in db msgId=");
        long j17 = this.f321686e;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        r01.q3.nj().z0(j17);
    }
}
