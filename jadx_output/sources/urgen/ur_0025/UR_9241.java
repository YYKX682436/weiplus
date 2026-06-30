package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0087 J\u001e\u0010\t\u001a\u0004\u0018\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0087 ¢\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0087 J!\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0087 J\u0011\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0087 J\u0019\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0087 ¨\u0006\u0019"}, d2 = {"Lurgen/ur_0025/UR_9241;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_D6A4", "item", "", "UR_238C", "items", "", "([[B)Lcom/tencent/unit_rc/BaseObjectDef;", "UR_C2E7", "ptr", "", "UR_E6D9", "", "categoryItem", "enableRecommend", "", "UR_E2D4", "UR_458F", "truncateAtIndex", "", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UR_9241 {
    public static final urgen.ur_0025.UR_9241 INSTANCE = new urgen.ur_0025.UR_9241();

    private UR_9241() {
    }

    public static final native com.tencent.unit_rc.BaseObjectDef UR_238C(byte[][] items);

    public static final native void UR_458F(long ptr, int truncateAtIndex);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new jm4.c1();
    }

    public static final native byte[] UR_C2E7(long ptr);

    public static final native com.tencent.unit_rc.BaseObjectDef UR_D6A4(byte[] item);

    public static final native void UR_E2D4(long ptr);

    public static final native void UR_E6D9(long ptr, byte[] categoryItem, boolean enableRecommend);
}
