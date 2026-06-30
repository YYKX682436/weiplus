package zs4;

/* loaded from: classes9.dex */
public class j implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs4.q f475295d;

    public j(zs4.q qVar) {
        this.f475295d = qVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        zs4.q qVar = this.f475295d;
        qVar.f475315g.dismiss();
        java.lang.ref.WeakReference weakReference = qVar.f475313e;
        if (weakReference != null && weakReference.get() != null) {
            ((com.tencent.mm.ui.MMActivity) qVar.f475313e.get()).finish();
        }
        qVar.b();
    }
}
