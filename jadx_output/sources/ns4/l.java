package ns4;

/* loaded from: classes8.dex */
public final class l implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.s f339581d;

    public l(ns4.s sVar) {
        this.f339581d = sVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        ns4.s sVar = this.f339581d;
        js4.j jVar = sVar.f339648m;
        if (jVar != null) {
            jVar.a(sVar, java.lang.Boolean.TRUE);
        }
    }
}
