package lx;

/* loaded from: classes11.dex */
public final class m implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx.u f321859d;

    public m(lx.u uVar) {
        this.f321859d = uVar;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (w0Var == null || w0Var.f316976d == null) {
            return;
        }
        this.f321859d.e("followedContact:" + str);
    }
}
