package r01;

/* loaded from: classes8.dex */
public class a0 extends dm.i1 {

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f368016x = dm.i1.initAutoDBInfo(r01.a0.class);

    public a0() {
    }

    public static boolean t0(com.tencent.mm.storage.f9 f9Var) {
        r01.a0 z07;
        if (f9Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(f9Var.Q0())) {
            if (f9Var.P1() == 2) {
                return true;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(f9Var.R1()) && r01.z.n(f9Var.Q0()) && (z07 = r01.q3.hj().z0(f9Var.R1())) != null && z07.field_kfType == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // dm.i1, l75.f0
    public l75.e0 getDBInfo() {
        return f368016x;
    }

    public a0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, long j17) {
        this.field_openId = str;
        this.field_brandUsername = str2;
        this.field_headImgUrl = str3;
        this.field_nickname = str4;
        this.field_kfType = i17;
        this.field_updateTime = j17;
    }
}
