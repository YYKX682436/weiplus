package com.tencent.wechat.aff.ext_device;

/* loaded from: classes11.dex */
class ZIDL_J9_A7t6S1B extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.ext_device.e {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.ext_device.f f216683a;

    private native void ZIDL_GX(long j17, long j18, boolean z17, long j19, byte[] bArr);

    private native void ZIDL_HX(long j17, long j18, byte[][] bArr);

    private native void ZIDL_IX(long j17, long j18, byte[][] bArr);

    private native void ZIDL_LX(long j17, long j18, int i17, byte[] bArr);

    public void Q1(long j17, java.util.ArrayList arrayList) {
        ZIDL_HX(this.nativeHandler, j17, com.tencent.wechat.zidl2.ZidlUtil.stringListToArrayBytes(arrayList));
    }

    public void R1(long j17, java.util.ArrayList arrayList) {
        ZIDL_IX(this.nativeHandler, j17, com.tencent.wechat.zidl2.ZidlUtil.stringListToArrayBytes(arrayList));
    }

    @Override // com.tencent.wechat.aff.ext_device.e
    public void W(long j17, int i17, java.lang.String str) {
        ZIDL_LX(this.nativeHandler, j17, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public boolean ZIDL_A() {
        ((iy4.g) this.f216683a).getClass();
        return (ip.b.v().getInt("notification.status.webonline.push.open", 0) & 8192) != 0;
    }

    public void ZIDL_B(boolean z17) {
        ((iy4.g) this.f216683a).getClass();
        int o17 = c01.z1.o();
        int i17 = z17 ? o17 | 8192 : o17 & (-8193);
        ip.l.t(i17);
        c01.d9.b().p().w(40, java.lang.Integer.valueOf(i17));
    }

    public void ZIDL_C(int i17, byte[] bArr) {
        com.tencent.wechat.aff.ext_device.f fVar = this.f216683a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((iy4.g) fVar).getClass();
        ((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(com.tencent.mm.sdk.platformtools.x2.f193071a, 4, i17, str);
    }

    public void ZIDL_D() {
        ((iy4.g) this.f216683a).getClass();
        gm0.j1.d().g(new ug3.i(c01.d9.b().x()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        return r9.getBytes(java.nio.charset.StandardCharsets.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r3 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] ZIDL_E(int r9) {
        /*
            r8 = this;
            com.tencent.wechat.aff.ext_device.f r0 = r8.f216683a
            iy4.g r0 = (iy4.g) r0
            r0.getClass()
            java.lang.String r0 = "AffExtDeviceNativeUtilImpl"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            r3 = 0
            c01.f r4 = c01.d9.b()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            com.tencent.mm.storage.l8 r4 = r4.r()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            l75.e0 r5 = pp.a.f357364e2     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            com.tencent.mm.storage.m4 r4 = (com.tencent.mm.storage.m4) r4     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            r5 = 1
            android.database.Cursor r3 = r4.A(r5, r3, r3, r5)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            if (r3 == 0) goto L50
            int r4 = r3.getCount()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            if (r4 >= r9) goto L2d
            int r9 = r3.getCount()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
        L2d:
            java.lang.String r4 = "username"
            int r4 = r3.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            r5 = r2
        L35:
            if (r5 >= r9) goto L50
            boolean r6 = r3.moveToPosition(r5)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            if (r6 == 0) goto L4d
            java.lang.String r6 = r3.getString(r4)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            r1.append(r6)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            int r6 = r9 + (-1)
            if (r5 >= r6) goto L4d
            java.lang.String r6 = ","
            r1.append(r6)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
        L4d:
            int r5 = r5 + 1
            goto L35
        L50:
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.o.f(r9, r1)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L76
            r1.<init>()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L76
            java.lang.String r4 = "get session list: "
            r1.append(r4)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L76
            r1.append(r9)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L76
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L76
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L76
            if (r3 == 0) goto L88
        L70:
            r3.close()
            goto L88
        L74:
            r1 = move-exception
            goto L7e
        L76:
            r9 = move-exception
            goto L8f
        L78:
            r9 = move-exception
            java.lang.String r1 = ""
            r7 = r1
            r1 = r9
            r9 = r7
        L7e:
            java.lang.String r4 = "get session list error."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L76
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r1, r4, r2)     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L88
            goto L70
        L88:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r9 = r9.getBytes(r0)
            return r9
        L8f:
            if (r3 == 0) goto L94
            r3.close()
        L94:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.aff.ext_device.ZIDL_J9_A7t6S1B.ZIDL_E(int):byte[]");
    }

    public void ZIDL_F(int i17, boolean z17, int i18, byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.aff.ext_device.f fVar = this.f216683a;
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ((iy4.g) fVar).getClass();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_device_to_device_msg_sync, 1) == 1) {
            com.tencent.mm.autogen.events.MsgSynchronizeStartEvent msgSynchronizeStartEvent = new com.tencent.mm.autogen.events.MsgSynchronizeStartEvent();
            am.zj zjVar = msgSynchronizeStartEvent.f54502g;
            zjVar.f8570a = bArr;
            zjVar.f8571b = i17;
            zjVar.f8572c = !z17;
            zjVar.f8573d = str;
            msgSynchronizeStartEvent.e();
        }
    }

    public void ZIDL_GV(long j17, byte[] bArr, long j18, long j19, long j27, int i17) {
        ku5.f fVar;
        com.tencent.wechat.aff.ext_device.f fVar2 = this.f216683a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        iy4.g gVar = (iy4.g) fVar2;
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("AffExtDeviceNativeUtilImpl", "[+] getChatPackageAsync taskId = " + j17 + ", conversationId = " + str + ", fromTime = " + j18 + ", toTime = " + j19 + ", offset = " + j27 + ", limit = " + i17);
        synchronized (gVar) {
            if (gVar.f295962a == null) {
                gVar.f295962a = ((ku5.t0) ku5.t0.f312615d).o("Ext_Sync-Record-Pool", 4, 4, new java.util.concurrent.LinkedBlockingQueue());
            }
            fVar = gVar.f295962a;
            kotlin.jvm.internal.o.d(fVar);
        }
        fVar.execute(new iy4.d(str, j17, j18, j19, gVar, j27, i17));
    }

    public void ZIDL_HV(long j17) {
        iy4.g gVar = (iy4.g) this.f216683a;
        gVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(oo1.g.f347143a.c());
        com.tencent.wechat.aff.ext_device.e eVar = gVar.f295963b;
        if (eVar != null) {
            ((com.tencent.wechat.aff.ext_device.ZIDL_J9_A7t6S1B) eVar).Q1(j17, arrayList);
        }
    }

    public void ZIDL_IV(long j17) {
        iy4.g gVar = (iy4.g) this.f216683a;
        gVar.getClass();
        java.util.List c17 = oo1.g.f347143a.c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : c17) {
            if (!com.tencent.mm.storage.z3.L4((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        kz5.n0.O0(arrayList, arrayList2);
        com.tencent.wechat.aff.ext_device.e eVar = gVar.f295963b;
        if (eVar != null) {
            ((com.tencent.wechat.aff.ext_device.ZIDL_J9_A7t6S1B) eVar).R1(j17, arrayList2);
        }
    }

    public byte[] ZIDL_J() {
        ((iy4.g) this.f216683a).getClass();
        java.lang.String k17 = gm0.j1.b().k();
        if (k17 == null) {
            k17 = "";
        }
        return k17.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public long ZIDL_K() {
        ((iy4.g) this.f216683a).getClass();
        return c01.id.c();
    }

    public void ZIDL_LV(long j17, byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.aff.ext_device.f fVar = this.f216683a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        iy4.g gVar = (iy4.g) fVar;
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("AffExtDeviceNativeUtilImpl", "[notifyToConfirmSync] funcName=" + str + ", args=" + str2);
        java.lang.String k17 = gm0.j1.b().k();
        if (k17 == null) {
            k17 = "";
        }
        r45.yd6 yd6Var = new r45.yd6();
        yd6Var.f390994d = 25;
        yd6Var.f390995e = k17;
        yd6Var.f390996f = k17;
        yd6Var.f390997g = "" + java.lang.System.currentTimeMillis();
        r45.xd6 xd6Var = new r45.xd6();
        xd6Var.f389998d = str;
        xd6Var.f389999e = str2;
        yd6Var.f391000m = xd6Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 251;
        lVar.f70666c = "/cgi-bin/micromsg-bin/statusnotify";
        lVar.f70664a = yd6Var;
        lVar.f70665b = new r45.zd6();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        iVar.l().q(new iy4.f(gVar, j17));
    }

    @Override // com.tencent.wechat.aff.ext_device.e
    public void a(long j17, boolean z17, long j18, bw5.w0 w0Var) {
        ZIDL_GX(this.nativeHandler, j17, z17, j18, w0Var.toByteArrayOrNull());
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.ext_device.f fVar = (com.tencent.wechat.aff.ext_device.f) obj;
        this.f216683a = fVar;
        ((iy4.g) fVar).f295963b = this;
    }
}
