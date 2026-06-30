package r35;

/* loaded from: classes9.dex */
public class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j f369236d;

    public p0(com.tencent.mm.ui.widget.dialog.j jVar) {
        this.f369236d = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.widget.dialog.j jVar = this.f369236d;
        if (jVar != null) {
            jVar.a(false, null, 0);
        }
    }
}
