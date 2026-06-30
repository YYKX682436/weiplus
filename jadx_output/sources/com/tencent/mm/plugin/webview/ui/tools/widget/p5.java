package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes9.dex */
public final class p5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.z5 f187496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f187497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f187498f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187499g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f187500h;

    public p5(com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var, int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        this.f187496d = z5Var;
        this.f187497e = i17;
        this.f187498f = i18;
        this.f187499g = str;
        this.f187500h = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var = this.f187496d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = z5Var.getWebView().T2;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        if (z5Var.getWeakThis$plugin_webview_release().get() != null) {
            com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var2 = z5Var.getWeakThis$plugin_webview_release().get();
            kotlin.jvm.internal.o.e(z5Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.widget.MPWriteCommentLayout");
            com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var3 = z5Var2;
            com.tencent.mm.modelbase.o rr6 = this.f187500h;
            kotlin.jvm.internal.o.f(rr6, "$rr");
            int i17 = this.f187498f;
            java.lang.String str = null;
            if (i17 != 0) {
                java.lang.String str2 = this.f187499g;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    db5.e1.y(z5Var3.getContext(), str2, "", z5Var3.getContext().getString(com.tencent.mm.R.string.f490507x1), null);
                    z5Var3.A.setEnabled(i17 != 60005);
                    return;
                }
            }
            com.tencent.mm.protobuf.f fVar = rr6.f70710a.f70684a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgOperateCommentReq");
            r45.m9 m9Var = (r45.m9) fVar;
            int i18 = this.f187497e;
            if (i18 != 0 || i17 != 0) {
                if (m9Var.f380262g == 1) {
                    db5.e1.T(z5Var3.getContext(), z5Var3.getContext().getString(com.tencent.mm.R.string.ant, java.lang.Integer.valueOf(i17)));
                    if (i18 == 2) {
                        cx4.a.c(11);
                        return;
                    } else {
                        cx4.a.c(12);
                        return;
                    }
                }
                db5.e1.T(z5Var3.getContext(), z5Var3.getContext().getString(com.tencent.mm.R.string.anm, java.lang.Integer.valueOf(i17)));
                if (i18 == 2) {
                    cx4.a.c(14);
                    return;
                } else {
                    cx4.a.c(15);
                    return;
                }
            }
            int i19 = m9Var.f380262g;
            if (i19 == 1) {
                db5.t7.h(z5Var3.getContext(), z5Var3.getContext().getString(com.tencent.mm.R.string.anv));
                z5Var3.B.setText("");
                z5Var3.f187633y0 = 0;
                z5Var3.getAppMsgCommentList();
            } else if (i19 != 3) {
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = z5Var3.f187628v;
                if (i19 != 4) {
                    com.tencent.mm.plugin.webview.ui.tools.widget.l5 l5Var = z5Var3.I;
                    if (l5Var != null) {
                        java.util.LinkedList linkedList = l5Var.f187383e;
                        java.util.Iterator it = linkedList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            r45.ck ckVar = (r45.ck) it.next();
                            if (m9Var.f380263h == ckVar.f371601e) {
                                str = ckVar.f371602f;
                                linkedList.remove(ckVar);
                                l5Var.notifyDataSetChanged();
                                break;
                            }
                        }
                    }
                    java.lang.String str3 = str;
                    com.tencent.mm.plugin.webview.ui.tools.widget.l5 l5Var2 = z5Var3.I;
                    if (l5Var2 != null && l5Var2.getCount() == 0) {
                        r4 = true;
                    }
                    if (r4) {
                        z5Var3.u();
                    }
                    nw4.n nVar = webViewUI.f183844p0;
                    if (nVar != null) {
                        nVar.S("deleteComment", m9Var.f380263h, str3, 0, 0);
                    }
                    z5Var3.p(true);
                } else {
                    com.tencent.mm.plugin.webview.ui.tools.widget.l5 l5Var3 = z5Var3.I;
                    if (l5Var3 != null) {
                        java.util.Iterator it6 = l5Var3.f187383e.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            r45.ck ckVar2 = (r45.ck) it6.next();
                            if (m9Var.f380263h == ckVar2.f371601e) {
                                java.lang.String str4 = ckVar2.f371602f;
                                java.util.LinkedList<r45.q60> reply_list = ckVar2.f371610q.f384569d;
                                kotlin.jvm.internal.o.f(reply_list, "reply_list");
                                for (r45.q60 q60Var : reply_list) {
                                    if (q60Var.f383704g == m9Var.f380271s) {
                                        q60Var.f383709o = 1;
                                    }
                                }
                                str = str4;
                            }
                        }
                        l5Var3.notifyDataSetChanged();
                    }
                    java.lang.String str5 = str;
                    com.tencent.mm.plugin.webview.ui.tools.widget.l5 l5Var4 = z5Var3.I;
                    if (l5Var4 != null && l5Var4.getCount() == 0) {
                        r4 = true;
                    }
                    if (r4) {
                        z5Var3.u();
                    }
                    nw4.n nVar2 = webViewUI.f183844p0;
                    if (nVar2 != null) {
                        nVar2.S("deleteCommentReply", m9Var.f380263h, str5, m9Var.f380271s, 0);
                    }
                    z5Var3.p(true);
                }
            } else {
                db5.t7.h(z5Var3.getContext(), z5Var3.getContext().getString(com.tencent.mm.R.string.anw));
                z5Var3.p(true);
                z5Var3.B.setText("");
                z5Var3.f187633y0 = 0;
                z5Var3.getAppMsgCommentList();
            }
            z5Var3.B.clearFocus();
        }
    }
}
