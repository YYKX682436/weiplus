package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class q0 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.m6 f202594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.u0 f202595b;

    public q0(com.tencent.mm.ui.chatting.u0 u0Var, com.tencent.mm.ui.chatting.m6 m6Var) {
        this.f202595b = u0Var;
        this.f202594a = m6Var;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.tencent.mm.ui.chatting.u0 u0Var = this.f202595b;
        com.tencent.mm.ui.chatting.m6 m6Var = this.f202594a;
        if (i17 == 0) {
            android.content.Intent intent = new android.content.Intent();
            try {
                intent.putExtra("rawUrl", java.lang.String.format(com.tencent.mm.ui.chatting.u0.f202726f, java.net.URLEncoder.encode(m6Var.f201946a, com.tencent.mapsdk.internal.rv.f51270c), java.net.URLEncoder.encode(m6Var.f201947b, com.tencent.mapsdk.internal.rv.f51270c), java.lang.Long.valueOf(m6Var.f201948c.I0()), java.lang.Integer.valueOf((int) (m6Var.f201948c.getCreateTime() / 1000)), 42));
                intent.putExtra("show_bottom", false);
                intent.putExtra("showShare", false);
                j45.l.j(u0Var.f202728e.g(), "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppSpamClickListener", "exception in expore, %s", e17.getMessage());
                return;
            }
        }
        if (i17 != 1) {
            return;
        }
        java.lang.String str = m6Var.f201946a;
        java.lang.String str2 = m6Var.f201947b;
        c01.d9.e().a(mc1.c.CTRL_INDEX, u0Var);
        r45.ye4 ye4Var = new r45.ye4();
        ye4Var.f391014f = 1;
        ye4Var.f391012d = m6Var.f201947b;
        ye4Var.f391013e = "";
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(ye4Var);
        com.tencent.mm.autogen.events.SetRecvTmpMsgOptionEvent setRecvTmpMsgOptionEvent = new com.tencent.mm.autogen.events.SetRecvTmpMsgOptionEvent();
        java.lang.String str3 = m6Var.f201946a;
        am.du duVar = setRecvTmpMsgOptionEvent.f54769g;
        duVar.f6501a = str3;
        duVar.f6502b = linkedList;
        if (setRecvTmpMsgOptionEvent.e()) {
            u0Var.f202727d = db5.e1.Q(u0Var.f202728e.g(), u0Var.f202728e.s().getString(com.tencent.mm.R.string.f490573yv), u0Var.f202728e.s().getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.ui.chatting.p0(this));
        }
    }
}
