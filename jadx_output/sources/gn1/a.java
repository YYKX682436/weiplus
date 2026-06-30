package gn1;

/* loaded from: classes11.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    public static boolean c() {
        java.lang.String d17 = com.tencent.mm.pluginsdk.model.app.j1.d(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.google.android.projection.gearhead");
        boolean equals = "eeb557fc154afc0d8eec621bdc7ea950".equals(d17);
        com.tencent.mars.xlog.Log.i("MicroMsg.auto.AutoLogic", "isInstallAutoApp result:%b md5:%s", java.lang.Boolean.valueOf(equals), d17);
        return equals;
    }

    public static boolean f() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_auto, 1) == 1;
    }

    public static boolean h() {
        boolean z17;
        boolean z18 = ((android.app.UiModeManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("uimode")).getCurrentModeType() == 3;
        if (z18) {
            java.util.Iterator<android.hardware.usb.UsbDevice> it = ((android.hardware.usb.UsbManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("usb")).getDeviceList().values().iterator();
            while (it.hasNext()) {
                if (it.next().getInterface(0).getInterfaceClass() == 1) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.auto.AutoLogic", "isOpenCarMode carMode:%b isAoapMode:%b", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        return z18 && z17;
    }

    public final z2.r0 b(final java.lang.String str, java.lang.String str2) {
        java.util.List list;
        java.lang.String str3;
        java.lang.String string;
        java.lang.String trim;
        if (!f()) {
            return null;
        }
        if (!h()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.auto.AutoLogic", "not open car mode");
            return null;
        }
        if (!c()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.auto.AutoLogic", "not install auto app");
            return null;
        }
        jx3.f.INSTANCE.idkeyStat(1496L, 0L, 1L, false);
        android.content.Intent putExtra = new android.content.Intent().addFlags(32).setAction("com.tencent.mm.permission.MM_AUTO_HEARD_MESSAGE").putExtra("key_username", str);
        if (fp.h.c(26)) {
            putExtra.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        }
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(com.tencent.mm.sdk.platformtools.x2.f193071a, str.hashCode(), putExtra, fp.g0.b(134217728));
        android.content.Intent putExtra2 = new android.content.Intent().addFlags(32).setAction("com.tencent.mm.permission.MM_AUTO_REPLY_MESSAGE").putExtra("key_username", str);
        if (fp.h.c(26)) {
            putExtra2.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        }
        android.app.PendingIntent broadcast2 = android.app.PendingIntent.getBroadcast(com.tencent.mm.sdk.platformtools.x2.f193071a, str.hashCode(), putExtra2, fp.g0.b(134217728));
        z2.v1 v1Var = new z2.v1("key_voice_reply_text", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490541y0), null, true, 0, new android.os.Bundle(), new java.util.HashSet());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final int d17 = c01.h2.d(str, null);
        if (d17 > 10) {
            d17 = 10;
        }
        final com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) c01.d9.b().u();
        int i17 = 0;
        iz5.a.g(null, g9Var.f193981g != null);
        final java.lang.String X8 = g9Var.X8(str);
        if (g9Var.Da(X8)) {
            list = ot0.c3.l().e("getLastReachMsg", new yz5.a() { // from class: com.tencent.mm.storage.g9$$d1
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return new java.util.ArrayList(ot0.z2.f348822a.B0(com.tencent.mm.storage.g9.this.f193989r, X8, str, d17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$o1
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.storage.g9 g9Var2 = com.tencent.mm.storage.g9.this;
                    g9Var2.getClass();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    android.database.Cursor f17 = g9Var2.f193989r.f("SELECT * FROM " + X8 + " WHERE" + g9Var2.Z8(str) + "AND status = 3 AND type <> 10000 ORDER BY createTime DESC LIMIT " + d17, null, 2);
                    while (f17.moveToNext()) {
                        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                        f9Var.convertFrom(f17);
                        arrayList2.add(f9Var);
                    }
                    f17.close();
                    return new java.util.ArrayList(arrayList2);
                }
            });
        } else {
            boolean Pb = g9Var.Pb(X8);
            l75.k0 k0Var = g9Var.f193989r;
            if (Pb) {
                list = ot0.z2.f348822a.B0(k0Var, X8, str, d17);
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                android.database.Cursor f17 = k0Var.f("SELECT * FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND status = 3 AND type <> 10000 ORDER BY createTime DESC LIMIT " + d17, null, 2);
                while (f17.moveToNext()) {
                    com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                    f9Var.convertFrom(f17);
                    arrayList2.add(f9Var);
                }
                f17.close();
                list = arrayList2;
            }
        }
        int size = list.size() - 1;
        long j17 = 0;
        while (size >= 0) {
            com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) list.get(size);
            if (com.tencent.mm.storage.z3.R4(f9Var2.Q0())) {
                java.lang.String Q0 = f9Var2.Q0();
                int t17 = c01.w9.t(f9Var2.j());
                if (t17 != -1 && (trim = f9Var2.j().substring(i17, t17).trim()) != null && trim.length() > 0) {
                    Q0 = trim;
                }
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(Q0, true);
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                str3 = c01.a2.c(n17, Q0);
                if (com.tencent.mm.storage.z3.R4(Q0) && (n17.d1().equals(str3) || com.tencent.mm.sdk.platformtools.t8.K0(str3))) {
                    str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b5v);
                }
            } else {
                str3 = null;
            }
            if (f9Var2.J2()) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490517xd);
            } else if (f9Var2.b3()) {
                if (!com.tencent.mm.storage.z3.R4(f9Var2.Q0()) || f9Var2.A0() == 1) {
                    string = f9Var2.j();
                } else {
                    int t18 = c01.w9.t(f9Var2.j());
                    string = t18 != -1 ? f9Var2.j().substring(t18 + 1).trim() : f9Var2.j();
                }
            } else if (f9Var2.g3()) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490600zm);
            } else if (f9Var2.isVideo() || f9Var2.Y2()) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490596zi);
            } else if (f9Var2.k2()) {
                ot0.q v17 = ot0.q.v(f9Var2.j());
                if (v17 != null) {
                    int i18 = v17.f348666i;
                    if (i18 != 2) {
                        if (i18 == 3) {
                            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490494wn);
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            java.lang.String str4 = v17.f348654f;
                            objArr[0] = str4 != null ? str4 : "";
                            string = java.lang.String.format(string2, objArr);
                        } else if (i18 == 4) {
                            java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490596zi);
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            java.lang.String str5 = v17.f348654f;
                            objArr2[0] = str5 != null ? str5 : "";
                            string = java.lang.String.format(string3, objArr2);
                        } else if (i18 != 5) {
                            if (i18 != 6) {
                                if (i18 == 8) {
                                    java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490382tf);
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    java.lang.String str6 = v17.f348654f;
                                    objArr3[0] = str6 != null ? str6 : "";
                                    string = java.lang.String.format(string4, objArr3);
                                } else if (i18 == 10 || i18 == 13) {
                                    java.lang.String string5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490523xj);
                                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                                    java.lang.String str7 = v17.f348654f;
                                    objArr4[0] = str7 != null ? str7 : "";
                                    string = java.lang.String.format(string5, objArr4);
                                } else if (i18 == 19) {
                                    java.lang.String string6 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490535xv);
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    java.lang.String str8 = v17.f348654f;
                                    objArr5[0] = str8 != null ? str8 : "";
                                    string = java.lang.String.format(string6, objArr5);
                                } else if (i18 == 24) {
                                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491223ce4);
                                } else if (i18 != 130) {
                                    if (i18 == 15) {
                                        java.lang.String string7 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490384th);
                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                        java.lang.String str9 = v17.f348654f;
                                        objArr6[0] = str9 != null ? str9 : "";
                                        string = java.lang.String.format(string7, objArr6);
                                    } else if (i18 == 16) {
                                        java.lang.String string8 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490445v9);
                                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                                        java.lang.String str10 = v17.f348654f;
                                        objArr7[0] = str10 != null ? str10 : "";
                                        string = java.lang.String.format(string8, objArr7);
                                    }
                                }
                            }
                            java.lang.String string9 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490430uv);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            java.lang.String n18 = v17.n();
                            objArr8[0] = n18 != null ? n18 : "";
                            string = java.lang.String.format(string9, objArr8);
                        } else {
                            java.lang.String string10 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490589za);
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            java.lang.String str11 = v17.f348654f;
                            objArr9[0] = str11 != null ? str11 : "";
                            string = java.lang.String.format(string10, objArr9);
                        }
                    } else {
                        string = java.lang.String.format(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490517xd), new java.lang.Object[0]);
                    }
                }
                string = null;
            } else if (f9Var2.C2()) {
                java.lang.String string11 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490382tf);
                s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
                if (wi6 != null) {
                    y12.h hVar = (y12.h) wi6;
                    com.tencent.mm.storage.emotion.EmojiInfo M = hVar.M(f9Var2);
                    if (M == null || com.tencent.mm.sdk.platformtools.t8.K0(hVar.v(M.getMd5()))) {
                        string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490382tf);
                    } else {
                        string = "[" + hVar.v(M.getMd5()) + "]";
                    }
                } else {
                    string = string11;
                }
            } else if (f9Var2.L2()) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490470vz);
            } else if (f9Var2.k3() || f9Var2.l3()) {
                java.lang.String j18 = f9Var2.j();
                int i19 = com.tencent.mm.storage.f9.f193926r2;
                if (!j18.equals("voip_content_voice")) {
                    java.lang.String j19 = f9Var2.j();
                    com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
                    am.y00 y00Var = voipEvent.f54945g;
                    y00Var.f8415b = 1;
                    y00Var.f8414a = j19;
                    voipEvent.e();
                    if (!(voipEvent.f54946h.f8500a == 3)) {
                        string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490602zo);
                    }
                }
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490600zm);
            } else if (f9Var2.E2()) {
                string = java.lang.String.format(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490445v9), ((com.tencent.mm.storage.g9) c01.d9.b().u()).D3(f9Var2.j()).c());
            } else {
                if (f9Var2.getType() == -1879048186) {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n_k);
                }
                string = null;
            }
            if (string == null) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490482wb);
            }
            if (str3 != null) {
                string = java.lang.String.format("%s: %s", str3, string);
            }
            if (string != null) {
                arrayList.add(string);
            }
            if (size == 0) {
                j17 = f9Var2.getCreateTime();
            }
            size--;
            i17 = 0;
        }
        z2.n0 n0Var = new z2.n0();
        n0Var.f469498a = new z2.m0((java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]), v1Var, broadcast2, broadcast, new java.lang.String[]{str2}, j17);
        return n0Var;
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.AutoNewMessageEvent autoNewMessageEvent = (com.tencent.mm.autogen.events.AutoNewMessageEvent) iEvent;
        if (autoNewMessageEvent instanceof com.tencent.mm.autogen.events.AutoNewMessageEvent) {
            try {
                am.h0 h0Var = autoNewMessageEvent.f53991g;
                h0Var.f6804c = b(h0Var.f6802a, h0Var.f6803b);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.auto.AutoLogic", th6, "", new java.lang.Object[0]);
            }
        }
        return false;
    }
}
