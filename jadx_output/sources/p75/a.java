package p75;

/* loaded from: classes12.dex */
public final class a implements android.os.CancellationSignal.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p75.c f352618a;

    public a(p75.c cVar) {
        this.f352618a = cVar;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        this.f352618a.f352622a.cancel();
    }
}
