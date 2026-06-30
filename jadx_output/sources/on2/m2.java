package on2;

/* loaded from: classes3.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.z2 f346970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(on2.z2 z2Var) {
        super(0);
        this.f346970d = z2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        on2.z2 z2Var = this.f346970d;
        java.util.LinkedList linkedList = z2Var.f347091i;
        if (linkedList != null) {
            linkedList.clear();
        }
        z2Var.f347091i = new java.util.LinkedList();
        return jz5.f0.f302826a;
    }
}
