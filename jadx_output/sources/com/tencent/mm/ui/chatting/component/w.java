package com.tencent.mm.ui.chatting.component;

/* loaded from: classes15.dex */
public final class w {
    public w(kotlin.jvm.internal.i iVar) {
    }

    public final void a(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, boolean z17) {
        com.tencent.mm.ui.chatting.component.v m07;
        com.tencent.mm.ui.chatting.component.v m08;
        if (dVar == null || f9Var == null) {
            return;
        }
        com.tencent.mm.ui.chatting.component.m mVar = null;
        com.tencent.mm.ui.chatting.manager.c cVar = dVar.f460708c;
        if (z17) {
            sb5.d dVar2 = (sb5.d) cVar.a(sb5.d.class);
            if (dVar2 != null) {
                com.tencent.mm.ui.chatting.component.c0 c0Var = (com.tencent.mm.ui.chatting.component.c0) dVar2;
                com.tencent.mm.ui.chatting.component.l s07 = c0Var.s0(f9Var);
                if (s07 != null && (m08 = c0Var.m0(s07)) != null) {
                    mVar = m08.f200101a;
                }
                if (mVar == null) {
                    return;
                }
                mVar.f199467n = true;
                return;
            }
            return;
        }
        sb5.d dVar3 = (sb5.d) cVar.a(sb5.d.class);
        if (dVar3 != null) {
            com.tencent.mm.ui.chatting.component.c0 c0Var2 = (com.tencent.mm.ui.chatting.component.c0) dVar3;
            com.tencent.mm.ui.chatting.component.l s08 = c0Var2.s0(f9Var);
            if (s08 != null && (m07 = c0Var2.m0(s08)) != null) {
                mVar = m07.f200101a;
            }
            if (mVar == null) {
                return;
            }
            mVar.f199468o = true;
        }
    }

