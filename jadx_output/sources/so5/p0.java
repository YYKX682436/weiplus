package so5;

/* loaded from: classes14.dex */
public final class p0 extends zo5.i {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f410896c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f410899f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f410900g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f410901h;

    /* renamed from: i, reason: collision with root package name */
    public p05.l4 f410902i;

    /* renamed from: j, reason: collision with root package name */
    public is0.c f410903j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f410904k;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f410897d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_virtual_background_use_gpu, false);

    /* renamed from: e, reason: collision with root package name */
    public final zo5.i f410898e = new zo5.i();

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.plugin.xlabeffect.XEffectConfig f410905l = vq4.b0.l();

    public p0(boolean z17) {
        this.f410896c = z17;
    }

    @Override // zo5.i
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WevisionRenderLogic", "release() called " + this.f410899f);
        this.f410904k = false;
        is0.c cVar = this.f410903j;
        if (cVar != null) {
            cVar.close();
        }
        this.f410898e.a();
        if (this.f410899f) {
            this.f410899f = false;
            p05.l4 l4Var = this.f410902i;
            if (l4Var != null) {
                l4Var.o();
            }
        }
    }

    @Override // zo5.i
    public java.lang.Object b(zo5.f params) {
        int i17;
        kotlin.jvm.internal.o.g(params, "params");
        if (this.f410902i == null && this.f410900g) {
            this.f410902i = new p05.l4(1, false, this.f410896c, true, this.f410897d, true, rh0.z.f395611e, null, false, 386, null);
            c();
        }
        boolean z17 = this.f410904k;
        zo5.i iVar = this.f410898e;
        if (!z17) {
            iVar.b(params);
            return null;
        }
        boolean z18 = this.f410901h;
        boolean z19 = this.f410900g;
        if (z18 != z19) {
            this.f410901h = z19;
            if (z19) {
                p05.l4 l4Var = this.f410902i;
                if (l4Var != null) {
                    l4Var.I(z19, 1.0f, rh0.b0.f395581e);
                }
            } else {
                p05.l4 l4Var2 = this.f410902i;
                if (l4Var2 != null) {
                    l4Var2.I(z19, 1.0f, rh0.b0.f395580d);
                }
            }
        }
        if (this.f410903j == null) {
            this.f410903j = is0.b.b(true, 23L);
        }
        is0.c cVar = this.f410903j;
        zo5.e renderInfo = params.f474888c;
        if (cVar != null) {
            is0.c.b(cVar, renderInfo.f474880a, renderInfo.f474881b, 0, null, 0, 0, 60, null);
        }
        p05.l4 l4Var3 = this.f410902i;
        if (l4Var3 != null) {
            l4Var3.J(renderInfo.f474880a, renderInfo.f474881b);
        }
        p05.l4 l4Var4 = this.f410902i;
        if (l4Var4 != null) {
            l4Var4.q(params.f474887b, false, renderInfo.f474882c, renderInfo.f474883d);
        }
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        p05.l4 l4Var5 = this.f410902i;
        if (l4Var5 != null) {
            int i18 = params.f474887b;
            is0.c cVar2 = this.f410903j;
            int i19 = cVar2 != null ? cVar2.f294395e : -1;
            int i27 = renderInfo.f474882c;
            l4Var5.v(i18, i19, 0L, 360 - i27, i27, true, false, renderInfo.f474883d, l4Var5.f350595h, l4Var5.f350594g);
            i17 = 36160;
        } else {
            i17 = 36160;
        }
        android.opengl.GLES20.glBindFramebuffer(i17, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        is0.c cVar3 = this.f410903j;
        if (cVar3 == null) {
            return null;
        }
        int i28 = cVar3.f294395e;
        kotlin.jvm.internal.o.g(renderInfo, "renderInfo");
        android.util.Size drawSize = params.f474889d;
        kotlin.jvm.internal.o.g(drawSize, "drawSize");
        iVar.b(new zo5.f(false, i28, renderInfo, drawSize));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r7 = this;
            p05.l4 r0 = r7.f410902i
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L15
            long r3 = r0.f350593f
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L10
            r3 = r1
            goto L11
        L10:
            r3 = r2
        L11:
            if (r3 != r1) goto L15
            r3 = r1
            goto L16
        L15:
            r3 = r2
        L16:
            if (r3 != 0) goto L22
            r7.f410904k = r2
            java.lang.String r0 = "MicroMsg.WevisionRenderLogic"
            java.lang.String r1 = "init: wevision init fail, skip render"
            com.tencent.mars.xlog.Log.w(r0, r1)
            return
        L22:
            if (r0 == 0) goto L27
            r0.H(r2)
        L27:
            p05.l4 r0 = r7.f410902i
            if (r0 == 0) goto L2e
            com.tencent.mm.autogen.mmdata.rpt.WeVisionBaseDataStruct r0 = r0.F
            goto L2f
        L2e:
            r0 = 0
        L2f:
            if (r0 != 0) goto L32
            goto L35
        L32:
            r2 = 4
            r0.f62924d = r2
        L35:
            r7.f410899f = r1
            r7.f410904k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: so5.p0.c():void");
    }

    public final void d(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WevisionRenderLogic", "switchVirtualBackground() called with: enable = " + z17 + ", nowVbEnable = " + this.f410900g + ", nowAppliedVBEnable = " + this.f410901h);
        this.f410900g = z17;
    }
}
