package yf;

/* loaded from: classes7.dex */
public final /* synthetic */ class i0$$p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f461397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f461398e;

    public /* synthetic */ i0$$p(yf.i0 i0Var, java.lang.String str) {
        this.f461397d = i0Var;
        this.f461398e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yf.i0 i0Var = this.f461397d;
        yf.o oVar = i0Var.f461362i;
        if (oVar == null) {
            com.tencent.mars.xlog.Log.w(i0Var.x(), "run#operate, adapter is null");
        } else {
            oVar.h(this.f461398e, null);
        }
    }
}
