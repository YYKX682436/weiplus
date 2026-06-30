package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.d.class)
/* loaded from: classes15.dex */
public final class c0 extends com.tencent.mm.ui.chatting.component.a implements sb5.d, xg3.h0 {

    /* renamed from: r, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.component.w f198856r = new com.tencent.mm.ui.chatting.component.w(null);

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f198857e = "MicroMsg.AppMsgWxaReportComponent#" + hashCode();

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f198858f = jz5.h.a(jz5.i.f302831f, new com.tencent.mm.ui.chatting.component.z(this));

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f198859g = "";

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.s f198860h;

    /* renamed from: i, reason: collision with root package name */
    public android.util.LongSparseArray f198861i;

    /* renamed from: m, reason: collision with root package name */
    public android.util.SparseArray f198862m;

    /* renamed from: n, reason: collision with root package name */
    public android.util.LongSparseArray f198863n;

    /* renamed from: o, reason: collision with root package name */
    public android.util.LongSparseArray f198864o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.t f198865p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.t f198866q;

    public static final void o0(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        sb5.d dVar2;
        com.tencent.mm.ui.chatting.component.v m07;
        if (dVar == null || f9Var == null || (dVar2 = (sb5.d) dVar.f460708c.a(sb5.d.class)) == null) {
            return;
        }
        com.tencent.mm.ui.chatting.component.c0 c0Var = (com.tencent.mm.ui.chatting.component.c0) dVar2;
        com.tencent.mm.ui.chatting.component.l s07 = c0Var.s0(f9Var);
        com.tencent.mm.ui.chatting.component.m mVar = (s07 == null || (m07 = c0Var.m0(s07)) == null) ? null : m07.f200101a;
        if (mVar == null) {
            return;
        }
        mVar.f199469p = true;
    }

    public static final void p0(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, boolean z17) {
        f198856r.a(dVar, f9Var, z17);
    }

    public static final void q0(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, java.lang.String scoreNumStr) {
        sb5.d dVar2;
        com.tencent.mm.ui.chatting.component.v m07;
        kotlin.jvm.internal.o.g(scoreNumStr, "scoreNumStr");
        if (dVar == null || f9Var == null || (dVar2 = (sb5.d) dVar.f460708c.a(sb5.d.class)) == null) {
            return;
        }
        com.tencent.mm.ui.chatting.component.c0 c0Var = (com.tencent.mm.ui.chatting.component.c0) dVar2;
        com.tencent.mm.ui.chatting.component.l s07 = c0Var.s0(f9Var);
        com.tencent.mm.ui.chatting.component.m mVar = (s07 == null || (m07 = c0Var.m0(s07)) == null) ? null : m07.f200101a;
        if (mVar == null) {
            return;
        }
        mVar.f199470q = scoreNumStr;
    }

    public static final void w0(yb5.d dVar, android.view.View view, com.tencent.mm.storage.f9 f9Var) {
        f198856r.b(dVar, view, f9Var);
    }

