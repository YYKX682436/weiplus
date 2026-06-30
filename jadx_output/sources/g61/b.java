package g61;

/* loaded from: classes4.dex */
public class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h61.s f269042a;

    public b(g61.c cVar, h61.s sVar) {
        this.f269042a = sVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("CloseAAEventIListener", "close aa success: %s", (java.lang.Boolean) obj);
        h61.p pVar = this.f269042a.f279167a;
        pVar.getClass();
        gm0.j1.i();
        gm0.j1.n().f273288b.q(1530, pVar);
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.b9_, 0).show();
        return null;
    }
}
