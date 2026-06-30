package qp2;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp2.g f365760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f365761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f365762f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qp2.g gVar, r45.qt2 qt2Var, boolean z17) {
        super(1);
        this.f365760d = gVar;
        this.f365761e = qt2Var;
        this.f365762f = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        az2.w wVar = (az2.w) obj;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        qp2.g gVar = this.f365760d;
        if (wVar != null) {
            com.tencent.mm.modelbase.m1 m1Var = (com.tencent.mm.modelbase.m1) wVar.f16160d;
            gVar.onSceneEnd(wVar.f16158b, wVar.f16157a, wVar.f16159c, m1Var);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            gVar.b(this.f365761e, this.f365762f, 1);
        }
        return f0Var2;
    }
}
