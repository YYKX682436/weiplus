package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class s7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.viewitems.s7 f205494a = new com.tencent.mm.ui.chatting.viewitems.s7();

    public final boolean a(java.lang.String tag, android.view.View view, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        jz5.f0 f0Var;
        zy2.d dVar;
        r45.hd2 hd2Var;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        ot0.q v17 = ot0.q.v(msg.U1());
        if (v17 == null || (dVar = (zy2.d) v17.y(zy2.d.class)) == null || (hd2Var = dVar.f477371b) == null) {
            f0Var = null;
        } else {
            java.lang.String string = hd2Var.getString(3);
            if (string == null || string.length() == 0) {
                com.tencent.mars.xlog.Log.e(tag, "onItemClick: error, themeId is " + string);
                return true;
            }
            uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
            android.app.Activity g17 = ui6.g();
            kotlin.jvm.internal.o.f(g17, "getContext(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_SHARE_TYPE", com.tencent.mm.storage.z3.R4(msg.Q0()) ? 2 : 1);
            ((v40.s) nVar).Bi(g17, intent, string);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(tag, "onItemClick: data is null");
        }
        return true;
    }
}
