package y14;

/* loaded from: classes5.dex */
public final class i implements y14.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f458912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f458913b;

    public i(com.tencent.mm.ui.widget.dialog.f4 f4Var, android.app.Activity activity) {
        this.f458912a = f4Var;
        this.f458913b = activity;
    }

    public void a() {
        com.tencent.mars.xlog.Log.e("MicroMsg.YuanBaoAvatarUIC", "download image failed");
        ym5.a1.f(new y14.g(this.f458912a, this.f458913b));
    }
}
