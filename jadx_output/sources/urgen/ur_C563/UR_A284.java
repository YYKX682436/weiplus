package urgen.ur_C563;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0011\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0087 J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0087 J\u0011\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0087 J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000bH\u0087 J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0005H\u0007J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0007J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0007J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000bH\u0007¨\u0006\u0015"}, d2 = {"Lurgen/ur_C563/UR_A284;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_907B", "", "ptr", "", "UR_F3EE", "", "UR_727F", "UR_B8F6", "", "openParams", "URB_907B", "obj", "URB_F3EE", "URB_727F", "URB_B8F6", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UR_A284 {
    public static final urgen.ur_C563.UR_A284 INSTANCE = new urgen.ur_C563.UR_A284();

    static {
        com.tencent.unit_rc.LibraryLoader.INSTANCE.load("aff_biz");
    }

    private UR_A284() {
    }

    public static final byte[] URB_727F(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        byte[] byteArray = ((w71.t0) obj).Pa().toByteArray();
        kotlin.jvm.internal.o.d(byteArray);
        return byteArray;
    }

    public static final java.lang.String URB_907B(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((w71.t0) obj).r();
    }

    public static final void URB_B8F6(com.tencent.unit_rc.BaseObjectDef obj, byte[] openParams) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(openParams, "openParams");
        ((w71.t0) obj).Jg((bw5.j20) w71.l.b(openParams, new bw5.j20()));
    }

    public static final byte[] URB_F3EE(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        byte[] byteArray = ((w71.t0) obj).nb().toByteArray();
        kotlin.jvm.internal.o.d(byteArray);
        return byteArray;
    }

    public static final native byte[] UR_727F(long ptr);

    public static final native java.lang.String UR_907B(long ptr);

    public static final native void UR_B8F6(long ptr, byte[] openParams);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new w71.u0();
    }

    public static final native byte[] UR_F3EE(long ptr);
}