    public static final void x0(yb5.d dVar, android.view.View view, com.tencent.mm.storage.f9 f9Var) {
        f198856r.c(dVar, view, f9Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0114  */
    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J() {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.c0.J():void");
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        android.util.LongSparseArray longSparseArray;
        com.tencent.mm.ui.chatting.component.m mVar;
        if (n0() && l0Var != null && kotlin.jvm.internal.o.b("update", l0Var.f454411b) && (longSparseArray = this.f198861i) != null) {
            java.util.ArrayList msgList = l0Var.f454412c;
            kotlin.jvm.internal.o.f(msgList, "msgList");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = msgList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (4 == (((com.tencent.mm.storage.f9) next).F & 4)) {
                    arrayList.add(next);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.ui.chatting.component.v vVar = (com.tencent.mm.ui.chatting.component.v) longSparseArray.get(((com.tencent.mm.storage.f9) it6.next()).I0());
                if (vVar != null && (mVar = vVar.f200101a) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxaReportComponent", "markRevoked, msgId: " + mVar.f199454a);
                    if (mVar.f199466m) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxaReportComponent", "markRevoked, already revoked");
                    } else {
                        mVar.b(null);
                        mVar.f199466m = true;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011b  */
    @Override // yn.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i0(android.view.View r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.c0.i0(android.view.View, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        if (r5 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bd, code lost:
    
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bb, code lost:
    
        if (r5 == null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.ui.chatting.component.v m0(com.tencent.mm.ui.chatting.component.l r21) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.c0.m0(com.tencent.mm.ui.chatting.component.l):com.tencent.mm.ui.chatting.component.v");
    }

    public final boolean n0() {
        return ((java.lang.Boolean) this.f198858f.getValue()).booleanValue();
    }

    public final ot0.q r0(com.tencent.mm.storage.f9 f9Var) {
        android.util.LongSparseArray longSparseArray = this.f198863n;
        if (longSparseArray == null) {
            longSparseArray = new android.util.LongSparseArray();
            this.f198863n = longSparseArray;
        }
        long I0 = f9Var.I0();
        java.lang.Object obj = longSparseArray.get(I0);
        if (obj == null) {
            java.lang.String U1 = f9Var.U1();
            obj = new com.tencent.mm.ui.chatting.component.p(U1 != null ? ot0.q.v(U1) : null);
            longSparseArray.put(I0, obj);
        }
        return ((com.tencent.mm.ui.chatting.component.p) obj).f199658a;
    }

    public final com.tencent.mm.ui.chatting.component.l s0(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem;
        com.tencent.mm.ui.chatting.component.l lVar = null;
        if (f9Var == null) {
            return null;
        }
        android.util.LongSparseArray longSparseArray = this.f198864o;
        if (longSparseArray == null) {
            longSparseArray = new android.util.LongSparseArray();
            this.f198864o = longSparseArray;
        }
        long I0 = f9Var.I0();
        java.lang.Object obj = longSparseArray.get(I0);
        if (obj == null) {
            int type = f9Var.getType();
            java.lang.String Q0 = f9Var.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            com.tencent.mm.ui.chatting.component.l t07 = t0(new com.tencent.mm.ui.chatting.component.a0(f9Var, this, type, Q0), f9Var);
            if (t07 == null) {
                if (822083633 != f9Var.getType()) {
                    msgQuoteItem = null;
                } else {
                    ot0.q r07 = r0(f9Var);
                    msgQuoteItem = r07 != null ? r07.f348725w2 : null;
                }
                if (msgQuoteItem != null) {
                    int i17 = msgQuoteItem.f149482d;
                    java.lang.String str = msgQuoteItem.f149485g;
                    lVar = t0(new com.tencent.mm.ui.chatting.component.b0(this, f9Var, msgQuoteItem, i17, str == null ? "" : str), f9Var);
                }
            } else {
                lVar = t07;
            }
            obj = new com.tencent.mm.ui.chatting.component.r(lVar);
            longSparseArray.put(I0, obj);
        }
        return ((com.tencent.mm.ui.chatting.component.r) obj).f199807a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f8, code lost:
    
        if ((r0 == null || r0.length() == 0) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0110, code lost:
    
        if ((r2 == null || r2.length() == 0) != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.ui.chatting.component.l t0(com.tencent.mm.ui.chatting.component.u r9, com.tencent.mm.storage.f9 r10) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.c0.t0(com.tencent.mm.ui.chatting.component.u, com.tencent.mm.storage.f9):com.tencent.mm.ui.chatting.component.l");
    }

    public final java.lang.String u0(com.tencent.mm.storage.f9 f9Var) {
        return "MsgInfo(msgId = " + f9Var.getMsgId() + ", msgType = " + f9Var.getType() + ", msgSvrId = " + f9Var.I0() + ')';
    }

    public final java.lang.String v0(java.lang.String str) {
        if (str.length() > 1024) {
            str = str.substring(0, 1024);
            kotlin.jvm.internal.o.f(str, "substring(...)");
        }
        if (!r26.n0.B(str, ",", false)) {
            return str;
        }
        java.lang.String b17 = fp.s0.b(str, com.tencent.mapsdk.internal.rv.f51270c);
        return b17 == null ? "" : b17;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        android.util.LongSparseArray longSparseArray = this.f198861i;
        if (longSparseArray != null) {
            int size = longSparseArray.size();
            for (int i17 = 0; i17 < size; i17++) {
                longSparseArray.keyAt(i17);
                com.tencent.mm.ui.chatting.component.m mVar = ((com.tencent.mm.ui.chatting.component.v) longSparseArray.valueAt(i17)).f200101a;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxaReportComponent", "markForeground, msgId: " + mVar.f199454a);
                if (mVar.f199466m) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxaReportComponent", "markForeground, already revoked");
                } else if (mVar.f199464k) {
                    mVar.f199464k = false;
                    mVar.c(null);
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        android.util.LongSparseArray longSparseArray = this.f198861i;
        if (longSparseArray != null) {
            int size = longSparseArray.size();
            for (int i17 = 0; i17 < size; i17++) {
                longSparseArray.keyAt(i17);
                com.tencent.mm.ui.chatting.component.m mVar = ((com.tencent.mm.ui.chatting.component.v) longSparseArray.valueAt(i17)).f200101a;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxaReportComponent", "markBackground, msgId: " + mVar.f199454a);
                if (mVar.f199466m) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxaReportComponent", "markBackground, already revoked");
                } else if (0 < mVar.f199463j) {
                    mVar.b(null);
                    mVar.f199464k = true;
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        vg3.x3 x3Var;
        com.tencent.mm.storage.g9 cj6;
        if (n0() && (x3Var = (vg3.x3) gm0.j1.s(vg3.x3.class)) != null && (cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) x3Var).cj()) != null) {
            cj6.n0(this, android.os.Looper.getMainLooper());
        }
        java.lang.String str = this.f198859g;
        yb5.d dVar = this.f198580d;
        java.lang.String x17 = dVar != null ? dVar.x() : null;
        if (x17 == null) {
            x17 = "";
        }
        com.tencent.mars.xlog.Log.i(this.f198857e, "cleanStatInfoOnEnter, theLastTalker: " + str + ", theTalker: " + x17);
        if (kotlin.jvm.internal.o.b(str, x17)) {
            android.util.LongSparseArray longSparseArray = this.f198861i;
            if (longSparseArray != null) {
                int size = longSparseArray.size();
                for (int i17 = 0; i17 < size; i17++) {
                    longSparseArray.keyAt(i17);
                    ((com.tencent.mm.ui.chatting.component.v) longSparseArray.valueAt(i17)).f200102b = false;
                }
            }
        } else {
            android.util.LongSparseArray longSparseArray2 = this.f198861i;
            if (longSparseArray2 != null) {
                longSparseArray2.clear();
            }
            this.f198861i = null;
            android.util.SparseArray sparseArray = this.f198862m;
            if (sparseArray != null) {
                sparseArray.clear();
            }
            this.f198862m = null;
            android.util.LongSparseArray longSparseArray3 = this.f198863n;
            if (longSparseArray3 != null) {
                longSparseArray3.clear();
            }
            this.f198863n = null;
            android.util.LongSparseArray longSparseArray4 = this.f198864o;
            if (longSparseArray4 != null) {
                longSparseArray4.clear();
            }
            this.f198864o = null;
        }
        yb5.d dVar2 = this.f198580d;
        java.lang.String str2 = dVar2 != null ? dVar2.f460722q : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String x18 = dVar2 != null ? dVar2.x() : null;
        java.lang.String str3 = x18 != null ? x18 : "";
        int a17 = k01.d.a(str3);
        this.f198860h = com.tencent.mm.storage.z3.R4(str3) ? new com.tencent.mm.ui.chatting.component.s(str2, str3, a17, ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str3)) : new com.tencent.mm.ui.chatting.component.s(str2, str3, a17, -1);
    }
}
