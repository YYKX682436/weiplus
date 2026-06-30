package wc5;

/* loaded from: classes10.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f444653d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.util.HashMap hashMap) {
        super(1);
        this.f444653d = hashMap;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList<uc5.l0> snapshotList = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(snapshotList, "snapshotList");
        for (uc5.l0 l0Var : snapshotList) {
            uc5.h0 h0Var = l0Var instanceof uc5.h0 ? (uc5.h0) l0Var : null;
            if (h0Var != null) {
                uc5.d dVar = h0Var.f426494d;
                uc5.c cVar = (uc5.c) this.f444653d.get(dVar.v());
                if (cVar != null) {
                    dVar.f426476d = cVar;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
