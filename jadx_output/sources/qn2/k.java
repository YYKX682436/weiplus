package qn2;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.n f365084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f365085e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(qn2.n nVar, boolean z17) {
        super(0);
        this.f365084d = nVar;
        this.f365085e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.ht1 ht1Var;
        r45.jz1 jz1Var;
        java.util.LinkedList list;
        qn2.n nVar = this.f365084d;
        java.lang.String str = nVar.B;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load more winner finish,success:");
        boolean z17 = this.f365085e;
        sb6.append(z17);
        sb6.append(",product size:");
        r45.ht1 ht1Var2 = ((on2.z2) nVar.P0(on2.z2.class)).f347094o;
        sb6.append((ht1Var2 == null || (jz1Var = (r45.jz1) ht1Var2.getCustom(4)) == null || (list = jz1Var.getList(0)) == null) ? null : java.lang.Integer.valueOf(list.size()));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (z17 && (ht1Var = ((on2.z2) nVar.P0(on2.z2.class)).f347094o) != null) {
            nVar.C1(ht1Var);
        }
        return jz5.f0.f302826a;
    }
}
