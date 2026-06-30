package gm0;

/* loaded from: classes8.dex */
public class o extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gm0.y f273264d;

    public o(gm0.y yVar) {
        this.f273264d = yVar;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        try {
            for (fs.q qVar : ((fs.c) fs.g.f(hm0.w.class)).all()) {
                if (fs.g.d(fs.g.f266086c, qVar)) {
                    ((hm0.w) ((fs.n) qVar.get())).onNetworkChange(i17);
                }
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            synchronized (this.f273264d.f273289c) {
                hashSet.addAll(this.f273264d.f273289c);
            }
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.network.s0) it.next()).onNetworkChange(i17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MMKernel.CoreNetwork", e17, "onNetworkChange caught crash", new java.lang.Object[0]);
        }
    }
}
