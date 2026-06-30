package io5;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final io5.b f293533a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f293534b;

    /* renamed from: c, reason: collision with root package name */
    public int f293535c;

    /* renamed from: d, reason: collision with root package name */
    public int f293536d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f293537e;

    /* renamed from: f, reason: collision with root package name */
    public int f293538f;

    /* renamed from: g, reason: collision with root package name */
    public int f293539g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f293540h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.ContentResolver f293541i;

    /* renamed from: j, reason: collision with root package name */
    public final io5.a f293542j;

    /* renamed from: k, reason: collision with root package name */
    public di3.d f293543k;

    public e(android.content.Context context, io5.b listener, int i17, kotlin.jvm.internal.i iVar) {
        if ((i17 & 1) != 0) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
        }
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f293533a = listener;
        this.f293539g = 1;
        this.f293541i = context.getContentResolver();
        this.f293542j = new io5.a(new io5.d(this));
    }

    public final boolean a() {
        if (this.f293537e) {
            if ((((this.f293535c + this.f293538f) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) / 90) % 2 != 1) {
                return false;
            }
        } else if (((((this.f293538f + this.f293536d) + this.f293535c) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) / 90) % 2 != 1) {
            return false;
        }
        return true;
    }

    public final void b() {
        android.content.res.Configuration configuration = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getConfiguration();
        kotlin.jvm.internal.o.f(configuration, "getConfiguration(...)");
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        int rotation = ((android.view.WindowManager) systemService).getDefaultDisplay().getRotation();
        int i17 = 2;
        if (((rotation != 0 && rotation != 2) || configuration.orientation != 2) && ((rotation != 1 && rotation != 3) || configuration.orientation != 1)) {
            i17 = 1;
        }
        if (this.f293539g != i17) {
            this.f293539g = i17;
            fo5.o oVar = (fo5.o) this.f293533a;
            fo5.r0 r0Var = oVar.f265037a;
            r0Var.getClass();
            ((jp5.o) i95.n0.c(jp5.o.class)).W2(r0Var.f265098q.f293539g == 1 ? 0 : 270);
            r0Var.h();
            r0Var.i();
            fo5.r0 r0Var2 = oVar.f265037a;
            r0Var2.w();
            fo5.r0.g(r0Var2);
            oVar.f265037a.x();
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPDeviceController", "local natural ori changed to " + i17);
        }
    }

    public final void c(int i17) {
        boolean z17 = (i17 & 512) == 512;
        boolean z18 = (i17 & 1024) == 1024;
        int i18 = z17 & z18 ? 270 : z17 ? 90 : z18 ? 180 : 0;
        int i19 = this.f293538f;
        io5.b bVar = this.f293533a;
        if (i19 != i18) {
            this.f293538f = i18;
            fo5.r0 r0Var = ((fo5.o) bVar).f265037a;
            r0Var.y();
            fo5.r0.g(r0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPDeviceController", "remote device rotate changed to " + i18);
        }
        boolean z19 = (i17 & 2048) == 2048;
        if (z19 != this.f293540h) {
            this.f293540h = z19;
            fo5.r0.g(((fo5.o) bVar).f265037a);
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPDeviceController", "remote device landscape mode changed to " + z19);
        }
    }

    public final void d(boolean z17) {
        if (z17 != this.f293537e) {
            this.f293537e = z17;
            fo5.r0 r0Var = ((fo5.o) this.f293533a).f265037a;
            r0Var.w();
            r0Var.z();
            fo5.r0.g(r0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPDeviceController", "system rotation lock changed to " + z17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r3 = this;
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            int r0 = com.tencent.mm.ui.bl.l(r0)
            if (r0 == 0) goto L1b
            r1 = 1
            if (r0 == r1) goto L18
            r1 = 2
            if (r0 == r1) goto L15
            r1 = 3
            if (r0 == r1) goto L12
            goto L1b
        L12:
            r0 = 270(0x10e, float:3.78E-43)
            goto L1c
        L15:
            r0 = 180(0xb4, float:2.52E-43)
            goto L1c
        L18:
            r0 = 90
            goto L1c
        L1b:
            r0 = 0
        L1c:
            int r1 = r3.f293535c
            if (r1 == r0) goto L3e
            r3.f293535c = r0
            io5.b r1 = r3.f293533a
            fo5.o r1 = (fo5.o) r1
            fo5.r0 r1 = r1.f265037a
            r1.x()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ui rotate changed to "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MicroMsg.VoIPMPDeviceController"
            com.tencent.mars.xlog.Log.i(r1, r0)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io5.e.e():void");
    }
}
