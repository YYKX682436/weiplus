package r35;

/* loaded from: classes9.dex */
public class q0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k f369242d;

    public q0(com.tencent.mm.ui.widget.dialog.k kVar) {
        this.f369242d = kVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.widget.dialog.k kVar = this.f369242d;
        if (kVar != null) {
            kVar.a(true);
        }
    }
}
