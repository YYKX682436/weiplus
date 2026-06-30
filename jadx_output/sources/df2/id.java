package df2;

/* loaded from: classes3.dex */
public final class id implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.od f230390a;

    public id(df2.od odVar) {
        this.f230390a = odVar;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e(this.f230390a.f230953m, "startLiteApp failed");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i(this.f230390a.f230953m, "startLiteApp success");
    }
}
