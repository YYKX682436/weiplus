package qp2;

/* loaded from: classes2.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp2.y f365796d;

    public q(qp2.y yVar) {
        this.f365796d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment P6 = this.f365796d.P6();
        if (P6 != null) {
            P6.z0();
        }
    }
}
