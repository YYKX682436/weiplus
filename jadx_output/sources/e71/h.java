package e71;

/* loaded from: classes4.dex */
public class h extends dm.y9 {
    public static final l75.e0 D = dm.y9.initAutoDBInfo(e71.h.class);

    public h() {
        this.field_uid = "0";
        this.field_name = "";
        this.field_devicetype = "";
        this.field_createtime = 0L;
        this.field_online = false;
        this.field_enableautologin = false;
        this.field_supportautologin = false;
        this.field_autologinwording = "";
        this.field_clientVersion = 0L;
    }

    @Override // dm.y9, l75.f0
    public l75.e0 getDBInfo() {
        return D;
    }

    public h(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, boolean z17, boolean z18, boolean z19, java.lang.String str4, long j18) {
        this.field_uid = str;
        this.field_name = str2;
        this.field_devicetype = str3;
        this.field_createtime = j17;
        this.field_online = z17;
        this.field_enableautologin = z18;
        this.field_supportautologin = z19;
        this.field_autologinwording = str4;
        this.field_clientVersion = j18;
    }

    public h(r45.nd4 nd4Var) {
        this.field_uid = nd4Var.f381270d;
        this.field_devicetype = nd4Var.f381272f;
        this.field_name = nd4Var.f381271e;
        this.field_createtime = nd4Var.f381273g;
        this.field_online = nd4Var.f381274h;
        this.field_enableautologin = nd4Var.f381276m;
        this.field_supportautologin = nd4Var.f381277n;
        this.field_autologinwording = nd4Var.f381278o;
        this.field_clientVersion = nd4Var.f381275i;
    }
}
