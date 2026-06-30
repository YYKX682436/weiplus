package ts1;

/* loaded from: classes7.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ts1.o f421578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ts1.o oVar) {
        super(0);
        this.f421578d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.m83 m83Var;
        com.tencent.mm.protobuf.g gVar;
        ts1.o oVar = this.f421578d;
        nu4.a aVar = oVar.f421595h;
        if (aVar != null && (m83Var = aVar.f340234b) != null && (gVar = m83Var.f380237n) != null) {
            return gVar;
        }
        r45.o97 a17 = ts1.o.a(oVar);
        if (a17 != null) {
            return a17.f382069v;
        }
        return null;
    }
}
