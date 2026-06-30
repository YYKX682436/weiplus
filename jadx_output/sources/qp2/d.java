package qp2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp2.g f365768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f365769e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qp2.g gVar, r45.qt2 qt2Var) {
        super(0);
        this.f365768d = gVar;
        this.f365769e = qt2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qp2.g gVar = this.f365768d;
        if (!gVar.f365782o) {
            gVar.f365782o = true;
            pm0.v.L("LbsPresenter_requestLbs", true, new qp2.c(gVar, this.f365769e));
        }
        return jz5.f0.f302826a;
    }
}
