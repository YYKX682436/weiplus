package xw;

/* loaded from: classes11.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f457525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.p0 f457526e;

    public i(xw.j jVar, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        this.f457525d = map;
        this.f457526e = p0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.du5 du5Var;
        java.util.Map map;
        eq1.z zVar = eq1.z.f255876a;
        com.tencent.mm.modelbase.p0 p0Var = this.f457526e;
        if ((p0Var != null ? p0Var.f70726a : null) == null || (du5Var = p0Var.f70726a.f377561h) == null || (map = this.f457525d) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizPayAlbumLogic", "onBizPayAlbumNotify data invalid");
        } else {
            zVar.b(map, x51.j1.g(du5Var));
        }
    }
}
