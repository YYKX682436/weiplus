package hr3;

/* loaded from: classes9.dex */
public class f7 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f283544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.z9 f283545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f283546f;

    public f7(boolean z17, com.tencent.mm.ui.z9 z9Var, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f283544d = z17;
        this.f283545e = z9Var;
        this.f283546f = u3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int n17 = c01.z1.n();
        boolean z17 = this.f283544d;
        int i17 = z17 ? n17 & (-32769) : n17 | 32768;
        c01.d9.b().p().w(34, java.lang.Integer.valueOf(i17));
        ((e21.z0) c01.d9.b().w()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i17, "", 0, "", 0));
        if (!z17) {
            hr3.h7.c();
        }
        com.tencent.mm.ui.z9 z9Var = this.f283545e;
        if (z9Var != null) {
            z9Var.onNotifyChange(null, null);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f283546f;
        if (u3Var == null) {
            return true;
        }
        u3Var.dismiss();
        return true;
    }
}
