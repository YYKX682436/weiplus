package yf5;

/* loaded from: classes11.dex */
public final class s0 implements xm3.m0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.w0 f461950d;

    public s0(yf5.w0 w0Var) {
        this.f461950d = w0Var;
    }

    @Override // xm3.m0
    public void k(xm3.o0 pendingData) {
        kotlin.jvm.internal.o.g(pendingData, "pendingData");
        yf5.w0 w0Var = this.f461950d;
        com.tencent.mars.xlog.Log.i(w0Var.f461978g, "onUpdateAdapter notifyDataSetChanged");
        if (w0Var.f461979h != null) {
            w0Var.notifyDataSetChanged();
        }
    }
}
