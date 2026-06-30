package e04;

/* loaded from: classes15.dex */
public class m0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.r f246023d;

    public m0(e04.p pVar, com.tencent.mm.plugin.scanner.view.r rVar) {
        this.f246023d = rVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.scanner.view.r rVar = this.f246023d;
        if (rVar != null) {
            rVar.a(null);
        }
    }
}
