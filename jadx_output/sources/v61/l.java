package v61;

/* loaded from: classes12.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f433455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v61.n f433456e;

    public l(v61.n nVar, int i17) {
        this.f433456e = nVar;
        this.f433455d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        v61.n nVar = this.f433456e;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = nVar.f433463f;
        if (u3Var != null) {
            u3Var.setMessage(nVar.f433462e.getString(com.tencent.mm.R.string.f490469vy) + this.f433455d + "%");
        }
    }
}
