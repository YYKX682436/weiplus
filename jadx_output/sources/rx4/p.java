package rx4;

/* loaded from: classes8.dex */
public final class p implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rx4.s f401246a;

    public p(rx4.s sVar) {
        this.f401246a = sVar;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e(this.f401246a.f401259d, "jumpToLiteApp failed");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i(this.f401246a.f401259d, "jumpToLiteApp success");
    }
}
