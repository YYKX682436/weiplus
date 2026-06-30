package d95;

/* loaded from: classes12.dex */
public class r extends com.tencent.matrix.lifecycle.g {
    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewDB", "Entered deep background");
        if (d95.q.f227701a.f227710d) {
            com.tencent.wcdb.core.Database.purgeAll();
        }
        com.tencent.wcdb.core.Database.releaseSQLiteMemory((int) d95.q.f227701a.f227707a);
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewDB", "Exited deep background");
    }
}
