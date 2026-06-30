package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\u000e"}, d2 = {"Lurgen/ur_0025/UR_86B0;", "", "<init>", "()V", "URB_1434", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "type", "", "context", "", "URB_F923", "callback", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UR_86B0 {
    public static final urgen.ur_0025.UR_86B0 INSTANCE = new urgen.ur_0025.UR_86B0();

    private UR_86B0() {
    }

    public static final void URB_1434(com.tencent.unit_rc.BaseObjectDef obj, int type, byte[] context) {
        jm4.h0 h0Var;
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(context, "context");
        jm4.h0.f300387d.getClass();
        if (type == 1) {
            h0Var = jm4.h0.f300388e;
        } else {
            if (type != 2) {
                throw new java.lang.IllegalArgumentException("Invalid AudioFocusType value: " + type);
            }
            h0Var = jm4.h0.f300389f;
        }
        ((ul4.i) ((jm4.d0) obj)).e(h0Var, context);
    }

    public static final void URB_F923(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef callback) {
        kotlin.jvm.internal.o.g(obj, "obj");
        jm4.e0 e0Var = (jm4.e0) callback;
        ul4.i iVar = (ul4.i) ((jm4.d0) obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setAudioFocusCallback, taskId:");
        sb6.append(iVar.f428618f);
        sb6.append(",callback:");
        sb6.append(e0Var != null ? java.lang.Integer.valueOf(e0Var.hashCode()) : "null");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioFocusController", sb6.toString());
        iVar.f428621i = e0Var;
    }
}
