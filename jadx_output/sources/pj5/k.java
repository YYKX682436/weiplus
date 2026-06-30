package pj5;

/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final pj5.k f355386a = new pj5.k();

    public final java.lang.String a(android.content.Context context, com.tencent.mm.storage.f9 f9Var) {
        java.lang.String d17 = g95.e0.d(f9Var);
        if (d17 == null) {
            return "";
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(d17);
        java.lang.String str = e17 != null ? e17 : "";
        java.lang.String a17 = ak5.r.f5689f.a(f9Var);
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\s+");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(a17).replaceAll(" ");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        if (com.tencent.mm.storage.z3.R4(f9Var.Q0()) && f9Var.A0() == 0) {
            if (r26.n0.L(replaceAll, d17.concat(":"), 0, false, 6, null) == 0) {
                return r26.i0.w(replaceAll, d17, str, false);
            }
            if (!r26.n0.B(replaceAll, str, false)) {
                return str + ": " + replaceAll;
            }
        }
        return replaceAll;
    }

    public final z01.c0 b(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return z01.c0.f468972e;
        }
        java.lang.String Q0 = f9Var.Q0();
        ((com.tencent.mm.storage.k4) c01.d9.b().q()).q(Q0);
        return (!com.tencent.mm.storage.z3.i4(Q0) || com.tencent.mm.storage.z3.R4(Q0)) ? (com.tencent.mm.storage.z3.i4(Q0) && com.tencent.mm.storage.z3.R4(Q0)) ? z01.c0.f468974g : (com.tencent.mm.storage.z3.y4(Q0) || com.tencent.mm.storage.z3.R3(Q0)) ? z01.c0.f468975h : z01.c0.f468972e : z01.c0.f468973f;
    }

    public final void c(android.content.Context context, com.tencent.mm.storage.f9 f9Var) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String Q0 = f9Var != null ? f9Var.Q0() : null;
        long msgId = f9Var != null ? f9Var.getMsgId() : -1L;
        if (!com.tencent.mm.storage.z3.R4(Q0)) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(Q0, true);
            if (n17 == null || !n17.r2()) {
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.d(com.tencent.mm.R.string.p6u);
                e4Var.c();
                return;
            }
        } else if (((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(Q0) == null) {
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var2.d(com.tencent.mm.R.string.p6u);
            e4Var2.c();
            return;
        }
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", Q0).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("need_hight_item", true).putExtra("msg_local_id", msgId);
        kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
        putExtra.setClass(context, com.tencent.mm.ui.chatting.ChattingUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/schedulemsg/ScheduleMsgHelper", "jumpScheduleMsg", "(Landroid/content/Context;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/schedulemsg/ScheduleMsgHelper", "jumpScheduleMsg", "(Landroid/content/Context;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void d(android.content.Context context, com.tencent.mm.storage.f9 f9Var, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        e(context, f9Var, i17, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(android.content.Context context, com.tencent.mm.storage.f9 f9Var, int i17, java.lang.String str, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        if (f9Var == null) {
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.p6z);
            e4Var.c();
            return;
        }
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar != null) {
            androidx.lifecycle.q a17 = androidx.lifecycle.z.a(yVar);
            com.tencent.mm.ui.chatting.view.c1 c1Var = new com.tencent.mm.ui.chatting.view.c1(context, a(context, f9Var), f9Var.Q0());
            c1Var.f202896l = new pj5.j(context, c1Var, f9Var, a17, i17, str, lVar);
            com.tencent.mm.ui.widget.dialog.z2 z2Var = c1Var.f202894j;
            if (z2Var != null) {
                z2Var.C();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Remind.MMRemindDatePickerRemake", "show");
            pm0.v.K(null, new com.tencent.mm.ui.chatting.view.b1(c1Var));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(795L, 0L, 1L, false);
        }
    }
}
