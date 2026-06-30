package k14;

/* loaded from: classes15.dex */
public class i implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k14.j f303340d;

    public i(k14.j jVar) {
        this.f303340d = jVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        k14.j jVar = this.f303340d;
        k14.k kVar = jVar.f303342d;
        k14.u uVar = kVar.f303343d;
        if (uVar != null) {
            uVar.a(kVar.f303344e, false, null);
        }
        jVar.f303342d.a();
    }
}
