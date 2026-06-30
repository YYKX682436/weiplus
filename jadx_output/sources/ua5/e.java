package ua5;

/* loaded from: classes11.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ua5.f f425984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f425985e;

    public e(ua5.f fVar, android.view.View view) {
        this.f425984d = fVar;
        this.f425985e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f425984d.a(this.f425985e);
    }
}
