package urgen.ur_54A4;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0087 J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0087 J4\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0087 ¢\u0006\u0002\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0087 J!\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\bH\u0087 ¨\u0006\u0019"}, d2 = {"Lurgen/ur_54A4/UR_42C7;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_AFBA", "UR_75AB", "", dm.i4.COL_FINDEROBJECT, "", "UR_E604", "", "ptr", "", "finderObjects", "", "commentScene", "", "downloadType", "(J[[BII)V", "UR_9F7B", "UR_62C3", "feedId", ya.b.SUCCESS, "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UR_42C7 {
    public static final urgen.ur_54A4.UR_42C7 INSTANCE = new urgen.ur_54A4.UR_42C7();

    private UR_42C7() {
    }

    public static final native void UR_62C3(long ptr, long feedId, boolean success);

    public static final native boolean UR_75AB(byte[] finderObject);

    public static final native void UR_9F7B(long ptr);

    public static final native com.tencent.unit_rc.BaseObjectDef UR_AFBA();

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new qg3.e0();
    }

    public static final native void UR_E604(long ptr, byte[][] finderObjects, int commentScene, int downloadType);
}
