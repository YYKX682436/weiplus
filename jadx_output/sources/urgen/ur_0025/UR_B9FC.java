package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, d2 = {"Lurgen/ur_0025/UR_B9FC;", "", "<init>", "()V", "URB_20D5", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "URB_2272", "", "bufferId", "URB_E76B", "", "URB_D90A", "peakPower", "URB_884B", "", "URB_EFC4", "isFinal", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UR_B9FC {
    public static final urgen.ur_0025.UR_B9FC INSTANCE = new urgen.ur_0025.UR_B9FC();

    private UR_B9FC() {
    }

    public static final long URB_20D5(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((jm4.v0) ((jm4.u0) obj)).f300431d;
    }

    public static final void URB_2272(com.tencent.unit_rc.BaseObjectDef obj, long bufferId) {
        kotlin.jvm.internal.o.g(obj, "obj");
        jm4.v0 v0Var = (jm4.v0) ((jm4.u0) obj);
        v0Var.f300431d = bufferId;
        v0Var.notifyFieldUpdated(0);
    }

    public static final boolean URB_884B(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((jm4.v0) ((jm4.u0) obj)).f300433f;
    }

    public static final void URB_D90A(com.tencent.unit_rc.BaseObjectDef obj, float peakPower) {
        kotlin.jvm.internal.o.g(obj, "obj");
        jm4.v0 v0Var = (jm4.v0) ((jm4.u0) obj);
        v0Var.f300432e = peakPower;
        v0Var.notifyFieldUpdated(1);
    }

    public static final float URB_E76B(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((jm4.v0) ((jm4.u0) obj)).f300432e;
    }

    public static final void URB_EFC4(com.tencent.unit_rc.BaseObjectDef obj, boolean isFinal) {
        kotlin.jvm.internal.o.g(obj, "obj");
        jm4.v0 v0Var = (jm4.v0) ((jm4.u0) obj);
        v0Var.f300433f = isFinal;
        v0Var.notifyFieldUpdated(2);
    }
}
