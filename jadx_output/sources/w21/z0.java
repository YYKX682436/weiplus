package w21;

/* loaded from: classes12.dex */
public class z0 implements com.tencent.mm.modelbase.i1 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f442519d = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0361, code lost:
    
        if (r7 != false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0447  */
    @Override // com.tencent.mm.modelbase.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.modelbase.q0 b1(com.tencent.mm.modelbase.p0 r42) {
        /*
            Method dump skipped, instructions count: 1334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w21.z0.b1(com.tencent.mm.modelbase.p0):com.tencent.mm.modelbase.q0");
    }

    @Override // com.tencent.mm.modelbase.t0
    public void x5(com.tencent.mm.modelbase.r0 r0Var) {
        com.tencent.mm.storage.f9 f9Var = r0Var.f70757a;
        java.lang.String Ai = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsgExtension", "onPreDelMessage " + Ai + " " + f9Var.Q0());
        if (!com.tencent.mm.storage.z3.I4(f9Var.Q0())) {
            w21.x0.e(f9Var, Ai);
            com.tencent.mm.storage.lb Ai2 = w21.p0.Ai();
            Ai2.getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(Ai)) {
                if (Ai2.f195098d.delete("VoiceTransText", "cmsgId=?", new java.lang.String[]{Ai}) <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.VoiceTransTextStorage", "deleteByClientMsgId failed (or no transText) , cmsgId = %s", Ai);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoiceTransTextStorage", "deleteByClientMsgId success, cmsgId = %s", Ai);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsgExtension", "delete voice quote msg by msgId: %s, ret: %b", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Boolean.valueOf(((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).wi(f9Var.Q0(), f9Var.getMsgId())));
    }
}
