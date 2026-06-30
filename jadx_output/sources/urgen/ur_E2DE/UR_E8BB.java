package urgen.ur_E2DE;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0087 ¢\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0087 ¢\u0006\u0002\u0010\u000bJ\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0006\u0010\t\u001a\u00020\nH\u0087 ¢\u0006\u0002\u0010\u000eJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0010\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0011J\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0010\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0011J\u001d\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0006\u0010\u0010\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lurgen/ur_E2DE/UR_E8BB;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_B227", "", "", "ptr", "", "(J)[Ljava/lang/String;", "UR_D878", "UR_2D11", "(J)[Lcom/tencent/unit_rc/BaseObjectDef;", "URB_B227", "obj", "(Lcom/tencent/unit_rc/BaseObjectDef;)[Ljava/lang/String;", "URB_D878", "URB_2D11", "(Lcom/tencent/unit_rc/BaseObjectDef;)[Lcom/tencent/unit_rc/BaseObjectDef;", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UR_E8BB {
    public static final urgen.ur_E2DE.UR_E8BB INSTANCE = new urgen.ur_E2DE.UR_E8BB();

    private UR_E8BB() {
    }

    public static final com.tencent.unit_rc.BaseObjectDef[] URB_2D11(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        y02.f0[] Bf = ((y02.p1) obj).Bf();
        java.util.ArrayList arrayList = new java.util.ArrayList(Bf.length);
        for (y02.f0 f0Var : Bf) {
            arrayList.add(f0Var);
        }
        return (com.tencent.unit_rc.BaseObjectDef[]) arrayList.toArray(new com.tencent.unit_rc.BaseObjectDef[0]);
    }

    public static final java.lang.String[] URB_B227(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((y02.p1) obj).T1();
    }

    public static final java.lang.String[] URB_D878(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((y02.p1) obj).Cc();
    }

    public static final native com.tencent.unit_rc.BaseObjectDef[] UR_2D11(long ptr);

    public static final native java.lang.String[] UR_B227(long ptr);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new y02.q1();
    }

    public static final native java.lang.String[] UR_D878(long ptr);
}
