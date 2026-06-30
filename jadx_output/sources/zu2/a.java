package zu2;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu2.b f475691d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zu2.b bVar) {
        super(0);
        this.f475691d = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zu2.b bVar = this.f475691d;
        java.lang.String str = bVar.f475706d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke ecSourceReqStruct ");
        r45.vg0 vg0Var = bVar.f475707e;
        sb6.append(vg0Var != null ? vg0Var.hashCode() : 0);
        sb6.append(' ');
        r45.vg0 vg0Var2 = bVar.f475707e;
        sb6.append(pm0.v.u(vg0Var2 != null ? vg0Var2.getLong(0) : 0L));
        sb6.append(", ");
        r45.vg0 vg0Var3 = bVar.f475707e;
        sb6.append(vg0Var3 != null ? vg0Var3.getString(1) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        return bVar.f475707e;
    }
}
