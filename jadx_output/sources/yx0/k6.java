package yx0;

/* loaded from: classes5.dex */
public final class k6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bs0.h f467420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f467421f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(yx0.b8 b8Var, bs0.h hVar, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467419d = b8Var;
        this.f467420e = hVar;
        this.f467421f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.k6(this.f467419d, this.f467420e, this.f467421f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yx0.k6 k6Var = (yx0.k6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yz5.l lVar = this.f467419d.f467191r;
        if (lVar != null) {
            lVar.invoke("kEmptyTemplateId");
        }
        int ordinal = this.f467419d.f467192s.ordinal();
        if (ordinal != 2) {
            switch (ordinal) {
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    kotlinx.coroutines.l.f(null, new yx0.i6(this.f467419d, null), 1, null);
                    this.f467419d.q0(yx0.v.f467699m);
                    yx0.b8 b8Var = this.f467419d;
                    b8Var.f467194u = kotlinx.coroutines.l.d(b8Var.L, null, null, new yx0.j6(b8Var, this.f467420e, this.f467421f, null), 3, null);
                    break;
                default:
                    yz5.l lVar2 = this.f467419d.f467190q;
                    if (lVar2 != null) {
                        lVar2.invoke("kEmptyTemplateId");
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "switchEmptyTemplate >> but state is " + this.f467419d.f467192s);
                    break;
            }
        } else {
            this.f467419d.q0(yx0.v.f467699m);
            yx0.b8 b8Var2 = this.f467419d;
            b8Var2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "reportSwitchToEmptyTemplate");
            pp0.k0 k0Var = (pp0.k0) i95.n0.c(pp0.k0.class);
            if (b8Var2.H1) {
                b8Var2.H1 = false;
                z17 = true;
            } else {
                ((yy0.o0) k0Var).Ri(java.lang.System.currentTimeMillis() - b8Var2.D1);
                b8Var2.D1 = 0L;
                z17 = false;
            }
            ((yy0.o0) k0Var).Ui("kEmptyTemplateId", 0L, 0, null, 4, z17, b8Var2.f467177d.getCurrentCameraIsFront(), !b8Var2.f467177d.getCurrentMicIsMute(), false, false);
            b8Var2.D1 = java.lang.System.currentTimeMillis();
            i95.m c17 = i95.n0.c(w40.e.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            w40.e.eh((w40.e) c17, "SCSwitchTemplate", "MJShootComposing", "kEmptyTemplateId", 0, 8, null);
            pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
            pp0.m0 m0Var = (pp0.m0) i95.n0.c(pp0.m0.class);
            kotlin.jvm.internal.o.d(m0Var);
            pp0.m0.n3(m0Var, "mjpublisher_sc_switch_template", null, 2, null);
            yy0.m7 m7Var = (yy0.m7) l0Var;
            pp0.m0.V8(m0Var, kz5.c1.k(new jz5.l("mj_publisher_session_id", m7Var.Ri()), new jz5.l("template_id", "kEmptyTemplateId"), new jz5.l("is_template_downloaded", "1")), "mjpublisher_sc_switch_template", null, 4, null);
            if (z17) {
                pp0.m0.n3(m0Var, "mjpublisher_first_load_template", null, 2, null);
                jz5.l[] lVarArr = new jz5.l[4];
                lVarArr[0] = new jz5.l("mj_publisher_session_id", m7Var.Ri());
                lVarArr[1] = new jz5.l("template_id", "kEmptyTemplateId");
                lVarArr[2] = new jz5.l("is_template_downloaded", "1");
                lVarArr[3] = new jz5.l("is_first_init", m7Var.aj() ? "1" : "0");
                pp0.m0.V8(m0Var, kz5.c1.k(lVarArr), "mjpublisher_first_load_template", null, 4, null);
            }
            yx0.b8 b8Var3 = this.f467419d;
            b8Var3.f467194u = kotlinx.coroutines.l.d(b8Var3.L, null, null, new yx0.h6(b8Var3, this.f467420e, this.f467421f, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