    public final void b(yb5.d dVar, android.view.View view, com.tencent.mm.storage.f9 f9Var) {
        sb5.d dVar2;
        if (dVar == null || view == null || f9Var == null || (dVar2 = (sb5.d) dVar.f460708c.a(sb5.d.class)) == null) {
            return;
        }
        com.tencent.mm.ui.chatting.component.c0 c0Var = (com.tencent.mm.ui.chatting.component.c0) dVar2;
        java.lang.String str = "onAppMsgWxaViewClick, msgInfo: " + c0Var.u0(f9Var);
        java.lang.String str2 = c0Var.f198857e;
        com.tencent.mars.xlog.Log.i(str2, str);
        android.util.LongSparseArray longSparseArray = c0Var.f198861i;
        if (longSparseArray == null) {
            longSparseArray = new android.util.LongSparseArray();
            c0Var.f198861i = longSparseArray;
        }
        com.tencent.mm.ui.chatting.component.v vVar = (com.tencent.mm.ui.chatting.component.v) longSparseArray.get(f9Var.I0());
        if (vVar == null) {
            com.tencent.mars.xlog.Log.i(str2, "onAppMsgWxaViewClick, appMsgWxaStatInfo is null");
            return;
        }
        boolean z17 = vVar.f200102b;
        vVar.f200102b = true;
        if (!z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doClickReport, msgId: ");
            com.tencent.mm.ui.chatting.component.m mVar = vVar.f200101a;
            sb6.append(mVar.f199455b);
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
            com.tencent.mm.ui.chatting.component.s sVar = c0Var.f198860h;
            if (sVar != null) {
                java.lang.String str3 = sVar.f199887b;
                if (!(str3.length() == 0)) {
                    com.tencent.mm.autogen.mmdata.rpt.AppMsgWxaExposeClickStruct appMsgWxaExposeClickStruct = new com.tencent.mm.autogen.mmdata.rpt.AppMsgWxaExposeClickStruct();
                    appMsgWxaExposeClickStruct.f55311d = 1;
                    appMsgWxaExposeClickStruct.f55312e = sVar.f199888c;
                    appMsgWxaExposeClickStruct.f55313f = appMsgWxaExposeClickStruct.b("ChatName", c0Var.v0(str3), true);
                    appMsgWxaExposeClickStruct.f55314g = sVar.f199889d;
                    appMsgWxaExposeClickStruct.f55315h = appMsgWxaExposeClickStruct.b("SessionId", c0Var.v0(sVar.f199886a), true);
                    appMsgWxaExposeClickStruct.f55316i = mVar.f199454a;
                    appMsgWxaExposeClickStruct.f55317j = mVar.f199455b;
                    appMsgWxaExposeClickStruct.f55318k = mVar.f199456c;
                    appMsgWxaExposeClickStruct.f55319l = appMsgWxaExposeClickStruct.b("SenderUsername", c0Var.v0(mVar.f199457d), true);
                    appMsgWxaExposeClickStruct.f55320m = appMsgWxaExposeClickStruct.b("AppId", c0Var.v0(mVar.f199458e), true);
                    appMsgWxaExposeClickStruct.f55321n = appMsgWxaExposeClickStruct.b("Username", c0Var.v0(mVar.f199459f), true);
                    appMsgWxaExposeClickStruct.f55322o = appMsgWxaExposeClickStruct.b("EnterPath", c0Var.v0(mVar.f199460g), true);
                    appMsgWxaExposeClickStruct.f55323p = mVar.f199461h;
                    appMsgWxaExposeClickStruct.f55324q = mVar.a();
                    appMsgWxaExposeClickStruct.f55325r = mVar.f199467n ? 1 : 0;
                    appMsgWxaExposeClickStruct.f55326s = mVar.f199468o ? 1 : 0;
                    appMsgWxaExposeClickStruct.f55328u = mVar.f199469p ? 1 : 0;
                    appMsgWxaExposeClickStruct.f55327t = appMsgWxaExposeClickStruct.b("scoreNum", mVar.f199470q, true);
                    appMsgWxaExposeClickStruct.k();
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i(str2, "doClickReport, filter invalid statInfo");
        }
    }

    public final void c(yb5.d dVar, android.view.View view, com.tencent.mm.storage.f9 f9Var) {
        sb5.d dVar2;
        com.tencent.mm.ui.chatting.component.v m07;
        jz5.f0 f0Var;
        com.tencent.mm.ui.chatting.component.m mVar;
        com.tencent.mm.ui.chatting.component.v m08;
        com.tencent.mm.ui.chatting.component.m mVar2;
        if (dVar == null || view == null || f9Var == null || (dVar2 = (sb5.d) dVar.f460708c.a(sb5.d.class)) == null) {
            return;
        }
        com.tencent.mm.ui.chatting.component.c0 c0Var = (com.tencent.mm.ui.chatting.component.c0) dVar2;
        boolean z17 = view instanceof com.tencent.mm.ui.chatting.viewitems.xg;
        java.lang.String str = c0Var.f198857e;
        if (!z17) {
            com.tencent.mars.xlog.Log.w(str, "maybeAppMsgWxaViewExpose, view: " + view + ", why?");
            return;
        }
        if (!c0Var.n0()) {
            com.tencent.mm.ui.chatting.component.l s07 = c0Var.s0(f9Var);
            if (s07 == null || (m08 = c0Var.m0(s07)) == null || (mVar2 = m08.f200101a) == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxaReportComponent", "markExpose, msgId: " + mVar2.f199454a);
            mVar2.f199465l = true;
            return;
        }
        com.tencent.mm.ui.chatting.viewitems.xg xgVar = (com.tencent.mm.ui.chatting.viewitems.xg) view;
        android.util.SparseArray sparseArray = c0Var.f198862m;
        if (sparseArray == null) {
            sparseArray = new android.util.SparseArray();
            c0Var.f198862m = sparseArray;
        }
        com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) sparseArray.get(xgVar.hashCode());
        if (f9Var2 != null && f9Var.I0() == f9Var2.I0()) {
            com.tencent.mars.xlog.Log.i(str, "maybeAppMsgWxaViewExpose, msg is the same as originMsg, why?");
            return;
        }
        if (f9Var2 != null) {
            android.util.LongSparseArray longSparseArray = c0Var.f198861i;
            if (longSparseArray == null) {
                longSparseArray = new android.util.LongSparseArray();
                c0Var.f198861i = longSparseArray;
            }
            com.tencent.mm.ui.chatting.component.v vVar = (com.tencent.mm.ui.chatting.component.v) longSparseArray.get(f9Var2.I0());
            if (vVar == null || (mVar = vVar.f200101a) == null) {
                f0Var = null;
            } else {
                mVar.b(null);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w(str, "maybeAppMsgWxaViewExpose, originMsg is not AppMsgWxa, originMsg: " + c0Var.u0(f9Var2) + ", why?");
            }
            com.tencent.mm.ui.chatting.component.l s08 = c0Var.s0(f9Var2);
            if (s08 != null) {
                android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = s08.f199387d;
                if (onAttachStateChangeListener != null) {
                    view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                }
                s08.f199387d = null;
            }
        }
        com.tencent.mm.ui.chatting.component.l s09 = c0Var.s0(f9Var);
        if (s09 == null || (m07 = c0Var.m0(s09)) == null) {
            return;
        }
        android.util.SparseArray sparseArray2 = c0Var.f198862m;
        if (sparseArray2 == null) {
            sparseArray2 = new android.util.SparseArray();
            c0Var.f198862m = sparseArray2;
        }
        sparseArray2.put(xgVar.hashCode(), f9Var);
        com.tencent.mm.ui.chatting.component.o oVar = new com.tencent.mm.ui.chatting.component.o(m07);
        s09.f199387d = oVar;
        view.addOnAttachStateChangeListener(oVar);
    }
}
