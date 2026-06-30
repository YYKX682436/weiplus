package dz4;

/* loaded from: classes12.dex */
public final class h3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.i3 f245282d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(dz4.i3 i3Var) {
        super(1);
        this.f245282d = i3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        dz4.n0 n0Var = this.f245282d.f245306b;
        if (n0Var != null) {
            n0Var.a(arrayList);
        }
        return jz5.f0.f302826a;
    }
}
