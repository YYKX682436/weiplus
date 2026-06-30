package e00;

/* loaded from: classes9.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.b0 f245737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(e00.b0 b0Var) {
        super(0);
        this.f245737d = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reqType:");
        e00.b0 b0Var = this.f245737d;
        sb6.append(b0Var.f245740a);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(sb6.toString());
        for (bw5.ne0 requestInfo : b0Var.f245741b) {
            kotlin.jvm.internal.o.g(requestInfo, "requestInfo");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(requestInfo.f30652d);
            sb8.append('_');
            sb8.append(requestInfo.f30659n[5] ? requestInfo.f30656h : "");
            sb7.append(sb8.toString() + '/');
        }
        return sb7.toString();
    }
}
