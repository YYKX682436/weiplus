package za3;

/* loaded from: classes12.dex */
public class z0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f471054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ za3.b1 f471055e;

    public z0(za3.b1 b1Var, int i17) {
        this.f471055e = b1Var;
        this.f471054d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        za3.a1 a1Var = this.f471055e.f470893b;
        if (a1Var != null) {
            com.tencent.mm.plugin.location.ui.impl.p0 p0Var = (com.tencent.mm.plugin.location.ui.impl.p0) a1Var;
            p0Var.getClass();
            int i18 = this.f471054d;
            if (i18 == 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10997, "8", "", 0, 0);
                p0Var.K();
            } else if (i18 == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10997, "8", "", 0, 0);
                p0Var.K();
            } else if (i18 == 2) {
                p0Var.K();
            }
        }
    }
}
