package mm2;

/* loaded from: classes3.dex */
public final class c5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.e5 f328938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f328939e;

    public c5(mm2.e5 e5Var, kotlin.jvm.internal.h0 h0Var) {
        this.f328938d = e5Var;
        this.f328939e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mm2.e5 e5Var = this.f328938d;
        kotlin.jvm.internal.h0 h0Var = this.f328939e;
        synchronized (e5Var) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveMsgSpeedControlSlice", "add msg size = " + ((java.util.ArrayList) h0Var.f310123d).size());
            e5Var.f329006m.addAll((java.util.Collection) h0Var.f310123d);
            if (e5Var.f329006m.size() > e5Var.f329002f.getInteger(0)) {
                int size = e5Var.f329006m.size() - e5Var.f329002f.getInteger(0);
                com.tencent.mars.xlog.Log.i("MMFinder.LiveMsgSpeedControlSlice", "cacheSize: " + e5Var.f329006m.size() + ", reach cache limit:" + e5Var.f329002f.getInteger(0) + " del size:" + size);
                e5Var.f329006m.d(size);
            }
        }
    }
}
