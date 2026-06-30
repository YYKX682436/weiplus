package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0087 J\u001b\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0087 J\u001b\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0087 J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\nH\u0087 ¢\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000fH\u0087 J\u0019\u0010\u0014\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0087 J\u0019\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\bH\u0087 J\u0019\u0010\u0019\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000fH\u0087 J\u0019\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u000fH\u0087 J!\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000fH\u0087 ¨\u0006\u001f"}, d2 = {"Lurgen/ur_0025/UR_E53E;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_1332", "UR_ABD8", "", "ptr", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "UR_C36B", "UR_1AC0", "", "", "(J)[[B", "UR_5A61", "", "tapeInfo", "UR_3A75", "tapeId", "", "UR_D21E", "isFullVolume", "UR_0C2D", "recommendInfo", "UR_EFFE", "categoryItem", "UR_49E3", "newInfo", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UR_E53E {
    public static final urgen.ur_0025.UR_E53E INSTANCE = new urgen.ur_0025.UR_E53E();

    private UR_E53E() {
    }

    public static final native void UR_0C2D(long ptr, byte[] recommendInfo);

    public static final native com.tencent.unit_rc.BaseObjectDef UR_1332();

    public static final native byte[][] UR_1AC0(long ptr);

    public static final native void UR_3A75(long ptr, java.lang.String tapeId);

    public static final native boolean UR_49E3(long ptr, java.lang.String tapeId, byte[] newInfo);

    public static final native void UR_5A61(long ptr, byte[] tapeInfo);

    public static final native boolean UR_ABD8(long ptr, com.tencent.unit_rc.BaseObjectDef listener);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new jm4.i2();
    }

    public static final native boolean UR_C36B(long ptr, com.tencent.unit_rc.BaseObjectDef listener);

    public static final native boolean UR_D21E(long ptr, boolean isFullVolume);

    public static final native boolean UR_EFFE(long ptr, byte[] categoryItem);
}
