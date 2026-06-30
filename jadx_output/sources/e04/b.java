package e04;

/* loaded from: classes15.dex */
public class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.r f245867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e04.f f245868e;

    public b(e04.f fVar, com.tencent.mm.plugin.scanner.view.r rVar) {
        this.f245868e = fVar;
        this.f245867d = rVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.scanner.view.r rVar = this.f245867d;
        if (rVar != null) {
            rVar.a(null);
        }
        rz3.e eVar = this.f245868e.f245909s;
        if (eVar != null) {
            eVar.a(1, null);
        }
    }
}
