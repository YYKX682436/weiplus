package urgen.ur_E2DE;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J-\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0087 J,\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\u0010"}, d2 = {"Lurgen/ur_E2DE/UR_8437;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_DF8D", "", "ptr", "", "context", "params", "", "callback", "URB_DF8D", "obj", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UR_8437 {
    public static final urgen.ur_E2DE.UR_8437 INSTANCE = new urgen.ur_E2DE.UR_8437();

    private UR_8437() {
    }

    public static final void URB_DF8D(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef context, java.lang.String params, com.tencent.unit_rc.BaseObjectDef callback) {
        yz5.l k1Var;
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(params, "params");
        int i17 = y02.o1.f458617n;
        y02.h1 h1Var = (y02.h1) callback;
        y02.o1 o1Var = null;
        if (h1Var == null) {
            k1Var = null;
        } else if (!(h1Var instanceof y02.o1) || (k1Var = ((y02.o1) h1Var).f458619e) == null) {
            k1Var = new y02.k1(h1Var);
        }
        y02.u uVar = (y02.u) context;
        y02.r rVar = (y02.r) ((y02.q) obj);
        if (k1Var != null) {
            o1Var = new y02.o1();
            o1Var.f458619e = k1Var;
        }
        UR_DF8D(rVar.getCppPointer(), uVar, params, o1Var);
    }

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new y02.r();
    }

    public static final native void UR_DF8D(long ptr, com.tencent.unit_rc.BaseObjectDef context, java.lang.String params, com.tencent.unit_rc.BaseObjectDef callback);
}
