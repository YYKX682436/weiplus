package nu0;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f340144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(nu0.q0 q0Var) {
        super(0);
        this.f340144d = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("ImageControlUIC", "[callbackSaveSnapshot]");
        nu0.q0 q0Var = this.f340144d;
        nu0.v vVar = q0Var.f340078u;
        if (vVar != null) {
            java.util.List snapshotList = q0Var.f340077t;
            kotlin.jvm.internal.o.g(snapshotList, "snapshotList");
            ju0.d dVar = ((nu0.c2) vVar).f339903a.f339877J;
            if (dVar == null) {
                kotlin.jvm.internal.o.o("contentImageAdapter");
                throw null;
            }
            dVar.f301682d = snapshotList;
            dVar.notifyDataSetChanged();
        }
        return jz5.f0.f302826a;
    }
}
