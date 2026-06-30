package g61;

/* loaded from: classes4.dex */
public class a implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h61.s f269039a;

    public a(g61.c cVar, h61.s sVar) {
        this.f269039a = sVar;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, obj.toString(), 0).show();
        } else {
            com.tencent.mars.xlog.Log.e("CloseAAEventIListener", "close aa failed: %s", obj);
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.b9b, 1).show();
        }
        h61.p pVar = this.f269039a.f279167a;
        pVar.getClass();
        gm0.j1.i();
        gm0.j1.n().f273288b.q(1530, pVar);
    }
}
