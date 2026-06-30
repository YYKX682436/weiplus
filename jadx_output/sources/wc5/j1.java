package wc5;

/* loaded from: classes10.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc5.c f444587e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(java.lang.String str, uc5.c cVar) {
        super(1);
        this.f444586d = str;
        this.f444587e = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List<uc5.l0> snapshotList = (java.util.List) obj;
        kotlin.jvm.internal.o.g(snapshotList, "snapshotList");
        for (uc5.l0 l0Var : snapshotList) {
            uc5.h0 h0Var = l0Var instanceof uc5.h0 ? (uc5.h0) l0Var : null;
            if (h0Var != null) {
                uc5.d dVar = h0Var.f426494d;
                if (kotlin.jvm.internal.o.b(dVar.v(), this.f444586d)) {
                    uc5.c cVar = this.f444587e;
                    kotlin.jvm.internal.o.g(cVar, "<set-?>");
                    dVar.f426476d = cVar;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
