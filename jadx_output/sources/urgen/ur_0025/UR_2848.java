package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u001b\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0087 J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\tH\u0087 ¢\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0087 J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0087 J#\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0087 J\u0019\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0087 J\u0011\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\tH\u0087 J\u001b\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0087 J\u001b\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0087 ¨\u0006\u001d"}, d2 = {"Lurgen/ur_0025/UR_2848;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_A14E", "", "ptr", "", "callback", "UR_2748", "", "", "(J)[[B", "UR_28B9", "key", "", "timbre", "UR_934F", "UR_CBBD", "timbreInfo", "UR_AFA4", "algorithm", "", "UR_B082", "UR_56DE", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "UR_1C0C", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UR_2848 {
    public static final urgen.ur_0025.UR_2848 INSTANCE = new urgen.ur_0025.UR_2848();

    private UR_2848() {
    }

    public static final native void UR_1C0C(long ptr, com.tencent.unit_rc.BaseObjectDef listener);

    public static final native byte[][] UR_2748(long ptr);

    public static final native void UR_28B9(long ptr, java.lang.String key, byte[] timbre);

    public static final native void UR_56DE(long ptr, com.tencent.unit_rc.BaseObjectDef listener);

    public static final native byte[] UR_934F(long ptr, java.lang.String key);

    public static final native void UR_A14E(long ptr, com.tencent.unit_rc.BaseObjectDef callback);

    public static final native void UR_AFA4(long ptr, int algorithm);

    public static final native int UR_B082(long ptr);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new jm4.k();
    }

    public static final native void UR_CBBD(long ptr, byte[] timbreInfo, com.tencent.unit_rc.BaseObjectDef callback);
}
