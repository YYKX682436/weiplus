package urgen.ur_54A4;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0011\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0087 J5\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0087 J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005H\u0007J4\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0007¨\u0006\u0014"}, d2 = {"Lurgen/ur_54A4/UR_9932;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_0A4A", "", "ptr", "", "UR_B3AC", "", "redDotInfo", "", "cacheResult", "onSuccess", "onFail", "URB_0A4A", "obj", "URB_B3AC", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UR_9932 {
    public static final urgen.ur_54A4.UR_9932 INSTANCE = new urgen.ur_54A4.UR_9932();

    private UR_9932() {
    }

    public static final java.lang.String URB_0A4A(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((qg3.a) obj).jg();
    }

    public static final void URB_B3AC(com.tencent.unit_rc.BaseObjectDef obj, byte[] redDotInfo, byte[] cacheResult, com.tencent.unit_rc.BaseObjectDef onSuccess, com.tencent.unit_rc.BaseObjectDef onFail) {
        yz5.l oVar;
        yz5.p nVar;
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(onSuccess, "onSuccess");
        kotlin.jvm.internal.o.g(onFail, "onFail");
        bw5.ev evVar = redDotInfo != null ? (bw5.ev) qg3.f0.b(redDotInfo, new bw5.ev()) : null;
        bw5.c40 c40Var = cacheResult != null ? (bw5.c40) qg3.f0.b(cacheResult, new bw5.c40()) : null;
        qg3.p pVar = qg3.q.f362844h;
        qg3.k kVar = (qg3.k) onSuccess;
        if (!(kVar instanceof qg3.q) || (oVar = ((qg3.q) kVar).f362848g) == null) {
            oVar = new qg3.o(kVar);
        }
        qg3.k kVar2 = (qg3.k) onFail;
        if (!(kVar2 instanceof qg3.q) || (nVar = ((qg3.q) kVar2).f362847f) == null) {
            nVar = new qg3.n(kVar2);
        }
        ((qg3.a) obj).d6(evVar, c40Var, oVar, nVar);
    }

    public static final native java.lang.String UR_0A4A(long ptr);

    public static final native void UR_B3AC(long ptr, byte[] redDotInfo, byte[] cacheResult, com.tencent.unit_rc.BaseObjectDef onSuccess, com.tencent.unit_rc.BaseObjectDef onFail);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new qg3.b();
    }
}
