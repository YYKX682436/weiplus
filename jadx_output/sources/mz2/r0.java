package mz2;

/* loaded from: classes9.dex */
public class r0 extends com.tencent.mm.sdk.event.n implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent f333172d;

    /* renamed from: e, reason: collision with root package name */
    public int f333173e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f333174f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f333175g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f333176h;

    public r0() {
        super(0);
        this.f333173e = 0;
        this.f333174f = "";
        this.f333175g = false;
        this.f333176h = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    @Override // com.tencent.mm.sdk.event.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean callback(com.tencent.mm.sdk.event.IEvent r7) {
        /*
            r6 = this;
            com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent r7 = (com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent) r7
            boolean r0 = gm0.j1.a()
            r1 = 0
            java.lang.String r2 = "MicroMsg.GenFingerPrintRsaKeyEventListener"
            if (r0 != 0) goto L12
            java.lang.String r7 = "GenFingerPrintRsaKeyEventListener account is not ready"
            com.tencent.mars.xlog.Log.e(r2, r7)
            goto Lc8
        L12:
            java.lang.String r0 = "GenFingerPrintRsaKeyEventListener callback"
            com.tencent.mars.xlog.Log.i(r2, r0)
            r6.f333175g = r1
            boolean r0 = r7 instanceof com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent
            if (r0 == 0) goto Lc8
            boolean r0 = mz2.n0.c()
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L4d
            java.lang.String r7 = "device is not support FingerPrintAuth"
            com.tencent.mars.xlog.Log.e(r2, r7)
            am.cf r7 = new am.cf
            r7.<init>()
            r7.f6349a = r1
            com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent r0 = r6.f333172d
            r0.f54375h = r7
            r6.f333175g = r4
            java.lang.String r7 = "doCallback()"
            com.tencent.mars.xlog.Log.e(r2, r7)
            com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent r7 = r6.f333172d
            java.lang.Runnable r7 = r7.f192364d
            if (r7 == 0) goto L45
            r7.run()
        L45:
            boolean r7 = r6.f333175g
            if (r7 == 0) goto Lc7
            r6.f333172d = r3
            goto Lc7
        L4d:
            r6.f333172d = r7
            gm0.j1.i()
            gm0.y r7 = gm0.j1.n()
            com.tencent.mm.modelbase.r1 r7 = r7.f273288b
            r0 = 385(0x181, float:5.4E-43)
            r7.a(r0, r6)
            com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent r7 = r6.f333172d
            am.bf r7 = r7.f54374g
            boolean r0 = r7.f6248a
            int r5 = r7.f6249b
            r6.f333173e = r5
            java.lang.String r7 = r7.f6250c
            r6.f333174f = r7
            if (r0 != 0) goto La2
            java.lang.String r7 = mz2.n0.b()
            java.lang.String r0 = wo.w0.k()
            android.content.Context r5 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r5 = mz2.n0.a(r5)
            java.lang.String r7 = com.tencent.mm.plugin.fingerprint.FingerPrintAuth.getRsaKey(r5, r7, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "FingerPrintAuth.getRsaKey() success!"
            com.tencent.mars.xlog.Log.e(r2, r0)
            oz2.e r0 = new oz2.e
            r0.<init>(r7)
            gm0.j1.i()
            gm0.y r7 = gm0.j1.n()
            com.tencent.mm.modelbase.r1 r7 = r7.f273288b
            r7.g(r0)
            goto La8
        L9c:
            java.lang.String r7 = "FingerPrintAuth.getRsaKey() return null"
            com.tencent.mars.xlog.Log.e(r2, r7)
            goto La7
        La2:
            java.lang.String r7 = "FingerPrintAuth should gen rsa key!"
            com.tencent.mars.xlog.Log.e(r2, r7)
        La7:
            r1 = r4
        La8:
            if (r1 == 0) goto Lc7
            java.lang.String r7 = "FingerPrintAuth begin asyc gen rsa key!"
            com.tencent.mars.xlog.Log.i(r2, r7)
            mz2.c2 r7 = new mz2.c2
            mz2.q0 r0 = new mz2.q0
            r0.<init>(r6, r3)
            r7.<init>(r0)
            mz2.a2 r0 = new mz2.a2
            r0.<init>(r7)
            java.lang.Class<mz2.c2> r7 = mz2.c2.class
            java.lang.String r7 = r7.getName()
            s75.d.b(r0, r7)
        Lc7:
            r1 = r4
        Lc8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mz2.r0.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof oz2.e) {
            am.cf cfVar = new am.cf();
            cfVar.f6349a = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.GenFingerPrintRsaKeyEventListener", "NetSceneTenpayGetOpenTouchCert doscene return errcode " + i18 + " errmsg" + str);
            if (i17 == 0 && i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GenFingerPrintRsaKeyEventListener", "NetSceneTenpayGetOpenTouchCert doscene is success");
                oz2.e eVar = (oz2.e) m1Var;
                java.lang.String str2 = eVar.f350250d;
                java.lang.String str3 = eVar.f350251e;
                java.lang.String b17 = mz2.n0.b();
                java.lang.String k17 = wo.w0.k();
                java.lang.String a17 = com.tencent.mm.wallet_core.model.f1.a();
                if (android.text.TextUtils.isEmpty(com.tencent.mm.plugin.fingerprint.FingerPrintAuth.genOpenFPEncrypt(mz2.n0.a(com.tencent.mm.sdk.platformtools.x2.f193071a), b17, k17, java.lang.String.valueOf(this.f333173e), a17, "", str2, str3, wo.w0.m()))) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "FingerPrintAuth.genOpenFPEncrypt failed!");
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "FingerPrintAuth.genOpenFPEncrypt success!");
                    cfVar.f6349a = true;
                }
                java.lang.String genPayFPEncrypt = com.tencent.mm.plugin.fingerprint.FingerPrintAuth.genPayFPEncrypt(mz2.n0.a(com.tencent.mm.sdk.platformtools.x2.f193071a), b17, k17, java.lang.String.valueOf(this.f333173e), a17, this.f333174f, wo.w0.m());
                java.lang.String genOpenFPSign = com.tencent.mm.plugin.fingerprint.FingerPrintAuth.genOpenFPSign(mz2.n0.a(com.tencent.mm.sdk.platformtools.x2.f193071a), mz2.n0.b(), wo.w0.k(), genPayFPEncrypt);
                cfVar.f6350b = genPayFPEncrypt;
                cfVar.f6351c = genOpenFPSign;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "NetSceneTenpayGetOpenTouchCert doscene is fail");
            }
            gm0.j1.i();
            gm0.j1.n().f273288b.q(385, this);
            this.f333172d.f54375h = cfVar;
            this.f333175g = true;
            com.tencent.mars.xlog.Log.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "doCallback()");
            java.lang.Runnable runnable = this.f333172d.f192364d;
            if (runnable != null) {
                runnable.run();
            }
            if (this.f333175g) {
                this.f333172d = null;
            }
        }
    }
}
