package wc5;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f444642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.util.ArrayList arrayList) {
        super(1);
        this.f444642d = arrayList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList snapshotList = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(snapshotList, "snapshotList");
        snapshotList.clear();
        snapshotList.addAll(this.f444642d);
        return jz5.f0.f302826a;
    }
}
