package urgen.ur_E2DE;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0087 J#\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0087 J\u0019\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0087 J5\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0087 J-\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0087 J-\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0087 ¨\u0006\u0018"}, d2 = {"Lurgen/ur_E2DE/UR_4D54;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_1332", "UR_2841", "", "ptr", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "", "handler", "UR_2936", "UR_E604", "jumpInfo", "", "context", "preloadConfig", "callback", "UR_6E69", "UR_D912", "json", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UR_4D54 {
    public static final urgen.ur_E2DE.UR_4D54 INSTANCE = new urgen.ur_E2DE.UR_4D54();

    private UR_4D54() {
    }

    public static final native com.tencent.unit_rc.BaseObjectDef UR_1332();

    public static final native void UR_2841(long ptr, java.lang.String name, com.tencent.unit_rc.BaseObjectDef handler);

    public static final native void UR_2936(long ptr, java.lang.String name);

    public static final native void UR_6E69(long ptr, byte[] jumpInfo, com.tencent.unit_rc.BaseObjectDef context, com.tencent.unit_rc.BaseObjectDef callback);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new y02.j0();
    }

    public static final native void UR_D912(long ptr, java.lang.String json, com.tencent.unit_rc.BaseObjectDef context, com.tencent.unit_rc.BaseObjectDef callback);

    public static final native void UR_E604(long ptr, byte[] jumpInfo, com.tencent.unit_rc.BaseObjectDef context, byte[] preloadConfig, com.tencent.unit_rc.BaseObjectDef callback);
}
