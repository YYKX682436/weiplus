package qn2;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.n f365060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(qn2.n nVar) {
        super(1);
        this.f365060d = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.cz1 cz1Var;
        r45.cz1 cz1Var2;
        r45.cz1 cz1Var3;
        r45.cz1 it = (r45.cz1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        r45.ht1 ht1Var = ((on2.z2) this.f365060d.P0(on2.z2.class)).f347094o;
        java.lang.Long valueOf = ht1Var != null ? java.lang.Long.valueOf(ht1Var.getLong(5)) : null;
        r45.ht1 ht1Var2 = ((on2.z2) this.f365060d.P0(on2.z2.class)).f347094o;
        boolean z17 = true;
        java.lang.String string = (ht1Var2 == null || (cz1Var3 = (r45.cz1) ht1Var2.getCustom(1)) == null) ? null : cz1Var3.getString(0);
        km2.z zVar = ((on2.z2) this.f365060d.P0(on2.z2.class)).f347092m;
        java.lang.String string2 = (zVar == null || (cz1Var2 = zVar.f309232d) == null) ? null : cz1Var2.getString(0);
        java.lang.String string3 = it.getString(0);
        java.lang.String str = this.f365060d.B;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doneAnimCallback record:");
        java.lang.Object obj2 = ((on2.z2) this.f365060d.P0(on2.z2.class)).f347094o;
        if (obj2 == null) {
            obj2 = "";
        }
        sb6.append(pm0.b0.g(obj2));
        sb6.append(" lotteryInfo:");
        sb6.append(pm0.b0.g(it));
        sb6.append(" curRecordLiveId");
        sb6.append(valueOf);
        sb6.append(",curRecordLotteryId:");
        sb6.append(string);
        sb6.append(",callbakcId:");
        sb6.append(string3);
        sb6.append(",localId:");
        sb6.append(string2);
        sb6.append(",lottering:");
        sb6.append(this.f365060d.f365223s);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        r45.nw1 nw1Var = ((mm2.e1) this.f365060d.P0(mm2.e1.class)).f328988r;
        if (kotlin.jvm.internal.o.b(valueOf, nw1Var != null ? java.lang.Long.valueOf(nw1Var.getLong(0)) : null)) {
            if (string != null && string.length() != 0) {
                z17 = false;
            }
            if (!z17 && kotlin.jvm.internal.o.b(string, string2)) {
                qn2.n.y1(this.f365060d, it);
                return jz5.f0.f302826a;
            }
        }
        qn2.n nVar = this.f365060d;
        km2.z zVar2 = ((on2.z2) nVar.P0(on2.z2.class)).f347092m;
        if (zVar2 == null || (cz1Var = zVar2.f309232d) == null) {
            cz1Var = it;
        }
        qn2.n.z1(nVar, cz1Var);
        qn2.n nVar2 = this.f365060d;
        nVar2.u1(new qn2.e(nVar2, it));
        return jz5.f0.f302826a;
    }
}
