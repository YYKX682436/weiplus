package yw3;

/* loaded from: classes11.dex */
public final class e5 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mm6 f466733d;

    public e5(r45.mm6 mm6Var) {
        this.f466733d = mm6Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).tj(this.f466733d.f380680s);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 29L, 1L, false);
    }
}
