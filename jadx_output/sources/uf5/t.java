package uf5;

/* loaded from: classes8.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf5.x f427298d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(uf5.x xVar) {
        super(2);
        this.f427298d = xVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.util.List dialogAllList = (java.util.List) obj;
        java.util.Set dialogCheckedSet = (java.util.Set) obj2;
        kotlin.jvm.internal.o.g(dialogAllList, "dialogAllList");
        kotlin.jvm.internal.o.g(dialogCheckedSet, "dialogCheckedSet");
        j75.f Q6 = this.f427298d.Q6();
        if (Q6 != null) {
            Q6.B3(new uf5.c2(dialogAllList, dialogCheckedSet));
        }
        return jz5.f0.f302826a;
    }
}
