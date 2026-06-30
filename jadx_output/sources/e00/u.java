package e00;

/* loaded from: classes9.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.v f245820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(e00.v vVar) {
        super(0);
        this.f245820d = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        e00.v vVar = this.f245820d;
        sb6.append(vVar.f245822b.y());
        sb6.append('_');
        w05.h hVar = vVar.f245822b;
        sb6.append(hVar.j());
        sb6.append('_');
        sb6.append(hVar.l());
        sb6.append('_');
        sb6.append(vVar.f245823c);
        return sb6.toString();
    }
}
