package urgen.ur_C563;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0087 J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u000e"}, d2 = {"Lurgen/ur_C563/UR_D54C;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_0A45", "", "ptr", "", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "", "URB_0A45", "obj", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UR_D54C {
    public static final urgen.ur_C563.UR_D54C INSTANCE = new urgen.ur_C563.UR_D54C();

    static {
        com.tencent.unit_rc.LibraryLoader.INSTANCE.load("aff_biz");
    }

    private UR_D54C() {
    }

    public static final void URB_0A45(com.tencent.unit_rc.BaseObjectDef obj, java.lang.String path) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(path, "path");
        UR_0A45(((w71.g1) ((w71.f1) obj)).getCppPointer(), path);
    }

    public static final native void UR_0A45(long ptr, java.lang.String path);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new w71.g1();
    }
}
