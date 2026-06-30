package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007J\"\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0011H\u0007¨\u0006\u0014"}, d2 = {"Lurgen/ur_0025/UR_A060;", "", "<init>", "()V", "URB_1CBE", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "URB_D0D6", "", "URB_FEF6", "loadingStatus", "", "URB_A9D4", com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, "", "context", "", "URB_14FC", "item", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UR_A060 {
    public static final urgen.ur_0025.UR_A060 INSTANCE = new urgen.ur_0025.UR_A060();

    private UR_A060() {
    }

    public static final void URB_14FC(com.tencent.unit_rc.BaseObjectDef obj, byte[] item) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(item, "item");
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public static final java.lang.String URB_1CBE(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public static final void URB_A9D4(com.tencent.unit_rc.BaseObjectDef obj, boolean succeed, byte[] context) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (context != null) {
        }
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public static final void URB_D0D6(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public static final void URB_FEF6(com.tencent.unit_rc.BaseObjectDef obj, int loadingStatus) {
        kotlin.jvm.internal.o.g(obj, "obj");
        bw5.aq0 aq0Var = loadingStatus != 0 ? loadingStatus != 1 ? loadingStatus != 2 ? loadingStatus != 3 ? null : bw5.aq0.TingMusicSquareLoadingStatus_Error : bw5.aq0.TingMusicSquareLoadingStatus_LoadingMorePage : bw5.aq0.TingMusicSquareLoadingStatus_LoadingFirstPage : bw5.aq0.TingMusicSquareLoadingStatus_Idle;
        android.support.v4.media.f.a(obj);
        kotlin.jvm.internal.o.d(aq0Var);
        throw null;
    }
}
