package urgen.ur_E2DE;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0087 J&\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0087 ¢\u0006\u0002\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0087 J#\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u000fH\u0087 J\u001b\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0087 J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0087 ¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\tH\u0087 ¢\u0006\u0002\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\tH\u0087 J$\u0010\u001a\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0087 ¢\u0006\u0002\u0010\u0016¨\u0006\u001b"}, d2 = {"Lurgen/ur_E2DE/UR_B160;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_1332", "UR_746F", "ptr", "", "keys", "", "", "(J[Ljava/lang/String;)Lcom/tencent/unit_rc/BaseObjectDef;", "UR_0F7B", "", "keyValues", "UR_DE3E", "timeout", "UR_0861", "UR_8B30", "", "(J[Ljava/lang/String;)V", "UR_DBCD", "(J)[Ljava/lang/String;", "UR_C2E7", "UR_B8ED", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UR_B160 {
    public static final urgen.ur_E2DE.UR_B160 INSTANCE = new urgen.ur_E2DE.UR_B160();

    private UR_B160() {
    }

    public static final native int UR_0861(long ptr, com.tencent.unit_rc.BaseObjectDef keyValues);

    public static final native int UR_0F7B(long ptr, com.tencent.unit_rc.BaseObjectDef keyValues);

    public static final native com.tencent.unit_rc.BaseObjectDef UR_1332();

    public static final native com.tencent.unit_rc.BaseObjectDef UR_746F(long ptr, java.lang.String[] keys);

    public static final native void UR_8B30(long ptr, java.lang.String[] keys);

    public static final native void UR_B8ED(long ptr, java.lang.String[] keys);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new y02.f();
    }

    public static final native void UR_C2E7(long ptr);

    public static final native java.lang.String[] UR_DBCD(long ptr);

    public static final native int UR_DE3E(long ptr, com.tencent.unit_rc.BaseObjectDef keyValues, int timeout);
}
