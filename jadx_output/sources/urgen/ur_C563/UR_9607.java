package urgen.ur_C563;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0087 J%\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0087 J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\nH\u0087 ¢\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0087 ¨\u0006\u0014"}, d2 = {"Lurgen/ur_C563/UR_9607;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_1332", "UR_6E69", "", "ptr", "", "params", "callback", "UR_8178", "", "", "(J)[[B", "UR_2BB2", "pageId", "", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UR_9607 {
    public static final urgen.ur_C563.UR_9607 INSTANCE = new urgen.ur_C563.UR_9607();

    static {
        com.tencent.unit_rc.LibraryLoader.INSTANCE.load("aff_biz");
    }

    private UR_9607() {
    }

    public static final native com.tencent.unit_rc.BaseObjectDef UR_1332();

    public static final native byte[] UR_2BB2(long ptr, java.lang.String pageId);

    public static final native void UR_6E69(long ptr, com.tencent.unit_rc.BaseObjectDef params, com.tencent.unit_rc.BaseObjectDef callback);

    public static final native byte[][] UR_8178(long ptr);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new w71.q0();
    }
}
