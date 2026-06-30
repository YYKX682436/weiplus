package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public abstract class x1 {
    public static int a(ot0.q qVar, boolean z17) {
        if (qVar == null || qVar.A1 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CAppMsgUtil", "content == null || content.c2cNewAAType <= 0");
            return -8868722;
        }
        java.lang.String str = qVar.f348736z1;
        com.tencent.mm.autogen.events.WalletQueryAAStatusEvent walletQueryAAStatusEvent = new com.tencent.mm.autogen.events.WalletQueryAAStatusEvent();
        walletQueryAAStatusEvent.f54967g.f8050a = str;
        walletQueryAAStatusEvent.e();
        int i17 = walletQueryAAStatusEvent.f54968h.f8163a;
        if (i17 == 4 && qVar.A1 == 5) {
            return -12479656;
        }
        if (i17 != 3 && i17 != 2 && i17 != 4) {
            com.tencent.mm.ui.chatting.w1 e17 = e(qVar);
            int i18 = qVar.A1;
            long j17 = e17.f206184e;
            int i19 = e17.f206183d;
            int i27 = e17.f206182c;
            int i28 = e17.f206180a;
            int i29 = e17.f206181b;
            if (i18 == 2 || i18 == 3) {
                if (i28 == 1 || z17) {
                    if (i29 > 0 && i27 >= 0 && i19 >= 0) {
                        if (i29 == 1 || i29 == 2) {
                            return -12479656;
                        }
                    }
                } else if (i28 == 2 && i29 > 0 && j17 >= 0 && i29 == 1) {
                    return -12479656;
                }
            } else if (i18 == 5) {
                if (i28 == 1 || z17) {
                    if (i29 <= 0 || i27 < 0 || i19 < 0) {
                        return -8868722;
                    }
                    if (i29 == 1 || i29 == 2) {
                        return -12479656;
                    }
                } else {
                    if (i28 != 2) {
                        int i37 = f(qVar).f206181b;
                        if (i37 > 0) {
                            return ((i37 == 1 || i37 == 2 || i37 == 3) && !qVar.F1) ? -12479656 : -8868722;
                        }
                        return -8868722;
                    }
                    if (i29 > 0 && j17 >= 0 && i29 == 1) {
                        return -12479656;
                    }
                }
            }
            return -8868722;
        }
        return -8868722;
    }

    public static float b(ot0.q qVar, boolean z17, boolean z18) {
        if (qVar == null || qVar.A1 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CAppMsgUtil", "content == null || content.c2cNewAAType <= 0");
            return 0.3f;
        }
        java.lang.String str = qVar.f348736z1;
        com.tencent.mm.autogen.events.WalletQueryAAStatusEvent walletQueryAAStatusEvent = new com.tencent.mm.autogen.events.WalletQueryAAStatusEvent();
        walletQueryAAStatusEvent.f54967g.f8050a = str;
        walletQueryAAStatusEvent.e();
        int i17 = walletQueryAAStatusEvent.f54968h.f8163a;
        if (i17 == 4 && qVar.A1 == 5) {
            return z18 ? 0.5f : 0.8f;
        }
        if (i17 != 3 && i17 != 2 && i17 != 4) {
            com.tencent.mm.ui.chatting.w1 e17 = e(qVar);
            int i18 = qVar.A1;
            long j17 = e17.f206184e;
            int i19 = e17.f206183d;
            int i27 = e17.f206182c;
            int i28 = e17.f206180a;
            int i29 = e17.f206181b;
            if (i18 == 2 || i18 == 3) {
                if (i28 == 1 || z17) {
                    if (i29 > 0 && i27 >= 0 && i19 >= 0) {
                        if (i29 == 1 || i29 == 2) {
                            return z18 ? 0.5f : 0.8f;
                        }
                    }
                } else if (i28 == 2 && i29 > 0 && j17 >= 0 && i29 == 1) {
                    return z18 ? 0.5f : 0.8f;
                }
            } else if (i18 == 5) {
                if (i28 == 1 || z17) {
                    if (i29 <= 0 || i27 < 0 || i19 < 0) {
                        return 0.3f;
                    }
                    if (i29 == 1 || i29 == 2) {
                        return z18 ? 0.5f : 0.8f;
                    }
                } else {
                    if (i28 != 2) {
                        int i37 = f(qVar).f206181b;
                        if (i37 <= 0) {
                            return 0.3f;
                        }
                        if ((i37 == 1 || i37 == 2 || i37 == 3) && !qVar.F1) {
                            return z18 ? 0.5f : 0.8f;
                        }
                        return 0.3f;
                    }
                    if (i29 > 0 && j17 >= 0 && i29 == 1) {
                        return z18 ? 0.5f : 0.8f;
                    }
                }
            }
            return 0.3f;
        }
        return 0.3f;
    }

    public static int c(ot0.q qVar, boolean z17) {
        if (qVar == null || qVar.A1 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CAppMsgUtil", "content == null || content.c2cNewAAType <= 0");
            return z17 ? com.tencent.mm.R.drawable.f480656k : com.tencent.mm.R.drawable.f480651i;
        }
        java.lang.String str = qVar.f348736z1;
        com.tencent.mm.autogen.events.WalletQueryAAStatusEvent walletQueryAAStatusEvent = new com.tencent.mm.autogen.events.WalletQueryAAStatusEvent();
        walletQueryAAStatusEvent.f54967g.f8050a = str;
        walletQueryAAStatusEvent.e();
        int i17 = walletQueryAAStatusEvent.f54968h.f8163a;
        if (i17 == 4 && qVar.A1 == 5) {
            return qVar.F1 ? z17 ? com.tencent.mm.R.drawable.f480656k : com.tencent.mm.R.drawable.f480651i : z17 ? com.tencent.mm.R.drawable.f480652j : com.tencent.mm.R.drawable.f480650h;
        }
        if (i17 == 3 || i17 == 2) {
            return z17 ? com.tencent.mm.R.drawable.bqm : com.tencent.mm.R.drawable.ahe;
        }
        if (i17 == 4) {
            return z17 ? com.tencent.mm.R.drawable.f480656k : com.tencent.mm.R.drawable.f480651i;
        }
        com.tencent.mm.ui.chatting.w1 e17 = e(qVar);
        int i18 = qVar.A1;
        long j17 = e17.f206184e;
        int i19 = e17.f206183d;
        int i27 = e17.f206182c;
        int i28 = e17.f206180a;
        int i29 = e17.f206181b;
        if (i18 == 2 || i18 == 3) {
            if (i28 == 1 || z17) {
                if (i29 <= 0 || i27 < 0 || i19 < 0) {
                    return z17 ? com.tencent.mm.R.drawable.f480656k : com.tencent.mm.R.drawable.f480651i;
                }
                if (i29 == 1 || i29 == 2) {
                    return z17 ? com.tencent.mm.R.drawable.f480652j : com.tencent.mm.R.drawable.f480650h;
                }
                if (i29 == 3 || i29 == 4) {
                    return z17 ? com.tencent.mm.R.drawable.f480656k : com.tencent.mm.R.drawable.f480651i;
                }
            } else {
                if (i28 != 2) {
                    return i28 == 3 ? z17 ? com.tencent.mm.R.drawable.f480656k : com.tencent.mm.R.drawable.f480651i : z17 ? com.tencent.mm.R.drawable.f480656k : com.tencent.mm.R.drawable.f480651i;
                }
                if (i29 <= 0 || j17 < 0) {
                    return z17 ? com.tencent.mm.R.drawable.f480656k : com.tencent.mm.R.drawable.f480651i;
                }
                if (i29 == 1) {
                    return z17 ? com.tencent.mm.R.drawable.f480652j : com.tencent.mm.R.drawable.f480650h;
                }
                if (i29 == 2 || i29 == 3 || i29 == 4) {
                    return z17 ? com.tencent.mm.R.drawable.f480656k : com.tencent.mm.R.drawable.f480651i;
                }
            }
        } else if (i18 == 5) {
            if (i28 == 1 || z17) {
                if (i29 <= 0 || i27 < 0 || i19 < 0) {
                    return z17 ? com.tencent.mm.R.drawable.f480656k : com.tencent.mm.R.drawable.f480651i;
                }
                if (i29 == 1 || i29 == 2) {
                    return z17 ? com.tencent.mm.R.drawable.f480652j : com.tencent.mm.R.drawable.f480650h;
                }
                if (i29 == 3 || i29 == 4) {
                    return z17 ? com.tencent.mm.R.drawable.f480656k : com.tencent.mm.R.drawable.f480651i;
                }
            } else if (i28 != 2) {
                int i37 = f(qVar).f206181b;
                if (i37 <= 0) {
                    return z17 ? com.tencent.mm.R.drawable.f480656k : com.tencent.mm.R.drawable.f480651i;
                }
                if (i37 == 1 || i37 == 2 || i37 == 3) {
                    return qVar.F1 ? z17 ? com.tencent.mm.R.drawable.f480656k : com.tencent.mm.R.drawable.f480651i : z17 ? com.tencent.mm.R.drawable.f480652j : com.tencent.mm.R.drawable.f480650h;
                }
                if (i37 == 4) {
                    return z17 ? com.tencent.mm.R.drawable.f480656k : com.tencent.mm.R.drawable.f480651i;
                }
            } else {
                if (i29 <= 0 || j17 < 0) {
                    return z17 ? com.tencent.mm.R.drawable.f480656k : com.tencent.mm.R.drawable.f480651i;
                }
                if (i29 == 1) {
                    return z17 ? com.tencent.mm.R.drawable.f480652j : com.tencent.mm.R.drawable.f480650h;
                }
                if (i29 == 2 || i29 == 3 || i29 == 4) {
                    return z17 ? com.tencent.mm.R.drawable.f480656k : com.tencent.mm.R.drawable.f480651i;
                }
            }
        }
        return z17 ? com.tencent.mm.R.drawable.f480656k : com.tencent.mm.R.drawable.f480651i;
    }

    public static int d(ot0.q qVar, boolean z17) {
        if (qVar == null || qVar.A1 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CAppMsgUtil", "content == null || content.c2cNewAAType <= 0");
            return com.tencent.mm.R.raw.c2c_aa_icon_close;
        }
        com.tencent.mm.ui.chatting.w1 e17 = e(qVar);
        int i17 = qVar.A1;
        long j17 = e17.f206184e;
        int i18 = e17.f206183d;
        int i19 = e17.f206182c;
        int i27 = e17.f206180a;
        int i28 = e17.f206181b;
        if (i17 == 2 || i17 == 3) {
            if (i27 == 1 || z17) {
                return (i28 <= 0 || i19 < 0 || i18 < 0) ? com.tencent.mm.R.raw.c2c_aa_icon_close : (i28 == 1 || i28 == 2) ? com.tencent.mm.R.raw.c2c_aa_icon_default : i28 != 3 ? com.tencent.mm.R.raw.c2c_aa_icon_close : com.tencent.mm.R.raw.c2c_aa_icon_check;
            }
            if (i27 != 2 || i28 <= 0 || j17 < 0) {
                return com.tencent.mm.R.raw.c2c_aa_icon_close;
            }
            if (i28 == 1) {
                return com.tencent.mm.R.raw.c2c_aa_icon_default;
            }
            if (i28 == 2 || i28 == 3) {
                return com.tencent.mm.R.raw.c2c_aa_icon_check;
            }
        } else if (i17 == 5) {
            if (i27 == 1 || z17) {
                if (i28 <= 0 || i19 < 0 || i18 < 0) {
                    return com.tencent.mm.R.raw.c2c_aa_icon_close;
                }
                if (i28 == 1 || i28 == 2) {
                    return com.tencent.mm.R.raw.c2c_aa_icon_default;
                }
                if (i28 == 3) {
                    return com.tencent.mm.R.raw.c2c_aa_icon_check;
                }
            } else {
                if (i27 != 2) {
                    int i29 = f(qVar).f206181b;
                    return i29 > 0 ? ((i29 == 1 || i29 == 2 || i29 == 3) && !qVar.F1) ? com.tencent.mm.R.raw.c2c_aa_icon_default : com.tencent.mm.R.raw.c2c_aa_icon_close : com.tencent.mm.R.raw.c2c_aa_icon_close;
                }
                if (i28 <= 0 || j17 < 0) {
                    return com.tencent.mm.R.raw.c2c_aa_icon_close;
                }
                if (i28 == 1) {
                    return com.tencent.mm.R.raw.c2c_aa_icon_default;
                }
                if (i28 == 2 || i28 == 3) {
                    return com.tencent.mm.R.raw.c2c_aa_icon_check;
                }
            }
        }
        return com.tencent.mm.R.raw.c2c_aa_icon_close;
    }

    public static com.tencent.mm.ui.chatting.w1 e(ot0.q qVar) {
        java.lang.String r17 = c01.z1.r();
        int i17 = qVar.A1;
        if (i17 == 2 || i17 == 3 || i17 == 5) {
            if (!com.tencent.mm.sdk.platformtools.t8.L0(qVar.D1)) {
                java.util.Iterator it = ((java.util.ArrayList) qVar.D1).iterator();
                while (it.hasNext()) {
                    java.lang.String[] split = ((java.lang.String) it.next()).split(",");
                    if (split.length == 4 && split[0].equals(r17)) {
                        return new com.tencent.mm.ui.chatting.w1(1, com.tencent.mm.sdk.platformtools.t8.P(split[1], -1), com.tencent.mm.sdk.platformtools.t8.P(split[2], -1), com.tencent.mm.sdk.platformtools.t8.P(split[3], -1));
                    }
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.L0(qVar.E1)) {
                java.util.Iterator it6 = ((java.util.ArrayList) qVar.E1).iterator();
                while (it6.hasNext()) {
                    java.lang.String[] split2 = ((java.lang.String) it6.next()).split(",");
                    if (split2.length == 3 && split2[0].equals(r17)) {
                        return new com.tencent.mm.ui.chatting.w1(2, com.tencent.mm.sdk.platformtools.t8.P(split2[2], -1), com.tencent.mm.sdk.platformtools.t8.V(split2[1], -1L));
                    }
                }
            }
        }
        return new com.tencent.mm.ui.chatting.w1(3);
    }

    public static com.tencent.mm.ui.chatting.w1 f(ot0.q qVar) {
        int i17 = qVar.A1;
        if ((i17 == 2 || i17 == 3 || i17 == 5) && !com.tencent.mm.sdk.platformtools.t8.L0(qVar.D1)) {
            java.util.Iterator it = ((java.util.ArrayList) qVar.D1).iterator();
            while (it.hasNext()) {
                java.lang.String[] split = ((java.lang.String) it.next()).split(",");
                if (split.length == 4) {
                    return new com.tencent.mm.ui.chatting.w1(1, com.tencent.mm.sdk.platformtools.t8.P(split[1], -1), com.tencent.mm.sdk.platformtools.t8.P(split[2], -1), com.tencent.mm.sdk.platformtools.t8.P(split[3], -1));
                }
            }
        }
        return new com.tencent.mm.ui.chatting.w1(3);
    }

    public static java.lang.String g(ot0.q qVar, boolean z17) {
        if (qVar == null || qVar.A1 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CAppMsgUtil", "content == null || content.c2cNewAAType <= 0");
            return z17 ? qVar.f348684m1 : qVar.f348688n1;
        }
        com.tencent.mm.ui.chatting.w1 e17 = e(qVar);
        java.lang.String str = qVar.f348736z1;
        com.tencent.mm.autogen.events.WalletQueryAAStatusEvent walletQueryAAStatusEvent = new com.tencent.mm.autogen.events.WalletQueryAAStatusEvent();
        walletQueryAAStatusEvent.f54967g.f8050a = str;
        walletQueryAAStatusEvent.e();
        int i17 = qVar.A1;
        long j17 = e17.f206184e;
        int i18 = e17.f206183d;
        int i19 = e17.f206182c;
        int i27 = e17.f206180a;
        int i28 = e17.f206181b;
        if (i17 == 2 || i17 == 3) {
            if (i27 == 1 || z17) {
                if (i28 <= 0 || i19 < 0 || i18 < 0) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489749am);
                }
                if (i28 == 1) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489750an);
                }
                if (i28 == 2) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489747ak, java.lang.Integer.valueOf(i19 - i18));
                }
                if (i28 == 3) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489745ai);
                }
                if (i28 == 4) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489749am);
                }
            } else {
                if (i27 != 2) {
                    return i27 == 3 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489743ag) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489743ag);
                }
                if (i28 <= 0 || j17 < 0) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489743ag);
                }
                if (i28 == 1) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489741ae, java.lang.Float.valueOf(((float) j17) / 100.0f));
                }
                if (i28 == 2) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489740ad, java.lang.Float.valueOf(((float) j17) / 100.0f));
                }
                if (i28 == 3) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489744ah, java.lang.Float.valueOf(((float) j17) / 100.0f));
                }
                if (i28 == 4) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489743ag);
                }
            }
        } else if (i17 == 5) {
            if (i27 == 1 || z17) {
                if (i28 <= 0 || i19 < 0 || i18 < 0) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489749am);
                }
                if (i28 == 1) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489750an);
                }
                if (i28 == 2) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489748al, java.lang.Integer.valueOf(i18));
                }
                if (i28 == 3) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489745ai);
                }
                if (i28 == 4) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489749am);
                }
            } else if (i27 != 2) {
                int i29 = f(qVar).f206181b;
                if (i29 <= 0) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489743ag);
                }
                if (i29 == 1 || i29 == 2 || i29 == 3) {
                    return qVar.F1 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489743ag) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489746aj);
                }
                if (i29 == 4) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489743ag);
                }
            } else {
                if (i28 <= 0 || j17 < 0) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489743ag);
                }
                if (i28 == 1) {
                    return qVar.F1 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489742af) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489741ae, java.lang.Float.valueOf(((float) j17) / 100.0f));
                }
                if (i28 == 2) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489740ad, java.lang.Float.valueOf(((float) j17) / 100.0f));
                }
                if (i28 == 3) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489744ah, java.lang.Float.valueOf(((float) j17) / 100.0f));
                }
                if (i28 == 4) {
                    return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f489743ag);
                }
            }
        }
        return z17 ? qVar.f348684m1 : qVar.f348688n1;
    }

    public static int h(int i17, int i18, boolean z17) {
        return i17 == 5 ? z17 ? com.tencent.mm.R.drawable.c2c_chatto_remittance_expired_bg : com.tencent.mm.R.drawable.c2c_chatfrom_remittance_expired_bg : i17 == 4 ? z17 ? com.tencent.mm.R.drawable.f481083k9 : com.tencent.mm.R.drawable.f481074k6 : i17 == 3 ? i18 == 2 ? z17 ? com.tencent.mm.R.drawable.f481083k9 : com.tencent.mm.R.drawable.f481074k6 : z17 ? com.tencent.mm.R.drawable.f481080k8 : com.tencent.mm.R.drawable.f481073k5 : z17 ? com.tencent.mm.R.drawable.f481080k8 : com.tencent.mm.R.drawable.f481073k5;
    }

    public static java.lang.String i(int i17, int i18, int i19, boolean z17, boolean z18, java.lang.String str, ot0.q qVar, android.widget.TextView textView) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ot0.c cVar = (ot0.c) qVar.y(ot0.c.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CAppMsgUtil", "getC2CLuckyMoneyDescByHbStatus() hbType:%s hbStatus:%s receiveStatus:%s isGroupChat:%s exclusiveRecvUsername: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z18), cVar.f348421n);
        if (i18 == 5) {
            return context.getString(com.tencent.mm.R.string.gji);
        }
        if (i17 == 1) {
            return i18 == 4 ? i19 == 2 ? context.getString(com.tencent.mm.R.string.gjj) : context.getString(com.tencent.mm.R.string.gje) : (i18 == 3 && i19 == 2) ? context.getString(com.tencent.mm.R.string.gjj) : "";
        }
        if (i17 == 0) {
            if (i18 != 4) {
                return (i18 == 3 && !z17 && i19 == 2) ? context.getString(com.tencent.mm.R.string.gjj) : "";
            }
            if (z17) {
                return context.getString(com.tencent.mm.R.string.gje);
            }
            if (z18 && i19 != 2) {
                return context.getString(com.tencent.mm.R.string.gje);
            }
            return context.getString(com.tencent.mm.R.string.gjj);
        }
        if (i17 == 3 && !com.tencent.mm.sdk.platformtools.t8.K0(cVar.f348421n)) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = cVar.f348421n;
            ((sg3.a) v0Var).getClass();
            java.lang.String f17 = c01.a2.f(str2, str);
            if (i18 == 4) {
                return context.getString(com.tencent.mm.R.string.gjh, f17);
            }
            java.lang.String string = context.getString(com.tencent.mm.R.string.gjf, f17);
            if (textView == null) {
                return string + context.getString(com.tencent.mm.R.string.gjg);
            }
            if (textView.getWidth() <= 0) {
                i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 150);
            }
            return string + context.getString(com.tencent.mm.R.string.gjg);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(cVar.f348421n)) {
            return i18 == 4 ? (!z18 || (z17 && i19 == 2)) ? context.getString(com.tencent.mm.R.string.gjj) : context.getString(com.tencent.mm.R.string.gje) : (i18 == 3 && i19 == 2 && !z17) ? context.getString(com.tencent.mm.R.string.gjj) : "";
        }
        tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str3 = cVar.f348421n;
        ((sg3.a) v0Var2).getClass();
        java.lang.String f18 = c01.a2.f(str3, str);
        if (i18 == 4) {
            return context.getString(com.tencent.mm.R.string.gjj);
        }
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.gjf, f18);
        if (textView == null) {
            return string2 + context.getString(com.tencent.mm.R.string.gjg);
        }
        if (textView.getWidth() <= 0) {
            i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 150);
        }
        return string2 + context.getString(com.tencent.mm.R.string.gjg);
    }

    public static int j(int i17, int i18, boolean z17) {
        return i17 == 5 ? z17 ? com.tencent.mm.R.drawable.d6q : com.tencent.mm.R.drawable.d6m : i17 == 4 ? z17 ? com.tencent.mm.R.drawable.f481960an2 : com.tencent.mm.R.drawable.am8 : i17 == 3 ? i18 == 2 ? z17 ? com.tencent.mm.R.drawable.f481960an2 : com.tencent.mm.R.drawable.am8 : z17 ? com.tencent.mm.R.drawable.f481959an1 : com.tencent.mm.R.drawable.am7 : z17 ? com.tencent.mm.R.drawable.f481959an1 : com.tencent.mm.R.drawable.am7;
    }

    public static int k(int i17, int i18, boolean z17) {
        if (i17 == 5 || i17 == 4) {
            return com.tencent.mm.R.drawable.cap;
        }
        if (i17 == 3 && i18 == 2 && !z17) {
            return com.tencent.mm.R.drawable.cap;
        }
        return -1;
    }
}
