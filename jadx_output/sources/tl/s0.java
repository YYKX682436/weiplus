package tl;

/* loaded from: classes12.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f420115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f420116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f420117f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tl.q0 f420118g;

    public s0(tl.q0 q0Var, com.tencent.mm.modelbase.m1 m1Var, int i17, int i18) {
        this.f420118g = q0Var;
        this.f420115d = m1Var;
        this.f420116e = i17;
        this.f420117f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        int i17;
        long j17;
        hg0.g gVar;
        int i18;
        com.tencent.mm.modelbase.m1 m1Var = this.f420115d;
        int type = m1Var.getType();
        tl.q0 q0Var = this.f420118g;
        if (type == 128) {
            q0Var.f420099m = false;
            if (!(m1Var instanceof w21.k)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceService", "onSceneEnd DownloadVoice scene is not NetSceneDownloadVoice: ".concat(m1Var.getClass().getName()));
                return;
            }
            w21.k kVar = (w21.k) m1Var;
            str = kVar.f442404f;
            i17 = kVar.f442407i;
            if (!kVar.f442410o && str != null) {
                hg0.k kVar2 = (hg0.k) ((eg0.e) i95.n0.c(eg0.e.class));
                kVar2.getClass();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = kVar2.f281331d;
                if (concurrentHashMap.get(str) != null) {
                    w21.w0 Ni = kVar2.Ni(str);
                    if (!(Ni != null && ((i18 = Ni.f442492i) == 99 || i18 == 98)) && (gVar = (hg0.g) concurrentHashMap.remove(str)) != null) {
                        kVar2.Ai(gVar, new hg0.f(Ni, Ni == null ? "scene_aborted_record_gone" : "scene_aborted_nonretry", false, 4, null));
                    }
                }
            }
        } else {
            if (m1Var.getType() != 127) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoiceService", "onSceneEnd Error SceneType:" + m1Var.getType());
                return;
            }
            q0Var.f420100n = false;
            if (m1Var instanceof w21.o) {
                str = ((w21.o) m1Var).f442432f;
                i17 = ((w21.o) m1Var).f442437n;
            } else if ((m1Var.getReqResp() instanceof com.tencent.mm.modelbase.o) && (((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a instanceof r45.dv6)) {
                return;
            } else {
                str = null;
                i17 = 0;
            }
        }
        w21.w0 j18 = w21.x0.j(str);
        if (m1Var.getType() == 128 && j18 != null && j18.c() && j18.f442492i != 98) {
            w21.x0.s(str);
            com.tencent.mars.xlog.Log.w("MicroMsg.SceneVoiceService", "re-download set error");
        }
        if (str == null || ((java.util.HashMap) q0Var.f420098i).get(str) == null) {
            j17 = 0;
        } else {
            j17 = ((fp.j) ((java.util.HashMap) q0Var.f420098i).get(str)).a();
            ((java.util.HashMap) q0Var.f420098i).remove(str);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd SceneType:");
        sb6.append(m1Var.getType());
        sb6.append(" errtype:");
        int i19 = this.f420116e;
        sb6.append(i19);
        sb6.append(" errCode:");
        sb6.append(this.f420117f);
        sb6.append(" retCode:");
        sb6.append(i17);
        sb6.append(" file:");
        sb6.append(str);
        sb6.append(" time:");
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceService", sb6.toString());
        if (i19 == 3 && i17 != 0) {
            q0Var.f420102p--;
        } else if (i19 != 0) {
            q0Var.f420102p = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceService", "onSceneEnd stop:" + q0Var.f420102p + " running:" + q0Var.f420101o + " recving:" + q0Var.f420099m + " sending:" + q0Var.f420100n);
        if (q0Var.f420102p > 0) {
            tl.q0.b(q0Var);
            return;
        }
        if (q0Var.f420100n || q0Var.f420099m) {
            return;
        }
        q0Var.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceService", "onSceneEnd fin and try next delay 3s [%d, %d] [%b]", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(tl.q0.f420091t));
        if (tl.q0.f420091t && i19 == 4) {
            q0Var.d().postDelayed(new tl.r0(this), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|onSceneEnd";
    }
}
