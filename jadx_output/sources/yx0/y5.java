package yx0;

/* loaded from: classes5.dex */
public final class y5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f467786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f467787f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f467788g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camerafun.MJAuditCaptureSettings f467789h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(yx0.b8 b8Var, yz5.l lVar, boolean z17, int i17, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467785d = b8Var;
        this.f467786e = lVar;
        this.f467787f = z17;
        this.f467788g = i17;
        this.f467789h = mJAuditCaptureSettings;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.y5(this.f467785d, this.f467786e, this.f467787f, this.f467788g, this.f467789h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.y5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        switch (this.f467785d.f467192s.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "startRecord >> Invalid state: " + this.f467785d.f467192s);
                yz5.l lVar = this.f467786e;
                if (lVar != null) {
                    lVar.invoke(java.lang.Boolean.FALSE);
                }
                return jz5.f0.f302826a;
            case 2:
            default:
                ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).Ri(java.lang.System.currentTimeMillis() - this.f467785d.D1);
                this.f467785d.D1 = 0L;
                yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
                kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.n2(m7Var, null), 3, null);
                i95.m c17 = i95.n0.c(w40.e.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                w40.e.fh((w40.e) c17, "andr_MJ_Camera_Video_Begin", null, 2, null);
                synchronized (yy0.m7.class) {
                    com.tencent.mars.xlog.Log.i(m7Var.f468225d, "isFrontFacingCamera: " + m7Var.B);
                    z17 = m7Var.B;
                }
                if (z17) {
                    m7Var.Bj(2);
                } else {
                    m7Var.Bj(3);
                }
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                java.util.Map Ai = m7Var.Ai();
                Ai.put("view_id", "sc_start_record");
                ((cy1.a) rVar).yj("sc_start_record", null, Ai, 6, false);
                this.f467785d.q0(yx0.v.f467705s);
                this.f467785d.F1 = false;
                this.f467785d.E1 = java.lang.System.currentTimeMillis();
                java.lang.String d17 = dw3.h.d(dw3.h.f244211a, null, null, 3, null);
                yx0.b8 b8Var = this.f467785d;
                boolean z18 = this.f467787f;
                b8Var.f467199x1 = z18;
                b8Var.f467194u = kotlinx.coroutines.l.d(b8Var.L, null, null, new yx0.x5(this.f467788g, z18, b8Var, this.f467789h, d17, this.f467786e, null), 3, null);
                return jz5.f0.f302826a;
        }
    }
}
