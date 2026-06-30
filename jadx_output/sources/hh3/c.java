package hh3;

/* loaded from: classes4.dex */
public class c implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hh3.d f281462a;

    public c(hh3.d dVar) {
        this.f281462a = dVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "click %s", java.lang.Boolean.valueOf(z17));
        hh3.d dVar = this.f281462a;
        if (!z17) {
            jh3.n.i(dVar.f281466h, 10);
            return;
        }
        java.lang.ref.WeakReference weakReference = dVar.f281465g;
        if (weakReference == null || weakReference.get() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "onDialogClick context == null");
            return;
        }
        android.content.Context context = (android.content.Context) dVar.f281465g.get();
        dVar.f281464f = new fh3.a(dVar.f281470o, dVar.f281471p, dVar.f281472q, 2);
        gm0.j1.d().g(dVar.f281464f);
        dVar.e(context);
        jh3.n.i(dVar.f281466h, 9);
    }
}
