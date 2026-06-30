package ts1;

/* loaded from: classes7.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ts1.o f421584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ts1.o oVar) {
        super(0);
        this.f421584d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ts1.o oVar = this.f421584d;
        r45.o97 a17 = ts1.o.a(oVar);
        java.lang.String str = a17 != null ? a17.f382068u : null;
        if (str != null) {
            return str;
        }
        java.lang.String str2 = oVar.f421597j;
        return str2 == null ? "" : str2;
    }
}
