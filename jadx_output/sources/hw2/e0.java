package hw2;

/* loaded from: classes10.dex */
public final class e0 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f285525d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f285526e;

    public e0(ju3.d0 status) {
        kotlin.jvm.internal.o.g(status, "status");
        this.f285525d = new java.util.ArrayList();
        this.f285526e = new java.util.ArrayList();
    }

    public final void a() {
        java.util.ArrayList arrayList = this.f285525d;
        if (!arrayList.isEmpty()) {
            java.lang.String str = (java.lang.String) kz5.n0.i0(arrayList);
            arrayList.remove(arrayList.size() - 1);
            dw3.c0.f244182a.j(str);
        }
        java.util.ArrayList arrayList2 = this.f285526e;
        if (!arrayList2.isEmpty()) {
            arrayList2.remove(arrayList2.size() - 1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderSubVideoFilePlugin", "current file list size:" + arrayList.size());
    }

    @Override // yt3.r2
    public void release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderSubVideoFilePlugin", "release");
        ((ku5.t0) ku5.t0.f312615d).g(new hw2.d0(this));
    }
}
