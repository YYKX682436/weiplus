package m04;

/* loaded from: classes12.dex */
public class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m04.c f322554d;

    public b(m04.c cVar) {
        this.f322554d = cVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f322554d.f322555d.finish();
    }
}
