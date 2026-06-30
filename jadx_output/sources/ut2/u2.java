package ut2;

/* loaded from: classes3.dex */
public final class u2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f431107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f431108e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f431109f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f431110g;

    public u2(cm2.m0 m0Var, ut2.s3 s3Var, gk2.e eVar, com.tencent.mm.plugin.finder.live.plugin.l lVar) {
        this.f431107d = m0Var;
        this.f431108e = s3Var;
        this.f431109f = eVar;
        this.f431110g = lVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        if (i17 == 0) {
            cm2.m0 m0Var = this.f431107d;
            int i18 = m0Var.i();
            gk2.e eVar = this.f431109f;
            ut2.s3 s3Var = this.f431108e;
            if (i18 == 1) {
                int i19 = ut2.s3.f431069l1;
                s3Var.T(m0Var);
                kotlinx.coroutines.y0 y0Var = s3Var.f293120d;
                if (y0Var != null) {
                    kotlinx.coroutines.l.d(y0Var, null, null, new ut2.z0(s3Var, eVar, m0Var, null), 3, null);
                    return;
                }
                return;
            }
            if (i18 == 2) {
                ut2.s3.l(s3Var, m0Var, eVar, this.f431110g);
                return;
            }
            android.content.Context context = s3Var.itemView.getContext();
            r45.ld5 ld5Var = (r45.ld5) m0Var.f43368v.getCustom(73);
            if (ld5Var == null || (str = ld5Var.getString(1)) == null) {
                str = "";
            }
            db5.t7.g(context, str);
        }
    }
}
