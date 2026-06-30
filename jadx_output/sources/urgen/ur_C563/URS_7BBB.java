package urgen.ur_C563;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\u0007"}, d2 = {"Lurgen/ur_C563/URS_7BBB;", "", "()V", "UR_1FE4", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "key", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class URS_7BBB {
    public static final urgen.ur_C563.URS_7BBB INSTANCE = new urgen.ur_C563.URS_7BBB();

    private URS_7BBB() {
    }

    public static final java.lang.String UR_1FE4(java.lang.String name, java.lang.String key) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M(name).getString(key, "");
        return string == null ? "" : string;
    }
}
