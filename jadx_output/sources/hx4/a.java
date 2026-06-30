package hx4;

/* loaded from: classes8.dex */
public final class a implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hx4.p f285662d;

    public a(hx4.p pVar) {
        this.f285662d = pVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f285662d.b(-1, null);
    }
}
