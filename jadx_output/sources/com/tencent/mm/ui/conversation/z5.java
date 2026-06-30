package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class z5 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.a6 f208305d;

    public z5(com.tencent.mm.ui.conversation.a6 a6Var) {
        this.f208305d = a6Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).tj(this.f208305d.f207439d.f207478d.f380680s);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 29L, 1L, false);
    }
}
