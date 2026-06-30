package kn;

/* loaded from: classes11.dex */
public class i implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kn.j f309410d;

    public i(kn.j jVar) {
        this.f309410d = jVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        kn.j jVar = this.f309410d;
        jVar.f309411d.a(false, null, -1);
        jVar.f309411d.b();
    }
}
