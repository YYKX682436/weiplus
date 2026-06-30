package s01;

/* loaded from: classes9.dex */
public class a0 extends dm.a1 {
    public static final l75.e0 F = dm.a1.initAutoDBInfo(s01.a0.class);

    @Override // dm.a1, l75.f0
    public l75.e0 getDBInfo() {
        return F;
    }

    public boolean t0(int i17) {
        return (i17 & this.field_bitFlag) != 0;
    }

    public boolean u0() {
        if (this.field_needToUpdate) {
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.field_profileUrl) && com.tencent.mm.sdk.platformtools.t8.K0(this.field_headImageUrl)) {
            return true;
        }
        return com.tencent.mm.sdk.platformtools.t8.K0(this.field_userNamePY) && !com.tencent.mm.sdk.platformtools.t8.K0(this.field_userName);
    }
}
