package urgen.ur_E2DE;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J#\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0087 J\"\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, d2 = {"Lurgen/ur_E2DE/UR_30E0;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_DF8D", "", "ptr", "", "context", "params", "", "URB_DF8D", "obj", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UR_30E0 {
    public static final urgen.ur_E2DE.UR_30E0 INSTANCE = new urgen.ur_E2DE.UR_30E0();

    private UR_30E0() {
    }

    public static final byte[] URB_DF8D(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef context, java.lang.String params) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(params, "params");
        byte[] byteArray = ((bw5.k7) y02.k.c(UR_DF8D(((y02.y) ((y02.x) obj)).getCppPointer(), (y02.u) context, params), new bw5.k7())).toByteArray();
        kotlin.jvm.internal.o.d(byteArray);
        return byteArray;
    }

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new y02.y();
    }

    public static final native byte[] UR_DF8D(long ptr, com.tencent.unit_rc.BaseObjectDef context, java.lang.String params);
}
