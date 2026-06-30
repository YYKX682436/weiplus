package r35;

/* loaded from: classes9.dex */
public class r0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k f369246d;

    public r0(com.tencent.mm.ui.widget.dialog.k kVar) {
        this.f369246d = kVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.widget.dialog.k kVar = this.f369246d;
        if (kVar != null) {
            kVar.a(false);
        }
    }
}
