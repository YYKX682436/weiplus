package zv;

/* loaded from: classes11.dex */
public final class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f476052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f476053e;

    public m2(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin, long j17) {
        this.f476052d = flutterBrandEcsPlugin;
        this.f476053e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f476052d.f65189d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteMsg: delete in db msgId=");
        long j17 = this.f476053e;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        r01.q3.nj().z0(j17);
    }
}
