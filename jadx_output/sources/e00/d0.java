package e00;

/* loaded from: classes9.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.e0 f245752d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e00.e0 e0Var) {
        super(0);
        this.f245752d = e0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reqType:");
        e00.e0 e0Var = this.f245752d;
        sb6.append(e0Var.f245756a);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(sb6.toString());
        java.util.Iterator it = e0Var.f245757b.iterator();
        while (it.hasNext()) {
            sb7.append(((bw5.se0) it.next()).b() + '_');
        }
        return sb7.toString();
    }
}
