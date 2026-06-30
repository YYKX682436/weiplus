package dz0;

/* loaded from: classes5.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f245046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f245047e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(kotlinx.coroutines.r2 r2Var, java.lang.String str, long j17) {
        super(1);
        this.f245046d = r2Var;
        this.f245047e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "callSessionSnapshotAndExportClipBundle: invokeOnCancellation");
        kotlinx.coroutines.p2.a(this.f245046d, null, 1, null);
        az0.rc.i("263", this.f245047e, null, true, 0, 20, null);
        return jz5.f0.f302826a;
    }
}
