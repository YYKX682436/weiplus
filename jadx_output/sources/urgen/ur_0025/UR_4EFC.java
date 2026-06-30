package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0087 J\u001b\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0087 J\u001b\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0087 J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\bH\u0087 J,\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0087 ¢\u0006\u0002\u0010\u0016J1\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0010H\u0087 ¨\u0006\u001a"}, d2 = {"Lurgen/ur_0025/UR_4EFC;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_741F", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "", "UR_ABD8", "", "ptr", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "UR_C36B", "UR_7DC0", "", "taskId", "UR_ADB0", "listenIds", "", "", "(JI[Ljava/lang/String;)V", "UR_5DA6", "listenId", "isCancel", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UR_4EFC {
    public static final urgen.ur_0025.UR_4EFC INSTANCE = new urgen.ur_0025.UR_4EFC();

    private UR_4EFC() {
    }

    public static final native void UR_5DA6(long ptr, int taskId, int scene, java.lang.String listenId, boolean isCancel);

    public static final native com.tencent.unit_rc.BaseObjectDef UR_741F(int scene);

    public static final native boolean UR_7DC0(long ptr, int taskId);

    public static final native void UR_ABD8(long ptr, com.tencent.unit_rc.BaseObjectDef listener);

    public static final native void UR_ADB0(long ptr, int taskId, java.lang.String[] listenIds);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new jm4.h1();
    }

    public static final native void UR_C36B(long ptr, com.tencent.unit_rc.BaseObjectDef listener);
}
