package hr3;

/* loaded from: classes9.dex */
public class l7 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f283747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f283748e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.z9 f283749f;

    public l7(android.app.ProgressDialog progressDialog, boolean z17, com.tencent.mm.ui.z9 z9Var) {
        this.f283747d = progressDialog;
        this.f283748e = z17;
        this.f283749f = z9Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17;
        android.app.ProgressDialog progressDialog = this.f283747d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        int n17 = c01.z1.n();
        boolean z17 = this.f283748e;
        if (z17) {
            i17 = n17 & (-16777217);
        } else {
            i17 = n17 | com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62;
            c01.d9.b().p().w(286722, "");
            c01.d9.b().p().w(286721, "");
            c01.d9.b().p().w(286723, "");
        }
        c01.d9.b().p().w(34, java.lang.Integer.valueOf(i17));
        r45.u85 u85Var = new r45.u85();
        u85Var.f387136d = com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62;
        u85Var.f387137e = !z17 ? 1 : 0;
        ((e21.z0) c01.d9.b().w()).c(new xg3.p0(39, u85Var));
        com.tencent.mm.ui.z9 z9Var = this.f283749f;
        if (z9Var == null) {
            return false;
        }
        z9Var.onNotifyChange(null, null);
        return false;
    }
}
