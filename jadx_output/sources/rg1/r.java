package rg1;

/* loaded from: classes7.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f395232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rg1.o f395233e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String str, rg1.o oVar) {
        super(1);
        this.f395232d = str;
        this.f395233e = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.network.j2 connection = (com.tencent.mm.network.j2) obj;
        kotlin.jvm.internal.o.g(connection, "connection");
        connection.f72045k = false;
        connection.f72043i = "GET";
        connection.f72047m = true;
        connection.f72054t = true;
        connection.f72049o = 2;
        connection.f72046l = this.f395232d;
        rg1.o oVar = this.f395233e;
        ((rg1.p) oVar).getClass();
        connection.f72048n = new rg1.q(oVar, connection);
        connection.a();
        return jz5.f0.f302826a;
    }
}
