package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes9.dex */
public final class r5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.z5 f187524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f187525e;

    public r5(com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var, com.tencent.mm.modelbase.o oVar) {
        this.f187524d = z5Var;
        this.f187525e = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var = this.f187524d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = z5Var.getWebView().T2;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        if (z5Var.getWeakThis$plugin_webview_release().get() != null) {
            com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var2 = z5Var.getWeakThis$plugin_webview_release().get();
            kotlin.jvm.internal.o.e(z5Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.widget.MPWriteCommentLayout");
            com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var3 = z5Var2;
            com.tencent.mm.modelbase.o rr6 = this.f187525e;
            kotlin.jvm.internal.o.f(rr6, "$rr");
            com.tencent.mm.protobuf.f fVar = rr6.f70710a.f70684a;
            if (fVar instanceof r45.g9) {
                com.tencent.mm.modelbase.n nVar = rr6.f70711b;
                if (nVar.f70700a instanceof r45.h9) {
                    kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgCommentListReq");
                    r45.g9 g9Var = (r45.g9) fVar;
                    com.tencent.mm.protobuf.f fVar2 = nVar.f70700a;
                    kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgCommentListResp");
                    r45.h9 h9Var = (r45.h9) fVar2;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("url_info size is ");
                    java.util.LinkedList linkedList = h9Var.f375945d;
                    sb6.append(linkedList != null ? linkedList.size() : 0);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MPWriteCommentLayout", sb6.toString());
                    if (g9Var.f374999f == 2) {
                        int i17 = z5Var3.f187633y0;
                        z5Var3.f187633y0 = h9Var.f375949h;
                        boolean z17 = i17 == 0;
                        boolean z18 = z5Var3.K;
                        java.util.LinkedList comment = h9Var.f375945d;
                        if (!z18) {
                            if (com.tencent.mm.sdk.platformtools.t8.L0(comment)) {
                                z5Var3.u();
                            } else {
                                z5Var3.E.setBackgroundColor(z5Var3.getResources().getColor(com.tencent.mm.R.color.BW_97));
                                z5Var3.F.setVisibility(0);
                                com.tencent.mm.plugin.webview.ui.tools.widget.l5 l5Var = z5Var3.I;
                                if (l5Var == null) {
                                    android.content.Context context = z5Var3.getContext();
                                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                                    kotlin.jvm.internal.o.f(comment, "comment");
                                    com.tencent.mm.plugin.webview.ui.tools.widget.l5 l5Var2 = new com.tencent.mm.plugin.webview.ui.tools.widget.l5(context, comment, z5Var3, z5Var3.f187629w);
                                    z5Var3.I = l5Var2;
                                    z5Var3.C.setAdapter((android.widget.ListAdapter) l5Var2);
                                } else {
                                    kotlin.jvm.internal.o.f(comment, "comment");
                                    com.tencent.mars.xlog.Log.i("MicroMsg.MPMyCommentItemAdapter", "update: " + comment.size());
                                    java.util.LinkedList linkedList2 = l5Var.f187383e;
                                    if (z17) {
                                        linkedList2.clear();
                                        linkedList2.addAll(comment);
                                    } else {
                                        linkedList2.addAll(comment);
                                    }
                                    l5Var.notifyDataSetChanged();
                                }
                            }
                        }
                        if (comment == null || comment.size() <= 0 || z5Var3.M != 0) {
                            z5Var3.postDelayed(new com.tencent.mm.plugin.webview.ui.tools.widget.x5(z5Var3), 10L);
                        }
                    }
                }
            }
        }
    }
}
