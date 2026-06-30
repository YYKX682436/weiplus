package is;

/* loaded from: classes11.dex */
public class b0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f294303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f294304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ js.v0 f294305f;

    public b0(is.i0 i0Var, android.app.Activity activity, android.content.Intent intent, js.v0 v0Var) {
        this.f294303d = activity;
        this.f294304e = intent;
        this.f294305f = v0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        j45.l.x((com.tencent.mm.ui.MMFragmentActivity) this.f294303d, ".plugin.account.bind.ui.BindMContactUI", this.f294304e, 1, new is.a0(this));
    }
}
