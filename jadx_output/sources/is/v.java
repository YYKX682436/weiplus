package is;

/* loaded from: classes11.dex */
public class v implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f294372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f294373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ js.v0 f294374f;

    public v(is.i0 i0Var, android.app.Activity activity, android.content.Intent intent, js.v0 v0Var) {
        this.f294372d = activity;
        this.f294373e = intent;
        this.f294374f = v0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        j45.l.x((com.tencent.mm.ui.MMFragmentActivity) this.f294372d, ".plugin.account.bind.ui.BindMContactUI", this.f294373e, 1, new is.u(this));
    }
}
