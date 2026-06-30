package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class o3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot0.f3 f202054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f202055f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f202056g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202057h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f202058i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f202059m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f202060n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f202061o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f202062p;

    public o3(java.util.List list, ot0.f3 f3Var, android.content.Context context, boolean z17, java.lang.String str, int i17, int i18, int i19, int i27, boolean z18) {
        this.f202053d = list;
        this.f202054e = f3Var;
        this.f202055f = context;
        this.f202056g = z17;
        this.f202057h = str;
        this.f202058i = i17;
        this.f202059m = i18;
        this.f202060n = i19;
        this.f202061o = i27;
        this.f202062p = z18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.util.List list = this.f202053d;
        boolean z17 = true;
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
                if (!com.tencent.mm.ui.chatting.n3.k(f9Var)) {
                    if (!f9Var.g3() && !com.tencent.mm.ui.chatting.n3.C(f9Var) && !com.tencent.mm.ui.chatting.n3.y(f9Var) && !com.tencent.mm.ui.chatting.n3.o(f9Var) && !com.tencent.mm.ui.chatting.n3.B(f9Var) && f9Var.getType() != -1879048186 && !com.tencent.mm.ui.chatting.n3.r(f9Var) && !com.tencent.mm.ui.chatting.n3.m(f9Var) && !com.tencent.mm.ui.chatting.n3.l(f9Var) && !com.tencent.mm.ui.chatting.n3.k(f9Var) && !com.tencent.mm.ui.chatting.n3.j(f9Var) && f9Var.getType() != 977272881 && f9Var.getType() != 318767153 && f9Var.getType() != 788529201 && f9Var.getType() != 1076887601 && f9Var.getType() != 889192497 && f9Var.getType() != -2130706383 && f9Var.getType() != -2113929167 && f9Var.getType() != 922746929) {
                        z17 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingEditModeLogic", "check contain only invalid send to friend msg error, select item empty");
        }
        ot0.f3 f3Var = this.f202054e;
        if (!z17) {
            if (com.tencent.mm.ui.chatting.x3.b(this.f202055f, this.f202053d, this.f202056g, this.f202057h, this.f202058i, this.f202054e, this.f202059m, this.f202060n, this.f202061o, this.f202062p) || f3Var == null || !f3Var.u1()) {
                return;
            }
            a14.g.a().b();
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ChattingEditModeRetransmitMsg", "only contain invalid msg, exit long click mode");
        if (f3Var != null) {
            f3Var.f2(ot0.e3.trans);
            if (f3Var.u1()) {
                a14.g.a().b();
            }
        }
    }
}
