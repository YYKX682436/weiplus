package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J#\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lurgen/ur_0025/UR_EC11;", "", "<init>", "()V", "URB_912D", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "requestId", "", ya.b.SUCCESS, "", "tapeInfo", "", "URB_FF74", "list", "", "(Lcom/tencent/unit_rc/BaseObjectDef;[[B)V", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UR_EC11 {
    public static final urgen.ur_0025.UR_EC11 INSTANCE = new urgen.ur_0025.UR_EC11();

    private UR_EC11() {
    }

    public static final void URB_912D(com.tencent.unit_rc.BaseObjectDef obj, long requestId, boolean success, byte[] tapeInfo) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(tapeInfo, "tapeInfo");
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public static final void URB_FF74(com.tencent.unit_rc.BaseObjectDef obj, byte[][] list) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(list, "list");
        int length = list.length;
        bw5.dr0[] dr0VarArr = new bw5.dr0[length];
        for (int i17 = 0; i17 < length; i17++) {
            dr0VarArr[i17] = new bw5.dr0();
        }
        jm4.r5.c(list, dr0VarArr);
        android.support.v4.media.f.a(obj);
        throw null;
    }
}
