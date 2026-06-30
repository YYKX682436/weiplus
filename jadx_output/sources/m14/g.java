package m14;

/* loaded from: classes11.dex */
public class g implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m14.j f322874d;

    public g(m14.j jVar) {
        this.f322874d = jVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        m14.f fVar = this.f322874d.f322878d;
        fVar.f322871c = true;
        fVar.f322872d.cancel();
    }
}
