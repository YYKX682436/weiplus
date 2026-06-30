package wa2;

/* loaded from: classes.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f444131e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f444132f;

    public k(android.widget.ImageView imageView, yz5.a aVar, android.app.Activity activity, android.content.Intent intent) {
        this.f444130d = aVar;
        this.f444131e = activity;
        this.f444132f = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa2.u.f444181d.getClass();
        this.f444130d.invoke();
        this.f444131e.overridePendingTransition(0, 0);
        this.f444132f.removeExtra("key_intent_animating_flag");
    }
}
