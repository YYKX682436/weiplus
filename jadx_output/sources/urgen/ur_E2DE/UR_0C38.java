package urgen.ur_E2DE;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\"\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007J4\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0007J,\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\u0012"}, d2 = {"Lurgen/ur_E2DE/UR_0C38;", "", "<init>", "()V", "URB_4297", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "URB_52B5", "", "jumpInfo", "", "context", "URB_9B49", "", "preloadConfig", "callback", "URB_F12B", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UR_0C38 {
    public static final urgen.ur_E2DE.UR_0C38 INSTANCE = new urgen.ur_E2DE.UR_0C38();

    private UR_0C38() {
    }

    public static final java.lang.String URB_4297(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((y02.f0) obj).name();
    }

    public static final boolean URB_52B5(com.tencent.unit_rc.BaseObjectDef obj, byte[] jumpInfo, com.tencent.unit_rc.BaseObjectDef context) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        return ((y02.f0) obj).r6((bw5.x7) y02.k.c(jumpInfo, new bw5.x7()), (y02.d0) context);
    }

    public static final void URB_9B49(com.tencent.unit_rc.BaseObjectDef obj, byte[] jumpInfo, com.tencent.unit_rc.BaseObjectDef context, byte[] preloadConfig, com.tencent.unit_rc.BaseObjectDef callback) {
        yz5.l m1Var;
        yz5.l lVar;
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(preloadConfig, "preloadConfig");
        bw5.x7 x7Var = (bw5.x7) y02.k.c(jumpInfo, new bw5.x7());
        bw5.l8 l8Var = (bw5.l8) y02.k.c(preloadConfig, new bw5.l8());
        int i17 = y02.o1.f458617n;
        y02.h1 h1Var = (y02.h1) callback;
        if (h1Var == null) {
            lVar = null;
        } else {
            if (!(h1Var instanceof y02.o1) || (m1Var = ((y02.o1) h1Var).f458621g) == null) {
                m1Var = new y02.m1(h1Var);
            }
            lVar = m1Var;
        }
        ((y02.f0) obj).Y2(x7Var, (y02.d0) context, l8Var, lVar);
    }

    public static final void URB_F12B(com.tencent.unit_rc.BaseObjectDef obj, byte[] jumpInfo, com.tencent.unit_rc.BaseObjectDef context, com.tencent.unit_rc.BaseObjectDef callback) {
        yz5.l m1Var;
        yz5.l lVar;
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        bw5.x7 x7Var = (bw5.x7) y02.k.c(jumpInfo, new bw5.x7());
        int i17 = y02.o1.f458617n;
        y02.h1 h1Var = (y02.h1) callback;
        if (h1Var == null) {
            lVar = null;
        } else {
            if (!(h1Var instanceof y02.o1) || (m1Var = ((y02.o1) h1Var).f458621g) == null) {
                m1Var = new y02.m1(h1Var);
            }
            lVar = m1Var;
        }
        ((y02.f0) obj).j0(x7Var, (y02.d0) context, lVar);
    }
}
