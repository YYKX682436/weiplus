package v61;

/* loaded from: classes12.dex */
public class k implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v61.n f433452d;

    public k(v61.n nVar) {
        this.f433452d = nVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.w("MicroMsg.DoInit", "do init canceled");
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        v61.n nVar = this.f433452d;
        d17.d(nVar.f433464g);
        ((w11.k0) nVar.f433464g).getClass();
        gm0.j1.d().q(139, nVar);
    }
}
