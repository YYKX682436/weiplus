package xf5;

@j95.b
/* loaded from: classes9.dex */
public class c extends i95.w implements qy.j {
    public int Ai() {
        int i17;
        android.database.Cursor s17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).s(1, new java.util.ArrayList(), "conversationboxservice", -1);
        int i18 = 0;
        try {
            try {
                if (s17.moveToFirst()) {
                    i17 = 0;
                    do {
                        i17++;
                        try {
                        } catch (java.lang.Exception e17) {
                            e = e17;
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConvBoxConversationService", e, "getConvBoxCount", new java.lang.Object[0]);
                            s17.close();
                            return i17;
                        }
                    } while (s17.moveToNext());
                    i18 = i17;
                }
                return i18;
            } catch (java.lang.Exception e18) {
                e = e18;
                i17 = 0;
            }
        } finally {
            s17.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x001c, code lost:
    
        if (r0.moveToFirst() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x001e, code lost:
    
        r1 = new com.tencent.mm.storage.l4();
        r1.convertFrom(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r1.d1() != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r1.f1() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r0.moveToNext() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int Bi() {
        /*
            r5 = this;
            c01.f r0 = c01.d9.b()
            com.tencent.mm.storage.l8 r0 = r0.r()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.tencent.mm.storage.m4 r0 = (com.tencent.mm.storage.m4) r0
            r2 = -1
            r3 = 1
            java.lang.String r4 = "conversationboxservice"
            android.database.Cursor r0 = r0.s(r3, r1, r4, r2)
            boolean r1 = r0.moveToFirst()
            r2 = 0
            if (r1 == 0) goto L3a
        L1e:
            com.tencent.mm.storage.l4 r1 = new com.tencent.mm.storage.l4
            r1.<init>()
            r1.convertFrom(r0)
            int r3 = r1.d1()
            if (r3 != 0) goto L32
            int r1 = r1.f1()
            if (r1 == 0) goto L34
        L32:
            int r2 = r2 + 1
        L34:
            boolean r1 = r0.moveToNext()
            if (r1 != 0) goto L1e
        L3a:
            r0.close()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xf5.c.Bi():int");
    }

    public final android.text.SpannableString Di(com.tencent.mm.storage.l4 l4Var) {
        android.text.SpannableString bj6;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(l4Var.h1(), true);
        android.text.SpannableString valueOf = android.text.SpannableString.valueOf(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.bl7));
        if (n17 != null) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String h17 = l4Var.h1();
            ((sg3.a) v0Var).getClass();
            java.lang.String d17 = c01.a2.d(n17, h17, true);
            if (com.tencent.mm.storage.z3.m4(n17.d1())) {
                j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479897ia);
                ((l41.q2) b0Var).getClass();
                bj6 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, d17);
            } else {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                bj6 = ((ke0.e) xVar).bj(context2, d17, i65.a.h(context2, com.tencent.mm.R.dimen.f479897ia));
            }
            valueOf = bj6;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ConvBoxConversationService", "contact is null !");
        }
        if (valueOf.length() <= 0) {
            return new android.text.SpannableString(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.bl7));
        }
        if (valueOf.length() <= 10) {
            return valueOf;
        }
        return android.text.SpannableString.valueOf(((java.lang.Object) valueOf.subSequence(0, 10)) + "...");
    }

    public final java.lang.String Ni(com.tencent.mm.storage.l4 l4Var) {
        java.lang.String wi6;
        java.lang.String wi7 = wi(l4Var.y0());
        if (wi7 != null) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490382tf) + " " + wi7;
        }
        if (l4Var.y0() == null || !l4Var.y0().contains(":") || (wi6 = wi(l4Var.y0().substring(l4Var.y0().indexOf(":") + 1).replace(" ", ""))) == null) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490382tf);
        }
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490382tf) + " " + wi6;
    }

    public com.tencent.mm.storage.l4 Ri() {
        com.tencent.mm.storage.l4 l4Var;
        java.lang.Exception e17;
        android.database.Cursor s17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).s(1, new java.util.ArrayList(), "conversationboxservice", -1);
        com.tencent.mm.storage.l4 l4Var2 = null;
        try {
            try {
                if (s17.moveToFirst()) {
                    while (true) {
                        l4Var = new com.tencent.mm.storage.l4();
                        try {
                            l4Var.convertFrom(s17);
                            if (!android.text.TextUtils.isEmpty(l4Var.y0()) || !s17.moveToNext()) {
                                break;
                            }
                            l4Var2 = l4Var;
                        } catch (java.lang.Exception e18) {
                            e17 = e18;
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConvBoxConversationService", e17, "getConvBoxLatestConv", new java.lang.Object[0]);
                            s17.close();
                            return l4Var;
                        }
                    }
                    l4Var2 = l4Var;
                }
                return l4Var2;
            } finally {
                s17.close();
            }
        } catch (java.lang.Exception e19) {
            l4Var = l4Var2;
            e17 = e19;
        }
    }

    public final void Ui(com.tencent.mm.storage.l4 l4Var, java.lang.String str, boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvBoxConversationService", "refreshBoxConversationTime() called with: callTime = %s child_username = %s, isUpdate = %s", java.lang.Long.valueOf(currentTimeMillis), str, java.lang.Boolean.valueOf(z17));
        com.tencent.mm.autogen.events.GetConvEvent getConvEvent = new com.tencent.mm.autogen.events.GetConvEvent();
        am.pf pfVar = getConvEvent.f54388g;
        pfVar.f7617b = str;
        pfVar.f7618c = 0;
        pfVar.f7616a = new xf5.b(this, l4Var, z17, str, currentTimeMillis);
        getConvEvent.b(android.os.Looper.getMainLooper());
    }

    public final java.lang.String Vi(com.tencent.mm.storage.l4 l4Var) {
        java.lang.String e17;
        int i17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(l4Var.y0())) {
            return "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(l4Var.z0())) {
            return l4Var.y0();
        }
        if (l4Var.Q0() == 0 && com.tencent.mm.storage.z3.R4(l4Var.h1())) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String z07 = l4Var.z0();
            java.lang.String h17 = l4Var.h1();
            ((sg3.a) v0Var).getClass();
            e17 = c01.a2.f(z07, h17);
        } else {
            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String z08 = l4Var.z0();
            ((sg3.a) v0Var2).getClass();
            e17 = c01.a2.e(z08);
        }
        try {
            return java.lang.String.format(l4Var.y0(), e17);
        } catch (java.lang.Exception unused) {
            int Q0 = l4Var.Q0();
            java.lang.String h18 = l4Var.h1();
            java.lang.String j17 = l4Var.j();
            java.lang.String U0 = l4Var.U0();
            if (U0 != null && U0.length() > 0) {
                try {
                    i17 = java.lang.Integer.valueOf(U0).intValue();
                } catch (java.lang.NumberFormatException unused2) {
                    i17 = 1;
                    return qm.a0.l(Q0, h18, j17, i17, com.tencent.mm.sdk.platformtools.x2.f193071a);
                }
                return qm.a0.l(Q0, h18, j17, i17, com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
            i17 = 1;
            return qm.a0.l(Q0, h18, j17, i17, com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
    }

    public void Zi(com.tencent.mm.storage.l4 l4Var, boolean z17, boolean z18) {
        if (l4Var != null && z18 && !"hidden_conv_parent".equalsIgnoreCase(l4Var.W0()) && !"@blacklist".equalsIgnoreCase(l4Var.W0())) {
            l4Var.T1("conversationboxservice");
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(l4Var, l4Var.h1());
        }
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("conversationboxservice");
        java.lang.String h17 = l4Var != null ? l4Var.h1() : "";
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Boolean.valueOf(p17 != null);
        objArr[1] = h17;
        objArr[2] = java.lang.Boolean.valueOf(z17);
        objArr[3] = java.lang.Boolean.valueOf(z18);
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvBoxConversationService", "updateConvBoxConversation() called with boxConv:%s childCvsUserName = %s, needRefreshTime = %s, updateChildConv = %s", objArr);
        if (p17 == null) {
            com.tencent.mm.storage.l4 l4Var2 = new com.tencent.mm.storage.l4("conversationboxservice");
            l4Var2.f2();
            if (l4Var != null) {
                fj(l4Var2, l4Var);
            }
            Ui(l4Var2, h17, false);
            return;
        }
        p17.T1(null);
        if (l4Var != null) {
            fj(p17, l4Var);
        }
        if (z17) {
            Ui(p17, l4Var != null ? l4Var.h1() : "", true);
        } else {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, "conversationboxservice");
        }
    }

    public void aj(boolean z17) {
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("conversationboxservice");
        if (p17 != null) {
            com.tencent.mm.storage.l4 Ri = Ri();
            if (Ri == null || android.text.TextUtils.isEmpty(Ri.y0())) {
                p17.o1(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.bkz));
            } else {
                int Bi = Bi();
                if (z17) {
                    p17.a2(Bi);
                    p17.Y1(Bi);
                }
                p17.o1(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491014bl0, Di(Ri), (Ri.U0() == null || !(Ri.U0().equals(java.lang.String.valueOf(47)) || Ri.U0().equals(java.lang.String.valueOf(1048625)))) ? (Ri.y0() == null || !Ri.y0().contains(":")) ? Vi(Ri) : Ri.y0().substring(Ri.y0().indexOf(":") + 1).replace(" ", "").replace("\n", "") : Ni(Ri)));
            }
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, "conversationboxservice");
        }
    }

    public void bj(java.lang.String str, com.tencent.mm.storage.z3 z3Var) {
        com.tencent.mm.storage.l4 p17;
        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
        if (c01.v1.y(str)) {
            com.tencent.mm.storage.l4 p18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str);
            if (p18 != null) {
                ((xf5.c) ((qy.j) i95.n0.c(qy.j.class))).Zi(p18, false, true);
                return;
            }
            return;
        }
        if (!z3Var.v2() || (p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str)) == null) {
            return;
        }
        ((xf5.c) ((qy.j) i95.n0.c(qy.j.class))).cj(p17);
    }

    public void cj(com.tencent.mm.storage.l4 l4Var) {
        if (l4Var != null) {
            l4Var.T1(null);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(l4Var, l4Var.h1());
            int Ai = Ai();
            if (Ai == 0) {
                ((com.tencent.mm.storage.m4) c01.d9.b().r()).k("conversationboxservice");
            } else {
                aj(false);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ConvBoxConversationService", "updateForChildConversationUnSet childCvs:%s convBoxCnt:%s", l4Var.h1(), java.lang.Integer.valueOf(Ai));
        }
    }

    public void fj(com.tencent.mm.storage.l4 l4Var, com.tencent.mm.storage.l4 l4Var2) {
        com.tencent.mm.storage.l4 Ri = Ri();
        if (Ri == null || android.text.TextUtils.isEmpty(Ri.y0())) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.bkz);
            if (l4Var != null) {
                l4Var.o1(string);
                return;
            }
            return;
        }
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491014bl0, Di(Ri), (Ri.U0() == null || !(Ri.U0().equals(java.lang.String.valueOf(47)) || Ri.U0().equals(java.lang.String.valueOf(1048625)))) ? (Ri.y0() == null || !Ri.y0().contains(":")) ? Vi(Ri) : Ri.y0().substring(Ri.y0().indexOf(":") + 1).replace(" ", "").replace("\n", "") : Ni(Ri));
        if (l4Var != null) {
            l4Var.o1(string2);
        }
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        try {
            f9Var.setType(java.lang.Integer.parseInt(l4Var2.U0()));
        } catch (java.lang.Exception unused) {
        }
        if (f9Var.j2()) {
            l4Var.Y1(0);
        } else {
            l4Var.Y1(Bi());
        }
    }

    public final java.lang.String wi(java.lang.String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).v(str);
    }
}
