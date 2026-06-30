package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0007J0\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0007J \u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u001a\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\u001c"}, d2 = {"Lurgen/ur_0025/UR_78F8;", "", "<init>", "()V", "URB_6B92", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "URB_045B", "URB_2D39", "URB_39F9", "URB_EE29", "URB_C04E", "volume", "", "URB_6359", "streamType", "", "sampleRate", "sampleFormat", "channelCount", "URB_14E5", "buffer", "", "hasMore", "", "URB_6CFD", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UR_78F8 {
    public static final urgen.ur_0025.UR_78F8 INSTANCE = new urgen.ur_0025.UR_78F8();

    private UR_78F8() {
    }

    public static final void URB_045B(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kl4.k0 k0Var = (kl4.k0) ((jm4.l4) obj);
        synchronized (k0Var) {
            if (k0Var.A) {
                k0Var.A = false;
                com.tencent.mars.xlog.Log.i(k0Var.f308948z, "stop called");
                k0Var.d();
            }
        }
    }

    public static final void URB_14E5(com.tencent.unit_rc.BaseObjectDef obj, byte[] buffer, boolean hasMore) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(buffer, "buffer");
        ((ku5.t0) ku5.t0.f312615d).g(new kl4.c0((kl4.k0) ((jm4.l4) obj), buffer, hasMore));
    }

    public static final void URB_2D39(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((ku5.t0) ku5.t0.f312615d).g(new kl4.g0((kl4.k0) ((jm4.l4) obj)));
    }

    public static final void URB_39F9(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((ku5.t0) ku5.t0.f312615d).g(new kl4.e0((kl4.k0) ((jm4.l4) obj)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void URB_6359(com.tencent.unit_rc.BaseObjectDef r10, int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: urgen.ur_0025.UR_78F8.URB_6359(com.tencent.unit_rc.BaseObjectDef, int, int, int, int):void");
    }

    public static final void URB_6B92(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kl4.k0 k0Var = (kl4.k0) ((jm4.l4) obj);
        synchronized (k0Var) {
            if (!k0Var.A) {
                k0Var.A = true;
                ((ku5.t0) ku5.t0.f312615d).g(new kl4.i0(k0Var));
            }
        }
    }

    public static final void URB_6CFD(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef listener) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((kl4.k0) ((jm4.l4) obj)).f308943u = (jm4.n4) listener;
    }

    public static final void URB_C04E(com.tencent.unit_rc.BaseObjectDef obj, float volume) {
        kotlin.jvm.internal.o.g(obj, "obj");
    }

    public static final void URB_EE29(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
    }
}
