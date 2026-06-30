package urgen.ur_C563;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u001b\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0087 J\u0011\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0087 J%\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0087 J\u0011\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0087 J$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0005H\u0007¨\u0006\u0016"}, d2 = {"Lurgen/ur_C563/UR_30EB;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_A00B", "", "routerId", "", "handler", "UR_9832", "target", "UR_F12B", "ptr", "", "params", "callback", "UR_907B", "URB_F12B", "obj", "URB_907B", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UR_30EB {
    public static final urgen.ur_C563.UR_30EB INSTANCE = new urgen.ur_C563.UR_30EB();

    static {
        com.tencent.unit_rc.LibraryLoader.INSTANCE.load("aff_biz");
    }

    private UR_30EB() {
    }

    public static final java.lang.String URB_907B(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((w71.r0) obj).r();
    }

    public static final void URB_F12B(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef params, com.tencent.unit_rc.BaseObjectDef callback) {
        yz5.l j0Var;
        yz5.l lVar;
        kotlin.jvm.internal.o.g(obj, "obj");
        w71.m0 m0Var = w71.n0.f443419f;
        w71.z zVar = (w71.z) callback;
        if (zVar == null) {
            lVar = null;
        } else {
            if (!(zVar instanceof w71.n0) || (j0Var = ((w71.n0) zVar).f443420d) == null) {
                j0Var = new w71.j0(zVar);
            }
            lVar = j0Var;
        }
        ((w71.r0) obj).x7((w71.t0) params, lVar);
    }

    public static final native java.lang.String UR_907B(long ptr);

    public static final native void UR_9832(java.lang.String target);

    public static final native void UR_A00B(java.lang.String routerId, com.tencent.unit_rc.BaseObjectDef handler);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new w71.s0();
    }

    public static final native void UR_F12B(long ptr, com.tencent.unit_rc.BaseObjectDef params, com.tencent.unit_rc.BaseObjectDef callback);
}
