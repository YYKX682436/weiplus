package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\u000f"}, d2 = {"Lurgen/ur_0025/UR_1BE6;", "", "<init>", "()V", "URB_EF3F", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "URB_4181", "", "callback", "URB_660A", "URB_ABD8", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "URB_C36B", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UR_1BE6 {
    public static final urgen.ur_0025.UR_1BE6 INSTANCE = new urgen.ur_0025.UR_1BE6();

    private UR_1BE6() {
    }

    public static final void URB_4181(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef callback) {
        kotlin.jvm.internal.o.g(obj, "obj");
        jm4.x1.f300440r.b((jm4.k1) callback);
        pv.z zVar = (pv.z) i95.n0.c(pv.z.class);
        if (zVar != null) {
            ((ov.b) zVar).Ni();
        }
    }

    public static final void URB_660A(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef callback) {
        kotlin.jvm.internal.o.g(obj, "obj");
        yz5.a b17 = jm4.x1.f300440r.b((jm4.k1) callback);
        if (b17 != null) {
            b17.invoke();
        }
    }

    public static final void URB_ABD8(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef listener) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((al4.c) ((jm4.g2) obj)).f5859d.add((jm4.e2) listener);
    }

    public static final void URB_C36B(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef listener) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((al4.c) ((jm4.g2) obj)).f5859d.remove((jm4.e2) listener);
    }

    public static final boolean URB_EF3F(com.tencent.unit_rc.BaseObjectDef obj) {
        jm4.n5 n5Var;
        jm4.i3 i3Var;
        kotlin.jvm.internal.o.g(obj, "obj");
        qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
        if (g9Var == null || (n5Var = (jm4.n5) ((jz5.n) ((rk4.z8) g9Var).f397139m).getValue()) == null || (i3Var = (jm4.i3) urgen.ur_0025.UR_B9B9.UR_7F97(((jm4.p5) n5Var).getCppPointer())) == null) {
            return false;
        }
        return urgen.ur_0025.UR_04B4.UR_9639(((jm4.j3) i3Var).getCppPointer());
    }
}
