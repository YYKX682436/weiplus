package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes11.dex */
public final class p6 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI f191837a;

    public p6(com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI qBFileShareProxyUI) {
        this.f191837a = qBFileShareProxyUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendFileToFriend, send broadcast, filePath: ");
            com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI qBFileShareProxyUI = this.f191837a;
            int i18 = com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI.f191419m;
            sb6.append(qBFileShareProxyUI.T6());
            com.tencent.mars.xlog.Log.i("MicroMsg.QBFileShareProxyUI", sb6.toString());
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI qBFileShareProxyUI2 = this.f191837a;
                java.lang.String str2 = (java.lang.String) ((jz5.n) qBFileShareProxyUI2.f191420d).getValue();
                ut.s0 s0Var = new ut.s0(str2, qBFileShareProxyUI2.T6());
                if (pt0.f0.f358209b1.a((java.lang.String) ((jz5.n) qBFileShareProxyUI2.f191425i).getValue(), qBFileShareProxyUI2.U6())) {
                    c01.h7 h7Var = new c01.h7();
                    h7Var.f37227b = qBFileShareProxyUI2.U6();
                    h7Var.f37229d = (java.lang.String) ((jz5.n) qBFileShareProxyUI2.f191425i).getValue();
                    s0Var.f430723g = h7Var;
                    s0Var.f430721e = "forward_qb_file_msg";
                } else {
                    s0Var.f430721e = "forward_qb_file_path";
                }
                kotlinx.coroutines.flow.j tj6 = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).tj(((ot.i) ((pt.h0) i95.n0.c(pt.h0.class))).Zi(s0Var));
                com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
                boolean z18 = true;
                if (lifecycleScope != null) {
                    v65.i.b(lifecycleScope, null, new com.tencent.mm.pluginsdk.ui.tools.l6(tj6, null), 1, null);
                }
                if (str != null && !r26.n0.N(str)) {
                    z18 = false;
                }
                if (!z18) {
                    ((dk5.s5) tg3.t1.a()).fj(str2, str, c01.e2.C(str2), 0);
                }
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.setAction("MINIQB_OPEN_RET");
                intent.putExtra("op_type", "SEND_TO_FRIENDS");
                intent.putExtra("file_path", this.f191837a.T6());
                intent.putExtra("file_name", (java.lang.String) ((jz5.n) this.f191837a.f191421e).getValue());
                intent.putExtra("file_ext", (java.lang.String) ((jz5.n) this.f191837a.f191423g).getValue());
                intent.putExtra("forward_msgid", this.f191837a.U6());
                intent.putExtra("to_user", (java.lang.String) ((jz5.n) this.f191837a.f191420d).getValue());
                intent.putExtra("send_text", str);
                intent.putExtra("forward_msg_talker", (java.lang.String) ((jz5.n) this.f191837a.f191425i).getValue());
                intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
                this.f191837a.getContext().sendBroadcast(intent, com.tencent.mm.sdk.platformtools.v9.a());
            }
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.pluginsdk.ui.tools.o6(this.f191837a));
        }
    }
}
