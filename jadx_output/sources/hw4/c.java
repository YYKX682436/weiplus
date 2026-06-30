package hw4;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hw4.a f285591e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, hw4.a aVar) {
        super(1);
        this.f285590d = str;
        this.f285591e = aVar;
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
        connection.f72046l = this.f285590d;
        hw4.a aVar = this.f285591e;
        aVar.d(connection);
        connection.f72048n = new hw4.b(aVar, connection);
        connection.a();
        return jz5.f0.f302826a;
    }
}
