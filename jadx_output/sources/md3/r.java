package md3;

/* loaded from: classes7.dex */
public final class r implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ md3.s f325860a;

    public r(md3.s sVar) {
        this.f325860a = sVar;
    }

    @Override // q80.f0
    public void fail() {
        md3.s sVar = this.f325860a;
        com.tencent.mars.xlog.Log.i(sVar.f325861f, "openLiteApp fail!");
        sVar.s().invoke(sVar.h(1, "openLiteApp fail"));
    }

    @Override // q80.f0
    public void success() {
        md3.s sVar = this.f325860a;
        com.tencent.mars.xlog.Log.i(sVar.f325861f, "openLiteApp success!");
        sVar.s().invoke(sVar.k());
    }
}
