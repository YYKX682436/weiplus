package qp2;

/* loaded from: classes2.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp2.y f365794d;

    public o(qp2.y yVar) {
        this.f365794d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment P6 = this.f365794d.P6();
        if (P6 != null) {
            P6.y0();
        }
    }
}
