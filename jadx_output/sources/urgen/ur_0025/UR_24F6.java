package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J#\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0087 J!\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0087 J\"\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J \u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0015"}, d2 = {"Lurgen/ur_0025/UR_24F6;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_3AAD", "", "ptr", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/unit_rc/ByteBuffer;", "metaInfo", "", "UR_844B", "initParams", "listenId", "", "URB_3AAD", "obj", "URB_844B", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UR_24F6 {
    public static final urgen.ur_0025.UR_24F6 INSTANCE = new urgen.ur_0025.UR_24F6();

    private UR_24F6() {
    }

    public static final void URB_3AAD(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.ByteBuffer data, byte[] metaInfo) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(metaInfo, "metaInfo");
        byte[] byteArray = ((bw5.y1) jm4.r5.d(metaInfo, new bw5.y1())).toByteArray();
        long cppPointer = ((jm4.n0) ((jm4.m0) obj)).getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        UR_3AAD(cppPointer, data, byteArray);
    }

    public static final void URB_844B(com.tencent.unit_rc.BaseObjectDef obj, byte[] initParams, java.lang.String listenId) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(initParams, "initParams");
        kotlin.jvm.internal.o.g(listenId, "listenId");
        byte[] byteArray = ((bw5.b2) jm4.r5.d(initParams, new bw5.b2())).toByteArray();
        long cppPointer = ((jm4.n0) ((jm4.m0) obj)).getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        UR_844B(cppPointer, byteArray, listenId);
    }

    public static final native void UR_3AAD(long ptr, com.tencent.unit_rc.ByteBuffer data, byte[] metaInfo);

    public static final native void UR_844B(long ptr, byte[] initParams, java.lang.String listenId);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new jm4.n0();
    }
}
