package ph;

/* loaded from: classes12.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph.t f354278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f354279e;

    public r(ph.t tVar, android.content.Intent intent) {
        this.f354278d = tVar;
        this.f354279e = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f354278d.j(this.f354279e);
    }
}
