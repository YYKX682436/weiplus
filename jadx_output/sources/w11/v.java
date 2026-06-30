package w11;

/* loaded from: classes12.dex */
public final class v extends com.tencent.mm.modelbase.m1 implements w11.u {

    /* renamed from: d, reason: collision with root package name */
    public final r45.jj6 f442153d;

    public v(r45.jj6 syncData) {
        kotlin.jvm.internal.o.g(syncData, "syncData");
        this.f442153d = syncData;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        return -1;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 138;
    }

    public int hashCode() {
        try {
            return this.f442153d.f377888i;
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMKVHandlerProcessor", e17, "NPE?", new java.lang.Object[0]);
            return super.hashCode();
        }
    }

    @Override // w11.u
    public boolean t(java.util.Queue queue) {
        return false;
    }

    public java.lang.String toString() {
        return "MMKVHandlerProcessor[" + this.f442153d.f377888i + ']';
    }
}
