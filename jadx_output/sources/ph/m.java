package ph;

/* loaded from: classes12.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph.t f354269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f354270e;

    public m(ph.t tVar, android.content.Intent intent) {
        this.f354269d = tVar;
        this.f354270e = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f354269d.h(this.f354270e);
    }
}
