package r35;

/* loaded from: classes9.dex */
public class o0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j f369233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f369234e;

    public o0(com.tencent.mm.ui.widget.dialog.j jVar, android.view.View view) {
        this.f369233d = jVar;
        this.f369234e = view;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.widget.dialog.j jVar = this.f369233d;
        if (jVar != null) {
            android.view.View view = this.f369234e;
            jVar.a(true, r35.j1.a(view), r35.j1.b(view));
        }
    }
}
