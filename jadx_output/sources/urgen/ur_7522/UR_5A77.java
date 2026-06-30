package urgen.ur_7522;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u001b\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0087 J\u001b\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0087 J\u0011\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0087 J\u0019\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0087 J\u001a\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u001a\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0005H\u0007J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0014"}, d2 = {"Lurgen/ur_7522/UR_5A77;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_88B6", "", "ptr", "", "result", "", "UR_A6D1", "UR_3AE4", "UR_AE1E", "URB_88B6", "obj", "URB_A6D1", "URB_3AE4", "URB_AE1E", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UR_5A77 {
    public static final urgen.ur_7522.UR_5A77 INSTANCE = new urgen.ur_7522.UR_5A77();

    private UR_5A77() {
    }

    public static final void URB_3AE4(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((x02.b) obj).Void_Empty();
    }

    public static final void URB_88B6(com.tencent.unit_rc.BaseObjectDef obj, byte[] result) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((x02.b) obj).u0(result != null ? (bw5.x7) x02.a.a(result, new bw5.x7()) : null);
    }

    public static final void URB_A6D1(com.tencent.unit_rc.BaseObjectDef obj, byte[] result) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((x02.b) obj).b2(result != null ? (bw5.i9) x02.a.a(result, new bw5.i9()) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.tencent.mm.protobuf.f] */
    public static final void URB_AE1E(com.tencent.unit_rc.BaseObjectDef obj, byte[] result) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(result, "result");
        bw5.je0 je0Var = new bw5.je0();
        ?? a17 = x02.a.a(result, je0Var);
        if (a17 != 0) {
            je0Var = a17;
        }
        ((x02.b) obj).O3(je0Var);
    }

    public static final native void UR_3AE4(long ptr);

    public static final native void UR_88B6(long ptr, byte[] result);

    public static final native void UR_A6D1(long ptr, byte[] result);

    public static final native void UR_AE1E(long ptr, byte[] result);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new x02.c();
    }
}
