package qp2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp2.g f365766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f365767e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qp2.g gVar, r45.qt2 qt2Var) {
        super(0);
        this.f365766d = gVar;
        this.f365767e = qt2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean d17 = com.tencent.mm.plugin.finder.assist.n3.f102399a.d();
        qp2.g gVar = this.f365766d;
        gVar.f365782o = false;
        pm0.v.X(new qp2.b(d17, gVar, this.f365767e));
        return jz5.f0.f302826a;
    }
}
