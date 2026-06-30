package xe4;

/* loaded from: classes9.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe4.c f453967d;

    public b(xe4.c cVar) {
        this.f453967d = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        xe4.c cVar = this.f453967d;
        qk.o b17 = r01.z.b(cVar.f453970e.d1());
        qk.n6 n6Var = (qk.n6) i95.n0.c(qk.n6.class);
        android.app.Activity activity = (android.app.Activity) cVar.f453969d;
        com.tencent.mm.storage.z3 z3Var = cVar.f453970e;
        ((com.tencent.mm.app.o7) n6Var).getClass();
        com.tencent.mm.ui.tools.n1.a(b17, activity, z3Var, false, 0);
        cVar.a();
        com.tencent.mm.plugin.sport.model.t.b(false);
        com.tencent.mm.plugin.exdevice.model.l3.fj().J0(gm0.j1.b().k());
    }
}
