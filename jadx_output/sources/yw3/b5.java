package yw3;

/* loaded from: classes11.dex */
public final class b5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mm6 f466701d;

    public b5(r45.mm6 mm6Var) {
        this.f466701d = mm6Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r45.mm6 mm6Var = this.f466701d;
        if (mm6Var.f380681t != 4) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 57L, 1L, false);
        } else {
            ((wv.e0) ((xv.l0) i95.n0.c(xv.l0.class))).getClass();
            w73.f.k(122);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 122L, 1L, false);
        }
        dialogInterface.dismiss();
        ((un4.e) i95.n0.c(un4.e.class)).getClass();
        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).tj(mm6Var.f380680s);
    }
}
