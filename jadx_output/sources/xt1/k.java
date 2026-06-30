package xt1;

/* loaded from: classes15.dex */
public class k extends dm.r1 {
    public static final l75.e0 K1 = dm.r1.initAutoDBInfo(xt1.k.class);
    public java.lang.String A1;
    public r45.pt C1;
    public r45.ju D1;
    public boolean I1;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f456509y1;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f456510z1;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f456507p1 = "";

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f456508x1 = "";
    public boolean B1 = false;
    public java.util.List E1 = null;
    public java.util.List F1 = null;
    public int G1 = 0;
    public int H1 = 0;
    public java.util.List J1 = null;

    @Override // dm.r1, l75.f0
    public l75.e0 getDBInfo() {
        return K1;
    }

    public r45.pt t0() {
        r45.pt ptVar = this.C1;
        if (ptVar != null) {
            return ptVar;
        }
        try {
            r45.pt ptVar2 = (r45.pt) new r45.pt().parseFrom(this.field_buttonData);
            this.C1 = ptVar2;
            return ptVar2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardMsgInfo", "getCardButton fail, ex = %s", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardMsgInfo", e17, "", new java.lang.Object[0]);
            return new r45.pt();
        }
    }

    public r45.ju u0() {
        r45.ju juVar = this.D1;
        if (juVar != null) {
            return juVar;
        }
        try {
            r45.ju juVar2 = (r45.ju) new r45.ju().parseFrom(this.field_operData);
            this.D1 = juVar2;
            return juVar2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardMsgInfo", "getOperationRegion fail, ex = %s", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardMsgInfo", e17, "", new java.lang.Object[0]);
            return new r45.ju();
        }
    }
}
