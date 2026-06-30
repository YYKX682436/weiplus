package yw3;

/* loaded from: classes11.dex */
public final class a5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI f466690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.mm6 f466691e;

    public a5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI, r45.mm6 mm6Var) {
        this.f466690d = repairerPatchDemoUI;
        this.f466691e = mm6Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        zb0.y yVar = (zb0.y) i95.n0.c(zb0.y.class);
        androidx.appcompat.app.AppCompatActivity context = this.f466690d.getContext();
        r45.mm6 mm6Var = this.f466691e;
        java.lang.String str = mm6Var.f380669e;
        ((yb0.c) yVar).getClass();
        com.tencent.mm.pluginsdk.model.app.n1.d(context, str, null, false);
        if (mm6Var.f380681t != 4) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 50L, 1L, false);
        } else {
            ((wv.e0) ((xv.l0) i95.n0.c(xv.l0.class))).getClass();
            w73.f.k(123);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 123L, 1L, false);
        }
        dialogInterface.dismiss();
    }
}
