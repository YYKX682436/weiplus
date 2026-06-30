package k41;

/* loaded from: classes11.dex */
public final class g0 extends dm.u8 implements j41.u {

    /* renamed from: y1, reason: collision with root package name */
    public static final l75.e0 f303995y1 = dm.u8.initAutoDBInfo(k41.g0.class);

    /* renamed from: p1, reason: collision with root package name */
    public boolean f303996p1;

    /* renamed from: x1, reason: collision with root package name */
    public long f303997x1 = -1;

    @Override // dm.u8, l75.f0
    public l75.e0 getDBInfo() {
        return f303995y1;
    }

    public java.lang.String t0() {
        return "OpenIMKefuContact username:" + this.field_username + " nick:" + this.field_nickname + " contactId: " + this.f303997x1 + ", type: " + this.field_type + ", head:" + this.field_bigHeadImg + " smallHead: " + this.field_smallHeadImg + ", source: " + this.field_source + ", appId: " + this.field_openImAppId + ", wordingId: " + this.field_openImDescWordingId + ", customInfoDetail: " + this.field_customInfoDetailVisible + ", " + this.field_customInfoDetail + ", finderUsername: " + this.field_finderUsername + ", kfUrl: " + this.field_kfUrl + ", kfTYpe: " + this.field_kefuType;
    }

    public final com.tencent.mm.storage.z3 u0() {
        k41.o0 o0Var = k41.o0.f304031a;
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        z3Var.M1(this.field_nickname);
        z3Var.X1(this.field_username);
        z3Var.E2 = this.f303997x1;
        z3Var.P1(this.field_openImAppId);
        z3Var.C1(this.field_openImDescWordingId);
        z3Var.j3(this.field_source);
        z3Var.K2(this.field_checkTime);
        z3Var.J1 = this.field_customInfoDetail;
        z3Var.I1 = this.field_customInfoDetailVisible;
        z3Var.f236581u = true;
        z3Var.V1(this.field_ticket);
        z3Var.setType((int) this.field_type);
        return z3Var;
    }
}
