package do1;

/* loaded from: classes12.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f242072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f242073e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t05.a f242074f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.storage.f9 f9Var, long j17, t05.a aVar) {
        super(1);
        this.f242072d = f9Var;
        this.f242073e = j17;
        this.f242074f = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s15.h item = (s15.h) obj;
        kotlin.jvm.internal.o.g(item, "item");
        r45.gp0 gp0Var = new r45.gp0();
        int i17 = item.f303422d;
        gp0Var.e0(item.getString(i17 + 3));
        gp0Var.h0(item.getInteger(i17 + 2));
        gp0Var.O0(item.getString(i17 + 0));
        gp0Var.i0(item.n());
        com.tencent.mm.storage.f9 f9Var = this.f242072d;
        java.lang.String H = bt3.g2.H(gp0Var, f9Var.Q0(), f9Var.getMsgId(), 1);
        long l17 = com.tencent.mm.vfs.w6.l(H);
        long j17 = this.f242073e;
        t05.a aVar = this.f242074f;
        if (l17 >= j17) {
            co1.i.b("MicroMsg.RoamBackupItemAppMsg", f9Var, java.lang.Integer.valueOf(aVar.getInteger(aVar.f368365d + 6)), H);
            return java.lang.Boolean.TRUE;
        }
        java.lang.String t17 = bt3.g2.t(gp0Var, f9Var.Q0(), f9Var.getMsgId(), 1);
        if (com.tencent.mm.vfs.w6.l(t17) < j17) {
            return java.lang.Boolean.FALSE;
        }
        co1.i.b("MicroMsg.RoamBackupItemAppMsg", f9Var, java.lang.Integer.valueOf(aVar.getInteger(aVar.f368365d + 6)), t17);
        return java.lang.Boolean.TRUE;
    }
}
