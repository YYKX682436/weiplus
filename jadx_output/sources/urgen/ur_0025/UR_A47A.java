package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u001b\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0087 J\u001a\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0007J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0005H\u0007J\u001a\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0007J\u001a\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0007J%\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00152\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\u0019"}, d2 = {"Lurgen/ur_0025/UR_A47A;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_11CF", "", "ptr", "", "callback", "URB_6B92", "obj", "URB_045B", "URB_2792", "URB_E76B", "", "URB_ABD8", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "URB_C36B", "URB_E704", "", "bufferId", "(Lcom/tencent/unit_rc/BaseObjectDef;J)[Lcom/tencent/unit_rc/BaseObjectDef;", "URB_11CF", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UR_A47A {
    public static final urgen.ur_0025.UR_A47A INSTANCE = new urgen.ur_0025.UR_A47A();

    private UR_A47A() {
    }

    public static final void URB_045B(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((jm4.t0) obj).stop();
    }

    public static final void URB_11CF(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef callback) {
        yz5.l r1Var;
        yz5.l lVar;
        kotlin.jvm.internal.o.g(obj, "obj");
        jm4.w1 w1Var = jm4.x1.f300440r;
        jm4.k1 k1Var = (jm4.k1) callback;
        if (k1Var == null) {
            lVar = null;
        } else {
            if (!(k1Var instanceof jm4.x1) || (r1Var = ((jm4.x1) k1Var).f300445h) == null) {
                r1Var = new jm4.r1(k1Var);
            }
            lVar = r1Var;
        }
        ((jm4.t0) obj).Vb(lVar);
    }

    public static final void URB_2792(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((jm4.t0) obj).prepare();
    }

    public static final void URB_6B92(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef callback) {
        jm4.u1 u1Var;
        kotlin.jvm.internal.o.g(obj, "obj");
        jm4.w1 w1Var = jm4.x1.f300440r;
        jm4.k1 k1Var = (jm4.k1) callback;
        if (k1Var == null) {
            u1Var = null;
        } else {
            if (k1Var instanceof jm4.x1) {
            }
            u1Var = new jm4.u1(k1Var);
        }
        ((jm4.t0) obj).Sh(u1Var);
    }

    public static final void URB_ABD8(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef listener) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((jm4.t0) obj).L0((jm4.y0) listener);
    }

    public static final void URB_C36B(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef listener) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((jm4.t0) obj).Xe((jm4.y0) listener);
    }

    public static final com.tencent.unit_rc.BaseObjectDef[] URB_E704(com.tencent.unit_rc.BaseObjectDef obj, long bufferId) {
        kotlin.jvm.internal.o.g(obj, "obj");
        jm4.u0[] H9 = ((jm4.t0) obj).H9(bufferId);
        java.util.ArrayList arrayList = new java.util.ArrayList(H9.length);
        for (jm4.u0 u0Var : H9) {
            arrayList.add(u0Var);
        }
        return (com.tencent.unit_rc.BaseObjectDef[]) arrayList.toArray(new com.tencent.unit_rc.BaseObjectDef[0]);
    }

    public static final double URB_E76B(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((jm4.t0) obj).s9();
    }

    public static final native void UR_11CF(long ptr, com.tencent.unit_rc.BaseObjectDef callback);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new jm4.w0();
    }
}
