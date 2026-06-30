package ct1;

/* loaded from: classes11.dex */
public class b implements w11.u {
    public b(ct1.c cVar) {
    }

    @Override // w11.u
    public boolean t(java.util.Queue queue) {
        com.tencent.mars.xlog.Log.i("BaseBypSyncHandler", "RUN... %s", java.lang.Integer.valueOf(queue.size()));
        return false;
    }

    public java.lang.String toString() {
        return "BaseBypSyncHandler";
    }
}
