package om4;

/* loaded from: classes11.dex */
public class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ om4.c f346412d;

    public b(om4.c cVar) {
        this.f346412d = cVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        om4.c cVar = this.f346412d;
        cVar.f346413d.b(false, null);
        cVar.f346413d.c();
    }
}
