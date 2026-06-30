package k61;

/* loaded from: classes9.dex */
public class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f304508a;

    public n(k61.p pVar, km5.b bVar) {
        this.f304508a = bVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.PaylistAAInteractor", "errType: %s, errCode: %s, retCode: %s, retMsg: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b), java.lang.Integer.valueOf(((r45.x) fVar.f70618d).f389611d), ((r45.x) fVar.f70618d).f389612e);
        this.f304508a.resume();
        return null;
    }
}
