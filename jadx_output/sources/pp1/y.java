package pp1;

/* loaded from: classes14.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f357445d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(pp1.z zVar) {
        super(1);
        this.f357445d = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList snapshotList = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(snapshotList, "snapshotList");
        snapshotList.clear();
        snapshotList.addAll(this.f357445d.f357451i);
        return jz5.f0.f302826a;
    }
}
