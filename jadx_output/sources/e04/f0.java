package e04;

/* loaded from: classes15.dex */
public class f0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bi4.t0 f245915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e04.p f245916e;

    public f0(e04.p pVar, bi4.t0 t0Var) {
        this.f245916e = pVar;
        this.f245915d = t0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f245915d.cancel();
        rz3.e eVar = this.f245916e.f246059w;
        if (eVar != null) {
            eVar.a(1, null);
        }
    }
}
