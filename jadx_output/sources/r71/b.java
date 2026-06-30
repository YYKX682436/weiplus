package r71;

/* loaded from: classes12.dex */
public class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r71.c f393123d;

    public b(r71.c cVar) {
        this.f393123d = cVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        r71.c cVar = this.f393123d;
        if (cVar.f393128h == null || !cVar.f393126f.isEmpty()) {
            return;
        }
        cVar.f393128h.dismiss();
        java.util.Iterator it = cVar.f393127g.iterator();
        while (it.hasNext()) {
            c01.d9.e().d((com.tencent.mm.modelbase.m1) it.next());
        }
        cVar.f393127g.clear();
    }
}
