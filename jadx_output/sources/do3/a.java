package do3;

/* loaded from: classes8.dex */
public class a implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public r45.hw4 f242090d;

    public a() {
        a();
    }

    public final void a() {
        this.f242090d = new r45.hw4();
        java.lang.String valueOf = java.lang.String.valueOf(c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_NFC_CPU_CARD_CONFIG_STRING, null));
        if (com.tencent.mm.sdk.platformtools.t8.K0(valueOf)) {
            this.f242090d.f376511d = new java.util.LinkedList();
            r45.hw4 hw4Var = this.f242090d;
            hw4Var.f376515h = 0L;
            hw4Var.f376513f = 86400;
            hw4Var.f376512e = 0;
            return;
        }
        try {
            this.f242090d.parseFrom(valueOf.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
            com.tencent.mars.xlog.Log.i("MicroMsg.CpuCardConfigManager", "nfcConfig version: %d", java.lang.Integer.valueOf(this.f242090d.f376512e));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CpuCardConfigManager", "parseConfig exp, " + e17.getLocalizedMessage());
            this.f242090d.f376511d = new java.util.LinkedList();
            r45.hw4 hw4Var2 = this.f242090d;
            hw4Var2.f376515h = 0L;
            hw4Var2.f376513f = 86400;
            hw4Var2.f376512e = 0;
        }
    }

    public void b(r45.hw4 hw4Var) {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CpuCardConfigManager", "setConfig account not ready");
            return;
        }
        if (hw4Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CpuCardConfigManager", "setConfig config");
            this.f242090d = hw4Var;
            try {
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_NFC_CPU_CARD_CONFIG_STRING, new java.lang.String(hw4Var.toByteArray(), com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CpuCardConfigManager", "save config exp, " + e17.getLocalizedMessage());
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CpuCardConfigManager", "save config exp, " + e18.getLocalizedMessage());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0020, code lost:
    
        if (r2 > 604800) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.CpuCardConfigManager"
            r1 = 0
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Exception -> L68
            android.nfc.NfcAdapter r2 = android.nfc.NfcAdapter.getDefaultAdapter(r2)     // Catch: java.lang.Exception -> L68
            if (r2 != 0) goto L11
            java.lang.String r2 = "Nfc not support no need update"
            com.tencent.mars.xlog.Log.i(r0, r2)     // Catch: java.lang.Exception -> L68
            goto L70
        L11:
            r45.hw4 r2 = r7.f242090d
            if (r2 == 0) goto L70
            int r2 = r2.f376513f
            r3 = 1800(0x708, float:2.522E-42)
            if (r2 >= r3) goto L1d
        L1b:
            r2 = r3
            goto L23
        L1d:
            r3 = 604800(0x93a80, float:8.47505E-40)
            if (r2 <= r3) goto L23
            goto L1b
        L23:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "now="
            r3.<init>(r4)
            long r4 = com.tencent.mm.sdk.platformtools.t8.i1()
            r3.append(r4)
            java.lang.String r4 = ", lastUpdateTime="
            r3.append(r4)
            r45.hw4 r4 = r7.f242090d
            long r4 = r4.f376515h
            r3.append(r4)
            java.lang.String r4 = ", updateFreq="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ", configUpdateFreq="
            r3.append(r4)
            r45.hw4 r4 = r7.f242090d
            int r4 = r4.f376513f
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.mars.xlog.Log.i(r0, r3)
            long r3 = com.tencent.mm.sdk.platformtools.t8.i1()
            r45.hw4 r5 = r7.f242090d
            long r5 = r5.f376515h
            long r3 = r3 - r5
            long r5 = (long) r2
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L70
            r1 = 1
            goto L70
        L68:
            r2 = move-exception
            java.lang.String r3 = ""
            java.lang.Object[] r4 = new java.lang.Object[r1]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r2, r3, r4)
        L70:
            if (r1 == 0) goto L90
            java.lang.String r1 = "do update cpu card config"
            com.tencent.mars.xlog.Log.i(r0, r1)
            com.tencent.mm.modelbase.r1 r0 = c01.d9.e()
            r1 = 1561(0x619, float:2.187E-42)
            r0.a(r1, r7)
            com.tencent.mm.modelbase.r1 r0 = c01.d9.e()
            co3.a r1 = new co3.a
            r45.hw4 r2 = r7.f242090d
            int r2 = r2.f376512e
            r1.<init>(r2)
            r0.g(r1)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: do3.a.c():void");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.r90 r90Var;
        c01.d9.e().q(1561, this);
        if (m1Var instanceof co3.a) {
            if (this.f242090d == null) {
                a();
            }
            r45.hw4 hw4Var = this.f242090d;
            hw4Var.f376515h = com.tencent.mm.sdk.platformtools.t8.i1();
            if (i17 == 0 && i18 == 0 && (r90Var = (r45.r90) ((co3.a) m1Var).f43800e.f70711b.f70700a) != null) {
                if (com.tencent.mm.sdk.platformtools.a0.c()) {
                    r90Var.f384652g = 0;
                }
                hw4Var.f376513f = r90Var.f384651f;
                hw4Var.f376514g = r90Var.f384652g;
                if (((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_NFC_OPEN_SWITCH_INT_SYNC, 0)).intValue() == 0) {
                    if (r90Var.f384652g == 1) {
                        com.tencent.mm.sdk.platformtools.t8.I1(com.tencent.mm.sdk.platformtools.x2.f193071a, new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
                    } else {
                        com.tencent.mm.sdk.platformtools.t8.I1(com.tencent.mm.sdk.platformtools.x2.f193071a, new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
                    }
                }
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_NFC_OPEN_DEFAULT_SWITCH_INT_SYNC, java.lang.Integer.valueOf(r90Var.f384652g));
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_NFC_OPEN_SWITCH_WORDING_STRING_SYNC, r90Var.f384653h);
                int i19 = hw4Var.f376512e;
                int i27 = r90Var.f384650e;
                if (i19 == i27) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CpuCardConfigManager", "nfc-onSceneEnd no config change return version = " + r90Var.f384650e);
                    b(hw4Var);
                    return;
                }
                hw4Var.f376512e = i27;
                com.tencent.mars.xlog.Log.i("MicroMsg.CpuCardConfigManager", "nfc-onSceneEnd config new version: %d", java.lang.Integer.valueOf(i27));
                java.util.LinkedList linkedList = r90Var.f384649d;
                if (linkedList == null || linkedList.isEmpty()) {
                    hw4Var.f376511d.clear();
                } else {
                    java.util.LinkedList linkedList2 = hw4Var.f376511d;
                    if (linkedList2 == null) {
                        hw4Var.f376511d = new java.util.LinkedList();
                    } else {
                        linkedList2.clear();
                    }
                    for (int i28 = 0; i28 < linkedList.size(); i28++) {
                        r45.qt qtVar = new r45.qt();
                        qtVar.f384250e = ((r45.qt) linkedList.get(i28)).f384250e;
                        int i29 = ((r45.qt) linkedList.get(i28)).f384251f;
                        qtVar.f384251f = i29;
                        com.tencent.mm.sdk.platformtools.t8.q1(java.lang.Integer.valueOf(i29));
                        java.util.LinkedList linkedList3 = qtVar.f384249d;
                        if (linkedList3 == null) {
                            qtVar.f384249d = new java.util.LinkedList();
                        } else {
                            linkedList3.clear();
                        }
                        for (int i37 = 0; i37 < ((r45.qt) linkedList.get(i28)).f384249d.size(); i37++) {
                            r45.s90 s90Var = new r45.s90();
                            java.util.LinkedList linkedList4 = s90Var.f385577d;
                            if (linkedList4 == null) {
                                s90Var.f385577d = new java.util.LinkedList();
                            } else {
                                linkedList4.clear();
                            }
                            for (int i38 = 0; i38 < ((r45.s90) ((r45.qt) linkedList.get(i28)).f384249d.get(i37)).f385577d.size(); i38++) {
                                r45.z40 z40Var = new r45.z40();
                                z40Var.f391685d = ((r45.z40) ((r45.s90) ((r45.qt) linkedList.get(i28)).f384249d.get(i37)).f385577d.get(i38)).f391685d;
                                z40Var.f391686e = ((r45.z40) ((r45.s90) ((r45.qt) linkedList.get(i28)).f384249d.get(i37)).f385577d.get(i38)).f391686e;
                                s90Var.f385577d.add(z40Var);
                            }
                            qtVar.f384249d.add(s90Var);
                        }
                        hw4Var.f376511d.add(qtVar);
                    }
                }
            }
            b(hw4Var);
        }
    }
}
