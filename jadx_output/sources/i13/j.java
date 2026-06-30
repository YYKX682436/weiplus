package i13;

/* loaded from: classes8.dex */
public class j extends dm.f5 {
    public static final l75.e0 D = dm.f5.initAutoDBInfo(dm.f5.class);

    @Override // dm.f5, l75.f0
    public l75.e0 getDBInfo() {
        return D;
    }

    public java.lang.String toString() {
        return this.field_ForcePushId + " " + this.field_UserName + " " + this.field_CreateTime + " " + this.field_ExpiredTime + " " + this.field_Status;
    }
}
