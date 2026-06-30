package z72;

/* loaded from: classes12.dex */
public class g implements com.tencent.wcdb.core.Transaction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f470563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o72.j4 f470564b;

    public g(z72.f fVar, boolean[] zArr, o72.j4 j4Var) {
        this.f470563a = zArr;
        this.f470564b = j4Var;
    }

    @Override // com.tencent.wcdb.core.Transaction
    public boolean insideTransaction(com.tencent.wcdb.core.Handle handle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "begin runTransaction thread id:" + java.lang.Thread.currentThread().getId());
        boolean a17 = ((s72.s) this.f470564b).a();
        boolean[] zArr = this.f470563a;
        zArr[0] = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavItemInfoNewStorage", "runTransaction end with ret:" + zArr[0] + " thread id:" + java.lang.Thread.currentThread().getId());
        return zArr[0];
    }
}
