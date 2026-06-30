package o14;

/* loaded from: classes.dex */
public final class l implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.CancellationSignal f342286d;

    public l(android.os.CancellationSignal cancellationSignal) {
        this.f342286d = cancellationSignal;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f342286d.cancel();
    }
}
