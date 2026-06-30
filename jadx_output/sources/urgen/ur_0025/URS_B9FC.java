package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0007¨\u0006\r"}, d2 = {"Lurgen/ur_0025/URS_B9FC;", "", "Lcom/tencent/unit_rc/BaseObjectDef;", "buffer", "callback", "", "sampleRate", "audioFormat", "channels", "Ljz5/f0;", "UR_F96B", "<init>", "()V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class URS_B9FC {
    public static final urgen.ur_0025.URS_B9FC INSTANCE = new urgen.ur_0025.URS_B9FC();

    private URS_B9FC() {
    }

    public static final void UR_F96B(com.tencent.unit_rc.BaseObjectDef baseObjectDef, com.tencent.unit_rc.BaseObjectDef baseObjectDef2, int i17, int i18, int i19) {
        jm4.p1 p1Var;
        jm4.w1 w1Var = jm4.x1.f300440r;
        jm4.k1 k1Var = (jm4.k1) baseObjectDef2;
        if (k1Var == null) {
            p1Var = null;
        } else {
            if (k1Var instanceof jm4.x1) {
            }
            p1Var = new jm4.p1(k1Var);
        }
        jm4.u0 u0Var = (jm4.u0) baseObjectDef;
        sk4.p pVar = (sk4.p) jm4.x0.a();
        if (i17 != pVar.f408989d || i19 != pVar.f408990e) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AudioRecorderImpl", "sampleRate or channelCnt mismatched");
        }
        kotlin.jvm.internal.o.e(u0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.ting.audiochat.AudioRecorderBufferImpl");
        com.tencent.unit_rc.ByteBuffer byteBuffer = ((sk4.c) u0Var).f408969g;
        if (byteBuffer == null || p1Var == null) {
            return;
        }
        p1Var.invoke(byteBuffer);
    }
}
