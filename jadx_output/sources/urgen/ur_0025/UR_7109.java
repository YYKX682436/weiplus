package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000fJA\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lurgen/ur_0025/UR_7109;", "", "<init>", "()V", "URB_9632", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "items", "", "", "errMsg", "", "taskId", "", "(Lcom/tencent/unit_rc/BaseObjectDef;[[BLjava/lang/String;I)V", "URB_D43B", "listenIds", "commentInfo", "(Lcom/tencent/unit_rc/BaseObjectDef;[Ljava/lang/String;[[BLjava/lang/String;I)V", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UR_7109 {
    public static final urgen.ur_0025.UR_7109 INSTANCE = new urgen.ur_0025.UR_7109();

    private UR_7109() {
    }

    public static final void URB_9632(com.tencent.unit_rc.BaseObjectDef obj, byte[][] items, java.lang.String errMsg, int taskId) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(items, "items");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        int length = items.length;
        bw5.dr0[] dr0VarArr = new bw5.dr0[length];
        for (int i17 = 0; i17 < length; i17++) {
            dr0VarArr[i17] = new bw5.dr0();
        }
        jm4.r5.c(items, dr0VarArr);
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public static final void URB_D43B(com.tencent.unit_rc.BaseObjectDef obj, java.lang.String[] listenIds, byte[][] commentInfo, java.lang.String errMsg, int taskId) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(listenIds, "listenIds");
        kotlin.jvm.internal.o.g(commentInfo, "commentInfo");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        int length = commentInfo.length;
        bw5.d60[] d60VarArr = new bw5.d60[length];
        for (int i17 = 0; i17 < length; i17++) {
            d60VarArr[i17] = new bw5.d60();
        }
        jm4.r5.c(commentInfo, d60VarArr);
        android.support.v4.media.f.a(obj);
        throw null;
    }
}
