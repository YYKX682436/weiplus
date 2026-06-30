package d95;

/* loaded from: classes12.dex */
public class s extends com.tencent.matrix.lifecycle.g {
    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewDB", "Entered app explicit background");
        d95.q.f227702b = true;
        com.tencent.wcdb.core.Database.setAutoCheckpointMinFrames(d95.q.f227701a.f227709c);
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewDB", "Exited app explicit background");
        d95.q.f227702b = false;
        com.tencent.wcdb.core.Database.setAutoCheckpointMinFrames(d95.q.f227701a.f227708b);
    }
}
