package in4;

/* loaded from: classes9.dex */
public class o implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in4.p f292985d;

    public o(in4.q qVar, in4.p pVar) {
        this.f292985d = pVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        in4.p pVar = this.f292985d;
        if (pVar != null) {
            pVar.onDismiss();
        }
    }
}
