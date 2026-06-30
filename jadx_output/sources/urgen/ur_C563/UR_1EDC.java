package urgen.ur_C563;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0087 J\u0019\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0087 ¨\u0006\u000e"}, d2 = {"Lurgen/ur_C563/UR_1EDC;", "", "<init>", "()V", "UR_D246", "", "info", "", "UR_C2D8", "pageId", "", "UR_7179", "state", "", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UR_1EDC {
    public static final urgen.ur_C563.UR_1EDC INSTANCE = new urgen.ur_C563.UR_1EDC();

    static {
        com.tencent.unit_rc.LibraryLoader.INSTANCE.load("aff_biz");
    }

    private UR_1EDC() {
    }

    public static final native void UR_7179(java.lang.String pageId, int state);

    public static final native void UR_C2D8(java.lang.String pageId);

    public static final native void UR_D246(byte[] info);
}
