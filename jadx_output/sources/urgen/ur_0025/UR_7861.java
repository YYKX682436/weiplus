package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\f"}, d2 = {"Lurgen/ur_0025/UR_7861;", "", "<init>", "()V", "URB_F100", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "chatroomInfo", "", "URB_21F8", "URB_FB4F", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UR_7861 {
    public static final urgen.ur_0025.UR_7861 INSTANCE = new urgen.ur_0025.UR_7861();

    private UR_7861() {
    }

    public static final void URB_21F8(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((vl4.s) ((jm4.f1) obj)).a();
    }

    public static final void URB_F100(com.tencent.unit_rc.BaseObjectDef obj, byte[] chatroomInfo) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(chatroomInfo, "chatroomInfo");
        bw5.p90 p90Var = (bw5.p90) jm4.r5.d(chatroomInfo, new bw5.p90());
        vl4.s sVar = (vl4.s) ((jm4.f1) obj);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        bw5.mc0 mc0Var = p90Var.A[9] ? p90Var.f31515o : new bw5.mc0();
        sVar.f437902e = kotlin.jvm.internal.o.b(e17, mc0Var != null ? mc0Var.getUsername() : null);
        sVar.a();
    }

    public static final void URB_FB4F(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ul4.i iVar = ((vl4.s) ((jm4.f1) obj)).f437901d;
        if (iVar != null) {
            iVar.f428622m = false;
            jm4.h0 h0Var = jm4.h0.f300389f;
            byte[] byteArray = new bw5.vo0().toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            iVar.e(h0Var, byteArray);
        }
    }
}
